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
 * AzureGroupRuleAzureAD
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class AzureGroupRuleAzureAD {
  @SerializedName("connection_id")
  private String connectionId = null;

  @SerializedName("id")
  private String id = null;

  public AzureGroupRuleAzureAD connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * The ID of your Azure identity provider.
   * @return connectionId
  **/
  @Schema(example = "ea85612a-29c8-46c2-bacb-669d65136971", required = true, description = "The ID of your Azure identity provider.")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public AzureGroupRuleAzureAD id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of an Azure group.
   * @return id
  **/
  @Schema(example = "aa0a4aab-672b-4bdb-bc33-a59f1130a11f", required = true, description = "The ID of an Azure group.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureGroupRuleAzureAD azureGroupRuleAzureAD = (AzureGroupRuleAzureAD) o;
    return Objects.equals(this.connectionId, azureGroupRuleAzureAD.connectionId) &&
        Objects.equals(this.id, azureGroupRuleAzureAD.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureGroupRuleAzureAD {\n");
    
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
