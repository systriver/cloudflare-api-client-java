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
 * Strict Transport Security.
 */
@Schema(description = "Strict Transport Security.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SecurityHeaderValueStrictTransportSecurity {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("include_subdomains")
  private Boolean includeSubdomains = null;

  @SerializedName("max_age")
  private BigDecimal maxAge = null;

  @SerializedName("nosniff")
  private Boolean nosniff = null;

  public SecurityHeaderValueStrictTransportSecurity enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether or not strict transport security is enabled.
   * @return enabled
  **/
  @Schema(example = "true", description = "Whether or not strict transport security is enabled.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public SecurityHeaderValueStrictTransportSecurity includeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
    return this;
  }

   /**
   * Include all subdomains for strict transport security.
   * @return includeSubdomains
  **/
  @Schema(example = "true", description = "Include all subdomains for strict transport security.")
  public Boolean isIncludeSubdomains() {
    return includeSubdomains;
  }

  public void setIncludeSubdomains(Boolean includeSubdomains) {
    this.includeSubdomains = includeSubdomains;
  }

  public SecurityHeaderValueStrictTransportSecurity maxAge(BigDecimal maxAge) {
    this.maxAge = maxAge;
    return this;
  }

   /**
   * Max age in seconds of the strict transport security.
   * @return maxAge
  **/
  @Schema(example = "86400", description = "Max age in seconds of the strict transport security.")
  public BigDecimal getMaxAge() {
    return maxAge;
  }

  public void setMaxAge(BigDecimal maxAge) {
    this.maxAge = maxAge;
  }

  public SecurityHeaderValueStrictTransportSecurity nosniff(Boolean nosniff) {
    this.nosniff = nosniff;
    return this;
  }

   /**
   * Whether or not to include &#x27;X-Content-Type-Options: nosniff&#x27; header.
   * @return nosniff
  **/
  @Schema(example = "true", description = "Whether or not to include 'X-Content-Type-Options: nosniff' header.")
  public Boolean isNosniff() {
    return nosniff;
  }

  public void setNosniff(Boolean nosniff) {
    this.nosniff = nosniff;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityHeaderValueStrictTransportSecurity securityHeaderValueStrictTransportSecurity = (SecurityHeaderValueStrictTransportSecurity) o;
    return Objects.equals(this.enabled, securityHeaderValueStrictTransportSecurity.enabled) &&
        Objects.equals(this.includeSubdomains, securityHeaderValueStrictTransportSecurity.includeSubdomains) &&
        Objects.equals(this.maxAge, securityHeaderValueStrictTransportSecurity.maxAge) &&
        Objects.equals(this.nosniff, securityHeaderValueStrictTransportSecurity.nosniff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, includeSubdomains, maxAge, nosniff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityHeaderValueStrictTransportSecurity {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    includeSubdomains: ").append(toIndentedString(includeSubdomains)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
    sb.append("    nosniff: ").append(toIndentedString(nosniff)).append("\n");
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
