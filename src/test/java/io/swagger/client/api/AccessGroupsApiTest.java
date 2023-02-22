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

import io.swagger.client.model.AccessGroupsBody;
import io.swagger.client.model.GroupsComponentsSchemasIdResponse;
import io.swagger.client.model.GroupsComponentsSchemasResponseCollection;
import io.swagger.client.model.GroupsComponentsSchemasSingleResponse;
import io.swagger.client.model.GroupsUuidBody;
import io.swagger.client.model.InlineResponse4xx237;
import io.swagger.client.model.InlineResponse4xx238;
import io.swagger.client.model.InlineResponse4xx239;
import io.swagger.client.model.SchemasUuid;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccessGroupsApi
 */
@Ignore
public class AccessGroupsApiTest {

    private final AccessGroupsApi api = new AccessGroupsApi();

    /**
     * Create an Access group
     *
     * Creates a new Access group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessGroupsCreateAnAccessGroupTest() throws Exception {
        AccessGroupsBody body = null;
        String identifier = null;
        GroupsComponentsSchemasSingleResponse response = api.accessGroupsCreateAnAccessGroup(body, identifier);

        // TODO: test validations
    }
    /**
     * Delete an Access group
     *
     * Deletes an Access group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessGroupsDeleteAnAccessGroupTest() throws Exception {
        SchemasUuid uuid = null;
        String identifier = null;
        GroupsComponentsSchemasIdResponse response = api.accessGroupsDeleteAnAccessGroup(uuid, identifier);

        // TODO: test validations
    }
    /**
     * Get an Access group
     *
     * Fetches a single Access group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessGroupsGetAnAccessGroupTest() throws Exception {
        SchemasUuid uuid = null;
        String identifier = null;
        GroupsComponentsSchemasSingleResponse response = api.accessGroupsGetAnAccessGroup(uuid, identifier);

        // TODO: test validations
    }
    /**
     * List Access groups
     *
     * Lists all Access groups.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessGroupsListAccessGroupsTest() throws Exception {
        String identifier = null;
        GroupsComponentsSchemasResponseCollection response = api.accessGroupsListAccessGroups(identifier);

        // TODO: test validations
    }
    /**
     * Update an Access group
     *
     * Updates a configured Access group.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void accessGroupsUpdateAnAccessGroupTest() throws Exception {
        GroupsUuidBody body = null;
        SchemasUuid uuid = null;
        String identifier = null;
        GroupsComponentsSchemasSingleResponse response = api.accessGroupsUpdateAnAccessGroup(body, uuid, identifier);

        // TODO: test validations
    }
}