/*
 * Avi avi_global_spec Object API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 20.1.1
 * Contact: support@avinetworks.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.avi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vmware.avi.sdk.model.DNSConfig;
import com.vmware.avi.sdk.model.GslbClientIpAddrGroup;
import com.vmware.avi.sdk.model.GslbSite;
import com.vmware.avi.sdk.model.GslbThirdPartySite;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Gslb
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class Gslb {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("async_interval")
  private Integer asyncInterval = null;

  @JsonProperty("clear_on_max_retries")
  private Integer clearOnMaxRetries = 20;

  @JsonProperty("client_ip_addr_group")
  private GslbClientIpAddrGroup clientIpAddrGroup = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dns_configs")
  private List<DNSConfig> dnsConfigs = null;

  @JsonProperty("error_resync_interval")
  private Integer errorResyncInterval = 300;

  @JsonProperty("is_federated")
  private Boolean isFederated = true;

  @JsonProperty("leader_cluster_uuid")
  private String leaderClusterUuid = null;

  @JsonProperty("maintenance_mode")
  private Boolean maintenanceMode = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("send_interval")
  private Integer sendInterval = 15;

  @JsonProperty("send_interval_prior_to_maintenance_mode")
  private Integer sendIntervalPriorToMaintenanceMode = null;

  @JsonProperty("sites")
  private List<GslbSite> sites = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("third_party_sites")
  private List<GslbThirdPartySite> thirdPartySites = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("view_id")
  private Long viewId = null;

   /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return _lastModified
  **/
  @Schema(description = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")
  public String getLastModified() {
    return _lastModified;
  }

  public Gslb asyncInterval(Integer asyncInterval) {
    this.asyncInterval = asyncInterval;
    return this;
  }

   /**
   * Frequency with which messages are propagated to Vs Mgr. Value of 0 disables async behavior and RPC are sent inline. Allowed values are 0-5. Field introduced in 18.2.3.
   * @return asyncInterval
  **/
  @Schema(description = "Frequency with which messages are propagated to Vs Mgr. Value of 0 disables async behavior and RPC are sent inline. Allowed values are 0-5. Field introduced in 18.2.3.")
  public Integer getAsyncInterval() {
    return asyncInterval;
  }

  public void setAsyncInterval(Integer asyncInterval) {
    this.asyncInterval = asyncInterval;
  }

  public Gslb clearOnMaxRetries(Integer clearOnMaxRetries) {
    this.clearOnMaxRetries = clearOnMaxRetries;
    return this;
  }

   /**
   * Max retries after which the remote site is treated as a fresh start. In fresh start all the configs are downloaded. Allowed values are 1-1024.
   * @return clearOnMaxRetries
  **/
  @Schema(description = "Max retries after which the remote site is treated as a fresh start. In fresh start all the configs are downloaded. Allowed values are 1-1024.")
  public Integer getClearOnMaxRetries() {
    return clearOnMaxRetries;
  }

  public void setClearOnMaxRetries(Integer clearOnMaxRetries) {
    this.clearOnMaxRetries = clearOnMaxRetries;
  }

  public Gslb clientIpAddrGroup(GslbClientIpAddrGroup clientIpAddrGroup) {
    this.clientIpAddrGroup = clientIpAddrGroup;
    return this;
  }

   /**
   * Get clientIpAddrGroup
   * @return clientIpAddrGroup
  **/
  @Schema(description = "")
  public GslbClientIpAddrGroup getClientIpAddrGroup() {
    return clientIpAddrGroup;
  }

  public void setClientIpAddrGroup(GslbClientIpAddrGroup clientIpAddrGroup) {
    this.clientIpAddrGroup = clientIpAddrGroup;
  }

  public Gslb description(String description) {
    this.description = description;
    return this;
  }

   /**
   * User defined description for the object.
   * @return description
  **/
  @Schema(description = "User defined description for the object.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Gslb dnsConfigs(List<DNSConfig> dnsConfigs) {
    this.dnsConfigs = dnsConfigs;
    return this;
  }

  public Gslb addDnsConfigsItem(DNSConfig dnsConfigsItem) {
    if (this.dnsConfigs == null) {
      this.dnsConfigs = new ArrayList<DNSConfig>();
    }
    this.dnsConfigs.add(dnsConfigsItem);
    return this;
  }

   /**
   * Sub domain configuration for the GSLB.  GSLB service&#x27;s FQDN must be a match one of these subdomains. .
   * @return dnsConfigs
  **/
  @Schema(description = "Sub domain configuration for the GSLB.  GSLB service's FQDN must be a match one of these subdomains. .")
  public List<DNSConfig> getDnsConfigs() {
    return dnsConfigs;
  }

  public void setDnsConfigs(List<DNSConfig> dnsConfigs) {
    this.dnsConfigs = dnsConfigs;
  }

  public Gslb errorResyncInterval(Integer errorResyncInterval) {
    this.errorResyncInterval = errorResyncInterval;
    return this;
  }

   /**
   * Frequency with which errored messages are resynced to follower sites. Value of 0 disables resync behavior. Allowed values are 60-3600. Special values are 0 - &#x27;Disable&#x27;. Field introduced in 18.2.3.
   * @return errorResyncInterval
  **/
  @Schema(description = "Frequency with which errored messages are resynced to follower sites. Value of 0 disables resync behavior. Allowed values are 60-3600. Special values are 0 - 'Disable'. Field introduced in 18.2.3.")
  public Integer getErrorResyncInterval() {
    return errorResyncInterval;
  }

  public void setErrorResyncInterval(Integer errorResyncInterval) {
    this.errorResyncInterval = errorResyncInterval;
  }

  public Gslb isFederated(Boolean isFederated) {
    this.isFederated = isFederated;
    return this;
  }

   /**
   * This field indicates that this object is replicated across GSLB federation. Field introduced in 17.1.3.
   * @return isFederated
  **/
  @Schema(description = "This field indicates that this object is replicated across GSLB federation. Field introduced in 17.1.3.")
  public Boolean isIsFederated() {
    return isFederated;
  }

  public void setIsFederated(Boolean isFederated) {
    this.isFederated = isFederated;
  }

  public Gslb leaderClusterUuid(String leaderClusterUuid) {
    this.leaderClusterUuid = leaderClusterUuid;
    return this;
  }

   /**
   * Mark this Site as leader of GSLB configuration. This site is the one among the Avi sites.
   * @return leaderClusterUuid
  **/
  @Schema(required = true, description = "Mark this Site as leader of GSLB configuration. This site is the one among the Avi sites.")
  public String getLeaderClusterUuid() {
    return leaderClusterUuid;
  }

  public void setLeaderClusterUuid(String leaderClusterUuid) {
    this.leaderClusterUuid = leaderClusterUuid;
  }

  public Gslb maintenanceMode(Boolean maintenanceMode) {
    this.maintenanceMode = maintenanceMode;
    return this;
  }

   /**
   * This field disables the configuration operations on the leader for all federated objects.  CUD operations on Gslb, GslbService, GslbGeoDbProfile and other federated objects will be rejected. The rest-api disabling helps in upgrade scenarios where we don&#x27;t want configuration sync operations to the Gslb member when the member is being upgraded.  This configuration programmatically blocks the leader from accepting new Gslb configuration when member sites are undergoing upgrade. . Field introduced in 17.2.1.
   * @return maintenanceMode
  **/
  @Schema(description = "This field disables the configuration operations on the leader for all federated objects.  CUD operations on Gslb, GslbService, GslbGeoDbProfile and other federated objects will be rejected. The rest-api disabling helps in upgrade scenarios where we don't want configuration sync operations to the Gslb member when the member is being upgraded.  This configuration programmatically blocks the leader from accepting new Gslb configuration when member sites are undergoing upgrade. . Field introduced in 17.2.1.")
  public Boolean isMaintenanceMode() {
    return maintenanceMode;
  }

  public void setMaintenanceMode(Boolean maintenanceMode) {
    this.maintenanceMode = maintenanceMode;
  }

  public Gslb name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name for the GSLB object.
   * @return name
  **/
  @Schema(required = true, description = "Name for the GSLB object.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Gslb sendInterval(Integer sendInterval) {
    this.sendInterval = sendInterval;
    return this;
  }

   /**
   * Frequency with which group members communicate. Allowed values are 1-3600.
   * @return sendInterval
  **/
  @Schema(description = "Frequency with which group members communicate. Allowed values are 1-3600.")
  public Integer getSendInterval() {
    return sendInterval;
  }

  public void setSendInterval(Integer sendInterval) {
    this.sendInterval = sendInterval;
  }

  public Gslb sendIntervalPriorToMaintenanceMode(Integer sendIntervalPriorToMaintenanceMode) {
    this.sendIntervalPriorToMaintenanceMode = sendIntervalPriorToMaintenanceMode;
    return this;
  }

   /**
   * The user can specify a send-interval while entering maintenance mode. The validity of this &#x27;maintenance send-interval&#x27; is only during maintenance mode. When the user leaves maintenance mode, the original send-interval is reinstated. This internal variable is used to store the original send-interval. . Field introduced in 18.2.3.
   * @return sendIntervalPriorToMaintenanceMode
  **/
  @Schema(description = "The user can specify a send-interval while entering maintenance mode. The validity of this 'maintenance send-interval' is only during maintenance mode. When the user leaves maintenance mode, the original send-interval is reinstated. This internal variable is used to store the original send-interval. . Field introduced in 18.2.3.")
  public Integer getSendIntervalPriorToMaintenanceMode() {
    return sendIntervalPriorToMaintenanceMode;
  }

  public void setSendIntervalPriorToMaintenanceMode(Integer sendIntervalPriorToMaintenanceMode) {
    this.sendIntervalPriorToMaintenanceMode = sendIntervalPriorToMaintenanceMode;
  }

  public Gslb sites(List<GslbSite> sites) {
    this.sites = sites;
    return this;
  }

  public Gslb addSitesItem(GslbSite sitesItem) {
    if (this.sites == null) {
      this.sites = new ArrayList<GslbSite>();
    }
    this.sites.add(sitesItem);
    return this;
  }

   /**
   * Select Avi site member belonging to this Gslb.
   * @return sites
  **/
  @Schema(description = "Select Avi site member belonging to this Gslb.")
  public List<GslbSite> getSites() {
    return sites;
  }

  public void setSites(List<GslbSite> sites) {
    this.sites = sites;
  }

  public Gslb tenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @Schema(description = " It is a reference to an object of type Tenant.")
  public String getTenantRef() {
    return tenantRef;
  }

  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  public Gslb thirdPartySites(List<GslbThirdPartySite> thirdPartySites) {
    this.thirdPartySites = thirdPartySites;
    return this;
  }

  public Gslb addThirdPartySitesItem(GslbThirdPartySite thirdPartySitesItem) {
    if (this.thirdPartySites == null) {
      this.thirdPartySites = new ArrayList<GslbThirdPartySite>();
    }
    this.thirdPartySites.add(thirdPartySitesItem);
    return this;
  }

   /**
   * Third party site member belonging to this Gslb. Field introduced in 17.1.1.
   * @return thirdPartySites
  **/
  @Schema(description = "Third party site member belonging to this Gslb. Field introduced in 17.1.1.")
  public List<GslbThirdPartySite> getThirdPartySites() {
    return thirdPartySites;
  }

  public void setThirdPartySites(List<GslbThirdPartySite> thirdPartySites) {
    this.thirdPartySites = thirdPartySites;
  }

   /**
   * url
   * @return url
  **/
  @Schema(description = "url")
  public String getUrl() {
    return url;
  }

  public Gslb uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of the GSLB object.
   * @return uuid
  **/
  @Schema(description = "UUID of the GSLB object.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Gslb viewId(Long viewId) {
    this.viewId = viewId;
    return this;
  }

   /**
   * The view-id is used in change-leader mode to differentiate partitioned groups while they have the same GSLB namespace. Each partitioned group will be able to operate independently by using the view-id.
   * @return viewId
  **/
  @Schema(description = "The view-id is used in change-leader mode to differentiate partitioned groups while they have the same GSLB namespace. Each partitioned group will be able to operate independently by using the view-id.")
  public Long getViewId() {
    return viewId;
  }

  public void setViewId(Long viewId) {
    this.viewId = viewId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gslb gslb = (Gslb) o;
    return Objects.equals(this._lastModified, gslb._lastModified) &&
        Objects.equals(this.asyncInterval, gslb.asyncInterval) &&
        Objects.equals(this.clearOnMaxRetries, gslb.clearOnMaxRetries) &&
        Objects.equals(this.clientIpAddrGroup, gslb.clientIpAddrGroup) &&
        Objects.equals(this.description, gslb.description) &&
        Objects.equals(this.dnsConfigs, gslb.dnsConfigs) &&
        Objects.equals(this.errorResyncInterval, gslb.errorResyncInterval) &&
        Objects.equals(this.isFederated, gslb.isFederated) &&
        Objects.equals(this.leaderClusterUuid, gslb.leaderClusterUuid) &&
        Objects.equals(this.maintenanceMode, gslb.maintenanceMode) &&
        Objects.equals(this.name, gslb.name) &&
        Objects.equals(this.sendInterval, gslb.sendInterval) &&
        Objects.equals(this.sendIntervalPriorToMaintenanceMode, gslb.sendIntervalPriorToMaintenanceMode) &&
        Objects.equals(this.sites, gslb.sites) &&
        Objects.equals(this.tenantRef, gslb.tenantRef) &&
        Objects.equals(this.thirdPartySites, gslb.thirdPartySites) &&
        Objects.equals(this.url, gslb.url) &&
        Objects.equals(this.uuid, gslb.uuid) &&
        Objects.equals(this.viewId, gslb.viewId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, asyncInterval, clearOnMaxRetries, clientIpAddrGroup, description, dnsConfigs, errorResyncInterval, isFederated, leaderClusterUuid, maintenanceMode, name, sendInterval, sendIntervalPriorToMaintenanceMode, sites, tenantRef, thirdPartySites, url, uuid, viewId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gslb {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    asyncInterval: ").append(toIndentedString(asyncInterval)).append("\n");
    sb.append("    clearOnMaxRetries: ").append(toIndentedString(clearOnMaxRetries)).append("\n");
    sb.append("    clientIpAddrGroup: ").append(toIndentedString(clientIpAddrGroup)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dnsConfigs: ").append(toIndentedString(dnsConfigs)).append("\n");
    sb.append("    errorResyncInterval: ").append(toIndentedString(errorResyncInterval)).append("\n");
    sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
    sb.append("    leaderClusterUuid: ").append(toIndentedString(leaderClusterUuid)).append("\n");
    sb.append("    maintenanceMode: ").append(toIndentedString(maintenanceMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sendInterval: ").append(toIndentedString(sendInterval)).append("\n");
    sb.append("    sendIntervalPriorToMaintenanceMode: ").append(toIndentedString(sendIntervalPriorToMaintenanceMode)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    thirdPartySites: ").append(toIndentedString(thirdPartySites)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}