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

import io.swagger.client.model.ApiResponseSingle;
import io.swagger.client.model.InlineResponse4xx33;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SpectrumAnalyticsSummaryApi
 */
@Ignore
public class SpectrumAnalyticsSummaryApiTest {

    private final SpectrumAnalyticsSummaryApi api = new SpectrumAnalyticsSummaryApi();

    /**
     * Get analytics summary
     *
     * Retrieves a list of summarised aggregate metrics over a given time period.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void spectrumAnalyticsSummaryGetAnalyticsSummaryTest() throws Exception {
        String zone = null;
        ApiResponseSingle response = api.spectrumAnalyticsSummaryGetAnalyticsSummary(zone);

        // TODO: test validations
    }
}