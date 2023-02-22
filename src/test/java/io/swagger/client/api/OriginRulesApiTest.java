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

import io.swagger.client.model.ApiResponseSingle;
import io.swagger.client.model.InlineResponse4xx33;
import io.swagger.client.model.InlineResponse4xx530;
import io.swagger.client.model.SchemasRuleset;
import io.swagger.client.model.UpdateRuleset;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OriginRulesApi
 */
@Ignore
public class OriginRulesApiTest {

    private final OriginRulesApi api = new OriginRulesApi();

    /**
     * List Origin Rules
     *
     * Fetches all Origin Rules in a zone.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void originRulesListOriginRulesTest() throws Exception {
        String zoneId = null;
        SchemasRuleset response = api.originRulesListOriginRules(zoneId);

        // TODO: test validations
    }
    /**
     * Update Origin Rules
     *
     * Updates the Origin Rules of a zone.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void originRulesUpdateOriginRulesTest() throws Exception {
        UpdateRuleset body = null;
        String zoneId = null;
        ApiResponseSingle response = api.originRulesUpdateOriginRules(body, zoneId);

        // TODO: test validations
    }
}
