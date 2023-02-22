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
/**
 * Filter options for a particular resource type (pool or origin). Use null to reset.
 */
@Schema(description = "Filter options for a particular resource type (pool or origin). Use null to reset.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class FilterOptions {
  @SerializedName("disable")
  private Boolean disable = false;

  @SerializedName("healthy")
  private Boolean healthy = null;

  public FilterOptions disable(Boolean disable) {
    this.disable = disable;
    return this;
  }

   /**
   * If set true, disable notifications for this type of resource (pool or origin).
   * @return disable
  **/
  @Schema(description = "If set true, disable notifications for this type of resource (pool or origin).")
  public Boolean isDisable() {
    return disable;
  }

  public void setDisable(Boolean disable) {
    this.disable = disable;
  }

  public FilterOptions healthy(Boolean healthy) {
    this.healthy = healthy;
    return this;
  }

   /**
   * If present, send notifications only for this health status (e.g. false for only DOWN events). Use null to reset (all events).
   * @return healthy
  **/
  @Schema(description = "If present, send notifications only for this health status (e.g. false for only DOWN events). Use null to reset (all events).")
  public Boolean isHealthy() {
    return healthy;
  }

  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterOptions filterOptions = (FilterOptions) o;
    return Objects.equals(this.disable, filterOptions.disable) &&
        Objects.equals(this.healthy, filterOptions.healthy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disable, healthy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterOptions {\n");
    
    sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
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
