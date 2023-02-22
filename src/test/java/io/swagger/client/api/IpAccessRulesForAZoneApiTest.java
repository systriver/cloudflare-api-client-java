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

import io.swagger.client.model.AccessRulesRulesBody2;
import io.swagger.client.model.InlineResponse4xx321;
import io.swagger.client.model.InlineResponse4xx322;
import io.swagger.client.model.InlineResponse4xx323;
import io.swagger.client.model.RuleCollectionResponse;
import io.swagger.client.model.RuleSingleIdResponse;
import io.swagger.client.model.RuleSingleResponse;
import io.swagger.client.model.RulesIdentifierBody1;
import io.swagger.client.model.RulesIdentifierBody2;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IpAccessRulesForAZoneApi
 */
@Ignore
public class IpAccessRulesForAZoneApiTest {

    private final IpAccessRulesForAZoneApi api = new IpAccessRulesForAZoneApi();

    /**
     * Create an IP Access rule
     *
     * Creates a new IP Access rule for a zone.  Note: To create an IP Access rule that applies to multiple zones, refer to [IP Access rules for a user](#ip-access-rules-for-a-user) or [IP Access rules for an account](#ip-access-rules-for-an-account) as appropriate.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAZoneCreateAnIpAccessRuleTest() throws Exception {
        AccessRulesRulesBody2 body = null;
        String zoneId = null;
        RuleSingleResponse response = api.ipAccessRulesForAZoneCreateAnIpAccessRule(body, zoneId);

        // TODO: test validations
    }
    /**
     * Delete an IP Access rule
     *
     * Deletes an IP Access rule defined at the zone level.  Optionally, you can use the &#x60;cascade&#x60; property to specify that you wish to delete similar rules in other zones managed by the same zone owner.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAZoneDeleteAnIpAccessRuleTest() throws Exception {
        RulesIdentifierBody1 body = null;
        String identifier = null;
        String zoneId = null;
        RuleSingleIdResponse response = api.ipAccessRulesForAZoneDeleteAnIpAccessRule(body, identifier, zoneId);

        // TODO: test validations
    }
    /**
     * List IP Access rules
     *
     * Fetches IP Access rules of a zone. You can filter the results using several optional parameters.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAZoneListIpAccessRulesTest() throws Exception {
        String zoneId = null;
        RuleCollectionResponse response = api.ipAccessRulesForAZoneListIpAccessRules(zoneId);

        // TODO: test validations
    }
    /**
     * Update an IP Access rule
     *
     * Updates an IP Access rule defined at the zone level. You can only update the rule action (&#x60;mode&#x60; parameter) and notes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAZoneUpdateAnIpAccessRuleTest() throws Exception {
        RulesIdentifierBody2 body = null;
        String identifier = null;
        String zoneId = null;
        RuleSingleResponse response = api.ipAccessRulesForAZoneUpdateAnIpAccessRule(body, identifier, zoneId);

        // TODO: test validations
    }
}