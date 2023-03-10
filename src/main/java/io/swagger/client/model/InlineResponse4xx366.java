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
import io.swagger.client.model.FilterDeleteResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx366
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx366 extends FilterDeleteResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx366Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx366Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx366Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx366Success = null;

  public InlineResponse4xx366 inlineResponse4xx366Errors(Object inlineResponse4xx366Errors) {
    this.inlineResponse4xx366Errors = inlineResponse4xx366Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx366Errors
   * @return inlineResponse4xx366Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx366Errors() {
    return inlineResponse4xx366Errors;
  }

  public void setInlineResponse4xx366Errors(Object inlineResponse4xx366Errors) {
    this.inlineResponse4xx366Errors = inlineResponse4xx366Errors;
  }

  public InlineResponse4xx366 inlineResponse4xx366Messages(Object inlineResponse4xx366Messages) {
    this.inlineResponse4xx366Messages = inlineResponse4xx366Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx366Messages
   * @return inlineResponse4xx366Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx366Messages() {
    return inlineResponse4xx366Messages;
  }

  public void setInlineResponse4xx366Messages(Object inlineResponse4xx366Messages) {
    this.inlineResponse4xx366Messages = inlineResponse4xx366Messages;
  }

  public InlineResponse4xx366 inlineResponse4xx366Result(Object inlineResponse4xx366Result) {
    this.inlineResponse4xx366Result = inlineResponse4xx366Result;
    return this;
  }

   /**
   * Get inlineResponse4xx366Result
   * @return inlineResponse4xx366Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx366Result() {
    return inlineResponse4xx366Result;
  }

  public void setInlineResponse4xx366Result(Object inlineResponse4xx366Result) {
    this.inlineResponse4xx366Result = inlineResponse4xx366Result;
  }

  public InlineResponse4xx366 inlineResponse4xx366Success(Boolean inlineResponse4xx366Success) {
    this.inlineResponse4xx366Success = inlineResponse4xx366Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx366Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx366Success() {
    return inlineResponse4xx366Success;
  }

  public void setInlineResponse4xx366Success(Boolean inlineResponse4xx366Success) {
    this.inlineResponse4xx366Success = inlineResponse4xx366Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx366 inlineResponse4xx366 = (InlineResponse4xx366) o;
    return Objects.equals(this.inlineResponse4xx366Errors, inlineResponse4xx366.inlineResponse4xx366Errors) &&
        Objects.equals(this.inlineResponse4xx366Messages, inlineResponse4xx366.inlineResponse4xx366Messages) &&
        Objects.equals(this.inlineResponse4xx366Result, inlineResponse4xx366.inlineResponse4xx366Result) &&
        Objects.equals(this.inlineResponse4xx366Success, inlineResponse4xx366.inlineResponse4xx366Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx366Errors, inlineResponse4xx366Messages, inlineResponse4xx366Result, inlineResponse4xx366Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx366 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx366Errors: ").append(toIndentedString(inlineResponse4xx366Errors)).append("\n");
    sb.append("    inlineResponse4xx366Messages: ").append(toIndentedString(inlineResponse4xx366Messages)).append("\n");
    sb.append("    inlineResponse4xx366Result: ").append(toIndentedString(inlineResponse4xx366Result)).append("\n");
    sb.append("    inlineResponse4xx366Success: ").append(toIndentedString(inlineResponse4xx366Success)).append("\n");
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
