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
 * Components of a CERT record.
 */
@Schema(description = "Components of a CERT record.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CERTRecordData {
  @SerializedName("algorithm")
  private BigDecimal algorithm = null;

  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("key_tag")
  private BigDecimal keyTag = null;

  @SerializedName("type")
  private BigDecimal type = null;

  public CERTRecordData algorithm(BigDecimal algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Algorithm.
   * minimum: 0
   * maximum: 255
   * @return algorithm
  **/
  @Schema(example = "8", description = "Algorithm.")
  public BigDecimal getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(BigDecimal algorithm) {
    this.algorithm = algorithm;
  }

  public CERTRecordData certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Certificate.
   * @return certificate
  **/
  @Schema(description = "Certificate.")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public CERTRecordData keyTag(BigDecimal keyTag) {
    this.keyTag = keyTag;
    return this;
  }

   /**
   * Key Tag.
   * minimum: 0
   * maximum: 65535
   * @return keyTag
  **/
  @Schema(example = "1", description = "Key Tag.")
  public BigDecimal getKeyTag() {
    return keyTag;
  }

  public void setKeyTag(BigDecimal keyTag) {
    this.keyTag = keyTag;
  }

  public CERTRecordData type(BigDecimal type) {
    this.type = type;
    return this;
  }

   /**
   * Type.
   * minimum: 0
   * maximum: 65535
   * @return type
  **/
  @Schema(example = "9", description = "Type.")
  public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CERTRecordData ceRTRecordData = (CERTRecordData) o;
    return Objects.equals(this.algorithm, ceRTRecordData.algorithm) &&
        Objects.equals(this.certificate, ceRTRecordData.certificate) &&
        Objects.equals(this.keyTag, ceRTRecordData.keyTag) &&
        Objects.equals(this.type, ceRTRecordData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, certificate, keyTag, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CERTRecordData {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    keyTag: ").append(toIndentedString(keyTag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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