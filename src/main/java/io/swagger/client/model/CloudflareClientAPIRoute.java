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
import io.swagger.client.model.CloudflareClientAPIRouteValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * CloudflareClientAPIRoute
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPIRoute implements OneOfschemasActionsItems {
  @SerializedName("modified_on")
  private OffsetDateTime modifiedOn = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private CloudflareClientAPIRouteValue value = null;

   /**
   * The timestamp of when the override was last modified.
   * @return modifiedOn
  **/
  @Schema(example = "2014-01-01T05:20:00.123450Z", description = "The timestamp of when the override was last modified.")
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

  public CloudflareClientAPIRoute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The type of route.
   * @return name
  **/
  @Schema(example = "forward_url", description = "The type of route.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloudflareClientAPIRoute value(CloudflareClientAPIRouteValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public CloudflareClientAPIRouteValue getValue() {
    return value;
  }

  public void setValue(CloudflareClientAPIRouteValue value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPIRoute cloudflareClientAPIRoute = (CloudflareClientAPIRoute) o;
    return Objects.equals(this.modifiedOn, cloudflareClientAPIRoute.modifiedOn) &&
        Objects.equals(this.name, cloudflareClientAPIRoute.name) &&
        Objects.equals(this.value, cloudflareClientAPIRoute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiedOn, name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIRoute {\n");
    
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
