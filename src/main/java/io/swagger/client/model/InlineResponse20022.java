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
import io.swagger.client.model.Consumer;
import io.swagger.client.model.InlineResponse20017ResultInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20022
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20022 extends ApiResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse20022Errors = null;

  @SerializedName("messages")
  private Object inlineResponse20022Messages = null;

  @SerializedName("result_info")
  private InlineResponse20017ResultInfo inlineResponse20022ResultInfo = null;

  @SerializedName("result")
  private List<Consumer> inlineResponse20022Result = null;

  public InlineResponse20022 inlineResponse20022Errors(Object inlineResponse20022Errors) {
    this.inlineResponse20022Errors = inlineResponse20022Errors;
    return this;
  }

   /**
   * Get inlineResponse20022Errors
   * @return inlineResponse20022Errors
  **/
  @Schema(description = "")
  public Object getInlineResponse20022Errors() {
    return inlineResponse20022Errors;
  }

  public void setInlineResponse20022Errors(Object inlineResponse20022Errors) {
    this.inlineResponse20022Errors = inlineResponse20022Errors;
  }

  public InlineResponse20022 inlineResponse20022Messages(Object inlineResponse20022Messages) {
    this.inlineResponse20022Messages = inlineResponse20022Messages;
    return this;
  }

   /**
   * Get inlineResponse20022Messages
   * @return inlineResponse20022Messages
  **/
  @Schema(description = "")
  public Object getInlineResponse20022Messages() {
    return inlineResponse20022Messages;
  }

  public void setInlineResponse20022Messages(Object inlineResponse20022Messages) {
    this.inlineResponse20022Messages = inlineResponse20022Messages;
  }

  public InlineResponse20022 inlineResponse20022ResultInfo(InlineResponse20017ResultInfo inlineResponse20022ResultInfo) {
    this.inlineResponse20022ResultInfo = inlineResponse20022ResultInfo;
    return this;
  }

   /**
   * Get inlineResponse20022ResultInfo
   * @return inlineResponse20022ResultInfo
  **/
  @Schema(description = "")
  public InlineResponse20017ResultInfo getInlineResponse20022ResultInfo() {
    return inlineResponse20022ResultInfo;
  }

  public void setInlineResponse20022ResultInfo(InlineResponse20017ResultInfo inlineResponse20022ResultInfo) {
    this.inlineResponse20022ResultInfo = inlineResponse20022ResultInfo;
  }

  public InlineResponse20022 inlineResponse20022Result(List<Consumer> inlineResponse20022Result) {
    this.inlineResponse20022Result = inlineResponse20022Result;
    return this;
  }

  public InlineResponse20022 addInlineResponse20022ResultItem(Consumer inlineResponse20022ResultItem) {
    if (this.inlineResponse20022Result == null) {
      this.inlineResponse20022Result = new ArrayList<Consumer>();
    }
    this.inlineResponse20022Result.add(inlineResponse20022ResultItem);
    return this;
  }

   /**
   * Get inlineResponse20022Result
   * @return inlineResponse20022Result
  **/
  @Schema(description = "")
  public List<Consumer> getInlineResponse20022Result() {
    return inlineResponse20022Result;
  }

  public void setInlineResponse20022Result(List<Consumer> inlineResponse20022Result) {
    this.inlineResponse20022Result = inlineResponse20022Result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20022 inlineResponse20022 = (InlineResponse20022) o;
    return Objects.equals(this.inlineResponse20022Errors, inlineResponse20022.inlineResponse20022Errors) &&
        Objects.equals(this.inlineResponse20022Messages, inlineResponse20022.inlineResponse20022Messages) &&
        Objects.equals(this.inlineResponse20022ResultInfo, inlineResponse20022.inlineResponse20022ResultInfo) &&
        Objects.equals(this.inlineResponse20022Result, inlineResponse20022.inlineResponse20022Result) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse20022Errors, inlineResponse20022Messages, inlineResponse20022ResultInfo, inlineResponse20022Result, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20022 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse20022Errors: ").append(toIndentedString(inlineResponse20022Errors)).append("\n");
    sb.append("    inlineResponse20022Messages: ").append(toIndentedString(inlineResponse20022Messages)).append("\n");
    sb.append("    inlineResponse20022ResultInfo: ").append(toIndentedString(inlineResponse20022ResultInfo)).append("\n");
    sb.append("    inlineResponse20022Result: ").append(toIndentedString(inlineResponse20022Result)).append("\n");
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
