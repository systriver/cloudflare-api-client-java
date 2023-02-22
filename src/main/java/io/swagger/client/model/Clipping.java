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
import io.swagger.client.model.AllowedOrigins;
import io.swagger.client.model.MediaMetadata;
import io.swagger.client.model.MediaState;
import io.swagger.client.model.Playback;
import io.swagger.client.model.WatermarkAtUpload;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
/**
 * Clipping
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Clipping {
  @SerializedName("allowedOrigins")
  private AllowedOrigins allowedOrigins = null;

  @SerializedName("clippedFromVideoUID")
  private String clippedFromVideoUID = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("creator")
  private String creator = null;

  @SerializedName("endTimeSeconds")
  private Integer endTimeSeconds = null;

  @SerializedName("maxDurationSeconds")
  private Integer maxDurationSeconds = null;

  @SerializedName("meta")
  private MediaMetadata meta = null;

  @SerializedName("modified")
  private OffsetDateTime modified = null;

  @SerializedName("playback")
  private Playback playback = null;

  @SerializedName("preview")
  private String preview = null;

  @SerializedName("requireSignedURLs")
  private Boolean requireSignedURLs = null;

  @SerializedName("startTimeSeconds")
  private Integer startTimeSeconds = null;

  @SerializedName("status")
  private MediaState status = null;

  @SerializedName("thumbnailTimestampPct")
  private BigDecimal thumbnailTimestampPct = null;

  @SerializedName("watermark")
  private WatermarkAtUpload watermark = null;

  public Clipping allowedOrigins(AllowedOrigins allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
    return this;
  }

   /**
   * Get allowedOrigins
   * @return allowedOrigins
  **/
  @Schema(description = "")
  public AllowedOrigins getAllowedOrigins() {
    return allowedOrigins;
  }

  public void setAllowedOrigins(AllowedOrigins allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }

  public Clipping clippedFromVideoUID(String clippedFromVideoUID) {
    this.clippedFromVideoUID = clippedFromVideoUID;
    return this;
  }

   /**
   * Get clippedFromVideoUID
   * @return clippedFromVideoUID
  **/
  @Schema(description = "")
  public String getClippedFromVideoUID() {
    return clippedFromVideoUID;
  }

  public void setClippedFromVideoUID(String clippedFromVideoUID) {
    this.clippedFromVideoUID = clippedFromVideoUID;
  }

  public Clipping created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Clipping creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @Schema(description = "")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public Clipping endTimeSeconds(Integer endTimeSeconds) {
    this.endTimeSeconds = endTimeSeconds;
    return this;
  }

   /**
   * Get endTimeSeconds
   * @return endTimeSeconds
  **/
  @Schema(description = "")
  public Integer getEndTimeSeconds() {
    return endTimeSeconds;
  }

  public void setEndTimeSeconds(Integer endTimeSeconds) {
    this.endTimeSeconds = endTimeSeconds;
  }

  public Clipping maxDurationSeconds(Integer maxDurationSeconds) {
    this.maxDurationSeconds = maxDurationSeconds;
    return this;
  }

   /**
   * Get maxDurationSeconds
   * @return maxDurationSeconds
  **/
  @Schema(description = "")
  public Integer getMaxDurationSeconds() {
    return maxDurationSeconds;
  }

  public void setMaxDurationSeconds(Integer maxDurationSeconds) {
    this.maxDurationSeconds = maxDurationSeconds;
  }

  public Clipping meta(MediaMetadata meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @Schema(description = "")
  public MediaMetadata getMeta() {
    return meta;
  }

  public void setMeta(MediaMetadata meta) {
    this.meta = meta;
  }

  public Clipping modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @Schema(description = "")
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public Clipping playback(Playback playback) {
    this.playback = playback;
    return this;
  }

   /**
   * Get playback
   * @return playback
  **/
  @Schema(description = "")
  public Playback getPlayback() {
    return playback;
  }

  public void setPlayback(Playback playback) {
    this.playback = playback;
  }

  public Clipping preview(String preview) {
    this.preview = preview;
    return this;
  }

   /**
   * Get preview
   * @return preview
  **/
  @Schema(description = "")
  public String getPreview() {
    return preview;
  }

  public void setPreview(String preview) {
    this.preview = preview;
  }

  public Clipping requireSignedURLs(Boolean requireSignedURLs) {
    this.requireSignedURLs = requireSignedURLs;
    return this;
  }

   /**
   * Get requireSignedURLs
   * @return requireSignedURLs
  **/
  @Schema(description = "")
  public Boolean getRequireSignedURLs() {
    return requireSignedURLs;
  }

  public void setRequireSignedURLs(Boolean requireSignedURLs) {
    this.requireSignedURLs = requireSignedURLs;
  }

  public Clipping startTimeSeconds(Integer startTimeSeconds) {
    this.startTimeSeconds = startTimeSeconds;
    return this;
  }

   /**
   * Get startTimeSeconds
   * @return startTimeSeconds
  **/
  @Schema(description = "")
  public Integer getStartTimeSeconds() {
    return startTimeSeconds;
  }

  public void setStartTimeSeconds(Integer startTimeSeconds) {
    this.startTimeSeconds = startTimeSeconds;
  }

  public Clipping status(MediaState status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public MediaState getStatus() {
    return status;
  }

  public void setStatus(MediaState status) {
    this.status = status;
  }

  public Clipping thumbnailTimestampPct(BigDecimal thumbnailTimestampPct) {
    this.thumbnailTimestampPct = thumbnailTimestampPct;
    return this;
  }

   /**
   * Get thumbnailTimestampPct
   * @return thumbnailTimestampPct
  **/
  @Schema(description = "")
  public BigDecimal getThumbnailTimestampPct() {
    return thumbnailTimestampPct;
  }

  public void setThumbnailTimestampPct(BigDecimal thumbnailTimestampPct) {
    this.thumbnailTimestampPct = thumbnailTimestampPct;
  }

  public Clipping watermark(WatermarkAtUpload watermark) {
    this.watermark = watermark;
    return this;
  }

   /**
   * Get watermark
   * @return watermark
  **/
  @Schema(description = "")
  public WatermarkAtUpload getWatermark() {
    return watermark;
  }

  public void setWatermark(WatermarkAtUpload watermark) {
    this.watermark = watermark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clipping clipping = (Clipping) o;
    return Objects.equals(this.allowedOrigins, clipping.allowedOrigins) &&
        Objects.equals(this.clippedFromVideoUID, clipping.clippedFromVideoUID) &&
        Objects.equals(this.created, clipping.created) &&
        Objects.equals(this.creator, clipping.creator) &&
        Objects.equals(this.endTimeSeconds, clipping.endTimeSeconds) &&
        Objects.equals(this.maxDurationSeconds, clipping.maxDurationSeconds) &&
        Objects.equals(this.meta, clipping.meta) &&
        Objects.equals(this.modified, clipping.modified) &&
        Objects.equals(this.playback, clipping.playback) &&
        Objects.equals(this.preview, clipping.preview) &&
        Objects.equals(this.requireSignedURLs, clipping.requireSignedURLs) &&
        Objects.equals(this.startTimeSeconds, clipping.startTimeSeconds) &&
        Objects.equals(this.status, clipping.status) &&
        Objects.equals(this.thumbnailTimestampPct, clipping.thumbnailTimestampPct) &&
        Objects.equals(this.watermark, clipping.watermark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedOrigins, clippedFromVideoUID, created, creator, endTimeSeconds, maxDurationSeconds, meta, modified, playback, preview, requireSignedURLs, startTimeSeconds, status, thumbnailTimestampPct, watermark);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clipping {\n");
    
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    clippedFromVideoUID: ").append(toIndentedString(clippedFromVideoUID)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    endTimeSeconds: ").append(toIndentedString(endTimeSeconds)).append("\n");
    sb.append("    maxDurationSeconds: ").append(toIndentedString(maxDurationSeconds)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    playback: ").append(toIndentedString(playback)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    requireSignedURLs: ").append(toIndentedString(requireSignedURLs)).append("\n");
    sb.append("    startTimeSeconds: ").append(toIndentedString(startTimeSeconds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thumbnailTimestampPct: ").append(toIndentedString(thumbnailTimestampPct)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
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
