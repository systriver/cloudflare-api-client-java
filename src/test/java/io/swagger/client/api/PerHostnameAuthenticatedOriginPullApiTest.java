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

package io.swagger.client.api;

import io.swagger.client.model.ComponentsSchemasCertificateResponseSingle;
import io.swagger.client.model.HostnameAopResponseCollection;
import io.swagger.client.model.HostnameAopSingleResponse;
import io.swagger.client.model.HostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection;
import io.swagger.client.model.HostnamesCertificatesBody;
import io.swagger.client.model.InlineResponse4xx418;
import io.swagger.client.model.InlineResponse4xx419;
import io.swagger.client.model.InlineResponse4xx420;
import io.swagger.client.model.InlineResponse4xx421;
import io.swagger.client.model.OriginTlsClientAuthHostnamesBody;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PerHostnameAuthenticatedOriginPullApi
 */
@Ignore
public class PerHostnameAuthenticatedOriginPullApiTest {

    private final PerHostnameAuthenticatedOriginPullApi api = new PerHostnameAuthenticatedOriginPullApi();

    /**
     * Delete Hostname Client Certificate
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificateTest() throws Exception {
        String identifier = null;
        String zoneIdentifier = null;
        ComponentsSchemasCertificateResponseSingle response = api.perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate(identifier, zoneIdentifier);

        // TODO: test validations
    }
    /**
     * Enable or Disable a Hostname for Client Authentication
     *
     * Associate a hostname to a certificate and enable, disable or invalidate the association. If disabled, client certificate will not be sent to the hostname even if activated at the zone level. 100 maximum associations on a single certificate are allowed. Note: Use a null value for parameter *enabled* to invalidate the association.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthenticationTest() throws Exception {
        OriginTlsClientAuthHostnamesBody body = null;
        String zoneIdentifier = null;
        HostnameAopResponseCollection response = api.perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication(body, zoneIdentifier);

        // TODO: test validations
    }
    /**
     * Get the Hostname Client Certificate
     *
     * Get the certificate by ID to be used for client authentication on a hostname.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificateTest() throws Exception {
        String identifier = null;
        String zoneIdentifier = null;
        ComponentsSchemasCertificateResponseSingle response = api.perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate(identifier, zoneIdentifier);

        // TODO: test validations
    }
    /**
     * Get the Hostname Status for Client Authentication
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthenticationTest() throws Exception {
        String hostname = null;
        String zoneIdentifier = null;
        HostnameAopSingleResponse response = api.perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication(hostname, zoneIdentifier);

        // TODO: test validations
    }
    /**
     * List Certificates
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void perHostnameAuthenticatedOriginPullListCertificatesTest() throws Exception {
        String zoneIdentifier = null;
        HostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection response = api.perHostnameAuthenticatedOriginPullListCertificates(zoneIdentifier);

        // TODO: test validations
    }
    /**
     * Upload a Hostname Client Certificate
     *
     * Upload a certificate to be used for client authentication on a hostname. 10 hostname certificates per zone are allowed.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificateTest() throws Exception {
        HostnamesCertificatesBody body = null;
        String zoneIdentifier = null;
        ComponentsSchemasCertificateResponseSingle response = api.perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate(body, zoneIdentifier);

        // TODO: test validations
    }
}