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
import io.swagger.client.model.ApiResponseCommon;
import io.swagger.client.model.CloudflareClientAPIKey;
import io.swagger.client.model.InlineResponse20010ResultInfo;
import io.swagger.client.model.Messages;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20010
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20010 extends ApiResponseCommon {
  @SerializedName("result")
  private List<CloudflareClientAPIKey> inlineResponse20010Result = null;

  @SerializedName("result_info")
  private InlineResponse20010ResultInfo resultInfo = null;

  public InlineResponse20010 inlineResponse20010Result(List<CloudflareClientAPIKey> inlineResponse20010Result) {
    this.inlineResponse20010Result = inlineResponse20010Result;
    return this;
  }

  public InlineResponse20010 addInlineResponse20010ResultItem(CloudflareClientAPIKey inlineResponse20010ResultItem) {
    if (this.inlineResponse20010Result == null) {
      this.inlineResponse20010Result = new ArrayList<CloudflareClientAPIKey>();
    }
    this.inlineResponse20010Result.add(inlineResponse20010ResultItem);
    return this;
  }

   /**
   * Get inlineResponse20010Result
   * @return inlineResponse20010Result
  **/
  @Schema(description = "")
  public List<CloudflareClientAPIKey> getInlineResponse20010Result() {
    return inlineResponse20010Result;
  }

  public void setInlineResponse20010Result(List<CloudflareClientAPIKey> inlineResponse20010Result) {
    this.inlineResponse20010Result = inlineResponse20010Result;
  }

  public InlineResponse20010 resultInfo(InlineResponse20010ResultInfo resultInfo) {
    this.resultInfo = resultInfo;
    return this;
  }

   /**
   * Get resultInfo
   * @return resultInfo
  **/
  @Schema(description = "")
  public InlineResponse20010ResultInfo getResultInfo() {
    return resultInfo;
  }

  public void setResultInfo(InlineResponse20010ResultInfo resultInfo) {
    this.resultInfo = resultInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010 inlineResponse20010 = (InlineResponse20010) o;
    return Objects.equals(this.inlineResponse20010Result, inlineResponse20010.inlineResponse20010Result) &&
        Objects.equals(this.resultInfo, inlineResponse20010.resultInfo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse20010Result, resultInfo, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse20010Result: ").append(toIndentedString(inlineResponse20010Result)).append("\n");
    sb.append("    resultInfo: ").append(toIndentedString(resultInfo)).append("\n");
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
