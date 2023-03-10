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

import io.swagger.client.model.CollectionMembershipResponse;
import io.swagger.client.model.InlineResponse20027;
import io.swagger.client.model.InlineResponse4xx306;
import io.swagger.client.model.InlineResponse4xx307;
import io.swagger.client.model.InlineResponse4xx308;
import io.swagger.client.model.MembershipsIdentifierBody;
import io.swagger.client.model.SingleMembershipResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UsersAccountMembershipsApi
 */
@Ignore
public class UsersAccountMembershipsApiTest {

    private final UsersAccountMembershipsApi api = new UsersAccountMembershipsApi();

    /**
     * Delete Membership
     *
     * Remove the associated member from an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userSAccountMembershipsDeleteMembershipTest() throws Exception {
        String identifier = null;
        InlineResponse20027 response = api.userSAccountMembershipsDeleteMembership(identifier);

        // TODO: test validations
    }
    /**
     * List Memberships
     *
     * List memberships of accounts the user can access.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userSAccountMembershipsListMembershipsTest() throws Exception {
        CollectionMembershipResponse response = api.userSAccountMembershipsListMemberships();

        // TODO: test validations
    }
    /**
     * Membership Details
     *
     * Get a specific membership.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userSAccountMembershipsMembershipDetailsTest() throws Exception {
        String identifier = null;
        SingleMembershipResponse response = api.userSAccountMembershipsMembershipDetails(identifier);

        // TODO: test validations
    }
    /**
     * Update Membership
     *
     * Accept or reject this account invitation.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void userSAccountMembershipsUpdateMembershipTest() throws Exception {
        MembershipsIdentifierBody body = null;
        String identifier = null;
        SingleMembershipResponse response = api.userSAccountMembershipsUpdateMembership(body, identifier);

        // TODO: test validations
    }
}
