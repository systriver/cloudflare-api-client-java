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
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20074ResultSerie0
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T13:40:27.702461541+09:00[Asia/Tokyo]")
public class InlineResponse20074ResultSerie0 {
  @SerializedName("desktop")
  private List<String> desktop = new ArrayList<String>();

  @SerializedName("mobile")
  private List<String> mobile = new ArrayList<String>();

  @SerializedName("other")
  private List<String> other = new ArrayList<String>();

  @SerializedName("timestamps")
  private List<String> timestamps = new ArrayList<String>();

  public InlineResponse20074ResultSerie0 desktop(List<String> desktop) {
    this.desktop = desktop;
    return this;
  }

  public InlineResponse20074ResultSerie0 addDesktopItem(String desktopItem) {
    this.desktop.add(desktopItem);
    return this;
  }

   /**
   * Get desktop
   * @return desktop
  **/
  @Schema(required = true, description = "")
  public List<String> getDesktop() {
    return desktop;
  }

  public void setDesktop(List<String> desktop) {
    this.desktop = desktop;
  }

  public InlineResponse20074ResultSerie0 mobile(List<String> mobile) {
    this.mobile = mobile;
    return this;
  }

  public InlineResponse20074ResultSerie0 addMobileItem(String mobileItem) {
    this.mobile.add(mobileItem);
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @Schema(required = true, description = "")
  public List<String> getMobile() {
    return mobile;
  }

  public void setMobile(List<String> mobile) {
    this.mobile = mobile;
  }

  public InlineResponse20074ResultSerie0 other(List<String> other) {
    this.other = other;
    return this;
  }

  public InlineResponse20074ResultSerie0 addOtherItem(String otherItem) {
    this.other.add(otherItem);
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @Schema(required = true, description = "")
  public List<String> getOther() {
    return other;
  }

  public void setOther(List<String> other) {
    this.other = other;
  }

  public InlineResponse20074ResultSerie0 timestamps(List<String> timestamps) {
    this.timestamps = timestamps;
    return this;
  }

  public InlineResponse20074ResultSerie0 addTimestampsItem(String timestampsItem) {
    this.timestamps.add(timestampsItem);
    return this;
  }

   /**
   * Get timestamps
   * @return timestamps
  **/
  @Schema(required = true, description = "")
  public List<String> getTimestamps() {
    return timestamps;
  }

  public void setTimestamps(List<String> timestamps) {
    this.timestamps = timestamps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20074ResultSerie0 inlineResponse20074ResultSerie0 = (InlineResponse20074ResultSerie0) o;
    return Objects.equals(this.desktop, inlineResponse20074ResultSerie0.desktop) &&
        Objects.equals(this.mobile, inlineResponse20074ResultSerie0.mobile) &&
        Objects.equals(this.other, inlineResponse20074ResultSerie0.other) &&
        Objects.equals(this.timestamps, inlineResponse20074ResultSerie0.timestamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desktop, mobile, other, timestamps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20074ResultSerie0 {\n");
    
    sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
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
