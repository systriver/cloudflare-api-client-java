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
import io.swagger.client.model.AccountSubscriptionResponseCollection;
import io.swagger.client.model.ApiResponseCommonFailure;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx161
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx161 extends AccountSubscriptionResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx161Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx161Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx161Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx161Success = null;

  public InlineResponse4xx161 inlineResponse4xx161Errors(Object inlineResponse4xx161Errors) {
    this.inlineResponse4xx161Errors = inlineResponse4xx161Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx161Errors
   * @return inlineResponse4xx161Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx161Errors() {
    return inlineResponse4xx161Errors;
  }

  public void setInlineResponse4xx161Errors(Object inlineResponse4xx161Errors) {
    this.inlineResponse4xx161Errors = inlineResponse4xx161Errors;
  }

  public InlineResponse4xx161 inlineResponse4xx161Messages(Object inlineResponse4xx161Messages) {
    this.inlineResponse4xx161Messages = inlineResponse4xx161Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx161Messages
   * @return inlineResponse4xx161Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx161Messages() {
    return inlineResponse4xx161Messages;
  }

  public void setInlineResponse4xx161Messages(Object inlineResponse4xx161Messages) {
    this.inlineResponse4xx161Messages = inlineResponse4xx161Messages;
  }

  public InlineResponse4xx161 inlineResponse4xx161Result(Object inlineResponse4xx161Result) {
    this.inlineResponse4xx161Result = inlineResponse4xx161Result;
    return this;
  }

   /**
   * Get inlineResponse4xx161Result
   * @return inlineResponse4xx161Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx161Result() {
    return inlineResponse4xx161Result;
  }

  public void setInlineResponse4xx161Result(Object inlineResponse4xx161Result) {
    this.inlineResponse4xx161Result = inlineResponse4xx161Result;
  }

  public InlineResponse4xx161 inlineResponse4xx161Success(Boolean inlineResponse4xx161Success) {
    this.inlineResponse4xx161Success = inlineResponse4xx161Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx161Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx161Success() {
    return inlineResponse4xx161Success;
  }

  public void setInlineResponse4xx161Success(Boolean inlineResponse4xx161Success) {
    this.inlineResponse4xx161Success = inlineResponse4xx161Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx161 inlineResponse4xx161 = (InlineResponse4xx161) o;
    return Objects.equals(this.inlineResponse4xx161Errors, inlineResponse4xx161.inlineResponse4xx161Errors) &&
        Objects.equals(this.inlineResponse4xx161Messages, inlineResponse4xx161.inlineResponse4xx161Messages) &&
        Objects.equals(this.inlineResponse4xx161Result, inlineResponse4xx161.inlineResponse4xx161Result) &&
        Objects.equals(this.inlineResponse4xx161Success, inlineResponse4xx161.inlineResponse4xx161Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx161Errors, inlineResponse4xx161Messages, inlineResponse4xx161Result, inlineResponse4xx161Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx161 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx161Errors: ").append(toIndentedString(inlineResponse4xx161Errors)).append("\n");
    sb.append("    inlineResponse4xx161Messages: ").append(toIndentedString(inlineResponse4xx161Messages)).append("\n");
    sb.append("    inlineResponse4xx161Result: ").append(toIndentedString(inlineResponse4xx161Result)).append("\n");
    sb.append("    inlineResponse4xx161Success: ").append(toIndentedString(inlineResponse4xx161Success)).append("\n");
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