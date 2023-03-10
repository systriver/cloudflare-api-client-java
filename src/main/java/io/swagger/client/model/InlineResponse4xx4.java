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
import io.swagger.client.model.AddressMapsComponentsSchemasSingleResponse;
import io.swagger.client.model.ApiResponseCommonFailure;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx4
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx4 extends AddressMapsComponentsSchemasSingleResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx4Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx4Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx4Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx4Success = null;

  public InlineResponse4xx4 inlineResponse4xx4Errors(Object inlineResponse4xx4Errors) {
    this.inlineResponse4xx4Errors = inlineResponse4xx4Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx4Errors
   * @return inlineResponse4xx4Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx4Errors() {
    return inlineResponse4xx4Errors;
  }

  public void setInlineResponse4xx4Errors(Object inlineResponse4xx4Errors) {
    this.inlineResponse4xx4Errors = inlineResponse4xx4Errors;
  }

  public InlineResponse4xx4 inlineResponse4xx4Messages(Object inlineResponse4xx4Messages) {
    this.inlineResponse4xx4Messages = inlineResponse4xx4Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx4Messages
   * @return inlineResponse4xx4Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx4Messages() {
    return inlineResponse4xx4Messages;
  }

  public void setInlineResponse4xx4Messages(Object inlineResponse4xx4Messages) {
    this.inlineResponse4xx4Messages = inlineResponse4xx4Messages;
  }

  public InlineResponse4xx4 inlineResponse4xx4Result(Object inlineResponse4xx4Result) {
    this.inlineResponse4xx4Result = inlineResponse4xx4Result;
    return this;
  }

   /**
   * Get inlineResponse4xx4Result
   * @return inlineResponse4xx4Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx4Result() {
    return inlineResponse4xx4Result;
  }

  public void setInlineResponse4xx4Result(Object inlineResponse4xx4Result) {
    this.inlineResponse4xx4Result = inlineResponse4xx4Result;
  }

  public InlineResponse4xx4 inlineResponse4xx4Success(Boolean inlineResponse4xx4Success) {
    this.inlineResponse4xx4Success = inlineResponse4xx4Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx4Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx4Success() {
    return inlineResponse4xx4Success;
  }

  public void setInlineResponse4xx4Success(Boolean inlineResponse4xx4Success) {
    this.inlineResponse4xx4Success = inlineResponse4xx4Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx4 inlineResponse4xx4 = (InlineResponse4xx4) o;
    return Objects.equals(this.inlineResponse4xx4Errors, inlineResponse4xx4.inlineResponse4xx4Errors) &&
        Objects.equals(this.inlineResponse4xx4Messages, inlineResponse4xx4.inlineResponse4xx4Messages) &&
        Objects.equals(this.inlineResponse4xx4Result, inlineResponse4xx4.inlineResponse4xx4Result) &&
        Objects.equals(this.inlineResponse4xx4Success, inlineResponse4xx4.inlineResponse4xx4Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx4Errors, inlineResponse4xx4Messages, inlineResponse4xx4Result, inlineResponse4xx4Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx4 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx4Errors: ").append(toIndentedString(inlineResponse4xx4Errors)).append("\n");
    sb.append("    inlineResponse4xx4Messages: ").append(toIndentedString(inlineResponse4xx4Messages)).append("\n");
    sb.append("    inlineResponse4xx4Result: ").append(toIndentedString(inlineResponse4xx4Result)).append("\n");
    sb.append("    inlineResponse4xx4Success: ").append(toIndentedString(inlineResponse4xx4Success)).append("\n");
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
