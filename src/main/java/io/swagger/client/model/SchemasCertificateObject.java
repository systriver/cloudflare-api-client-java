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
import io.swagger.client.model.HostnameAuthenticatedOriginPullComponentsSchemasStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * SchemasCertificateObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SchemasCertificateObject {
  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("expires_on")
  private OffsetDateTime expiresOn = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("issuer")
  private String issuer = null;

  @SerializedName("serial_number")
  private String serialNumber = null;

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("status")
  private HostnameAuthenticatedOriginPullComponentsSchemasStatus status = null;

  @SerializedName("uploaded_on")
  private OffsetDateTime uploadedOn = null;

  public SchemasCertificateObject certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @Schema(description = "")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public SchemasCertificateObject expiresOn(OffsetDateTime expiresOn) {
    this.expiresOn = expiresOn;
    return this;
  }

   /**
   * Get expiresOn
   * @return expiresOn
  **/
  @Schema(description = "")
  public OffsetDateTime getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(OffsetDateTime expiresOn) {
    this.expiresOn = expiresOn;
  }

  public SchemasCertificateObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SchemasCertificateObject issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @Schema(description = "")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public SchemasCertificateObject serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @Schema(description = "")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public SchemasCertificateObject signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @Schema(description = "")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public SchemasCertificateObject status(HostnameAuthenticatedOriginPullComponentsSchemasStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public HostnameAuthenticatedOriginPullComponentsSchemasStatus getStatus() {
    return status;
  }

  public void setStatus(HostnameAuthenticatedOriginPullComponentsSchemasStatus status) {
    this.status = status;
  }

  public SchemasCertificateObject uploadedOn(OffsetDateTime uploadedOn) {
    this.uploadedOn = uploadedOn;
    return this;
  }

   /**
   * Get uploadedOn
   * @return uploadedOn
  **/
  @Schema(description = "")
  public OffsetDateTime getUploadedOn() {
    return uploadedOn;
  }

  public void setUploadedOn(OffsetDateTime uploadedOn) {
    this.uploadedOn = uploadedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemasCertificateObject schemasCertificateObject = (SchemasCertificateObject) o;
    return Objects.equals(this.certificate, schemasCertificateObject.certificate) &&
        Objects.equals(this.expiresOn, schemasCertificateObject.expiresOn) &&
        Objects.equals(this.id, schemasCertificateObject.id) &&
        Objects.equals(this.issuer, schemasCertificateObject.issuer) &&
        Objects.equals(this.serialNumber, schemasCertificateObject.serialNumber) &&
        Objects.equals(this.signature, schemasCertificateObject.signature) &&
        Objects.equals(this.status, schemasCertificateObject.status) &&
        Objects.equals(this.uploadedOn, schemasCertificateObject.uploadedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, expiresOn, id, issuer, serialNumber, signature, status, uploadedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasCertificateObject {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadedOn: ").append(toIndentedString(uploadedOn)).append("\n");
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
