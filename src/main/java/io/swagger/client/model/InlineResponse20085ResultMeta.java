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
import io.swagger.client.model.InlineResponse20085ResultMetaTop0;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse20085ResultMeta
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T13:40:27.702461541+09:00[Asia/Tokyo]")
public class InlineResponse20085ResultMeta {
  @SerializedName("top_0")
  private InlineResponse20085ResultMetaTop0 top0 = null;

  public InlineResponse20085ResultMeta top0(InlineResponse20085ResultMetaTop0 top0) {
    this.top0 = top0;
    return this;
  }

   /**
   * Get top0
   * @return top0
  **/
  @Schema(required = true, description = "")
  public InlineResponse20085ResultMetaTop0 getTop0() {
    return top0;
  }

  public void setTop0(InlineResponse20085ResultMetaTop0 top0) {
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
    InlineResponse20085ResultMeta inlineResponse20085ResultMeta = (InlineResponse20085ResultMeta) o;
    return Objects.equals(this.top0, inlineResponse20085ResultMeta.top0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(top0);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20085ResultMeta {\n");
    
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
