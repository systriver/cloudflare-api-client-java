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
 * The mode that defines how rules within the package are evaluated during the course of a request. When a package uses anomaly detection mode (&#x60;anomaly&#x60; value), each rule is given a score when triggered. If the total score of all triggered rules exceeds the sensitivity defined in the WAF package, the action configured in the package will be performed. Traditional detection mode (&#x60;traditional&#x60; value) will decide the action to take when it is triggered by the request. If multiple rules are triggered, the action providing the highest protection will be applied (for example, a &#x27;block&#x27; action will win over a &#x27;challenge&#x27; action).
 */
@JsonAdapter(DetectionMode.Adapter.class)
public enum DetectionMode {
  ANOMALY("anomaly"),
  TRADITIONAL("traditional");

  private String value;

  DetectionMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DetectionMode fromValue(String input) {
    for (DetectionMode b : DetectionMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DetectionMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final DetectionMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DetectionMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DetectionMode.fromValue((String)(value));
    }
  }
}
