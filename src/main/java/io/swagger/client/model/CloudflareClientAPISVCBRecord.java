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
import io.swagger.client.model.CloudflareClientAPISVCBRecordData;
import io.swagger.client.model.DnsRecordComponentsSchemasBase;
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
/**
 * CloudflareClientAPISVCBRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPISVCBRecord extends DnsRecordComponentsSchemasBase implements DnsRecord {
  @SerializedName("content")
  private String cloudflareClientAPISVCBRecordContent = null;

  @SerializedName("data")
  private CloudflareClientAPISVCBRecordData cloudflareClientAPISVCBRecordData = null;

  @SerializedName("name")
  private String cloudflareClientAPISVCBRecordName = null;

  @SerializedName("type")
  private String cloudflareClientAPISVCBRecordType = null;

   /**
   * Formatted SVCB content. See &#x27;data&#x27; to set SVCB properties.
   * @return cloudflareClientAPISVCBRecordContent
  **/
  @Schema(description = "Formatted SVCB content. See 'data' to set SVCB properties.")
  public String getCloudflareClientAPISVCBRecordContent() {
    return cloudflareClientAPISVCBRecordContent;
  }

  public CloudflareClientAPISVCBRecord cloudflareClientAPISVCBRecordData(CloudflareClientAPISVCBRecordData cloudflareClientAPISVCBRecordData) {
    this.cloudflareClientAPISVCBRecordData = cloudflareClientAPISVCBRecordData;
    return this;
  }

   /**
   * Get cloudflareClientAPISVCBRecordData
   * @return cloudflareClientAPISVCBRecordData
  **/
  @Schema(required = true, description = "")
  public CloudflareClientAPISVCBRecordData getCloudflareClientAPISVCBRecordData() {
    return cloudflareClientAPISVCBRecordData;
  }

  public void setCloudflareClientAPISVCBRecordData(CloudflareClientAPISVCBRecordData cloudflareClientAPISVCBRecordData) {
    this.cloudflareClientAPISVCBRecordData = cloudflareClientAPISVCBRecordData;
  }

  public CloudflareClientAPISVCBRecord cloudflareClientAPISVCBRecordName(String cloudflareClientAPISVCBRecordName) {
    this.cloudflareClientAPISVCBRecordName = cloudflareClientAPISVCBRecordName;
    return this;
  }

   /**
   * Get cloudflareClientAPISVCBRecordName
   * @return cloudflareClientAPISVCBRecordName
  **/
  @Schema(required = true, description = "")
  public String getCloudflareClientAPISVCBRecordName() {
    return cloudflareClientAPISVCBRecordName;
  }

  public void setCloudflareClientAPISVCBRecordName(String cloudflareClientAPISVCBRecordName) {
    this.cloudflareClientAPISVCBRecordName = cloudflareClientAPISVCBRecordName;
  }

  public CloudflareClientAPISVCBRecord cloudflareClientAPISVCBRecordType(String cloudflareClientAPISVCBRecordType) {
    this.cloudflareClientAPISVCBRecordType = cloudflareClientAPISVCBRecordType;
    return this;
  }

   /**
   * Record type.
   * @return cloudflareClientAPISVCBRecordType
  **/
  @Schema(example = "SVCB", required = true, description = "Record type.")
  public String getCloudflareClientAPISVCBRecordType() {
    return cloudflareClientAPISVCBRecordType;
  }

  public void setCloudflareClientAPISVCBRecordType(String cloudflareClientAPISVCBRecordType) {
    this.cloudflareClientAPISVCBRecordType = cloudflareClientAPISVCBRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPISVCBRecord cloudflareClientAPISVCBRecord = (CloudflareClientAPISVCBRecord) o;
    return Objects.equals(this.cloudflareClientAPISVCBRecordContent, cloudflareClientAPISVCBRecord.cloudflareClientAPISVCBRecordContent) &&
        Objects.equals(this.cloudflareClientAPISVCBRecordData, cloudflareClientAPISVCBRecord.cloudflareClientAPISVCBRecordData) &&
        Objects.equals(this.cloudflareClientAPISVCBRecordName, cloudflareClientAPISVCBRecord.cloudflareClientAPISVCBRecordName) &&
        Objects.equals(this.cloudflareClientAPISVCBRecordType, cloudflareClientAPISVCBRecord.cloudflareClientAPISVCBRecordType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudflareClientAPISVCBRecordContent, cloudflareClientAPISVCBRecordData, cloudflareClientAPISVCBRecordName, cloudflareClientAPISVCBRecordType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPISVCBRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cloudflareClientAPISVCBRecordContent: ").append(toIndentedString(cloudflareClientAPISVCBRecordContent)).append("\n");
    sb.append("    cloudflareClientAPISVCBRecordData: ").append(toIndentedString(cloudflareClientAPISVCBRecordData)).append("\n");
    sb.append("    cloudflareClientAPISVCBRecordName: ").append(toIndentedString(cloudflareClientAPISVCBRecordName)).append("\n");
    sb.append("    cloudflareClientAPISVCBRecordType: ").append(toIndentedString(cloudflareClientAPISVCBRecordType)).append("\n");
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
