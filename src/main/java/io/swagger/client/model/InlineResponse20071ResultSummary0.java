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
 * InlineResponse20071ResultSummary0
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T13:40:27.702461541+09:00[Asia/Tokyo]")
public class InlineResponse20071ResultSummary0 {
  @SerializedName("TLS 1.0")
  private String tlS10 = null;

  @SerializedName("TLS 1.1")
  private String tlS11 = null;

  @SerializedName("TLS 1.2")
  private String tlS12 = null;

  @SerializedName("TLS 1.3")
  private String tlS13 = null;

  @SerializedName("TLS QUIC")
  private String TLS_QUIC = null;

  public InlineResponse20071ResultSummary0 tlS10(String tlS10) {
    this.tlS10 = tlS10;
    return this;
  }

   /**
   * Get tlS10
   * @return tlS10
  **/
  @Schema(example = "0.5", required = true, description = "")
  public String getTlS10() {
    return tlS10;
  }

  public void setTlS10(String tlS10) {
    this.tlS10 = tlS10;
  }

  public InlineResponse20071ResultSummary0 tlS11(String tlS11) {
    this.tlS11 = tlS11;
    return this;
  }

   /**
   * Get tlS11
   * @return tlS11
  **/
  @Schema(example = "0.5", required = true, description = "")
  public String getTlS11() {
    return tlS11;
  }

  public void setTlS11(String tlS11) {
    this.tlS11 = tlS11;
  }

  public InlineResponse20071ResultSummary0 tlS12(String tlS12) {
    this.tlS12 = tlS12;
    return this;
  }

   /**
   * Get tlS12
   * @return tlS12
  **/
  @Schema(example = "60", required = true, description = "")
  public String getTlS12() {
    return tlS12;
  }

  public void setTlS12(String tlS12) {
    this.tlS12 = tlS12;
  }

  public InlineResponse20071ResultSummary0 tlS13(String tlS13) {
    this.tlS13 = tlS13;
    return this;
  }

   /**
   * Get tlS13
   * @return tlS13
  **/
  @Schema(example = "10", required = true, description = "")
  public String getTlS13() {
    return tlS13;
  }

  public void setTlS13(String tlS13) {
    this.tlS13 = tlS13;
  }

  public InlineResponse20071ResultSummary0 TLS_QUIC(String TLS_QUIC) {
    this.TLS_QUIC = TLS_QUIC;
    return this;
  }

   /**
   * Get TLS_QUIC
   * @return TLS_QUIC
  **/
  @Schema(example = "29", required = true, description = "")
  public String getTLSQUIC() {
    return TLS_QUIC;
  }

  public void setTLSQUIC(String TLS_QUIC) {
    this.TLS_QUIC = TLS_QUIC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20071ResultSummary0 inlineResponse20071ResultSummary0 = (InlineResponse20071ResultSummary0) o;
    return Objects.equals(this.tlS10, inlineResponse20071ResultSummary0.tlS10) &&
        Objects.equals(this.tlS11, inlineResponse20071ResultSummary0.tlS11) &&
        Objects.equals(this.tlS12, inlineResponse20071ResultSummary0.tlS12) &&
        Objects.equals(this.tlS13, inlineResponse20071ResultSummary0.tlS13) &&
        Objects.equals(this.TLS_QUIC, inlineResponse20071ResultSummary0.TLS_QUIC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tlS10, tlS11, tlS12, tlS13, TLS_QUIC);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20071ResultSummary0 {\n");
    
    sb.append("    tlS10: ").append(toIndentedString(tlS10)).append("\n");
    sb.append("    tlS11: ").append(toIndentedString(tlS11)).append("\n");
    sb.append("    tlS12: ").append(toIndentedString(tlS12)).append("\n");
    sb.append("    tlS13: ").append(toIndentedString(tlS13)).append("\n");
    sb.append("    TLS_QUIC: ").append(toIndentedString(TLS_QUIC)).append("\n");
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