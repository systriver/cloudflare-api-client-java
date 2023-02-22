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
import io.swagger.client.model.RouteResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx535
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T13:40:27.702461541+09:00[Asia/Tokyo]")
public class InlineResponse4xx535 extends RouteResponseCollection {
  @SerializedName("errors")
  private Object errors = null;

  @SerializedName("messages")
  private Object messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx535Result = null;

  @SerializedName("success")
  private Boolean success = null;

  public InlineResponse4xx535 errors(Object errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getErrors() {
    return errors;
  }

  public void setErrors(Object errors) {
    this.errors = errors;
  }

  public InlineResponse4xx535 messages(Object messages) {
    this.messages = messages;
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getMessages() {
    return messages;
  }

  public void setMessages(Object messages) {
    this.messages = messages;
  }

  public InlineResponse4xx535 inlineResponse4xx535Result(Object inlineResponse4xx535Result) {
    this.inlineResponse4xx535Result = inlineResponse4xx535Result;
    return this;
  }

   /**
   * Get inlineResponse4xx535Result
   * @return inlineResponse4xx535Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx535Result() {
    return inlineResponse4xx535Result;
  }

  public void setInlineResponse4xx535Result(Object inlineResponse4xx535Result) {
    this.inlineResponse4xx535Result = inlineResponse4xx535Result;
  }

  public InlineResponse4xx535 success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx535 inlineResponse4xx535 = (InlineResponse4xx535) o;
    return Objects.equals(this.errors, inlineResponse4xx535.errors) &&
        Objects.equals(this.messages, inlineResponse4xx535.messages) &&
        Objects.equals(this.inlineResponse4xx535Result, inlineResponse4xx535.inlineResponse4xx535Result) &&
        Objects.equals(this.success, inlineResponse4xx535.success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, messages, inlineResponse4xx535Result, success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx535 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    inlineResponse4xx535Result: ").append(toIndentedString(inlineResponse4xx535Result)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
