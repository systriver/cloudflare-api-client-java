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
 * UptycsConfigRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class UptycsConfigRequest implements ConfigRequest {
  @SerializedName("client_key")
  private String clientKey = null;

  @SerializedName("client_secret")
  private String clientSecret = null;

  @SerializedName("customer_id")
  private String customerId = null;

  public UptycsConfigRequest clientKey(String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

   /**
   * The Uptycs client secret.
   * @return clientKey
  **/
  @Schema(example = "example client key", required = true, description = "The Uptycs client secret.")
  public String getClientKey() {
    return clientKey;
  }

  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }

  public UptycsConfigRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * The Uptycs client secret.
   * @return clientSecret
  **/
  @Schema(example = "example client secret", required = true, description = "The Uptycs client secret.")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public UptycsConfigRequest customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * The Uptycs customer ID.
   * @return customerId
  **/
  @Schema(example = "example customer id", required = true, description = "The Uptycs customer ID.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UptycsConfigRequest uptycsConfigRequest = (UptycsConfigRequest) o;
    return Objects.equals(this.clientKey, uptycsConfigRequest.clientKey) &&
        Objects.equals(this.clientSecret, uptycsConfigRequest.clientSecret) &&
        Objects.equals(this.customerId, uptycsConfigRequest.customerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientKey, clientSecret, customerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UptycsConfigRequest {\n");
    
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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
