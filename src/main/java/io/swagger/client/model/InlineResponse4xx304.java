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
import io.swagger.client.model.RuleSingleIdResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx304
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx304 extends RuleSingleIdResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx304Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx304Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx304Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx304Success = null;

  public InlineResponse4xx304 inlineResponse4xx304Errors(Object inlineResponse4xx304Errors) {
    this.inlineResponse4xx304Errors = inlineResponse4xx304Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx304Errors
   * @return inlineResponse4xx304Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx304Errors() {
    return inlineResponse4xx304Errors;
  }

  public void setInlineResponse4xx304Errors(Object inlineResponse4xx304Errors) {
    this.inlineResponse4xx304Errors = inlineResponse4xx304Errors;
  }

  public InlineResponse4xx304 inlineResponse4xx304Messages(Object inlineResponse4xx304Messages) {
    this.inlineResponse4xx304Messages = inlineResponse4xx304Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx304Messages
   * @return inlineResponse4xx304Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx304Messages() {
    return inlineResponse4xx304Messages;
  }

  public void setInlineResponse4xx304Messages(Object inlineResponse4xx304Messages) {
    this.inlineResponse4xx304Messages = inlineResponse4xx304Messages;
  }

  public InlineResponse4xx304 inlineResponse4xx304Result(Object inlineResponse4xx304Result) {
    this.inlineResponse4xx304Result = inlineResponse4xx304Result;
    return this;
  }

   /**
   * Get inlineResponse4xx304Result
   * @return inlineResponse4xx304Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx304Result() {
    return inlineResponse4xx304Result;
  }

  public void setInlineResponse4xx304Result(Object inlineResponse4xx304Result) {
    this.inlineResponse4xx304Result = inlineResponse4xx304Result;
  }

  public InlineResponse4xx304 inlineResponse4xx304Success(Boolean inlineResponse4xx304Success) {
    this.inlineResponse4xx304Success = inlineResponse4xx304Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx304Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx304Success() {
    return inlineResponse4xx304Success;
  }

  public void setInlineResponse4xx304Success(Boolean inlineResponse4xx304Success) {
    this.inlineResponse4xx304Success = inlineResponse4xx304Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx304 inlineResponse4xx304 = (InlineResponse4xx304) o;
    return Objects.equals(this.inlineResponse4xx304Errors, inlineResponse4xx304.inlineResponse4xx304Errors) &&
        Objects.equals(this.inlineResponse4xx304Messages, inlineResponse4xx304.inlineResponse4xx304Messages) &&
        Objects.equals(this.inlineResponse4xx304Result, inlineResponse4xx304.inlineResponse4xx304Result) &&
        Objects.equals(this.inlineResponse4xx304Success, inlineResponse4xx304.inlineResponse4xx304Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx304Errors, inlineResponse4xx304Messages, inlineResponse4xx304Result, inlineResponse4xx304Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx304 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx304Errors: ").append(toIndentedString(inlineResponse4xx304Errors)).append("\n");
    sb.append("    inlineResponse4xx304Messages: ").append(toIndentedString(inlineResponse4xx304Messages)).append("\n");
    sb.append("    inlineResponse4xx304Result: ").append(toIndentedString(inlineResponse4xx304Result)).append("\n");
    sb.append("    inlineResponse4xx304Success: ").append(toIndentedString(inlineResponse4xx304Success)).append("\n");
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