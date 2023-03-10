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
import io.swagger.client.model.VnetResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx166
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx166 extends VnetResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx166Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx166Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx166Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx166Success = null;

  public InlineResponse4xx166 inlineResponse4xx166Errors(Object inlineResponse4xx166Errors) {
    this.inlineResponse4xx166Errors = inlineResponse4xx166Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx166Errors
   * @return inlineResponse4xx166Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx166Errors() {
    return inlineResponse4xx166Errors;
  }

  public void setInlineResponse4xx166Errors(Object inlineResponse4xx166Errors) {
    this.inlineResponse4xx166Errors = inlineResponse4xx166Errors;
  }

  public InlineResponse4xx166 inlineResponse4xx166Messages(Object inlineResponse4xx166Messages) {
    this.inlineResponse4xx166Messages = inlineResponse4xx166Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx166Messages
   * @return inlineResponse4xx166Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx166Messages() {
    return inlineResponse4xx166Messages;
  }

  public void setInlineResponse4xx166Messages(Object inlineResponse4xx166Messages) {
    this.inlineResponse4xx166Messages = inlineResponse4xx166Messages;
  }

  public InlineResponse4xx166 inlineResponse4xx166Result(Object inlineResponse4xx166Result) {
    this.inlineResponse4xx166Result = inlineResponse4xx166Result;
    return this;
  }

   /**
   * Get inlineResponse4xx166Result
   * @return inlineResponse4xx166Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx166Result() {
    return inlineResponse4xx166Result;
  }

  public void setInlineResponse4xx166Result(Object inlineResponse4xx166Result) {
    this.inlineResponse4xx166Result = inlineResponse4xx166Result;
  }

  public InlineResponse4xx166 inlineResponse4xx166Success(Boolean inlineResponse4xx166Success) {
    this.inlineResponse4xx166Success = inlineResponse4xx166Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx166Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx166Success() {
    return inlineResponse4xx166Success;
  }

  public void setInlineResponse4xx166Success(Boolean inlineResponse4xx166Success) {
    this.inlineResponse4xx166Success = inlineResponse4xx166Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx166 inlineResponse4xx166 = (InlineResponse4xx166) o;
    return Objects.equals(this.inlineResponse4xx166Errors, inlineResponse4xx166.inlineResponse4xx166Errors) &&
        Objects.equals(this.inlineResponse4xx166Messages, inlineResponse4xx166.inlineResponse4xx166Messages) &&
        Objects.equals(this.inlineResponse4xx166Result, inlineResponse4xx166.inlineResponse4xx166Result) &&
        Objects.equals(this.inlineResponse4xx166Success, inlineResponse4xx166.inlineResponse4xx166Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx166Errors, inlineResponse4xx166Messages, inlineResponse4xx166Result, inlineResponse4xx166Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx166 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx166Errors: ").append(toIndentedString(inlineResponse4xx166Errors)).append("\n");
    sb.append("    inlineResponse4xx166Messages: ").append(toIndentedString(inlineResponse4xx166Messages)).append("\n");
    sb.append("    inlineResponse4xx166Result: ").append(toIndentedString(inlineResponse4xx166Result)).append("\n");
    sb.append("    inlineResponse4xx166Success: ").append(toIndentedString(inlineResponse4xx166Success)).append("\n");
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
