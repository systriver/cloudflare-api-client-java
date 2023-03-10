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
import io.swagger.client.model.InlineResponse20039ResultMetaConfidenceInfo;
import io.swagger.client.model.InlineResponse20039ResultMetaDateRange;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * InlineResponse20039ResultMeta
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20039ResultMeta {
  @SerializedName("aggInterval")
  private String aggInterval = null;

  @SerializedName("confidenceInfo")
  private InlineResponse20039ResultMetaConfidenceInfo confidenceInfo = null;

  @SerializedName("dateRange")
  private InlineResponse20039ResultMetaDateRange dateRange = null;

  @SerializedName("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  public InlineResponse20039ResultMeta aggInterval(String aggInterval) {
    this.aggInterval = aggInterval;
    return this;
  }

   /**
   * Get aggInterval
   * @return aggInterval
  **/
  @Schema(example = "1h", required = true, description = "")
  public String getAggInterval() {
    return aggInterval;
  }

  public void setAggInterval(String aggInterval) {
    this.aggInterval = aggInterval;
  }

  public InlineResponse20039ResultMeta confidenceInfo(InlineResponse20039ResultMetaConfidenceInfo confidenceInfo) {
    this.confidenceInfo = confidenceInfo;
    return this;
  }

   /**
   * Get confidenceInfo
   * @return confidenceInfo
  **/
  @Schema(required = true, description = "")
  public InlineResponse20039ResultMetaConfidenceInfo getConfidenceInfo() {
    return confidenceInfo;
  }

  public void setConfidenceInfo(InlineResponse20039ResultMetaConfidenceInfo confidenceInfo) {
    this.confidenceInfo = confidenceInfo;
  }

  public InlineResponse20039ResultMeta dateRange(InlineResponse20039ResultMetaDateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

   /**
   * Get dateRange
   * @return dateRange
  **/
  @Schema(required = true, description = "")
  public InlineResponse20039ResultMetaDateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(InlineResponse20039ResultMetaDateRange dateRange) {
    this.dateRange = dateRange;
  }

  public InlineResponse20039ResultMeta lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @Schema(example = "2022-09-15T00:00Z", required = true, description = "")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20039ResultMeta inlineResponse20039ResultMeta = (InlineResponse20039ResultMeta) o;
    return Objects.equals(this.aggInterval, inlineResponse20039ResultMeta.aggInterval) &&
        Objects.equals(this.confidenceInfo, inlineResponse20039ResultMeta.confidenceInfo) &&
        Objects.equals(this.dateRange, inlineResponse20039ResultMeta.dateRange) &&
        Objects.equals(this.lastUpdated, inlineResponse20039ResultMeta.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggInterval, confidenceInfo, dateRange, lastUpdated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20039ResultMeta {\n");
    
    sb.append("    aggInterval: ").append(toIndentedString(aggInterval)).append("\n");
    sb.append("    confidenceInfo: ").append(toIndentedString(confidenceInfo)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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
