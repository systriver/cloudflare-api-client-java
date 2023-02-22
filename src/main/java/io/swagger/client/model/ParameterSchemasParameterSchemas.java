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
import io.swagger.client.model.ParameterSchemasDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * ParameterSchemasParameterSchemas
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ParameterSchemasParameterSchemas {
  @SerializedName("last_updated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("parameter_schemas")
  private ParameterSchemasDefinition parameterSchemas = null;

  public ParameterSchemasParameterSchemas lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @Schema(description = "")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ParameterSchemasParameterSchemas parameterSchemas(ParameterSchemasDefinition parameterSchemas) {
    this.parameterSchemas = parameterSchemas;
    return this;
  }

   /**
   * Get parameterSchemas
   * @return parameterSchemas
  **/
  @Schema(description = "")
  public ParameterSchemasDefinition getParameterSchemas() {
    return parameterSchemas;
  }

  public void setParameterSchemas(ParameterSchemasDefinition parameterSchemas) {
    this.parameterSchemas = parameterSchemas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterSchemasParameterSchemas parameterSchemasParameterSchemas = (ParameterSchemasParameterSchemas) o;
    return Objects.equals(this.lastUpdated, parameterSchemasParameterSchemas.lastUpdated) &&
        Objects.equals(this.parameterSchemas, parameterSchemasParameterSchemas.parameterSchemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdated, parameterSchemas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterSchemasParameterSchemas {\n");
    
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    parameterSchemas: ").append(toIndentedString(parameterSchemas)).append("\n");
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
