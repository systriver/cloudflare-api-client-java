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
import io.swagger.client.model.SchemasConfiguration;
import io.swagger.client.model.SchemasMode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AccessRulesRulesBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class AccessRulesRulesBody {
  @SerializedName("configuration")
  private SchemasConfiguration _configuration = null;

  @SerializedName("mode")
  private SchemasMode mode = null;

  @SerializedName("notes")
  private String notes = null;

  public AccessRulesRulesBody _configuration(SchemasConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @Schema(required = true, description = "")
  public SchemasConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(SchemasConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public AccessRulesRulesBody mode(SchemasMode mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @Schema(required = true, description = "")
  public SchemasMode getMode() {
    return mode;
  }

  public void setMode(SchemasMode mode) {
    this.mode = mode;
  }

  public AccessRulesRulesBody notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @Schema(description = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessRulesRulesBody accessRulesRulesBody = (AccessRulesRulesBody) o;
    return Objects.equals(this._configuration, accessRulesRulesBody._configuration) &&
        Objects.equals(this.mode, accessRulesRulesBody.mode) &&
        Objects.equals(this.notes, accessRulesRulesBody.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, mode, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessRulesRulesBody {\n");
    
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
