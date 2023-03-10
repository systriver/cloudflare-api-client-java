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

import io.swagger.client.model.CollectionOrganizationResponse;
import io.swagger.client.model.InlineResponse20092;
import io.swagger.client.model.InlineResponse4xx309;
import io.swagger.client.model.InlineResponse4xx328;
import io.swagger.client.model.InlineResponse4xx329;
import io.swagger.client.model.SingleOrganizationResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UsersOrganizationsApi
 */
@Ignore
public class UsersOrganizationsApiTest {

    private final UsersOrganizationsApi api = new UsersOrganizationsApi();

    /**
     * Leave Organization
     *
     * Removes association to an organization.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userSOrganizationsLeaveOrganizationTest() throws Exception {
        String identifier = null;
        InlineResponse20092 response = api.userSOrganizationsLeaveOrganization(identifier);

        // TODO: test validations
    }
    /**
     * List Organizations
     *
     * Lists organizations the user is associated with.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userSOrganizationsListOrganizationsTest() throws Exception {
        CollectionOrganizationResponse response = api.userSOrganizationsListOrganizations();

        // TODO: test validations
    }
    /**
     * Organization Details
     *
     * Gets a specific organization the user is associated with.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userSOrganizationsOrganizationDetailsTest() throws Exception {
        String identifier = null;
        SingleOrganizationResponse response = api.userSOrganizationsOrganizationDetails(identifier);

        // TODO: test validations
    }
}
