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
import io.swagger.client.model.ApiResponseCollection;
import io.swagger.client.model.ComponentsSchemasPolicies;
import io.swagger.client.model.ResultInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PoliciesComponentsSchemasResponseCollection2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class PoliciesComponentsSchemasResponseCollection2 extends ApiResponseCollection {
  @SerializedName("result")
  private List<ComponentsSchemasPolicies> policiesComponentsSchemasResponseCollection2Result = null;

  public PoliciesComponentsSchemasResponseCollection2 policiesComponentsSchemasResponseCollection2Result(List<ComponentsSchemasPolicies> policiesComponentsSchemasResponseCollection2Result) {
    this.policiesComponentsSchemasResponseCollection2Result = policiesComponentsSchemasResponseCollection2Result;
    return this;
  }

  public PoliciesComponentsSchemasResponseCollection2 addPoliciesComponentsSchemasResponseCollection2ResultItem(ComponentsSchemasPolicies policiesComponentsSchemasResponseCollection2ResultItem) {
    if (this.policiesComponentsSchemasResponseCollection2Result == null) {
      this.policiesComponentsSchemasResponseCollection2Result = new ArrayList<ComponentsSchemasPolicies>();
    }
    this.policiesComponentsSchemasResponseCollection2Result.add(policiesComponentsSchemasResponseCollection2ResultItem);
    return this;
  }

   /**
   * Get policiesComponentsSchemasResponseCollection2Result
   * @return policiesComponentsSchemasResponseCollection2Result
  **/
  @Schema(description = "")
  public List<ComponentsSchemasPolicies> getPoliciesComponentsSchemasResponseCollection2Result() {
    return policiesComponentsSchemasResponseCollection2Result;
  }

  public void setPoliciesComponentsSchemasResponseCollection2Result(List<ComponentsSchemasPolicies> policiesComponentsSchemasResponseCollection2Result) {
    this.policiesComponentsSchemasResponseCollection2Result = policiesComponentsSchemasResponseCollection2Result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoliciesComponentsSchemasResponseCollection2 policiesComponentsSchemasResponseCollection2 = (PoliciesComponentsSchemasResponseCollection2) o;
    return Objects.equals(this.policiesComponentsSchemasResponseCollection2Result, policiesComponentsSchemasResponseCollection2.policiesComponentsSchemasResponseCollection2Result) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policiesComponentsSchemasResponseCollection2Result, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoliciesComponentsSchemasResponseCollection2 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    policiesComponentsSchemasResponseCollection2Result: ").append(toIndentedString(policiesComponentsSchemasResponseCollection2Result)).append("\n");
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
