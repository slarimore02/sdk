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
import com.vmware.avi.sdk.model.DnsRateProfile;
import com.vmware.avi.sdk.model.DnsRuleActionAllowDrop;
import com.vmware.avi.sdk.model.DnsRuleActionGslbSiteSelection;
import com.vmware.avi.sdk.model.DnsRuleActionPoolSwitching;
import com.vmware.avi.sdk.model.DnsRuleActionResponse;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * DnsRuleAction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class DnsRuleAction {
  @JsonProperty("allow")
  private DnsRuleActionAllowDrop allow = null;

  @JsonProperty("dns_rate_limit")
  private DnsRateProfile dnsRateLimit = null;

  @JsonProperty("gslb_site_selection")
  private DnsRuleActionGslbSiteSelection gslbSiteSelection = null;

  @JsonProperty("pool_switching")
  private DnsRuleActionPoolSwitching poolSwitching = null;

  @JsonProperty("response")
  private DnsRuleActionResponse response = null;

  public DnsRuleAction allow(DnsRuleActionAllowDrop allow) {
    this.allow = allow;
    return this;
  }

   /**
   * Get allow
   * @return allow
  **/
  @Schema(description = "")
  public DnsRuleActionAllowDrop getAllow() {
    return allow;
  }

  public void setAllow(DnsRuleActionAllowDrop allow) {
    this.allow = allow;
  }

  public DnsRuleAction dnsRateLimit(DnsRateProfile dnsRateLimit) {
    this.dnsRateLimit = dnsRateLimit;
    return this;
  }

   /**
   * Get dnsRateLimit
   * @return dnsRateLimit
  **/
  @Schema(description = "")
  public DnsRateProfile getDnsRateLimit() {
    return dnsRateLimit;
  }

  public void setDnsRateLimit(DnsRateProfile dnsRateLimit) {
    this.dnsRateLimit = dnsRateLimit;
  }

  public DnsRuleAction gslbSiteSelection(DnsRuleActionGslbSiteSelection gslbSiteSelection) {
    this.gslbSiteSelection = gslbSiteSelection;
    return this;
  }

   /**
   * Get gslbSiteSelection
   * @return gslbSiteSelection
  **/
  @Schema(description = "")
  public DnsRuleActionGslbSiteSelection getGslbSiteSelection() {
    return gslbSiteSelection;
  }

  public void setGslbSiteSelection(DnsRuleActionGslbSiteSelection gslbSiteSelection) {
    this.gslbSiteSelection = gslbSiteSelection;
  }

  public DnsRuleAction poolSwitching(DnsRuleActionPoolSwitching poolSwitching) {
    this.poolSwitching = poolSwitching;
    return this;
  }

   /**
   * Get poolSwitching
   * @return poolSwitching
  **/
  @Schema(description = "")
  public DnsRuleActionPoolSwitching getPoolSwitching() {
    return poolSwitching;
  }

  public void setPoolSwitching(DnsRuleActionPoolSwitching poolSwitching) {
    this.poolSwitching = poolSwitching;
  }

  public DnsRuleAction response(DnsRuleActionResponse response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @Schema(description = "")
  public DnsRuleActionResponse getResponse() {
    return response;
  }

  public void setResponse(DnsRuleActionResponse response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRuleAction dnsRuleAction = (DnsRuleAction) o;
    return Objects.equals(this.allow, dnsRuleAction.allow) &&
        Objects.equals(this.dnsRateLimit, dnsRuleAction.dnsRateLimit) &&
        Objects.equals(this.gslbSiteSelection, dnsRuleAction.gslbSiteSelection) &&
        Objects.equals(this.poolSwitching, dnsRuleAction.poolSwitching) &&
        Objects.equals(this.response, dnsRuleAction.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow, dnsRateLimit, gslbSiteSelection, poolSwitching, response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRuleAction {\n");
    
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
    sb.append("    dnsRateLimit: ").append(toIndentedString(dnsRateLimit)).append("\n");
    sb.append("    gslbSiteSelection: ").append(toIndentedString(gslbSiteSelection)).append("\n");
    sb.append("    poolSwitching: ").append(toIndentedString(poolSwitching)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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