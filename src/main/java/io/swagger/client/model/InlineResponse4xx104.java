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
import io.swagger.client.model.RouteSingleResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx104
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx104 extends RouteSingleResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx104Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx104Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx104Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx104Success = null;

  public InlineResponse4xx104 inlineResponse4xx104Errors(Object inlineResponse4xx104Errors) {
    this.inlineResponse4xx104Errors = inlineResponse4xx104Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx104Errors
   * @return inlineResponse4xx104Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx104Errors() {
    return inlineResponse4xx104Errors;
  }

  public void setInlineResponse4xx104Errors(Object inlineResponse4xx104Errors) {
    this.inlineResponse4xx104Errors = inlineResponse4xx104Errors;
  }

  public InlineResponse4xx104 inlineResponse4xx104Messages(Object inlineResponse4xx104Messages) {
    this.inlineResponse4xx104Messages = inlineResponse4xx104Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx104Messages
   * @return inlineResponse4xx104Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx104Messages() {
    return inlineResponse4xx104Messages;
  }

  public void setInlineResponse4xx104Messages(Object inlineResponse4xx104Messages) {
    this.inlineResponse4xx104Messages = inlineResponse4xx104Messages;
  }

  public InlineResponse4xx104 inlineResponse4xx104Result(Object inlineResponse4xx104Result) {
    this.inlineResponse4xx104Result = inlineResponse4xx104Result;
    return this;
  }

   /**
   * Get inlineResponse4xx104Result
   * @return inlineResponse4xx104Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx104Result() {
    return inlineResponse4xx104Result;
  }

  public void setInlineResponse4xx104Result(Object inlineResponse4xx104Result) {
    this.inlineResponse4xx104Result = inlineResponse4xx104Result;
  }

  public InlineResponse4xx104 inlineResponse4xx104Success(Boolean inlineResponse4xx104Success) {
    this.inlineResponse4xx104Success = inlineResponse4xx104Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx104Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx104Success() {
    return inlineResponse4xx104Success;
  }

  public void setInlineResponse4xx104Success(Boolean inlineResponse4xx104Success) {
    this.inlineResponse4xx104Success = inlineResponse4xx104Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx104 inlineResponse4xx104 = (InlineResponse4xx104) o;
    return Objects.equals(this.inlineResponse4xx104Errors, inlineResponse4xx104.inlineResponse4xx104Errors) &&
        Objects.equals(this.inlineResponse4xx104Messages, inlineResponse4xx104.inlineResponse4xx104Messages) &&
        Objects.equals(this.inlineResponse4xx104Result, inlineResponse4xx104.inlineResponse4xx104Result) &&
        Objects.equals(this.inlineResponse4xx104Success, inlineResponse4xx104.inlineResponse4xx104Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx104Errors, inlineResponse4xx104Messages, inlineResponse4xx104Result, inlineResponse4xx104Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx104 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx104Errors: ").append(toIndentedString(inlineResponse4xx104Errors)).append("\n");
    sb.append("    inlineResponse4xx104Messages: ").append(toIndentedString(inlineResponse4xx104Messages)).append("\n");
    sb.append("    inlineResponse4xx104Result: ").append(toIndentedString(inlineResponse4xx104Result)).append("\n");
    sb.append("    inlineResponse4xx104Success: ").append(toIndentedString(inlineResponse4xx104Success)).append("\n");
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
