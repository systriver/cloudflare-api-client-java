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
import io.swagger.client.model.CaComponentsSchemasSingleResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx207
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx207 extends CaComponentsSchemasSingleResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx207Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx207Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx207Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx207Success = null;

  public InlineResponse4xx207 inlineResponse4xx207Errors(Object inlineResponse4xx207Errors) {
    this.inlineResponse4xx207Errors = inlineResponse4xx207Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx207Errors
   * @return inlineResponse4xx207Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx207Errors() {
    return inlineResponse4xx207Errors;
  }

  public void setInlineResponse4xx207Errors(Object inlineResponse4xx207Errors) {
    this.inlineResponse4xx207Errors = inlineResponse4xx207Errors;
  }

  public InlineResponse4xx207 inlineResponse4xx207Messages(Object inlineResponse4xx207Messages) {
    this.inlineResponse4xx207Messages = inlineResponse4xx207Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx207Messages
   * @return inlineResponse4xx207Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx207Messages() {
    return inlineResponse4xx207Messages;
  }

  public void setInlineResponse4xx207Messages(Object inlineResponse4xx207Messages) {
    this.inlineResponse4xx207Messages = inlineResponse4xx207Messages;
  }

  public InlineResponse4xx207 inlineResponse4xx207Result(Object inlineResponse4xx207Result) {
    this.inlineResponse4xx207Result = inlineResponse4xx207Result;
    return this;
  }

   /**
   * Get inlineResponse4xx207Result
   * @return inlineResponse4xx207Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx207Result() {
    return inlineResponse4xx207Result;
  }

  public void setInlineResponse4xx207Result(Object inlineResponse4xx207Result) {
    this.inlineResponse4xx207Result = inlineResponse4xx207Result;
  }

  public InlineResponse4xx207 inlineResponse4xx207Success(Boolean inlineResponse4xx207Success) {
    this.inlineResponse4xx207Success = inlineResponse4xx207Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx207Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx207Success() {
    return inlineResponse4xx207Success;
  }

  public void setInlineResponse4xx207Success(Boolean inlineResponse4xx207Success) {
    this.inlineResponse4xx207Success = inlineResponse4xx207Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx207 inlineResponse4xx207 = (InlineResponse4xx207) o;
    return Objects.equals(this.inlineResponse4xx207Errors, inlineResponse4xx207.inlineResponse4xx207Errors) &&
        Objects.equals(this.inlineResponse4xx207Messages, inlineResponse4xx207.inlineResponse4xx207Messages) &&
        Objects.equals(this.inlineResponse4xx207Result, inlineResponse4xx207.inlineResponse4xx207Result) &&
        Objects.equals(this.inlineResponse4xx207Success, inlineResponse4xx207.inlineResponse4xx207Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx207Errors, inlineResponse4xx207Messages, inlineResponse4xx207Result, inlineResponse4xx207Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx207 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx207Errors: ").append(toIndentedString(inlineResponse4xx207Errors)).append("\n");
    sb.append("    inlineResponse4xx207Messages: ").append(toIndentedString(inlineResponse4xx207Messages)).append("\n");
    sb.append("    inlineResponse4xx207Result: ").append(toIndentedString(inlineResponse4xx207Result)).append("\n");
    sb.append("    inlineResponse4xx207Success: ").append(toIndentedString(inlineResponse4xx207Success)).append("\n");
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