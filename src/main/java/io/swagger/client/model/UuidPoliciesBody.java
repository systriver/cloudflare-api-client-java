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
import io.swagger.client.model.ApprovalGroups;
import io.swagger.client.model.CloudflareClientAPIInclude;
import io.swagger.client.model.CloudflareClientAPISchemasExclude;
import io.swagger.client.model.CloudflareClientAPISchemasRequire;
import io.swagger.client.model.Decision;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UuidPoliciesBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class UuidPoliciesBody {
  @SerializedName("approval_groups")
  private ApprovalGroups approvalGroups = null;

  @SerializedName("approval_required")
  private Boolean approvalRequired = null;

  @SerializedName("decision")
  private Decision decision = null;

  @SerializedName("exclude")
  private CloudflareClientAPISchemasExclude exclude = null;

  @SerializedName("include")
  private CloudflareClientAPIInclude include = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("precedence")
  private Integer precedence = null;

  @SerializedName("purpose_justification_prompt")
  private String purposeJustificationPrompt = null;

  @SerializedName("purpose_justification_required")
  private Boolean purposeJustificationRequired = null;

  @SerializedName("require")
  private CloudflareClientAPISchemasRequire require = null;

  public UuidPoliciesBody approvalGroups(ApprovalGroups approvalGroups) {
    this.approvalGroups = approvalGroups;
    return this;
  }

   /**
   * Get approvalGroups
   * @return approvalGroups
  **/
  @Schema(description = "")
  public ApprovalGroups getApprovalGroups() {
    return approvalGroups;
  }

  public void setApprovalGroups(ApprovalGroups approvalGroups) {
    this.approvalGroups = approvalGroups;
  }

  public UuidPoliciesBody approvalRequired(Boolean approvalRequired) {
    this.approvalRequired = approvalRequired;
    return this;
  }

   /**
   * Get approvalRequired
   * @return approvalRequired
  **/
  @Schema(description = "")
  public Boolean getApprovalRequired() {
    return approvalRequired;
  }

  public void setApprovalRequired(Boolean approvalRequired) {
    this.approvalRequired = approvalRequired;
  }

  public UuidPoliciesBody decision(Decision decision) {
    this.decision = decision;
    return this;
  }

   /**
   * Get decision
   * @return decision
  **/
  @Schema(required = true, description = "")
  public Decision getDecision() {
    return decision;
  }

  public void setDecision(Decision decision) {
    this.decision = decision;
  }

  public UuidPoliciesBody exclude(CloudflareClientAPISchemasExclude exclude) {
    this.exclude = exclude;
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  @Schema(description = "")
  public CloudflareClientAPISchemasExclude getExclude() {
    return exclude;
  }

  public void setExclude(CloudflareClientAPISchemasExclude exclude) {
    this.exclude = exclude;
  }

  public UuidPoliciesBody include(CloudflareClientAPIInclude include) {
    this.include = include;
    return this;
  }

   /**
   * Get include
   * @return include
  **/
  @Schema(required = true, description = "")
  public CloudflareClientAPIInclude getInclude() {
    return include;
  }

  public void setInclude(CloudflareClientAPIInclude include) {
    this.include = include;
  }

  public UuidPoliciesBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UuidPoliciesBody precedence(Integer precedence) {
    this.precedence = precedence;
    return this;
  }

   /**
   * Get precedence
   * @return precedence
  **/
  @Schema(description = "")
  public Integer getPrecedence() {
    return precedence;
  }

  public void setPrecedence(Integer precedence) {
    this.precedence = precedence;
  }

  public UuidPoliciesBody purposeJustificationPrompt(String purposeJustificationPrompt) {
    this.purposeJustificationPrompt = purposeJustificationPrompt;
    return this;
  }

   /**
   * Get purposeJustificationPrompt
   * @return purposeJustificationPrompt
  **/
  @Schema(description = "")
  public String getPurposeJustificationPrompt() {
    return purposeJustificationPrompt;
  }

  public void setPurposeJustificationPrompt(String purposeJustificationPrompt) {
    this.purposeJustificationPrompt = purposeJustificationPrompt;
  }

  public UuidPoliciesBody purposeJustificationRequired(Boolean purposeJustificationRequired) {
    this.purposeJustificationRequired = purposeJustificationRequired;
    return this;
  }

   /**
   * Get purposeJustificationRequired
   * @return purposeJustificationRequired
  **/
  @Schema(description = "")
  public Boolean getPurposeJustificationRequired() {
    return purposeJustificationRequired;
  }

  public void setPurposeJustificationRequired(Boolean purposeJustificationRequired) {
    this.purposeJustificationRequired = purposeJustificationRequired;
  }

  public UuidPoliciesBody require(CloudflareClientAPISchemasRequire require) {
    this.require = require;
    return this;
  }

   /**
   * Get require
   * @return require
  **/
  @Schema(description = "")
  public CloudflareClientAPISchemasRequire getRequire() {
    return require;
  }

  public void setRequire(CloudflareClientAPISchemasRequire require) {
    this.require = require;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UuidPoliciesBody uuidPoliciesBody = (UuidPoliciesBody) o;
    return Objects.equals(this.approvalGroups, uuidPoliciesBody.approvalGroups) &&
        Objects.equals(this.approvalRequired, uuidPoliciesBody.approvalRequired) &&
        Objects.equals(this.decision, uuidPoliciesBody.decision) &&
        Objects.equals(this.exclude, uuidPoliciesBody.exclude) &&
        Objects.equals(this.include, uuidPoliciesBody.include) &&
        Objects.equals(this.name, uuidPoliciesBody.name) &&
        Objects.equals(this.precedence, uuidPoliciesBody.precedence) &&
        Objects.equals(this.purposeJustificationPrompt, uuidPoliciesBody.purposeJustificationPrompt) &&
        Objects.equals(this.purposeJustificationRequired, uuidPoliciesBody.purposeJustificationRequired) &&
        Objects.equals(this.require, uuidPoliciesBody.require);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalGroups, approvalRequired, decision, exclude, include, name, precedence, purposeJustificationPrompt, purposeJustificationRequired, require);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UuidPoliciesBody {\n");
    
    sb.append("    approvalGroups: ").append(toIndentedString(approvalGroups)).append("\n");
    sb.append("    approvalRequired: ").append(toIndentedString(approvalRequired)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    precedence: ").append(toIndentedString(precedence)).append("\n");
    sb.append("    purposeJustificationPrompt: ").append(toIndentedString(purposeJustificationPrompt)).append("\n");
    sb.append("    purposeJustificationRequired: ").append(toIndentedString(purposeJustificationRequired)).append("\n");
    sb.append("    require: ").append(toIndentedString(require)).append("\n");
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
