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
 * Components of a DNSKEY record.
 */
@Schema(description = "Components of a DNSKEY record.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPIDNSKEYRecordData {
  @SerializedName("algorithm")
  private BigDecimal algorithm = null;

  @SerializedName("flags")
  private BigDecimal flags = null;

  @SerializedName("protocol")
  private BigDecimal protocol = null;

  @SerializedName("public_key")
  private String publicKey = null;

  public CloudflareClientAPIDNSKEYRecordData algorithm(BigDecimal algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Algorithm.
   * minimum: 0
   * maximum: 255
   * @return algorithm
  **/
  @Schema(example = "5", description = "Algorithm.")
  public BigDecimal getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(BigDecimal algorithm) {
    this.algorithm = algorithm;
  }

  public CloudflareClientAPIDNSKEYRecordData flags(BigDecimal flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Flags.
   * minimum: 0
   * maximum: 65535
   * @return flags
  **/
  @Schema(example = "1", description = "Flags.")
  public BigDecimal getFlags() {
    return flags;
  }

  public void setFlags(BigDecimal flags) {
    this.flags = flags;
  }

  public CloudflareClientAPIDNSKEYRecordData protocol(BigDecimal protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Protocol.
   * minimum: 0
   * maximum: 255
   * @return protocol
  **/
  @Schema(example = "3", description = "Protocol.")
  public BigDecimal getProtocol() {
    return protocol;
  }

  public void setProtocol(BigDecimal protocol) {
    this.protocol = protocol;
  }

  public CloudflareClientAPIDNSKEYRecordData publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Public Key.
   * @return publicKey
  **/
  @Schema(description = "Public Key.")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPIDNSKEYRecordData cloudflareClientAPIDNSKEYRecordData = (CloudflareClientAPIDNSKEYRecordData) o;
    return Objects.equals(this.algorithm, cloudflareClientAPIDNSKEYRecordData.algorithm) &&
        Objects.equals(this.flags, cloudflareClientAPIDNSKEYRecordData.flags) &&
        Objects.equals(this.protocol, cloudflareClientAPIDNSKEYRecordData.protocol) &&
        Objects.equals(this.publicKey, cloudflareClientAPIDNSKEYRecordData.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, flags, protocol, publicKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIDNSKEYRecordData {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
