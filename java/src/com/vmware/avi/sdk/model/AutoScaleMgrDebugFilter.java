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
 * AutoScaleMgrDebugFilter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class AutoScaleMgrDebugFilter {
  @JsonProperty("enable_aws_autoscale_integration")
  private Boolean enableAwsAutoscaleIntegration = null;

  @JsonProperty("intelligent_autoscale_period")
  private Integer intelligentAutoscalePeriod = null;

  @JsonProperty("pool_ref")
  private String poolRef = null;

  public AutoScaleMgrDebugFilter enableAwsAutoscaleIntegration(Boolean enableAwsAutoscaleIntegration) {
    this.enableAwsAutoscaleIntegration = enableAwsAutoscaleIntegration;
    return this;
  }

   /**
   * Enable aws autoscale integration. This is an alpha feature. Field introduced in 17.1.1.
   * @return enableAwsAutoscaleIntegration
  **/
  @Schema(description = "Enable aws autoscale integration. This is an alpha feature. Field introduced in 17.1.1.")
  public Boolean isEnableAwsAutoscaleIntegration() {
    return enableAwsAutoscaleIntegration;
  }

  public void setEnableAwsAutoscaleIntegration(Boolean enableAwsAutoscaleIntegration) {
    this.enableAwsAutoscaleIntegration = enableAwsAutoscaleIntegration;
  }

  public AutoScaleMgrDebugFilter intelligentAutoscalePeriod(Integer intelligentAutoscalePeriod) {
    this.intelligentAutoscalePeriod = intelligentAutoscalePeriod;
    return this;
  }

   /**
   * period of running intelligent autoscale check.
   * @return intelligentAutoscalePeriod
  **/
  @Schema(description = "period of running intelligent autoscale check.")
  public Integer getIntelligentAutoscalePeriod() {
    return intelligentAutoscalePeriod;
  }

  public void setIntelligentAutoscalePeriod(Integer intelligentAutoscalePeriod) {
    this.intelligentAutoscalePeriod = intelligentAutoscalePeriod;
  }

  public AutoScaleMgrDebugFilter poolRef(String poolRef) {
    this.poolRef = poolRef;
    return this;
  }

   /**
   * uuid of the Pool. It is a reference to an object of type Pool.
   * @return poolRef
  **/
  @Schema(description = "uuid of the Pool. It is a reference to an object of type Pool.")
  public String getPoolRef() {
    return poolRef;
  }

  public void setPoolRef(String poolRef) {
    this.poolRef = poolRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScaleMgrDebugFilter autoScaleMgrDebugFilter = (AutoScaleMgrDebugFilter) o;
    return Objects.equals(this.enableAwsAutoscaleIntegration, autoScaleMgrDebugFilter.enableAwsAutoscaleIntegration) &&
        Objects.equals(this.intelligentAutoscalePeriod, autoScaleMgrDebugFilter.intelligentAutoscalePeriod) &&
        Objects.equals(this.poolRef, autoScaleMgrDebugFilter.poolRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableAwsAutoscaleIntegration, intelligentAutoscalePeriod, poolRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScaleMgrDebugFilter {\n");
    
    sb.append("    enableAwsAutoscaleIntegration: ").append(toIndentedString(enableAwsAutoscaleIntegration)).append("\n");
    sb.append("    intelligentAutoscalePeriod: ").append(toIndentedString(intelligentAutoscalePeriod)).append("\n");
    sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
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