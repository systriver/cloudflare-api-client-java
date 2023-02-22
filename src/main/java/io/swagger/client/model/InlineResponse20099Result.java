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
import io.swagger.client.model.InlineResponse20099ResultSpecialEvents;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20099Result
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20099Result {
  @SerializedName("specialEvents")
  private List<InlineResponse20099ResultSpecialEvents> specialEvents = new ArrayList<InlineResponse20099ResultSpecialEvents>();

  public InlineResponse20099Result specialEvents(List<InlineResponse20099ResultSpecialEvents> specialEvents) {
    this.specialEvents = specialEvents;
    return this;
  }

  public InlineResponse20099Result addSpecialEventsItem(InlineResponse20099ResultSpecialEvents specialEventsItem) {
    this.specialEvents.add(specialEventsItem);
    return this;
  }

   /**
   * Get specialEvents
   * @return specialEvents
  **/
  @Schema(required = true, description = "")
  public List<InlineResponse20099ResultSpecialEvents> getSpecialEvents() {
    return specialEvents;
  }

  public void setSpecialEvents(List<InlineResponse20099ResultSpecialEvents> specialEvents) {
    this.specialEvents = specialEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20099Result inlineResponse20099Result = (InlineResponse20099Result) o;
    return Objects.equals(this.specialEvents, inlineResponse20099Result.specialEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialEvents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20099Result {\n");
    
    sb.append("    specialEvents: ").append(toIndentedString(specialEvents)).append("\n");
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