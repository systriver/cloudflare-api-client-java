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
 * CreateOutputRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CreateOutputRequest {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("streamKey")
  private String streamKey = null;

  @SerializedName("url")
  private String url = null;

  public CreateOutputRequest enabled(Boolean enabled) {
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

  public CreateOutputRequest streamKey(String streamKey) {
    this.streamKey = streamKey;
    return this;
  }

   /**
   * Get streamKey
   * @return streamKey
  **/
  @Schema(required = true, description = "")
  public String getStreamKey() {
    return streamKey;
  }

  public void setStreamKey(String streamKey) {
    this.streamKey = streamKey;
  }

  public CreateOutputRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(required = true, description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOutputRequest createOutputRequest = (CreateOutputRequest) o;
    return Objects.equals(this.enabled, createOutputRequest.enabled) &&
        Objects.equals(this.streamKey, createOutputRequest.streamKey) &&
        Objects.equals(this.url, createOutputRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, streamKey, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOutputRequest {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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