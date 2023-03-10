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
 * QueryEvent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class QueryEvent {
  @SerializedName("custom_page_html")
  private String customPageHtml = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("disable_session_renewal")
  private Boolean disableSessionRenewal = null;

  @SerializedName("event_end_time")
  private String eventEndTime = null;

  @SerializedName("event_start_time")
  private String eventStartTime = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("new_users_per_minute")
  private Integer newUsersPerMinute = null;

  @SerializedName("prequeue_start_time")
  private String prequeueStartTime = null;

  @SerializedName("queueing_method")
  private String queueingMethod = null;

  @SerializedName("session_duration")
  private Integer sessionDuration = null;

  @SerializedName("shuffle_at_event_start")
  private Boolean shuffleAtEventStart = null;

  @SerializedName("suspended")
  private Boolean suspended = null;

  @SerializedName("total_active_users")
  private Integer totalActiveUsers = null;

  public QueryEvent customPageHtml(String customPageHtml) {
    this.customPageHtml = customPageHtml;
    return this;
  }

   /**
   * Get customPageHtml
   * @return customPageHtml
  **/
  @Schema(description = "")
  public String getCustomPageHtml() {
    return customPageHtml;
  }

  public void setCustomPageHtml(String customPageHtml) {
    this.customPageHtml = customPageHtml;
  }

  public QueryEvent description(String description) {
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

  public QueryEvent disableSessionRenewal(Boolean disableSessionRenewal) {
    this.disableSessionRenewal = disableSessionRenewal;
    return this;
  }

   /**
   * Get disableSessionRenewal
   * @return disableSessionRenewal
  **/
  @Schema(description = "")
  public Boolean getDisableSessionRenewal() {
    return disableSessionRenewal;
  }

  public void setDisableSessionRenewal(Boolean disableSessionRenewal) {
    this.disableSessionRenewal = disableSessionRenewal;
  }

  public QueryEvent eventEndTime(String eventEndTime) {
    this.eventEndTime = eventEndTime;
    return this;
  }

   /**
   * Get eventEndTime
   * @return eventEndTime
  **/
  @Schema(required = true, description = "")
  public String getEventEndTime() {
    return eventEndTime;
  }

  public void setEventEndTime(String eventEndTime) {
    this.eventEndTime = eventEndTime;
  }

  public QueryEvent eventStartTime(String eventStartTime) {
    this.eventStartTime = eventStartTime;
    return this;
  }

   /**
   * Get eventStartTime
   * @return eventStartTime
  **/
  @Schema(required = true, description = "")
  public String getEventStartTime() {
    return eventStartTime;
  }

  public void setEventStartTime(String eventStartTime) {
    this.eventStartTime = eventStartTime;
  }

  public QueryEvent name(String name) {
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

  public QueryEvent newUsersPerMinute(Integer newUsersPerMinute) {
    this.newUsersPerMinute = newUsersPerMinute;
    return this;
  }

   /**
   * Get newUsersPerMinute
   * @return newUsersPerMinute
  **/
  @Schema(description = "")
  public Integer getNewUsersPerMinute() {
    return newUsersPerMinute;
  }

  public void setNewUsersPerMinute(Integer newUsersPerMinute) {
    this.newUsersPerMinute = newUsersPerMinute;
  }

  public QueryEvent prequeueStartTime(String prequeueStartTime) {
    this.prequeueStartTime = prequeueStartTime;
    return this;
  }

   /**
   * Get prequeueStartTime
   * @return prequeueStartTime
  **/
  @Schema(description = "")
  public String getPrequeueStartTime() {
    return prequeueStartTime;
  }

  public void setPrequeueStartTime(String prequeueStartTime) {
    this.prequeueStartTime = prequeueStartTime;
  }

  public QueryEvent queueingMethod(String queueingMethod) {
    this.queueingMethod = queueingMethod;
    return this;
  }

   /**
   * Get queueingMethod
   * @return queueingMethod
  **/
  @Schema(description = "")
  public String getQueueingMethod() {
    return queueingMethod;
  }

  public void setQueueingMethod(String queueingMethod) {
    this.queueingMethod = queueingMethod;
  }

  public QueryEvent sessionDuration(Integer sessionDuration) {
    this.sessionDuration = sessionDuration;
    return this;
  }

   /**
   * Get sessionDuration
   * @return sessionDuration
  **/
  @Schema(description = "")
  public Integer getSessionDuration() {
    return sessionDuration;
  }

  public void setSessionDuration(Integer sessionDuration) {
    this.sessionDuration = sessionDuration;
  }

  public QueryEvent shuffleAtEventStart(Boolean shuffleAtEventStart) {
    this.shuffleAtEventStart = shuffleAtEventStart;
    return this;
  }

   /**
   * Get shuffleAtEventStart
   * @return shuffleAtEventStart
  **/
  @Schema(description = "")
  public Boolean getShuffleAtEventStart() {
    return shuffleAtEventStart;
  }

  public void setShuffleAtEventStart(Boolean shuffleAtEventStart) {
    this.shuffleAtEventStart = shuffleAtEventStart;
  }

  public QueryEvent suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

   /**
   * Get suspended
   * @return suspended
  **/
  @Schema(description = "")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public QueryEvent totalActiveUsers(Integer totalActiveUsers) {
    this.totalActiveUsers = totalActiveUsers;
    return this;
  }

   /**
   * Get totalActiveUsers
   * @return totalActiveUsers
  **/
  @Schema(description = "")
  public Integer getTotalActiveUsers() {
    return totalActiveUsers;
  }

  public void setTotalActiveUsers(Integer totalActiveUsers) {
    this.totalActiveUsers = totalActiveUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryEvent queryEvent = (QueryEvent) o;
    return Objects.equals(this.customPageHtml, queryEvent.customPageHtml) &&
        Objects.equals(this.description, queryEvent.description) &&
        Objects.equals(this.disableSessionRenewal, queryEvent.disableSessionRenewal) &&
        Objects.equals(this.eventEndTime, queryEvent.eventEndTime) &&
        Objects.equals(this.eventStartTime, queryEvent.eventStartTime) &&
        Objects.equals(this.name, queryEvent.name) &&
        Objects.equals(this.newUsersPerMinute, queryEvent.newUsersPerMinute) &&
        Objects.equals(this.prequeueStartTime, queryEvent.prequeueStartTime) &&
        Objects.equals(this.queueingMethod, queryEvent.queueingMethod) &&
        Objects.equals(this.sessionDuration, queryEvent.sessionDuration) &&
        Objects.equals(this.shuffleAtEventStart, queryEvent.shuffleAtEventStart) &&
        Objects.equals(this.suspended, queryEvent.suspended) &&
        Objects.equals(this.totalActiveUsers, queryEvent.totalActiveUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customPageHtml, description, disableSessionRenewal, eventEndTime, eventStartTime, name, newUsersPerMinute, prequeueStartTime, queueingMethod, sessionDuration, shuffleAtEventStart, suspended, totalActiveUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryEvent {\n");
    
    sb.append("    customPageHtml: ").append(toIndentedString(customPageHtml)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disableSessionRenewal: ").append(toIndentedString(disableSessionRenewal)).append("\n");
    sb.append("    eventEndTime: ").append(toIndentedString(eventEndTime)).append("\n");
    sb.append("    eventStartTime: ").append(toIndentedString(eventStartTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newUsersPerMinute: ").append(toIndentedString(newUsersPerMinute)).append("\n");
    sb.append("    prequeueStartTime: ").append(toIndentedString(prequeueStartTime)).append("\n");
    sb.append("    queueingMethod: ").append(toIndentedString(queueingMethod)).append("\n");
    sb.append("    sessionDuration: ").append(toIndentedString(sessionDuration)).append("\n");
    sb.append("    shuffleAtEventStart: ").append(toIndentedString(shuffleAtEventStart)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    totalActiveUsers: ").append(toIndentedString(totalActiveUsers)).append("\n");
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
