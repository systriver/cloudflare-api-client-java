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

import io.swagger.client.model.DomainComponentsSchemasSingleResponse;
import io.swagger.client.model.InlineResponse4xx57;
import io.swagger.client.model.InlineResponse4xx59;
import io.swagger.client.model.SchemasCollectionResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DomainIntelligenceApi
 */
@Ignore
public class DomainIntelligenceApiTest {

    private final DomainIntelligenceApi api = new DomainIntelligenceApi();

    /**
     * Get Domain Details
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainIntelligenceGetDomainDetailsTest() throws Exception {
        String accountIdentifier = null;
        DomainComponentsSchemasSingleResponse response = api.domainIntelligenceGetDomainDetails(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get Multiple Domain Details
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void domainIntelligenceGetMultipleDomainDetailsTest() throws Exception {
        String accountIdentifier = null;
        SchemasCollectionResponse response = api.domainIntelligenceGetMultipleDomainDetails(accountIdentifier);

        // TODO: test validations
    }
}
