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
import io.swagger.client.model.ResponseSingleValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx317
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx317 extends ResponseSingleValue {
  @SerializedName("errors")
  private Object inlineResponse4xx317Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx317Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx317Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx317Success = null;

  public InlineResponse4xx317 inlineResponse4xx317Errors(Object inlineResponse4xx317Errors) {
    this.inlineResponse4xx317Errors = inlineResponse4xx317Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx317Errors
   * @return inlineResponse4xx317Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx317Errors() {
    return inlineResponse4xx317Errors;
  }

  public void setInlineResponse4xx317Errors(Object inlineResponse4xx317Errors) {
    this.inlineResponse4xx317Errors = inlineResponse4xx317Errors;
  }

  public InlineResponse4xx317 inlineResponse4xx317Messages(Object inlineResponse4xx317Messages) {
    this.inlineResponse4xx317Messages = inlineResponse4xx317Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx317Messages
   * @return inlineResponse4xx317Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx317Messages() {
    return inlineResponse4xx317Messages;
  }

  public void setInlineResponse4xx317Messages(Object inlineResponse4xx317Messages) {
    this.inlineResponse4xx317Messages = inlineResponse4xx317Messages;
  }

  public InlineResponse4xx317 inlineResponse4xx317Result(Object inlineResponse4xx317Result) {
    this.inlineResponse4xx317Result = inlineResponse4xx317Result;
    return this;
  }

   /**
   * Get inlineResponse4xx317Result
   * @return inlineResponse4xx317Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx317Result() {
    return inlineResponse4xx317Result;
  }

  public void setInlineResponse4xx317Result(Object inlineResponse4xx317Result) {
    this.inlineResponse4xx317Result = inlineResponse4xx317Result;
  }

  public InlineResponse4xx317 inlineResponse4xx317Success(Boolean inlineResponse4xx317Success) {
    this.inlineResponse4xx317Success = inlineResponse4xx317Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx317Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx317Success() {
    return inlineResponse4xx317Success;
  }

  public void setInlineResponse4xx317Success(Boolean inlineResponse4xx317Success) {
    this.inlineResponse4xx317Success = inlineResponse4xx317Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx317 inlineResponse4xx317 = (InlineResponse4xx317) o;
    return Objects.equals(this.inlineResponse4xx317Errors, inlineResponse4xx317.inlineResponse4xx317Errors) &&
        Objects.equals(this.inlineResponse4xx317Messages, inlineResponse4xx317.inlineResponse4xx317Messages) &&
        Objects.equals(this.inlineResponse4xx317Result, inlineResponse4xx317.inlineResponse4xx317Result) &&
        Objects.equals(this.inlineResponse4xx317Success, inlineResponse4xx317.inlineResponse4xx317Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx317Errors, inlineResponse4xx317Messages, inlineResponse4xx317Result, inlineResponse4xx317Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx317 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx317Errors: ").append(toIndentedString(inlineResponse4xx317Errors)).append("\n");
    sb.append("    inlineResponse4xx317Messages: ").append(toIndentedString(inlineResponse4xx317Messages)).append("\n");
    sb.append("    inlineResponse4xx317Result: ").append(toIndentedString(inlineResponse4xx317Result)).append("\n");
    sb.append("    inlineResponse4xx317Success: ").append(toIndentedString(inlineResponse4xx317Success)).append("\n");
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