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
 * The application type.
 */
@JsonAdapter(Type.Adapter.class)
public enum Type {
  SELF_HOSTED("self_hosted"),
  SAAS("saas"),
  SSH("ssh"),
  VNC("vnc"),
  APP_LAUNCHER("app_launcher"),
  WARP("warp"),
  BISO("biso"),
  BOOKMARK("bookmark"),
  DASH_SSO("dash_sso");

  private String value;

  Type(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Type fromValue(String input) {
    for (Type b : Type.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Type> {
    @Override
    public void write(final JsonWriter jsonWriter, final Type enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public Type read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return Type.fromValue((String)(value));
    }
  }
}
