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
import io.swagger.client.model.InlineResponse20044ResultSerie0;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse20044Result
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20044Result {
  @SerializedName("meta")
  private Object meta = null;

  @SerializedName("serie_0")
  private InlineResponse20044ResultSerie0 serie0 = null;

  public InlineResponse20044Result meta(Object meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @Schema(required = true, description = "")
  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }

  public InlineResponse20044Result serie0(InlineResponse20044ResultSerie0 serie0) {
    this.serie0 = serie0;
    return this;
  }

   /**
   * Get serie0
   * @return serie0
  **/
  @Schema(required = true, description = "")
  public InlineResponse20044ResultSerie0 getSerie0() {
    return serie0;
  }

  public void setSerie0(InlineResponse20044ResultSerie0 serie0) {
    this.serie0 = serie0;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20044Result inlineResponse20044Result = (InlineResponse20044Result) o;
    return Objects.equals(this.meta, inlineResponse20044Result.meta) &&
        Objects.equals(this.serie0, inlineResponse20044Result.serie0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, serie0);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20044Result {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    serie0: ").append(toIndentedString(serie0)).append("\n");
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
