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
import io.swagger.client.model.ApiResponseCommon;
import io.swagger.client.model.Messages;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DeploymentResponseLogs
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DeploymentResponseLogs extends ApiResponseCommon {
  @SerializedName("result")
  private Object deploymentResponseLogsResult = null;

  public DeploymentResponseLogs deploymentResponseLogsResult(Object deploymentResponseLogsResult) {
    this.deploymentResponseLogsResult = deploymentResponseLogsResult;
    return this;
  }

   /**
   * Get deploymentResponseLogsResult
   * @return deploymentResponseLogsResult
  **/
  @Schema(example = "{\"data\":[{\"line\":\"Cloning repository...\",\"ts\":\"2021-04-20T19:35:29.0749819Z\"},{\"line\":\"From https://github.com/cloudflare/example\",\"ts\":\"2021-04-20T19:35:30.0749819Z\"},{\"line\":\" * branch            209c5bb11d89533f426b2f8469bcae12fdccf71b -> FETCH_HEAD\",\"ts\":\"2021-04-20T19:35:30.0749819Z\"},{\"line\":\"\",\"ts\":\"2021-04-20T19:35:30.0749819Z\"},{\"line\":\"HEAD is now at 209c5bb Update index.html\",\"ts\":\"2021-04-20T19:35:30.0749819Z\"},{\"line\":\"\",\"ts\":\"2021-04-20T19:35:30.0749819Z\"},{\"line\":\"\",\"ts\":\"2021-04-20T19:35:30.0749819Z\"},{\"line\":\"Success: Finished cloning repository files\",\"ts\":\"2021-04-20T19:35:30.0749819Z\"},{\"line\":\"Installing dependencies\",\"ts\":\"2021-04-20T19:35:59.0749819Z\"},{\"line\":\"Python version set to 2.7\",\"ts\":\"2021-04-20T19:35:59.0931208Z\"},{\"line\":\"v12.18.0 is already installed.\",\"ts\":\"2021-04-20T19:36:02.2369501Z\"},{\"line\":\"Now using node v12.18.0 (npm v6.14.4)\",\"ts\":\"2021-04-20T19:36:02.6028886Z\"},{\"line\":\"Started restoring cached build plugins\",\"ts\":\"2021-04-20T19:36:02.624555Z\"},{\"line\":\"Finished restoring cached build plugins\",\"ts\":\"2021-04-20T19:36:02.6340688Z\"},{\"line\":\"Attempting ruby version 2.7.1, read from environment\",\"ts\":\"2021-04-20T19:36:02.963095Z\"},{\"line\":\"Using ruby version 2.7.1\",\"ts\":\"2021-04-20T19:36:04.2236084Z\"},{\"line\":\"Using PHP version 5.6\",\"ts\":\"2021-04-20T19:36:04.5450152Z\"},{\"line\":\"5.2 is already installed.\",\"ts\":\"2021-04-20T19:36:04.5740509Z\"},{\"line\":\"Using Swift version 5.2\",\"ts\":\"2021-04-20T19:36:04.577035Z\"},{\"line\":\"Installing Hugo 0.54.0\",\"ts\":\"2021-04-20T19:36:04.5771615Z\"},{\"line\":\"Hugo Static Site Generator v0.54.0-B1A82C61A/extended linux/amd64 BuildDate: 2019-02-01T10:04:38Z\",\"ts\":\"2021-04-20T19:36:05.4786868Z\"},{\"line\":\"Started restoring cached go cache\",\"ts\":\"2021-04-20T19:36:05.4794366Z\"},{\"line\":\"Finished restoring cached go cache\",\"ts\":\"2021-04-20T19:36:05.481977Z\"},{\"line\":\"go version go1.14.4 linux/amd64\",\"ts\":\"2021-04-20T19:36:05.9049776Z\"},{\"line\":\"go version go1.14.4 linux/amd64\",\"ts\":\"2021-04-20T19:36:05.9086053Z\"},{\"line\":\"Installing missing commands\",\"ts\":\"2021-04-20T19:36:05.9163568Z\"},{\"line\":\"Verify run directory\",\"ts\":\"2021-04-20T19:36:05.9163934Z\"},{\"line\":\"Executing user command: echo \\\"skipping build step: no build command specified\\\"\",\"ts\":\"2021-04-20T19:36:05.9164636Z\"},{\"line\":\"skipping build step: no build command specified\",\"ts\":\"2021-04-20T19:36:05.9165087Z\"},{\"line\":\"Finished\",\"ts\":\"2021-04-20T19:36:05.917412Z\"}],\"includes_container_logs\":true,\"total\":30}", description = "")
  public Object getDeploymentResponseLogsResult() {
    return deploymentResponseLogsResult;
  }

  public void setDeploymentResponseLogsResult(Object deploymentResponseLogsResult) {
    this.deploymentResponseLogsResult = deploymentResponseLogsResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentResponseLogs deploymentResponseLogs = (DeploymentResponseLogs) o;
    return Objects.equals(this.deploymentResponseLogsResult, deploymentResponseLogs.deploymentResponseLogsResult) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentResponseLogsResult, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentResponseLogs {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    deploymentResponseLogsResult: ").append(toIndentedString(deploymentResponseLogsResult)).append("\n");
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