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
 * InlineResponse20075ResultLocations
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20075ResultLocations {
  @SerializedName("alpha2")
  private String alpha2 = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("longitude")
  private String longitude = null;

  @SerializedName("name")
  private String name = null;

  public InlineResponse20075ResultLocations alpha2(String alpha2) {
    this.alpha2 = alpha2;
    return this;
  }

   /**
   * Get alpha2
   * @return alpha2
  **/
  @Schema(example = "AF", required = true, description = "")
  public String getAlpha2() {
    return alpha2;
  }

  public void setAlpha2(String alpha2) {
    this.alpha2 = alpha2;
  }

  public InlineResponse20075ResultLocations latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @Schema(example = "33.939116", required = true, description = "")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public InlineResponse20075ResultLocations longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @Schema(example = "67.709953", required = true, description = "")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public InlineResponse20075ResultLocations name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Afghanistan", required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20075ResultLocations inlineResponse20075ResultLocations = (InlineResponse20075ResultLocations) o;
    return Objects.equals(this.alpha2, inlineResponse20075ResultLocations.alpha2) &&
        Objects.equals(this.latitude, inlineResponse20075ResultLocations.latitude) &&
        Objects.equals(this.longitude, inlineResponse20075ResultLocations.longitude) &&
        Objects.equals(this.name, inlineResponse20075ResultLocations.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alpha2, latitude, longitude, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20075ResultLocations {\n");
    
    sb.append("    alpha2: ").append(toIndentedString(alpha2)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
