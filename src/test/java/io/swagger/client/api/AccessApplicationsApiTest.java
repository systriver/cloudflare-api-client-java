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

import io.swagger.client.model.AppsComponentsSchemasIdResponse;
import io.swagger.client.model.AppsComponentsSchemasIdentifier;
import io.swagger.client.model.AppsComponentsSchemasResponseCollection;
import io.swagger.client.model.AppsComponentsSchemasSingleResponse;
import io.swagger.client.model.ComponentsSchemasEmptyResponse;
import io.swagger.client.model.InlineResponse20025;
import io.swagger.client.model.InlineResponse4xx219;
import io.swagger.client.model.InlineResponse4xx220;
import io.swagger.client.model.InlineResponse4xx222;
import io.swagger.client.model.InlineResponse4xx223;
import io.swagger.client.model.InlineResponse4xx224;
import io.swagger.client.model.InlineResponse4xx225;
import io.swagger.client.model.PolicyCheckResponse;
import io.swagger.client.model.SchemasAppId;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccessApplicationsApi
 */
@Ignore
public class AccessApplicationsApiTest {

    private final AccessApplicationsApi api = new AccessApplicationsApi();

    /**
     * Add a Bookmark application
     *
     * Adds a custom link to the App Launcher. Bookmark applications are not protected by Access.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessApplicationsAddABookmarkApplicationTest() throws Exception {
        Object body = null;
        AppsComponentsSchemasIdentifier identifier = null;
        InlineResponse20025 response = api.accessApplicationsAddABookmarkApplication(body, identifier);

        // TODO: test validations
    }
    /**
     * Delete an Access application
     *
     * Deletes an application from Access.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessApplicationsDeleteAnAccessApplicationTest() throws Exception {
        SchemasAppId appId = null;
        AppsComponentsSchemasIdentifier identifier = null;
        AppsComponentsSchemasIdResponse response = api.accessApplicationsDeleteAnAccessApplication(appId, identifier);

        // TODO: test validations
    }
    /**
     * Get an Access application
     *
     * Fetches information about an Access application.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessApplicationsGetAnAccessApplicationTest() throws Exception {
        SchemasAppId appId = null;
        AppsComponentsSchemasIdentifier identifier = null;
        AppsComponentsSchemasSingleResponse response = api.accessApplicationsGetAnAccessApplication(appId, identifier);

        // TODO: test validations
    }
    /**
     * List Access applications
     *
     * Lists all Access applications in an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessApplicationsListAccessApplicationsTest() throws Exception {
        AppsComponentsSchemasIdentifier identifier = null;
        AppsComponentsSchemasResponseCollection response = api.accessApplicationsListAccessApplications(identifier);

        // TODO: test validations
    }
    /**
     * Revoke service tokens
     *
     * Revokes all service tokens used by an application.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessApplicationsRevokeServiceTokensTest() throws Exception {
        SchemasAppId appId = null;
        AppsComponentsSchemasIdentifier identifier = null;
        ComponentsSchemasEmptyResponse response = api.accessApplicationsRevokeServiceTokens(appId, identifier);

        // TODO: test validations
    }
    /**
     * Test Access policies
     *
     * Tests if a specific user has permission to access an application.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessApplicationsTestAccessPoliciesTest() throws Exception {
        SchemasAppId appId = null;
        AppsComponentsSchemasIdentifier identifier = null;
        PolicyCheckResponse response = api.accessApplicationsTestAccessPolicies(appId, identifier);

        // TODO: test validations
    }
    /**
     * Update a Bookmark application
     *
     * Updates a Bookmark application.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessApplicationsUpdateABookmarkApplicationTest() throws Exception {
        Object body = null;
        SchemasAppId appId = null;
        AppsComponentsSchemasIdentifier identifier = null;
        InlineResponse20025 response = api.accessApplicationsUpdateABookmarkApplication(body, appId, identifier);

        // TODO: test validations
    }
}