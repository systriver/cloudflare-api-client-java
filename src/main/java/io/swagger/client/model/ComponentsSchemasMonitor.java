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
import io.swagger.client.model.Header;
import io.swagger.client.model.MonitorComponentsSchemasIdentifier;
import io.swagger.client.model.MonitorComponentsSchemasType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * ComponentsSchemasMonitor
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ComponentsSchemasMonitor {
  @SerializedName("allow_insecure")
  private Boolean allowInsecure = null;

  @SerializedName("consecutive_down")
  private Integer consecutiveDown = null;

  @SerializedName("consecutive_up")
  private Integer consecutiveUp = null;

  @SerializedName("created_on")
  private OffsetDateTime createdOn = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("expected_body")
  private String expectedBody = null;

  @SerializedName("expected_codes")
  private String expectedCodes = null;

  @SerializedName("follow_redirects")
  private Boolean followRedirects = null;

  @SerializedName("header")
  private Header header = null;

  @SerializedName("id")
  private MonitorComponentsSchemasIdentifier id = null;

  @SerializedName("interval")
  private Integer interval = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("modified_on")
  private OffsetDateTime modifiedOn = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("probe_zone")
  private String probeZone = null;

  @SerializedName("retries")
  private Integer retries = null;

  @SerializedName("timeout")
  private Integer timeout = null;

  @SerializedName("type")
  private MonitorComponentsSchemasType type = null;

  public ComponentsSchemasMonitor allowInsecure(Boolean allowInsecure) {
    this.allowInsecure = allowInsecure;
    return this;
  }

   /**
   * Get allowInsecure
   * @return allowInsecure
  **/
  @Schema(description = "")
  public Boolean getAllowInsecure() {
    return allowInsecure;
  }

  public void setAllowInsecure(Boolean allowInsecure) {
    this.allowInsecure = allowInsecure;
  }

  public ComponentsSchemasMonitor consecutiveDown(Integer consecutiveDown) {
    this.consecutiveDown = consecutiveDown;
    return this;
  }

   /**
   * Get consecutiveDown
   * @return consecutiveDown
  **/
  @Schema(description = "")
  public Integer getConsecutiveDown() {
    return consecutiveDown;
  }

  public void setConsecutiveDown(Integer consecutiveDown) {
    this.consecutiveDown = consecutiveDown;
  }

  public ComponentsSchemasMonitor consecutiveUp(Integer consecutiveUp) {
    this.consecutiveUp = consecutiveUp;
    return this;
  }

   /**
   * Get consecutiveUp
   * @return consecutiveUp
  **/
  @Schema(description = "")
  public Integer getConsecutiveUp() {
    return consecutiveUp;
  }

  public void setConsecutiveUp(Integer consecutiveUp) {
    this.consecutiveUp = consecutiveUp;
  }

  public ComponentsSchemasMonitor createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public ComponentsSchemasMonitor description(String description) {
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

  public ComponentsSchemasMonitor expectedBody(String expectedBody) {
    this.expectedBody = expectedBody;
    return this;
  }

   /**
   * Get expectedBody
   * @return expectedBody
  **/
  @Schema(description = "")
  public String getExpectedBody() {
    return expectedBody;
  }

  public void setExpectedBody(String expectedBody) {
    this.expectedBody = expectedBody;
  }

  public ComponentsSchemasMonitor expectedCodes(String expectedCodes) {
    this.expectedCodes = expectedCodes;
    return this;
  }

   /**
   * Get expectedCodes
   * @return expectedCodes
  **/
  @Schema(description = "")
  public String getExpectedCodes() {
    return expectedCodes;
  }

  public void setExpectedCodes(String expectedCodes) {
    this.expectedCodes = expectedCodes;
  }

  public ComponentsSchemasMonitor followRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
    return this;
  }

   /**
   * Get followRedirects
   * @return followRedirects
  **/
  @Schema(description = "")
  public Boolean getFollowRedirects() {
    return followRedirects;
  }

  public void setFollowRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
  }

  public ComponentsSchemasMonitor header(Header header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @Schema(description = "")
  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public ComponentsSchemasMonitor id(MonitorComponentsSchemasIdentifier id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public MonitorComponentsSchemasIdentifier getId() {
    return id;
  }

  public void setId(MonitorComponentsSchemasIdentifier id) {
    this.id = id;
  }

  public ComponentsSchemasMonitor interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @Schema(description = "")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public ComponentsSchemasMonitor method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(description = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public ComponentsSchemasMonitor modifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @Schema(description = "")
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public ComponentsSchemasMonitor path(String path) {
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

  public ComponentsSchemasMonitor port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public ComponentsSchemasMonitor probeZone(String probeZone) {
    this.probeZone = probeZone;
    return this;
  }

   /**
   * Get probeZone
   * @return probeZone
  **/
  @Schema(description = "")
  public String getProbeZone() {
    return probeZone;
  }

  public void setProbeZone(String probeZone) {
    this.probeZone = probeZone;
  }

  public ComponentsSchemasMonitor retries(Integer retries) {
    this.retries = retries;
    return this;
  }

   /**
   * Get retries
   * @return retries
  **/
  @Schema(description = "")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public ComponentsSchemasMonitor timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public ComponentsSchemasMonitor type(MonitorComponentsSchemasType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public MonitorComponentsSchemasType getType() {
    return type;
  }

  public void setType(MonitorComponentsSchemasType type) {
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
    ComponentsSchemasMonitor componentsSchemasMonitor = (ComponentsSchemasMonitor) o;
    return Objects.equals(this.allowInsecure, componentsSchemasMonitor.allowInsecure) &&
        Objects.equals(this.consecutiveDown, componentsSchemasMonitor.consecutiveDown) &&
        Objects.equals(this.consecutiveUp, componentsSchemasMonitor.consecutiveUp) &&
        Objects.equals(this.createdOn, componentsSchemasMonitor.createdOn) &&
        Objects.equals(this.description, componentsSchemasMonitor.description) &&
        Objects.equals(this.expectedBody, componentsSchemasMonitor.expectedBody) &&
        Objects.equals(this.expectedCodes, componentsSchemasMonitor.expectedCodes) &&
        Objects.equals(this.followRedirects, componentsSchemasMonitor.followRedirects) &&
        Objects.equals(this.header, componentsSchemasMonitor.header) &&
        Objects.equals(this.id, componentsSchemasMonitor.id) &&
        Objects.equals(this.interval, componentsSchemasMonitor.interval) &&
        Objects.equals(this.method, componentsSchemasMonitor.method) &&
        Objects.equals(this.modifiedOn, componentsSchemasMonitor.modifiedOn) &&
        Objects.equals(this.path, componentsSchemasMonitor.path) &&
        Objects.equals(this.port, componentsSchemasMonitor.port) &&
        Objects.equals(this.probeZone, componentsSchemasMonitor.probeZone) &&
        Objects.equals(this.retries, componentsSchemasMonitor.retries) &&
        Objects.equals(this.timeout, componentsSchemasMonitor.timeout) &&
        Objects.equals(this.type, componentsSchemasMonitor.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowInsecure, consecutiveDown, consecutiveUp, createdOn, description, expectedBody, expectedCodes, followRedirects, header, id, interval, method, modifiedOn, path, port, probeZone, retries, timeout, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentsSchemasMonitor {\n");
    
    sb.append("    allowInsecure: ").append(toIndentedString(allowInsecure)).append("\n");
    sb.append("    consecutiveDown: ").append(toIndentedString(consecutiveDown)).append("\n");
    sb.append("    consecutiveUp: ").append(toIndentedString(consecutiveUp)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedBody: ").append(toIndentedString(expectedBody)).append("\n");
    sb.append("    expectedCodes: ").append(toIndentedString(expectedCodes)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    probeZone: ").append(toIndentedString(probeZone)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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