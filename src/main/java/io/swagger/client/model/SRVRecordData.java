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
import java.math.BigDecimal;
/**
 * Components of a SRV record.
 */
@Schema(description = "Components of a SRV record.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T13:40:27.702461541+09:00[Asia/Tokyo]")
public class SRVRecordData {
  @SerializedName("name")
  private String name = null;

  @SerializedName("port")
  private BigDecimal port = null;

  @SerializedName("priority")
  private BigDecimal priority = null;

  @SerializedName("proto")
  private String proto = null;

  @SerializedName("service")
  private String service = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("weight")
  private BigDecimal weight = null;

  public SRVRecordData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A valid hostname.
   * @return name
  **/
  @Schema(example = "example.com", description = "A valid hostname.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SRVRecordData port(BigDecimal port) {
    this.port = port;
    return this;
  }

   /**
   * The port of the service.
   * minimum: 0
   * maximum: 65535
   * @return port
  **/
  @Schema(example = "8806", description = "The port of the service.")
  public BigDecimal getPort() {
    return port;
  }

  public void setPort(BigDecimal port) {
    this.port = port;
  }

  public SRVRecordData priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public BigDecimal getPriority() {
    return priority;
  }

  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }

  public SRVRecordData proto(String proto) {
    this.proto = proto;
    return this;
  }

   /**
   * A valid protocol.
   * @return proto
  **/
  @Schema(example = "_tcp", description = "A valid protocol.")
  public String getProto() {
    return proto;
  }

  public void setProto(String proto) {
    this.proto = proto;
  }

  public SRVRecordData service(String service) {
    this.service = service;
    return this;
  }

   /**
   * A service type, prefixed with an underscore.
   * @return service
  **/
  @Schema(example = "_sip", description = "A service type, prefixed with an underscore.")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public SRVRecordData target(String target) {
    this.target = target;
    return this;
  }

   /**
   * A valid hostname.
   * @return target
  **/
  @Schema(example = "example.com", description = "A valid hostname.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public SRVRecordData weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The record weight.
   * minimum: 0
   * maximum: 65535
   * @return weight
  **/
  @Schema(example = "5", description = "The record weight.")
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SRVRecordData srVRecordData = (SRVRecordData) o;
    return Objects.equals(this.name, srVRecordData.name) &&
        Objects.equals(this.port, srVRecordData.port) &&
        Objects.equals(this.priority, srVRecordData.priority) &&
        Objects.equals(this.proto, srVRecordData.proto) &&
        Objects.equals(this.service, srVRecordData.service) &&
        Objects.equals(this.target, srVRecordData.target) &&
        Objects.equals(this.weight, srVRecordData.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, port, priority, proto, service, target, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SRVRecordData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    proto: ").append(toIndentedString(proto)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
