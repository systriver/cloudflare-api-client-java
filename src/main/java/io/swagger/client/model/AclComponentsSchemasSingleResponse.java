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
import io.swagger.client.model.CloudflareClientAPIAcl;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AclComponentsSchemasSingleResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class AclComponentsSchemasSingleResponse extends ApiResponseSingle {
  @SerializedName("result")
  private CloudflareClientAPIAcl aclComponentsSchemasSingleResponseResult = null;

  public AclComponentsSchemasSingleResponse aclComponentsSchemasSingleResponseResult(CloudflareClientAPIAcl aclComponentsSchemasSingleResponseResult) {
    this.aclComponentsSchemasSingleResponseResult = aclComponentsSchemasSingleResponseResult;
    return this;
  }

   /**
   * Get aclComponentsSchemasSingleResponseResult
   * @return aclComponentsSchemasSingleResponseResult
  **/
  @Schema(description = "")
  public CloudflareClientAPIAcl getAclComponentsSchemasSingleResponseResult() {
    return aclComponentsSchemasSingleResponseResult;
  }

  public void setAclComponentsSchemasSingleResponseResult(CloudflareClientAPIAcl aclComponentsSchemasSingleResponseResult) {
    this.aclComponentsSchemasSingleResponseResult = aclComponentsSchemasSingleResponseResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AclComponentsSchemasSingleResponse aclComponentsSchemasSingleResponse = (AclComponentsSchemasSingleResponse) o;
    return Objects.equals(this.aclComponentsSchemasSingleResponseResult, aclComponentsSchemasSingleResponse.aclComponentsSchemasSingleResponseResult) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aclComponentsSchemasSingleResponseResult, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AclComponentsSchemasSingleResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    aclComponentsSchemasSingleResponseResult: ").append(toIndentedString(aclComponentsSchemasSingleResponseResult)).append("\n");
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
