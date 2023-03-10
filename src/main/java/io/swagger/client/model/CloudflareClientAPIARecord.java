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
 * CloudflareClientAPIARecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPIARecord extends DnsRecordComponentsSchemasBase implements DnsRecord {
  @SerializedName("content")
  private String cloudflareClientAPIARecordContent = null;

  @SerializedName("name")
  private String cloudflareClientAPIARecordName = null;

  @SerializedName("type")
  private String cloudflareClientAPIARecordType = null;

  public CloudflareClientAPIARecord cloudflareClientAPIARecordContent(String cloudflareClientAPIARecordContent) {
    this.cloudflareClientAPIARecordContent = cloudflareClientAPIARecordContent;
    return this;
  }

   /**
   * A valid IPv4 address.
   * @return cloudflareClientAPIARecordContent
  **/
  @Schema(example = "198.51.100.4", required = true, description = "A valid IPv4 address.")
  public String getCloudflareClientAPIARecordContent() {
    return cloudflareClientAPIARecordContent;
  }

  public void setCloudflareClientAPIARecordContent(String cloudflareClientAPIARecordContent) {
    this.cloudflareClientAPIARecordContent = cloudflareClientAPIARecordContent;
  }

  public CloudflareClientAPIARecord cloudflareClientAPIARecordName(String cloudflareClientAPIARecordName) {
    this.cloudflareClientAPIARecordName = cloudflareClientAPIARecordName;
    return this;
  }

   /**
   * Get cloudflareClientAPIARecordName
   * @return cloudflareClientAPIARecordName
  **/
  @Schema(required = true, description = "")
  public String getCloudflareClientAPIARecordName() {
    return cloudflareClientAPIARecordName;
  }

  public void setCloudflareClientAPIARecordName(String cloudflareClientAPIARecordName) {
    this.cloudflareClientAPIARecordName = cloudflareClientAPIARecordName;
  }

  public CloudflareClientAPIARecord cloudflareClientAPIARecordType(String cloudflareClientAPIARecordType) {
    this.cloudflareClientAPIARecordType = cloudflareClientAPIARecordType;
    return this;
  }

   /**
   * Record type.
   * @return cloudflareClientAPIARecordType
  **/
  @Schema(example = "A", required = true, description = "Record type.")
  public String getCloudflareClientAPIARecordType() {
    return cloudflareClientAPIARecordType;
  }

  public void setCloudflareClientAPIARecordType(String cloudflareClientAPIARecordType) {
    this.cloudflareClientAPIARecordType = cloudflareClientAPIARecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPIARecord cloudflareClientAPIARecord = (CloudflareClientAPIARecord) o;
    return Objects.equals(this.cloudflareClientAPIARecordContent, cloudflareClientAPIARecord.cloudflareClientAPIARecordContent) &&
        Objects.equals(this.cloudflareClientAPIARecordName, cloudflareClientAPIARecord.cloudflareClientAPIARecordName) &&
        Objects.equals(this.cloudflareClientAPIARecordType, cloudflareClientAPIARecord.cloudflareClientAPIARecordType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudflareClientAPIARecordContent, cloudflareClientAPIARecordName, cloudflareClientAPIARecordType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIARecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cloudflareClientAPIARecordContent: ").append(toIndentedString(cloudflareClientAPIARecordContent)).append("\n");
    sb.append("    cloudflareClientAPIARecordName: ").append(toIndentedString(cloudflareClientAPIARecordName)).append("\n");
    sb.append("    cloudflareClientAPIARecordType: ").append(toIndentedString(cloudflareClientAPIARecordType)).append("\n");
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
