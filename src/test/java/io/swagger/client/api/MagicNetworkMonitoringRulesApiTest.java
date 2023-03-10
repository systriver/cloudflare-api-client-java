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

import io.swagger.client.model.InlineResponse4xx108;
import io.swagger.client.model.InlineResponse4xx109;
import io.swagger.client.model.InlineResponse4xx110;
import io.swagger.client.model.MnmRuleAdvertisementSingleResponse;
import io.swagger.client.model.MnmRulesCollectionResponse;
import io.swagger.client.model.MnmRulesSingleResponse;
import io.swagger.client.model.RulesComponentsSchemasAccountIdentifier;
import io.swagger.client.model.SchemasRuleIdentifier;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MagicNetworkMonitoringRulesApi
 */
@Ignore
public class MagicNetworkMonitoringRulesApiTest {

    private final MagicNetworkMonitoringRulesApi api = new MagicNetworkMonitoringRulesApi();

    /**
     * Create rules
     *
     * Create network monitoring rules for account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesCreateRulesTest() throws Exception {
        RulesComponentsSchemasAccountIdentifier accountIdentifier = null;
        MnmRulesSingleResponse response = api.magicNetworkMonitoringRulesCreateRules(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Delete rule
     *
     * Delete a network monitoring rule for account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesDeleteRuleTest() throws Exception {
        SchemasRuleIdentifier ruleIdentifier = null;
        RulesComponentsSchemasAccountIdentifier accountIdentifier = null;
        MnmRulesSingleResponse response = api.magicNetworkMonitoringRulesDeleteRule(ruleIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get rule
     *
     * List a single network monitoring rule for account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesGetRuleTest() throws Exception {
        SchemasRuleIdentifier ruleIdentifier = null;
        RulesComponentsSchemasAccountIdentifier accountIdentifier = null;
        MnmRulesSingleResponse response = api.magicNetworkMonitoringRulesGetRule(ruleIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List rules
     *
     * Lists network monitoring rules for account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesListRulesTest() throws Exception {
        RulesComponentsSchemasAccountIdentifier accountIdentifier = null;
        MnmRulesCollectionResponse response = api.magicNetworkMonitoringRulesListRules(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update advertisement for rule
     *
     * Update advertisement for rule.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesUpdateAdvertisementForRuleTest() throws Exception {
        SchemasRuleIdentifier ruleIdentifier = null;
        RulesComponentsSchemasAccountIdentifier accountIdentifier = null;
        MnmRuleAdvertisementSingleResponse response = api.magicNetworkMonitoringRulesUpdateAdvertisementForRule(ruleIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update rule
     *
     * Update a network monitoring rule for account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesUpdateRuleTest() throws Exception {
        SchemasRuleIdentifier ruleIdentifier = null;
        RulesComponentsSchemasAccountIdentifier accountIdentifier = null;
        MnmRulesSingleResponse response = api.magicNetworkMonitoringRulesUpdateRule(ruleIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update rules
     *
     * Update network monitoring rules for account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicNetworkMonitoringRulesUpdateRulesTest() throws Exception {
        RulesComponentsSchemasAccountIdentifier accountIdentifier = null;
        MnmRulesSingleResponse response = api.magicNetworkMonitoringRulesUpdateRules(accountIdentifier);

        // TODO: test validations
    }
}
