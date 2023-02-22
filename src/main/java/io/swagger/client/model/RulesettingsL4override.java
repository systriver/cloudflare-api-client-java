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
/**
 * Send matching traffic to the supplied destination IP address and port.
 */
@Schema(description = "Send matching traffic to the supplied destination IP address and port.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class RulesettingsL4override {
  @SerializedName("ip")
  private String ip = null;

  @SerializedName("port")
  private Integer port = null;

  public RulesettingsL4override ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IPv4 or IPv6 address.
   * @return ip
  **/
  @Schema(example = "1.1.1.1", description = "IPv4 or IPv6 address.")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public RulesettingsL4override port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * A port number to use for TCP/UDP overrides.
   * @return port
  **/
  @Schema(description = "A port number to use for TCP/UDP overrides.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulesettingsL4override rulesettingsL4override = (RulesettingsL4override) o;
    return Objects.equals(this.ip, rulesettingsL4override.ip) &&
        Objects.equals(this.port, rulesettingsL4override.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesettingsL4override {\n");
    
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
