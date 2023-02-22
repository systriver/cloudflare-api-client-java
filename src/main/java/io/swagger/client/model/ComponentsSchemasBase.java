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
import org.threeten.bp.OffsetDateTime;
/**
 * ComponentsSchemasBase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ComponentsSchemasBase {
  @SerializedName("id")
  private String id = null;

  @SerializedName("modified_on")
  private OffsetDateTime modifiedOn = null;

  public ComponentsSchemasBase id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the zone setting.
   * @return id
  **/
  @Schema(example = "development_mode", required = true, description = "Identifier of the zone setting.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * last time this setting was modified.
   * @return modifiedOn
  **/
  @Schema(example = "2014-01-01T05:20:00.123450Z", required = true, description = "last time this setting was modified.")
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentsSchemasBase componentsSchemasBase = (ComponentsSchemasBase) o;
    return Objects.equals(this.id, componentsSchemasBase.id) &&
        Objects.equals(this.modifiedOn, componentsSchemasBase.modifiedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, modifiedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentsSchemasBase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
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
