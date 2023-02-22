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

import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.InlineResponse4xx40;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DnsFirewallAnalyticsLegacyApi
 */
@Ignore
public class DnsFirewallAnalyticsLegacyApiTest {

    private final DnsFirewallAnalyticsLegacyApi api = new DnsFirewallAnalyticsLegacyApi();

    /**
     * By Time
     *
     * Retrieves a list of aggregate metrics grouped by time interval.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void dnsFirewallAnalyticsLegacyByTimeTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        InlineResponse2001 response = api.dnsFirewallAnalyticsLegacyByTime(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Table
     *
     * Retrieves a list of summarised aggregate metrics over a given time period.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void dnsFirewallAnalyticsLegacyTableTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        InlineResponse2001 response = api.dnsFirewallAnalyticsLegacyTable(identifier, accountIdentifier);

        // TODO: test validations
    }
}
