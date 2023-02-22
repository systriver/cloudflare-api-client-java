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
 * Miscategorization
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Miscategorization {
  @SerializedName("content_adds")
  private Object contentAdds = null;

  @SerializedName("content_removes")
  private Object contentRemoves = null;

  @SerializedName("indicator_type")
  private String indicatorType = null;

  @SerializedName("ip")
  private Object ip = null;

  @SerializedName("security_adds")
  private Object securityAdds = null;

  @SerializedName("security_removes")
  private Object securityRemoves = null;

  @SerializedName("url")
  private String url = null;

  public Miscategorization contentAdds(Object contentAdds) {
    this.contentAdds = contentAdds;
    return this;
  }

   /**
   * Content category IDs to add.
   * @return contentAdds
  **/
  @Schema(example = "[82]", description = "Content category IDs to add.")
  public Object getContentAdds() {
    return contentAdds;
  }

  public void setContentAdds(Object contentAdds) {
    this.contentAdds = contentAdds;
  }

  public Miscategorization contentRemoves(Object contentRemoves) {
    this.contentRemoves = contentRemoves;
    return this;
  }

   /**
   * Content category IDs to remove.
   * @return contentRemoves
  **/
  @Schema(example = "[155]", description = "Content category IDs to remove.")
  public Object getContentRemoves() {
    return contentRemoves;
  }

  public void setContentRemoves(Object contentRemoves) {
    this.contentRemoves = contentRemoves;
  }

  public Miscategorization indicatorType(String indicatorType) {
    this.indicatorType = indicatorType;
    return this;
  }

   /**
   * Get indicatorType
   * @return indicatorType
  **/
  @Schema(example = "domain", description = "")
  public String getIndicatorType() {
    return indicatorType;
  }

  public void setIndicatorType(String indicatorType) {
    this.indicatorType = indicatorType;
  }

  public Miscategorization ip(Object ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Provide only if indicator_type is &#x60;ipv4&#x60; or &#x60;ipv6&#x60;.
   * @return ip
  **/
  @Schema(description = "Provide only if indicator_type is `ipv4` or `ipv6`.")
  public Object getIp() {
    return ip;
  }

  public void setIp(Object ip) {
    this.ip = ip;
  }

  public Miscategorization securityAdds(Object securityAdds) {
    this.securityAdds = securityAdds;
    return this;
  }

   /**
   * Security category IDs to add.
   * @return securityAdds
  **/
  @Schema(example = "[117,131]", description = "Security category IDs to add.")
  public Object getSecurityAdds() {
    return securityAdds;
  }

  public void setSecurityAdds(Object securityAdds) {
    this.securityAdds = securityAdds;
  }

  public Miscategorization securityRemoves(Object securityRemoves) {
    this.securityRemoves = securityRemoves;
    return this;
  }

   /**
   * Security category IDs to remove.
   * @return securityRemoves
  **/
  @Schema(example = "[83]", description = "Security category IDs to remove.")
  public Object getSecurityRemoves() {
    return securityRemoves;
  }

  public void setSecurityRemoves(Object securityRemoves) {
    this.securityRemoves = securityRemoves;
  }

  public Miscategorization url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Provide only if indicator_type is &#x60;domain&#x60; or &#x60;url&#x60;. Example if indicator_type is &#x60;domain&#x60;: &#x60;example.com&#x60;. Example if indicator_type is &#x60;url&#x60;: &#x60;https://example.com/news/&#x60;.
   * @return url
  **/
  @Schema(description = "Provide only if indicator_type is `domain` or `url`. Example if indicator_type is `domain`: `example.com`. Example if indicator_type is `url`: `https://example.com/news/`.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Miscategorization miscategorization = (Miscategorization) o;
    return Objects.equals(this.contentAdds, miscategorization.contentAdds) &&
        Objects.equals(this.contentRemoves, miscategorization.contentRemoves) &&
        Objects.equals(this.indicatorType, miscategorization.indicatorType) &&
        Objects.equals(this.ip, miscategorization.ip) &&
        Objects.equals(this.securityAdds, miscategorization.securityAdds) &&
        Objects.equals(this.securityRemoves, miscategorization.securityRemoves) &&
        Objects.equals(this.url, miscategorization.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentAdds, contentRemoves, indicatorType, ip, securityAdds, securityRemoves, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Miscategorization {\n");
    
    sb.append("    contentAdds: ").append(toIndentedString(contentAdds)).append("\n");
    sb.append("    contentRemoves: ").append(toIndentedString(contentRemoves)).append("\n");
    sb.append("    indicatorType: ").append(toIndentedString(indicatorType)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    securityAdds: ").append(toIndentedString(securityAdds)).append("\n");
    sb.append("    securityRemoves: ").append(toIndentedString(securityRemoves)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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