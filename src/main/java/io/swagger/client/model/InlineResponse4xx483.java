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
import io.swagger.client.model.ComponentsSchemasCollectionResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx483
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx483 extends ComponentsSchemasCollectionResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx483Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx483Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx483Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx483Success = null;

  public InlineResponse4xx483 inlineResponse4xx483Errors(Object inlineResponse4xx483Errors) {
    this.inlineResponse4xx483Errors = inlineResponse4xx483Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx483Errors
   * @return inlineResponse4xx483Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx483Errors() {
    return inlineResponse4xx483Errors;
  }

  public void setInlineResponse4xx483Errors(Object inlineResponse4xx483Errors) {
    this.inlineResponse4xx483Errors = inlineResponse4xx483Errors;
  }

  public InlineResponse4xx483 inlineResponse4xx483Messages(Object inlineResponse4xx483Messages) {
    this.inlineResponse4xx483Messages = inlineResponse4xx483Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx483Messages
   * @return inlineResponse4xx483Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx483Messages() {
    return inlineResponse4xx483Messages;
  }

  public void setInlineResponse4xx483Messages(Object inlineResponse4xx483Messages) {
    this.inlineResponse4xx483Messages = inlineResponse4xx483Messages;
  }

  public InlineResponse4xx483 inlineResponse4xx483Result(Object inlineResponse4xx483Result) {
    this.inlineResponse4xx483Result = inlineResponse4xx483Result;
    return this;
  }

   /**
   * Get inlineResponse4xx483Result
   * @return inlineResponse4xx483Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx483Result() {
    return inlineResponse4xx483Result;
  }

  public void setInlineResponse4xx483Result(Object inlineResponse4xx483Result) {
    this.inlineResponse4xx483Result = inlineResponse4xx483Result;
  }

  public InlineResponse4xx483 inlineResponse4xx483Success(Boolean inlineResponse4xx483Success) {
    this.inlineResponse4xx483Success = inlineResponse4xx483Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx483Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx483Success() {
    return inlineResponse4xx483Success;
  }

  public void setInlineResponse4xx483Success(Boolean inlineResponse4xx483Success) {
    this.inlineResponse4xx483Success = inlineResponse4xx483Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx483 inlineResponse4xx483 = (InlineResponse4xx483) o;
    return Objects.equals(this.inlineResponse4xx483Errors, inlineResponse4xx483.inlineResponse4xx483Errors) &&
        Objects.equals(this.inlineResponse4xx483Messages, inlineResponse4xx483.inlineResponse4xx483Messages) &&
        Objects.equals(this.inlineResponse4xx483Result, inlineResponse4xx483.inlineResponse4xx483Result) &&
        Objects.equals(this.inlineResponse4xx483Success, inlineResponse4xx483.inlineResponse4xx483Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx483Errors, inlineResponse4xx483Messages, inlineResponse4xx483Result, inlineResponse4xx483Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx483 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx483Errors: ").append(toIndentedString(inlineResponse4xx483Errors)).append("\n");
    sb.append("    inlineResponse4xx483Messages: ").append(toIndentedString(inlineResponse4xx483Messages)).append("\n");
    sb.append("    inlineResponse4xx483Result: ").append(toIndentedString(inlineResponse4xx483Result)).append("\n");
    sb.append("    inlineResponse4xx483Success: ").append(toIndentedString(inlineResponse4xx483Success)).append("\n");
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
