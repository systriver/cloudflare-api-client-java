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
import io.swagger.client.model.ModelClass;
import io.swagger.client.model.Subcategory;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SchemasCategories
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SchemasCategories {
  @SerializedName("beta")
  private Boolean beta = null;

  @SerializedName("class")
  private ModelClass propertyClass = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("subcategories")
  private List<Subcategory> subcategories = null;

  public SchemasCategories beta(Boolean beta) {
    this.beta = beta;
    return this;
  }

   /**
   * Get beta
   * @return beta
  **/
  @Schema(description = "")
  public Boolean getBeta() {
    return beta;
  }

  public void setBeta(Boolean beta) {
    this.beta = beta;
  }

  public SchemasCategories propertyClass(ModelClass propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @Schema(description = "")
  public ModelClass getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(ModelClass propertyClass) {
    this.propertyClass = propertyClass;
  }

  public SchemasCategories description(String description) {
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

  public SchemasCategories id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SchemasCategories name(String name) {
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

  public SchemasCategories subcategories(List<Subcategory> subcategories) {
    this.subcategories = subcategories;
    return this;
  }

  public SchemasCategories addSubcategoriesItem(Subcategory subcategoriesItem) {
    if (this.subcategories == null) {
      this.subcategories = new ArrayList<Subcategory>();
    }
    this.subcategories.add(subcategoriesItem);
    return this;
  }

   /**
   * All subcategories for this category.
   * @return subcategories
  **/
  @Schema(description = "All subcategories for this category.")
  public List<Subcategory> getSubcategories() {
    return subcategories;
  }

  public void setSubcategories(List<Subcategory> subcategories) {
    this.subcategories = subcategories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemasCategories schemasCategories = (SchemasCategories) o;
    return Objects.equals(this.beta, schemasCategories.beta) &&
        Objects.equals(this.propertyClass, schemasCategories.propertyClass) &&
        Objects.equals(this.description, schemasCategories.description) &&
        Objects.equals(this.id, schemasCategories.id) &&
        Objects.equals(this.name, schemasCategories.name) &&
        Objects.equals(this.subcategories, schemasCategories.subcategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beta, propertyClass, description, id, name, subcategories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasCategories {\n");
    
    sb.append("    beta: ").append(toIndentedString(beta)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subcategories: ").append(toIndentedString(subcategories)).append("\n");
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
