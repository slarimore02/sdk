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
 * DnsZone
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class DnsZone {
  @JsonProperty("admin_email")
  private String adminEmail = null;

  @JsonProperty("domain_name")
  private String domainName = null;

  @JsonProperty("name_server")
  private String nameServer = null;

  public DnsZone adminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
    return this;
  }

   /**
   * Email address of the administrator responsible for this zone. This field is used in SOA records as rname (RFC 1035). If not configured, it is inherited from the DNS service profile. Field introduced in 18.2.6.
   * @return adminEmail
  **/
  @Schema(description = "Email address of the administrator responsible for this zone. This field is used in SOA records as rname (RFC 1035). If not configured, it is inherited from the DNS service profile. Field introduced in 18.2.6.")
  public String getAdminEmail() {
    return adminEmail;
  }

  public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }

  public DnsZone domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Domain name authoritatively serviced by this Virtual Service. Queries for FQDNs that are sub domains of this domain and do not have any DNS record in Avi are dropped or NXDomain response sent. For domains which are present, SOA parameters are sent in answer section of response if query type is SOA. Field introduced in 18.2.6.
   * @return domainName
  **/
  @Schema(required = true, description = "Domain name authoritatively serviced by this Virtual Service. Queries for FQDNs that are sub domains of this domain and do not have any DNS record in Avi are dropped or NXDomain response sent. For domains which are present, SOA parameters are sent in answer section of response if query type is SOA. Field introduced in 18.2.6.")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public DnsZone nameServer(String nameServer) {
    this.nameServer = nameServer;
    return this;
  }

   /**
   * The primary name server for this zone. This field is used in SOA records as mname (RFC 1035). If not configured, it is inherited from the DNS service profile. If even that is not configured, the domain name is used instead. Field introduced in 18.2.6.
   * @return nameServer
  **/
  @Schema(description = "The primary name server for this zone. This field is used in SOA records as mname (RFC 1035). If not configured, it is inherited from the DNS service profile. If even that is not configured, the domain name is used instead. Field introduced in 18.2.6.")
  public String getNameServer() {
    return nameServer;
  }

  public void setNameServer(String nameServer) {
    this.nameServer = nameServer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsZone dnsZone = (DnsZone) o;
    return Objects.equals(this.adminEmail, dnsZone.adminEmail) &&
        Objects.equals(this.domainName, dnsZone.domainName) &&
        Objects.equals(this.nameServer, dnsZone.nameServer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminEmail, domainName, nameServer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsZone {\n");
    
    sb.append("    adminEmail: ").append(toIndentedString(adminEmail)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    nameServer: ").append(toIndentedString(nameServer)).append("\n");
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