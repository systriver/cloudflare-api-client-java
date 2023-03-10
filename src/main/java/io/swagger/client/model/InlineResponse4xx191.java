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
import io.swagger.client.model.TailResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx191
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx191 extends TailResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx191Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx191Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx191Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx191Success = null;

  public InlineResponse4xx191 inlineResponse4xx191Errors(Object inlineResponse4xx191Errors) {
    this.inlineResponse4xx191Errors = inlineResponse4xx191Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx191Errors
   * @return inlineResponse4xx191Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx191Errors() {
    return inlineResponse4xx191Errors;
  }

  public void setInlineResponse4xx191Errors(Object inlineResponse4xx191Errors) {
    this.inlineResponse4xx191Errors = inlineResponse4xx191Errors;
  }

  public InlineResponse4xx191 inlineResponse4xx191Messages(Object inlineResponse4xx191Messages) {
    this.inlineResponse4xx191Messages = inlineResponse4xx191Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx191Messages
   * @return inlineResponse4xx191Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx191Messages() {
    return inlineResponse4xx191Messages;
  }

  public void setInlineResponse4xx191Messages(Object inlineResponse4xx191Messages) {
    this.inlineResponse4xx191Messages = inlineResponse4xx191Messages;
  }

  public InlineResponse4xx191 inlineResponse4xx191Result(Object inlineResponse4xx191Result) {
    this.inlineResponse4xx191Result = inlineResponse4xx191Result;
    return this;
  }

   /**
   * Get inlineResponse4xx191Result
   * @return inlineResponse4xx191Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx191Result() {
    return inlineResponse4xx191Result;
  }

  public void setInlineResponse4xx191Result(Object inlineResponse4xx191Result) {
    this.inlineResponse4xx191Result = inlineResponse4xx191Result;
  }

  public InlineResponse4xx191 inlineResponse4xx191Success(Boolean inlineResponse4xx191Success) {
    this.inlineResponse4xx191Success = inlineResponse4xx191Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx191Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx191Success() {
    return inlineResponse4xx191Success;
  }

  public void setInlineResponse4xx191Success(Boolean inlineResponse4xx191Success) {
    this.inlineResponse4xx191Success = inlineResponse4xx191Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx191 inlineResponse4xx191 = (InlineResponse4xx191) o;
    return Objects.equals(this.inlineResponse4xx191Errors, inlineResponse4xx191.inlineResponse4xx191Errors) &&
        Objects.equals(this.inlineResponse4xx191Messages, inlineResponse4xx191.inlineResponse4xx191Messages) &&
        Objects.equals(this.inlineResponse4xx191Result, inlineResponse4xx191.inlineResponse4xx191Result) &&
        Objects.equals(this.inlineResponse4xx191Success, inlineResponse4xx191.inlineResponse4xx191Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx191Errors, inlineResponse4xx191Messages, inlineResponse4xx191Result, inlineResponse4xx191Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx191 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx191Errors: ").append(toIndentedString(inlineResponse4xx191Errors)).append("\n");
    sb.append("    inlineResponse4xx191Messages: ").append(toIndentedString(inlineResponse4xx191Messages)).append("\n");
    sb.append("    inlineResponse4xx191Result: ").append(toIndentedString(inlineResponse4xx191Result)).append("\n");
    sb.append("    inlineResponse4xx191Success: ").append(toIndentedString(inlineResponse4xx191Success)).append("\n");
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
