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
import io.swagger.client.model.CustomProfile;
import io.swagger.client.model.ResultInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CreateCustomProfileResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CreateCustomProfileResponse extends ApiResponseCollection {
  @SerializedName("result")
  private List<CustomProfile> createCustomProfileResponseResult = null;

  public CreateCustomProfileResponse createCustomProfileResponseResult(List<CustomProfile> createCustomProfileResponseResult) {
    this.createCustomProfileResponseResult = createCustomProfileResponseResult;
    return this;
  }

  public CreateCustomProfileResponse addCreateCustomProfileResponseResultItem(CustomProfile createCustomProfileResponseResultItem) {
    if (this.createCustomProfileResponseResult == null) {
      this.createCustomProfileResponseResult = new ArrayList<CustomProfile>();
    }
    this.createCustomProfileResponseResult.add(createCustomProfileResponseResultItem);
    return this;
  }

   /**
   * Get createCustomProfileResponseResult
   * @return createCustomProfileResponseResult
  **/
  @Schema(description = "")
  public List<CustomProfile> getCreateCustomProfileResponseResult() {
    return createCustomProfileResponseResult;
  }

  public void setCreateCustomProfileResponseResult(List<CustomProfile> createCustomProfileResponseResult) {
    this.createCustomProfileResponseResult = createCustomProfileResponseResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomProfileResponse createCustomProfileResponse = (CreateCustomProfileResponse) o;
    return Objects.equals(this.createCustomProfileResponseResult, createCustomProfileResponse.createCustomProfileResponseResult) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createCustomProfileResponseResult, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomProfileResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    createCustomProfileResponseResult: ").append(toIndentedString(createCustomProfileResponseResult)).append("\n");
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
