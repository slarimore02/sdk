import subprocess
from StringIO import StringIO
from shlex import shlex
from string import Template
import pytest
import json
import logging

playbook_file = pytest.config.getoption("--config")
ansible_temp =Template('ansible-playbook ${playbook} ')

logging.basicConfig(filename='ansible-test.log', level=logging.INFO)
LOG = logging.getLogger(__name__)

def test_ansible_configuration(change= 3):

    cmd = ansible_temp.substitute(playbook = playbook_file)
    res = subprocess.check_output(cmd, shell= True)
    sout = StringIO(res)
    lines = sout.readlines()
    for index, line in enumerate(lines):
        if not line.startswith('PLAY RECAP'):
            continue
        results = lines[index + 1]
        ch = [term.split('=')[1] for term in results.split()
              if term.startswith('changed')][0]

        err = [term.split('=')[1] for term in results.split()
              if term.startswith('failed')][0]
        if int(err) > 1:
            LOG.error("Ansible module is faild to create configuration from %s" %(playbook_file))
        assert int(ch) == int(change)
        LOG.info("Playbook %s uploaded successfully.." %(playbook_file))