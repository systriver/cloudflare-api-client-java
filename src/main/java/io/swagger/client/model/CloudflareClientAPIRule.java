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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * CloudflareClientAPIRule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPIRule {
  @SerializedName("allowed_modes")
  private List<SchemasMode> allowedModes = new ArrayList<SchemasMode>();

  @SerializedName("configuration")
  private SchemasConfiguration _configuration = null;

  @SerializedName("created_on")
  private OffsetDateTime createdOn = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("mode")
  private SchemasMode mode = null;

  @SerializedName("modified_on")
  private OffsetDateTime modifiedOn = null;

  @SerializedName("notes")
  private String notes = null;

   /**
   * The available actions that a rule can apply to a matched request.
   * @return allowedModes
  **/
  @Schema(example = "[\"whitelist\",\"block\",\"challenge\",\"js_challenge\",\"managed_challenge\"]", required = true, description = "The available actions that a rule can apply to a matched request.")
  public List<SchemasMode> getAllowedModes() {
    return allowedModes;
  }

  public CloudflareClientAPIRule _configuration(SchemasConfiguration _configuration) {
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

   /**
   * The timestamp of when the rule was created.
   * @return createdOn
  **/
  @Schema(example = "2014-01-01T05:20:00.123450Z", description = "The timestamp of when the rule was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public CloudflareClientAPIRule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CloudflareClientAPIRule mode(SchemasMode mode) {
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

   /**
   * The timestamp of when the rule was last modified.
   * @return modifiedOn
  **/
  @Schema(example = "2014-01-01T05:20:00.123450Z", description = "The timestamp of when the rule was last modified.")
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

  public CloudflareClientAPIRule notes(String notes) {
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
    CloudflareClientAPIRule cloudflareClientAPIRule = (CloudflareClientAPIRule) o;
    return Objects.equals(this.allowedModes, cloudflareClientAPIRule.allowedModes) &&
        Objects.equals(this._configuration, cloudflareClientAPIRule._configuration) &&
        Objects.equals(this.createdOn, cloudflareClientAPIRule.createdOn) &&
        Objects.equals(this.id, cloudflareClientAPIRule.id) &&
        Objects.equals(this.mode, cloudflareClientAPIRule.mode) &&
        Objects.equals(this.modifiedOn, cloudflareClientAPIRule.modifiedOn) &&
        Objects.equals(this.notes, cloudflareClientAPIRule.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedModes, _configuration, createdOn, id, mode, modifiedOn, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIRule {\n");
    
    sb.append("    allowedModes: ").append(toIndentedString(allowedModes)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
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
