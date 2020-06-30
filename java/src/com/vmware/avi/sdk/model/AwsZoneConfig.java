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
 * AwsZoneConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class AwsZoneConfig {
  @JsonProperty("availability_zone")
  private String availabilityZone = null;

  @JsonProperty("mgmt_network_name")
  private String mgmtNetworkName = null;

  @JsonProperty("mgmt_network_uuid")
  private String mgmtNetworkUuid = null;

  public AwsZoneConfig availabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * Availability zone.
   * @return availabilityZone
  **/
  @Schema(required = true, description = "Availability zone.")
  public String getAvailabilityZone() {
    return availabilityZone;
  }

  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }

  public AwsZoneConfig mgmtNetworkName(String mgmtNetworkName) {
    this.mgmtNetworkName = mgmtNetworkName;
    return this;
  }

   /**
   * Name or CIDR of the network in the Availability Zone that will be used as management network.
   * @return mgmtNetworkName
  **/
  @Schema(required = true, description = "Name or CIDR of the network in the Availability Zone that will be used as management network.")
  public String getMgmtNetworkName() {
    return mgmtNetworkName;
  }

  public void setMgmtNetworkName(String mgmtNetworkName) {
    this.mgmtNetworkName = mgmtNetworkName;
  }

  public AwsZoneConfig mgmtNetworkUuid(String mgmtNetworkUuid) {
    this.mgmtNetworkUuid = mgmtNetworkUuid;
    return this;
  }

   /**
   * UUID of the network in the Availability Zone that will be used as management network.
   * @return mgmtNetworkUuid
  **/
  @Schema(description = "UUID of the network in the Availability Zone that will be used as management network.")
  public String getMgmtNetworkUuid() {
    return mgmtNetworkUuid;
  }

  public void setMgmtNetworkUuid(String mgmtNetworkUuid) {
    this.mgmtNetworkUuid = mgmtNetworkUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsZoneConfig awsZoneConfig = (AwsZoneConfig) o;
    return Objects.equals(this.availabilityZone, awsZoneConfig.availabilityZone) &&
        Objects.equals(this.mgmtNetworkName, awsZoneConfig.mgmtNetworkName) &&
        Objects.equals(this.mgmtNetworkUuid, awsZoneConfig.mgmtNetworkUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZone, mgmtNetworkName, mgmtNetworkUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsZoneConfig {\n");
    
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    mgmtNetworkName: ").append(toIndentedString(mgmtNetworkName)).append("\n");
    sb.append("    mgmtNetworkUuid: ").append(toIndentedString(mgmtNetworkUuid)).append("\n");
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