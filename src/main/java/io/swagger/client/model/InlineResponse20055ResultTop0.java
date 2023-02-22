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
 * InlineResponse20055ResultTop0
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20055ResultTop0 {
  @SerializedName("rank")
  private Integer rank = null;

  @SerializedName("targetCountryAlpha2")
  private String targetCountryAlpha2 = null;

  @SerializedName("targetCountryName")
  private String targetCountryName = null;

  @SerializedName("value")
  private String value = null;

  public InlineResponse20055ResultTop0 rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @Schema(example = "1", required = true, description = "")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public InlineResponse20055ResultTop0 targetCountryAlpha2(String targetCountryAlpha2) {
    this.targetCountryAlpha2 = targetCountryAlpha2;
    return this;
  }

   /**
   * Get targetCountryAlpha2
   * @return targetCountryAlpha2
  **/
  @Schema(example = "US", required = true, description = "")
  public String getTargetCountryAlpha2() {
    return targetCountryAlpha2;
  }

  public void setTargetCountryAlpha2(String targetCountryAlpha2) {
    this.targetCountryAlpha2 = targetCountryAlpha2;
  }

  public InlineResponse20055ResultTop0 targetCountryName(String targetCountryName) {
    this.targetCountryName = targetCountryName;
    return this;
  }

   /**
   * Get targetCountryName
   * @return targetCountryName
  **/
  @Schema(example = "United States", required = true, description = "")
  public String getTargetCountryName() {
    return targetCountryName;
  }

  public void setTargetCountryName(String targetCountryName) {
    this.targetCountryName = targetCountryName;
  }

  public InlineResponse20055ResultTop0 value(String value) {
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
    InlineResponse20055ResultTop0 inlineResponse20055ResultTop0 = (InlineResponse20055ResultTop0) o;
    return Objects.equals(this.rank, inlineResponse20055ResultTop0.rank) &&
        Objects.equals(this.targetCountryAlpha2, inlineResponse20055ResultTop0.targetCountryAlpha2) &&
        Objects.equals(this.targetCountryName, inlineResponse20055ResultTop0.targetCountryName) &&
        Objects.equals(this.value, inlineResponse20055ResultTop0.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, targetCountryAlpha2, targetCountryName, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20055ResultTop0 {\n");
    
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    targetCountryAlpha2: ").append(toIndentedString(targetCountryAlpha2)).append("\n");
    sb.append("    targetCountryName: ").append(toIndentedString(targetCountryName)).append("\n");
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
