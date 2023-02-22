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

import io.swagger.client.model.InlineResponse200161;
import io.swagger.client.model.InlineResponse4xx382;
import io.swagger.client.model.InlineResponse4xx516;
import io.swagger.client.model.InlineResponse4xx517;
import io.swagger.client.model.RuleResponseCollection;
import io.swagger.client.model.RuleResponseSingle;
import io.swagger.client.model.RulesIdentifierBody3;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for WafRulesApi
 */
@Ignore
public class WafRulesApiTest {

    private final WafRulesApi api = new WafRulesApi();

    /**
     * Get a WAF rule
     *
     * Fetches the details of a WAF rule in a WAF package.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void wafRulesGetAWafRuleTest() throws Exception {
        String identifier = null;
        String packageId = null;
        String zoneId = null;
        RuleResponseSingle response = api.wafRulesGetAWafRule(identifier, packageId, zoneId);

        // TODO: test validations
    }
    /**
     * List WAF rules
     *
     * Fetches WAF rules in a WAF package.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void wafRulesListWafRulesTest() throws Exception {
        String packageId = null;
        String zoneId = null;
        RuleResponseCollection response = api.wafRulesListWafRules(packageId, zoneId);

        // TODO: test validations
    }
    /**
     * Update a WAF rule
     *
     * Updates a WAF rule. You can only update the mode/action of the rule.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void wafRulesUpdateAWafRuleTest() throws Exception {
        RulesIdentifierBody3 body = null;
        String identifier = null;
        String packageId = null;
        String zoneId = null;
        InlineResponse200161 response = api.wafRulesUpdateAWafRule(body, identifier, packageId, zoneId);

        // TODO: test validations
    }
}