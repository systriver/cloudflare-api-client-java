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

import io.swagger.client.model.CustomPagesComponentsSchemasIdentifier;
import io.swagger.client.model.CustomPagesIdentifierBody1;
import io.swagger.client.model.CustomPagesResponseCollection;
import io.swagger.client.model.CustomPagesResponseSingle;
import io.swagger.client.model.InlineResponse4xx23;
import io.swagger.client.model.InlineResponse4xx24;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CustomPagesForAZoneApi
 */
@Ignore
public class CustomPagesForAZoneApiTest {

    private final CustomPagesForAZoneApi api = new CustomPagesForAZoneApi();

    /**
     * Get a custom page
     *
     * Fetches the details of a custom page.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void customPagesForAZoneGetACustomPageTest() throws Exception {
        CustomPagesComponentsSchemasIdentifier identifier = null;
        String zoneIdentifier = null;
        CustomPagesResponseSingle response = api.customPagesForAZoneGetACustomPage(identifier, zoneIdentifier);

        // TODO: test validations
    }
    /**
     * List custom pages
     *
     * Fetches all the custom pages at the zone level.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void customPagesForAZoneListCustomPagesTest() throws Exception {
        String zoneIdentifier = null;
        CustomPagesResponseCollection response = api.customPagesForAZoneListCustomPages(zoneIdentifier);

        // TODO: test validations
    }
    /**
     * Update a custom page
     *
     * Updates the configuration of an existing custom page.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void customPagesForAZoneUpdateACustomPageTest() throws Exception {
        CustomPagesIdentifierBody1 body = null;
        CustomPagesComponentsSchemasIdentifier identifier = null;
        String zoneIdentifier = null;
        CustomPagesResponseSingle response = api.customPagesForAZoneUpdateACustomPage(body, identifier, zoneIdentifier);

        // TODO: test validations
    }
}