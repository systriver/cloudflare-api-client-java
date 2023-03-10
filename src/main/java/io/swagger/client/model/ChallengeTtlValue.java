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
 * Value of the zone setting.
 */
@JsonAdapter(ChallengeTtlValue.Adapter.class)
public enum ChallengeTtlValue {
  NUMBER_300(new BigDecimal(300)),
  NUMBER_900(new BigDecimal(900)),
  NUMBER_1800(new BigDecimal(1800)),
  NUMBER_2700(new BigDecimal(2700)),
  NUMBER_3600(new BigDecimal(3600)),
  NUMBER_7200(new BigDecimal(7200)),
  NUMBER_10800(new BigDecimal(10800)),
  NUMBER_14400(new BigDecimal(14400)),
  NUMBER_28800(new BigDecimal(28800)),
  NUMBER_57600(new BigDecimal(57600)),
  NUMBER_86400(new BigDecimal(86400)),
  NUMBER_604800(new BigDecimal(604800)),
  NUMBER_2592000(new BigDecimal(2592000)),
  NUMBER_31536000(new BigDecimal(31536000));

  private BigDecimal value;

  ChallengeTtlValue(BigDecimal value) {
    this.value = value;
  }

  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChallengeTtlValue fromValue(BigDecimal input) {
    for (ChallengeTtlValue b : ChallengeTtlValue.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ChallengeTtlValue> {
    @Override
    public void write(final JsonWriter jsonWriter, final ChallengeTtlValue enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public ChallengeTtlValue read(final JsonReader jsonReader) throws IOException {
      Object value = new BigDecimal(jsonReader.nextDouble());
      return ChallengeTtlValue.fromValue((BigDecimal)(value));
    }
  }
}
