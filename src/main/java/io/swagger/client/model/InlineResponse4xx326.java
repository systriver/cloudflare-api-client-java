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
import io.swagger.client.model.ApiResponseCommonFailure;
import io.swagger.client.model.ForceResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx326
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx326 extends ForceResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx326Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx326Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx326Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx326Success = null;

  public InlineResponse4xx326 inlineResponse4xx326Errors(Object inlineResponse4xx326Errors) {
    this.inlineResponse4xx326Errors = inlineResponse4xx326Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx326Errors
   * @return inlineResponse4xx326Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx326Errors() {
    return inlineResponse4xx326Errors;
  }

  public void setInlineResponse4xx326Errors(Object inlineResponse4xx326Errors) {
    this.inlineResponse4xx326Errors = inlineResponse4xx326Errors;
  }

  public InlineResponse4xx326 inlineResponse4xx326Messages(Object inlineResponse4xx326Messages) {
    this.inlineResponse4xx326Messages = inlineResponse4xx326Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx326Messages
   * @return inlineResponse4xx326Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx326Messages() {
    return inlineResponse4xx326Messages;
  }

  public void setInlineResponse4xx326Messages(Object inlineResponse4xx326Messages) {
    this.inlineResponse4xx326Messages = inlineResponse4xx326Messages;
  }

  public InlineResponse4xx326 inlineResponse4xx326Result(Object inlineResponse4xx326Result) {
    this.inlineResponse4xx326Result = inlineResponse4xx326Result;
    return this;
  }

   /**
   * Get inlineResponse4xx326Result
   * @return inlineResponse4xx326Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx326Result() {
    return inlineResponse4xx326Result;
  }

  public void setInlineResponse4xx326Result(Object inlineResponse4xx326Result) {
    this.inlineResponse4xx326Result = inlineResponse4xx326Result;
  }

  public InlineResponse4xx326 inlineResponse4xx326Success(Boolean inlineResponse4xx326Success) {
    this.inlineResponse4xx326Success = inlineResponse4xx326Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx326Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx326Success() {
    return inlineResponse4xx326Success;
  }

  public void setInlineResponse4xx326Success(Boolean inlineResponse4xx326Success) {
    this.inlineResponse4xx326Success = inlineResponse4xx326Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx326 inlineResponse4xx326 = (InlineResponse4xx326) o;
    return Objects.equals(this.inlineResponse4xx326Errors, inlineResponse4xx326.inlineResponse4xx326Errors) &&
        Objects.equals(this.inlineResponse4xx326Messages, inlineResponse4xx326.inlineResponse4xx326Messages) &&
        Objects.equals(this.inlineResponse4xx326Result, inlineResponse4xx326.inlineResponse4xx326Result) &&
        Objects.equals(this.inlineResponse4xx326Success, inlineResponse4xx326.inlineResponse4xx326Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx326Errors, inlineResponse4xx326Messages, inlineResponse4xx326Result, inlineResponse4xx326Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx326 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx326Errors: ").append(toIndentedString(inlineResponse4xx326Errors)).append("\n");
    sb.append("    inlineResponse4xx326Messages: ").append(toIndentedString(inlineResponse4xx326Messages)).append("\n");
    sb.append("    inlineResponse4xx326Result: ").append(toIndentedString(inlineResponse4xx326Result)).append("\n");
    sb.append("    inlineResponse4xx326Success: ").append(toIndentedString(inlineResponse4xx326Success)).append("\n");
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