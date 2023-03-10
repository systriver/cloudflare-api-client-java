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

import io.swagger.client.model.AccountIdentifierMtlsCertificatesBody;
import io.swagger.client.model.AssociationResponseCollection;
import io.swagger.client.model.CertificateResponseSinglePost;
import io.swagger.client.model.InlineResponse4xx111;
import io.swagger.client.model.InlineResponse4xx112;
import io.swagger.client.model.InlineResponse4xx113;
import io.swagger.client.model.InlineResponse4xx114;
import io.swagger.client.model.MtlsManagementComponentsSchemasCertificateResponseCollection;
import io.swagger.client.model.MtlsManagementComponentsSchemasCertificateResponseSingle;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MTlsCertificateManagementApi
 */
@Ignore
public class MTlsCertificateManagementApiTest {

    private final MTlsCertificateManagementApi api = new MTlsCertificateManagementApi();

    /**
     * Delete mTLS certificate
     *
     * Deletes the mTLS certificate unless the certificate is in use by one or more Cloudflare services.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void mTlsCertificateManagementDeleteMTlsCertificateTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        MtlsManagementComponentsSchemasCertificateResponseSingle response = api.mTlsCertificateManagementDeleteMTlsCertificate(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get mTLS certificate
     *
     * Fetches a single mTLS certificate.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void mTlsCertificateManagementGetMTlsCertificateTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        MtlsManagementComponentsSchemasCertificateResponseSingle response = api.mTlsCertificateManagementGetMTlsCertificate(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List mTLS certificate associations
     *
     * Lists all active associations between the certificate and Cloudflare services.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void mTlsCertificateManagementListMTlsCertificateAssociationsTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        AssociationResponseCollection response = api.mTlsCertificateManagementListMTlsCertificateAssociations(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List mTLS certificates
     *
     * Lists all mTLS certificates.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void mTlsCertificateManagementListMTlsCertificatesTest() throws Exception {
        String accountIdentifier = null;
        MtlsManagementComponentsSchemasCertificateResponseCollection response = api.mTlsCertificateManagementListMTlsCertificates(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Upload mTLS certificate
     *
     * Upload a certificate that you want to use with mTLS-enabled Cloudflare services.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void mTlsCertificateManagementUploadMTlsCertificateTest() throws Exception {
        AccountIdentifierMtlsCertificatesBody body = null;
        String accountIdentifier = null;
        CertificateResponseSinglePost response = api.mTlsCertificateManagementUploadMTlsCertificate(body, accountIdentifier);

        // TODO: test validations
    }
}
