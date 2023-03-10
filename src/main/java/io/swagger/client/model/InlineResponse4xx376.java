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
import io.swagger.client.model.FirewalluablockResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx376
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx376 extends FirewalluablockResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx376Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx376Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx376Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx376Success = null;

  public InlineResponse4xx376 inlineResponse4xx376Errors(Object inlineResponse4xx376Errors) {
    this.inlineResponse4xx376Errors = inlineResponse4xx376Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx376Errors
   * @return inlineResponse4xx376Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx376Errors() {
    return inlineResponse4xx376Errors;
  }

  public void setInlineResponse4xx376Errors(Object inlineResponse4xx376Errors) {
    this.inlineResponse4xx376Errors = inlineResponse4xx376Errors;
  }

  public InlineResponse4xx376 inlineResponse4xx376Messages(Object inlineResponse4xx376Messages) {
    this.inlineResponse4xx376Messages = inlineResponse4xx376Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx376Messages
   * @return inlineResponse4xx376Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx376Messages() {
    return inlineResponse4xx376Messages;
  }

  public void setInlineResponse4xx376Messages(Object inlineResponse4xx376Messages) {
    this.inlineResponse4xx376Messages = inlineResponse4xx376Messages;
  }

  public InlineResponse4xx376 inlineResponse4xx376Result(Object inlineResponse4xx376Result) {
    this.inlineResponse4xx376Result = inlineResponse4xx376Result;
    return this;
  }

   /**
   * Get inlineResponse4xx376Result
   * @return inlineResponse4xx376Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx376Result() {
    return inlineResponse4xx376Result;
  }

  public void setInlineResponse4xx376Result(Object inlineResponse4xx376Result) {
    this.inlineResponse4xx376Result = inlineResponse4xx376Result;
  }

  public InlineResponse4xx376 inlineResponse4xx376Success(Boolean inlineResponse4xx376Success) {
    this.inlineResponse4xx376Success = inlineResponse4xx376Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx376Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx376Success() {
    return inlineResponse4xx376Success;
  }

  public void setInlineResponse4xx376Success(Boolean inlineResponse4xx376Success) {
    this.inlineResponse4xx376Success = inlineResponse4xx376Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx376 inlineResponse4xx376 = (InlineResponse4xx376) o;
    return Objects.equals(this.inlineResponse4xx376Errors, inlineResponse4xx376.inlineResponse4xx376Errors) &&
        Objects.equals(this.inlineResponse4xx376Messages, inlineResponse4xx376.inlineResponse4xx376Messages) &&
        Objects.equals(this.inlineResponse4xx376Result, inlineResponse4xx376.inlineResponse4xx376Result) &&
        Objects.equals(this.inlineResponse4xx376Success, inlineResponse4xx376.inlineResponse4xx376Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx376Errors, inlineResponse4xx376Messages, inlineResponse4xx376Result, inlineResponse4xx376Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx376 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx376Errors: ").append(toIndentedString(inlineResponse4xx376Errors)).append("\n");
    sb.append("    inlineResponse4xx376Messages: ").append(toIndentedString(inlineResponse4xx376Messages)).append("\n");
    sb.append("    inlineResponse4xx376Result: ").append(toIndentedString(inlineResponse4xx376Result)).append("\n");
    sb.append("    inlineResponse4xx376Success: ").append(toIndentedString(inlineResponse4xx376Success)).append("\n");
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
