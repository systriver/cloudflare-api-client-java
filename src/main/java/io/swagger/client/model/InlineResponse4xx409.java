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
import io.swagger.client.model.RatelimitResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx409
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx409 extends RatelimitResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx409Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx409Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx409Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx409Success = null;

  public InlineResponse4xx409 inlineResponse4xx409Errors(Object inlineResponse4xx409Errors) {
    this.inlineResponse4xx409Errors = inlineResponse4xx409Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx409Errors
   * @return inlineResponse4xx409Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx409Errors() {
    return inlineResponse4xx409Errors;
  }

  public void setInlineResponse4xx409Errors(Object inlineResponse4xx409Errors) {
    this.inlineResponse4xx409Errors = inlineResponse4xx409Errors;
  }

  public InlineResponse4xx409 inlineResponse4xx409Messages(Object inlineResponse4xx409Messages) {
    this.inlineResponse4xx409Messages = inlineResponse4xx409Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx409Messages
   * @return inlineResponse4xx409Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx409Messages() {
    return inlineResponse4xx409Messages;
  }

  public void setInlineResponse4xx409Messages(Object inlineResponse4xx409Messages) {
    this.inlineResponse4xx409Messages = inlineResponse4xx409Messages;
  }

  public InlineResponse4xx409 inlineResponse4xx409Result(Object inlineResponse4xx409Result) {
    this.inlineResponse4xx409Result = inlineResponse4xx409Result;
    return this;
  }

   /**
   * Get inlineResponse4xx409Result
   * @return inlineResponse4xx409Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx409Result() {
    return inlineResponse4xx409Result;
  }

  public void setInlineResponse4xx409Result(Object inlineResponse4xx409Result) {
    this.inlineResponse4xx409Result = inlineResponse4xx409Result;
  }

  public InlineResponse4xx409 inlineResponse4xx409Success(Boolean inlineResponse4xx409Success) {
    this.inlineResponse4xx409Success = inlineResponse4xx409Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx409Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx409Success() {
    return inlineResponse4xx409Success;
  }

  public void setInlineResponse4xx409Success(Boolean inlineResponse4xx409Success) {
    this.inlineResponse4xx409Success = inlineResponse4xx409Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx409 inlineResponse4xx409 = (InlineResponse4xx409) o;
    return Objects.equals(this.inlineResponse4xx409Errors, inlineResponse4xx409.inlineResponse4xx409Errors) &&
        Objects.equals(this.inlineResponse4xx409Messages, inlineResponse4xx409.inlineResponse4xx409Messages) &&
        Objects.equals(this.inlineResponse4xx409Result, inlineResponse4xx409.inlineResponse4xx409Result) &&
        Objects.equals(this.inlineResponse4xx409Success, inlineResponse4xx409.inlineResponse4xx409Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx409Errors, inlineResponse4xx409Messages, inlineResponse4xx409Result, inlineResponse4xx409Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx409 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx409Errors: ").append(toIndentedString(inlineResponse4xx409Errors)).append("\n");
    sb.append("    inlineResponse4xx409Messages: ").append(toIndentedString(inlineResponse4xx409Messages)).append("\n");
    sb.append("    inlineResponse4xx409Result: ").append(toIndentedString(inlineResponse4xx409Result)).append("\n");
    sb.append("    inlineResponse4xx409Success: ").append(toIndentedString(inlineResponse4xx409Success)).append("\n");
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
