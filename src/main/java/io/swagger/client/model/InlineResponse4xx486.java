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
import io.swagger.client.model.ContentListEntryCollectionResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx486
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx486 extends ContentListEntryCollectionResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx486Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx486Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx486Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx486Success = null;

  public InlineResponse4xx486 inlineResponse4xx486Errors(Object inlineResponse4xx486Errors) {
    this.inlineResponse4xx486Errors = inlineResponse4xx486Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx486Errors
   * @return inlineResponse4xx486Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx486Errors() {
    return inlineResponse4xx486Errors;
  }

  public void setInlineResponse4xx486Errors(Object inlineResponse4xx486Errors) {
    this.inlineResponse4xx486Errors = inlineResponse4xx486Errors;
  }

  public InlineResponse4xx486 inlineResponse4xx486Messages(Object inlineResponse4xx486Messages) {
    this.inlineResponse4xx486Messages = inlineResponse4xx486Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx486Messages
   * @return inlineResponse4xx486Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx486Messages() {
    return inlineResponse4xx486Messages;
  }

  public void setInlineResponse4xx486Messages(Object inlineResponse4xx486Messages) {
    this.inlineResponse4xx486Messages = inlineResponse4xx486Messages;
  }

  public InlineResponse4xx486 inlineResponse4xx486Result(Object inlineResponse4xx486Result) {
    this.inlineResponse4xx486Result = inlineResponse4xx486Result;
    return this;
  }

   /**
   * Get inlineResponse4xx486Result
   * @return inlineResponse4xx486Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx486Result() {
    return inlineResponse4xx486Result;
  }

  public void setInlineResponse4xx486Result(Object inlineResponse4xx486Result) {
    this.inlineResponse4xx486Result = inlineResponse4xx486Result;
  }

  public InlineResponse4xx486 inlineResponse4xx486Success(Boolean inlineResponse4xx486Success) {
    this.inlineResponse4xx486Success = inlineResponse4xx486Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx486Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx486Success() {
    return inlineResponse4xx486Success;
  }

  public void setInlineResponse4xx486Success(Boolean inlineResponse4xx486Success) {
    this.inlineResponse4xx486Success = inlineResponse4xx486Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx486 inlineResponse4xx486 = (InlineResponse4xx486) o;
    return Objects.equals(this.inlineResponse4xx486Errors, inlineResponse4xx486.inlineResponse4xx486Errors) &&
        Objects.equals(this.inlineResponse4xx486Messages, inlineResponse4xx486.inlineResponse4xx486Messages) &&
        Objects.equals(this.inlineResponse4xx486Result, inlineResponse4xx486.inlineResponse4xx486Result) &&
        Objects.equals(this.inlineResponse4xx486Success, inlineResponse4xx486.inlineResponse4xx486Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx486Errors, inlineResponse4xx486Messages, inlineResponse4xx486Result, inlineResponse4xx486Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx486 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx486Errors: ").append(toIndentedString(inlineResponse4xx486Errors)).append("\n");
    sb.append("    inlineResponse4xx486Messages: ").append(toIndentedString(inlineResponse4xx486Messages)).append("\n");
    sb.append("    inlineResponse4xx486Result: ").append(toIndentedString(inlineResponse4xx486Result)).append("\n");
    sb.append("    inlineResponse4xx486Success: ").append(toIndentedString(inlineResponse4xx486Success)).append("\n");
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
