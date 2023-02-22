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
import io.swagger.client.model.CloudflareClientAPIHTTPSRecordData;
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
/**
 * HTTPSRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class HTTPSRecord extends Base {
  @SerializedName("content")
  private String htTPSRecordContent = null;

  @SerializedName("data")
  private CloudflareClientAPIHTTPSRecordData htTPSRecordData = null;

  @SerializedName("name")
  private String htTPSRecordName = null;

  @SerializedName("type")
  private String htTPSRecordType = null;

   /**
   * Formatted HTTPS content. See &#x27;data&#x27; to set HTTPS properties.
   * @return htTPSRecordContent
  **/
  @Schema(description = "Formatted HTTPS content. See 'data' to set HTTPS properties.")
  public String getHtTPSRecordContent() {
    return htTPSRecordContent;
  }

  public HTTPSRecord htTPSRecordData(CloudflareClientAPIHTTPSRecordData htTPSRecordData) {
    this.htTPSRecordData = htTPSRecordData;
    return this;
  }

   /**
   * Get htTPSRecordData
   * @return htTPSRecordData
  **/
  @Schema(required = true, description = "")
  public CloudflareClientAPIHTTPSRecordData getHtTPSRecordData() {
    return htTPSRecordData;
  }

  public void setHtTPSRecordData(CloudflareClientAPIHTTPSRecordData htTPSRecordData) {
    this.htTPSRecordData = htTPSRecordData;
  }

  public HTTPSRecord htTPSRecordName(String htTPSRecordName) {
    this.htTPSRecordName = htTPSRecordName;
    return this;
  }

   /**
   * Get htTPSRecordName
   * @return htTPSRecordName
  **/
  @Schema(required = true, description = "")
  public String getHtTPSRecordName() {
    return htTPSRecordName;
  }

  public void setHtTPSRecordName(String htTPSRecordName) {
    this.htTPSRecordName = htTPSRecordName;
  }

  public HTTPSRecord htTPSRecordType(String htTPSRecordType) {
    this.htTPSRecordType = htTPSRecordType;
    return this;
  }

   /**
   * Record type.
   * @return htTPSRecordType
  **/
  @Schema(example = "HTTPS", required = true, description = "Record type.")
  public String getHtTPSRecordType() {
    return htTPSRecordType;
  }

  public void setHtTPSRecordType(String htTPSRecordType) {
    this.htTPSRecordType = htTPSRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPSRecord htTPSRecord = (HTTPSRecord) o;
    return Objects.equals(this.htTPSRecordContent, htTPSRecord.htTPSRecordContent) &&
        Objects.equals(this.htTPSRecordData, htTPSRecord.htTPSRecordData) &&
        Objects.equals(this.htTPSRecordName, htTPSRecord.htTPSRecordName) &&
        Objects.equals(this.htTPSRecordType, htTPSRecord.htTPSRecordType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htTPSRecordContent, htTPSRecordData, htTPSRecordName, htTPSRecordType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPSRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    htTPSRecordContent: ").append(toIndentedString(htTPSRecordContent)).append("\n");
    sb.append("    htTPSRecordData: ").append(toIndentedString(htTPSRecordData)).append("\n");
    sb.append("    htTPSRecordName: ").append(toIndentedString(htTPSRecordName)).append("\n");
    sb.append("    htTPSRecordType: ").append(toIndentedString(htTPSRecordType)).append("\n");
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
