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

import io.swagger.client.model.InlineResponse20033;
import io.swagger.client.model.InlineResponse20034;
import io.swagger.client.model.InlineResponse20035;
import io.swagger.client.model.InlineResponse20036;
import io.swagger.client.model.InlineResponse20037;
import io.swagger.client.model.InlineResponse20038;
import io.swagger.client.model.InlineResponse20039;
import io.swagger.client.model.InlineResponse20040;
import io.swagger.client.model.InlineResponse20041;
import io.swagger.client.model.InlineResponse20042;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RadarAttacksApi
 */
@Ignore
public class RadarAttacksApiTest {

    private final RadarAttacksApi api = new RadarAttacksApi();

    /**
     * Get a summary of layer 3 attacks
     *
     * Percentage distribution of network protocols in layer 3/4 attacks.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAttacksLayer3SummaryTest() throws Exception {
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20033 response = api.radarGetAttacksLayer3Summary(name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get layer 3 attacks time series
     *
     * Get layer 3/4 attacks change over time. Values are normalized using min-max by default, with the minimum set to 0. When asking for multiple time series, you can also get the percentual relative change of the 1st/main series, with respect to the 2nd/control series - for example, to get the relative change of this week from the previous week, the 1st series would have a date range of 7d, the 2nd, a date range of 7dControl, and the normalization would be set to PERCENTAGE_CHANGE.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAttacksLayer3TimeseriesTest() throws Exception {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> attack = null;
        List<String> asn = null;
        List<String> location = null;
        String normalization = null;
        String format = null;
        InlineResponse20034 response = api.radarGetAttacksLayer3Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, attack, asn, location, normalization, format);

        // TODO: test validations
    }
    /**
     * Get layer 3 attacks by network protocol, over time
     *
     * Get percentage of what type of network protocols are used in layer 3/4 attacks, over time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAttacksLayer3TimeseriesGroupsTest() throws Exception {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20035 response = api.radarGetAttacksLayer3TimeseriesGroups(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get a summary of layer 7 attacks
     *
     * Percentage distribution of mitigation techniques in layer 7 attacks.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAttacksLayer7SummaryTest() throws Exception {
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20036 response = api.radarGetAttacksLayer7Summary(name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get attacks layer 7 time series
     *
     * Get layer 7 attacks change over time. Values are normalized using min-max by default, with the minimum set to 0. When asking for multiple time series, you can also get the percentage relative change of the first/main series, with respect to the second/control series - for example, to get the relative change of this week from the previous week, the first series would have a date range of &#x60;7d&#x60;, the second, a date range of &#x60;7dControl&#x60;, and the normalization would be set to &#x60;PERCENTAGE_CHANGE&#x60;.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAttacksLayer7TimeseriesTest() throws Exception {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> attack = null;
        List<String> asn = null;
        List<String> location = null;
        String normalization = null;
        String format = null;
        InlineResponse20037 response = api.radarGetAttacksLayer7Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, attack, asn, location, normalization, format);

        // TODO: test validations
    }
    /**
     * Get layer 7 attacks by mitigation technique, over time
     *
     * Get percentage of what type of mitigation techniques are used to block layer 7 attacks, over time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAttacksLayer7TimeseriesGroupsTest() throws Exception {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20038 response = api.radarGetAttacksLayer7TimeseriesGroups(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get layer 7 top attack pairs (origin and target locations)
     *
     * Get the top attacks from origin to target location. Values are a percentage out of the total layer 7 attacks (with billing country). The attack magnitude can be defined by the number of mitigated requests or by the number of zones affected. You can optionally limit the number of attacks per origin/target location (useful if all the top attacks are from or to the same location).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAttacksLayer7TopAttacksTest() throws Exception {
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> location = null;
        String magnitude = null;
        String limitDirection = null;
        Integer limitPerLocation = null;
        String format = null;
        InlineResponse20040 response = api.radarGetAttacksLayer7TopAttacks(limit, name, dateRange, dateStart, dateEnd, location, magnitude, limitDirection, limitPerLocation, format);

        // TODO: test validations
    }
    /**
     * Get layer 7 top origin ASes
     *
     * Get the top origin ASes by layer 7 attacks. Values are a percentage out of the total layer 7 attacks. The origin location is determined by the client IP.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAttacksLayer7TopOriginASesTest() throws Exception {
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> location = null;
        String format = null;
        InlineResponse20039 response = api.radarGetAttacksLayer7TopOriginASes(limit, name, dateRange, dateStart, dateEnd, location, format);

        // TODO: test validations
    }
    /**
     * Get layer 7 top origin locations
     *
     * Get the top origin locations of and by layer 7 attacks. Values are a percentage out of the total layer 7 attacks. The origin location is determined by the client IP.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAttacksLayer7TopOriginLocationsTest() throws Exception {
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        String format = null;
        InlineResponse20041 response = api.radarGetAttacksLayer7TopOriginLocations(limit, name, dateRange, dateStart, dateEnd, asn, format);

        // TODO: test validations
    }
    /**
     * Get layer 7 top target locations
     *
     * Get the top target locations of and by layer 7 attacks. Values are a percentage out of the total layer 7 attacks. The target location is determined by the attacked zone&#x27;s billing country, when available.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAttacksLayer7TopTargetLocationsTest() throws Exception {
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        String format = null;
        InlineResponse20042 response = api.radarGetAttacksLayer7TopTargetLocations(limit, name, dateRange, dateStart, dateEnd, format);

        // TODO: test validations
    }
}