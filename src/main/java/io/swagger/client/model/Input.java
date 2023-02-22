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
 * Input
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Input {
  @SerializedName("height")
  private Integer height = null;

  @SerializedName("width")
  private Integer width = null;

   /**
   * The video height in pixels. A value of &#x60;-1&#x60; means the height is unknown. The value becomes available after the upload and before the video is ready.
   * @return height
  **/
  @Schema(description = "The video height in pixels. A value of `-1` means the height is unknown. The value becomes available after the upload and before the video is ready.")
  public Integer getHeight() {
    return height;
  }

   /**
   * The video width in pixels. A value of &#x60;-1&#x60; means the width is unknown. The value becomes available after the upload and before the video is ready.
   * @return width
  **/
  @Schema(description = "The video width in pixels. A value of `-1` means the width is unknown. The value becomes available after the upload and before the video is ready.")
  public Integer getWidth() {
    return width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input input = (Input) o;
    return Objects.equals(this.height, input.height) &&
        Objects.equals(this.width, input.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
