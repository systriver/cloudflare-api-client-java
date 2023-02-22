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
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets waitingroom_components-schemas-status
 */
@JsonAdapter(WaitingroomComponentsSchemasStatus.Adapter.class)
public enum WaitingroomComponentsSchemasStatus {
  EVENT_PREQUEUEING("event_prequeueing"),
  NOT_QUEUEING("not_queueing"),
  QUEUEING("queueing");

  private String value;

  WaitingroomComponentsSchemasStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WaitingroomComponentsSchemasStatus fromValue(String input) {
    for (WaitingroomComponentsSchemasStatus b : WaitingroomComponentsSchemasStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WaitingroomComponentsSchemasStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final WaitingroomComponentsSchemasStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public WaitingroomComponentsSchemasStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return WaitingroomComponentsSchemasStatus.fromValue((String)(value));
    }
  }
}
