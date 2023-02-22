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

import io.swagger.client.model.InlineResponse20037;
import io.swagger.client.model.InlineResponse20081;
import io.swagger.client.model.InlineResponse20082;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RadarNetflowsApi
 */
@Ignore
public class RadarNetflowsApiTest {

    private final RadarNetflowsApi api = new RadarNetflowsApi();

    /**
     * Get top autonomous systems
     *
     * Get the top autonomous systems (AS) by network traffic. Values are a percentage out of the total network traffic.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetNetflowsTopASesTest() throws Exception {
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20081 response = api.radarGetNetflowsTopASes(limit, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get top locations
     *
     * Get the top locations by network traffic. Values are a percentage out of the total network traffic.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetNetflowsTopLocationsTest() throws Exception {
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20082 response = api.radarGetNetflowsTopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get NetFlow time series
     *
     * Get network traffic change over time. Values are normalized using min-max by default, with the minimum set to 0. When asking for multiple time series, you can also get the percentage relative change of the first/main series, with respect to the second/control series - for example, to get the relative change of this week from the previous week, the first series would have a date range of &#x60;7d&#x60;, the second, a date range of &#x60;7dControl&#x60;, and the normalization would be set to &#x60;PERCENTAGE_CHANGE&#x60;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetTimeseriesTest() throws Exception {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> product = null;
        List<String> asn = null;
        List<String> location = null;
        String normalization = null;
        String format = null;
        InlineResponse20037 response = api.radarGetTimeseries(aggInterval, name, dateRange, dateStart, dateEnd, product, asn, location, normalization, format);

        // TODO: test validations
    }
}