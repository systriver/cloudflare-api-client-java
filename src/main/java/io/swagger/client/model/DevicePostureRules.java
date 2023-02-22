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
import io.swagger.client.model.CloudflareClientAPIInput;
import io.swagger.client.model.Match;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DevicePostureRules
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DevicePostureRules {
  @SerializedName("description")
  private String description = null;

  @SerializedName("expiration")
  private String expiration = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("input")
  private CloudflareClientAPIInput input = null;

  @SerializedName("match")
  private Match match = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("schedule")
  private String schedule = null;

  @SerializedName("type")
  private String type = null;

  public DevicePostureRules description(String description) {
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

  public DevicePostureRules expiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @Schema(description = "")
  public String getExpiration() {
    return expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  public DevicePostureRules id(String id) {
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

  public DevicePostureRules input(CloudflareClientAPIInput input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @Schema(description = "")
  public CloudflareClientAPIInput getInput() {
    return input;
  }

  public void setInput(CloudflareClientAPIInput input) {
    this.input = input;
  }

  public DevicePostureRules match(Match match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @Schema(description = "")
  public Match getMatch() {
    return match;
  }

  public void setMatch(Match match) {
    this.match = match;
  }

  public DevicePostureRules name(String name) {
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

  public DevicePostureRules schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @Schema(description = "")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public DevicePostureRules type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicePostureRules devicePostureRules = (DevicePostureRules) o;
    return Objects.equals(this.description, devicePostureRules.description) &&
        Objects.equals(this.expiration, devicePostureRules.expiration) &&
        Objects.equals(this.id, devicePostureRules.id) &&
        Objects.equals(this.input, devicePostureRules.input) &&
        Objects.equals(this.match, devicePostureRules.match) &&
        Objects.equals(this.name, devicePostureRules.name) &&
        Objects.equals(this.schedule, devicePostureRules.schedule) &&
        Objects.equals(this.type, devicePostureRules.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expiration, id, input, match, name, schedule, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicePostureRules {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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