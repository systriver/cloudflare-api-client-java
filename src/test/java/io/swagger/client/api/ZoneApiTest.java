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

import io.swagger.client.model.CloudflareClientAPIApiResponseSingleId;
import io.swagger.client.model.CloudflareClientAPIComponentsSchemasResponseCollection;
import io.swagger.client.model.CloudflareClientAPISchemasIdentifier;
import io.swagger.client.model.ComponentsSchemasResponseSingle;
import io.swagger.client.model.InlineResponse4xx337;
import io.swagger.client.model.InlineResponse4xx338;
import io.swagger.client.model.InlineResponse4xx44;
import io.swagger.client.model.PurgeByCacheTagsOrHostsOrPrefixes;
import io.swagger.client.model.SchemasCreate;
import io.swagger.client.model.ZoneComponentsSchemasPatch;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ZoneApi
 */
@Ignore
public class ZoneApiTest {

    private final ZoneApi api = new ZoneApi();

    /**
     * Create Zone
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zoneCreateZoneTest() throws Exception {
        SchemasCreate body = null;
        ComponentsSchemasResponseSingle response = api.zoneCreateZone(body);

        // TODO: test validations
    }
    /**
     * Delete Zone
     *
     * Deletes an existing zone.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zoneDeleteZoneTest() throws Exception {
        CloudflareClientAPISchemasIdentifier identifier = null;
        CloudflareClientAPIApiResponseSingleId response = api.zoneDeleteZone(identifier);

        // TODO: test validations
    }
    /**
     * Edit Zone
     *
     * Editz a zone. Only one zone property can be changed at a time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zoneEditZoneTest() throws Exception {
        ZoneComponentsSchemasPatch body = null;
        CloudflareClientAPISchemasIdentifier identifier = null;
        ComponentsSchemasResponseSingle response = api.zoneEditZone(body, identifier);

        // TODO: test validations
    }
    /**
     * List Zones
     *
     * Lists, searches, sorts, and filters your zones.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zoneListZonesTest() throws Exception {
        CloudflareClientAPIComponentsSchemasResponseCollection response = api.zoneListZones();

        // TODO: test validations
    }
    /**
     * Purge Files by Cache-Tags, Host, or Prefix
     *
     * Granularly removes one or more files from Cloudflare&#x27;s cache either by specifying the host, the associated Cache-Tag, or a Prefix.  **NB:** Cache-Tag, host, and prefix purging each have a rate limit of 30,000 purge API calls in every 24 hour period. You may purge up to 30 tags, hosts, or prefixes in one API call. This rate limit can be raised for customers who need to purge at higher volume.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zonePurgeFilesByCacheTagsHostOrPrefixTest() throws Exception {
        PurgeByCacheTagsOrHostsOrPrefixes body = null;
        CloudflareClientAPISchemasIdentifier identifier = null;
        CloudflareClientAPIApiResponseSingleId response = api.zonePurgeFilesByCacheTagsHostOrPrefix(body, identifier);

        // TODO: test validations
    }
    /**
     * Zone Activation Check
     *
     * Initiates another zone activation check.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zoneZoneActivationCheckTest() throws Exception {
        CloudflareClientAPISchemasIdentifier identifier = null;
        CloudflareClientAPIApiResponseSingleId response = api.zoneZoneActivationCheck(identifier);

        // TODO: test validations
    }
    /**
     * Zone Details
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void zoneZoneDetailsTest() throws Exception {
        CloudflareClientAPISchemasIdentifier identifier = null;
        ComponentsSchemasResponseSingle response = api.zoneZoneDetails(identifier);

        // TODO: test validations
    }
}
