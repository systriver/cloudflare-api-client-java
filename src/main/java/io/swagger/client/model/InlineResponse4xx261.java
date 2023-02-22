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
import io.swagger.client.model.DevicePostureRulesComponentsSchemasIdResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx261
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx261 extends DevicePostureRulesComponentsSchemasIdResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx261Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx261Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx261Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx261Success = null;

  public InlineResponse4xx261 inlineResponse4xx261Errors(Object inlineResponse4xx261Errors) {
    this.inlineResponse4xx261Errors = inlineResponse4xx261Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx261Errors
   * @return inlineResponse4xx261Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx261Errors() {
    return inlineResponse4xx261Errors;
  }

  public void setInlineResponse4xx261Errors(Object inlineResponse4xx261Errors) {
    this.inlineResponse4xx261Errors = inlineResponse4xx261Errors;
  }

  public InlineResponse4xx261 inlineResponse4xx261Messages(Object inlineResponse4xx261Messages) {
    this.inlineResponse4xx261Messages = inlineResponse4xx261Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx261Messages
   * @return inlineResponse4xx261Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx261Messages() {
    return inlineResponse4xx261Messages;
  }

  public void setInlineResponse4xx261Messages(Object inlineResponse4xx261Messages) {
    this.inlineResponse4xx261Messages = inlineResponse4xx261Messages;
  }

  public InlineResponse4xx261 inlineResponse4xx261Result(Object inlineResponse4xx261Result) {
    this.inlineResponse4xx261Result = inlineResponse4xx261Result;
    return this;
  }

   /**
   * Get inlineResponse4xx261Result
   * @return inlineResponse4xx261Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx261Result() {
    return inlineResponse4xx261Result;
  }

  public void setInlineResponse4xx261Result(Object inlineResponse4xx261Result) {
    this.inlineResponse4xx261Result = inlineResponse4xx261Result;
  }

  public InlineResponse4xx261 inlineResponse4xx261Success(Boolean inlineResponse4xx261Success) {
    this.inlineResponse4xx261Success = inlineResponse4xx261Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx261Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx261Success() {
    return inlineResponse4xx261Success;
  }

  public void setInlineResponse4xx261Success(Boolean inlineResponse4xx261Success) {
    this.inlineResponse4xx261Success = inlineResponse4xx261Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx261 inlineResponse4xx261 = (InlineResponse4xx261) o;
    return Objects.equals(this.inlineResponse4xx261Errors, inlineResponse4xx261.inlineResponse4xx261Errors) &&
        Objects.equals(this.inlineResponse4xx261Messages, inlineResponse4xx261.inlineResponse4xx261Messages) &&
        Objects.equals(this.inlineResponse4xx261Result, inlineResponse4xx261.inlineResponse4xx261Result) &&
        Objects.equals(this.inlineResponse4xx261Success, inlineResponse4xx261.inlineResponse4xx261Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx261Errors, inlineResponse4xx261Messages, inlineResponse4xx261Result, inlineResponse4xx261Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx261 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx261Errors: ").append(toIndentedString(inlineResponse4xx261Errors)).append("\n");
    sb.append("    inlineResponse4xx261Messages: ").append(toIndentedString(inlineResponse4xx261Messages)).append("\n");
    sb.append("    inlineResponse4xx261Result: ").append(toIndentedString(inlineResponse4xx261Result)).append("\n");
    sb.append("    inlineResponse4xx261Success: ").append(toIndentedString(inlineResponse4xx261Success)).append("\n");
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