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
import io.swagger.client.model.SslValidationMethodResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx472
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx472 extends SslValidationMethodResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx472Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx472Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx472Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx472Success = null;

  public InlineResponse4xx472 inlineResponse4xx472Errors(Object inlineResponse4xx472Errors) {
    this.inlineResponse4xx472Errors = inlineResponse4xx472Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx472Errors
   * @return inlineResponse4xx472Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx472Errors() {
    return inlineResponse4xx472Errors;
  }

  public void setInlineResponse4xx472Errors(Object inlineResponse4xx472Errors) {
    this.inlineResponse4xx472Errors = inlineResponse4xx472Errors;
  }

  public InlineResponse4xx472 inlineResponse4xx472Messages(Object inlineResponse4xx472Messages) {
    this.inlineResponse4xx472Messages = inlineResponse4xx472Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx472Messages
   * @return inlineResponse4xx472Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx472Messages() {
    return inlineResponse4xx472Messages;
  }

  public void setInlineResponse4xx472Messages(Object inlineResponse4xx472Messages) {
    this.inlineResponse4xx472Messages = inlineResponse4xx472Messages;
  }

  public InlineResponse4xx472 inlineResponse4xx472Result(Object inlineResponse4xx472Result) {
    this.inlineResponse4xx472Result = inlineResponse4xx472Result;
    return this;
  }

   /**
   * Get inlineResponse4xx472Result
   * @return inlineResponse4xx472Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx472Result() {
    return inlineResponse4xx472Result;
  }

  public void setInlineResponse4xx472Result(Object inlineResponse4xx472Result) {
    this.inlineResponse4xx472Result = inlineResponse4xx472Result;
  }

  public InlineResponse4xx472 inlineResponse4xx472Success(Boolean inlineResponse4xx472Success) {
    this.inlineResponse4xx472Success = inlineResponse4xx472Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx472Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx472Success() {
    return inlineResponse4xx472Success;
  }

  public void setInlineResponse4xx472Success(Boolean inlineResponse4xx472Success) {
    this.inlineResponse4xx472Success = inlineResponse4xx472Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx472 inlineResponse4xx472 = (InlineResponse4xx472) o;
    return Objects.equals(this.inlineResponse4xx472Errors, inlineResponse4xx472.inlineResponse4xx472Errors) &&
        Objects.equals(this.inlineResponse4xx472Messages, inlineResponse4xx472.inlineResponse4xx472Messages) &&
        Objects.equals(this.inlineResponse4xx472Result, inlineResponse4xx472.inlineResponse4xx472Result) &&
        Objects.equals(this.inlineResponse4xx472Success, inlineResponse4xx472.inlineResponse4xx472Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx472Errors, inlineResponse4xx472Messages, inlineResponse4xx472Result, inlineResponse4xx472Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx472 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx472Errors: ").append(toIndentedString(inlineResponse4xx472Errors)).append("\n");
    sb.append("    inlineResponse4xx472Messages: ").append(toIndentedString(inlineResponse4xx472Messages)).append("\n");
    sb.append("    inlineResponse4xx472Result: ").append(toIndentedString(inlineResponse4xx472Result)).append("\n");
    sb.append("    inlineResponse4xx472Success: ").append(toIndentedString(inlineResponse4xx472Success)).append("\n");
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
