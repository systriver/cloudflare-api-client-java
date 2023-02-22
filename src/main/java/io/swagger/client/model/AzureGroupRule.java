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
import io.swagger.client.model.AzureGroupRuleAzureAD;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Matches an Azure group. Requires an Azure identity provider.
 */
@Schema(description = "Matches an Azure group. Requires an Azure identity provider.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class AzureGroupRule implements Rule, RuleComponentsSchemasRule {
  @SerializedName("azureAD")
  private AzureGroupRuleAzureAD azureAD = null;

  public AzureGroupRule azureAD(AzureGroupRuleAzureAD azureAD) {
    this.azureAD = azureAD;
    return this;
  }

   /**
   * Get azureAD
   * @return azureAD
  **/
  @Schema(required = true, description = "")
  public AzureGroupRuleAzureAD getAzureAD() {
    return azureAD;
  }

  public void setAzureAD(AzureGroupRuleAzureAD azureAD) {
    this.azureAD = azureAD;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureGroupRule azureGroupRule = (AzureGroupRule) o;
    return Objects.equals(this.azureAD, azureGroupRule.azureAD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azureAD);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureGroupRule {\n");
    
    sb.append("    azureAD: ").append(toIndentedString(azureAD)).append("\n");
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
