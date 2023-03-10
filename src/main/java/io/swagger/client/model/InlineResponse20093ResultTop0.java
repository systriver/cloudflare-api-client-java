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
import java.math.BigDecimal;
/**
 * InlineResponse20093ResultTop0
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20093ResultTop0 {
  @SerializedName("clientASN")
  private BigDecimal clientASN = null;

  @SerializedName("clientASName")
  private String clientASName = null;

  @SerializedName("value")
  private String value = null;

  public InlineResponse20093ResultTop0 clientASN(BigDecimal clientASN) {
    this.clientASN = clientASN;
    return this;
  }

   /**
   * Get clientASN
   * @return clientASN
  **/
  @Schema(example = "16509", required = true, description = "")
  public BigDecimal getClientASN() {
    return clientASN;
  }

  public void setClientASN(BigDecimal clientASN) {
    this.clientASN = clientASN;
  }

  public InlineResponse20093ResultTop0 clientASName(String clientASName) {
    this.clientASName = clientASName;
    return this;
  }

   /**
   * Get clientASName
   * @return clientASName
  **/
  @Schema(example = "AMAZON-02", required = true, description = "")
  public String getClientASName() {
    return clientASName;
  }

  public void setClientASName(String clientASName) {
    this.clientASName = clientASName;
  }

  public InlineResponse20093ResultTop0 value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(example = "0.73996", required = true, description = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20093ResultTop0 inlineResponse20093ResultTop0 = (InlineResponse20093ResultTop0) o;
    return Objects.equals(this.clientASN, inlineResponse20093ResultTop0.clientASN) &&
        Objects.equals(this.clientASName, inlineResponse20093ResultTop0.clientASName) &&
        Objects.equals(this.value, inlineResponse20093ResultTop0.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientASN, clientASName, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20093ResultTop0 {\n");
    
    sb.append("    clientASN: ").append(toIndentedString(clientASN)).append("\n");
    sb.append("    clientASName: ").append(toIndentedString(clientASName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
