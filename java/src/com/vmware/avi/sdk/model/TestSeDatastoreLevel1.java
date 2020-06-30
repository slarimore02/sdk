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
 * TestSeDatastoreLevel1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class TestSeDatastoreLevel1 {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("test_se_datastore_level_2_ref")
  private String testSeDatastoreLevel2Ref = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

   /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return _lastModified
  **/
  @Schema(description = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")
  public String getLastModified() {
    return _lastModified;
  }

  public TestSeDatastoreLevel1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the object.
   * @return name
  **/
  @Schema(required = true, description = "Name of the object.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestSeDatastoreLevel1 tenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Tenant. Field introduced in 18.2.6.
   * @return tenantRef
  **/
  @Schema(description = " It is a reference to an object of type Tenant. Field introduced in 18.2.6.")
  public String getTenantRef() {
    return tenantRef;
  }

  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  public TestSeDatastoreLevel1 testSeDatastoreLevel2Ref(String testSeDatastoreLevel2Ref) {
    this.testSeDatastoreLevel2Ref = testSeDatastoreLevel2Ref;
    return this;
  }

   /**
   *  It is a reference to an object of type TestSeDatastoreLevel2. Field introduced in 18.2.6.
   * @return testSeDatastoreLevel2Ref
  **/
  @Schema(description = " It is a reference to an object of type TestSeDatastoreLevel2. Field introduced in 18.2.6.")
  public String getTestSeDatastoreLevel2Ref() {
    return testSeDatastoreLevel2Ref;
  }

  public void setTestSeDatastoreLevel2Ref(String testSeDatastoreLevel2Ref) {
    this.testSeDatastoreLevel2Ref = testSeDatastoreLevel2Ref;
  }

   /**
   * url
   * @return url
  **/
  @Schema(description = "url")
  public String getUrl() {
    return url;
  }

  public TestSeDatastoreLevel1 uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @Schema(description = "Unique object identifier of the object.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSeDatastoreLevel1 testSeDatastoreLevel1 = (TestSeDatastoreLevel1) o;
    return Objects.equals(this._lastModified, testSeDatastoreLevel1._lastModified) &&
        Objects.equals(this.name, testSeDatastoreLevel1.name) &&
        Objects.equals(this.tenantRef, testSeDatastoreLevel1.tenantRef) &&
        Objects.equals(this.testSeDatastoreLevel2Ref, testSeDatastoreLevel1.testSeDatastoreLevel2Ref) &&
        Objects.equals(this.url, testSeDatastoreLevel1.url) &&
        Objects.equals(this.uuid, testSeDatastoreLevel1.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, name, tenantRef, testSeDatastoreLevel2Ref, url, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestSeDatastoreLevel1 {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    testSeDatastoreLevel2Ref: ").append(toIndentedString(testSeDatastoreLevel2Ref)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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