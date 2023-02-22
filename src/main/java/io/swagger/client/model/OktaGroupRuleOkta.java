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
 * OktaGroupRuleOkta
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class OktaGroupRuleOkta {
  @SerializedName("connection_id")
  private String connectionId = null;

  @SerializedName("email")
  private String email = null;

  public OktaGroupRuleOkta connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * The ID of your Okta identity provider.
   * @return connectionId
  **/
  @Schema(example = "ea85612a-29c8-46c2-bacb-669d65136971", required = true, description = "The ID of your Okta identity provider.")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public OktaGroupRuleOkta email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the Okta group.
   * @return email
  **/
  @Schema(example = "devs@cloudflare.com", required = true, description = "The email of the Okta group.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OktaGroupRuleOkta oktaGroupRuleOkta = (OktaGroupRuleOkta) o;
    return Objects.equals(this.connectionId, oktaGroupRuleOkta.connectionId) &&
        Objects.equals(this.email, oktaGroupRuleOkta.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OktaGroupRuleOkta {\n");
    
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
