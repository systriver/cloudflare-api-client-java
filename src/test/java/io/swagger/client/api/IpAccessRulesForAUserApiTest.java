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

import io.swagger.client.model.AccessRulesRulesBody1;
import io.swagger.client.model.InlineResponse4xx321;
import io.swagger.client.model.InlineResponse4xx322;
import io.swagger.client.model.InlineResponse4xx323;
import io.swagger.client.model.RuleCollectionResponse;
import io.swagger.client.model.RuleSingleIdResponse;
import io.swagger.client.model.RuleSingleResponse;
import io.swagger.client.model.RulesIdentifierBody;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IpAccessRulesForAUserApi
 */
@Ignore
public class IpAccessRulesForAUserApiTest {

    private final IpAccessRulesForAUserApi api = new IpAccessRulesForAUserApi();

    /**
     * Create an IP Access rule
     *
     * Creates a new IP Access rule for all zones owned by the current user.  Note: To create an IP Access rule that applies to a specific zone, refer to the [IP Access rules for a zone](#ip-access-rules-for-a-zone) endpoints.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAUserCreateAnIpAccessRuleTest() throws Exception {
        AccessRulesRulesBody1 body = null;
        RuleSingleResponse response = api.ipAccessRulesForAUserCreateAnIpAccessRule(body);

        // TODO: test validations
    }
    /**
     * Delete an IP Access rule
     *
     * Deletes an IP Access rule at the user level.  Note: Deleting a user-level rule will affect all zones owned by the user.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAUserDeleteAnIpAccessRuleTest() throws Exception {
        String identifier = null;
        RuleSingleIdResponse response = api.ipAccessRulesForAUserDeleteAnIpAccessRule(identifier);

        // TODO: test validations
    }
    /**
     * List IP Access rules
     *
     * Fetches IP Access rules of the user. You can filter the results using several optional parameters.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAUserListIpAccessRulesTest() throws Exception {
        RuleCollectionResponse response = api.ipAccessRulesForAUserListIpAccessRules();

        // TODO: test validations
    }
    /**
     * Update an IP Access rule
     *
     * Updates an IP Access rule defined at the user level. You can only update the rule action (&#x60;mode&#x60; parameter) and notes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAUserUpdateAnIpAccessRuleTest() throws Exception {
        RulesIdentifierBody body = null;
        String identifier = null;
        RuleSingleResponse response = api.ipAccessRulesForAUserUpdateAnIpAccessRule(body, identifier);

        // TODO: test validations
    }
}