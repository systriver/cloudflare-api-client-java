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
 * ImageBasicUploadViaUrl
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ImageBasicUploadViaUrl {
  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("requireSignedURLs")
  private Boolean requireSignedURLs = false;

  @SerializedName("url")
  private String url = null;

  public ImageBasicUploadViaUrl metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * User modifiable key-value store. Can use used for keeping references to another system of record for managing images.
   * @return metadata
  **/
  @Schema(description = "User modifiable key-value store. Can use used for keeping references to another system of record for managing images.")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public ImageBasicUploadViaUrl requireSignedURLs(Boolean requireSignedURLs) {
    this.requireSignedURLs = requireSignedURLs;
    return this;
  }

   /**
   * Indicates whether the image requires a signature token for the access.
   * @return requireSignedURLs
  **/
  @Schema(example = "true", description = "Indicates whether the image requires a signature token for the access.")
  public Boolean isRequireSignedURLs() {
    return requireSignedURLs;
  }

  public void setRequireSignedURLs(Boolean requireSignedURLs) {
    this.requireSignedURLs = requireSignedURLs;
  }

  public ImageBasicUploadViaUrl url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A URL to fetch an image from origin.
   * @return url
  **/
  @Schema(example = "https://example.com/path/to/logo.png", required = true, description = "A URL to fetch an image from origin.")
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
    ImageBasicUploadViaUrl imageBasicUploadViaUrl = (ImageBasicUploadViaUrl) o;
    return Objects.equals(this.metadata, imageBasicUploadViaUrl.metadata) &&
        Objects.equals(this.requireSignedURLs, imageBasicUploadViaUrl.requireSignedURLs) &&
        Objects.equals(this.url, imageBasicUploadViaUrl.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, requireSignedURLs, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageBasicUploadViaUrl {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    requireSignedURLs: ").append(toIndentedString(requireSignedURLs)).append("\n");
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