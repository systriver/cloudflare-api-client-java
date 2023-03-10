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
import io.swagger.client.model.InlineResponse20043;
import io.swagger.client.model.InlineResponse20044;
import io.swagger.client.model.InlineResponse20045;
import io.swagger.client.model.InlineResponse20046;
import io.swagger.client.model.InlineResponse404;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RadarAs112Api
 */
@Ignore
public class RadarAs112ApiTest {

    private final RadarAs112Api api = new RadarAs112Api();

    /**
     * Get a summary of DNSSEC
     *
     * Percentage distribution of dns requests classified per DNSSEC.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112DNSSECSummaryTest() throws Exception {
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20033 response = api.radarGetAS112DNSSECSummary(name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get a time series of DNSSEC
     *
     * Percentage distribution of dns requests classified per DNSSEC over time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112DNSSECTimeseriesGroupTest() throws Exception {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20040 response = api.radarGetAS112DNSSECTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get a summary of EDNS
     *
     * Percentage distribution of dns requests classified per EDNS.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112EDNSSummaryTest() throws Exception {
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20034 response = api.radarGetAS112EDNSSummary(name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get a time series of EDNS
     *
     * Percentage distribution of dns requests classified per EDNS over time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112EDNSTimeseriesGroupTest() throws Exception {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20041 response = api.radarGetAS112EDNSTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get a summary of IP Version
     *
     * Percentage distribution of dns requests classified per IP Version.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112IPVersionSummaryTest() throws Exception {
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20035 response = api.radarGetAS112IPVersionSummary(name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get a time series of IP Version
     *
     * Percentage distribution of dns requests classified per IP Version over time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112IPVersionTimeseriesGroupTest() throws Exception {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20042 response = api.radarGetAS112IPVersionTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get a summary of Protocol
     *
     * Percentage distribution of dns requests classified per Protocol.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112ProtocolSummaryTest() throws Exception {
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20036 response = api.radarGetAS112ProtocolSummary(name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get a time series of Protocol
     *
     * Percentage distribution of dns requests classified per Protocol over time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112ProtocolTimeseriesGroupTest() throws Exception {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20043 response = api.radarGetAS112ProtocolTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get a summary of Query Type
     *
     * Percentage distribution of dns requests classified per Query Type.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112QueryTypeSummaryTest() throws Exception {
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20037 response = api.radarGetAS112QueryTypeSummary(name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get a time series of Query Type
     *
     * Percentage distribution of dns requests classified per Query Type over time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112QueryTypeTimeseriesGroupTest() throws Exception {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20044 response = api.radarGetAS112QueryTypeTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get a summary of Response Codes
     *
     * Percentage distribution of dns requests classified per Response Codes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112ResponseCodesSummaryTest() throws Exception {
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20038 response = api.radarGetAS112ResponseCodesSummary(name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get a time series of Response Codes
     *
     * Percentage distribution of dns requests classified per Response Codes over time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112ResponseCodesTimeseriesGroupTest() throws Exception {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20045 response = api.radarGetAS112ResponseCodesTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get AS112 time series
     *
     * Get AS112 queries change over time.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112TimeseriesTest() throws Exception {
        String aggInterval = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20039 response = api.radarGetAS112Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get top autonomous systems by HTTP requests
     *
     * Get the top locations by HTTP traffic. Values are a percentage out of the total traffic.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112TopLocationsTest() throws Exception {
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20046 response = api.radarGetAS112TopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get top locations by DNSSEC validations
     *
     * Get the locations, by AS112 queries, of DNSSEC validations.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112TopLocationsByDnssecTest() throws Exception {
        String dnssec = null;
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20046 response = api.radarGetAS112TopLocationsByDnssec(dnssec, limit, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get top locations by EDNS validations
     *
     * Get the locations, by AS112 queries, of EDNS validations.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112TopLocationsByEdnsTest() throws Exception {
        String edns = null;
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20046 response = api.radarGetAS112TopLocationsByEdns(edns, limit, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
    /**
     * Get top locations by IP version
     *
     * Get the locations, by AS112 queries, of IP version.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void radarGetAS112TopLocationsByIpVersionTest() throws Exception {
        String ipVersion = null;
        Integer limit = null;
        List<String> name = null;
        List<String> dateRange = null;
        List<OffsetDateTime> dateStart = null;
        List<OffsetDateTime> dateEnd = null;
        List<String> asn = null;
        List<String> location = null;
        String format = null;
        InlineResponse20046 response = api.radarGetAS112TopLocationsByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, format);

        // TODO: test validations
    }
}
