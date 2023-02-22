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
import io.swagger.client.model.ApiResponseCollection;
import io.swagger.client.model.ComponentsSchemasZone;
import io.swagger.client.model.ResultInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20030
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20030 extends ApiResponseCollection {
  @SerializedName("result")
  private List<ComponentsSchemasZone> inlineResponse20030Result = null;

  public InlineResponse20030 inlineResponse20030Result(List<ComponentsSchemasZone> inlineResponse20030Result) {
    this.inlineResponse20030Result = inlineResponse20030Result;
    return this;
  }

  public InlineResponse20030 addInlineResponse20030ResultItem(ComponentsSchemasZone inlineResponse20030ResultItem) {
    if (this.inlineResponse20030Result == null) {
      this.inlineResponse20030Result = new ArrayList<ComponentsSchemasZone>();
    }
    this.inlineResponse20030Result.add(inlineResponse20030ResultItem);
    return this;
  }

   /**
   * Get inlineResponse20030Result
   * @return inlineResponse20030Result
  **/
  @Schema(description = "")
  public List<ComponentsSchemasZone> getInlineResponse20030Result() {
    return inlineResponse20030Result;
  }

  public void setInlineResponse20030Result(List<ComponentsSchemasZone> inlineResponse20030Result) {
    this.inlineResponse20030Result = inlineResponse20030Result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20030 inlineResponse20030 = (InlineResponse20030) o;
    return Objects.equals(this.inlineResponse20030Result, inlineResponse20030.inlineResponse20030Result) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse20030Result, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20030 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse20030Result: ").append(toIndentedString(inlineResponse20030Result)).append("\n");
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
