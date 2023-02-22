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
import io.swagger.client.model.ApiResponseSingle;
import io.swagger.client.model.ComponentsSchemasPolicies;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PoliciesComponentsSchemasSingleResponse2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class PoliciesComponentsSchemasSingleResponse2 extends ApiResponseSingle {
  @SerializedName("result")
  private ComponentsSchemasPolicies policiesComponentsSchemasSingleResponse2Result = null;

  public PoliciesComponentsSchemasSingleResponse2 policiesComponentsSchemasSingleResponse2Result(ComponentsSchemasPolicies policiesComponentsSchemasSingleResponse2Result) {
    this.policiesComponentsSchemasSingleResponse2Result = policiesComponentsSchemasSingleResponse2Result;
    return this;
  }

   /**
   * Get policiesComponentsSchemasSingleResponse2Result
   * @return policiesComponentsSchemasSingleResponse2Result
  **/
  @Schema(description = "")
  public ComponentsSchemasPolicies getPoliciesComponentsSchemasSingleResponse2Result() {
    return policiesComponentsSchemasSingleResponse2Result;
  }

  public void setPoliciesComponentsSchemasSingleResponse2Result(ComponentsSchemasPolicies policiesComponentsSchemasSingleResponse2Result) {
    this.policiesComponentsSchemasSingleResponse2Result = policiesComponentsSchemasSingleResponse2Result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoliciesComponentsSchemasSingleResponse2 policiesComponentsSchemasSingleResponse2 = (PoliciesComponentsSchemasSingleResponse2) o;
    return Objects.equals(this.policiesComponentsSchemasSingleResponse2Result, policiesComponentsSchemasSingleResponse2.policiesComponentsSchemasSingleResponse2Result) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policiesComponentsSchemasSingleResponse2Result, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoliciesComponentsSchemasSingleResponse2 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    policiesComponentsSchemasSingleResponse2Result: ").append(toIndentedString(policiesComponentsSchemasSingleResponse2Result)).append("\n");
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