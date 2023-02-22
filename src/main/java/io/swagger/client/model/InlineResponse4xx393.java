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
import io.swagger.client.model.InstantLogsJobResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx393
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx393 extends InstantLogsJobResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx393Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx393Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx393Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx393Success = null;

  public InlineResponse4xx393 inlineResponse4xx393Errors(Object inlineResponse4xx393Errors) {
    this.inlineResponse4xx393Errors = inlineResponse4xx393Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx393Errors
   * @return inlineResponse4xx393Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx393Errors() {
    return inlineResponse4xx393Errors;
  }

  public void setInlineResponse4xx393Errors(Object inlineResponse4xx393Errors) {
    this.inlineResponse4xx393Errors = inlineResponse4xx393Errors;
  }

  public InlineResponse4xx393 inlineResponse4xx393Messages(Object inlineResponse4xx393Messages) {
    this.inlineResponse4xx393Messages = inlineResponse4xx393Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx393Messages
   * @return inlineResponse4xx393Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx393Messages() {
    return inlineResponse4xx393Messages;
  }

  public void setInlineResponse4xx393Messages(Object inlineResponse4xx393Messages) {
    this.inlineResponse4xx393Messages = inlineResponse4xx393Messages;
  }

  public InlineResponse4xx393 inlineResponse4xx393Result(Object inlineResponse4xx393Result) {
    this.inlineResponse4xx393Result = inlineResponse4xx393Result;
    return this;
  }

   /**
   * Get inlineResponse4xx393Result
   * @return inlineResponse4xx393Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx393Result() {
    return inlineResponse4xx393Result;
  }

  public void setInlineResponse4xx393Result(Object inlineResponse4xx393Result) {
    this.inlineResponse4xx393Result = inlineResponse4xx393Result;
  }

  public InlineResponse4xx393 inlineResponse4xx393Success(Boolean inlineResponse4xx393Success) {
    this.inlineResponse4xx393Success = inlineResponse4xx393Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx393Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx393Success() {
    return inlineResponse4xx393Success;
  }

  public void setInlineResponse4xx393Success(Boolean inlineResponse4xx393Success) {
    this.inlineResponse4xx393Success = inlineResponse4xx393Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx393 inlineResponse4xx393 = (InlineResponse4xx393) o;
    return Objects.equals(this.inlineResponse4xx393Errors, inlineResponse4xx393.inlineResponse4xx393Errors) &&
        Objects.equals(this.inlineResponse4xx393Messages, inlineResponse4xx393.inlineResponse4xx393Messages) &&
        Objects.equals(this.inlineResponse4xx393Result, inlineResponse4xx393.inlineResponse4xx393Result) &&
        Objects.equals(this.inlineResponse4xx393Success, inlineResponse4xx393.inlineResponse4xx393Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx393Errors, inlineResponse4xx393Messages, inlineResponse4xx393Result, inlineResponse4xx393Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx393 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx393Errors: ").append(toIndentedString(inlineResponse4xx393Errors)).append("\n");
    sb.append("    inlineResponse4xx393Messages: ").append(toIndentedString(inlineResponse4xx393Messages)).append("\n");
    sb.append("    inlineResponse4xx393Result: ").append(toIndentedString(inlineResponse4xx393Result)).append("\n");
    sb.append("    inlineResponse4xx393Success: ").append(toIndentedString(inlineResponse4xx393Success)).append("\n");
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
