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
 * The name of the custom page type.
 */
@JsonAdapter(CustomPagesComponentsSchemasIdentifier2.Adapter.class)
public enum CustomPagesComponentsSchemasIdentifier2 {
  BASIC_CHALLENGE("basic_challenge"),
  MANAGED_CHALLENGE("managed_challenge"),
  WAF_BLOCK("waf_block"),
  COUNTRY_CHALLENGE("country_challenge"),
  IP_BLOCK("ip_block"),
  UNDER_ATTACK("under_attack"),
  RATELIMIT_BLOCK("ratelimit_block"),
  _500_ERRORS("500_errors"),
  _1000_ERRORS("1000_errors");

  private String value;

  CustomPagesComponentsSchemasIdentifier2(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CustomPagesComponentsSchemasIdentifier2 fromValue(String input) {
    for (CustomPagesComponentsSchemasIdentifier2 b : CustomPagesComponentsSchemasIdentifier2.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CustomPagesComponentsSchemasIdentifier2> {
    @Override
    public void write(final JsonWriter jsonWriter, final CustomPagesComponentsSchemasIdentifier2 enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CustomPagesComponentsSchemasIdentifier2 read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return CustomPagesComponentsSchemasIdentifier2.fromValue((String)(value));
    }
  }
}
