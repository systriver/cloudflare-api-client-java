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
import io.swagger.client.model.NelValue;
import io.swagger.client.model.SchemasBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Enable Network Error Logging reporting on your zone. (Beta) 
 */
@Schema(description = "Enable Network Error Logging reporting on your zone. (Beta) ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Nel extends SchemasBase implements Setting {
  @SerializedName("id")
  private String nelId = null;

  @SerializedName("value")
  private NelValue nelValue = null;

  public Nel nelId(String nelId) {
    this.nelId = nelId;
    return this;
  }

   /**
   * Zone setting identifier.
   * @return nelId
  **/
  @Schema(example = "nel", description = "Zone setting identifier.")
  public String getNelId() {
    return nelId;
  }

  public void setNelId(String nelId) {
    this.nelId = nelId;
  }

  public Nel nelValue(NelValue nelValue) {
    this.nelValue = nelValue;
    return this;
  }

   /**
   * Get nelValue
   * @return nelValue
  **/
  @Schema(description = "")
  public NelValue getNelValue() {
    return nelValue;
  }

  public void setNelValue(NelValue nelValue) {
    this.nelValue = nelValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nel nel = (Nel) o;
    return Objects.equals(this.nelId, nel.nelId) &&
        Objects.equals(this.nelValue, nel.nelValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nelId, nelValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nelId: ").append(toIndentedString(nelId)).append("\n");
    sb.append("    nelValue: ").append(toIndentedString(nelValue)).append("\n");
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