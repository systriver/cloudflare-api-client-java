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
import io.swagger.client.model.WaitingroomComponentsSchemasStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CloudflareClientAPIStatusResponseResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPIStatusResponseResult {
  @SerializedName("estimated_queued_users")
  private Integer estimatedQueuedUsers = null;

  @SerializedName("estimated_total_active_users")
  private Integer estimatedTotalActiveUsers = null;

  @SerializedName("event_id")
  private String eventId = null;

  @SerializedName("max_estimated_time_minutes")
  private Integer maxEstimatedTimeMinutes = null;

  @SerializedName("status")
  private WaitingroomComponentsSchemasStatus status = null;

  public CloudflareClientAPIStatusResponseResult estimatedQueuedUsers(Integer estimatedQueuedUsers) {
    this.estimatedQueuedUsers = estimatedQueuedUsers;
    return this;
  }

   /**
   * Get estimatedQueuedUsers
   * @return estimatedQueuedUsers
  **/
  @Schema(description = "")
  public Integer getEstimatedQueuedUsers() {
    return estimatedQueuedUsers;
  }

  public void setEstimatedQueuedUsers(Integer estimatedQueuedUsers) {
    this.estimatedQueuedUsers = estimatedQueuedUsers;
  }

  public CloudflareClientAPIStatusResponseResult estimatedTotalActiveUsers(Integer estimatedTotalActiveUsers) {
    this.estimatedTotalActiveUsers = estimatedTotalActiveUsers;
    return this;
  }

   /**
   * Get estimatedTotalActiveUsers
   * @return estimatedTotalActiveUsers
  **/
  @Schema(description = "")
  public Integer getEstimatedTotalActiveUsers() {
    return estimatedTotalActiveUsers;
  }

  public void setEstimatedTotalActiveUsers(Integer estimatedTotalActiveUsers) {
    this.estimatedTotalActiveUsers = estimatedTotalActiveUsers;
  }

  public CloudflareClientAPIStatusResponseResult eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @Schema(description = "")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public CloudflareClientAPIStatusResponseResult maxEstimatedTimeMinutes(Integer maxEstimatedTimeMinutes) {
    this.maxEstimatedTimeMinutes = maxEstimatedTimeMinutes;
    return this;
  }

   /**
   * Get maxEstimatedTimeMinutes
   * @return maxEstimatedTimeMinutes
  **/
  @Schema(description = "")
  public Integer getMaxEstimatedTimeMinutes() {
    return maxEstimatedTimeMinutes;
  }

  public void setMaxEstimatedTimeMinutes(Integer maxEstimatedTimeMinutes) {
    this.maxEstimatedTimeMinutes = maxEstimatedTimeMinutes;
  }

  public CloudflareClientAPIStatusResponseResult status(WaitingroomComponentsSchemasStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public WaitingroomComponentsSchemasStatus getStatus() {
    return status;
  }

  public void setStatus(WaitingroomComponentsSchemasStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPIStatusResponseResult cloudflareClientAPIStatusResponseResult = (CloudflareClientAPIStatusResponseResult) o;
    return Objects.equals(this.estimatedQueuedUsers, cloudflareClientAPIStatusResponseResult.estimatedQueuedUsers) &&
        Objects.equals(this.estimatedTotalActiveUsers, cloudflareClientAPIStatusResponseResult.estimatedTotalActiveUsers) &&
        Objects.equals(this.eventId, cloudflareClientAPIStatusResponseResult.eventId) &&
        Objects.equals(this.maxEstimatedTimeMinutes, cloudflareClientAPIStatusResponseResult.maxEstimatedTimeMinutes) &&
        Objects.equals(this.status, cloudflareClientAPIStatusResponseResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedQueuedUsers, estimatedTotalActiveUsers, eventId, maxEstimatedTimeMinutes, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIStatusResponseResult {\n");
    
    sb.append("    estimatedQueuedUsers: ").append(toIndentedString(estimatedQueuedUsers)).append("\n");
    sb.append("    estimatedTotalActiveUsers: ").append(toIndentedString(estimatedTotalActiveUsers)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    maxEstimatedTimeMinutes: ").append(toIndentedString(maxEstimatedTimeMinutes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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