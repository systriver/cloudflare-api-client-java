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
 * Components of a NAPTR record.
 */
@Schema(description = "Components of a NAPTR record.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPINAPTRRecordData {
  @SerializedName("flags")
  private String flags = null;

  @SerializedName("order")
  private BigDecimal order = null;

  @SerializedName("preference")
  private BigDecimal preference = null;

  @SerializedName("regex")
  private String regex = null;

  @SerializedName("replacement")
  private String replacement = null;

  @SerializedName("service")
  private String service = null;

  public CloudflareClientAPINAPTRRecordData flags(String flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Flags.
   * @return flags
  **/
  @Schema(description = "Flags.")
  public String getFlags() {
    return flags;
  }

  public void setFlags(String flags) {
    this.flags = flags;
  }

  public CloudflareClientAPINAPTRRecordData order(BigDecimal order) {
    this.order = order;
    return this;
  }

   /**
   * Order.
   * minimum: 0
   * maximum: 65535
   * @return order
  **/
  @Schema(example = "100", description = "Order.")
  public BigDecimal getOrder() {
    return order;
  }

  public void setOrder(BigDecimal order) {
    this.order = order;
  }

  public CloudflareClientAPINAPTRRecordData preference(BigDecimal preference) {
    this.preference = preference;
    return this;
  }

   /**
   * Preference.
   * minimum: 0
   * maximum: 65535
   * @return preference
  **/
  @Schema(example = "10", description = "Preference.")
  public BigDecimal getPreference() {
    return preference;
  }

  public void setPreference(BigDecimal preference) {
    this.preference = preference;
  }

  public CloudflareClientAPINAPTRRecordData regex(String regex) {
    this.regex = regex;
    return this;
  }

   /**
   * Regex.
   * @return regex
  **/
  @Schema(description = "Regex.")
  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public CloudflareClientAPINAPTRRecordData replacement(String replacement) {
    this.replacement = replacement;
    return this;
  }

   /**
   * Replacement.
   * @return replacement
  **/
  @Schema(description = "Replacement.")
  public String getReplacement() {
    return replacement;
  }

  public void setReplacement(String replacement) {
    this.replacement = replacement;
  }

  public CloudflareClientAPINAPTRRecordData service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Service.
   * @return service
  **/
  @Schema(description = "Service.")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPINAPTRRecordData cloudflareClientAPINAPTRRecordData = (CloudflareClientAPINAPTRRecordData) o;
    return Objects.equals(this.flags, cloudflareClientAPINAPTRRecordData.flags) &&
        Objects.equals(this.order, cloudflareClientAPINAPTRRecordData.order) &&
        Objects.equals(this.preference, cloudflareClientAPINAPTRRecordData.preference) &&
        Objects.equals(this.regex, cloudflareClientAPINAPTRRecordData.regex) &&
        Objects.equals(this.replacement, cloudflareClientAPINAPTRRecordData.replacement) &&
        Objects.equals(this.service, cloudflareClientAPINAPTRRecordData.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flags, order, preference, regex, replacement, service);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPINAPTRRecordData {\n");
    
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    replacement: ").append(toIndentedString(replacement)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
