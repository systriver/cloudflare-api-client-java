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
import io.swagger.client.model.CategoriesComponentsSchemasResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx195
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx195 extends CategoriesComponentsSchemasResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx195Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx195Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx195Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx195Success = null;

  public InlineResponse4xx195 inlineResponse4xx195Errors(Object inlineResponse4xx195Errors) {
    this.inlineResponse4xx195Errors = inlineResponse4xx195Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx195Errors
   * @return inlineResponse4xx195Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx195Errors() {
    return inlineResponse4xx195Errors;
  }

  public void setInlineResponse4xx195Errors(Object inlineResponse4xx195Errors) {
    this.inlineResponse4xx195Errors = inlineResponse4xx195Errors;
  }

  public InlineResponse4xx195 inlineResponse4xx195Messages(Object inlineResponse4xx195Messages) {
    this.inlineResponse4xx195Messages = inlineResponse4xx195Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx195Messages
   * @return inlineResponse4xx195Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx195Messages() {
    return inlineResponse4xx195Messages;
  }

  public void setInlineResponse4xx195Messages(Object inlineResponse4xx195Messages) {
    this.inlineResponse4xx195Messages = inlineResponse4xx195Messages;
  }

  public InlineResponse4xx195 inlineResponse4xx195Result(Object inlineResponse4xx195Result) {
    this.inlineResponse4xx195Result = inlineResponse4xx195Result;
    return this;
  }

   /**
   * Get inlineResponse4xx195Result
   * @return inlineResponse4xx195Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx195Result() {
    return inlineResponse4xx195Result;
  }

  public void setInlineResponse4xx195Result(Object inlineResponse4xx195Result) {
    this.inlineResponse4xx195Result = inlineResponse4xx195Result;
  }

  public InlineResponse4xx195 inlineResponse4xx195Success(Boolean inlineResponse4xx195Success) {
    this.inlineResponse4xx195Success = inlineResponse4xx195Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx195Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx195Success() {
    return inlineResponse4xx195Success;
  }

  public void setInlineResponse4xx195Success(Boolean inlineResponse4xx195Success) {
    this.inlineResponse4xx195Success = inlineResponse4xx195Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx195 inlineResponse4xx195 = (InlineResponse4xx195) o;
    return Objects.equals(this.inlineResponse4xx195Errors, inlineResponse4xx195.inlineResponse4xx195Errors) &&
        Objects.equals(this.inlineResponse4xx195Messages, inlineResponse4xx195.inlineResponse4xx195Messages) &&
        Objects.equals(this.inlineResponse4xx195Result, inlineResponse4xx195.inlineResponse4xx195Result) &&
        Objects.equals(this.inlineResponse4xx195Success, inlineResponse4xx195.inlineResponse4xx195Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx195Errors, inlineResponse4xx195Messages, inlineResponse4xx195Result, inlineResponse4xx195Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx195 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx195Errors: ").append(toIndentedString(inlineResponse4xx195Errors)).append("\n");
    sb.append("    inlineResponse4xx195Messages: ").append(toIndentedString(inlineResponse4xx195Messages)).append("\n");
    sb.append("    inlineResponse4xx195Result: ").append(toIndentedString(inlineResponse4xx195Result)).append("\n");
    sb.append("    inlineResponse4xx195Success: ").append(toIndentedString(inlineResponse4xx195Success)).append("\n");
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
