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
 * L4RuleProtocolMatch
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class L4RuleProtocolMatch {
  @JsonProperty("match_criteria")
  private String matchCriteria = null;

  @JsonProperty("protocol")
  private String protocol = null;

  public L4RuleProtocolMatch matchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
    return this;
  }

   /**
   * Criterion to use for transport protocol matching. Enum options - IS_IN, IS_NOT_IN. Field introduced in 17.2.7.
   * @return matchCriteria
  **/
  @Schema(required = true, description = "Criterion to use for transport protocol matching. Enum options - IS_IN, IS_NOT_IN. Field introduced in 17.2.7.")
  public String getMatchCriteria() {
    return matchCriteria;
  }

  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }

  public L4RuleProtocolMatch protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Transport protocol to match. Enum options - PROTOCOL_ICMP, PROTOCOL_TCP, PROTOCOL_UDP. Field introduced in 17.2.7.
   * @return protocol
  **/
  @Schema(required = true, description = "Transport protocol to match. Enum options - PROTOCOL_ICMP, PROTOCOL_TCP, PROTOCOL_UDP. Field introduced in 17.2.7.")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    L4RuleProtocolMatch l4RuleProtocolMatch = (L4RuleProtocolMatch) o;
    return Objects.equals(this.matchCriteria, l4RuleProtocolMatch.matchCriteria) &&
        Objects.equals(this.protocol, l4RuleProtocolMatch.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCriteria, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class L4RuleProtocolMatch {\n");
    
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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