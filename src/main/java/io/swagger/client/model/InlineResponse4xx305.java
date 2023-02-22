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
import io.swagger.client.model.SchemasCollectionInviteResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx305
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx305 extends SchemasCollectionInviteResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx305Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx305Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx305Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx305Success = null;

  public InlineResponse4xx305 inlineResponse4xx305Errors(Object inlineResponse4xx305Errors) {
    this.inlineResponse4xx305Errors = inlineResponse4xx305Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx305Errors
   * @return inlineResponse4xx305Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx305Errors() {
    return inlineResponse4xx305Errors;
  }

  public void setInlineResponse4xx305Errors(Object inlineResponse4xx305Errors) {
    this.inlineResponse4xx305Errors = inlineResponse4xx305Errors;
  }

  public InlineResponse4xx305 inlineResponse4xx305Messages(Object inlineResponse4xx305Messages) {
    this.inlineResponse4xx305Messages = inlineResponse4xx305Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx305Messages
   * @return inlineResponse4xx305Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx305Messages() {
    return inlineResponse4xx305Messages;
  }

  public void setInlineResponse4xx305Messages(Object inlineResponse4xx305Messages) {
    this.inlineResponse4xx305Messages = inlineResponse4xx305Messages;
  }

  public InlineResponse4xx305 inlineResponse4xx305Result(Object inlineResponse4xx305Result) {
    this.inlineResponse4xx305Result = inlineResponse4xx305Result;
    return this;
  }

   /**
   * Get inlineResponse4xx305Result
   * @return inlineResponse4xx305Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx305Result() {
    return inlineResponse4xx305Result;
  }

  public void setInlineResponse4xx305Result(Object inlineResponse4xx305Result) {
    this.inlineResponse4xx305Result = inlineResponse4xx305Result;
  }

  public InlineResponse4xx305 inlineResponse4xx305Success(Boolean inlineResponse4xx305Success) {
    this.inlineResponse4xx305Success = inlineResponse4xx305Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx305Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx305Success() {
    return inlineResponse4xx305Success;
  }

  public void setInlineResponse4xx305Success(Boolean inlineResponse4xx305Success) {
    this.inlineResponse4xx305Success = inlineResponse4xx305Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx305 inlineResponse4xx305 = (InlineResponse4xx305) o;
    return Objects.equals(this.inlineResponse4xx305Errors, inlineResponse4xx305.inlineResponse4xx305Errors) &&
        Objects.equals(this.inlineResponse4xx305Messages, inlineResponse4xx305.inlineResponse4xx305Messages) &&
        Objects.equals(this.inlineResponse4xx305Result, inlineResponse4xx305.inlineResponse4xx305Result) &&
        Objects.equals(this.inlineResponse4xx305Success, inlineResponse4xx305.inlineResponse4xx305Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx305Errors, inlineResponse4xx305Messages, inlineResponse4xx305Result, inlineResponse4xx305Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx305 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx305Errors: ").append(toIndentedString(inlineResponse4xx305Errors)).append("\n");
    sb.append("    inlineResponse4xx305Messages: ").append(toIndentedString(inlineResponse4xx305Messages)).append("\n");
    sb.append("    inlineResponse4xx305Result: ").append(toIndentedString(inlineResponse4xx305Result)).append("\n");
    sb.append("    inlineResponse4xx305Success: ").append(toIndentedString(inlineResponse4xx305Success)).append("\n");
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
