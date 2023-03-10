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

import io.swagger.client.model.CollectionRoleResponse;
import io.swagger.client.model.InlineResponse4xx317;
import io.swagger.client.model.InlineResponse4xx318;
import io.swagger.client.model.SingleRoleResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OrganizationRolesApi
 */
@Ignore
public class OrganizationRolesApiTest {

    private final OrganizationRolesApi api = new OrganizationRolesApi();

    /**
     * List Roles
     *
     * Get all available roles for an organization.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void organizationRolesListRolesTest() throws Exception {
        String organizationIdentifier = null;
        CollectionRoleResponse response = api.organizationRolesListRoles(organizationIdentifier);

        // TODO: test validations
    }
    /**
     * Role Details
     *
     * Get information about a specific role for an organization.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void organizationRolesRoleDetailsTest() throws Exception {
        String identifier = null;
        String organizationIdentifier = null;
        SingleRoleResponse response = api.organizationRolesRoleDetails(identifier, organizationIdentifier);

        // TODO: test validations
    }
}
