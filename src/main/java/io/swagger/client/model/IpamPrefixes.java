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
 * IpamPrefixes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class IpamPrefixes {
  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("advertised")
  private Boolean advertised = null;

  @SerializedName("advertised_modified_at")
  private OffsetDateTime advertisedModifiedAt = null;

  @SerializedName("approved")
  private String approved = null;

  @SerializedName("asn")
  private Integer asn = null;

  @SerializedName("cidr")
  private String cidr = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("loa_document_id")
  private String loaDocumentId = null;

  @SerializedName("modified_at")
  private OffsetDateTime modifiedAt = null;

  @SerializedName("on_demand_enabled")
  private Boolean onDemandEnabled = null;

  @SerializedName("on_demand_locked")
  private Boolean onDemandLocked = null;

  public IpamPrefixes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public IpamPrefixes advertised(Boolean advertised) {
    this.advertised = advertised;
    return this;
  }

   /**
   * Get advertised
   * @return advertised
  **/
  @Schema(description = "")
  public Boolean getAdvertised() {
    return advertised;
  }

  public void setAdvertised(Boolean advertised) {
    this.advertised = advertised;
  }

  public IpamPrefixes advertisedModifiedAt(OffsetDateTime advertisedModifiedAt) {
    this.advertisedModifiedAt = advertisedModifiedAt;
    return this;
  }

   /**
   * Get advertisedModifiedAt
   * @return advertisedModifiedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getAdvertisedModifiedAt() {
    return advertisedModifiedAt;
  }

  public void setAdvertisedModifiedAt(OffsetDateTime advertisedModifiedAt) {
    this.advertisedModifiedAt = advertisedModifiedAt;
  }

  public IpamPrefixes approved(String approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @Schema(description = "")
  public String getApproved() {
    return approved;
  }

  public void setApproved(String approved) {
    this.approved = approved;
  }

  public IpamPrefixes asn(Integer asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @Schema(description = "")
  public Integer getAsn() {
    return asn;
  }

  public void setAsn(Integer asn) {
    this.asn = asn;
  }

  public IpamPrefixes cidr(String cidr) {
    this.cidr = cidr;
    return this;
  }

   /**
   * Get cidr
   * @return cidr
  **/
  @Schema(description = "")
  public String getCidr() {
    return cidr;
  }

  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  public IpamPrefixes createdAt(OffsetDateTime createdAt) {
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

  public IpamPrefixes description(String description) {
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

  public IpamPrefixes id(String id) {
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

  public IpamPrefixes loaDocumentId(String loaDocumentId) {
    this.loaDocumentId = loaDocumentId;
    return this;
  }

   /**
   * Get loaDocumentId
   * @return loaDocumentId
  **/
  @Schema(description = "")
  public String getLoaDocumentId() {
    return loaDocumentId;
  }

  public void setLoaDocumentId(String loaDocumentId) {
    this.loaDocumentId = loaDocumentId;
  }

  public IpamPrefixes modifiedAt(OffsetDateTime modifiedAt) {
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

  public IpamPrefixes onDemandEnabled(Boolean onDemandEnabled) {
    this.onDemandEnabled = onDemandEnabled;
    return this;
  }

   /**
   * Get onDemandEnabled
   * @return onDemandEnabled
  **/
  @Schema(description = "")
  public Boolean getOnDemandEnabled() {
    return onDemandEnabled;
  }

  public void setOnDemandEnabled(Boolean onDemandEnabled) {
    this.onDemandEnabled = onDemandEnabled;
  }

  public IpamPrefixes onDemandLocked(Boolean onDemandLocked) {
    this.onDemandLocked = onDemandLocked;
    return this;
  }

   /**
   * Get onDemandLocked
   * @return onDemandLocked
  **/
  @Schema(description = "")
  public Boolean getOnDemandLocked() {
    return onDemandLocked;
  }

  public void setOnDemandLocked(Boolean onDemandLocked) {
    this.onDemandLocked = onDemandLocked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpamPrefixes ipamPrefixes = (IpamPrefixes) o;
    return Objects.equals(this.accountId, ipamPrefixes.accountId) &&
        Objects.equals(this.advertised, ipamPrefixes.advertised) &&
        Objects.equals(this.advertisedModifiedAt, ipamPrefixes.advertisedModifiedAt) &&
        Objects.equals(this.approved, ipamPrefixes.approved) &&
        Objects.equals(this.asn, ipamPrefixes.asn) &&
        Objects.equals(this.cidr, ipamPrefixes.cidr) &&
        Objects.equals(this.createdAt, ipamPrefixes.createdAt) &&
        Objects.equals(this.description, ipamPrefixes.description) &&
        Objects.equals(this.id, ipamPrefixes.id) &&
        Objects.equals(this.loaDocumentId, ipamPrefixes.loaDocumentId) &&
        Objects.equals(this.modifiedAt, ipamPrefixes.modifiedAt) &&
        Objects.equals(this.onDemandEnabled, ipamPrefixes.onDemandEnabled) &&
        Objects.equals(this.onDemandLocked, ipamPrefixes.onDemandLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, advertised, advertisedModifiedAt, approved, asn, cidr, createdAt, description, id, loaDocumentId, modifiedAt, onDemandEnabled, onDemandLocked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpamPrefixes {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    advertised: ").append(toIndentedString(advertised)).append("\n");
    sb.append("    advertisedModifiedAt: ").append(toIndentedString(advertisedModifiedAt)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    loaDocumentId: ").append(toIndentedString(loaDocumentId)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    onDemandEnabled: ").append(toIndentedString(onDemandEnabled)).append("\n");
    sb.append("    onDemandLocked: ").append(toIndentedString(onDemandLocked)).append("\n");
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
