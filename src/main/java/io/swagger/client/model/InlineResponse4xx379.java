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
import io.swagger.client.model.OverrideResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx379
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx379 extends OverrideResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx379Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx379Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx379Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx379Success = null;

  public InlineResponse4xx379 inlineResponse4xx379Errors(Object inlineResponse4xx379Errors) {
    this.inlineResponse4xx379Errors = inlineResponse4xx379Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx379Errors
   * @return inlineResponse4xx379Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx379Errors() {
    return inlineResponse4xx379Errors;
  }

  public void setInlineResponse4xx379Errors(Object inlineResponse4xx379Errors) {
    this.inlineResponse4xx379Errors = inlineResponse4xx379Errors;
  }

  public InlineResponse4xx379 inlineResponse4xx379Messages(Object inlineResponse4xx379Messages) {
    this.inlineResponse4xx379Messages = inlineResponse4xx379Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx379Messages
   * @return inlineResponse4xx379Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx379Messages() {
    return inlineResponse4xx379Messages;
  }

  public void setInlineResponse4xx379Messages(Object inlineResponse4xx379Messages) {
    this.inlineResponse4xx379Messages = inlineResponse4xx379Messages;
  }

  public InlineResponse4xx379 inlineResponse4xx379Result(Object inlineResponse4xx379Result) {
    this.inlineResponse4xx379Result = inlineResponse4xx379Result;
    return this;
  }

   /**
   * Get inlineResponse4xx379Result
   * @return inlineResponse4xx379Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx379Result() {
    return inlineResponse4xx379Result;
  }

  public void setInlineResponse4xx379Result(Object inlineResponse4xx379Result) {
    this.inlineResponse4xx379Result = inlineResponse4xx379Result;
  }

  public InlineResponse4xx379 inlineResponse4xx379Success(Boolean inlineResponse4xx379Success) {
    this.inlineResponse4xx379Success = inlineResponse4xx379Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx379Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx379Success() {
    return inlineResponse4xx379Success;
  }

  public void setInlineResponse4xx379Success(Boolean inlineResponse4xx379Success) {
    this.inlineResponse4xx379Success = inlineResponse4xx379Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx379 inlineResponse4xx379 = (InlineResponse4xx379) o;
    return Objects.equals(this.inlineResponse4xx379Errors, inlineResponse4xx379.inlineResponse4xx379Errors) &&
        Objects.equals(this.inlineResponse4xx379Messages, inlineResponse4xx379.inlineResponse4xx379Messages) &&
        Objects.equals(this.inlineResponse4xx379Result, inlineResponse4xx379.inlineResponse4xx379Result) &&
        Objects.equals(this.inlineResponse4xx379Success, inlineResponse4xx379.inlineResponse4xx379Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx379Errors, inlineResponse4xx379Messages, inlineResponse4xx379Result, inlineResponse4xx379Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx379 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx379Errors: ").append(toIndentedString(inlineResponse4xx379Errors)).append("\n");
    sb.append("    inlineResponse4xx379Messages: ").append(toIndentedString(inlineResponse4xx379Messages)).append("\n");
    sb.append("    inlineResponse4xx379Result: ").append(toIndentedString(inlineResponse4xx379Result)).append("\n");
    sb.append("    inlineResponse4xx379Success: ").append(toIndentedString(inlineResponse4xx379Success)).append("\n");
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
