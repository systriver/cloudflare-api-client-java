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
import io.swagger.client.model.SchemasTunnelId;
import io.swagger.client.model.SchemasTunnelName;
import io.swagger.client.model.SchemasVirtualNetworkId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Teamnet
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Teamnet {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("created_at")
  private Object createdAt = null;

  @SerializedName("deleted_at")
  private OffsetDateTime deletedAt = null;

  @SerializedName("network")
  private String network = null;

  @SerializedName("tunnel_id")
  private SchemasTunnelId tunnelId = null;

  @SerializedName("tunnel_name")
  private SchemasTunnelName tunnelName = null;

  @SerializedName("virtual_network_id")
  private SchemasVirtualNetworkId virtualNetworkId = null;

  public Teamnet comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @Schema(required = true, description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Teamnet createdAt(Object createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the route was created.
   * @return createdAt
  **/
  @Schema(required = true, description = "Timestamp of when the route was created.")
  public Object getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Object createdAt) {
    this.createdAt = createdAt;
  }

   /**
   * Timestamp of when the route was deleted. If &#x60;null&#x60;, the route has not been deleted.
   * @return deletedAt
  **/
  @Schema(example = "2021-01-25T18:22:34.317854Z", description = "Timestamp of when the route was deleted. If `null`, the route has not been deleted.")
  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }

  public Teamnet network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @Schema(required = true, description = "")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public Teamnet tunnelId(SchemasTunnelId tunnelId) {
    this.tunnelId = tunnelId;
    return this;
  }

   /**
   * Get tunnelId
   * @return tunnelId
  **/
  @Schema(required = true, description = "")
  public SchemasTunnelId getTunnelId() {
    return tunnelId;
  }

  public void setTunnelId(SchemasTunnelId tunnelId) {
    this.tunnelId = tunnelId;
  }

  public Teamnet tunnelName(SchemasTunnelName tunnelName) {
    this.tunnelName = tunnelName;
    return this;
  }

   /**
   * Get tunnelName
   * @return tunnelName
  **/
  @Schema(description = "")
  public SchemasTunnelName getTunnelName() {
    return tunnelName;
  }

  public void setTunnelName(SchemasTunnelName tunnelName) {
    this.tunnelName = tunnelName;
  }

  public Teamnet virtualNetworkId(SchemasVirtualNetworkId virtualNetworkId) {
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
    Teamnet teamnet = (Teamnet) o;
    return Objects.equals(this.comment, teamnet.comment) &&
        Objects.equals(this.createdAt, teamnet.createdAt) &&
        Objects.equals(this.deletedAt, teamnet.deletedAt) &&
        Objects.equals(this.network, teamnet.network) &&
        Objects.equals(this.tunnelId, teamnet.tunnelId) &&
        Objects.equals(this.tunnelName, teamnet.tunnelName) &&
        Objects.equals(this.virtualNetworkId, teamnet.virtualNetworkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, createdAt, deletedAt, network, tunnelId, tunnelName, virtualNetworkId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Teamnet {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    tunnelId: ").append(toIndentedString(tunnelId)).append("\n");
    sb.append("    tunnelName: ").append(toIndentedString(tunnelName)).append("\n");
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