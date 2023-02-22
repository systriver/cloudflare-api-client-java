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
import io.swagger.client.model.InlineResponse200102ResultTop0;
import io.swagger.client.model.InlineResponse20046ResultMeta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse200102Result
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse200102Result {
  @SerializedName("meta")
  private InlineResponse20046ResultMeta meta = null;

  @SerializedName("top_0")
  private List<InlineResponse200102ResultTop0> top0 = new ArrayList<InlineResponse200102ResultTop0>();

  public InlineResponse200102Result meta(InlineResponse20046ResultMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @Schema(required = true, description = "")
  public InlineResponse20046ResultMeta getMeta() {
    return meta;
  }

  public void setMeta(InlineResponse20046ResultMeta meta) {
    this.meta = meta;
  }

  public InlineResponse200102Result top0(List<InlineResponse200102ResultTop0> top0) {
    this.top0 = top0;
    return this;
  }

  public InlineResponse200102Result addTop0Item(InlineResponse200102ResultTop0 top0Item) {
    this.top0.add(top0Item);
    return this;
  }

   /**
   * Get top0
   * @return top0
  **/
  @Schema(required = true, description = "")
  public List<InlineResponse200102ResultTop0> getTop0() {
    return top0;
  }

  public void setTop0(List<InlineResponse200102ResultTop0> top0) {
    this.top0 = top0;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200102Result inlineResponse200102Result = (InlineResponse200102Result) o;
    return Objects.equals(this.meta, inlineResponse200102Result.meta) &&
        Objects.equals(this.top0, inlineResponse200102Result.top0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, top0);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200102Result {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    top0: ").append(toIndentedString(top0)).append("\n");
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
