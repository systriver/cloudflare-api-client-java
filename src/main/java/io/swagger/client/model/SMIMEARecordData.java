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
 * Components of a SMIMEA record.
 */
@Schema(description = "Components of a SMIMEA record.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T13:40:27.702461541+09:00[Asia/Tokyo]")
public class SMIMEARecordData {
  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("matching_type")
  private BigDecimal matchingType = null;

  @SerializedName("selector")
  private BigDecimal selector = null;

  @SerializedName("usage")
  private BigDecimal usage = null;

  public SMIMEARecordData certificate(String certificate) {
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

  public SMIMEARecordData matchingType(BigDecimal matchingType) {
    this.matchingType = matchingType;
    return this;
  }

   /**
   * Matching Type.
   * minimum: 0
   * maximum: 255
   * @return matchingType
  **/
  @Schema(example = "0", description = "Matching Type.")
  public BigDecimal getMatchingType() {
    return matchingType;
  }

  public void setMatchingType(BigDecimal matchingType) {
    this.matchingType = matchingType;
  }

  public SMIMEARecordData selector(BigDecimal selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Selector.
   * minimum: 0
   * maximum: 255
   * @return selector
  **/
  @Schema(example = "0", description = "Selector.")
  public BigDecimal getSelector() {
    return selector;
  }

  public void setSelector(BigDecimal selector) {
    this.selector = selector;
  }

  public SMIMEARecordData usage(BigDecimal usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Usage.
   * minimum: 0
   * maximum: 255
   * @return usage
  **/
  @Schema(example = "3", description = "Usage.")
  public BigDecimal getUsage() {
    return usage;
  }

  public void setUsage(BigDecimal usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMIMEARecordData smIMEARecordData = (SMIMEARecordData) o;
    return Objects.equals(this.certificate, smIMEARecordData.certificate) &&
        Objects.equals(this.matchingType, smIMEARecordData.matchingType) &&
        Objects.equals(this.selector, smIMEARecordData.selector) &&
        Objects.equals(this.usage, smIMEARecordData.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, matchingType, selector, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMIMEARecordData {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    matchingType: ").append(toIndentedString(matchingType)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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