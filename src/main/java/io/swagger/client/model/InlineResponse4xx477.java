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
import io.swagger.client.model.EventResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx477
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx477 extends EventResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx477Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx477Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx477Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx477Success = null;

  public InlineResponse4xx477 inlineResponse4xx477Errors(Object inlineResponse4xx477Errors) {
    this.inlineResponse4xx477Errors = inlineResponse4xx477Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx477Errors
   * @return inlineResponse4xx477Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx477Errors() {
    return inlineResponse4xx477Errors;
  }

  public void setInlineResponse4xx477Errors(Object inlineResponse4xx477Errors) {
    this.inlineResponse4xx477Errors = inlineResponse4xx477Errors;
  }

  public InlineResponse4xx477 inlineResponse4xx477Messages(Object inlineResponse4xx477Messages) {
    this.inlineResponse4xx477Messages = inlineResponse4xx477Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx477Messages
   * @return inlineResponse4xx477Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx477Messages() {
    return inlineResponse4xx477Messages;
  }

  public void setInlineResponse4xx477Messages(Object inlineResponse4xx477Messages) {
    this.inlineResponse4xx477Messages = inlineResponse4xx477Messages;
  }

  public InlineResponse4xx477 inlineResponse4xx477Result(Object inlineResponse4xx477Result) {
    this.inlineResponse4xx477Result = inlineResponse4xx477Result;
    return this;
  }

   /**
   * Get inlineResponse4xx477Result
   * @return inlineResponse4xx477Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx477Result() {
    return inlineResponse4xx477Result;
  }

  public void setInlineResponse4xx477Result(Object inlineResponse4xx477Result) {
    this.inlineResponse4xx477Result = inlineResponse4xx477Result;
  }

  public InlineResponse4xx477 inlineResponse4xx477Success(Boolean inlineResponse4xx477Success) {
    this.inlineResponse4xx477Success = inlineResponse4xx477Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx477Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx477Success() {
    return inlineResponse4xx477Success;
  }

  public void setInlineResponse4xx477Success(Boolean inlineResponse4xx477Success) {
    this.inlineResponse4xx477Success = inlineResponse4xx477Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx477 inlineResponse4xx477 = (InlineResponse4xx477) o;
    return Objects.equals(this.inlineResponse4xx477Errors, inlineResponse4xx477.inlineResponse4xx477Errors) &&
        Objects.equals(this.inlineResponse4xx477Messages, inlineResponse4xx477.inlineResponse4xx477Messages) &&
        Objects.equals(this.inlineResponse4xx477Result, inlineResponse4xx477.inlineResponse4xx477Result) &&
        Objects.equals(this.inlineResponse4xx477Success, inlineResponse4xx477.inlineResponse4xx477Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx477Errors, inlineResponse4xx477Messages, inlineResponse4xx477Result, inlineResponse4xx477Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx477 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx477Errors: ").append(toIndentedString(inlineResponse4xx477Errors)).append("\n");
    sb.append("    inlineResponse4xx477Messages: ").append(toIndentedString(inlineResponse4xx477Messages)).append("\n");
    sb.append("    inlineResponse4xx477Result: ").append(toIndentedString(inlineResponse4xx477Result)).append("\n");
    sb.append("    inlineResponse4xx477Success: ").append(toIndentedString(inlineResponse4xx477Success)).append("\n");
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