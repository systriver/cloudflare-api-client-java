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
import io.swagger.client.model.Scope;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Route
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Route {
  @SerializedName("created_on")
  private OffsetDateTime createdOn = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("modified_on")
  private OffsetDateTime modifiedOn = null;

  @SerializedName("nexthop")
  private String nexthop = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("scope")
  private Scope scope = null;

  @SerializedName("weight")
  private Integer weight = null;

  public Route createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Route description(String description) {
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

  public Route id(String id) {
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

  public Route modifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @Schema(description = "")
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public Route nexthop(String nexthop) {
    this.nexthop = nexthop;
    return this;
  }

   /**
   * Get nexthop
   * @return nexthop
  **/
  @Schema(required = true, description = "")
  public String getNexthop() {
    return nexthop;
  }

  public void setNexthop(String nexthop) {
    this.nexthop = nexthop;
  }

  public Route prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @Schema(required = true, description = "")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public Route priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(required = true, description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Route scope(Scope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public Scope getScope() {
    return scope;
  }

  public void setScope(Scope scope) {
    this.scope = scope;
  }

  public Route weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @Schema(description = "")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Route route = (Route) o;
    return Objects.equals(this.createdOn, route.createdOn) &&
        Objects.equals(this.description, route.description) &&
        Objects.equals(this.id, route.id) &&
        Objects.equals(this.modifiedOn, route.modifiedOn) &&
        Objects.equals(this.nexthop, route.nexthop) &&
        Objects.equals(this.prefix, route.prefix) &&
        Objects.equals(this.priority, route.priority) &&
        Objects.equals(this.scope, route.scope) &&
        Objects.equals(this.weight, route.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, description, id, modifiedOn, nexthop, prefix, priority, scope, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Route {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
