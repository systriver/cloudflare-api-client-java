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
import io.swagger.client.model.AppsComponentsSchemasResponseCollection2;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx322
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx322 extends AppsComponentsSchemasResponseCollection2 {
  @SerializedName("errors")
  private Object inlineResponse4xx322Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx322Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx322Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx322Success = null;

  public InlineResponse4xx322 inlineResponse4xx322Errors(Object inlineResponse4xx322Errors) {
    this.inlineResponse4xx322Errors = inlineResponse4xx322Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx322Errors
   * @return inlineResponse4xx322Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx322Errors() {
    return inlineResponse4xx322Errors;
  }

  public void setInlineResponse4xx322Errors(Object inlineResponse4xx322Errors) {
    this.inlineResponse4xx322Errors = inlineResponse4xx322Errors;
  }

  public InlineResponse4xx322 inlineResponse4xx322Messages(Object inlineResponse4xx322Messages) {
    this.inlineResponse4xx322Messages = inlineResponse4xx322Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx322Messages
   * @return inlineResponse4xx322Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx322Messages() {
    return inlineResponse4xx322Messages;
  }

  public void setInlineResponse4xx322Messages(Object inlineResponse4xx322Messages) {
    this.inlineResponse4xx322Messages = inlineResponse4xx322Messages;
  }

  public InlineResponse4xx322 inlineResponse4xx322Result(Object inlineResponse4xx322Result) {
    this.inlineResponse4xx322Result = inlineResponse4xx322Result;
    return this;
  }

   /**
   * Get inlineResponse4xx322Result
   * @return inlineResponse4xx322Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx322Result() {
    return inlineResponse4xx322Result;
  }

  public void setInlineResponse4xx322Result(Object inlineResponse4xx322Result) {
    this.inlineResponse4xx322Result = inlineResponse4xx322Result;
  }

  public InlineResponse4xx322 inlineResponse4xx322Success(Boolean inlineResponse4xx322Success) {
    this.inlineResponse4xx322Success = inlineResponse4xx322Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx322Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx322Success() {
    return inlineResponse4xx322Success;
  }

  public void setInlineResponse4xx322Success(Boolean inlineResponse4xx322Success) {
    this.inlineResponse4xx322Success = inlineResponse4xx322Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx322 inlineResponse4xx322 = (InlineResponse4xx322) o;
    return Objects.equals(this.inlineResponse4xx322Errors, inlineResponse4xx322.inlineResponse4xx322Errors) &&
        Objects.equals(this.inlineResponse4xx322Messages, inlineResponse4xx322.inlineResponse4xx322Messages) &&
        Objects.equals(this.inlineResponse4xx322Result, inlineResponse4xx322.inlineResponse4xx322Result) &&
        Objects.equals(this.inlineResponse4xx322Success, inlineResponse4xx322.inlineResponse4xx322Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx322Errors, inlineResponse4xx322Messages, inlineResponse4xx322Result, inlineResponse4xx322Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx322 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx322Errors: ").append(toIndentedString(inlineResponse4xx322Errors)).append("\n");
    sb.append("    inlineResponse4xx322Messages: ").append(toIndentedString(inlineResponse4xx322Messages)).append("\n");
    sb.append("    inlineResponse4xx322Result: ").append(toIndentedString(inlineResponse4xx322Result)).append("\n");
    sb.append("    inlineResponse4xx322Success: ").append(toIndentedString(inlineResponse4xx322Success)).append("\n");
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
