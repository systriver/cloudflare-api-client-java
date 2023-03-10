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
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
/**
 * CloudflareClientAPIPTRRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPIPTRRecord extends DnsRecordComponentsSchemasBase implements DnsRecord {
  @SerializedName("content")
  private String cloudflareClientAPIPTRRecordContent = null;

  @SerializedName("name")
  private String cloudflareClientAPIPTRRecordName = null;

  @SerializedName("type")
  private String cloudflareClientAPIPTRRecordType = null;

  public CloudflareClientAPIPTRRecord cloudflareClientAPIPTRRecordContent(String cloudflareClientAPIPTRRecordContent) {
    this.cloudflareClientAPIPTRRecordContent = cloudflareClientAPIPTRRecordContent;
    return this;
  }

   /**
   * Domain name pointing to the address.
   * @return cloudflareClientAPIPTRRecordContent
  **/
  @Schema(example = "example.com", required = true, description = "Domain name pointing to the address.")
  public String getCloudflareClientAPIPTRRecordContent() {
    return cloudflareClientAPIPTRRecordContent;
  }

  public void setCloudflareClientAPIPTRRecordContent(String cloudflareClientAPIPTRRecordContent) {
    this.cloudflareClientAPIPTRRecordContent = cloudflareClientAPIPTRRecordContent;
  }

  public CloudflareClientAPIPTRRecord cloudflareClientAPIPTRRecordName(String cloudflareClientAPIPTRRecordName) {
    this.cloudflareClientAPIPTRRecordName = cloudflareClientAPIPTRRecordName;
    return this;
  }

   /**
   * Get cloudflareClientAPIPTRRecordName
   * @return cloudflareClientAPIPTRRecordName
  **/
  @Schema(required = true, description = "")
  public String getCloudflareClientAPIPTRRecordName() {
    return cloudflareClientAPIPTRRecordName;
  }

  public void setCloudflareClientAPIPTRRecordName(String cloudflareClientAPIPTRRecordName) {
    this.cloudflareClientAPIPTRRecordName = cloudflareClientAPIPTRRecordName;
  }

  public CloudflareClientAPIPTRRecord cloudflareClientAPIPTRRecordType(String cloudflareClientAPIPTRRecordType) {
    this.cloudflareClientAPIPTRRecordType = cloudflareClientAPIPTRRecordType;
    return this;
  }

   /**
   * Record type.
   * @return cloudflareClientAPIPTRRecordType
  **/
  @Schema(example = "PTR", required = true, description = "Record type.")
  public String getCloudflareClientAPIPTRRecordType() {
    return cloudflareClientAPIPTRRecordType;
  }

  public void setCloudflareClientAPIPTRRecordType(String cloudflareClientAPIPTRRecordType) {
    this.cloudflareClientAPIPTRRecordType = cloudflareClientAPIPTRRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPIPTRRecord cloudflareClientAPIPTRRecord = (CloudflareClientAPIPTRRecord) o;
    return Objects.equals(this.cloudflareClientAPIPTRRecordContent, cloudflareClientAPIPTRRecord.cloudflareClientAPIPTRRecordContent) &&
        Objects.equals(this.cloudflareClientAPIPTRRecordName, cloudflareClientAPIPTRRecord.cloudflareClientAPIPTRRecordName) &&
        Objects.equals(this.cloudflareClientAPIPTRRecordType, cloudflareClientAPIPTRRecord.cloudflareClientAPIPTRRecordType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudflareClientAPIPTRRecordContent, cloudflareClientAPIPTRRecordName, cloudflareClientAPIPTRRecordType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIPTRRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cloudflareClientAPIPTRRecordContent: ").append(toIndentedString(cloudflareClientAPIPTRRecordContent)).append("\n");
    sb.append("    cloudflareClientAPIPTRRecordName: ").append(toIndentedString(cloudflareClientAPIPTRRecordName)).append("\n");
    sb.append("    cloudflareClientAPIPTRRecordType: ").append(toIndentedString(cloudflareClientAPIPTRRecordType)).append("\n");
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
