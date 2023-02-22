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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Status of the most recent scan found.
 */
@Schema(description = "Status of the most recent scan found.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class PhishingurlinfoScanStatus {
  @SerializedName("last_processed")
  private String lastProcessed = null;

  @SerializedName("scan_complete")
  private Boolean scanComplete = null;

  @SerializedName("status_code")
  private Integer statusCode = null;

  @SerializedName("submission_id")
  private Integer submissionId = null;

  public PhishingurlinfoScanStatus lastProcessed(String lastProcessed) {
    this.lastProcessed = lastProcessed;
    return this;
  }

   /**
   * Timestamp of when the submission was processed.
   * @return lastProcessed
  **/
  @Schema(example = "Wed, 26 Oct 2022 16:04:51 GMT", description = "Timestamp of when the submission was processed.")
  public String getLastProcessed() {
    return lastProcessed;
  }

  public void setLastProcessed(String lastProcessed) {
    this.lastProcessed = lastProcessed;
  }

  public PhishingurlinfoScanStatus scanComplete(Boolean scanComplete) {
    this.scanComplete = scanComplete;
    return this;
  }

   /**
   * For internal use.
   * @return scanComplete
  **/
  @Schema(description = "For internal use.")
  public Boolean isScanComplete() {
    return scanComplete;
  }

  public void setScanComplete(Boolean scanComplete) {
    this.scanComplete = scanComplete;
  }

  public PhishingurlinfoScanStatus statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Status code that the crawler received when loading the submitted URL.
   * @return statusCode
  **/
  @Schema(description = "Status code that the crawler received when loading the submitted URL.")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public PhishingurlinfoScanStatus submissionId(Integer submissionId) {
    this.submissionId = submissionId;
    return this;
  }

   /**
   * ID of the most recent submission.
   * @return submissionId
  **/
  @Schema(description = "ID of the most recent submission.")
  public Integer getSubmissionId() {
    return submissionId;
  }

  public void setSubmissionId(Integer submissionId) {
    this.submissionId = submissionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhishingurlinfoScanStatus phishingurlinfoScanStatus = (PhishingurlinfoScanStatus) o;
    return Objects.equals(this.lastProcessed, phishingurlinfoScanStatus.lastProcessed) &&
        Objects.equals(this.scanComplete, phishingurlinfoScanStatus.scanComplete) &&
        Objects.equals(this.statusCode, phishingurlinfoScanStatus.statusCode) &&
        Objects.equals(this.submissionId, phishingurlinfoScanStatus.submissionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProcessed, scanComplete, statusCode, submissionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhishingurlinfoScanStatus {\n");
    
    sb.append("    lastProcessed: ").append(toIndentedString(lastProcessed)).append("\n");
    sb.append("    scanComplete: ").append(toIndentedString(scanComplete)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
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