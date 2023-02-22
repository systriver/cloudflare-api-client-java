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
import io.swagger.client.model.SchemasVirtualNetworkId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NetworkIpNetworkEncodedBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class NetworkIpNetworkEncodedBody {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("tunnel_id")
  private String tunnelId = null;

  @SerializedName("virtual_network_id")
  private SchemasVirtualNetworkId virtualNetworkId = null;

  public NetworkIpNetworkEncodedBody comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @Schema(description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public NetworkIpNetworkEncodedBody tunnelId(String tunnelId) {
    this.tunnelId = tunnelId;
    return this;
  }

   /**
   * Get tunnelId
   * @return tunnelId
  **/
  @Schema(required = true, description = "")
  public String getTunnelId() {
    return tunnelId;
  }

  public void setTunnelId(String tunnelId) {
    this.tunnelId = tunnelId;
  }

  public NetworkIpNetworkEncodedBody virtualNetworkId(SchemasVirtualNetworkId virtualNetworkId) {
    this.virtualNetworkId = virtualNetworkId;
    return this;
  }

   /**
   * Get virtualNetworkId
   * @return virtualNetworkId
  **/
  @Schema(description = "")
  public SchemasVirtualNetworkId getVirtualNetworkId() {
    return virtualNetworkId;
  }

  public void setVirtualNetworkId(SchemasVirtualNetworkId virtualNetworkId) {
    this.virtualNetworkId = virtualNetworkId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkIpNetworkEncodedBody networkIpNetworkEncodedBody = (NetworkIpNetworkEncodedBody) o;
    return Objects.equals(this.comment, networkIpNetworkEncodedBody.comment) &&
        Objects.equals(this.tunnelId, networkIpNetworkEncodedBody.tunnelId) &&
        Objects.equals(this.virtualNetworkId, networkIpNetworkEncodedBody.virtualNetworkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, tunnelId, virtualNetworkId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkIpNetworkEncodedBody {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    tunnelId: ").append(toIndentedString(tunnelId)).append("\n");
    sb.append("    virtualNetworkId: ").append(toIndentedString(virtualNetworkId)).append("\n");
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