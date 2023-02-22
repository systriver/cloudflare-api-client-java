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
import io.swagger.client.model.ApiResponseSingle;
import io.swagger.client.model.DnsResponseImportScanResult;
import io.swagger.client.model.DnsResponseImportScanTiming;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DnsResponseImportScan
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DnsResponseImportScan extends ApiResponseSingle {
  @SerializedName("result")
  private DnsResponseImportScanResult dnsResponseImportScanResult = null;

  @SerializedName("timing")
  private DnsResponseImportScanTiming timing = null;

  public DnsResponseImportScan dnsResponseImportScanResult(DnsResponseImportScanResult dnsResponseImportScanResult) {
    this.dnsResponseImportScanResult = dnsResponseImportScanResult;
    return this;
  }

   /**
   * Get dnsResponseImportScanResult
   * @return dnsResponseImportScanResult
  **/
  @Schema(description = "")
  public DnsResponseImportScanResult getDnsResponseImportScanResult() {
    return dnsResponseImportScanResult;
  }

  public void setDnsResponseImportScanResult(DnsResponseImportScanResult dnsResponseImportScanResult) {
    this.dnsResponseImportScanResult = dnsResponseImportScanResult;
  }

  public DnsResponseImportScan timing(DnsResponseImportScanTiming timing) {
    this.timing = timing;
    return this;
  }

   /**
   * Get timing
   * @return timing
  **/
  @Schema(description = "")
  public DnsResponseImportScanTiming getTiming() {
    return timing;
  }

  public void setTiming(DnsResponseImportScanTiming timing) {
    this.timing = timing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsResponseImportScan dnsResponseImportScan = (DnsResponseImportScan) o;
    return Objects.equals(this.dnsResponseImportScanResult, dnsResponseImportScan.dnsResponseImportScanResult) &&
        Objects.equals(this.timing, dnsResponseImportScan.timing) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsResponseImportScanResult, timing, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsResponseImportScan {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dnsResponseImportScanResult: ").append(toIndentedString(dnsResponseImportScanResult)).append("\n");
    sb.append("    timing: ").append(toIndentedString(timing)).append("\n");
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