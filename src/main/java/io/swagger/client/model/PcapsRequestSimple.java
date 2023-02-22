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
import io.swagger.client.model.PcapsFilterV1;
import io.swagger.client.model.PcapsSystem;
import io.swagger.client.model.PcapsType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * PcapsRequestSimple
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class PcapsRequestSimple implements PcapsRequestPcap {
  @SerializedName("filter_v1")
  private PcapsFilterV1 filterV1 = null;

  @SerializedName("packet_limit")
  private BigDecimal packetLimit = null;

  @SerializedName("system")
  private PcapsSystem system = null;

  @SerializedName("time_limit")
  private BigDecimal timeLimit = null;

  @SerializedName("type")
  private PcapsType type = null;

  public PcapsRequestSimple filterV1(PcapsFilterV1 filterV1) {
    this.filterV1 = filterV1;
    return this;
  }

   /**
   * Get filterV1
   * @return filterV1
  **/
  @Schema(description = "")
  public PcapsFilterV1 getFilterV1() {
    return filterV1;
  }

  public void setFilterV1(PcapsFilterV1 filterV1) {
    this.filterV1 = filterV1;
  }

  public PcapsRequestSimple packetLimit(BigDecimal packetLimit) {
    this.packetLimit = packetLimit;
    return this;
  }

   /**
   * Get packetLimit
   * @return packetLimit
  **/
  @Schema(required = true, description = "")
  public BigDecimal getPacketLimit() {
    return packetLimit;
  }

  public void setPacketLimit(BigDecimal packetLimit) {
    this.packetLimit = packetLimit;
  }

  public PcapsRequestSimple system(PcapsSystem system) {
    this.system = system;
    return this;
  }

   /**
   * Get system
   * @return system
  **/
  @Schema(required = true, description = "")
  public PcapsSystem getSystem() {
    return system;
  }

  public void setSystem(PcapsSystem system) {
    this.system = system;
  }

  public PcapsRequestSimple timeLimit(BigDecimal timeLimit) {
    this.timeLimit = timeLimit;
    return this;
  }

   /**
   * Get timeLimit
   * @return timeLimit
  **/
  @Schema(required = true, description = "")
  public BigDecimal getTimeLimit() {
    return timeLimit;
  }

  public void setTimeLimit(BigDecimal timeLimit) {
    this.timeLimit = timeLimit;
  }

  public PcapsRequestSimple type(PcapsType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public PcapsType getType() {
    return type;
  }

  public void setType(PcapsType type) {
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
    PcapsRequestSimple pcapsRequestSimple = (PcapsRequestSimple) o;
    return Objects.equals(this.filterV1, pcapsRequestSimple.filterV1) &&
        Objects.equals(this.packetLimit, pcapsRequestSimple.packetLimit) &&
        Objects.equals(this.system, pcapsRequestSimple.system) &&
        Objects.equals(this.timeLimit, pcapsRequestSimple.timeLimit) &&
        Objects.equals(this.type, pcapsRequestSimple.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterV1, packetLimit, system, timeLimit, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PcapsRequestSimple {\n");
    
    sb.append("    filterV1: ").append(toIndentedString(filterV1)).append("\n");
    sb.append("    packetLimit: ").append(toIndentedString(packetLimit)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    timeLimit: ").append(toIndentedString(timeLimit)).append("\n");
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