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
import io.swagger.client.model.DnsRecordComponentsSchemasBase;
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * CloudflareClientAPIMXRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPIMXRecord extends DnsRecordComponentsSchemasBase implements DnsRecord {
  @SerializedName("content")
  private String cloudflareClientAPIMXRecordContent = null;

  @SerializedName("name")
  private String cloudflareClientAPIMXRecordName = null;

  @SerializedName("priority")
  private BigDecimal priority = null;

  @SerializedName("type")
  private String cloudflareClientAPIMXRecordType = null;

  public CloudflareClientAPIMXRecord cloudflareClientAPIMXRecordContent(String cloudflareClientAPIMXRecordContent) {
    this.cloudflareClientAPIMXRecordContent = cloudflareClientAPIMXRecordContent;
    return this;
  }

   /**
   * A valid mail server hostname.
   * @return cloudflareClientAPIMXRecordContent
  **/
  @Schema(example = "mx.example.com", required = true, description = "A valid mail server hostname.")
  public String getCloudflareClientAPIMXRecordContent() {
    return cloudflareClientAPIMXRecordContent;
  }

  public void setCloudflareClientAPIMXRecordContent(String cloudflareClientAPIMXRecordContent) {
    this.cloudflareClientAPIMXRecordContent = cloudflareClientAPIMXRecordContent;
  }

  public CloudflareClientAPIMXRecord cloudflareClientAPIMXRecordName(String cloudflareClientAPIMXRecordName) {
    this.cloudflareClientAPIMXRecordName = cloudflareClientAPIMXRecordName;
    return this;
  }

   /**
   * Get cloudflareClientAPIMXRecordName
   * @return cloudflareClientAPIMXRecordName
  **/
  @Schema(required = true, description = "")
  public String getCloudflareClientAPIMXRecordName() {
    return cloudflareClientAPIMXRecordName;
  }

  public void setCloudflareClientAPIMXRecordName(String cloudflareClientAPIMXRecordName) {
    this.cloudflareClientAPIMXRecordName = cloudflareClientAPIMXRecordName;
  }

  public CloudflareClientAPIMXRecord priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(required = true, description = "")
  public BigDecimal getPriority() {
    return priority;
  }

  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }

  public CloudflareClientAPIMXRecord cloudflareClientAPIMXRecordType(String cloudflareClientAPIMXRecordType) {
    this.cloudflareClientAPIMXRecordType = cloudflareClientAPIMXRecordType;
    return this;
  }

   /**
   * Record type.
   * @return cloudflareClientAPIMXRecordType
  **/
  @Schema(example = "MX", required = true, description = "Record type.")
  public String getCloudflareClientAPIMXRecordType() {
    return cloudflareClientAPIMXRecordType;
  }

  public void setCloudflareClientAPIMXRecordType(String cloudflareClientAPIMXRecordType) {
    this.cloudflareClientAPIMXRecordType = cloudflareClientAPIMXRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPIMXRecord cloudflareClientAPIMXRecord = (CloudflareClientAPIMXRecord) o;
    return Objects.equals(this.cloudflareClientAPIMXRecordContent, cloudflareClientAPIMXRecord.cloudflareClientAPIMXRecordContent) &&
        Objects.equals(this.cloudflareClientAPIMXRecordName, cloudflareClientAPIMXRecord.cloudflareClientAPIMXRecordName) &&
        Objects.equals(this.priority, cloudflareClientAPIMXRecord.priority) &&
        Objects.equals(this.cloudflareClientAPIMXRecordType, cloudflareClientAPIMXRecord.cloudflareClientAPIMXRecordType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudflareClientAPIMXRecordContent, cloudflareClientAPIMXRecordName, priority, cloudflareClientAPIMXRecordType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIMXRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cloudflareClientAPIMXRecordContent: ").append(toIndentedString(cloudflareClientAPIMXRecordContent)).append("\n");
    sb.append("    cloudflareClientAPIMXRecordName: ").append(toIndentedString(cloudflareClientAPIMXRecordName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    cloudflareClientAPIMXRecordType: ").append(toIndentedString(cloudflareClientAPIMXRecordType)).append("\n");
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