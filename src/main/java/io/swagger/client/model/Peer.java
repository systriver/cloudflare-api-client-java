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
import io.swagger.client.model.ComponentsSchemasIdentifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * Peer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Peer {
  @SerializedName("id")
  private ComponentsSchemasIdentifier id = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("ixfr_enable")
  private Boolean ixfrEnable = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("port")
  private BigDecimal port = null;

  @SerializedName("tsig_id")
  private String tsigId = null;

  public Peer id(ComponentsSchemasIdentifier id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public ComponentsSchemasIdentifier getId() {
    return id;
  }

  public void setId(ComponentsSchemasIdentifier id) {
    this.id = id;
  }

  public Peer ip(String ip) {
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

  public Peer ixfrEnable(Boolean ixfrEnable) {
    this.ixfrEnable = ixfrEnable;
    return this;
  }

   /**
   * Get ixfrEnable
   * @return ixfrEnable
  **/
  @Schema(description = "")
  public Boolean getIxfrEnable() {
    return ixfrEnable;
  }

  public void setIxfrEnable(Boolean ixfrEnable) {
    this.ixfrEnable = ixfrEnable;
  }

  public Peer name(String name) {
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

  public Peer port(BigDecimal port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public BigDecimal getPort() {
    return port;
  }

  public void setPort(BigDecimal port) {
    this.port = port;
  }

  public Peer tsigId(String tsigId) {
    this.tsigId = tsigId;
    return this;
  }

   /**
   * Get tsigId
   * @return tsigId
  **/
  @Schema(description = "")
  public String getTsigId() {
    return tsigId;
  }

  public void setTsigId(String tsigId) {
    this.tsigId = tsigId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Peer peer = (Peer) o;
    return Objects.equals(this.id, peer.id) &&
        Objects.equals(this.ip, peer.ip) &&
        Objects.equals(this.ixfrEnable, peer.ixfrEnable) &&
        Objects.equals(this.name, peer.name) &&
        Objects.equals(this.port, peer.port) &&
        Objects.equals(this.tsigId, peer.tsigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ip, ixfrEnable, name, port, tsigId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Peer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    ixfrEnable: ").append(toIndentedString(ixfrEnable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    tsigId: ").append(toIndentedString(tsigId)).append("\n");
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