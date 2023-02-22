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

import io.swagger.client.model.AccessRulesRulesBody;
import io.swagger.client.model.CloudflareClientAPIAccountIdentifier;
import io.swagger.client.model.CloudflareClientAPIApiResponseSingleId;
import io.swagger.client.model.CloudflareClientAPIResponseCollection;
import io.swagger.client.model.CloudflareClientAPISchemasIdentifier;
import io.swagger.client.model.InlineResponse4xx;
import io.swagger.client.model.InlineResponse4xx43;
import io.swagger.client.model.InlineResponse4xx44;
import io.swagger.client.model.ResponseSingle;
import io.swagger.client.model.SchemasRule;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IpAccessRulesForAnAccountApi
 */
@Ignore
public class IpAccessRulesForAnAccountApiTest {

    private final IpAccessRulesForAnAccountApi api = new IpAccessRulesForAnAccountApi();

    /**
     * Create an IP Access rule
     *
     * Creates a new IP Access rule for an account. The rule will apply to all zones in the account.  Note: To create an IP Access rule that applies to a single zone, refer to the [IP Access rules for a zone](#ip-access-rules-for-a-zone) endpoints.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAnAccountCreateAnIpAccessRuleTest() throws Exception {
        AccessRulesRulesBody body = null;
        CloudflareClientAPIAccountIdentifier accountIdentifier = null;
        ResponseSingle response = api.ipAccessRulesForAnAccountCreateAnIpAccessRule(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Delete an IP Access rule
     *
     * Deletes an existing IP Access rule defined at the account level.  Note: This operation will affect all zones in the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAnAccountDeleteAnIpAccessRuleTest() throws Exception {
        CloudflareClientAPISchemasIdentifier identifier = null;
        CloudflareClientAPIAccountIdentifier accountIdentifier = null;
        CloudflareClientAPIApiResponseSingleId response = api.ipAccessRulesForAnAccountDeleteAnIpAccessRule(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get an IP Access rule
     *
     * Fetches the details of an IP Access rule defined at the account level.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAnAccountGetAnIpAccessRuleTest() throws Exception {
        CloudflareClientAPISchemasIdentifier identifier = null;
        CloudflareClientAPIAccountIdentifier accountIdentifier = null;
        ResponseSingle response = api.ipAccessRulesForAnAccountGetAnIpAccessRule(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List IP Access rules
     *
     * Fetches IP Access rules of an account. These rules apply to all the zones in the account. You can filter the results using several optional parameters.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAnAccountListIpAccessRulesTest() throws Exception {
        CloudflareClientAPIAccountIdentifier accountIdentifier = null;
        CloudflareClientAPIResponseCollection response = api.ipAccessRulesForAnAccountListIpAccessRules(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update an IP Access rule
     *
     * Updates an IP Access rule defined at the account level.  Note: This operation will affect all zones in the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAccessRulesForAnAccountUpdateAnIpAccessRuleTest() throws Exception {
        SchemasRule body = null;
        CloudflareClientAPISchemasIdentifier identifier = null;
        CloudflareClientAPIAccountIdentifier accountIdentifier = null;
        ResponseSingle response = api.ipAccessRulesForAnAccountUpdateAnIpAccessRule(body, identifier, accountIdentifier);

        // TODO: test validations
    }
}
