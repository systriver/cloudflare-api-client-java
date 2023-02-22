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
import io.swagger.client.model.DetectionMode;
import io.swagger.client.model.PackageComponentsSchemasStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PackageDefinition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class PackageDefinition implements ModelPackage {
  @SerializedName("description")
  private String description = null;

  @SerializedName("detection_mode")
  private DetectionMode detectionMode = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private PackageComponentsSchemasStatus status = null;

  @SerializedName("zone_id")
  private String zoneId = null;

  public PackageDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PackageDefinition detectionMode(DetectionMode detectionMode) {
    this.detectionMode = detectionMode;
    return this;
  }

   /**
   * Get detectionMode
   * @return detectionMode
  **/
  @Schema(required = true, description = "")
  public DetectionMode getDetectionMode() {
    return detectionMode;
  }

  public void setDetectionMode(DetectionMode detectionMode) {
    this.detectionMode = detectionMode;
  }

  public PackageDefinition id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PackageDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PackageDefinition status(PackageComponentsSchemasStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public PackageComponentsSchemasStatus getStatus() {
    return status;
  }

  public void setStatus(PackageComponentsSchemasStatus status) {
    this.status = status;
  }

  public PackageDefinition zoneId(String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(required = true, description = "")
  public String getZoneId() {
    return zoneId;
  }

  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageDefinition packageDefinition = (PackageDefinition) o;
    return Objects.equals(this.description, packageDefinition.description) &&
        Objects.equals(this.detectionMode, packageDefinition.detectionMode) &&
        Objects.equals(this.id, packageDefinition.id) &&
        Objects.equals(this.name, packageDefinition.name) &&
        Objects.equals(this.status, packageDefinition.status) &&
        Objects.equals(this.zoneId, packageDefinition.zoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, detectionMode, id, name, status, zoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageDefinition {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    detectionMode: ").append(toIndentedString(detectionMode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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