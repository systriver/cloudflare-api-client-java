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

import io.swagger.client.model.AccessServiceTokensBody;
import io.swagger.client.model.CreateResponse;
import io.swagger.client.model.InlineResponse4xx247;
import io.swagger.client.model.InlineResponse4xx248;
import io.swagger.client.model.InlineResponse4xx249;
import io.swagger.client.model.ServiceTokensComponentsSchemasResponseCollection;
import io.swagger.client.model.ServiceTokensComponentsSchemasSingleResponse;
import io.swagger.client.model.ServiceTokensUuidBody;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccessServiceTokensApi
 */
@Ignore
public class AccessServiceTokensApiTest {

    private final AccessServiceTokensApi api = new AccessServiceTokensApi();

    /**
     * Create a service token
     *
     * Generates a new service token. **Note:** This is the only time you can get the Client Secret. If you lose the Client Secret, you will have to rotate the Client Secret or create a new service token.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessServiceTokensCreateAServiceTokenTest() throws Exception {
        AccessServiceTokensBody body = null;
        String identifier = null;
        CreateResponse response = api.accessServiceTokensCreateAServiceToken(body, identifier);

        // TODO: test validations
    }
    /**
     * Delete a service token
     *
     * Deletes a service token.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessServiceTokensDeleteAServiceTokenTest() throws Exception {
        String uuid = null;
        String identifier = null;
        ServiceTokensComponentsSchemasSingleResponse response = api.accessServiceTokensDeleteAServiceToken(uuid, identifier);

        // TODO: test validations
    }
    /**
     * List service tokens
     *
     * Lists all service tokens.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessServiceTokensListServiceTokensTest() throws Exception {
        String identifier = null;
        ServiceTokensComponentsSchemasResponseCollection response = api.accessServiceTokensListServiceTokens(identifier);

        // TODO: test validations
    }
    /**
     * Refresh a service token
     *
     * Refreshes the expiration of a service token.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessServiceTokensRefreshAServiceTokenTest() throws Exception {
        String uuid = null;
        String identifier = null;
        ServiceTokensComponentsSchemasSingleResponse response = api.accessServiceTokensRefreshAServiceToken(uuid, identifier);

        // TODO: test validations
    }
    /**
     * Rotate a service token
     *
     * Generates a new Client Secret for a service token and revokes the old one.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessServiceTokensRotateAServiceTokenTest() throws Exception {
        String uuid = null;
        String identifier = null;
        CreateResponse response = api.accessServiceTokensRotateAServiceToken(uuid, identifier);

        // TODO: test validations
    }
    /**
     * Update a service token
     *
     * Updates a configured service token.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessServiceTokensUpdateAServiceTokenTest() throws Exception {
        ServiceTokensUuidBody body = null;
        String uuid = null;
        String identifier = null;
        ServiceTokensComponentsSchemasSingleResponse response = api.accessServiceTokensUpdateAServiceToken(body, uuid, identifier);

        // TODO: test validations
    }
}