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
import io.swagger.client.model.CustomHostnameResponseSingle;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx350
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx350 extends CustomHostnameResponseSingle {
  @SerializedName("errors")
  private Object inlineResponse4xx350Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx350Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx350Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx350Success = null;

  public InlineResponse4xx350 inlineResponse4xx350Errors(Object inlineResponse4xx350Errors) {
    this.inlineResponse4xx350Errors = inlineResponse4xx350Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx350Errors
   * @return inlineResponse4xx350Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx350Errors() {
    return inlineResponse4xx350Errors;
  }

  public void setInlineResponse4xx350Errors(Object inlineResponse4xx350Errors) {
    this.inlineResponse4xx350Errors = inlineResponse4xx350Errors;
  }

  public InlineResponse4xx350 inlineResponse4xx350Messages(Object inlineResponse4xx350Messages) {
    this.inlineResponse4xx350Messages = inlineResponse4xx350Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx350Messages
   * @return inlineResponse4xx350Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx350Messages() {
    return inlineResponse4xx350Messages;
  }

  public void setInlineResponse4xx350Messages(Object inlineResponse4xx350Messages) {
    this.inlineResponse4xx350Messages = inlineResponse4xx350Messages;
  }

  public InlineResponse4xx350 inlineResponse4xx350Result(Object inlineResponse4xx350Result) {
    this.inlineResponse4xx350Result = inlineResponse4xx350Result;
    return this;
  }

   /**
   * Get inlineResponse4xx350Result
   * @return inlineResponse4xx350Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx350Result() {
    return inlineResponse4xx350Result;
  }

  public void setInlineResponse4xx350Result(Object inlineResponse4xx350Result) {
    this.inlineResponse4xx350Result = inlineResponse4xx350Result;
  }

  public InlineResponse4xx350 inlineResponse4xx350Success(Boolean inlineResponse4xx350Success) {
    this.inlineResponse4xx350Success = inlineResponse4xx350Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx350Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx350Success() {
    return inlineResponse4xx350Success;
  }

  public void setInlineResponse4xx350Success(Boolean inlineResponse4xx350Success) {
    this.inlineResponse4xx350Success = inlineResponse4xx350Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx350 inlineResponse4xx350 = (InlineResponse4xx350) o;
    return Objects.equals(this.inlineResponse4xx350Errors, inlineResponse4xx350.inlineResponse4xx350Errors) &&
        Objects.equals(this.inlineResponse4xx350Messages, inlineResponse4xx350.inlineResponse4xx350Messages) &&
        Objects.equals(this.inlineResponse4xx350Result, inlineResponse4xx350.inlineResponse4xx350Result) &&
        Objects.equals(this.inlineResponse4xx350Success, inlineResponse4xx350.inlineResponse4xx350Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx350Errors, inlineResponse4xx350Messages, inlineResponse4xx350Result, inlineResponse4xx350Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx350 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx350Errors: ").append(toIndentedString(inlineResponse4xx350Errors)).append("\n");
    sb.append("    inlineResponse4xx350Messages: ").append(toIndentedString(inlineResponse4xx350Messages)).append("\n");
    sb.append("    inlineResponse4xx350Result: ").append(toIndentedString(inlineResponse4xx350Result)).append("\n");
    sb.append("    inlineResponse4xx350Success: ").append(toIndentedString(inlineResponse4xx350Success)).append("\n");
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
