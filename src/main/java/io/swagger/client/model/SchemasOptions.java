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
import io.swagger.client.model.PacketType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SchemasOptions
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SchemasOptions {
  @SerializedName("max_ttl")
  private Integer maxTtl = null;

  @SerializedName("packet_type")
  private PacketType packetType = null;

  @SerializedName("packets_per_ttl")
  private Integer packetsPerTtl = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("wait_time")
  private Integer waitTime = null;

  public SchemasOptions maxTtl(Integer maxTtl) {
    this.maxTtl = maxTtl;
    return this;
  }

   /**
   * Get maxTtl
   * @return maxTtl
  **/
  @Schema(description = "")
  public Integer getMaxTtl() {
    return maxTtl;
  }

  public void setMaxTtl(Integer maxTtl) {
    this.maxTtl = maxTtl;
  }

  public SchemasOptions packetType(PacketType packetType) {
    this.packetType = packetType;
    return this;
  }

   /**
   * Get packetType
   * @return packetType
  **/
  @Schema(description = "")
  public PacketType getPacketType() {
    return packetType;
  }

  public void setPacketType(PacketType packetType) {
    this.packetType = packetType;
  }

  public SchemasOptions packetsPerTtl(Integer packetsPerTtl) {
    this.packetsPerTtl = packetsPerTtl;
    return this;
  }

   /**
   * Get packetsPerTtl
   * @return packetsPerTtl
  **/
  @Schema(description = "")
  public Integer getPacketsPerTtl() {
    return packetsPerTtl;
  }

  public void setPacketsPerTtl(Integer packetsPerTtl) {
    this.packetsPerTtl = packetsPerTtl;
  }

  public SchemasOptions port(Integer port) {
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

  public SchemasOptions waitTime(Integer waitTime) {
    this.waitTime = waitTime;
    return this;
  }

   /**
   * Get waitTime
   * @return waitTime
  **/
  @Schema(description = "")
  public Integer getWaitTime() {
    return waitTime;
  }

  public void setWaitTime(Integer waitTime) {
    this.waitTime = waitTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemasOptions schemasOptions = (SchemasOptions) o;
    return Objects.equals(this.maxTtl, schemasOptions.maxTtl) &&
        Objects.equals(this.packetType, schemasOptions.packetType) &&
        Objects.equals(this.packetsPerTtl, schemasOptions.packetsPerTtl) &&
        Objects.equals(this.port, schemasOptions.port) &&
        Objects.equals(this.waitTime, schemasOptions.waitTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxTtl, packetType, packetsPerTtl, port, waitTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasOptions {\n");
    
    sb.append("    maxTtl: ").append(toIndentedString(maxTtl)).append("\n");
    sb.append("    packetType: ").append(toIndentedString(packetType)).append("\n");
    sb.append("    packetsPerTtl: ").append(toIndentedString(packetsPerTtl)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
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