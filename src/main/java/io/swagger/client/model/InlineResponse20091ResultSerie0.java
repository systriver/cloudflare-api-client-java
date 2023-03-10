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
 * InlineResponse20091ResultSerie0
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20091ResultSerie0 {
  @SerializedName("TLS 1.0")
  private List<String> tlS10 = new ArrayList<String>();

  @SerializedName("TLS 1.1")
  private List<String> tlS11 = new ArrayList<String>();

  @SerializedName("TLS 1.2")
  private List<String> tlS12 = new ArrayList<String>();

  @SerializedName("TLS 1.3")
  private List<String> tlS13 = new ArrayList<String>();

  @SerializedName("TLS QUIC")
  private List<String> TLS_QUIC = new ArrayList<String>();

  @SerializedName("timestamps")
  private List<String> timestamps = new ArrayList<String>();

  public InlineResponse20091ResultSerie0 tlS10(List<String> tlS10) {
    this.tlS10 = tlS10;
    return this;
  }

  public InlineResponse20091ResultSerie0 addTlS10Item(String tlS10Item) {
    this.tlS10.add(tlS10Item);
    return this;
  }

   /**
   * Get tlS10
   * @return tlS10
  **/
  @Schema(required = true, description = "")
  public List<String> getTlS10() {
    return tlS10;
  }

  public void setTlS10(List<String> tlS10) {
    this.tlS10 = tlS10;
  }

  public InlineResponse20091ResultSerie0 tlS11(List<String> tlS11) {
    this.tlS11 = tlS11;
    return this;
  }

  public InlineResponse20091ResultSerie0 addTlS11Item(String tlS11Item) {
    this.tlS11.add(tlS11Item);
    return this;
  }

   /**
   * Get tlS11
   * @return tlS11
  **/
  @Schema(required = true, description = "")
  public List<String> getTlS11() {
    return tlS11;
  }

  public void setTlS11(List<String> tlS11) {
    this.tlS11 = tlS11;
  }

  public InlineResponse20091ResultSerie0 tlS12(List<String> tlS12) {
    this.tlS12 = tlS12;
    return this;
  }

  public InlineResponse20091ResultSerie0 addTlS12Item(String tlS12Item) {
    this.tlS12.add(tlS12Item);
    return this;
  }

   /**
   * Get tlS12
   * @return tlS12
  **/
  @Schema(required = true, description = "")
  public List<String> getTlS12() {
    return tlS12;
  }

  public void setTlS12(List<String> tlS12) {
    this.tlS12 = tlS12;
  }

  public InlineResponse20091ResultSerie0 tlS13(List<String> tlS13) {
    this.tlS13 = tlS13;
    return this;
  }

  public InlineResponse20091ResultSerie0 addTlS13Item(String tlS13Item) {
    this.tlS13.add(tlS13Item);
    return this;
  }

   /**
   * Get tlS13
   * @return tlS13
  **/
  @Schema(required = true, description = "")
  public List<String> getTlS13() {
    return tlS13;
  }

  public void setTlS13(List<String> tlS13) {
    this.tlS13 = tlS13;
  }

  public InlineResponse20091ResultSerie0 TLS_QUIC(List<String> TLS_QUIC) {
    this.TLS_QUIC = TLS_QUIC;
    return this;
  }

  public InlineResponse20091ResultSerie0 addTLSQUICItem(String TLS_QUICItem) {
    this.TLS_QUIC.add(TLS_QUICItem);
    return this;
  }

   /**
   * Get TLS_QUIC
   * @return TLS_QUIC
  **/
  @Schema(required = true, description = "")
  public List<String> getTLSQUIC() {
    return TLS_QUIC;
  }

  public void setTLSQUIC(List<String> TLS_QUIC) {
    this.TLS_QUIC = TLS_QUIC;
  }

  public InlineResponse20091ResultSerie0 timestamps(List<String> timestamps) {
    this.timestamps = timestamps;
    return this;
  }

  public InlineResponse20091ResultSerie0 addTimestampsItem(String timestampsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20091ResultSerie0 inlineResponse20091ResultSerie0 = (InlineResponse20091ResultSerie0) o;
    return Objects.equals(this.tlS10, inlineResponse20091ResultSerie0.tlS10) &&
        Objects.equals(this.tlS11, inlineResponse20091ResultSerie0.tlS11) &&
        Objects.equals(this.tlS12, inlineResponse20091ResultSerie0.tlS12) &&
        Objects.equals(this.tlS13, inlineResponse20091ResultSerie0.tlS13) &&
        Objects.equals(this.TLS_QUIC, inlineResponse20091ResultSerie0.TLS_QUIC) &&
        Objects.equals(this.timestamps, inlineResponse20091ResultSerie0.timestamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tlS10, tlS11, tlS12, tlS13, TLS_QUIC, timestamps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20091ResultSerie0 {\n");
    
    sb.append("    tlS10: ").append(toIndentedString(tlS10)).append("\n");
    sb.append("    tlS11: ").append(toIndentedString(tlS11)).append("\n");
    sb.append("    tlS12: ").append(toIndentedString(tlS12)).append("\n");
    sb.append("    tlS13: ").append(toIndentedString(tlS13)).append("\n");
    sb.append("    TLS_QUIC: ").append(toIndentedString(TLS_QUIC)).append("\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
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
