/*
 * Cloudflare API
 * Interact with Cloudflare's products and services via the Cloudflare API. For more information on how to create and troubleshoot API tokens, refer to our [API fundamentals](https://developers.cloudflare.com/fundamentals/api/).  Totally new to Cloudflare? [Start here](https://developers.cloudflare.com/fundamentals/get-started/).
 *
 * OpenAPI spec version: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PolicyCheckResponseResultAppState
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class PolicyCheckResponseResultAppState {
  @SerializedName("app_uid")
  private String appUid = null;

  @SerializedName("aud")
  private String aud = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("policies")
  private List<Object> policies = null;

  @SerializedName("status")
  private String status = null;

  public PolicyCheckResponseResultAppState appUid(String appUid) {
    this.appUid = appUid;
    return this;
  }

   /**
   * Get appUid
   * @return appUid
  **/
  @Schema(description = "")
  public String getAppUid() {
    return appUid;
  }

  public void setAppUid(String appUid) {
    this.appUid = appUid;
  }

  public PolicyCheckResponseResultAppState aud(String aud) {
    this.aud = aud;
    return this;
  }

   /**
   * Get aud
   * @return aud
  **/
  @Schema(example = "737646a56ab1df6ec9bddc7e5ca84eaf3b0768850f3ffb5d74f1534911fe389", description = "")
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public PolicyCheckResponseResultAppState hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @Schema(example = "test.com", description = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public PolicyCheckResponseResultAppState name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Test App", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PolicyCheckResponseResultAppState policies(List<Object> policies) {
    this.policies = policies;
    return this;
  }

  public PolicyCheckResponseResultAppState addPoliciesItem(Object policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<Object>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @Schema(example = "[{\"decision\":\"allow\",\"exclude\":[],\"include\":[{\"_type\":\"email\",\"email\":\"testuser@gmail.com\"}],\"precedence\":0,\"require\":[],\"status\":\"Success\"}]", description = "")
  public List<Object> getPolicies() {
    return policies;
  }

  public void setPolicies(List<Object> policies) {
    this.policies = policies;
  }

  public PolicyCheckResponseResultAppState status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(example = "Success", description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyCheckResponseResultAppState policyCheckResponseResultAppState = (PolicyCheckResponseResultAppState) o;
    return Objects.equals(this.appUid, policyCheckResponseResultAppState.appUid) &&
        Objects.equals(this.aud, policyCheckResponseResultAppState.aud) &&
        Objects.equals(this.hostname, policyCheckResponseResultAppState.hostname) &&
        Objects.equals(this.name, policyCheckResponseResultAppState.name) &&
        Objects.equals(this.policies, policyCheckResponseResultAppState.policies) &&
        Objects.equals(this.status, policyCheckResponseResultAppState.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appUid, aud, hostname, name, policies, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyCheckResponseResultAppState {\n");
    
    sb.append("    appUid: ").append(toIndentedString(appUid)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
