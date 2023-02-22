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
import io.swagger.client.model.SamlConfigHeaderAttributes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SamlConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SamlConfig {
  @SerializedName("attributes")
  private List<String> attributes = null;

  @SerializedName("email_attribute_name")
  private String emailAttributeName = null;

  @SerializedName("header_attributes")
  private List<SamlConfigHeaderAttributes> headerAttributes = null;

  @SerializedName("idp_public_certs")
  private List<String> idpPublicCerts = null;

  @SerializedName("issuer_url")
  private String issuerUrl = null;

  @SerializedName("sign_request")
  private Boolean signRequest = null;

  @SerializedName("sso_target_url")
  private String ssoTargetUrl = null;

  public SamlConfig attributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public SamlConfig addAttributesItem(String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<String>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * A list of SAML attribute names that will be added to your signed JWT token and can be used in SAML policy rules.
   * @return attributes
  **/
  @Schema(example = "[\"group\",\"department_code\",\"divison\"]", description = "A list of SAML attribute names that will be added to your signed JWT token and can be used in SAML policy rules.")
  public List<String> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }

  public SamlConfig emailAttributeName(String emailAttributeName) {
    this.emailAttributeName = emailAttributeName;
    return this;
  }

   /**
   * The attribute name for email in the SAML response.
   * @return emailAttributeName
  **/
  @Schema(example = "Email", description = "The attribute name for email in the SAML response.")
  public String getEmailAttributeName() {
    return emailAttributeName;
  }

  public void setEmailAttributeName(String emailAttributeName) {
    this.emailAttributeName = emailAttributeName;
  }

  public SamlConfig headerAttributes(List<SamlConfigHeaderAttributes> headerAttributes) {
    this.headerAttributes = headerAttributes;
    return this;
  }

  public SamlConfig addHeaderAttributesItem(SamlConfigHeaderAttributes headerAttributesItem) {
    if (this.headerAttributes == null) {
      this.headerAttributes = new ArrayList<SamlConfigHeaderAttributes>();
    }
    this.headerAttributes.add(headerAttributesItem);
    return this;
  }

   /**
   * Add a list of attribute names that will be returned in the response header from the Access callback.
   * @return headerAttributes
  **/
  @Schema(description = "Add a list of attribute names that will be returned in the response header from the Access callback.")
  public List<SamlConfigHeaderAttributes> getHeaderAttributes() {
    return headerAttributes;
  }

  public void setHeaderAttributes(List<SamlConfigHeaderAttributes> headerAttributes) {
    this.headerAttributes = headerAttributes;
  }

  public SamlConfig idpPublicCerts(List<String> idpPublicCerts) {
    this.idpPublicCerts = idpPublicCerts;
    return this;
  }

  public SamlConfig addIdpPublicCertsItem(String idpPublicCertsItem) {
    if (this.idpPublicCerts == null) {
      this.idpPublicCerts = new ArrayList<String>();
    }
    this.idpPublicCerts.add(idpPublicCertsItem);
    return this;
  }

   /**
   * X509 certificate to verify the signature in the SAML authentication response
   * @return idpPublicCerts
  **/
  @Schema(description = "X509 certificate to verify the signature in the SAML authentication response")
  public List<String> getIdpPublicCerts() {
    return idpPublicCerts;
  }

  public void setIdpPublicCerts(List<String> idpPublicCerts) {
    this.idpPublicCerts = idpPublicCerts;
  }

  public SamlConfig issuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
    return this;
  }

   /**
   * IdP Entity ID or Issuer URL
   * @return issuerUrl
  **/
  @Schema(example = "https://whoami.com", description = "IdP Entity ID or Issuer URL")
  public String getIssuerUrl() {
    return issuerUrl;
  }

  public void setIssuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
  }

  public SamlConfig signRequest(Boolean signRequest) {
    this.signRequest = signRequest;
    return this;
  }

   /**
   * Sign the SAML authentication request with Access credentials. To verify the signature, use the public key from the Access certs endpoints.
   * @return signRequest
  **/
  @Schema(description = "Sign the SAML authentication request with Access credentials. To verify the signature, use the public key from the Access certs endpoints.")
  public Boolean isSignRequest() {
    return signRequest;
  }

  public void setSignRequest(Boolean signRequest) {
    this.signRequest = signRequest;
  }

  public SamlConfig ssoTargetUrl(String ssoTargetUrl) {
    this.ssoTargetUrl = ssoTargetUrl;
    return this;
  }

   /**
   * URL to send the SAML authentication requests to
   * @return ssoTargetUrl
  **/
  @Schema(example = "https://edgeaccess.org/idp/saml/login", description = "URL to send the SAML authentication requests to")
  public String getSsoTargetUrl() {
    return ssoTargetUrl;
  }

  public void setSsoTargetUrl(String ssoTargetUrl) {
    this.ssoTargetUrl = ssoTargetUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlConfig samlConfig = (SamlConfig) o;
    return Objects.equals(this.attributes, samlConfig.attributes) &&
        Objects.equals(this.emailAttributeName, samlConfig.emailAttributeName) &&
        Objects.equals(this.headerAttributes, samlConfig.headerAttributes) &&
        Objects.equals(this.idpPublicCerts, samlConfig.idpPublicCerts) &&
        Objects.equals(this.issuerUrl, samlConfig.issuerUrl) &&
        Objects.equals(this.signRequest, samlConfig.signRequest) &&
        Objects.equals(this.ssoTargetUrl, samlConfig.ssoTargetUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, emailAttributeName, headerAttributes, idpPublicCerts, issuerUrl, signRequest, ssoTargetUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfig {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    emailAttributeName: ").append(toIndentedString(emailAttributeName)).append("\n");
    sb.append("    headerAttributes: ").append(toIndentedString(headerAttributes)).append("\n");
    sb.append("    idpPublicCerts: ").append(toIndentedString(idpPublicCerts)).append("\n");
    sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
    sb.append("    signRequest: ").append(toIndentedString(signRequest)).append("\n");
    sb.append("    ssoTargetUrl: ").append(toIndentedString(ssoTargetUrl)).append("\n");
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