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
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20049ResultSerie0
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20049ResultSerie0 {
  @SerializedName("gre")
  private List<String> gre = new ArrayList<String>();

  @SerializedName("icmp")
  private List<String> icmp = new ArrayList<String>();

  @SerializedName("tcp")
  private List<String> tcp = new ArrayList<String>();

  @SerializedName("timestamps")
  private List<String> timestamps = new ArrayList<String>();

  @SerializedName("udp")
  private List<String> udp = new ArrayList<String>();

  public InlineResponse20049ResultSerie0 gre(List<String> gre) {
    this.gre = gre;
    return this;
  }

  public InlineResponse20049ResultSerie0 addGreItem(String greItem) {
    this.gre.add(greItem);
    return this;
  }

   /**
   * Get gre
   * @return gre
  **/
  @Schema(required = true, description = "")
  public List<String> getGre() {
    return gre;
  }

  public void setGre(List<String> gre) {
    this.gre = gre;
  }

  public InlineResponse20049ResultSerie0 icmp(List<String> icmp) {
    this.icmp = icmp;
    return this;
  }

  public InlineResponse20049ResultSerie0 addIcmpItem(String icmpItem) {
    this.icmp.add(icmpItem);
    return this;
  }

   /**
   * Get icmp
   * @return icmp
  **/
  @Schema(required = true, description = "")
  public List<String> getIcmp() {
    return icmp;
  }

  public void setIcmp(List<String> icmp) {
    this.icmp = icmp;
  }

  public InlineResponse20049ResultSerie0 tcp(List<String> tcp) {
    this.tcp = tcp;
    return this;
  }

  public InlineResponse20049ResultSerie0 addTcpItem(String tcpItem) {
    this.tcp.add(tcpItem);
    return this;
  }

   /**
   * Get tcp
   * @return tcp
  **/
  @Schema(required = true, description = "")
  public List<String> getTcp() {
    return tcp;
  }

  public void setTcp(List<String> tcp) {
    this.tcp = tcp;
  }

  public InlineResponse20049ResultSerie0 timestamps(List<String> timestamps) {
    this.timestamps = timestamps;
    return this;
  }

  public InlineResponse20049ResultSerie0 addTimestampsItem(String timestampsItem) {
    this.timestamps.add(timestampsItem);
    return this;
  }

   /**
   * Get timestamps
   * @return timestamps
  **/
  @Schema(required = true, description = "")
  public List<String> getTimestamps() {
    return timestamps;
  }

  public void setTimestamps(List<String> timestamps) {
    this.timestamps = timestamps;
  }

  public InlineResponse20049ResultSerie0 udp(List<String> udp) {
    this.udp = udp;
    return this;
  }

  public InlineResponse20049ResultSerie0 addUdpItem(String udpItem) {
    this.udp.add(udpItem);
    return this;
  }

   /**
   * Get udp
   * @return udp
  **/
  @Schema(required = true, description = "")
  public List<String> getUdp() {
    return udp;
  }

  public void setUdp(List<String> udp) {
    this.udp = udp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20049ResultSerie0 inlineResponse20049ResultSerie0 = (InlineResponse20049ResultSerie0) o;
    return Objects.equals(this.gre, inlineResponse20049ResultSerie0.gre) &&
        Objects.equals(this.icmp, inlineResponse20049ResultSerie0.icmp) &&
        Objects.equals(this.tcp, inlineResponse20049ResultSerie0.tcp) &&
        Objects.equals(this.timestamps, inlineResponse20049ResultSerie0.timestamps) &&
        Objects.equals(this.udp, inlineResponse20049ResultSerie0.udp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gre, icmp, tcp, timestamps, udp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20049ResultSerie0 {\n");
    
    sb.append("    gre: ").append(toIndentedString(gre)).append("\n");
    sb.append("    icmp: ").append(toIndentedString(icmp)).append("\n");
    sb.append("    tcp: ").append(toIndentedString(tcp)).append("\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
    sb.append("    udp: ").append(toIndentedString(udp)).append("\n");
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
