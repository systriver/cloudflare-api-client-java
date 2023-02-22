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
import io.swagger.client.model.InlineResponse20061ResultAsnEstimatedUsers;
import io.swagger.client.model.InlineResponse20061ResultAsnRelated;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20061ResultAsn
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T13:40:27.702461541+09:00[Asia/Tokyo]")
public class InlineResponse20061ResultAsn {
  @SerializedName("aka")
  private String aka = null;

  @SerializedName("asn")
  private Integer asn = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("countryName")
  private String countryName = null;

  @SerializedName("estimatedUsers")
  private InlineResponse20061ResultAsnEstimatedUsers estimatedUsers = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nameLong")
  private String nameLong = null;

  @SerializedName("orgName")
  private String orgName = null;

  @SerializedName("related")
  private List<InlineResponse20061ResultAsnRelated> related = new ArrayList<InlineResponse20061ResultAsnRelated>();

  @SerializedName("website")
  private String website = null;

  public InlineResponse20061ResultAsn aka(String aka) {
    this.aka = aka;
    return this;
  }

   /**
   * Get aka
   * @return aka
  **/
  @Schema(required = true, description = "")
  public String getAka() {
    return aka;
  }

  public void setAka(String aka) {
    this.aka = aka;
  }

  public InlineResponse20061ResultAsn asn(Integer asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @Schema(example = "714", required = true, description = "")
  public Integer getAsn() {
    return asn;
  }

  public void setAsn(Integer asn) {
    this.asn = asn;
  }

  public InlineResponse20061ResultAsn country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(example = "GB", required = true, description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public InlineResponse20061ResultAsn countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Get countryName
   * @return countryName
  **/
  @Schema(example = "United Kingdom", required = true, description = "")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public InlineResponse20061ResultAsn estimatedUsers(InlineResponse20061ResultAsnEstimatedUsers estimatedUsers) {
    this.estimatedUsers = estimatedUsers;
    return this;
  }

   /**
   * Get estimatedUsers
   * @return estimatedUsers
  **/
  @Schema(required = true, description = "")
  public InlineResponse20061ResultAsnEstimatedUsers getEstimatedUsers() {
    return estimatedUsers;
  }

  public void setEstimatedUsers(InlineResponse20061ResultAsnEstimatedUsers estimatedUsers) {
    this.estimatedUsers = estimatedUsers;
  }

  public InlineResponse20061ResultAsn name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Apple Inc.", required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse20061ResultAsn nameLong(String nameLong) {
    this.nameLong = nameLong;
    return this;
  }

   /**
   * Get nameLong
   * @return nameLong
  **/
  @Schema(required = true, description = "")
  public String getNameLong() {
    return nameLong;
  }

  public void setNameLong(String nameLong) {
    this.nameLong = nameLong;
  }

  public InlineResponse20061ResultAsn orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

   /**
   * Get orgName
   * @return orgName
  **/
  @Schema(required = true, description = "")
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public InlineResponse20061ResultAsn related(List<InlineResponse20061ResultAsnRelated> related) {
    this.related = related;
    return this;
  }

  public InlineResponse20061ResultAsn addRelatedItem(InlineResponse20061ResultAsnRelated relatedItem) {
    this.related.add(relatedItem);
    return this;
  }

   /**
   * Get related
   * @return related
  **/
  @Schema(required = true, description = "")
  public List<InlineResponse20061ResultAsnRelated> getRelated() {
    return related;
  }

  public void setRelated(List<InlineResponse20061ResultAsnRelated> related) {
    this.related = related;
  }

  public InlineResponse20061ResultAsn website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @Schema(example = "https://www.apple.com/support/systemstatus/", required = true, description = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20061ResultAsn inlineResponse20061ResultAsn = (InlineResponse20061ResultAsn) o;
    return Objects.equals(this.aka, inlineResponse20061ResultAsn.aka) &&
        Objects.equals(this.asn, inlineResponse20061ResultAsn.asn) &&
        Objects.equals(this.country, inlineResponse20061ResultAsn.country) &&
        Objects.equals(this.countryName, inlineResponse20061ResultAsn.countryName) &&
        Objects.equals(this.estimatedUsers, inlineResponse20061ResultAsn.estimatedUsers) &&
        Objects.equals(this.name, inlineResponse20061ResultAsn.name) &&
        Objects.equals(this.nameLong, inlineResponse20061ResultAsn.nameLong) &&
        Objects.equals(this.orgName, inlineResponse20061ResultAsn.orgName) &&
        Objects.equals(this.related, inlineResponse20061ResultAsn.related) &&
        Objects.equals(this.website, inlineResponse20061ResultAsn.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aka, asn, country, countryName, estimatedUsers, name, nameLong, orgName, related, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20061ResultAsn {\n");
    
    sb.append("    aka: ").append(toIndentedString(aka)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    estimatedUsers: ").append(toIndentedString(estimatedUsers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameLong: ").append(toIndentedString(nameLong)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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