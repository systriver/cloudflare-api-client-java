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
import io.swagger.client.model.ResultInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SchemasFilterResponseCollection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SchemasFilterResponseCollection extends ApiResponseCollection {
  @SerializedName("result")
  private List<Object> schemasFilterResponseCollectionResult = null;

  public SchemasFilterResponseCollection schemasFilterResponseCollectionResult(List<Object> schemasFilterResponseCollectionResult) {
    this.schemasFilterResponseCollectionResult = schemasFilterResponseCollectionResult;
    return this;
  }

  public SchemasFilterResponseCollection addSchemasFilterResponseCollectionResultItem(Object schemasFilterResponseCollectionResultItem) {
    if (this.schemasFilterResponseCollectionResult == null) {
      this.schemasFilterResponseCollectionResult = new ArrayList<Object>();
    }
    this.schemasFilterResponseCollectionResult.add(schemasFilterResponseCollectionResultItem);
    return this;
  }

   /**
   * Get schemasFilterResponseCollectionResult
   * @return schemasFilterResponseCollectionResult
  **/
  @Schema(description = "")
  public List<Object> getSchemasFilterResponseCollectionResult() {
    return schemasFilterResponseCollectionResult;
  }

  public void setSchemasFilterResponseCollectionResult(List<Object> schemasFilterResponseCollectionResult) {
    this.schemasFilterResponseCollectionResult = schemasFilterResponseCollectionResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemasFilterResponseCollection schemasFilterResponseCollection = (SchemasFilterResponseCollection) o;
    return Objects.equals(this.schemasFilterResponseCollectionResult, schemasFilterResponseCollection.schemasFilterResponseCollectionResult) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemasFilterResponseCollectionResult, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasFilterResponseCollection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    schemasFilterResponseCollectionResult: ").append(toIndentedString(schemasFilterResponseCollectionResult)).append("\n");
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
