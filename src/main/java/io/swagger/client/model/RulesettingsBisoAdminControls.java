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
 * Configure how browser isolation behaves.
 */
@Schema(description = "Configure how browser isolation behaves.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class RulesettingsBisoAdminControls {
  @SerializedName("dcp")
  private Boolean dcp = null;

  @SerializedName("dd")
  private Boolean dd = null;

  @SerializedName("dk")
  private Boolean dk = null;

  @SerializedName("dp")
  private Boolean dp = null;

  @SerializedName("du")
  private Boolean du = null;

  public RulesettingsBisoAdminControls dcp(Boolean dcp) {
    this.dcp = dcp;
    return this;
  }

   /**
   * Disable copy-paste.
   * @return dcp
  **/
  @Schema(example = "false", description = "Disable copy-paste.")
  public Boolean isDcp() {
    return dcp;
  }

  public void setDcp(Boolean dcp) {
    this.dcp = dcp;
  }

  public RulesettingsBisoAdminControls dd(Boolean dd) {
    this.dd = dd;
    return this;
  }

   /**
   * Disable download.
   * @return dd
  **/
  @Schema(example = "false", description = "Disable download.")
  public Boolean isDd() {
    return dd;
  }

  public void setDd(Boolean dd) {
    this.dd = dd;
  }

  public RulesettingsBisoAdminControls dk(Boolean dk) {
    this.dk = dk;
    return this;
  }

   /**
   * Disable keyboard usage.
   * @return dk
  **/
  @Schema(example = "false", description = "Disable keyboard usage.")
  public Boolean isDk() {
    return dk;
  }

  public void setDk(Boolean dk) {
    this.dk = dk;
  }

  public RulesettingsBisoAdminControls dp(Boolean dp) {
    this.dp = dp;
    return this;
  }

   /**
   * Disable printing.
   * @return dp
  **/
  @Schema(example = "false", description = "Disable printing.")
  public Boolean isDp() {
    return dp;
  }

  public void setDp(Boolean dp) {
    this.dp = dp;
  }

  public RulesettingsBisoAdminControls du(Boolean du) {
    this.du = du;
    return this;
  }

   /**
   * Disable upload.
   * @return du
  **/
  @Schema(example = "false", description = "Disable upload.")
  public Boolean isDu() {
    return du;
  }

  public void setDu(Boolean du) {
    this.du = du;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulesettingsBisoAdminControls rulesettingsBisoAdminControls = (RulesettingsBisoAdminControls) o;
    return Objects.equals(this.dcp, rulesettingsBisoAdminControls.dcp) &&
        Objects.equals(this.dd, rulesettingsBisoAdminControls.dd) &&
        Objects.equals(this.dk, rulesettingsBisoAdminControls.dk) &&
        Objects.equals(this.dp, rulesettingsBisoAdminControls.dp) &&
        Objects.equals(this.du, rulesettingsBisoAdminControls.du);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dcp, dd, dk, dp, du);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesettingsBisoAdminControls {\n");
    
    sb.append("    dcp: ").append(toIndentedString(dcp)).append("\n");
    sb.append("    dd: ").append(toIndentedString(dd)).append("\n");
    sb.append("    dk: ").append(toIndentedString(dk)).append("\n");
    sb.append("    dp: ").append(toIndentedString(dp)).append("\n");
    sb.append("    du: ").append(toIndentedString(du)).append("\n");
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
