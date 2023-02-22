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
import io.swagger.client.model.Exclude;
import io.swagger.client.model.Include;
import io.swagger.client.model.Require;
import io.swagger.client.model.SchemasUuid;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Groups
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Groups {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("exclude")
  private Exclude exclude = null;

  @SerializedName("id")
  private SchemasUuid id = null;

  @SerializedName("include")
  private Include include = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("require")
  private Require require = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public Groups createdAt(OffsetDateTime createdAt) {
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

  public Groups exclude(Exclude exclude) {
    this.exclude = exclude;
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  @Schema(description = "")
  public Exclude getExclude() {
    return exclude;
  }

  public void setExclude(Exclude exclude) {
    this.exclude = exclude;
  }

  public Groups id(SchemasUuid id) {
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

  public Groups include(Include include) {
    this.include = include;
    return this;
  }

   /**
   * Get include
   * @return include
  **/
  @Schema(description = "")
  public Include getInclude() {
    return include;
  }

  public void setInclude(Include include) {
    this.include = include;
  }

  public Groups name(String name) {
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

  public Groups require(Require require) {
    this.require = require;
    return this;
  }

   /**
   * Get require
   * @return require
  **/
  @Schema(description = "")
  public Require getRequire() {
    return require;
  }

  public void setRequire(Require require) {
    this.require = require;
  }

  public Groups updatedAt(OffsetDateTime updatedAt) {
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
    Groups groups = (Groups) o;
    return Objects.equals(this.createdAt, groups.createdAt) &&
        Objects.equals(this.exclude, groups.exclude) &&
        Objects.equals(this.id, groups.id) &&
        Objects.equals(this.include, groups.include) &&
        Objects.equals(this.name, groups.name) &&
        Objects.equals(this.require, groups.require) &&
        Objects.equals(this.updatedAt, groups.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, exclude, id, include, name, require, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Groups {\n");
    
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