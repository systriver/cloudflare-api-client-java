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
import io.swagger.client.model.AdditionalInformation;
import io.swagger.client.model.ContentCategories;
import io.swagger.client.model.ResolvesToRefs;
import io.swagger.client.model.RiskTypes;
import io.swagger.client.model.SchemasApplication;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * DomainComponentsSchemasDomain
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DomainComponentsSchemasDomain {
  @SerializedName("additional_information")
  private AdditionalInformation additionalInformation = null;

  @SerializedName("application")
  private SchemasApplication application = null;

  @SerializedName("content_categories")
  private ContentCategories contentCategories = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("popularity_rank")
  private Integer popularityRank = null;

  @SerializedName("resolves_to_refs")
  private ResolvesToRefs resolvesToRefs = null;

  @SerializedName("risk_score")
  private BigDecimal riskScore = null;

  @SerializedName("risk_types")
  private RiskTypes riskTypes = null;

  public DomainComponentsSchemasDomain additionalInformation(AdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @Schema(description = "")
  public AdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(AdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public DomainComponentsSchemasDomain application(SchemasApplication application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @Schema(description = "")
  public SchemasApplication getApplication() {
    return application;
  }

  public void setApplication(SchemasApplication application) {
    this.application = application;
  }

  public DomainComponentsSchemasDomain contentCategories(ContentCategories contentCategories) {
    this.contentCategories = contentCategories;
    return this;
  }

   /**
   * Get contentCategories
   * @return contentCategories
  **/
  @Schema(description = "")
  public ContentCategories getContentCategories() {
    return contentCategories;
  }

  public void setContentCategories(ContentCategories contentCategories) {
    this.contentCategories = contentCategories;
  }

  public DomainComponentsSchemasDomain domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @Schema(description = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public DomainComponentsSchemasDomain popularityRank(Integer popularityRank) {
    this.popularityRank = popularityRank;
    return this;
  }

   /**
   * Get popularityRank
   * @return popularityRank
  **/
  @Schema(description = "")
  public Integer getPopularityRank() {
    return popularityRank;
  }

  public void setPopularityRank(Integer popularityRank) {
    this.popularityRank = popularityRank;
  }

  public DomainComponentsSchemasDomain resolvesToRefs(ResolvesToRefs resolvesToRefs) {
    this.resolvesToRefs = resolvesToRefs;
    return this;
  }

   /**
   * Get resolvesToRefs
   * @return resolvesToRefs
  **/
  @Schema(description = "")
  public ResolvesToRefs getResolvesToRefs() {
    return resolvesToRefs;
  }

  public void setResolvesToRefs(ResolvesToRefs resolvesToRefs) {
    this.resolvesToRefs = resolvesToRefs;
  }

  public DomainComponentsSchemasDomain riskScore(BigDecimal riskScore) {
    this.riskScore = riskScore;
    return this;
  }

   /**
   * Get riskScore
   * @return riskScore
  **/
  @Schema(description = "")
  public BigDecimal getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(BigDecimal riskScore) {
    this.riskScore = riskScore;
  }

  public DomainComponentsSchemasDomain riskTypes(RiskTypes riskTypes) {
    this.riskTypes = riskTypes;
    return this;
  }

   /**
   * Get riskTypes
   * @return riskTypes
  **/
  @Schema(description = "")
  public RiskTypes getRiskTypes() {
    return riskTypes;
  }

  public void setRiskTypes(RiskTypes riskTypes) {
    this.riskTypes = riskTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainComponentsSchemasDomain domainComponentsSchemasDomain = (DomainComponentsSchemasDomain) o;
    return Objects.equals(this.additionalInformation, domainComponentsSchemasDomain.additionalInformation) &&
        Objects.equals(this.application, domainComponentsSchemasDomain.application) &&
        Objects.equals(this.contentCategories, domainComponentsSchemasDomain.contentCategories) &&
        Objects.equals(this.domain, domainComponentsSchemasDomain.domain) &&
        Objects.equals(this.popularityRank, domainComponentsSchemasDomain.popularityRank) &&
        Objects.equals(this.resolvesToRefs, domainComponentsSchemasDomain.resolvesToRefs) &&
        Objects.equals(this.riskScore, domainComponentsSchemasDomain.riskScore) &&
        Objects.equals(this.riskTypes, domainComponentsSchemasDomain.riskTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformation, application, contentCategories, domain, popularityRank, resolvesToRefs, riskScore, riskTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainComponentsSchemasDomain {\n");
    
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    contentCategories: ").append(toIndentedString(contentCategories)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    popularityRank: ").append(toIndentedString(popularityRank)).append("\n");
    sb.append("    resolvesToRefs: ").append(toIndentedString(resolvesToRefs)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    riskTypes: ").append(toIndentedString(riskTypes)).append("\n");
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
