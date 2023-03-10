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

import io.swagger.client.model.InlineResponse20048;
import io.swagger.client.model.InlineResponse20049;
import io.swagger.client.model.InlineResponse404;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RadarDnsApi
 */
@Ignore
public class RadarDnsApiTest {

    private final RadarDnsApi api = new RadarDnsApi();

    /**
     * Get top autonomous systems by DNS queries.
     *
     * Get top autonomous systems by DNS queries made to Cloudflare&#x27;s public DNS resolver.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetDnsTopAsesTest() throws Exception {
        List<String> domain = null;
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20048 response = api.radarGetDnsTopAses(domain, limit, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get top locations by DNS queries
     *
     * Get top locations by DNS queries made to Cloudflare&#x27;s public DNS resolver.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetDnsTopLocationsTest() throws Exception {
        List<String> domain = null;
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20049 response = api.radarGetDnsTopLocations(domain, limit, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
}
