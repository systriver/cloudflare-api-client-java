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
import io.swagger.client.model.AclComponentsSchemasResponseCollection;
import io.swagger.client.model.ApiResponseCommonFailure;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx145
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx145 extends AclComponentsSchemasResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx145Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx145Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx145Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx145Success = null;

  public InlineResponse4xx145 inlineResponse4xx145Errors(Object inlineResponse4xx145Errors) {
    this.inlineResponse4xx145Errors = inlineResponse4xx145Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx145Errors
   * @return inlineResponse4xx145Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx145Errors() {
    return inlineResponse4xx145Errors;
  }

  public void setInlineResponse4xx145Errors(Object inlineResponse4xx145Errors) {
    this.inlineResponse4xx145Errors = inlineResponse4xx145Errors;
  }

  public InlineResponse4xx145 inlineResponse4xx145Messages(Object inlineResponse4xx145Messages) {
    this.inlineResponse4xx145Messages = inlineResponse4xx145Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx145Messages
   * @return inlineResponse4xx145Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx145Messages() {
    return inlineResponse4xx145Messages;
  }

  public void setInlineResponse4xx145Messages(Object inlineResponse4xx145Messages) {
    this.inlineResponse4xx145Messages = inlineResponse4xx145Messages;
  }

  public InlineResponse4xx145 inlineResponse4xx145Result(Object inlineResponse4xx145Result) {
    this.inlineResponse4xx145Result = inlineResponse4xx145Result;
    return this;
  }

   /**
   * Get inlineResponse4xx145Result
   * @return inlineResponse4xx145Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx145Result() {
    return inlineResponse4xx145Result;
  }

  public void setInlineResponse4xx145Result(Object inlineResponse4xx145Result) {
    this.inlineResponse4xx145Result = inlineResponse4xx145Result;
  }

  public InlineResponse4xx145 inlineResponse4xx145Success(Boolean inlineResponse4xx145Success) {
    this.inlineResponse4xx145Success = inlineResponse4xx145Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx145Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx145Success() {
    return inlineResponse4xx145Success;
  }

  public void setInlineResponse4xx145Success(Boolean inlineResponse4xx145Success) {
    this.inlineResponse4xx145Success = inlineResponse4xx145Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx145 inlineResponse4xx145 = (InlineResponse4xx145) o;
    return Objects.equals(this.inlineResponse4xx145Errors, inlineResponse4xx145.inlineResponse4xx145Errors) &&
        Objects.equals(this.inlineResponse4xx145Messages, inlineResponse4xx145.inlineResponse4xx145Messages) &&
        Objects.equals(this.inlineResponse4xx145Result, inlineResponse4xx145.inlineResponse4xx145Result) &&
        Objects.equals(this.inlineResponse4xx145Success, inlineResponse4xx145.inlineResponse4xx145Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx145Errors, inlineResponse4xx145Messages, inlineResponse4xx145Result, inlineResponse4xx145Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx145 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx145Errors: ").append(toIndentedString(inlineResponse4xx145Errors)).append("\n");
    sb.append("    inlineResponse4xx145Messages: ").append(toIndentedString(inlineResponse4xx145Messages)).append("\n");
    sb.append("    inlineResponse4xx145Result: ").append(toIndentedString(inlineResponse4xx145Result)).append("\n");
    sb.append("    inlineResponse4xx145Success: ").append(toIndentedString(inlineResponse4xx145Success)).append("\n");
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
