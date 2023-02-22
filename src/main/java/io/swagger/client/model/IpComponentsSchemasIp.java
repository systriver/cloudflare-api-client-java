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
import io.swagger.client.model.CommonComponentsSchemasIp;
import io.swagger.client.model.IpComponentsschemasipBelongsToRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * IpComponentsSchemasIp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class IpComponentsSchemasIp {
  @SerializedName("belongs_to_ref")
  private IpComponentsschemasipBelongsToRef belongsToRef = null;

  @SerializedName("ip")
  private CommonComponentsSchemasIp ip = null;

  @SerializedName("risk_types")
  private Object riskTypes = null;

  public IpComponentsSchemasIp belongsToRef(IpComponentsschemasipBelongsToRef belongsToRef) {
    this.belongsToRef = belongsToRef;
    return this;
  }

   /**
   * Get belongsToRef
   * @return belongsToRef
  **/
  @Schema(description = "")
  public IpComponentsschemasipBelongsToRef getBelongsToRef() {
    return belongsToRef;
  }

  public void setBelongsToRef(IpComponentsschemasipBelongsToRef belongsToRef) {
    this.belongsToRef = belongsToRef;
  }

  public IpComponentsSchemasIp ip(CommonComponentsSchemasIp ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public CommonComponentsSchemasIp getIp() {
    return ip;
  }

  public void setIp(CommonComponentsSchemasIp ip) {
    this.ip = ip;
  }

  public IpComponentsSchemasIp riskTypes(Object riskTypes) {
    this.riskTypes = riskTypes;
    return this;
  }

   /**
   * Get riskTypes
   * @return riskTypes
  **/
  @Schema(example = "[{\"id\":131,\"name\":\"Phishing\",\"super_category_id\":21}]", description = "")
  public Object getRiskTypes() {
    return riskTypes;
  }

  public void setRiskTypes(Object riskTypes) {
    this.riskTypes = riskTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpComponentsSchemasIp ipComponentsSchemasIp = (IpComponentsSchemasIp) o;
    return Objects.equals(this.belongsToRef, ipComponentsSchemasIp.belongsToRef) &&
        Objects.equals(this.ip, ipComponentsSchemasIp.ip) &&
        Objects.equals(this.riskTypes, ipComponentsSchemasIp.riskTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(belongsToRef, ip, riskTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpComponentsSchemasIp {\n");
    
    sb.append("    belongsToRef: ").append(toIndentedString(belongsToRef)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    riskTypes: ").append(toIndentedString(riskTypes)).append("\n");
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
