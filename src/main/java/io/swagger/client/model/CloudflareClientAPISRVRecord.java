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
import io.swagger.client.model.CloudflareClientAPISRVRecordData;
import io.swagger.client.model.DnsRecordComponentsSchemasBase;
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
/**
 * CloudflareClientAPISRVRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPISRVRecord extends DnsRecordComponentsSchemasBase implements DnsRecord {
  @SerializedName("content")
  private String cloudflareClientAPISRVRecordContent = null;

  @SerializedName("data")
  private CloudflareClientAPISRVRecordData cloudflareClientAPISRVRecordData = null;

  @SerializedName("name")
  private String cloudflareClientAPISRVRecordName = null;

  @SerializedName("type")
  private String cloudflareClientAPISRVRecordType = null;

   /**
   * Priority, weight, port, and SRV target. See &#x27;data&#x27; for setting the individual component values.
   * @return cloudflareClientAPISRVRecordContent
  **/
  @Schema(example = "10 IN SRV 5 8806 example.com.", description = "Priority, weight, port, and SRV target. See 'data' for setting the individual component values.")
  public String getCloudflareClientAPISRVRecordContent() {
    return cloudflareClientAPISRVRecordContent;
  }

  public CloudflareClientAPISRVRecord cloudflareClientAPISRVRecordData(CloudflareClientAPISRVRecordData cloudflareClientAPISRVRecordData) {
    this.cloudflareClientAPISRVRecordData = cloudflareClientAPISRVRecordData;
    return this;
  }

   /**
   * Get cloudflareClientAPISRVRecordData
   * @return cloudflareClientAPISRVRecordData
  **/
  @Schema(required = true, description = "")
  public CloudflareClientAPISRVRecordData getCloudflareClientAPISRVRecordData() {
    return cloudflareClientAPISRVRecordData;
  }

  public void setCloudflareClientAPISRVRecordData(CloudflareClientAPISRVRecordData cloudflareClientAPISRVRecordData) {
    this.cloudflareClientAPISRVRecordData = cloudflareClientAPISRVRecordData;
  }

   /**
   * Service, protocol, and SRV name content. See &#x27;data&#x27; for setting the individual component values.
   * @return cloudflareClientAPISRVRecordName
  **/
  @Schema(example = "_sip._tcp.example.com", description = "Service, protocol, and SRV name content. See 'data' for setting the individual component values.")
  public String getCloudflareClientAPISRVRecordName() {
    return cloudflareClientAPISRVRecordName;
  }

  public CloudflareClientAPISRVRecord cloudflareClientAPISRVRecordType(String cloudflareClientAPISRVRecordType) {
    this.cloudflareClientAPISRVRecordType = cloudflareClientAPISRVRecordType;
    return this;
  }

   /**
   * Record type.
   * @return cloudflareClientAPISRVRecordType
  **/
  @Schema(example = "SRV", required = true, description = "Record type.")
  public String getCloudflareClientAPISRVRecordType() {
    return cloudflareClientAPISRVRecordType;
  }

  public void setCloudflareClientAPISRVRecordType(String cloudflareClientAPISRVRecordType) {
    this.cloudflareClientAPISRVRecordType = cloudflareClientAPISRVRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPISRVRecord cloudflareClientAPISRVRecord = (CloudflareClientAPISRVRecord) o;
    return Objects.equals(this.cloudflareClientAPISRVRecordContent, cloudflareClientAPISRVRecord.cloudflareClientAPISRVRecordContent) &&
        Objects.equals(this.cloudflareClientAPISRVRecordData, cloudflareClientAPISRVRecord.cloudflareClientAPISRVRecordData) &&
        Objects.equals(this.cloudflareClientAPISRVRecordName, cloudflareClientAPISRVRecord.cloudflareClientAPISRVRecordName) &&
        Objects.equals(this.cloudflareClientAPISRVRecordType, cloudflareClientAPISRVRecord.cloudflareClientAPISRVRecordType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudflareClientAPISRVRecordContent, cloudflareClientAPISRVRecordData, cloudflareClientAPISRVRecordName, cloudflareClientAPISRVRecordType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPISRVRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cloudflareClientAPISRVRecordContent: ").append(toIndentedString(cloudflareClientAPISRVRecordContent)).append("\n");
    sb.append("    cloudflareClientAPISRVRecordData: ").append(toIndentedString(cloudflareClientAPISRVRecordData)).append("\n");
    sb.append("    cloudflareClientAPISRVRecordName: ").append(toIndentedString(cloudflareClientAPISRVRecordName)).append("\n");
    sb.append("    cloudflareClientAPISRVRecordType: ").append(toIndentedString(cloudflareClientAPISRVRecordType)).append("\n");
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
