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
import io.swagger.client.model.BaseMeta;
import io.swagger.client.model.CloudflareClientAPILOCRecordData;
import io.swagger.client.model.DnsRecordComponentsSchemasBase;
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
/**
 * CloudflareClientAPILOCRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPILOCRecord extends DnsRecordComponentsSchemasBase implements DnsRecord {
  @SerializedName("content")
  private String cloudflareClientAPILOCRecordContent = null;

  @SerializedName("data")
  private CloudflareClientAPILOCRecordData cloudflareClientAPILOCRecordData = null;

  @SerializedName("name")
  private String cloudflareClientAPILOCRecordName = null;

  @SerializedName("type")
  private String cloudflareClientAPILOCRecordType = null;

   /**
   * Formatted LOC content. See &#x27;data&#x27; to set LOC properties.
   * @return cloudflareClientAPILOCRecordContent
  **/
  @Schema(example = "IN LOC 37 46 46 N 122 23 35 W 0m 100m 0m 0m", description = "Formatted LOC content. See 'data' to set LOC properties.")
  public String getCloudflareClientAPILOCRecordContent() {
    return cloudflareClientAPILOCRecordContent;
  }

  public CloudflareClientAPILOCRecord cloudflareClientAPILOCRecordData(CloudflareClientAPILOCRecordData cloudflareClientAPILOCRecordData) {
    this.cloudflareClientAPILOCRecordData = cloudflareClientAPILOCRecordData;
    return this;
  }

   /**
   * Get cloudflareClientAPILOCRecordData
   * @return cloudflareClientAPILOCRecordData
  **/
  @Schema(required = true, description = "")
  public CloudflareClientAPILOCRecordData getCloudflareClientAPILOCRecordData() {
    return cloudflareClientAPILOCRecordData;
  }

  public void setCloudflareClientAPILOCRecordData(CloudflareClientAPILOCRecordData cloudflareClientAPILOCRecordData) {
    this.cloudflareClientAPILOCRecordData = cloudflareClientAPILOCRecordData;
  }

  public CloudflareClientAPILOCRecord cloudflareClientAPILOCRecordName(String cloudflareClientAPILOCRecordName) {
    this.cloudflareClientAPILOCRecordName = cloudflareClientAPILOCRecordName;
    return this;
  }

   /**
   * Get cloudflareClientAPILOCRecordName
   * @return cloudflareClientAPILOCRecordName
  **/
  @Schema(required = true, description = "")
  public String getCloudflareClientAPILOCRecordName() {
    return cloudflareClientAPILOCRecordName;
  }

  public void setCloudflareClientAPILOCRecordName(String cloudflareClientAPILOCRecordName) {
    this.cloudflareClientAPILOCRecordName = cloudflareClientAPILOCRecordName;
  }

  public CloudflareClientAPILOCRecord cloudflareClientAPILOCRecordType(String cloudflareClientAPILOCRecordType) {
    this.cloudflareClientAPILOCRecordType = cloudflareClientAPILOCRecordType;
    return this;
  }

   /**
   * Record type.
   * @return cloudflareClientAPILOCRecordType
  **/
  @Schema(example = "LOC", required = true, description = "Record type.")
  public String getCloudflareClientAPILOCRecordType() {
    return cloudflareClientAPILOCRecordType;
  }

  public void setCloudflareClientAPILOCRecordType(String cloudflareClientAPILOCRecordType) {
    this.cloudflareClientAPILOCRecordType = cloudflareClientAPILOCRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPILOCRecord cloudflareClientAPILOCRecord = (CloudflareClientAPILOCRecord) o;
    return Objects.equals(this.cloudflareClientAPILOCRecordContent, cloudflareClientAPILOCRecord.cloudflareClientAPILOCRecordContent) &&
        Objects.equals(this.cloudflareClientAPILOCRecordData, cloudflareClientAPILOCRecord.cloudflareClientAPILOCRecordData) &&
        Objects.equals(this.cloudflareClientAPILOCRecordName, cloudflareClientAPILOCRecord.cloudflareClientAPILOCRecordName) &&
        Objects.equals(this.cloudflareClientAPILOCRecordType, cloudflareClientAPILOCRecord.cloudflareClientAPILOCRecordType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudflareClientAPILOCRecordContent, cloudflareClientAPILOCRecordData, cloudflareClientAPILOCRecordName, cloudflareClientAPILOCRecordType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPILOCRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cloudflareClientAPILOCRecordContent: ").append(toIndentedString(cloudflareClientAPILOCRecordContent)).append("\n");
    sb.append("    cloudflareClientAPILOCRecordData: ").append(toIndentedString(cloudflareClientAPILOCRecordData)).append("\n");
    sb.append("    cloudflareClientAPILOCRecordName: ").append(toIndentedString(cloudflareClientAPILOCRecordName)).append("\n");
    sb.append("    cloudflareClientAPILOCRecordType: ").append(toIndentedString(cloudflareClientAPILOCRecordType)).append("\n");
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