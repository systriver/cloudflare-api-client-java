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
import io.swagger.client.model.Options;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VariantPatchRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class VariantPatchRequest {
  @SerializedName("neverRequireSignedURLs")
  private Boolean neverRequireSignedURLs = null;

  @SerializedName("options")
  private Options options = null;

  public VariantPatchRequest neverRequireSignedURLs(Boolean neverRequireSignedURLs) {
    this.neverRequireSignedURLs = neverRequireSignedURLs;
    return this;
  }

   /**
   * Get neverRequireSignedURLs
   * @return neverRequireSignedURLs
  **/
  @Schema(description = "")
  public Boolean getNeverRequireSignedURLs() {
    return neverRequireSignedURLs;
  }

  public void setNeverRequireSignedURLs(Boolean neverRequireSignedURLs) {
    this.neverRequireSignedURLs = neverRequireSignedURLs;
  }

  public VariantPatchRequest options(Options options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(required = true, description = "")
  public Options getOptions() {
    return options;
  }

  public void setOptions(Options options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantPatchRequest variantPatchRequest = (VariantPatchRequest) o;
    return Objects.equals(this.neverRequireSignedURLs, variantPatchRequest.neverRequireSignedURLs) &&
        Objects.equals(this.options, variantPatchRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(neverRequireSignedURLs, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantPatchRequest {\n");
    
    sb.append("    neverRequireSignedURLs: ").append(toIndentedString(neverRequireSignedURLs)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
