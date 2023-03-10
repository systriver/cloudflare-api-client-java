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

import io.swagger.client.model.CloudflareClientAPIAccountIdentifier;
import io.swagger.client.model.CloudflareClientAPIApiResponseSingleId;
import io.swagger.client.model.CloudflareClientAPIResponseCollection;
import io.swagger.client.model.CloudflareClientAPISchemasIdentifier;
import io.swagger.client.model.Create;
import io.swagger.client.model.InlineResponse4xx;
import io.swagger.client.model.InlineResponse4xx43;
import io.swagger.client.model.InlineResponse4xx44;
import io.swagger.client.model.ResponseSingle;
import io.swagger.client.model.SchemasMember;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccountMembersApi
 */
@Ignore
public class AccountMembersApiTest {

    private final AccountMembersApi api = new AccountMembersApi();

    /**
     * Add Member
     *
     * Add a user to the list of members for this account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountMembersAddMemberTest() throws Exception {
        Create body = null;
        CloudflareClientAPIAccountIdentifier accountIdentifier = null;
        ResponseSingle response = api.accountMembersAddMember(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List Members
     *
     * List all members of an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountMembersListMembersTest() throws Exception {
        CloudflareClientAPIAccountIdentifier accountIdentifier = null;
        CloudflareClientAPIResponseCollection response = api.accountMembersListMembers(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Member Details
     *
     * Get information about a specific member of an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountMembersMemberDetailsTest() throws Exception {
        CloudflareClientAPISchemasIdentifier identifier = null;
        CloudflareClientAPIAccountIdentifier accountIdentifier = null;
        ResponseSingle response = api.accountMembersMemberDetails(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Remove Member
     *
     * Remove a member from an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountMembersRemoveMemberTest() throws Exception {
        CloudflareClientAPISchemasIdentifier identifier = null;
        CloudflareClientAPIAccountIdentifier accountIdentifier = null;
        CloudflareClientAPIApiResponseSingleId response = api.accountMembersRemoveMember(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update Member
     *
     * Modify an account member.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accountMembersUpdateMemberTest() throws Exception {
        SchemasMember body = null;
        CloudflareClientAPISchemasIdentifier identifier = null;
        CloudflareClientAPIAccountIdentifier accountIdentifier = null;
        ResponseSingle response = api.accountMembersUpdateMember(body, identifier, accountIdentifier);

        // TODO: test validations
    }
}
