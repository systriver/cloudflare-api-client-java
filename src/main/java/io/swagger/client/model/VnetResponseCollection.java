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
import io.swagger.client.model.VirtualNetwork;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * VnetResponseCollection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class VnetResponseCollection extends ApiResponseCollection {
  @SerializedName("result")
  private List<VirtualNetwork> vnetResponseCollectionResult = null;

  public VnetResponseCollection vnetResponseCollectionResult(List<VirtualNetwork> vnetResponseCollectionResult) {
    this.vnetResponseCollectionResult = vnetResponseCollectionResult;
    return this;
  }

  public VnetResponseCollection addVnetResponseCollectionResultItem(VirtualNetwork vnetResponseCollectionResultItem) {
    if (this.vnetResponseCollectionResult == null) {
      this.vnetResponseCollectionResult = new ArrayList<VirtualNetwork>();
    }
    this.vnetResponseCollectionResult.add(vnetResponseCollectionResultItem);
    return this;
  }

   /**
   * Get vnetResponseCollectionResult
   * @return vnetResponseCollectionResult
  **/
  @Schema(description = "")
  public List<VirtualNetwork> getVnetResponseCollectionResult() {
    return vnetResponseCollectionResult;
  }

  public void setVnetResponseCollectionResult(List<VirtualNetwork> vnetResponseCollectionResult) {
    this.vnetResponseCollectionResult = vnetResponseCollectionResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VnetResponseCollection vnetResponseCollection = (VnetResponseCollection) o;
    return Objects.equals(this.vnetResponseCollectionResult, vnetResponseCollection.vnetResponseCollectionResult) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vnetResponseCollectionResult, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VnetResponseCollection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vnetResponseCollectionResult: ").append(toIndentedString(vnetResponseCollectionResult)).append("\n");
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