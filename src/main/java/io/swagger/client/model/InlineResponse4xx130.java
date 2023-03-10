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
import io.swagger.client.model.RailgunResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx130
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx130 extends RailgunResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx130Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx130Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx130Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx130Success = null;

  public InlineResponse4xx130 inlineResponse4xx130Errors(Object inlineResponse4xx130Errors) {
    this.inlineResponse4xx130Errors = inlineResponse4xx130Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx130Errors
   * @return inlineResponse4xx130Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx130Errors() {
    return inlineResponse4xx130Errors;
  }

  public void setInlineResponse4xx130Errors(Object inlineResponse4xx130Errors) {
    this.inlineResponse4xx130Errors = inlineResponse4xx130Errors;
  }

  public InlineResponse4xx130 inlineResponse4xx130Messages(Object inlineResponse4xx130Messages) {
    this.inlineResponse4xx130Messages = inlineResponse4xx130Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx130Messages
   * @return inlineResponse4xx130Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx130Messages() {
    return inlineResponse4xx130Messages;
  }

  public void setInlineResponse4xx130Messages(Object inlineResponse4xx130Messages) {
    this.inlineResponse4xx130Messages = inlineResponse4xx130Messages;
  }

  public InlineResponse4xx130 inlineResponse4xx130Result(Object inlineResponse4xx130Result) {
    this.inlineResponse4xx130Result = inlineResponse4xx130Result;
    return this;
  }

   /**
   * Get inlineResponse4xx130Result
   * @return inlineResponse4xx130Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx130Result() {
    return inlineResponse4xx130Result;
  }

  public void setInlineResponse4xx130Result(Object inlineResponse4xx130Result) {
    this.inlineResponse4xx130Result = inlineResponse4xx130Result;
  }

  public InlineResponse4xx130 inlineResponse4xx130Success(Boolean inlineResponse4xx130Success) {
    this.inlineResponse4xx130Success = inlineResponse4xx130Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx130Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx130Success() {
    return inlineResponse4xx130Success;
  }

  public void setInlineResponse4xx130Success(Boolean inlineResponse4xx130Success) {
    this.inlineResponse4xx130Success = inlineResponse4xx130Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx130 inlineResponse4xx130 = (InlineResponse4xx130) o;
    return Objects.equals(this.inlineResponse4xx130Errors, inlineResponse4xx130.inlineResponse4xx130Errors) &&
        Objects.equals(this.inlineResponse4xx130Messages, inlineResponse4xx130.inlineResponse4xx130Messages) &&
        Objects.equals(this.inlineResponse4xx130Result, inlineResponse4xx130.inlineResponse4xx130Result) &&
        Objects.equals(this.inlineResponse4xx130Success, inlineResponse4xx130.inlineResponse4xx130Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx130Errors, inlineResponse4xx130Messages, inlineResponse4xx130Result, inlineResponse4xx130Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx130 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx130Errors: ").append(toIndentedString(inlineResponse4xx130Errors)).append("\n");
    sb.append("    inlineResponse4xx130Messages: ").append(toIndentedString(inlineResponse4xx130Messages)).append("\n");
    sb.append("    inlineResponse4xx130Result: ").append(toIndentedString(inlineResponse4xx130Result)).append("\n");
    sb.append("    inlineResponse4xx130Success: ").append(toIndentedString(inlineResponse4xx130Success)).append("\n");
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
