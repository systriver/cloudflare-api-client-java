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
import io.swagger.client.model.AccountsaccountIdentifierrequesttracertraceBody;
import io.swagger.client.model.AccountsaccountIdentifierrequesttracertraceContext;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * RequesttracerTraceBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class RequesttracerTraceBody {
  @SerializedName("body")
  private AccountsaccountIdentifierrequesttracertraceBody body = null;

  @SerializedName("context")
  private AccountsaccountIdentifierrequesttracertraceContext context = null;

  @SerializedName("cookies")
  private Map<String, String> cookies = null;

  @SerializedName("headers")
  private Map<String, String> headers = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("skip_response")
  private Boolean skipResponse = null;

  @SerializedName("url")
  private String url = null;

  public RequesttracerTraceBody body(AccountsaccountIdentifierrequesttracertraceBody body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @Schema(description = "")
  public AccountsaccountIdentifierrequesttracertraceBody getBody() {
    return body;
  }

  public void setBody(AccountsaccountIdentifierrequesttracertraceBody body) {
    this.body = body;
  }

  public RequesttracerTraceBody context(AccountsaccountIdentifierrequesttracertraceContext context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @Schema(description = "")
  public AccountsaccountIdentifierrequesttracertraceContext getContext() {
    return context;
  }

  public void setContext(AccountsaccountIdentifierrequesttracertraceContext context) {
    this.context = context;
  }

  public RequesttracerTraceBody cookies(Map<String, String> cookies) {
    this.cookies = cookies;
    return this;
  }

  public RequesttracerTraceBody putCookiesItem(String key, String cookiesItem) {
    if (this.cookies == null) {
      this.cookies = new HashMap<String, String>();
    }
    this.cookies.put(key, cookiesItem);
    return this;
  }

   /**
   * Cookies added to tracing request
   * @return cookies
  **/
  @Schema(example = "{\"cookie_name_1\":\"cookie_value_1\",\"cookie_name_2\":\"cookie_value_2\"}", description = "Cookies added to tracing request")
  public Map<String, String> getCookies() {
    return cookies;
  }

  public void setCookies(Map<String, String> cookies) {
    this.cookies = cookies;
  }

  public RequesttracerTraceBody headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public RequesttracerTraceBody putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, String>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Headers added to tracing request
   * @return headers
  **/
  @Schema(example = "{\"header_name_1\":\"header_value_1\",\"header_name_2\":\"header_value_2\"}", description = "Headers added to tracing request")
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public RequesttracerTraceBody method(String method) {
    this.method = method;
    return this;
  }

   /**
   * HTTP Method of tracing request
   * @return method
  **/
  @Schema(example = "PUT", required = true, description = "HTTP Method of tracing request")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public RequesttracerTraceBody protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * HTTP Protocol of tracing request
   * @return protocol
  **/
  @Schema(example = "HTTP/1.1", description = "HTTP Protocol of tracing request")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public RequesttracerTraceBody skipResponse(Boolean skipResponse) {
    this.skipResponse = skipResponse;
    return this;
  }

   /**
   * Skip sending the request to the Origin server after all rules evaluation
   * @return skipResponse
  **/
  @Schema(description = "Skip sending the request to the Origin server after all rules evaluation")
  public Boolean isSkipResponse() {
    return skipResponse;
  }

  public void setSkipResponse(Boolean skipResponse) {
    this.skipResponse = skipResponse;
  }

  public RequesttracerTraceBody url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to which perform tracing request
   * @return url
  **/
  @Schema(example = "https://some.zone/some_path", required = true, description = "URL to which perform tracing request")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequesttracerTraceBody requesttracerTraceBody = (RequesttracerTraceBody) o;
    return Objects.equals(this.body, requesttracerTraceBody.body) &&
        Objects.equals(this.context, requesttracerTraceBody.context) &&
        Objects.equals(this.cookies, requesttracerTraceBody.cookies) &&
        Objects.equals(this.headers, requesttracerTraceBody.headers) &&
        Objects.equals(this.method, requesttracerTraceBody.method) &&
        Objects.equals(this.protocol, requesttracerTraceBody.protocol) &&
        Objects.equals(this.skipResponse, requesttracerTraceBody.skipResponse) &&
        Objects.equals(this.url, requesttracerTraceBody.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, context, cookies, headers, method, protocol, skipResponse, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequesttracerTraceBody {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    cookies: ").append(toIndentedString(cookies)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    skipResponse: ").append(toIndentedString(skipResponse)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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