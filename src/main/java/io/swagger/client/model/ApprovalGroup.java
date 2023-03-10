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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * A group of email addresses that can approve a temporary authentication request.
 */
@Schema(description = "A group of email addresses that can approve a temporary authentication request.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ApprovalGroup {
  @SerializedName("approvals_needed")
  private BigDecimal approvalsNeeded = null;

  @SerializedName("email_addresses")
  private List<Object> emailAddresses = null;

  @SerializedName("email_list_uuid")
  private String emailListUuid = null;

  public ApprovalGroup approvalsNeeded(BigDecimal approvalsNeeded) {
    this.approvalsNeeded = approvalsNeeded;
    return this;
  }

   /**
   * The number of approvals needed to obtain access.
   * minimum: 0
   * @return approvalsNeeded
  **/
  @Schema(example = "1", required = true, description = "The number of approvals needed to obtain access.")
  public BigDecimal getApprovalsNeeded() {
    return approvalsNeeded;
  }

  public void setApprovalsNeeded(BigDecimal approvalsNeeded) {
    this.approvalsNeeded = approvalsNeeded;
  }

  public ApprovalGroup emailAddresses(List<Object> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public ApprovalGroup addEmailAddressesItem(Object emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<Object>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * A list of emails that can approve the access request.
   * @return emailAddresses
  **/
  @Schema(example = "[\"test@cloudflare.com\",\"test2@cloudflare.com\"]", description = "A list of emails that can approve the access request.")
  public List<Object> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<Object> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public ApprovalGroup emailListUuid(String emailListUuid) {
    this.emailListUuid = emailListUuid;
    return this;
  }

   /**
   * The UUID of an re-usable email list.
   * @return emailListUuid
  **/
  @Schema(description = "The UUID of an re-usable email list.")
  public String getEmailListUuid() {
    return emailListUuid;
  }

  public void setEmailListUuid(String emailListUuid) {
    this.emailListUuid = emailListUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalGroup approvalGroup = (ApprovalGroup) o;
    return Objects.equals(this.approvalsNeeded, approvalGroup.approvalsNeeded) &&
        Objects.equals(this.emailAddresses, approvalGroup.emailAddresses) &&
        Objects.equals(this.emailListUuid, approvalGroup.emailListUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalsNeeded, emailAddresses, emailListUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalGroup {\n");
    
    sb.append("    approvalsNeeded: ").append(toIndentedString(approvalsNeeded)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    emailListUuid: ").append(toIndentedString(emailListUuid)).append("\n");
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
