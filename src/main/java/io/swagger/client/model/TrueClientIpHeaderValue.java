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
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Value of the zone setting.
 */
@JsonAdapter(TrueClientIpHeaderValue.Adapter.class)
public enum TrueClientIpHeaderValue {
  ON("on"),
  OFF("off");

  private String value;

  TrueClientIpHeaderValue(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TrueClientIpHeaderValue fromValue(String input) {
    for (TrueClientIpHeaderValue b : TrueClientIpHeaderValue.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TrueClientIpHeaderValue> {
    @Override
    public void write(final JsonWriter jsonWriter, final TrueClientIpHeaderValue enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TrueClientIpHeaderValue read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TrueClientIpHeaderValue.fromValue((String)(value));
    }
  }
}
