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
import io.swagger.client.model.HostnameAopResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx399
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx399 extends HostnameAopResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx399Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx399Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx399Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx399Success = null;

  public InlineResponse4xx399 inlineResponse4xx399Errors(Object inlineResponse4xx399Errors) {
    this.inlineResponse4xx399Errors = inlineResponse4xx399Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx399Errors
   * @return inlineResponse4xx399Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx399Errors() {
    return inlineResponse4xx399Errors;
  }

  public void setInlineResponse4xx399Errors(Object inlineResponse4xx399Errors) {
    this.inlineResponse4xx399Errors = inlineResponse4xx399Errors;
  }

  public InlineResponse4xx399 inlineResponse4xx399Messages(Object inlineResponse4xx399Messages) {
    this.inlineResponse4xx399Messages = inlineResponse4xx399Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx399Messages
   * @return inlineResponse4xx399Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx399Messages() {
    return inlineResponse4xx399Messages;
  }

  public void setInlineResponse4xx399Messages(Object inlineResponse4xx399Messages) {
    this.inlineResponse4xx399Messages = inlineResponse4xx399Messages;
  }

  public InlineResponse4xx399 inlineResponse4xx399Result(Object inlineResponse4xx399Result) {
    this.inlineResponse4xx399Result = inlineResponse4xx399Result;
    return this;
  }

   /**
   * Get inlineResponse4xx399Result
   * @return inlineResponse4xx399Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx399Result() {
    return inlineResponse4xx399Result;
  }

  public void setInlineResponse4xx399Result(Object inlineResponse4xx399Result) {
    this.inlineResponse4xx399Result = inlineResponse4xx399Result;
  }

  public InlineResponse4xx399 inlineResponse4xx399Success(Boolean inlineResponse4xx399Success) {
    this.inlineResponse4xx399Success = inlineResponse4xx399Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx399Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx399Success() {
    return inlineResponse4xx399Success;
  }

  public void setInlineResponse4xx399Success(Boolean inlineResponse4xx399Success) {
    this.inlineResponse4xx399Success = inlineResponse4xx399Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx399 inlineResponse4xx399 = (InlineResponse4xx399) o;
    return Objects.equals(this.inlineResponse4xx399Errors, inlineResponse4xx399.inlineResponse4xx399Errors) &&
        Objects.equals(this.inlineResponse4xx399Messages, inlineResponse4xx399.inlineResponse4xx399Messages) &&
        Objects.equals(this.inlineResponse4xx399Result, inlineResponse4xx399.inlineResponse4xx399Result) &&
        Objects.equals(this.inlineResponse4xx399Success, inlineResponse4xx399.inlineResponse4xx399Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx399Errors, inlineResponse4xx399Messages, inlineResponse4xx399Result, inlineResponse4xx399Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx399 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx399Errors: ").append(toIndentedString(inlineResponse4xx399Errors)).append("\n");
    sb.append("    inlineResponse4xx399Messages: ").append(toIndentedString(inlineResponse4xx399Messages)).append("\n");
    sb.append("    inlineResponse4xx399Result: ").append(toIndentedString(inlineResponse4xx399Result)).append("\n");
    sb.append("    inlineResponse4xx399Success: ").append(toIndentedString(inlineResponse4xx399Success)).append("\n");
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
