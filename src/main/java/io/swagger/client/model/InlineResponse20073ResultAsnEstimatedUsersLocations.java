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
 * InlineResponse20073ResultAsnEstimatedUsersLocations
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20073ResultAsnEstimatedUsersLocations {
  @SerializedName("estimatedUsers")
  private Integer estimatedUsers = null;

  @SerializedName("locationAlpha2")
  private String locationAlpha2 = null;

  @SerializedName("locationName")
  private String locationName = null;

  public InlineResponse20073ResultAsnEstimatedUsersLocations estimatedUsers(Integer estimatedUsers) {
    this.estimatedUsers = estimatedUsers;
    return this;
  }

   /**
   * Estimated users per location
   * @return estimatedUsers
  **/
  @Schema(example = "16710", required = true, description = "Estimated users per location")
  public Integer getEstimatedUsers() {
    return estimatedUsers;
  }

  public void setEstimatedUsers(Integer estimatedUsers) {
    this.estimatedUsers = estimatedUsers;
  }

  public InlineResponse20073ResultAsnEstimatedUsersLocations locationAlpha2(String locationAlpha2) {
    this.locationAlpha2 = locationAlpha2;
    return this;
  }

   /**
   * Get locationAlpha2
   * @return locationAlpha2
  **/
  @Schema(example = "US", required = true, description = "")
  public String getLocationAlpha2() {
    return locationAlpha2;
  }

  public void setLocationAlpha2(String locationAlpha2) {
    this.locationAlpha2 = locationAlpha2;
  }

  public InlineResponse20073ResultAsnEstimatedUsersLocations locationName(String locationName) {
    this.locationName = locationName;
    return this;
  }

   /**
   * Get locationName
   * @return locationName
  **/
  @Schema(example = "United States", required = true, description = "")
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20073ResultAsnEstimatedUsersLocations inlineResponse20073ResultAsnEstimatedUsersLocations = (InlineResponse20073ResultAsnEstimatedUsersLocations) o;
    return Objects.equals(this.estimatedUsers, inlineResponse20073ResultAsnEstimatedUsersLocations.estimatedUsers) &&
        Objects.equals(this.locationAlpha2, inlineResponse20073ResultAsnEstimatedUsersLocations.locationAlpha2) &&
        Objects.equals(this.locationName, inlineResponse20073ResultAsnEstimatedUsersLocations.locationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedUsers, locationAlpha2, locationName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20073ResultAsnEstimatedUsersLocations {\n");
    
    sb.append("    estimatedUsers: ").append(toIndentedString(estimatedUsers)).append("\n");
    sb.append("    locationAlpha2: ").append(toIndentedString(locationAlpha2)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
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