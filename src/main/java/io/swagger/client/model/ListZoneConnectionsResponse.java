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
import io.swagger.client.model.CloudflareClientAPIConnection;
import io.swagger.client.model.ResultInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListZoneConnectionsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ListZoneConnectionsResponse extends ApiResponseCollection {
  @SerializedName("result")
  private List<CloudflareClientAPIConnection> listZoneConnectionsResponseResult = null;

  @SerializedName("result_info")
  private ResultInfo listZoneConnectionsResponseResultInfo = null;

  public ListZoneConnectionsResponse listZoneConnectionsResponseResult(List<CloudflareClientAPIConnection> listZoneConnectionsResponseResult) {
    this.listZoneConnectionsResponseResult = listZoneConnectionsResponseResult;
    return this;
  }

  public ListZoneConnectionsResponse addListZoneConnectionsResponseResultItem(CloudflareClientAPIConnection listZoneConnectionsResponseResultItem) {
    if (this.listZoneConnectionsResponseResult == null) {
      this.listZoneConnectionsResponseResult = new ArrayList<CloudflareClientAPIConnection>();
    }
    this.listZoneConnectionsResponseResult.add(listZoneConnectionsResponseResultItem);
    return this;
  }

   /**
   * Get listZoneConnectionsResponseResult
   * @return listZoneConnectionsResponseResult
  **/
  @Schema(description = "")
  public List<CloudflareClientAPIConnection> getListZoneConnectionsResponseResult() {
    return listZoneConnectionsResponseResult;
  }

  public void setListZoneConnectionsResponseResult(List<CloudflareClientAPIConnection> listZoneConnectionsResponseResult) {
    this.listZoneConnectionsResponseResult = listZoneConnectionsResponseResult;
  }

  public ListZoneConnectionsResponse listZoneConnectionsResponseResultInfo(ResultInfo listZoneConnectionsResponseResultInfo) {
    this.listZoneConnectionsResponseResultInfo = listZoneConnectionsResponseResultInfo;
    return this;
  }

   /**
   * Get listZoneConnectionsResponseResultInfo
   * @return listZoneConnectionsResponseResultInfo
  **/
  @Schema(description = "")
  public ResultInfo getListZoneConnectionsResponseResultInfo() {
    return listZoneConnectionsResponseResultInfo;
  }

  public void setListZoneConnectionsResponseResultInfo(ResultInfo listZoneConnectionsResponseResultInfo) {
    this.listZoneConnectionsResponseResultInfo = listZoneConnectionsResponseResultInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListZoneConnectionsResponse listZoneConnectionsResponse = (ListZoneConnectionsResponse) o;
    return Objects.equals(this.listZoneConnectionsResponseResult, listZoneConnectionsResponse.listZoneConnectionsResponseResult) &&
        Objects.equals(this.listZoneConnectionsResponseResultInfo, listZoneConnectionsResponse.listZoneConnectionsResponseResultInfo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listZoneConnectionsResponseResult, listZoneConnectionsResponseResultInfo, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListZoneConnectionsResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    listZoneConnectionsResponseResult: ").append(toIndentedString(listZoneConnectionsResponseResult)).append("\n");
    sb.append("    listZoneConnectionsResponseResultInfo: ").append(toIndentedString(listZoneConnectionsResponseResultInfo)).append("\n");
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
