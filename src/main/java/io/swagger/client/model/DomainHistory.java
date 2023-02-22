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
import io.swagger.client.model.DomainhistoryCategorizations;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DomainHistory
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DomainHistory {
  @SerializedName("categorizations")
  private List<DomainhistoryCategorizations> categorizations = null;

  @SerializedName("domain")
  private String domain = null;

  public DomainHistory categorizations(List<DomainhistoryCategorizations> categorizations) {
    this.categorizations = categorizations;
    return this;
  }

  public DomainHistory addCategorizationsItem(DomainhistoryCategorizations categorizationsItem) {
    if (this.categorizations == null) {
      this.categorizations = new ArrayList<DomainhistoryCategorizations>();
    }
    this.categorizations.add(categorizationsItem);
    return this;
  }

   /**
   * Get categorizations
   * @return categorizations
  **/
  @Schema(description = "")
  public List<DomainhistoryCategorizations> getCategorizations() {
    return categorizations;
  }

  public void setCategorizations(List<DomainhistoryCategorizations> categorizations) {
    this.categorizations = categorizations;
  }

  public DomainHistory domain(String domain) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainHistory domainHistory = (DomainHistory) o;
    return Objects.equals(this.categorizations, domainHistory.categorizations) &&
        Objects.equals(this.domain, domainHistory.domain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categorizations, domain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainHistory {\n");
    
    sb.append("    categorizations: ").append(toIndentedString(categorizations)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
