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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * GslbHealthMonitorProxy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class GslbHealthMonitorProxy {
  @JsonProperty("proxy_type")
  private String proxyType = "GSLB_HEALTH_MONITOR_PROXY_PRIVATE_MEMBERS";

  @JsonProperty("site_uuid")
  private String siteUuid = null;

  public GslbHealthMonitorProxy proxyType(String proxyType) {
    this.proxyType = proxyType;
    return this;
  }

   /**
   * This field identifies the health monitor proxy behavior. The designated site for health monitor proxy can monitor public or private or all the members of a given site. . Enum options - GSLB_HEALTH_MONITOR_PROXY_ALL_MEMBERS, GSLB_HEALTH_MONITOR_PROXY_PRIVATE_MEMBERS. Field introduced in 17.1.1.
   * @return proxyType
  **/
  @Schema(description = "This field identifies the health monitor proxy behavior. The designated site for health monitor proxy can monitor public or private or all the members of a given site. . Enum options - GSLB_HEALTH_MONITOR_PROXY_ALL_MEMBERS, GSLB_HEALTH_MONITOR_PROXY_PRIVATE_MEMBERS. Field introduced in 17.1.1.")
  public String getProxyType() {
    return proxyType;
  }

  public void setProxyType(String proxyType) {
    this.proxyType = proxyType;
  }

  public GslbHealthMonitorProxy siteUuid(String siteUuid) {
    this.siteUuid = siteUuid;
    return this;
  }

   /**
   * This field identifies the site that will health monitor on behalf of the current site. i.e. it will be a health monitor proxy and monitor members of the current site. . Field introduced in 17.1.1.
   * @return siteUuid
  **/
  @Schema(description = "This field identifies the site that will health monitor on behalf of the current site. i.e. it will be a health monitor proxy and monitor members of the current site. . Field introduced in 17.1.1.")
  public String getSiteUuid() {
    return siteUuid;
  }

  public void setSiteUuid(String siteUuid) {
    this.siteUuid = siteUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GslbHealthMonitorProxy gslbHealthMonitorProxy = (GslbHealthMonitorProxy) o;
    return Objects.equals(this.proxyType, gslbHealthMonitorProxy.proxyType) &&
        Objects.equals(this.siteUuid, gslbHealthMonitorProxy.siteUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyType, siteUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GslbHealthMonitorProxy {\n");
    
    sb.append("    proxyType: ").append(toIndentedString(proxyType)).append("\n");
    sb.append("    siteUuid: ").append(toIndentedString(siteUuid)).append("\n");
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