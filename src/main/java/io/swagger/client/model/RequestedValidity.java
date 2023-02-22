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
import java.math.BigDecimal;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The number of days for which the certificate should be valid.
 */
@JsonAdapter(RequestedValidity.Adapter.class)
public enum RequestedValidity {
  NUMBER_7(new BigDecimal(7)),
  NUMBER_30(new BigDecimal(30)),
  NUMBER_90(new BigDecimal(90)),
  NUMBER_365(new BigDecimal(365)),
  NUMBER_730(new BigDecimal(730)),
  NUMBER_1095(new BigDecimal(1095)),
  NUMBER_5475(new BigDecimal(5475));

  private BigDecimal value;

  RequestedValidity(BigDecimal value) {
    this.value = value;
  }

  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RequestedValidity fromValue(BigDecimal input) {
    for (RequestedValidity b : RequestedValidity.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<RequestedValidity> {
    @Override
    public void write(final JsonWriter jsonWriter, final RequestedValidity enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public RequestedValidity read(final JsonReader jsonReader) throws IOException {
      Object value = new BigDecimal(jsonReader.nextDouble());
      return RequestedValidity.fromValue((BigDecimal)(value));
    }
  }
}
