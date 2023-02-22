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

import io.swagger.client.model.InlineResponse20060;
import io.swagger.client.model.InlineResponse20061;
import io.swagger.client.model.InlineResponse20062;
import io.swagger.client.model.InlineResponse20063;
import io.swagger.client.model.InlineResponse20064;
import io.swagger.client.model.InlineResponse404;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RadarEntitiesApi
 */
@Ignore
public class RadarEntitiesApiTest {

    private final RadarEntitiesApi api = new RadarEntitiesApi();

    /**
     * Get autonomous system information by AS number
     *
     * Get the requested autonomous system information. A confidence level below &#x60;5&#x60; indicates a low level of confidence in the traffic data - normally this happens because Cloudflare has a small amount of traffic from/to this AS). Population estimates come from APNIC (refer to https://labs.apnic.net/?p&#x3D;526).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetASNIdTest() throws Exception {
        Integer asn = null;
        String format = null;
        InlineResponse20062 response = api.radarGetASNId(asn, format);

        // TODO: test validations
    }
    /**
     * Get autonomous system information by IP address
     *
     * Get the requested autonomous system information based on IP address. Population estimates come from APNIC (refer to https://labs.apnic.net/?p&#x3D;526).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetASNIpTest() throws Exception {
        String ip = null;
        String format = null;
        InlineResponse20061 response = api.radarGetASNIp(ip, format);

        // TODO: test validations
    }
    /**
     * Get autonomous systems
     *
     * Gets a list of autonomous systems (AS).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetASNsListTest() throws Exception {
        Integer limit = null;
        Integer offset = null;
        String asn = null;
        String format = null;
        InlineResponse20060 response = api.radarGetASNsList(limit, offset, asn, format);

        // TODO: test validations
    }
    /**
     * Get locations
     *
     * Get a list of locations.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetLocationsListTest() throws Exception {
        Integer limit = null;
        Integer offset = null;
        String location = null;
        String format = null;
        InlineResponse20063 response = api.radarGetLocationsList(limit, offset, location, format);

        // TODO: test validations
    }
    /**
     * Get location
     *
     * Get the requested location information. A confidence level below &#x60;5&#x60; indicates a low level of confidence in the traffic data - normally this happens because Cloudflare has a small amount of traffic from/to this location).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetLocationsOneTest() throws Exception {
        String location = null;
        String format = null;
        InlineResponse20064 response = api.radarGetLocationsOne(location, format);

        // TODO: test validations
    }
}
