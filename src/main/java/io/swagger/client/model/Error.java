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
 * Errors resulting from collecting traceroute from colo to target.
 */
@JsonAdapter(Error.Adapter.class)
public enum Error {
  EMPTY(""),
  COULD_NOT_GATHER_TRACEROUTE_DATA_CODE_1("Could not gather traceroute data: Code 1"),
  COULD_NOT_GATHER_TRACEROUTE_DATA_CODE_2("Could not gather traceroute data: Code 2"),
  COULD_NOT_GATHER_TRACEROUTE_DATA_CODE_3("Could not gather traceroute data: Code 3"),
  COULD_NOT_GATHER_TRACEROUTE_DATA_CODE_4("Could not gather traceroute data: Code 4");

  private String value;

  Error(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Error fromValue(String input) {
    for (Error b : Error.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Error> {
    @Override
    public void write(final JsonWriter jsonWriter, final Error enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public Error read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return Error.fromValue((String)(value));
    }
  }
}
