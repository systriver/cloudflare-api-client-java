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
import io.swagger.client.model.InlineResponse20061ResultAsnEstimatedUsersLocations;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20061ResultAsnEstimatedUsers
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T13:40:27.702461541+09:00[Asia/Tokyo]")
public class InlineResponse20061ResultAsnEstimatedUsers {
  @SerializedName("estimatedUsers")
  private Integer estimatedUsers = null;

  @SerializedName("locations")
  private List<InlineResponse20061ResultAsnEstimatedUsersLocations> locations = new ArrayList<InlineResponse20061ResultAsnEstimatedUsersLocations>();

  public InlineResponse20061ResultAsnEstimatedUsers estimatedUsers(Integer estimatedUsers) {
    this.estimatedUsers = estimatedUsers;
    return this;
  }

   /**
   * Total estimated users
   * @return estimatedUsers
  **/
  @Schema(example = "86099", description = "Total estimated users")
  public Integer getEstimatedUsers() {
    return estimatedUsers;
  }

  public void setEstimatedUsers(Integer estimatedUsers) {
    this.estimatedUsers = estimatedUsers;
  }

  public InlineResponse20061ResultAsnEstimatedUsers locations(List<InlineResponse20061ResultAsnEstimatedUsersLocations> locations) {
    this.locations = locations;
    return this;
  }

  public InlineResponse20061ResultAsnEstimatedUsers addLocationsItem(InlineResponse20061ResultAsnEstimatedUsersLocations locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @Schema(required = true, description = "")
  public List<InlineResponse20061ResultAsnEstimatedUsersLocations> getLocations() {
    return locations;
  }

  public void setLocations(List<InlineResponse20061ResultAsnEstimatedUsersLocations> locations) {
    this.locations = locations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20061ResultAsnEstimatedUsers inlineResponse20061ResultAsnEstimatedUsers = (InlineResponse20061ResultAsnEstimatedUsers) o;
    return Objects.equals(this.estimatedUsers, inlineResponse20061ResultAsnEstimatedUsers.estimatedUsers) &&
        Objects.equals(this.locations, inlineResponse20061ResultAsnEstimatedUsers.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedUsers, locations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20061ResultAsnEstimatedUsers {\n");
    
    sb.append("    estimatedUsers: ").append(toIndentedString(estimatedUsers)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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