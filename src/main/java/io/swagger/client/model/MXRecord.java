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
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * MXRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class MXRecord extends Base {
  @SerializedName("content")
  private String mxRecordContent = null;

  @SerializedName("name")
  private String mxRecordName = null;

  @SerializedName("priority")
  private BigDecimal priority = null;

  @SerializedName("type")
  private String mxRecordType = null;

  public MXRecord mxRecordContent(String mxRecordContent) {
    this.mxRecordContent = mxRecordContent;
    return this;
  }

   /**
   * A valid mail server hostname.
   * @return mxRecordContent
  **/
  @Schema(example = "mx.example.com", required = true, description = "A valid mail server hostname.")
  public String getMxRecordContent() {
    return mxRecordContent;
  }

  public void setMxRecordContent(String mxRecordContent) {
    this.mxRecordContent = mxRecordContent;
  }

  public MXRecord mxRecordName(String mxRecordName) {
    this.mxRecordName = mxRecordName;
    return this;
  }

   /**
   * Get mxRecordName
   * @return mxRecordName
  **/
  @Schema(required = true, description = "")
  public String getMxRecordName() {
    return mxRecordName;
  }

  public void setMxRecordName(String mxRecordName) {
    this.mxRecordName = mxRecordName;
  }

  public MXRecord priority(BigDecimal priority) {
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

  public MXRecord mxRecordType(String mxRecordType) {
    this.mxRecordType = mxRecordType;
    return this;
  }

   /**
   * Record type.
   * @return mxRecordType
  **/
  @Schema(example = "MX", required = true, description = "Record type.")
  public String getMxRecordType() {
    return mxRecordType;
  }

  public void setMxRecordType(String mxRecordType) {
    this.mxRecordType = mxRecordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MXRecord mxRecord = (MXRecord) o;
    return Objects.equals(this.mxRecordContent, mxRecord.mxRecordContent) &&
        Objects.equals(this.mxRecordName, mxRecord.mxRecordName) &&
        Objects.equals(this.priority, mxRecord.priority) &&
        Objects.equals(this.mxRecordType, mxRecord.mxRecordType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mxRecordContent, mxRecordName, priority, mxRecordType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MXRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mxRecordContent: ").append(toIndentedString(mxRecordContent)).append("\n");
    sb.append("    mxRecordName: ").append(toIndentedString(mxRecordName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    mxRecordType: ").append(toIndentedString(mxRecordType)).append("\n");
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
