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
import io.swagger.client.model.AllowedHeaders;
import io.swagger.client.model.AllowedMethods;
import io.swagger.client.model.AllowedOrigins;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * CorsHeaders
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CorsHeaders {
  @SerializedName("allow_all_headers")
  private Boolean allowAllHeaders = null;

  @SerializedName("allow_all_methods")
  private Boolean allowAllMethods = null;

  @SerializedName("allow_all_origins")
  private Boolean allowAllOrigins = null;

  @SerializedName("allow_credentials")
  private Boolean allowCredentials = null;

  @SerializedName("allowed_headers")
  private AllowedHeaders allowedHeaders = null;

  @SerializedName("allowed_methods")
  private AllowedMethods allowedMethods = null;

  @SerializedName("allowed_origins")
  private AllowedOrigins allowedOrigins = null;

  @SerializedName("max_age")
  private BigDecimal maxAge = null;

  public CorsHeaders allowAllHeaders(Boolean allowAllHeaders) {
    this.allowAllHeaders = allowAllHeaders;
    return this;
  }

   /**
   * Get allowAllHeaders
   * @return allowAllHeaders
  **/
  @Schema(description = "")
  public Boolean getAllowAllHeaders() {
    return allowAllHeaders;
  }

  public void setAllowAllHeaders(Boolean allowAllHeaders) {
    this.allowAllHeaders = allowAllHeaders;
  }

  public CorsHeaders allowAllMethods(Boolean allowAllMethods) {
    this.allowAllMethods = allowAllMethods;
    return this;
  }

   /**
   * Get allowAllMethods
   * @return allowAllMethods
  **/
  @Schema(description = "")
  public Boolean getAllowAllMethods() {
    return allowAllMethods;
  }

  public void setAllowAllMethods(Boolean allowAllMethods) {
    this.allowAllMethods = allowAllMethods;
  }

  public CorsHeaders allowAllOrigins(Boolean allowAllOrigins) {
    this.allowAllOrigins = allowAllOrigins;
    return this;
  }

   /**
   * Get allowAllOrigins
   * @return allowAllOrigins
  **/
  @Schema(description = "")
  public Boolean getAllowAllOrigins() {
    return allowAllOrigins;
  }

  public void setAllowAllOrigins(Boolean allowAllOrigins) {
    this.allowAllOrigins = allowAllOrigins;
  }

  public CorsHeaders allowCredentials(Boolean allowCredentials) {
    this.allowCredentials = allowCredentials;
    return this;
  }

   /**
   * Get allowCredentials
   * @return allowCredentials
  **/
  @Schema(description = "")
  public Boolean getAllowCredentials() {
    return allowCredentials;
  }

  public void setAllowCredentials(Boolean allowCredentials) {
    this.allowCredentials = allowCredentials;
  }

  public CorsHeaders allowedHeaders(AllowedHeaders allowedHeaders) {
    this.allowedHeaders = allowedHeaders;
    return this;
  }

   /**
   * Get allowedHeaders
   * @return allowedHeaders
  **/
  @Schema(description = "")
  public AllowedHeaders getAllowedHeaders() {
    return allowedHeaders;
  }

  public void setAllowedHeaders(AllowedHeaders allowedHeaders) {
    this.allowedHeaders = allowedHeaders;
  }

  public CorsHeaders allowedMethods(AllowedMethods allowedMethods) {
    this.allowedMethods = allowedMethods;
    return this;
  }

   /**
   * Get allowedMethods
   * @return allowedMethods
  **/
  @Schema(description = "")
  public AllowedMethods getAllowedMethods() {
    return allowedMethods;
  }

  public void setAllowedMethods(AllowedMethods allowedMethods) {
    this.allowedMethods = allowedMethods;
  }

  public CorsHeaders allowedOrigins(AllowedOrigins allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
    return this;
  }

   /**
   * Get allowedOrigins
   * @return allowedOrigins
  **/
  @Schema(description = "")
  public AllowedOrigins getAllowedOrigins() {
    return allowedOrigins;
  }

  public void setAllowedOrigins(AllowedOrigins allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }

  public CorsHeaders maxAge(BigDecimal maxAge) {
    this.maxAge = maxAge;
    return this;
  }

   /**
   * Get maxAge
   * @return maxAge
  **/
  @Schema(description = "")
  public BigDecimal getMaxAge() {
    return maxAge;
  }

  public void setMaxAge(BigDecimal maxAge) {
    this.maxAge = maxAge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorsHeaders corsHeaders = (CorsHeaders) o;
    return Objects.equals(this.allowAllHeaders, corsHeaders.allowAllHeaders) &&
        Objects.equals(this.allowAllMethods, corsHeaders.allowAllMethods) &&
        Objects.equals(this.allowAllOrigins, corsHeaders.allowAllOrigins) &&
        Objects.equals(this.allowCredentials, corsHeaders.allowCredentials) &&
        Objects.equals(this.allowedHeaders, corsHeaders.allowedHeaders) &&
        Objects.equals(this.allowedMethods, corsHeaders.allowedMethods) &&
        Objects.equals(this.allowedOrigins, corsHeaders.allowedOrigins) &&
        Objects.equals(this.maxAge, corsHeaders.maxAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAllHeaders, allowAllMethods, allowAllOrigins, allowCredentials, allowedHeaders, allowedMethods, allowedOrigins, maxAge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorsHeaders {\n");
    
    sb.append("    allowAllHeaders: ").append(toIndentedString(allowAllHeaders)).append("\n");
    sb.append("    allowAllMethods: ").append(toIndentedString(allowAllMethods)).append("\n");
    sb.append("    allowAllOrigins: ").append(toIndentedString(allowAllOrigins)).append("\n");
    sb.append("    allowCredentials: ").append(toIndentedString(allowCredentials)).append("\n");
    sb.append("    allowedHeaders: ").append(toIndentedString(allowedHeaders)).append("\n");
    sb.append("    allowedMethods: ").append(toIndentedString(allowedMethods)).append("\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
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
