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
import io.swagger.client.model.RegistrantContact;
import io.swagger.client.model.TransferIn;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * DomainProperties
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DomainProperties {
  @SerializedName("available")
  private Boolean available = null;

  @SerializedName("can_register")
  private Boolean canRegister = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("current_registrar")
  private String currentRegistrar = null;

  @SerializedName("expires_at")
  private OffsetDateTime expiresAt = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("registrant_contact")
  private RegistrantContact registrantContact = null;

  @SerializedName("registry_statuses")
  private String registryStatuses = null;

  @SerializedName("supported_tld")
  private Boolean supportedTld = null;

  @SerializedName("transfer_in")
  private TransferIn transferIn = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public DomainProperties available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @Schema(description = "")
  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public DomainProperties canRegister(Boolean canRegister) {
    this.canRegister = canRegister;
    return this;
  }

   /**
   * Get canRegister
   * @return canRegister
  **/
  @Schema(description = "")
  public Boolean getCanRegister() {
    return canRegister;
  }

  public void setCanRegister(Boolean canRegister) {
    this.canRegister = canRegister;
  }

  public DomainProperties createdAt(OffsetDateTime createdAt) {
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

  public DomainProperties currentRegistrar(String currentRegistrar) {
    this.currentRegistrar = currentRegistrar;
    return this;
  }

   /**
   * Get currentRegistrar
   * @return currentRegistrar
  **/
  @Schema(description = "")
  public String getCurrentRegistrar() {
    return currentRegistrar;
  }

  public void setCurrentRegistrar(String currentRegistrar) {
    this.currentRegistrar = currentRegistrar;
  }

  public DomainProperties expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @Schema(description = "")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public DomainProperties id(String id) {
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

  public DomainProperties locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @Schema(description = "")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public DomainProperties registrantContact(RegistrantContact registrantContact) {
    this.registrantContact = registrantContact;
    return this;
  }

   /**
   * Get registrantContact
   * @return registrantContact
  **/
  @Schema(description = "")
  public RegistrantContact getRegistrantContact() {
    return registrantContact;
  }

  public void setRegistrantContact(RegistrantContact registrantContact) {
    this.registrantContact = registrantContact;
  }

  public DomainProperties registryStatuses(String registryStatuses) {
    this.registryStatuses = registryStatuses;
    return this;
  }

   /**
   * Get registryStatuses
   * @return registryStatuses
  **/
  @Schema(description = "")
  public String getRegistryStatuses() {
    return registryStatuses;
  }

  public void setRegistryStatuses(String registryStatuses) {
    this.registryStatuses = registryStatuses;
  }

  public DomainProperties supportedTld(Boolean supportedTld) {
    this.supportedTld = supportedTld;
    return this;
  }

   /**
   * Get supportedTld
   * @return supportedTld
  **/
  @Schema(description = "")
  public Boolean getSupportedTld() {
    return supportedTld;
  }

  public void setSupportedTld(Boolean supportedTld) {
    this.supportedTld = supportedTld;
  }

  public DomainProperties transferIn(TransferIn transferIn) {
    this.transferIn = transferIn;
    return this;
  }

   /**
   * Get transferIn
   * @return transferIn
  **/
  @Schema(description = "")
  public TransferIn getTransferIn() {
    return transferIn;
  }

  public void setTransferIn(TransferIn transferIn) {
    this.transferIn = transferIn;
  }

  public DomainProperties updatedAt(OffsetDateTime updatedAt) {
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
    DomainProperties domainProperties = (DomainProperties) o;
    return Objects.equals(this.available, domainProperties.available) &&
        Objects.equals(this.canRegister, domainProperties.canRegister) &&
        Objects.equals(this.createdAt, domainProperties.createdAt) &&
        Objects.equals(this.currentRegistrar, domainProperties.currentRegistrar) &&
        Objects.equals(this.expiresAt, domainProperties.expiresAt) &&
        Objects.equals(this.id, domainProperties.id) &&
        Objects.equals(this.locked, domainProperties.locked) &&
        Objects.equals(this.registrantContact, domainProperties.registrantContact) &&
        Objects.equals(this.registryStatuses, domainProperties.registryStatuses) &&
        Objects.equals(this.supportedTld, domainProperties.supportedTld) &&
        Objects.equals(this.transferIn, domainProperties.transferIn) &&
        Objects.equals(this.updatedAt, domainProperties.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, canRegister, createdAt, currentRegistrar, expiresAt, id, locked, registrantContact, registryStatuses, supportedTld, transferIn, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainProperties {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    canRegister: ").append(toIndentedString(canRegister)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currentRegistrar: ").append(toIndentedString(currentRegistrar)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    registrantContact: ").append(toIndentedString(registrantContact)).append("\n");
    sb.append("    registryStatuses: ").append(toIndentedString(registryStatuses)).append("\n");
    sb.append("    supportedTld: ").append(toIndentedString(supportedTld)).append("\n");
    sb.append("    transferIn: ").append(toIndentedString(transferIn)).append("\n");
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
