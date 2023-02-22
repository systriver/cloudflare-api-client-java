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
import io.swagger.client.model.Base;
import io.swagger.client.model.BaseMeta;
import io.swagger.client.model.CloudflareClientAPIDNSKEYRecordData;
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
/**
 * DNSKEYRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DNSKEYRecord extends Base {
  @SerializedName("content")
  private String dnSKEYRecordContent = null;

  @SerializedName("data")
  private CloudflareClientAPIDNSKEYRecordData dnSKEYRecordData = null;

  @SerializedName("name")
  private String dnSKEYRecordName = null;

  @SerializedName("type")
  private String dnSKEYRecordType = null;

   /**
   * Formatted DNSKEY content. See &#x27;data&#x27; to set DNSKEY properties.
   * @return dnSKEYRecordContent
  **/
  @Schema(description = "Formatted DNSKEY content. See 'data' to set DNSKEY properties.")
  public String getDnSKEYRecordContent() {
    return dnSKEYRecordContent;
  }

  public DNSKEYRecord dnSKEYRecordData(CloudflareClientAPIDNSKEYRecordData dnSKEYRecordData) {
    this.dnSKEYRecordData = dnSKEYRecordData;
    return this;
  }

   /**
   * Get dnSKEYRecordData
   * @return dnSKEYRecordData
  **/
  @Schema(required = true, description = "")
  public CloudflareClientAPIDNSKEYRecordData getDnSKEYRecordData() {
    return dnSKEYRecordData;
  }

  public void setDnSKEYRecordData(CloudflareClientAPIDNSKEYRecordData dnSKEYRecordData) {
    this.dnSKEYRecordData = dnSKEYRecordData;
  }

  public DNSKEYRecord dnSKEYRecordName(String dnSKEYRecordName) {
    this.dnSKEYRecordName = dnSKEYRecordName;
    return this;
  }

   /**
   * Get dnSKEYRecordName
   * @return dnSKEYRecordName
  **/
  @Schema(required = true, description = "")
  public String getDnSKEYRecordName() {
    return dnSKEYRecordName;
  }

  public void setDnSKEYRecordName(String dnSKEYRecordName) {
    this.dnSKEYRecordName = dnSKEYRecordName;
  }

  public DNSKEYRecord dnSKEYRecordType(String dnSKEYRecordType) {
    this.dnSKEYRecordType = dnSKEYRecordType;
    return this;
  }

   /**
   * Record type.
   * @return dnSKEYRecordType
  **/
  @Schema(example = "DNSKEY", required = true, description = "Record type.")
  public String getDnSKEYRecordType() {
    return dnSKEYRecordType;
  }

  public void setDnSKEYRecordType(String dnSKEYRecordType) {
    this.dnSKEYRecordType = dnSKEYRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSKEYRecord dnSKEYRecord = (DNSKEYRecord) o;
    return Objects.equals(this.dnSKEYRecordContent, dnSKEYRecord.dnSKEYRecordContent) &&
        Objects.equals(this.dnSKEYRecordData, dnSKEYRecord.dnSKEYRecordData) &&
        Objects.equals(this.dnSKEYRecordName, dnSKEYRecord.dnSKEYRecordName) &&
        Objects.equals(this.dnSKEYRecordType, dnSKEYRecord.dnSKEYRecordType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnSKEYRecordContent, dnSKEYRecordData, dnSKEYRecordName, dnSKEYRecordType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSKEYRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dnSKEYRecordContent: ").append(toIndentedString(dnSKEYRecordContent)).append("\n");
    sb.append("    dnSKEYRecordData: ").append(toIndentedString(dnSKEYRecordData)).append("\n");
    sb.append("    dnSKEYRecordName: ").append(toIndentedString(dnSKEYRecordName)).append("\n");
    sb.append("    dnSKEYRecordType: ").append(toIndentedString(dnSKEYRecordType)).append("\n");
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