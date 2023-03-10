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
import io.swagger.client.model.ConnectionSingleResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx134
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx134 extends ConnectionSingleResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx134Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx134Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx134Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx134Success = null;

  public InlineResponse4xx134 inlineResponse4xx134Errors(Object inlineResponse4xx134Errors) {
    this.inlineResponse4xx134Errors = inlineResponse4xx134Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx134Errors
   * @return inlineResponse4xx134Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx134Errors() {
    return inlineResponse4xx134Errors;
  }

  public void setInlineResponse4xx134Errors(Object inlineResponse4xx134Errors) {
    this.inlineResponse4xx134Errors = inlineResponse4xx134Errors;
  }

  public InlineResponse4xx134 inlineResponse4xx134Messages(Object inlineResponse4xx134Messages) {
    this.inlineResponse4xx134Messages = inlineResponse4xx134Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx134Messages
   * @return inlineResponse4xx134Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx134Messages() {
    return inlineResponse4xx134Messages;
  }

  public void setInlineResponse4xx134Messages(Object inlineResponse4xx134Messages) {
    this.inlineResponse4xx134Messages = inlineResponse4xx134Messages;
  }

  public InlineResponse4xx134 inlineResponse4xx134Result(Object inlineResponse4xx134Result) {
    this.inlineResponse4xx134Result = inlineResponse4xx134Result;
    return this;
  }

   /**
   * Get inlineResponse4xx134Result
   * @return inlineResponse4xx134Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx134Result() {
    return inlineResponse4xx134Result;
  }

  public void setInlineResponse4xx134Result(Object inlineResponse4xx134Result) {
    this.inlineResponse4xx134Result = inlineResponse4xx134Result;
  }

  public InlineResponse4xx134 inlineResponse4xx134Success(Boolean inlineResponse4xx134Success) {
    this.inlineResponse4xx134Success = inlineResponse4xx134Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx134Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx134Success() {
    return inlineResponse4xx134Success;
  }

  public void setInlineResponse4xx134Success(Boolean inlineResponse4xx134Success) {
    this.inlineResponse4xx134Success = inlineResponse4xx134Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx134 inlineResponse4xx134 = (InlineResponse4xx134) o;
    return Objects.equals(this.inlineResponse4xx134Errors, inlineResponse4xx134.inlineResponse4xx134Errors) &&
        Objects.equals(this.inlineResponse4xx134Messages, inlineResponse4xx134.inlineResponse4xx134Messages) &&
        Objects.equals(this.inlineResponse4xx134Result, inlineResponse4xx134.inlineResponse4xx134Result) &&
        Objects.equals(this.inlineResponse4xx134Success, inlineResponse4xx134.inlineResponse4xx134Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx134Errors, inlineResponse4xx134Messages, inlineResponse4xx134Result, inlineResponse4xx134Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx134 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx134Errors: ").append(toIndentedString(inlineResponse4xx134Errors)).append("\n");
    sb.append("    inlineResponse4xx134Messages: ").append(toIndentedString(inlineResponse4xx134Messages)).append("\n");
    sb.append("    inlineResponse4xx134Result: ").append(toIndentedString(inlineResponse4xx134Result)).append("\n");
    sb.append("    inlineResponse4xx134Success: ").append(toIndentedString(inlineResponse4xx134Success)).append("\n");
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
