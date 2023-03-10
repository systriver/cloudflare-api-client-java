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
import io.swagger.client.model.DeviceResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx263
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx263 extends DeviceResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx263Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx263Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx263Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx263Success = null;

  public InlineResponse4xx263 inlineResponse4xx263Errors(Object inlineResponse4xx263Errors) {
    this.inlineResponse4xx263Errors = inlineResponse4xx263Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx263Errors
   * @return inlineResponse4xx263Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx263Errors() {
    return inlineResponse4xx263Errors;
  }

  public void setInlineResponse4xx263Errors(Object inlineResponse4xx263Errors) {
    this.inlineResponse4xx263Errors = inlineResponse4xx263Errors;
  }

  public InlineResponse4xx263 inlineResponse4xx263Messages(Object inlineResponse4xx263Messages) {
    this.inlineResponse4xx263Messages = inlineResponse4xx263Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx263Messages
   * @return inlineResponse4xx263Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx263Messages() {
    return inlineResponse4xx263Messages;
  }

  public void setInlineResponse4xx263Messages(Object inlineResponse4xx263Messages) {
    this.inlineResponse4xx263Messages = inlineResponse4xx263Messages;
  }

  public InlineResponse4xx263 inlineResponse4xx263Result(Object inlineResponse4xx263Result) {
    this.inlineResponse4xx263Result = inlineResponse4xx263Result;
    return this;
  }

   /**
   * Get inlineResponse4xx263Result
   * @return inlineResponse4xx263Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx263Result() {
    return inlineResponse4xx263Result;
  }

  public void setInlineResponse4xx263Result(Object inlineResponse4xx263Result) {
    this.inlineResponse4xx263Result = inlineResponse4xx263Result;
  }

  public InlineResponse4xx263 inlineResponse4xx263Success(Boolean inlineResponse4xx263Success) {
    this.inlineResponse4xx263Success = inlineResponse4xx263Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx263Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx263Success() {
    return inlineResponse4xx263Success;
  }

  public void setInlineResponse4xx263Success(Boolean inlineResponse4xx263Success) {
    this.inlineResponse4xx263Success = inlineResponse4xx263Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx263 inlineResponse4xx263 = (InlineResponse4xx263) o;
    return Objects.equals(this.inlineResponse4xx263Errors, inlineResponse4xx263.inlineResponse4xx263Errors) &&
        Objects.equals(this.inlineResponse4xx263Messages, inlineResponse4xx263.inlineResponse4xx263Messages) &&
        Objects.equals(this.inlineResponse4xx263Result, inlineResponse4xx263.inlineResponse4xx263Result) &&
        Objects.equals(this.inlineResponse4xx263Success, inlineResponse4xx263.inlineResponse4xx263Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx263Errors, inlineResponse4xx263Messages, inlineResponse4xx263Result, inlineResponse4xx263Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx263 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx263Errors: ").append(toIndentedString(inlineResponse4xx263Errors)).append("\n");
    sb.append("    inlineResponse4xx263Messages: ").append(toIndentedString(inlineResponse4xx263Messages)).append("\n");
    sb.append("    inlineResponse4xx263Result: ").append(toIndentedString(inlineResponse4xx263Result)).append("\n");
    sb.append("    inlineResponse4xx263Success: ").append(toIndentedString(inlineResponse4xx263Success)).append("\n");
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
