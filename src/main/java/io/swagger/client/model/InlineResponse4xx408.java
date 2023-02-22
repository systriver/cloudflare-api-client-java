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
import io.swagger.client.model.TestConnectionResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx408
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx408 extends TestConnectionResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx408Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx408Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx408Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx408Success = null;

  public InlineResponse4xx408 inlineResponse4xx408Errors(Object inlineResponse4xx408Errors) {
    this.inlineResponse4xx408Errors = inlineResponse4xx408Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx408Errors
   * @return inlineResponse4xx408Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx408Errors() {
    return inlineResponse4xx408Errors;
  }

  public void setInlineResponse4xx408Errors(Object inlineResponse4xx408Errors) {
    this.inlineResponse4xx408Errors = inlineResponse4xx408Errors;
  }

  public InlineResponse4xx408 inlineResponse4xx408Messages(Object inlineResponse4xx408Messages) {
    this.inlineResponse4xx408Messages = inlineResponse4xx408Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx408Messages
   * @return inlineResponse4xx408Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx408Messages() {
    return inlineResponse4xx408Messages;
  }

  public void setInlineResponse4xx408Messages(Object inlineResponse4xx408Messages) {
    this.inlineResponse4xx408Messages = inlineResponse4xx408Messages;
  }

  public InlineResponse4xx408 inlineResponse4xx408Result(Object inlineResponse4xx408Result) {
    this.inlineResponse4xx408Result = inlineResponse4xx408Result;
    return this;
  }

   /**
   * Get inlineResponse4xx408Result
   * @return inlineResponse4xx408Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx408Result() {
    return inlineResponse4xx408Result;
  }

  public void setInlineResponse4xx408Result(Object inlineResponse4xx408Result) {
    this.inlineResponse4xx408Result = inlineResponse4xx408Result;
  }

  public InlineResponse4xx408 inlineResponse4xx408Success(Boolean inlineResponse4xx408Success) {
    this.inlineResponse4xx408Success = inlineResponse4xx408Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx408Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx408Success() {
    return inlineResponse4xx408Success;
  }

  public void setInlineResponse4xx408Success(Boolean inlineResponse4xx408Success) {
    this.inlineResponse4xx408Success = inlineResponse4xx408Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx408 inlineResponse4xx408 = (InlineResponse4xx408) o;
    return Objects.equals(this.inlineResponse4xx408Errors, inlineResponse4xx408.inlineResponse4xx408Errors) &&
        Objects.equals(this.inlineResponse4xx408Messages, inlineResponse4xx408.inlineResponse4xx408Messages) &&
        Objects.equals(this.inlineResponse4xx408Result, inlineResponse4xx408.inlineResponse4xx408Result) &&
        Objects.equals(this.inlineResponse4xx408Success, inlineResponse4xx408.inlineResponse4xx408Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx408Errors, inlineResponse4xx408Messages, inlineResponse4xx408Result, inlineResponse4xx408Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx408 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx408Errors: ").append(toIndentedString(inlineResponse4xx408Errors)).append("\n");
    sb.append("    inlineResponse4xx408Messages: ").append(toIndentedString(inlineResponse4xx408Messages)).append("\n");
    sb.append("    inlineResponse4xx408Result: ").append(toIndentedString(inlineResponse4xx408Result)).append("\n");
    sb.append("    inlineResponse4xx408Success: ").append(toIndentedString(inlineResponse4xx408Success)).append("\n");
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
