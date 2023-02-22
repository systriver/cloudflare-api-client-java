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
import io.swagger.client.model.NodeResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * HopResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class HopResult {
  @SerializedName("nodes")
  private List<NodeResult> nodes = null;

  @SerializedName("packets_lost")
  private Integer packetsLost = null;

  @SerializedName("packets_sent")
  private Integer packetsSent = null;

  @SerializedName("packets_ttl")
  private Integer packetsTtl = null;

  public HopResult nodes(List<NodeResult> nodes) {
    this.nodes = nodes;
    return this;
  }

  public HopResult addNodesItem(NodeResult nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<NodeResult>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * An array of node objects.
   * @return nodes
  **/
  @Schema(description = "An array of node objects.")
  public List<NodeResult> getNodes() {
    return nodes;
  }

  public void setNodes(List<NodeResult> nodes) {
    this.nodes = nodes;
  }

  public HopResult packetsLost(Integer packetsLost) {
    this.packetsLost = packetsLost;
    return this;
  }

   /**
   * Get packetsLost
   * @return packetsLost
  **/
  @Schema(description = "")
  public Integer getPacketsLost() {
    return packetsLost;
  }

  public void setPacketsLost(Integer packetsLost) {
    this.packetsLost = packetsLost;
  }

  public HopResult packetsSent(Integer packetsSent) {
    this.packetsSent = packetsSent;
    return this;
  }

   /**
   * Get packetsSent
   * @return packetsSent
  **/
  @Schema(description = "")
  public Integer getPacketsSent() {
    return packetsSent;
  }

  public void setPacketsSent(Integer packetsSent) {
    this.packetsSent = packetsSent;
  }

  public HopResult packetsTtl(Integer packetsTtl) {
    this.packetsTtl = packetsTtl;
    return this;
  }

   /**
   * Get packetsTtl
   * @return packetsTtl
  **/
  @Schema(description = "")
  public Integer getPacketsTtl() {
    return packetsTtl;
  }

  public void setPacketsTtl(Integer packetsTtl) {
    this.packetsTtl = packetsTtl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HopResult hopResult = (HopResult) o;
    return Objects.equals(this.nodes, hopResult.nodes) &&
        Objects.equals(this.packetsLost, hopResult.packetsLost) &&
        Objects.equals(this.packetsSent, hopResult.packetsSent) &&
        Objects.equals(this.packetsTtl, hopResult.packetsTtl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, packetsLost, packetsSent, packetsTtl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HopResult {\n");
    
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    packetsLost: ").append(toIndentedString(packetsLost)).append("\n");
    sb.append("    packetsSent: ").append(toIndentedString(packetsSent)).append("\n");
    sb.append("    packetsTtl: ").append(toIndentedString(packetsTtl)).append("\n");
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