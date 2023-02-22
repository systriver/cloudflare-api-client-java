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
 * GetZoneSettingsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class GetZoneSettingsResponse {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("use_cloudflare_reporting_endpoint")
  private Boolean useCloudflareReportingEndpoint = null;

  @SerializedName("use_connection_url_path")
  private Boolean useConnectionUrlPath = null;

  public GetZoneSettingsResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public GetZoneSettingsResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public GetZoneSettingsResponse useCloudflareReportingEndpoint(Boolean useCloudflareReportingEndpoint) {
    this.useCloudflareReportingEndpoint = useCloudflareReportingEndpoint;
    return this;
  }

   /**
   * Get useCloudflareReportingEndpoint
   * @return useCloudflareReportingEndpoint
  **/
  @Schema(description = "")
  public Boolean getUseCloudflareReportingEndpoint() {
    return useCloudflareReportingEndpoint;
  }

  public void setUseCloudflareReportingEndpoint(Boolean useCloudflareReportingEndpoint) {
    this.useCloudflareReportingEndpoint = useCloudflareReportingEndpoint;
  }

  public GetZoneSettingsResponse useConnectionUrlPath(Boolean useConnectionUrlPath) {
    this.useConnectionUrlPath = useConnectionUrlPath;
    return this;
  }

   /**
   * Get useConnectionUrlPath
   * @return useConnectionUrlPath
  **/
  @Schema(description = "")
  public Boolean getUseConnectionUrlPath() {
    return useConnectionUrlPath;
  }

  public void setUseConnectionUrlPath(Boolean useConnectionUrlPath) {
    this.useConnectionUrlPath = useConnectionUrlPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetZoneSettingsResponse getZoneSettingsResponse = (GetZoneSettingsResponse) o;
    return Objects.equals(this.enabled, getZoneSettingsResponse.enabled) &&
        Objects.equals(this.updatedAt, getZoneSettingsResponse.updatedAt) &&
        Objects.equals(this.useCloudflareReportingEndpoint, getZoneSettingsResponse.useCloudflareReportingEndpoint) &&
        Objects.equals(this.useConnectionUrlPath, getZoneSettingsResponse.useConnectionUrlPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, updatedAt, useCloudflareReportingEndpoint, useConnectionUrlPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetZoneSettingsResponse {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    useCloudflareReportingEndpoint: ").append(toIndentedString(useCloudflareReportingEndpoint)).append("\n");
    sb.append("    useConnectionUrlPath: ").append(toIndentedString(useConnectionUrlPath)).append("\n");
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