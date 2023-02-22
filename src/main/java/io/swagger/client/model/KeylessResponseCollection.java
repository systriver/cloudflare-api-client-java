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
import io.swagger.client.model.KeylessCertificate;
import io.swagger.client.model.ResultInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * KeylessResponseCollection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class KeylessResponseCollection extends ApiResponseCollection {
  @SerializedName("result")
  private List<KeylessCertificate> keylessResponseCollectionResult = null;

  public KeylessResponseCollection keylessResponseCollectionResult(List<KeylessCertificate> keylessResponseCollectionResult) {
    this.keylessResponseCollectionResult = keylessResponseCollectionResult;
    return this;
  }

  public KeylessResponseCollection addKeylessResponseCollectionResultItem(KeylessCertificate keylessResponseCollectionResultItem) {
    if (this.keylessResponseCollectionResult == null) {
      this.keylessResponseCollectionResult = new ArrayList<KeylessCertificate>();
    }
    this.keylessResponseCollectionResult.add(keylessResponseCollectionResultItem);
    return this;
  }

   /**
   * Get keylessResponseCollectionResult
   * @return keylessResponseCollectionResult
  **/
  @Schema(description = "")
  public List<KeylessCertificate> getKeylessResponseCollectionResult() {
    return keylessResponseCollectionResult;
  }

  public void setKeylessResponseCollectionResult(List<KeylessCertificate> keylessResponseCollectionResult) {
    this.keylessResponseCollectionResult = keylessResponseCollectionResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeylessResponseCollection keylessResponseCollection = (KeylessResponseCollection) o;
    return Objects.equals(this.keylessResponseCollectionResult, keylessResponseCollection.keylessResponseCollectionResult) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keylessResponseCollectionResult, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeylessResponseCollection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    keylessResponseCollectionResult: ").append(toIndentedString(keylessResponseCollectionResult)).append("\n");
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
