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
/**
 * SamlGroupRuleSaml
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SamlGroupRuleSaml {
  @SerializedName("attribute_name")
  private String attributeName = null;

  @SerializedName("attribute_value")
  private String attributeValue = null;

  public SamlGroupRuleSaml attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

   /**
   * The name of the SAML attribute.
   * @return attributeName
  **/
  @Schema(example = "group", required = true, description = "The name of the SAML attribute.")
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  public SamlGroupRuleSaml attributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

   /**
   * The SAML attribute value to look for.
   * @return attributeValue
  **/
  @Schema(example = "devs@cloudflare.com", required = true, description = "The SAML attribute value to look for.")
  public String getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlGroupRuleSaml samlGroupRuleSaml = (SamlGroupRuleSaml) o;
    return Objects.equals(this.attributeName, samlGroupRuleSaml.attributeName) &&
        Objects.equals(this.attributeValue, samlGroupRuleSaml.attributeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, attributeValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlGroupRuleSaml {\n");
    
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
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
