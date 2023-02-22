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
import io.swagger.client.model.InlineResponse20046ResultMetaConfidenceInfoAnnotations;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20046ResultMetaConfidenceInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20046ResultMetaConfidenceInfo {
  @SerializedName("annotations")
  private List<InlineResponse20046ResultMetaConfidenceInfoAnnotations> annotations = new ArrayList<InlineResponse20046ResultMetaConfidenceInfoAnnotations>();

  @SerializedName("level")
  private Integer level = null;

  public InlineResponse20046ResultMetaConfidenceInfo annotations(List<InlineResponse20046ResultMetaConfidenceInfoAnnotations> annotations) {
    this.annotations = annotations;
    return this;
  }

  public InlineResponse20046ResultMetaConfidenceInfo addAnnotationsItem(InlineResponse20046ResultMetaConfidenceInfoAnnotations annotationsItem) {
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @Schema(required = true, description = "")
  public List<InlineResponse20046ResultMetaConfidenceInfoAnnotations> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<InlineResponse20046ResultMetaConfidenceInfoAnnotations> annotations) {
    this.annotations = annotations;
  }

  public InlineResponse20046ResultMetaConfidenceInfo level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(required = true, description = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20046ResultMetaConfidenceInfo inlineResponse20046ResultMetaConfidenceInfo = (InlineResponse20046ResultMetaConfidenceInfo) o;
    return Objects.equals(this.annotations, inlineResponse20046ResultMetaConfidenceInfo.annotations) &&
        Objects.equals(this.level, inlineResponse20046ResultMetaConfidenceInfo.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, level);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20046ResultMetaConfidenceInfo {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
