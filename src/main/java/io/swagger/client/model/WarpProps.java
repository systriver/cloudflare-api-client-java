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
import io.swagger.client.model.AllowedIdps;
import io.swagger.client.model.CloudflareClientAPIFeatureAppProps;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * WarpProps
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class WarpProps extends CloudflareClientAPIFeatureAppProps {
  @SerializedName("domain")
  private Object warpPropsDomain = null;

  @SerializedName("name")
  private Object warpPropsName = Warp Login App;

  @SerializedName("type")
  private String warpPropsType = null;

   /**
   * Get warpPropsDomain
   * @return warpPropsDomain
  **/
  @Schema(example = "authdomain.cloudflareaccess.com/warp", description = "")
  public Object getWarpPropsDomain() {
    return warpPropsDomain;
  }

   /**
   * Get warpPropsName
   * @return warpPropsName
  **/
  @Schema(example = "Warp Login App", description = "")
  public Object getWarpPropsName() {
    return warpPropsName;
  }

  public WarpProps warpPropsType(String warpPropsType) {
    this.warpPropsType = warpPropsType;
    return this;
  }

   /**
   * The application type.
   * @return warpPropsType
  **/
  @Schema(example = "warp", description = "The application type.")
  public String getWarpPropsType() {
    return warpPropsType;
  }

  public void setWarpPropsType(String warpPropsType) {
    this.warpPropsType = warpPropsType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarpProps warpProps = (WarpProps) o;
    return Objects.equals(this.warpPropsDomain, warpProps.warpPropsDomain) &&
        Objects.equals(this.warpPropsName, warpProps.warpPropsName) &&
        Objects.equals(this.warpPropsType, warpProps.warpPropsType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warpPropsDomain, warpPropsName, warpPropsType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WarpProps {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    warpPropsDomain: ").append(toIndentedString(warpPropsDomain)).append("\n");
    sb.append("    warpPropsName: ").append(toIndentedString(warpPropsName)).append("\n");
    sb.append("    warpPropsType: ").append(toIndentedString(warpPropsType)).append("\n");
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
