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

import io.swagger.client.model.AcnsResponseCollection;
import io.swagger.client.model.AcnsResponseSingle;
import io.swagger.client.model.AvailabilityResponse;
import io.swagger.client.model.CloudflareClientAPIEmptyResponse;
import io.swagger.client.model.CustomNSInput;
import io.swagger.client.model.InlineResponse4xx262;
import io.swagger.client.model.InlineResponse4xx263;
import io.swagger.client.model.InlineResponse4xx264;
import io.swagger.client.model.InlineResponse4xx265;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccountLevelCustomNameserversApi
 */
@Ignore
public class AccountLevelCustomNameserversApiTest {

    private final AccountLevelCustomNameserversApi api = new AccountLevelCustomNameserversApi();

    /**
     * Add Account Custom Nameserver
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountLevelCustomNameserversAddAccountCustomNameserverTest() throws Exception {
        CustomNSInput body = null;
        String identifier = null;
        AcnsResponseSingle response = api.accountLevelCustomNameserversAddAccountCustomNameserver(body, identifier);

        // TODO: test validations
    }
    /**
     * Delete Account Custom Nameserver
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountLevelCustomNameserversDeleteAccountCustomNameserverTest() throws Exception {
        String nsName = null;
        String identifier = null;
        CloudflareClientAPIEmptyResponse response = api.accountLevelCustomNameserversDeleteAccountCustomNameserver(nsName, identifier);

        // TODO: test validations
    }
    /**
     * Get Eligible Zones for Account Custom Nameservers
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameserversTest() throws Exception {
        String identifier = null;
        AvailabilityResponse response = api.accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers(identifier);

        // TODO: test validations
    }
    /**
     * List Account Custom Nameservers
     *
     * List an account&#x27;s custom nameservers.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountLevelCustomNameserversListAccountCustomNameserversTest() throws Exception {
        String identifier = null;
        AcnsResponseCollection response = api.accountLevelCustomNameserversListAccountCustomNameservers(identifier);

        // TODO: test validations
    }
    /**
     * Verify Account Custom Nameserver Glue Records
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecordsTest() throws Exception {
        String identifier = null;
        AcnsResponseCollection response = api.accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords(identifier);

        // TODO: test validations
    }
}
