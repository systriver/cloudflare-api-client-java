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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SignedTokenResponseResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SignedTokenResponseResult {
  @SerializedName("token")
  private String token = null;

  public SignedTokenResponseResult token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The signed token used with the signed URLs feature.
   * @return token
  **/
  @Schema(example = "eyJhbGciOiJSUzI1NiIsImtpZCI6ImU5ZGI5OTBhODI2NjZkZDU3MWM3N2Y5NDRhNWM1YzhkIn0.eyJzdWIiOiJlYTk1MTMyYzE1NzMyNDEyZDIyYzE0NzZmYTgzZjI3YSIsImtpZCI6ImU5ZGI5OTBhODI2NjZkZDU3MWM3N2Y5NDRhNWM1YzhkIiwiZXhwIjoiMTUzNzQ2MDM2NSIsIm5iZiI6IjE1Mzc0NTMxNjUifQ.OZhqOARADn1iubK6GKcn25hN3nU-hCFF5q9w2C4yup0C4diG7aMIowiRpP-eDod8dbAJubsiFuTKrqPcmyCKWYsiv0TQueukqbQlF7HCO1TV-oF6El5-7ldJ46eD-ZQ0XgcIYEKrQOYFF8iDQbqPm3REWd6BnjKZdeVrLzuRaiSnZ9qqFpGu5dfxIY9-nZKDubJHqCr3Imtb211VIG_b9MdtO92JjvkDS-rxT_pkEfTZSafl1OU-98A7KBGtPSJHz2dHORIrUiTA6on4eIXTj9aFhGiir4rSn-rn0OjPRTtJMWIDMoQyE_fwrSYzB7MPuzL2t82BWaEbHZTfixBm5A", description = "The signed token used with the signed URLs feature.")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignedTokenResponseResult signedTokenResponseResult = (SignedTokenResponseResult) o;
    return Objects.equals(this.token, signedTokenResponseResult.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignedTokenResponseResult {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
