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
import io.swagger.client.model.ApiResponseCollection;
import io.swagger.client.model.ComponentsSchemasCertificateObject;
import io.swagger.client.model.MtlsmanagementComponentsschemascertificateResponseCollectionResultInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * MtlsManagementComponentsSchemasCertificateResponseCollection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class MtlsManagementComponentsSchemasCertificateResponseCollection extends ApiResponseCollection {
  @SerializedName("result")
  private List<ComponentsSchemasCertificateObject> mtlsManagementComponentsSchemasCertificateResponseCollectionResult = null;

  @SerializedName("result_info")
  private MtlsmanagementComponentsschemascertificateResponseCollectionResultInfo mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo = null;

  public MtlsManagementComponentsSchemasCertificateResponseCollection mtlsManagementComponentsSchemasCertificateResponseCollectionResult(List<ComponentsSchemasCertificateObject> mtlsManagementComponentsSchemasCertificateResponseCollectionResult) {
    this.mtlsManagementComponentsSchemasCertificateResponseCollectionResult = mtlsManagementComponentsSchemasCertificateResponseCollectionResult;
    return this;
  }

  public MtlsManagementComponentsSchemasCertificateResponseCollection addMtlsManagementComponentsSchemasCertificateResponseCollectionResultItem(ComponentsSchemasCertificateObject mtlsManagementComponentsSchemasCertificateResponseCollectionResultItem) {
    if (this.mtlsManagementComponentsSchemasCertificateResponseCollectionResult == null) {
      this.mtlsManagementComponentsSchemasCertificateResponseCollectionResult = new ArrayList<ComponentsSchemasCertificateObject>();
    }
    this.mtlsManagementComponentsSchemasCertificateResponseCollectionResult.add(mtlsManagementComponentsSchemasCertificateResponseCollectionResultItem);
    return this;
  }

   /**
   * Get mtlsManagementComponentsSchemasCertificateResponseCollectionResult
   * @return mtlsManagementComponentsSchemasCertificateResponseCollectionResult
  **/
  @Schema(description = "")
  public List<ComponentsSchemasCertificateObject> getMtlsManagementComponentsSchemasCertificateResponseCollectionResult() {
    return mtlsManagementComponentsSchemasCertificateResponseCollectionResult;
  }

  public void setMtlsManagementComponentsSchemasCertificateResponseCollectionResult(List<ComponentsSchemasCertificateObject> mtlsManagementComponentsSchemasCertificateResponseCollectionResult) {
    this.mtlsManagementComponentsSchemasCertificateResponseCollectionResult = mtlsManagementComponentsSchemasCertificateResponseCollectionResult;
  }

  public MtlsManagementComponentsSchemasCertificateResponseCollection mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo(MtlsmanagementComponentsschemascertificateResponseCollectionResultInfo mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo) {
    this.mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo = mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo;
    return this;
  }

   /**
   * Get mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo
   * @return mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo
  **/
  @Schema(description = "")
  public MtlsmanagementComponentsschemascertificateResponseCollectionResultInfo getMtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo() {
    return mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo;
  }

  public void setMtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo(MtlsmanagementComponentsschemascertificateResponseCollectionResultInfo mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo) {
    this.mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo = mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MtlsManagementComponentsSchemasCertificateResponseCollection mtlsManagementComponentsSchemasCertificateResponseCollection = (MtlsManagementComponentsSchemasCertificateResponseCollection) o;
    return Objects.equals(this.mtlsManagementComponentsSchemasCertificateResponseCollectionResult, mtlsManagementComponentsSchemasCertificateResponseCollection.mtlsManagementComponentsSchemasCertificateResponseCollectionResult) &&
        Objects.equals(this.mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo, mtlsManagementComponentsSchemasCertificateResponseCollection.mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mtlsManagementComponentsSchemasCertificateResponseCollectionResult, mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MtlsManagementComponentsSchemasCertificateResponseCollection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mtlsManagementComponentsSchemasCertificateResponseCollectionResult: ").append(toIndentedString(mtlsManagementComponentsSchemasCertificateResponseCollectionResult)).append("\n");
    sb.append("    mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo: ").append(toIndentedString(mtlsManagementComponentsSchemasCertificateResponseCollectionResultInfo)).append("\n");
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
