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
import io.swagger.client.model.SchemasRole;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * CloudflareClientAPIBase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPIBase {
  @SerializedName("expires_on")
  private OffsetDateTime expiresOn = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("invited_by")
  private String invitedBy = null;

  @SerializedName("invited_member_email")
  private String invitedMemberEmail = null;

  @SerializedName("invited_member_id")
  private String invitedMemberId = null;

  @SerializedName("invited_on")
  private OffsetDateTime invitedOn = null;

  @SerializedName("organization_id")
  private String organizationId = null;

  @SerializedName("organization_name")
  private String organizationName = null;

  @SerializedName("roles")
  private List<SchemasRole> roles = null;

  public CloudflareClientAPIBase expiresOn(OffsetDateTime expiresOn) {
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

  public CloudflareClientAPIBase id(String id) {
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

  public CloudflareClientAPIBase invitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
    return this;
  }

   /**
   * Get invitedBy
   * @return invitedBy
  **/
  @Schema(description = "")
  public String getInvitedBy() {
    return invitedBy;
  }

  public void setInvitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
  }

  public CloudflareClientAPIBase invitedMemberEmail(String invitedMemberEmail) {
    this.invitedMemberEmail = invitedMemberEmail;
    return this;
  }

   /**
   * Get invitedMemberEmail
   * @return invitedMemberEmail
  **/
  @Schema(description = "")
  public String getInvitedMemberEmail() {
    return invitedMemberEmail;
  }

  public void setInvitedMemberEmail(String invitedMemberEmail) {
    this.invitedMemberEmail = invitedMemberEmail;
  }

   /**
   * ID of the user to add to the organization.
   * @return invitedMemberId
  **/
  @Schema(example = "5a7805061c76ada191ed06f989cc3dac", required = true, description = "ID of the user to add to the organization.")
  public String getInvitedMemberId() {
    return invitedMemberId;
  }

  public CloudflareClientAPIBase invitedOn(OffsetDateTime invitedOn) {
    this.invitedOn = invitedOn;
    return this;
  }

   /**
   * Get invitedOn
   * @return invitedOn
  **/
  @Schema(description = "")
  public OffsetDateTime getInvitedOn() {
    return invitedOn;
  }

  public void setInvitedOn(OffsetDateTime invitedOn) {
    this.invitedOn = invitedOn;
  }

   /**
   * ID of the organization the user will be added to.
   * @return organizationId
  **/
  @Schema(example = "5a7805061c76ada191ed06f989cc3dac", required = true, description = "ID of the organization the user will be added to.")
  public String getOrganizationId() {
    return organizationId;
  }

   /**
   * Organization name.
   * @return organizationName
  **/
  @Schema(example = "Cloudflare, Inc.", description = "Organization name.")
  public String getOrganizationName() {
    return organizationName;
  }

  public CloudflareClientAPIBase roles(List<SchemasRole> roles) {
    this.roles = roles;
    return this;
  }

  public CloudflareClientAPIBase addRolesItem(SchemasRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<SchemasRole>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Roles to be assigned to this user.
   * @return roles
  **/
  @Schema(description = "Roles to be assigned to this user.")
  public List<SchemasRole> getRoles() {
    return roles;
  }

  public void setRoles(List<SchemasRole> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPIBase cloudflareClientAPIBase = (CloudflareClientAPIBase) o;
    return Objects.equals(this.expiresOn, cloudflareClientAPIBase.expiresOn) &&
        Objects.equals(this.id, cloudflareClientAPIBase.id) &&
        Objects.equals(this.invitedBy, cloudflareClientAPIBase.invitedBy) &&
        Objects.equals(this.invitedMemberEmail, cloudflareClientAPIBase.invitedMemberEmail) &&
        Objects.equals(this.invitedMemberId, cloudflareClientAPIBase.invitedMemberId) &&
        Objects.equals(this.invitedOn, cloudflareClientAPIBase.invitedOn) &&
        Objects.equals(this.organizationId, cloudflareClientAPIBase.organizationId) &&
        Objects.equals(this.organizationName, cloudflareClientAPIBase.organizationName) &&
        Objects.equals(this.roles, cloudflareClientAPIBase.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresOn, id, invitedBy, invitedMemberEmail, invitedMemberId, invitedOn, organizationId, organizationName, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIBase {\n");
    
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invitedBy: ").append(toIndentedString(invitedBy)).append("\n");
    sb.append("    invitedMemberEmail: ").append(toIndentedString(invitedMemberEmail)).append("\n");
    sb.append("    invitedMemberId: ").append(toIndentedString(invitedMemberId)).append("\n");
    sb.append("    invitedOn: ").append(toIndentedString(invitedOn)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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