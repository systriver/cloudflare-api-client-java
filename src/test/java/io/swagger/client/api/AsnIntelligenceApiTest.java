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

import io.swagger.client.model.AsnComponentsSchemasAsn;
import io.swagger.client.model.AsnComponentsSchemasResponse;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse4xx54;
import io.swagger.client.model.InlineResponse4xx55;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AsnIntelligenceApi
 */
@Ignore
public class AsnIntelligenceApiTest {

    private final AsnIntelligenceApi api = new AsnIntelligenceApi();

    /**
     * Get ASN Overview
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void asnIntelligenceGetAsnOverviewTest() throws Exception {
        AsnComponentsSchemasAsn asn = null;
        String accountIdentifier = null;
        AsnComponentsSchemasResponse response = api.asnIntelligenceGetAsnOverview(asn, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get ASN Subnets
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void asnIntelligenceGetAsnSubnetsTest() throws Exception {
        AsnComponentsSchemasAsn asn = null;
        String accountIdentifier = null;
        InlineResponse2002 response = api.asnIntelligenceGetAsnSubnets(asn, accountIdentifier);

        // TODO: test validations
    }
}
