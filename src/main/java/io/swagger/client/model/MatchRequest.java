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
import io.swagger.client.model.Methods;
import io.swagger.client.model.Schemes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MatchRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T13:40:27.702461541+09:00[Asia/Tokyo]")
public class MatchRequest {
  @SerializedName("methods")
  private Methods methods = null;

  @SerializedName("schemes")
  private Schemes schemes = null;

  @SerializedName("url")
  private String url = null;

  public MatchRequest methods(Methods methods) {
    this.methods = methods;
    return this;
  }

   /**
   * Get methods
   * @return methods
  **/
  @Schema(description = "")
  public Methods getMethods() {
    return methods;
  }

  public void setMethods(Methods methods) {
    this.methods = methods;
  }

  public MatchRequest schemes(Schemes schemes) {
    this.schemes = schemes;
    return this;
  }

   /**
   * Get schemes
   * @return schemes
  **/
  @Schema(description = "")
  public Schemes getSchemes() {
    return schemes;
  }

  public void setSchemes(Schemes schemes) {
    this.schemes = schemes;
  }

  public MatchRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
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
    MatchRequest matchRequest = (MatchRequest) o;
    return Objects.equals(this.methods, matchRequest.methods) &&
        Objects.equals(this.schemes, matchRequest.schemes) &&
        Objects.equals(this.url, matchRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methods, schemes, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchRequest {\n");
    
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
    sb.append("    schemes: ").append(toIndentedString(schemes)).append("\n");
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
