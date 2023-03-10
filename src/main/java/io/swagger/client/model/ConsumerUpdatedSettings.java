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
import java.math.BigDecimal;
/**
 * ConsumerUpdatedSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ConsumerUpdatedSettings {
  @SerializedName("batch_size")
  private BigDecimal batchSize = null;

  @SerializedName("max_retries")
  private BigDecimal maxRetries = null;

  @SerializedName("max_wait_time_ms")
  private BigDecimal maxWaitTimeMs = null;

  public ConsumerUpdatedSettings batchSize(BigDecimal batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * Get batchSize
   * @return batchSize
  **/
  @Schema(example = "100", description = "")
  public BigDecimal getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(BigDecimal batchSize) {
    this.batchSize = batchSize;
  }

  public ConsumerUpdatedSettings maxRetries(BigDecimal maxRetries) {
    this.maxRetries = maxRetries;
    return this;
  }

   /**
   * Get maxRetries
   * @return maxRetries
  **/
  @Schema(description = "")
  public BigDecimal getMaxRetries() {
    return maxRetries;
  }

  public void setMaxRetries(BigDecimal maxRetries) {
    this.maxRetries = maxRetries;
  }

  public ConsumerUpdatedSettings maxWaitTimeMs(BigDecimal maxWaitTimeMs) {
    this.maxWaitTimeMs = maxWaitTimeMs;
    return this;
  }

   /**
   * Get maxWaitTimeMs
   * @return maxWaitTimeMs
  **/
  @Schema(description = "")
  public BigDecimal getMaxWaitTimeMs() {
    return maxWaitTimeMs;
  }

  public void setMaxWaitTimeMs(BigDecimal maxWaitTimeMs) {
    this.maxWaitTimeMs = maxWaitTimeMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerUpdatedSettings consumerUpdatedSettings = (ConsumerUpdatedSettings) o;
    return Objects.equals(this.batchSize, consumerUpdatedSettings.batchSize) &&
        Objects.equals(this.maxRetries, consumerUpdatedSettings.maxRetries) &&
        Objects.equals(this.maxWaitTimeMs, consumerUpdatedSettings.maxWaitTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchSize, maxRetries, maxWaitTimeMs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerUpdatedSettings {\n");
    
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
    sb.append("    maxWaitTimeMs: ").append(toIndentedString(maxWaitTimeMs)).append("\n");
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
