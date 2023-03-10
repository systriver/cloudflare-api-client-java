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
import org.threeten.bp.OffsetDateTime;
/**
 * InlineResponse20039ResultMetaConfidenceInfoAnnotations
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20039ResultMetaConfidenceInfoAnnotations {
  @SerializedName("dataSource")
  private String dataSource = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("endTime")
  private OffsetDateTime endTime = null;

  @SerializedName("eventType")
  private String eventType = null;

  @SerializedName("linkedUrl")
  private String linkedUrl = null;

  @SerializedName("startTime")
  private OffsetDateTime startTime = null;

  public InlineResponse20039ResultMetaConfidenceInfoAnnotations dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @Schema(example = "ALL", required = true, description = "")
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public InlineResponse20039ResultMetaConfidenceInfoAnnotations description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(example = "Cable cut in Tonga", required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InlineResponse20039ResultMetaConfidenceInfoAnnotations endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(example = "2022-09-15T00:00Z", required = true, description = "")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public InlineResponse20039ResultMetaConfidenceInfoAnnotations eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @Schema(example = "OUTAGE", required = true, description = "")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public InlineResponse20039ResultMetaConfidenceInfoAnnotations linkedUrl(String linkedUrl) {
    this.linkedUrl = linkedUrl;
    return this;
  }

   /**
   * Get linkedUrl
   * @return linkedUrl
  **/
  @Schema(required = true, description = "")
  public String getLinkedUrl() {
    return linkedUrl;
  }

  public void setLinkedUrl(String linkedUrl) {
    this.linkedUrl = linkedUrl;
  }

  public InlineResponse20039ResultMetaConfidenceInfoAnnotations startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(example = "2022-09-15T00:00Z", required = true, description = "")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20039ResultMetaConfidenceInfoAnnotations inlineResponse20039ResultMetaConfidenceInfoAnnotations = (InlineResponse20039ResultMetaConfidenceInfoAnnotations) o;
    return Objects.equals(this.dataSource, inlineResponse20039ResultMetaConfidenceInfoAnnotations.dataSource) &&
        Objects.equals(this.description, inlineResponse20039ResultMetaConfidenceInfoAnnotations.description) &&
        Objects.equals(this.endTime, inlineResponse20039ResultMetaConfidenceInfoAnnotations.endTime) &&
        Objects.equals(this.eventType, inlineResponse20039ResultMetaConfidenceInfoAnnotations.eventType) &&
        Objects.equals(this.linkedUrl, inlineResponse20039ResultMetaConfidenceInfoAnnotations.linkedUrl) &&
        Objects.equals(this.startTime, inlineResponse20039ResultMetaConfidenceInfoAnnotations.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, description, endTime, eventType, linkedUrl, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20039ResultMetaConfidenceInfoAnnotations {\n");
    
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    linkedUrl: ").append(toIndentedString(linkedUrl)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
