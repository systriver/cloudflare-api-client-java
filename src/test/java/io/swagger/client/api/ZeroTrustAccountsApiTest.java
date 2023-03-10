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

import io.swagger.client.model.AccountsComponentsSchemasIdentifier;
import io.swagger.client.model.GatewayAccount;
import io.swagger.client.model.GatewayAccountConfig;
import io.swagger.client.model.GatewayAccountDeviceSettings;
import io.swagger.client.model.GatewayAccountDeviceSettingsResponse;
import io.swagger.client.model.GatewayAccountLoggingSettings;
import io.swagger.client.model.GatewayAccountLoggingSettingsResponse;
import io.swagger.client.model.GatewayAccountSettings;
import io.swagger.client.model.IdentifierGatewayBody;
import io.swagger.client.model.InlineResponse4xx281;
import io.swagger.client.model.InlineResponse4xx284;
import io.swagger.client.model.InlineResponse4xx286;
import io.swagger.client.model.InlineResponse4xx295;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ZeroTrustAccountsApi
 */
@Ignore
public class ZeroTrustAccountsApiTest {

    private final ZeroTrustAccountsApi api = new ZeroTrustAccountsApi();

    /**
     * Create Zero Trust account
     *
     * Create Zero Trust account with existing cloudflare account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zeroTrustAccountsCreateZeroTrustAccountTest() throws Exception {
        IdentifierGatewayBody body = null;
        AccountsComponentsSchemasIdentifier identifier = null;
        GatewayAccount response = api.zeroTrustAccountsCreateZeroTrustAccount(body, identifier);

        // TODO: test validations
    }
    /**
     * Get device settings for Zero Trust account
     *
     * Describes the current device settings Zero Trust account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zeroTrustAccountsGetDeviceSettingsForZeroTrustAccountTest() throws Exception {
        AccountsComponentsSchemasIdentifier identifier = null;
        GatewayAccountDeviceSettingsResponse response = api.zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount(identifier);

        // TODO: test validations
    }
    /**
     * Get logging settings for the Zero Trust account
     *
     * Describes the current logging settings for Zero Trust account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccountTest() throws Exception {
        AccountsComponentsSchemasIdentifier identifier = null;
        GatewayAccountLoggingSettingsResponse response = api.zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount(identifier);

        // TODO: test validations
    }
    /**
     * Get Zero Trust account configuration
     *
     * Describes current Zero Trust account configuration.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zeroTrustAccountsGetZeroTrustAccountConfigurationTest() throws Exception {
        AccountsComponentsSchemasIdentifier identifier = null;
        GatewayAccountConfig response = api.zeroTrustAccountsGetZeroTrustAccountConfiguration(identifier);

        // TODO: test validations
    }
    /**
     * Get Zero Trust account information
     *
     * Get Zero Trust account information.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zeroTrustAccountsGetZeroTrustAccountInformationTest() throws Exception {
        AccountsComponentsSchemasIdentifier identifier = null;
        GatewayAccount response = api.zeroTrustAccountsGetZeroTrustAccountInformation(identifier);

        // TODO: test validations
    }
    /**
     * Update device settings for the Zero Trust account
     *
     * Updates the current device settings for Zero Trust account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccountTest() throws Exception {
        GatewayAccountDeviceSettings body = null;
        AccountsComponentsSchemasIdentifier identifier = null;
        GatewayAccountDeviceSettingsResponse response = api.zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount(body, identifier);

        // TODO: test validations
    }
    /**
     * Update logging settings for the Zero Trust account
     *
     * Updates the current logging settings for the Zero Trust accounty.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccountTest() throws Exception {
        GatewayAccountLoggingSettings body = null;
        AccountsComponentsSchemasIdentifier identifier = null;
        GatewayAccountLoggingSettingsResponse response = api.zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount(body, identifier);

        // TODO: test validations
    }
    /**
     * Update Zero Trust account configuration
     *
     * Updates the current Zero Trust account configuration.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zeroTrustAccountsUpdateZeroTrustAccountConfigurationTest() throws Exception {
        GatewayAccountSettings body = null;
        AccountsComponentsSchemasIdentifier identifier = null;
        GatewayAccountConfig response = api.zeroTrustAccountsUpdateZeroTrustAccountConfiguration(body, identifier);

        // TODO: test validations
    }
}
