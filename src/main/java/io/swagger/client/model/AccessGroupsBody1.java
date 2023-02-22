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
import io.swagger.client.model.CloudflareClientAPIExclude;
import io.swagger.client.model.CloudflareClientAPIInclude;
import io.swagger.client.model.CloudflareClientAPIRequire;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AccessGroupsBody1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class AccessGroupsBody1 {
  @SerializedName("exclude")
  private CloudflareClientAPIExclude exclude = null;

  @SerializedName("include")
  private CloudflareClientAPIInclude include = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("require")
  private CloudflareClientAPIRequire require = null;

  public AccessGroupsBody1 exclude(CloudflareClientAPIExclude exclude) {
    this.exclude = exclude;
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  @Schema(description = "")
  public CloudflareClientAPIExclude getExclude() {
    return exclude;
  }

  public void setExclude(CloudflareClientAPIExclude exclude) {
    this.exclude = exclude;
  }

  public AccessGroupsBody1 include(CloudflareClientAPIInclude include) {
    this.include = include;
    return this;
  }

   /**
   * Get include
   * @return include
  **/
  @Schema(required = true, description = "")
  public CloudflareClientAPIInclude getInclude() {
    return include;
  }

  public void setInclude(CloudflareClientAPIInclude include) {
    this.include = include;
  }

  public AccessGroupsBody1 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccessGroupsBody1 require(CloudflareClientAPIRequire require) {
    this.require = require;
    return this;
  }

   /**
   * Get require
   * @return require
  **/
  @Schema(description = "")
  public CloudflareClientAPIRequire getRequire() {
    return require;
  }

  public void setRequire(CloudflareClientAPIRequire require) {
    this.require = require;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessGroupsBody1 accessGroupsBody1 = (AccessGroupsBody1) o;
    return Objects.equals(this.exclude, accessGroupsBody1.exclude) &&
        Objects.equals(this.include, accessGroupsBody1.include) &&
        Objects.equals(this.name, accessGroupsBody1.name) &&
        Objects.equals(this.require, accessGroupsBody1.require);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclude, include, name, require);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessGroupsBody1 {\n");
    
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    require: ").append(toIndentedString(require)).append("\n");
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
