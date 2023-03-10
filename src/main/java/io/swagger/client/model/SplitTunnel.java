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
 * SplitTunnel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SplitTunnel {
  @SerializedName("address")
  private String address = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("host")
  private String host = null;

  public SplitTunnel address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The address in CIDR format to exclude from the tunnel. If address is present, host must not be present.
   * @return address
  **/
  @Schema(example = "192.0.2.0/24", required = true, description = "The address in CIDR format to exclude from the tunnel. If address is present, host must not be present.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public SplitTunnel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the split tunnel item, displayed in the client UI.
   * @return description
  **/
  @Schema(example = "Exclude testing domains from the tunnel", required = true, description = "A description of the split tunnel item, displayed in the client UI.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SplitTunnel host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The domain name to exclude from the tunnel. If host is present, address must not be present.
   * @return host
  **/
  @Schema(example = "*.example.com", description = "The domain name to exclude from the tunnel. If host is present, address must not be present.")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTunnel splitTunnel = (SplitTunnel) o;
    return Objects.equals(this.address, splitTunnel.address) &&
        Objects.equals(this.description, splitTunnel.description) &&
        Objects.equals(this.host, splitTunnel.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, description, host);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitTunnel {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
