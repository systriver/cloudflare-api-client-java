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
import io.swagger.client.model.ContentListDetailsResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx485
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx485 extends ContentListDetailsResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx485Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx485Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx485Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx485Success = null;

  public InlineResponse4xx485 inlineResponse4xx485Errors(Object inlineResponse4xx485Errors) {
    this.inlineResponse4xx485Errors = inlineResponse4xx485Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx485Errors
   * @return inlineResponse4xx485Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx485Errors() {
    return inlineResponse4xx485Errors;
  }

  public void setInlineResponse4xx485Errors(Object inlineResponse4xx485Errors) {
    this.inlineResponse4xx485Errors = inlineResponse4xx485Errors;
  }

  public InlineResponse4xx485 inlineResponse4xx485Messages(Object inlineResponse4xx485Messages) {
    this.inlineResponse4xx485Messages = inlineResponse4xx485Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx485Messages
   * @return inlineResponse4xx485Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx485Messages() {
    return inlineResponse4xx485Messages;
  }

  public void setInlineResponse4xx485Messages(Object inlineResponse4xx485Messages) {
    this.inlineResponse4xx485Messages = inlineResponse4xx485Messages;
  }

  public InlineResponse4xx485 inlineResponse4xx485Result(Object inlineResponse4xx485Result) {
    this.inlineResponse4xx485Result = inlineResponse4xx485Result;
    return this;
  }

   /**
   * Get inlineResponse4xx485Result
   * @return inlineResponse4xx485Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx485Result() {
    return inlineResponse4xx485Result;
  }

  public void setInlineResponse4xx485Result(Object inlineResponse4xx485Result) {
    this.inlineResponse4xx485Result = inlineResponse4xx485Result;
  }

  public InlineResponse4xx485 inlineResponse4xx485Success(Boolean inlineResponse4xx485Success) {
    this.inlineResponse4xx485Success = inlineResponse4xx485Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx485Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx485Success() {
    return inlineResponse4xx485Success;
  }

  public void setInlineResponse4xx485Success(Boolean inlineResponse4xx485Success) {
    this.inlineResponse4xx485Success = inlineResponse4xx485Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx485 inlineResponse4xx485 = (InlineResponse4xx485) o;
    return Objects.equals(this.inlineResponse4xx485Errors, inlineResponse4xx485.inlineResponse4xx485Errors) &&
        Objects.equals(this.inlineResponse4xx485Messages, inlineResponse4xx485.inlineResponse4xx485Messages) &&
        Objects.equals(this.inlineResponse4xx485Result, inlineResponse4xx485.inlineResponse4xx485Result) &&
        Objects.equals(this.inlineResponse4xx485Success, inlineResponse4xx485.inlineResponse4xx485Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx485Errors, inlineResponse4xx485Messages, inlineResponse4xx485Result, inlineResponse4xx485Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx485 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx485Errors: ").append(toIndentedString(inlineResponse4xx485Errors)).append("\n");
    sb.append("    inlineResponse4xx485Messages: ").append(toIndentedString(inlineResponse4xx485Messages)).append("\n");
    sb.append("    inlineResponse4xx485Result: ").append(toIndentedString(inlineResponse4xx485Result)).append("\n");
    sb.append("    inlineResponse4xx485Success: ").append(toIndentedString(inlineResponse4xx485Success)).append("\n");
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