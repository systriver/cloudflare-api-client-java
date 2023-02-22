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

import io.swagger.client.model.InlineResponse200162;
import io.swagger.client.model.InlineResponse200163;
import io.swagger.client.model.InlineResponse4xx518;
import io.swagger.client.model.InlineResponse4xx519;
import io.swagger.client.model.ZoneIdManagedHeadersBody;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ManagedTransformsApi
 */
@Ignore
public class ManagedTransformsApiTest {

    private final ManagedTransformsApi api = new ManagedTransformsApi();

    /**
     * List Managed Transforms
     *
     * Fetches a list of all Managed Transforms.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void managedTransformsListManagedTransformsTest() throws Exception {
        String zoneId = null;
        InlineResponse200162 response = api.managedTransformsListManagedTransforms(zoneId);

        // TODO: test validations
    }
    /**
     * Update status of Managed Transforms
     *
     * Updates the status of one or more Managed Transforms.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void managedTransformsUpdateStatusOfManagedTransformsTest() throws Exception {
        ZoneIdManagedHeadersBody body = null;
        String zoneId = null;
        InlineResponse200163 response = api.managedTransformsUpdateStatusOfManagedTransforms(body, zoneId);

        // TODO: test validations
    }
}
