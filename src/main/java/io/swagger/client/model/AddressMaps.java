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
 * AddressMaps
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class AddressMaps {
  @SerializedName("can_delete")
  private Boolean canDelete = null;

  @SerializedName("can_modify_ips")
  private Boolean canModifyIps = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("default_sni")
  private String defaultSni = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("modified_at")
  private OffsetDateTime modifiedAt = null;

  public AddressMaps canDelete(Boolean canDelete) {
    this.canDelete = canDelete;
    return this;
  }

   /**
   * Get canDelete
   * @return canDelete
  **/
  @Schema(description = "")
  public Boolean getCanDelete() {
    return canDelete;
  }

  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }

  public AddressMaps canModifyIps(Boolean canModifyIps) {
    this.canModifyIps = canModifyIps;
    return this;
  }

   /**
   * Get canModifyIps
   * @return canModifyIps
  **/
  @Schema(description = "")
  public Boolean getCanModifyIps() {
    return canModifyIps;
  }

  public void setCanModifyIps(Boolean canModifyIps) {
    this.canModifyIps = canModifyIps;
  }

  public AddressMaps createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AddressMaps defaultSni(String defaultSni) {
    this.defaultSni = defaultSni;
    return this;
  }

   /**
   * Get defaultSni
   * @return defaultSni
  **/
  @Schema(description = "")
  public String getDefaultSni() {
    return defaultSni;
  }

  public void setDefaultSni(String defaultSni) {
    this.defaultSni = defaultSni;
  }

  public AddressMaps description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AddressMaps enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AddressMaps id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AddressMaps modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressMaps addressMaps = (AddressMaps) o;
    return Objects.equals(this.canDelete, addressMaps.canDelete) &&
        Objects.equals(this.canModifyIps, addressMaps.canModifyIps) &&
        Objects.equals(this.createdAt, addressMaps.createdAt) &&
        Objects.equals(this.defaultSni, addressMaps.defaultSni) &&
        Objects.equals(this.description, addressMaps.description) &&
        Objects.equals(this.enabled, addressMaps.enabled) &&
        Objects.equals(this.id, addressMaps.id) &&
        Objects.equals(this.modifiedAt, addressMaps.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canDelete, canModifyIps, createdAt, defaultSni, description, enabled, id, modifiedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressMaps {\n");
    
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canModifyIps: ").append(toIndentedString(canModifyIps)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    defaultSni: ").append(toIndentedString(defaultSni)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
