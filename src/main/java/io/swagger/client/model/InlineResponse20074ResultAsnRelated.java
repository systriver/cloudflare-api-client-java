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
 * InlineResponse20074ResultAsnRelated
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20074ResultAsnRelated {
  @SerializedName("aka")
  private String aka = null;

  @SerializedName("asn")
  private Integer asn = null;

  @SerializedName("estimatedUsers")
  private Integer estimatedUsers = null;

  @SerializedName("name")
  private String name = null;

  public InlineResponse20074ResultAsnRelated aka(String aka) {
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

  public InlineResponse20074ResultAsnRelated asn(Integer asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Get asn
   * @return asn
  **/
  @Schema(example = "174", required = true, description = "")
  public Integer getAsn() {
    return asn;
  }

  public void setAsn(Integer asn) {
    this.asn = asn;
  }

  public InlineResponse20074ResultAsnRelated estimatedUsers(Integer estimatedUsers) {
    this.estimatedUsers = estimatedUsers;
    return this;
  }

   /**
   * Total estimated users
   * @return estimatedUsers
  **/
  @Schema(example = "65345", description = "Total estimated users")
  public Integer getEstimatedUsers() {
    return estimatedUsers;
  }

  public void setEstimatedUsers(Integer estimatedUsers) {
    this.estimatedUsers = estimatedUsers;
  }

  public InlineResponse20074ResultAsnRelated name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Cogent-174", required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20074ResultAsnRelated inlineResponse20074ResultAsnRelated = (InlineResponse20074ResultAsnRelated) o;
    return Objects.equals(this.aka, inlineResponse20074ResultAsnRelated.aka) &&
        Objects.equals(this.asn, inlineResponse20074ResultAsnRelated.asn) &&
        Objects.equals(this.estimatedUsers, inlineResponse20074ResultAsnRelated.estimatedUsers) &&
        Objects.equals(this.name, inlineResponse20074ResultAsnRelated.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aka, asn, estimatedUsers, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20074ResultAsnRelated {\n");
    
    sb.append("    aka: ").append(toIndentedString(aka)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    estimatedUsers: ").append(toIndentedString(estimatedUsers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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