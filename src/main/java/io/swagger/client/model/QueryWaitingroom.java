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
import io.swagger.client.model.CookieAttributes;
import io.swagger.client.model.DefaultTemplateLanguage;
import io.swagger.client.model.QueueingMethod;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * QueryWaitingroom
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class QueryWaitingroom {
  @SerializedName("cookie_attributes")
  private CookieAttributes cookieAttributes = null;

  @SerializedName("custom_page_html")
  private String customPageHtml = null;

  @SerializedName("default_template_language")
  private DefaultTemplateLanguage defaultTemplateLanguage = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("disable_session_renewal")
  private Boolean disableSessionRenewal = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("json_response_enabled")
  private Boolean jsonResponseEnabled = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("new_users_per_minute")
  private Integer newUsersPerMinute = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("queue_all")
  private Boolean queueAll = null;

  @SerializedName("queueing_method")
  private QueueingMethod queueingMethod = null;

  @SerializedName("session_duration")
  private Integer sessionDuration = null;

  @SerializedName("suspended")
  private Boolean suspended = null;

  @SerializedName("total_active_users")
  private Integer totalActiveUsers = null;

  public QueryWaitingroom cookieAttributes(CookieAttributes cookieAttributes) {
    this.cookieAttributes = cookieAttributes;
    return this;
  }

   /**
   * Get cookieAttributes
   * @return cookieAttributes
  **/
  @Schema(description = "")
  public CookieAttributes getCookieAttributes() {
    return cookieAttributes;
  }

  public void setCookieAttributes(CookieAttributes cookieAttributes) {
    this.cookieAttributes = cookieAttributes;
  }

  public QueryWaitingroom customPageHtml(String customPageHtml) {
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

  public QueryWaitingroom defaultTemplateLanguage(DefaultTemplateLanguage defaultTemplateLanguage) {
    this.defaultTemplateLanguage = defaultTemplateLanguage;
    return this;
  }

   /**
   * Get defaultTemplateLanguage
   * @return defaultTemplateLanguage
  **/
  @Schema(description = "")
  public DefaultTemplateLanguage getDefaultTemplateLanguage() {
    return defaultTemplateLanguage;
  }

  public void setDefaultTemplateLanguage(DefaultTemplateLanguage defaultTemplateLanguage) {
    this.defaultTemplateLanguage = defaultTemplateLanguage;
  }

  public QueryWaitingroom description(String description) {
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

  public QueryWaitingroom disableSessionRenewal(Boolean disableSessionRenewal) {
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

  public QueryWaitingroom host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(required = true, description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public QueryWaitingroom jsonResponseEnabled(Boolean jsonResponseEnabled) {
    this.jsonResponseEnabled = jsonResponseEnabled;
    return this;
  }

   /**
   * Get jsonResponseEnabled
   * @return jsonResponseEnabled
  **/
  @Schema(description = "")
  public Boolean getJsonResponseEnabled() {
    return jsonResponseEnabled;
  }

  public void setJsonResponseEnabled(Boolean jsonResponseEnabled) {
    this.jsonResponseEnabled = jsonResponseEnabled;
  }

  public QueryWaitingroom name(String name) {
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

  public QueryWaitingroom newUsersPerMinute(Integer newUsersPerMinute) {
    this.newUsersPerMinute = newUsersPerMinute;
    return this;
  }

   /**
   * Get newUsersPerMinute
   * @return newUsersPerMinute
  **/
  @Schema(required = true, description = "")
  public Integer getNewUsersPerMinute() {
    return newUsersPerMinute;
  }

  public void setNewUsersPerMinute(Integer newUsersPerMinute) {
    this.newUsersPerMinute = newUsersPerMinute;
  }

  public QueryWaitingroom path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public QueryWaitingroom queueAll(Boolean queueAll) {
    this.queueAll = queueAll;
    return this;
  }

   /**
   * Get queueAll
   * @return queueAll
  **/
  @Schema(description = "")
  public Boolean getQueueAll() {
    return queueAll;
  }

  public void setQueueAll(Boolean queueAll) {
    this.queueAll = queueAll;
  }

  public QueryWaitingroom queueingMethod(QueueingMethod queueingMethod) {
    this.queueingMethod = queueingMethod;
    return this;
  }

   /**
   * Get queueingMethod
   * @return queueingMethod
  **/
  @Schema(description = "")
  public QueueingMethod getQueueingMethod() {
    return queueingMethod;
  }

  public void setQueueingMethod(QueueingMethod queueingMethod) {
    this.queueingMethod = queueingMethod;
  }

  public QueryWaitingroom sessionDuration(Integer sessionDuration) {
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

  public QueryWaitingroom suspended(Boolean suspended) {
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

  public QueryWaitingroom totalActiveUsers(Integer totalActiveUsers) {
    this.totalActiveUsers = totalActiveUsers;
    return this;
  }

   /**
   * Get totalActiveUsers
   * @return totalActiveUsers
  **/
  @Schema(required = true, description = "")
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
    QueryWaitingroom queryWaitingroom = (QueryWaitingroom) o;
    return Objects.equals(this.cookieAttributes, queryWaitingroom.cookieAttributes) &&
        Objects.equals(this.customPageHtml, queryWaitingroom.customPageHtml) &&
        Objects.equals(this.defaultTemplateLanguage, queryWaitingroom.defaultTemplateLanguage) &&
        Objects.equals(this.description, queryWaitingroom.description) &&
        Objects.equals(this.disableSessionRenewal, queryWaitingroom.disableSessionRenewal) &&
        Objects.equals(this.host, queryWaitingroom.host) &&
        Objects.equals(this.jsonResponseEnabled, queryWaitingroom.jsonResponseEnabled) &&
        Objects.equals(this.name, queryWaitingroom.name) &&
        Objects.equals(this.newUsersPerMinute, queryWaitingroom.newUsersPerMinute) &&
        Objects.equals(this.path, queryWaitingroom.path) &&
        Objects.equals(this.queueAll, queryWaitingroom.queueAll) &&
        Objects.equals(this.queueingMethod, queryWaitingroom.queueingMethod) &&
        Objects.equals(this.sessionDuration, queryWaitingroom.sessionDuration) &&
        Objects.equals(this.suspended, queryWaitingroom.suspended) &&
        Objects.equals(this.totalActiveUsers, queryWaitingroom.totalActiveUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookieAttributes, customPageHtml, defaultTemplateLanguage, description, disableSessionRenewal, host, jsonResponseEnabled, name, newUsersPerMinute, path, queueAll, queueingMethod, sessionDuration, suspended, totalActiveUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryWaitingroom {\n");
    
    sb.append("    cookieAttributes: ").append(toIndentedString(cookieAttributes)).append("\n");
    sb.append("    customPageHtml: ").append(toIndentedString(customPageHtml)).append("\n");
    sb.append("    defaultTemplateLanguage: ").append(toIndentedString(defaultTemplateLanguage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disableSessionRenewal: ").append(toIndentedString(disableSessionRenewal)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    jsonResponseEnabled: ").append(toIndentedString(jsonResponseEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newUsersPerMinute: ").append(toIndentedString(newUsersPerMinute)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    queueAll: ").append(toIndentedString(queueAll)).append("\n");
    sb.append("    queueingMethod: ").append(toIndentedString(queueingMethod)).append("\n");
    sb.append("    sessionDuration: ").append(toIndentedString(sessionDuration)).append("\n");
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