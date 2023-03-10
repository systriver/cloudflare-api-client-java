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

import io.swagger.client.model.AccountIdentifierRailgunsBody;
import io.swagger.client.model.InlineResponse4xx130;
import io.swagger.client.model.InlineResponse4xx131;
import io.swagger.client.model.InlineResponse4xx132;
import io.swagger.client.model.RailgunResponseCollection;
import io.swagger.client.model.RailgunResponseSingle;
import io.swagger.client.model.RailgunResponseSingleId;
import io.swagger.client.model.SchemasRailgun;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccountRailgunsApi
 */
@Ignore
public class AccountRailgunsApiTest {

    private final AccountRailgunsApi api = new AccountRailgunsApi();

    /**
     * Create Railgun
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountRailgunsCreateRailgunTest() throws Exception {
        AccountIdentifierRailgunsBody body = null;
        String accountIdentifier = null;
        RailgunResponseSingle response = api.accountRailgunsCreateRailgun(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Delete a Railgun
     *
     * Disable and delete a Railgun. This will immediately disable the Railgun for any connected zones.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountRailgunsDeleteARailgunTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        RailgunResponseSingleId response = api.accountRailgunsDeleteARailgun(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List Railguns
     *
     * List, search, sort and filter your Railguns.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountRailgunsListRailgunsTest() throws Exception {
        String accountIdentifier = null;
        RailgunResponseCollection response = api.accountRailgunsListRailguns(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Railgun details
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountRailgunsRailgunDetailsTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        RailgunResponseSingle response = api.accountRailgunsRailgunDetails(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update Railgun
     *
     * Update a Railgun.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountRailgunsUpdateRailgunTest() throws Exception {
        SchemasRailgun body = null;
        String identifier = null;
        String accountIdentifier = null;
        RailgunResponseSingle response = api.accountRailgunsUpdateRailgun(body, identifier, accountIdentifier);

        // TODO: test validations
    }
}
