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
 * ThresholdsThresholds
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ThresholdsThresholds {
  @SerializedName("auth_id_tokens")
  private Integer authIdTokens = null;

  @SerializedName("data_points")
  private Integer dataPoints = null;

  @SerializedName("last_updated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("p50")
  private Integer p50 = null;

  @SerializedName("p90")
  private Integer p90 = null;

  @SerializedName("p99")
  private Integer p99 = null;

  @SerializedName("period_seconds")
  private Integer periodSeconds = null;

  @SerializedName("requests")
  private Integer requests = null;

  @SerializedName("suggested_threshold")
  private Integer suggestedThreshold = null;

  public ThresholdsThresholds authIdTokens(Integer authIdTokens) {
    this.authIdTokens = authIdTokens;
    return this;
  }

   /**
   * Get authIdTokens
   * @return authIdTokens
  **/
  @Schema(description = "")
  public Integer getAuthIdTokens() {
    return authIdTokens;
  }

  public void setAuthIdTokens(Integer authIdTokens) {
    this.authIdTokens = authIdTokens;
  }

  public ThresholdsThresholds dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

   /**
   * Get dataPoints
   * @return dataPoints
  **/
  @Schema(description = "")
  public Integer getDataPoints() {
    return dataPoints;
  }

  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  public ThresholdsThresholds lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @Schema(description = "")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ThresholdsThresholds p50(Integer p50) {
    this.p50 = p50;
    return this;
  }

   /**
   * Get p50
   * @return p50
  **/
  @Schema(description = "")
  public Integer getP50() {
    return p50;
  }

  public void setP50(Integer p50) {
    this.p50 = p50;
  }

  public ThresholdsThresholds p90(Integer p90) {
    this.p90 = p90;
    return this;
  }

   /**
   * Get p90
   * @return p90
  **/
  @Schema(description = "")
  public Integer getP90() {
    return p90;
  }

  public void setP90(Integer p90) {
    this.p90 = p90;
  }

  public ThresholdsThresholds p99(Integer p99) {
    this.p99 = p99;
    return this;
  }

   /**
   * Get p99
   * @return p99
  **/
  @Schema(description = "")
  public Integer getP99() {
    return p99;
  }

  public void setP99(Integer p99) {
    this.p99 = p99;
  }

  public ThresholdsThresholds periodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

   /**
   * Get periodSeconds
   * @return periodSeconds
  **/
  @Schema(description = "")
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }

  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }

  public ThresholdsThresholds requests(Integer requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/
  @Schema(description = "")
  public Integer getRequests() {
    return requests;
  }

  public void setRequests(Integer requests) {
    this.requests = requests;
  }

  public ThresholdsThresholds suggestedThreshold(Integer suggestedThreshold) {
    this.suggestedThreshold = suggestedThreshold;
    return this;
  }

   /**
   * Get suggestedThreshold
   * @return suggestedThreshold
  **/
  @Schema(description = "")
  public Integer getSuggestedThreshold() {
    return suggestedThreshold;
  }

  public void setSuggestedThreshold(Integer suggestedThreshold) {
    this.suggestedThreshold = suggestedThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThresholdsThresholds thresholdsThresholds = (ThresholdsThresholds) o;
    return Objects.equals(this.authIdTokens, thresholdsThresholds.authIdTokens) &&
        Objects.equals(this.dataPoints, thresholdsThresholds.dataPoints) &&
        Objects.equals(this.lastUpdated, thresholdsThresholds.lastUpdated) &&
        Objects.equals(this.p50, thresholdsThresholds.p50) &&
        Objects.equals(this.p90, thresholdsThresholds.p90) &&
        Objects.equals(this.p99, thresholdsThresholds.p99) &&
        Objects.equals(this.periodSeconds, thresholdsThresholds.periodSeconds) &&
        Objects.equals(this.requests, thresholdsThresholds.requests) &&
        Objects.equals(this.suggestedThreshold, thresholdsThresholds.suggestedThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authIdTokens, dataPoints, lastUpdated, p50, p90, p99, periodSeconds, requests, suggestedThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThresholdsThresholds {\n");
    
    sb.append("    authIdTokens: ").append(toIndentedString(authIdTokens)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    p50: ").append(toIndentedString(p50)).append("\n");
    sb.append("    p90: ").append(toIndentedString(p90)).append("\n");
    sb.append("    p99: ").append(toIndentedString(p99)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    suggestedThreshold: ").append(toIndentedString(suggestedThreshold)).append("\n");
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
