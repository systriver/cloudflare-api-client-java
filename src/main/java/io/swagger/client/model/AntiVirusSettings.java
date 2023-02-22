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
 * Anti virus settings.
 */
@Schema(description = "Anti virus settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class AntiVirusSettings {
  @SerializedName("enabled_download_phase")
  private Boolean enabledDownloadPhase = null;

  @SerializedName("enabled_upload_phase")
  private Boolean enabledUploadPhase = null;

  @SerializedName("fail_closed")
  private Boolean failClosed = null;

  public AntiVirusSettings enabledDownloadPhase(Boolean enabledDownloadPhase) {
    this.enabledDownloadPhase = enabledDownloadPhase;
    return this;
  }

   /**
   * Get enabledDownloadPhase
   * @return enabledDownloadPhase
  **/
  @Schema(description = "")
  public Boolean getEnabledDownloadPhase() {
    return enabledDownloadPhase;
  }

  public void setEnabledDownloadPhase(Boolean enabledDownloadPhase) {
    this.enabledDownloadPhase = enabledDownloadPhase;
  }

  public AntiVirusSettings enabledUploadPhase(Boolean enabledUploadPhase) {
    this.enabledUploadPhase = enabledUploadPhase;
    return this;
  }

   /**
   * Get enabledUploadPhase
   * @return enabledUploadPhase
  **/
  @Schema(description = "")
  public Boolean getEnabledUploadPhase() {
    return enabledUploadPhase;
  }

  public void setEnabledUploadPhase(Boolean enabledUploadPhase) {
    this.enabledUploadPhase = enabledUploadPhase;
  }

  public AntiVirusSettings failClosed(Boolean failClosed) {
    this.failClosed = failClosed;
    return this;
  }

   /**
   * Get failClosed
   * @return failClosed
  **/
  @Schema(description = "")
  public Boolean getFailClosed() {
    return failClosed;
  }

  public void setFailClosed(Boolean failClosed) {
    this.failClosed = failClosed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntiVirusSettings antiVirusSettings = (AntiVirusSettings) o;
    return Objects.equals(this.enabledDownloadPhase, antiVirusSettings.enabledDownloadPhase) &&
        Objects.equals(this.enabledUploadPhase, antiVirusSettings.enabledUploadPhase) &&
        Objects.equals(this.failClosed, antiVirusSettings.failClosed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledDownloadPhase, enabledUploadPhase, failClosed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntiVirusSettings {\n");
    
    sb.append("    enabledDownloadPhase: ").append(toIndentedString(enabledDownloadPhase)).append("\n");
    sb.append("    enabledUploadPhase: ").append(toIndentedString(enabledUploadPhase)).append("\n");
    sb.append("    failClosed: ").append(toIndentedString(failClosed)).append("\n");
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
