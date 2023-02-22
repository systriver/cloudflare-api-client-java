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
import io.swagger.client.model.Labels;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * NodeResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class NodeResult {
  @SerializedName("asn")
  private String asn = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("labels")
  private Labels labels = null;

  @SerializedName("max_rtt_ms")
  private BigDecimal maxRttMs = null;

  @SerializedName("mean_rtt_ms")
  private BigDecimal meanRttMs = null;

  @SerializedName("min_rtt_ms")
  private BigDecimal minRttMs = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("packet_count")
  private Integer packetCount = null;

  @SerializedName("std_dev_rtt_ms")
  private BigDecimal stdDevRttMs = null;

  public NodeResult asn(String asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @Schema(description = "")
  public String getAsn() {
    return asn;
  }

  public void setAsn(String asn) {
    this.asn = asn;
  }

  public NodeResult ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public NodeResult labels(Labels labels) {
    this.labels = labels;
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @Schema(description = "")
  public Labels getLabels() {
    return labels;
  }

  public void setLabels(Labels labels) {
    this.labels = labels;
  }

  public NodeResult maxRttMs(BigDecimal maxRttMs) {
    this.maxRttMs = maxRttMs;
    return this;
  }

   /**
   * Get maxRttMs
   * @return maxRttMs
  **/
  @Schema(description = "")
  public BigDecimal getMaxRttMs() {
    return maxRttMs;
  }

  public void setMaxRttMs(BigDecimal maxRttMs) {
    this.maxRttMs = maxRttMs;
  }

  public NodeResult meanRttMs(BigDecimal meanRttMs) {
    this.meanRttMs = meanRttMs;
    return this;
  }

   /**
   * Get meanRttMs
   * @return meanRttMs
  **/
  @Schema(description = "")
  public BigDecimal getMeanRttMs() {
    return meanRttMs;
  }

  public void setMeanRttMs(BigDecimal meanRttMs) {
    this.meanRttMs = meanRttMs;
  }

  public NodeResult minRttMs(BigDecimal minRttMs) {
    this.minRttMs = minRttMs;
    return this;
  }

   /**
   * Get minRttMs
   * @return minRttMs
  **/
  @Schema(description = "")
  public BigDecimal getMinRttMs() {
    return minRttMs;
  }

  public void setMinRttMs(BigDecimal minRttMs) {
    this.minRttMs = minRttMs;
  }

  public NodeResult name(String name) {
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

  public NodeResult packetCount(Integer packetCount) {
    this.packetCount = packetCount;
    return this;
  }

   /**
   * Get packetCount
   * @return packetCount
  **/
  @Schema(description = "")
  public Integer getPacketCount() {
    return packetCount;
  }

  public void setPacketCount(Integer packetCount) {
    this.packetCount = packetCount;
  }

  public NodeResult stdDevRttMs(BigDecimal stdDevRttMs) {
    this.stdDevRttMs = stdDevRttMs;
    return this;
  }

   /**
   * Get stdDevRttMs
   * @return stdDevRttMs
  **/
  @Schema(description = "")
  public BigDecimal getStdDevRttMs() {
    return stdDevRttMs;
  }

  public void setStdDevRttMs(BigDecimal stdDevRttMs) {
    this.stdDevRttMs = stdDevRttMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeResult nodeResult = (NodeResult) o;
    return Objects.equals(this.asn, nodeResult.asn) &&
        Objects.equals(this.ip, nodeResult.ip) &&
        Objects.equals(this.labels, nodeResult.labels) &&
        Objects.equals(this.maxRttMs, nodeResult.maxRttMs) &&
        Objects.equals(this.meanRttMs, nodeResult.meanRttMs) &&
        Objects.equals(this.minRttMs, nodeResult.minRttMs) &&
        Objects.equals(this.name, nodeResult.name) &&
        Objects.equals(this.packetCount, nodeResult.packetCount) &&
        Objects.equals(this.stdDevRttMs, nodeResult.stdDevRttMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asn, ip, labels, maxRttMs, meanRttMs, minRttMs, name, packetCount, stdDevRttMs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeResult {\n");
    
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    maxRttMs: ").append(toIndentedString(maxRttMs)).append("\n");
    sb.append("    meanRttMs: ").append(toIndentedString(meanRttMs)).append("\n");
    sb.append("    minRttMs: ").append(toIndentedString(minRttMs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packetCount: ").append(toIndentedString(packetCount)).append("\n");
    sb.append("    stdDevRttMs: ").append(toIndentedString(stdDevRttMs)).append("\n");
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