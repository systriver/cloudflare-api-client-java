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

import io.swagger.client.model.AccessIdentityProvidersBody1;
import io.swagger.client.model.CloudflareClientAPIIdentityProvidersComponentsSchemasResponseCollection;
import io.swagger.client.model.CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse;
import io.swagger.client.model.IdentityProvidersComponentsSchemasIdentifier;
import io.swagger.client.model.IdentityProvidersUuidBody1;
import io.swagger.client.model.InlineResponse4xx240;
import io.swagger.client.model.InlineResponse4xx241;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ZoneLevelAccessIdentityProvidersApi
 */
@Ignore
public class ZoneLevelAccessIdentityProvidersApiTest {

    private final ZoneLevelAccessIdentityProvidersApi api = new ZoneLevelAccessIdentityProvidersApi();

    /**
     * Add an Access identity provider
     *
     * Adds a new identity provider to Access.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zoneLevelAccessIdentityProvidersAddAnAccessIdentityProviderTest() throws Exception {
        AccessIdentityProvidersBody1 body = null;
        IdentityProvidersComponentsSchemasIdentifier identifier = null;
        CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse response = api.zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider(body, identifier);

        // TODO: test validations
    }
    /**
     * Delete an Access identity provider
     *
     * Deletes an identity provider from Access.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProviderTest() throws Exception {
        String uuid = null;
        IdentityProvidersComponentsSchemasIdentifier identifier = null;
        CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse response = api.zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider(uuid, identifier);

        // TODO: test validations
    }
    /**
     * Get an Access identity provider
     *
     * Fetches a configured identity provider.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zoneLevelAccessIdentityProvidersGetAnAccessIdentityProviderTest() throws Exception {
        String uuid = null;
        IdentityProvidersComponentsSchemasIdentifier identifier = null;
        CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse response = api.zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider(uuid, identifier);

        // TODO: test validations
    }
    /**
     * List Access identity providers
     *
     * Lists all configured identity providers.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zoneLevelAccessIdentityProvidersListAccessIdentityProvidersTest() throws Exception {
        IdentityProvidersComponentsSchemasIdentifier identifier = null;
        CloudflareClientAPIIdentityProvidersComponentsSchemasResponseCollection response = api.zoneLevelAccessIdentityProvidersListAccessIdentityProviders(identifier);

        // TODO: test validations
    }
    /**
     * Update an Access identity provider
     *
     * Updates a configured identity provider.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProviderTest() throws Exception {
        IdentityProvidersUuidBody1 body = null;
        String uuid = null;
        IdentityProvidersComponentsSchemasIdentifier identifier = null;
        CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse response = api.zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider(body, uuid, identifier);

        // TODO: test validations
    }
}
