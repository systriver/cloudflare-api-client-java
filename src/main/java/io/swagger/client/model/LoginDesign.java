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
 * LoginDesign
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class LoginDesign {
  @SerializedName("background_color")
  private String backgroundColor = null;

  @SerializedName("footer_text")
  private String footerText = null;

  @SerializedName("header_text")
  private String headerText = null;

  @SerializedName("logo_path")
  private String logoPath = null;

  @SerializedName("text_color")
  private String textColor = null;

  public LoginDesign backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * The background color on your login page.
   * @return backgroundColor
  **/
  @Schema(example = "#c5ed1b", description = "The background color on your login page.")
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public LoginDesign footerText(String footerText) {
    this.footerText = footerText;
    return this;
  }

   /**
   * The text at the bottom of your login page.
   * @return footerText
  **/
  @Schema(example = "This is an example description.", description = "The text at the bottom of your login page.")
  public String getFooterText() {
    return footerText;
  }

  public void setFooterText(String footerText) {
    this.footerText = footerText;
  }

  public LoginDesign headerText(String headerText) {
    this.headerText = headerText;
    return this;
  }

   /**
   * The text at the top of your login page.
   * @return headerText
  **/
  @Schema(example = "This is an example description.", description = "The text at the top of your login page.")
  public String getHeaderText() {
    return headerText;
  }

  public void setHeaderText(String headerText) {
    this.headerText = headerText;
  }

  public LoginDesign logoPath(String logoPath) {
    this.logoPath = logoPath;
    return this;
  }

   /**
   * The URL of the logo on your login page.
   * @return logoPath
  **/
  @Schema(example = "https://example.com/logo.png", description = "The URL of the logo on your login page.")
  public String getLogoPath() {
    return logoPath;
  }

  public void setLogoPath(String logoPath) {
    this.logoPath = logoPath;
  }

  public LoginDesign textColor(String textColor) {
    this.textColor = textColor;
    return this;
  }

   /**
   * The text color on your login page.
   * @return textColor
  **/
  @Schema(example = "#c5ed1b", description = "The text color on your login page.")
  public String getTextColor() {
    return textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginDesign loginDesign = (LoginDesign) o;
    return Objects.equals(this.backgroundColor, loginDesign.backgroundColor) &&
        Objects.equals(this.footerText, loginDesign.footerText) &&
        Objects.equals(this.headerText, loginDesign.headerText) &&
        Objects.equals(this.logoPath, loginDesign.logoPath) &&
        Objects.equals(this.textColor, loginDesign.textColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, footerText, headerText, logoPath, textColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginDesign {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    footerText: ").append(toIndentedString(footerText)).append("\n");
    sb.append("    headerText: ").append(toIndentedString(headerText)).append("\n");
    sb.append("    logoPath: ").append(toIndentedString(logoPath)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
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
