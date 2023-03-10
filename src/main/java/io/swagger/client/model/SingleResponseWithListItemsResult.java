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
import io.swagger.client.model.ListsComponentsSchemasType;
import io.swagger.client.model.SchemasItems;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * SingleResponseWithListItemsResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SingleResponseWithListItemsResult {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("items")
  private SchemasItems items = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private ListsComponentsSchemasType type = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public SingleResponseWithListItemsResult createdAt(OffsetDateTime createdAt) {
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

  public SingleResponseWithListItemsResult description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SingleResponseWithListItemsResult id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SingleResponseWithListItemsResult items(SchemasItems items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public SchemasItems getItems() {
    return items;
  }

  public void setItems(SchemasItems items) {
    this.items = items;
  }

  public SingleResponseWithListItemsResult name(String name) {
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

  public SingleResponseWithListItemsResult type(ListsComponentsSchemasType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public ListsComponentsSchemasType getType() {
    return type;
  }

  public void setType(ListsComponentsSchemasType type) {
    this.type = type;
  }

  public SingleResponseWithListItemsResult updatedAt(OffsetDateTime updatedAt) {
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
    SingleResponseWithListItemsResult singleResponseWithListItemsResult = (SingleResponseWithListItemsResult) o;
    return Objects.equals(this.createdAt, singleResponseWithListItemsResult.createdAt) &&
        Objects.equals(this.description, singleResponseWithListItemsResult.description) &&
        Objects.equals(this.id, singleResponseWithListItemsResult.id) &&
        Objects.equals(this.items, singleResponseWithListItemsResult.items) &&
        Objects.equals(this.name, singleResponseWithListItemsResult.name) &&
        Objects.equals(this.type, singleResponseWithListItemsResult.type) &&
        Objects.equals(this.updatedAt, singleResponseWithListItemsResult.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, id, items, name, type, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleResponseWithListItemsResult {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
