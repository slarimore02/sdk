package clients

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"../session"
	// Change this to objects when we move to use objects rather than
	// models
	"../models"
	"container/vector"
	"strings"
	"fmt"
)

const (
	OBJ_TYPE = "Pool"
)

// AviPool is a client for avi pool
type PoolClient struct {
	AviSession *avi_session
}

func (client *PoolClient) GetApiPath(uuid string) string {
	path = "api/" + strings.ToLower(OBJ_TYPE)
	if uuid {
		path += "/" + uuid
	}
	return path
}

// Collection API to get list of Pools
func (client *PoolClient) GetAll() ([]*models.Pool, session.AviError) {
	res, err := client.avi_session.Get(client.GetApiPath(""))
	if err != nil {
		return nil, err
	}
	return res["results"], err
}

// Get Pool by uuid
func (client *PoolClient) Get(uuid string) (*models.Pool, session.AviError)  {
	return client.avi_session.Get(client.GetApiPath(uuid))
}

// Get Pool by name
func (client *PoolClient) GetByName(name string) (*models.Pool, session.AviError) {
	path = client.GetApiPath("") + "?name=" + name
	res, err := client.avi_session.Get(client.GetApiPath(""))
	if err != nil {
		return nil, err
	}
	if res["count"] >= 0 {
		return res["results"][0], nil
	}
	return nil, session.AviError{httpStatusCode: 404}
}

// Get Pool by uuid
func (client *PoolClient) Create(obj *models.Pool) (*models.Pool, session.AviError) {
	return client.avi_session.Post(client.GetApiPath(""), obj)
}

// Modify Pool and updates the pool object passed down
func (client *PoolClient) Update(obj *models.Pool) (*models.Pool, session.AviError) {
	return client.avi_session.Put(client.GetApiPath(obj["uuid"]), obj)
}

// Modify Pool and updates the pool object passed down
func (client *PoolClient) Delete(uuid string) (session.AviError) {
	return client.avi_session.Delete(client.GetApiPath(uuid))
}

// Delete Pool object by name
func (client *PoolClient) DeleteByName(name string) (session.AviError) {
	res, err = client.GetByName(name)
	if err != nil {
		return err
	}
	return client.Delete(res["uuid"])
}

