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
 * The Workspace One Config Response.
 */
@Schema(description = "The Workspace One Config Response.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class WorkspaceOneConfigResponse implements ConfigResponse {
  @SerializedName("api_url")
  private String apiUrl = null;

  @SerializedName("auth_url")
  private String authUrl = null;

  @SerializedName("client_id")
  private String clientId = null;

  public WorkspaceOneConfigResponse apiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
    return this;
  }

   /**
   * The Workspace One API URL provided in the Workspace One Admin Dashboard.
   * @return apiUrl
  **/
  @Schema(example = "https://as123.awmdm.com/API", required = true, description = "The Workspace One API URL provided in the Workspace One Admin Dashboard.")
  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }

  public WorkspaceOneConfigResponse authUrl(String authUrl) {
    this.authUrl = authUrl;
    return this;
  }

   /**
   * The Workspace One Authorization URL depending on your region.
   * @return authUrl
  **/
  @Schema(example = "https://na.uemauth.vmwservices.com/connect/token", required = true, description = "The Workspace One Authorization URL depending on your region.")
  public String getAuthUrl() {
    return authUrl;
  }

  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }

  public WorkspaceOneConfigResponse clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The Workspace One client ID provided in the Workspace One Admin Dashboard.
   * @return clientId
  **/
  @Schema(example = "example client id", required = true, description = "The Workspace One client ID provided in the Workspace One Admin Dashboard.")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceOneConfigResponse workspaceOneConfigResponse = (WorkspaceOneConfigResponse) o;
    return Objects.equals(this.apiUrl, workspaceOneConfigResponse.apiUrl) &&
        Objects.equals(this.authUrl, workspaceOneConfigResponse.authUrl) &&
        Objects.equals(this.clientId, workspaceOneConfigResponse.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiUrl, authUrl, clientId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceOneConfigResponse {\n");
    
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
