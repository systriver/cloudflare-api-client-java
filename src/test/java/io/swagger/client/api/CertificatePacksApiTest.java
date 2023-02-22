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

import io.swagger.client.model.AdvancedCertificatePackResponseSingle;
import io.swagger.client.model.CertificatePackQuotaResponse;
import io.swagger.client.model.CertificatePackResponseCollection;
import io.swagger.client.model.CertificatePackResponseSingle;
import io.swagger.client.model.CertificatePacksOrderBody;
import io.swagger.client.model.DeleteAdvancedCertificatePackResponseSingle;
import io.swagger.client.model.InlineResponse4xx483;
import io.swagger.client.model.InlineResponse4xx484;
import io.swagger.client.model.InlineResponse4xx485;
import io.swagger.client.model.InlineResponse4xx486;
import io.swagger.client.model.InlineResponse4xx487;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CertificatePacksApi
 */
@Ignore
public class CertificatePacksApiTest {

    private final CertificatePacksApi api = new CertificatePacksApi();

    /**
     * Delete Advanced Certificate Manager Certificate Pack
     *
     * For a given zone, delete an advanced certificate pack.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void certificatePacksDeleteAdvancedCertificateManagerCertificatePackTest() throws Exception {
        String identifier = null;
        String zoneIdentifier = null;
        DeleteAdvancedCertificatePackResponseSingle response = api.certificatePacksDeleteAdvancedCertificateManagerCertificatePack(identifier, zoneIdentifier);

        // TODO: test validations
    }
    /**
     * Get Certificate Pack
     *
     * For a given zone, get a certificate pack.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void certificatePacksGetCertificatePackTest() throws Exception {
        String identifier = null;
        String zoneIdentifier = null;
        CertificatePackResponseSingle response = api.certificatePacksGetCertificatePack(identifier, zoneIdentifier);

        // TODO: test validations
    }
    /**
     * Get Certificate Pack Quotas
     *
     * For a given zone, list certificate pack quotas.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void certificatePacksGetCertificatePackQuotasTest() throws Exception {
        String zoneIdentifier = null;
        CertificatePackQuotaResponse response = api.certificatePacksGetCertificatePackQuotas(zoneIdentifier);

        // TODO: test validations
    }
    /**
     * List Certificate Packs
     *
     * For a given zone, list all active certificate packs.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void certificatePacksListCertificatePacksTest() throws Exception {
        String zoneIdentifier = null;
        CertificatePackResponseCollection response = api.certificatePacksListCertificatePacks(zoneIdentifier);

        // TODO: test validations
    }
    /**
     * Order Advanced Certificate Manager Certificate Pack
     *
     * For a given zone, order an advanced certificate pack.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void certificatePacksOrderAdvancedCertificateManagerCertificatePackTest() throws Exception {
        CertificatePacksOrderBody body = null;
        String zoneIdentifier = null;
        AdvancedCertificatePackResponseSingle response = api.certificatePacksOrderAdvancedCertificateManagerCertificatePack(body, zoneIdentifier);

        // TODO: test validations
    }
    /**
     * Restart Validation for Advanced Certificate Manager Certificate Pack
     *
     * For a given zone, restart validation for an advanced certificate pack.  This is only a validation operation for a Certificate Pack in a validation_timed_out status.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePackTest() throws Exception {
        String identifier = null;
        String zoneIdentifier = null;
        AdvancedCertificatePackResponseSingle response = api.certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack(identifier, zoneIdentifier);

        // TODO: test validations
    }
}
