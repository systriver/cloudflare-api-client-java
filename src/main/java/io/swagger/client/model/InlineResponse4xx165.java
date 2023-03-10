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
import io.swagger.client.model.RouteResponseSingle;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx165
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx165 extends RouteResponseSingle {
  @SerializedName("errors")
  private Object inlineResponse4xx165Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx165Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx165Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx165Success = null;

  public InlineResponse4xx165 inlineResponse4xx165Errors(Object inlineResponse4xx165Errors) {
    this.inlineResponse4xx165Errors = inlineResponse4xx165Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx165Errors
   * @return inlineResponse4xx165Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx165Errors() {
    return inlineResponse4xx165Errors;
  }

  public void setInlineResponse4xx165Errors(Object inlineResponse4xx165Errors) {
    this.inlineResponse4xx165Errors = inlineResponse4xx165Errors;
  }

  public InlineResponse4xx165 inlineResponse4xx165Messages(Object inlineResponse4xx165Messages) {
    this.inlineResponse4xx165Messages = inlineResponse4xx165Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx165Messages
   * @return inlineResponse4xx165Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx165Messages() {
    return inlineResponse4xx165Messages;
  }

  public void setInlineResponse4xx165Messages(Object inlineResponse4xx165Messages) {
    this.inlineResponse4xx165Messages = inlineResponse4xx165Messages;
  }

  public InlineResponse4xx165 inlineResponse4xx165Result(Object inlineResponse4xx165Result) {
    this.inlineResponse4xx165Result = inlineResponse4xx165Result;
    return this;
  }

   /**
   * Get inlineResponse4xx165Result
   * @return inlineResponse4xx165Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx165Result() {
    return inlineResponse4xx165Result;
  }

  public void setInlineResponse4xx165Result(Object inlineResponse4xx165Result) {
    this.inlineResponse4xx165Result = inlineResponse4xx165Result;
  }

  public InlineResponse4xx165 inlineResponse4xx165Success(Boolean inlineResponse4xx165Success) {
    this.inlineResponse4xx165Success = inlineResponse4xx165Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx165Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx165Success() {
    return inlineResponse4xx165Success;
  }

  public void setInlineResponse4xx165Success(Boolean inlineResponse4xx165Success) {
    this.inlineResponse4xx165Success = inlineResponse4xx165Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx165 inlineResponse4xx165 = (InlineResponse4xx165) o;
    return Objects.equals(this.inlineResponse4xx165Errors, inlineResponse4xx165.inlineResponse4xx165Errors) &&
        Objects.equals(this.inlineResponse4xx165Messages, inlineResponse4xx165.inlineResponse4xx165Messages) &&
        Objects.equals(this.inlineResponse4xx165Result, inlineResponse4xx165.inlineResponse4xx165Result) &&
        Objects.equals(this.inlineResponse4xx165Success, inlineResponse4xx165.inlineResponse4xx165Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx165Errors, inlineResponse4xx165Messages, inlineResponse4xx165Result, inlineResponse4xx165Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx165 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx165Errors: ").append(toIndentedString(inlineResponse4xx165Errors)).append("\n");
    sb.append("    inlineResponse4xx165Messages: ").append(toIndentedString(inlineResponse4xx165Messages)).append("\n");
    sb.append("    inlineResponse4xx165Result: ").append(toIndentedString(inlineResponse4xx165Result)).append("\n");
    sb.append("    inlineResponse4xx165Success: ").append(toIndentedString(inlineResponse4xx165Success)).append("\n");
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
