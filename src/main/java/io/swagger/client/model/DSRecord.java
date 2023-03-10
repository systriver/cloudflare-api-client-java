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
import io.swagger.client.model.CloudflareClientAPIDSRecordData;
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
/**
 * DSRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DSRecord extends Base {
  @SerializedName("content")
  private String dsRecordContent = null;

  @SerializedName("data")
  private CloudflareClientAPIDSRecordData dsRecordData = null;

  @SerializedName("name")
  private String dsRecordName = null;

  @SerializedName("type")
  private String dsRecordType = null;

   /**
   * Formatted DS content. See &#x27;data&#x27; to set DS properties.
   * @return dsRecordContent
  **/
  @Schema(description = "Formatted DS content. See 'data' to set DS properties.")
  public String getDsRecordContent() {
    return dsRecordContent;
  }

  public DSRecord dsRecordData(CloudflareClientAPIDSRecordData dsRecordData) {
    this.dsRecordData = dsRecordData;
    return this;
  }

   /**
   * Get dsRecordData
   * @return dsRecordData
  **/
  @Schema(required = true, description = "")
  public CloudflareClientAPIDSRecordData getDsRecordData() {
    return dsRecordData;
  }

  public void setDsRecordData(CloudflareClientAPIDSRecordData dsRecordData) {
    this.dsRecordData = dsRecordData;
  }

  public DSRecord dsRecordName(String dsRecordName) {
    this.dsRecordName = dsRecordName;
    return this;
  }

   /**
   * Get dsRecordName
   * @return dsRecordName
  **/
  @Schema(required = true, description = "")
  public String getDsRecordName() {
    return dsRecordName;
  }

  public void setDsRecordName(String dsRecordName) {
    this.dsRecordName = dsRecordName;
  }

  public DSRecord dsRecordType(String dsRecordType) {
    this.dsRecordType = dsRecordType;
    return this;
  }

   /**
   * Record type.
   * @return dsRecordType
  **/
  @Schema(example = "DS", required = true, description = "Record type.")
  public String getDsRecordType() {
    return dsRecordType;
  }

  public void setDsRecordType(String dsRecordType) {
    this.dsRecordType = dsRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DSRecord dsRecord = (DSRecord) o;
    return Objects.equals(this.dsRecordContent, dsRecord.dsRecordContent) &&
        Objects.equals(this.dsRecordData, dsRecord.dsRecordData) &&
        Objects.equals(this.dsRecordName, dsRecord.dsRecordName) &&
        Objects.equals(this.dsRecordType, dsRecord.dsRecordType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dsRecordContent, dsRecordData, dsRecordName, dsRecordType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dsRecordContent: ").append(toIndentedString(dsRecordContent)).append("\n");
    sb.append("    dsRecordData: ").append(toIndentedString(dsRecordData)).append("\n");
    sb.append("    dsRecordName: ").append(toIndentedString(dsRecordName)).append("\n");
    sb.append("    dsRecordType: ").append(toIndentedString(dsRecordType)).append("\n");
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
