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
import io.swagger.client.model.SchemaResponseDiscovery;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx492
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx492 extends SchemaResponseDiscovery {
  @SerializedName("errors")
  private Object inlineResponse4xx492Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx492Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx492Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx492Success = null;

  public InlineResponse4xx492 inlineResponse4xx492Errors(Object inlineResponse4xx492Errors) {
    this.inlineResponse4xx492Errors = inlineResponse4xx492Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx492Errors
   * @return inlineResponse4xx492Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx492Errors() {
    return inlineResponse4xx492Errors;
  }

  public void setInlineResponse4xx492Errors(Object inlineResponse4xx492Errors) {
    this.inlineResponse4xx492Errors = inlineResponse4xx492Errors;
  }

  public InlineResponse4xx492 inlineResponse4xx492Messages(Object inlineResponse4xx492Messages) {
    this.inlineResponse4xx492Messages = inlineResponse4xx492Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx492Messages
   * @return inlineResponse4xx492Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx492Messages() {
    return inlineResponse4xx492Messages;
  }

  public void setInlineResponse4xx492Messages(Object inlineResponse4xx492Messages) {
    this.inlineResponse4xx492Messages = inlineResponse4xx492Messages;
  }

  public InlineResponse4xx492 inlineResponse4xx492Result(Object inlineResponse4xx492Result) {
    this.inlineResponse4xx492Result = inlineResponse4xx492Result;
    return this;
  }

   /**
   * Get inlineResponse4xx492Result
   * @return inlineResponse4xx492Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx492Result() {
    return inlineResponse4xx492Result;
  }

  public void setInlineResponse4xx492Result(Object inlineResponse4xx492Result) {
    this.inlineResponse4xx492Result = inlineResponse4xx492Result;
  }

  public InlineResponse4xx492 inlineResponse4xx492Success(Boolean inlineResponse4xx492Success) {
    this.inlineResponse4xx492Success = inlineResponse4xx492Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx492Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx492Success() {
    return inlineResponse4xx492Success;
  }

  public void setInlineResponse4xx492Success(Boolean inlineResponse4xx492Success) {
    this.inlineResponse4xx492Success = inlineResponse4xx492Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx492 inlineResponse4xx492 = (InlineResponse4xx492) o;
    return Objects.equals(this.inlineResponse4xx492Errors, inlineResponse4xx492.inlineResponse4xx492Errors) &&
        Objects.equals(this.inlineResponse4xx492Messages, inlineResponse4xx492.inlineResponse4xx492Messages) &&
        Objects.equals(this.inlineResponse4xx492Result, inlineResponse4xx492.inlineResponse4xx492Result) &&
        Objects.equals(this.inlineResponse4xx492Success, inlineResponse4xx492.inlineResponse4xx492Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx492Errors, inlineResponse4xx492Messages, inlineResponse4xx492Result, inlineResponse4xx492Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx492 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx492Errors: ").append(toIndentedString(inlineResponse4xx492Errors)).append("\n");
    sb.append("    inlineResponse4xx492Messages: ").append(toIndentedString(inlineResponse4xx492Messages)).append("\n");
    sb.append("    inlineResponse4xx492Result: ").append(toIndentedString(inlineResponse4xx492Result)).append("\n");
    sb.append("    inlineResponse4xx492Success: ").append(toIndentedString(inlineResponse4xx492Success)).append("\n");
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
