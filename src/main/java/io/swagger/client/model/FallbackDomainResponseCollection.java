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
import io.swagger.client.model.ApiResponseCollection;
import io.swagger.client.model.FallbackDomain;
import io.swagger.client.model.ResultInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FallbackDomainResponseCollection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class FallbackDomainResponseCollection extends ApiResponseCollection {
  @SerializedName("result")
  private List<FallbackDomain> fallbackDomainResponseCollectionResult = null;

  public FallbackDomainResponseCollection fallbackDomainResponseCollectionResult(List<FallbackDomain> fallbackDomainResponseCollectionResult) {
    this.fallbackDomainResponseCollectionResult = fallbackDomainResponseCollectionResult;
    return this;
  }

  public FallbackDomainResponseCollection addFallbackDomainResponseCollectionResultItem(FallbackDomain fallbackDomainResponseCollectionResultItem) {
    if (this.fallbackDomainResponseCollectionResult == null) {
      this.fallbackDomainResponseCollectionResult = new ArrayList<FallbackDomain>();
    }
    this.fallbackDomainResponseCollectionResult.add(fallbackDomainResponseCollectionResultItem);
    return this;
  }

   /**
   * Get fallbackDomainResponseCollectionResult
   * @return fallbackDomainResponseCollectionResult
  **/
  @Schema(description = "")
  public List<FallbackDomain> getFallbackDomainResponseCollectionResult() {
    return fallbackDomainResponseCollectionResult;
  }

  public void setFallbackDomainResponseCollectionResult(List<FallbackDomain> fallbackDomainResponseCollectionResult) {
    this.fallbackDomainResponseCollectionResult = fallbackDomainResponseCollectionResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FallbackDomainResponseCollection fallbackDomainResponseCollection = (FallbackDomainResponseCollection) o;
    return Objects.equals(this.fallbackDomainResponseCollectionResult, fallbackDomainResponseCollection.fallbackDomainResponseCollectionResult) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fallbackDomainResponseCollectionResult, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FallbackDomainResponseCollection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fallbackDomainResponseCollectionResult: ").append(toIndentedString(fallbackDomainResponseCollectionResult)).append("\n");
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