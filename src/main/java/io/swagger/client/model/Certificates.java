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
import io.swagger.client.model.AssociatedHostnames;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Certificates
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Certificates {
  @SerializedName("associated_hostnames")
  private AssociatedHostnames associatedHostnames = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("expires_on")
  private OffsetDateTime expiresOn = null;

  @SerializedName("fingerprint")
  private String fingerprint = null;

  @SerializedName("id")
  private Object id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public Certificates associatedHostnames(AssociatedHostnames associatedHostnames) {
    this.associatedHostnames = associatedHostnames;
    return this;
  }

   /**
   * Get associatedHostnames
   * @return associatedHostnames
  **/
  @Schema(description = "")
  public AssociatedHostnames getAssociatedHostnames() {
    return associatedHostnames;
  }

  public void setAssociatedHostnames(AssociatedHostnames associatedHostnames) {
    this.associatedHostnames = associatedHostnames;
  }

  public Certificates createdAt(OffsetDateTime createdAt) {
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

  public Certificates expiresOn(OffsetDateTime expiresOn) {
    this.expiresOn = expiresOn;
    return this;
  }

   /**
   * Get expiresOn
   * @return expiresOn
  **/
  @Schema(description = "")
  public OffsetDateTime getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(OffsetDateTime expiresOn) {
    this.expiresOn = expiresOn;
  }

  public Certificates fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Get fingerprint
   * @return fingerprint
  **/
  @Schema(description = "")
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public Certificates id(Object id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the application that will use this certificate.
   * @return id
  **/
  @Schema(description = "The ID of the application that will use this certificate.")
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public Certificates name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Certificates updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Certificates certificates = (Certificates) o;
    return Objects.equals(this.associatedHostnames, certificates.associatedHostnames) &&
        Objects.equals(this.createdAt, certificates.createdAt) &&
        Objects.equals(this.expiresOn, certificates.expiresOn) &&
        Objects.equals(this.fingerprint, certificates.fingerprint) &&
        Objects.equals(this.id, certificates.id) &&
        Objects.equals(this.name, certificates.name) &&
        Objects.equals(this.updatedAt, certificates.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedHostnames, createdAt, expiresOn, fingerprint, id, name, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Certificates {\n");
    
    sb.append("    associatedHostnames: ").append(toIndentedString(associatedHostnames)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
