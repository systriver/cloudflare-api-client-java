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
import io.swagger.client.model.BrotliValue;
import io.swagger.client.model.SchemasBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * When the client requesting an asset supports the Brotli compression algorithm, Cloudflare will serve a Brotli compressed version of the asset.
 */
@Schema(description = "When the client requesting an asset supports the Brotli compression algorithm, Cloudflare will serve a Brotli compressed version of the asset.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Brotli extends SchemasBase implements Setting {
  @SerializedName("id")
  private String brotliId = null;

  @SerializedName("value")
  private BrotliValue brotliValue = null;

  public Brotli brotliId(String brotliId) {
    this.brotliId = brotliId;
    return this;
  }

   /**
   * ID of the zone setting.
   * @return brotliId
  **/
  @Schema(example = "brotli", description = "ID of the zone setting.")
  public String getBrotliId() {
    return brotliId;
  }

  public void setBrotliId(String brotliId) {
    this.brotliId = brotliId;
  }

  public Brotli brotliValue(BrotliValue brotliValue) {
    this.brotliValue = brotliValue;
    return this;
  }

   /**
   * Get brotliValue
   * @return brotliValue
  **/
  @Schema(description = "")
  public BrotliValue getBrotliValue() {
    return brotliValue;
  }

  public void setBrotliValue(BrotliValue brotliValue) {
    this.brotliValue = brotliValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Brotli brotli = (Brotli) o;
    return Objects.equals(this.brotliId, brotli.brotliId) &&
        Objects.equals(this.brotliValue, brotli.brotliValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brotliId, brotliValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Brotli {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    brotliId: ").append(toIndentedString(brotliId)).append("\n");
    sb.append("    brotliValue: ").append(toIndentedString(brotliValue)).append("\n");
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
