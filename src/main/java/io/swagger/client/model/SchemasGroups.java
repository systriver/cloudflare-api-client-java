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
import io.swagger.client.model.SchemasUuid;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * SchemasGroups
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SchemasGroups {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("exclude")
  private CloudflareClientAPIExclude exclude = null;

  @SerializedName("id")
  private SchemasUuid id = null;

  @SerializedName("include")
  private CloudflareClientAPIInclude include = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("require")
  private CloudflareClientAPIRequire require = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public SchemasGroups createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SchemasGroups exclude(CloudflareClientAPIExclude exclude) {
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

  public SchemasGroups id(SchemasUuid id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public SchemasUuid getId() {
    return id;
  }

  public void setId(SchemasUuid id) {
    this.id = id;
  }

  public SchemasGroups include(CloudflareClientAPIInclude include) {
    this.include = include;
    return this;
  }

   /**
   * Get include
   * @return include
  **/
  @Schema(description = "")
  public CloudflareClientAPIInclude getInclude() {
    return include;
  }

  public void setInclude(CloudflareClientAPIInclude include) {
    this.include = include;
  }

  public SchemasGroups name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SchemasGroups require(CloudflareClientAPIRequire require) {
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

  public SchemasGroups updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemasGroups schemasGroups = (SchemasGroups) o;
    return Objects.equals(this.createdAt, schemasGroups.createdAt) &&
        Objects.equals(this.exclude, schemasGroups.exclude) &&
        Objects.equals(this.id, schemasGroups.id) &&
        Objects.equals(this.include, schemasGroups.include) &&
        Objects.equals(this.name, schemasGroups.name) &&
        Objects.equals(this.require, schemasGroups.require) &&
        Objects.equals(this.updatedAt, schemasGroups.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, exclude, id, include, name, require, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasGroups {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    require: ").append(toIndentedString(require)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
