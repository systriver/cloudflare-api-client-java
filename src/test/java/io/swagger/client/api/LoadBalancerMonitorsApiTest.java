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

import io.swagger.client.model.IdentifierPreviewBody2;
import io.swagger.client.model.InlineResponse4xx325;
import io.swagger.client.model.InlineResponse4xx326;
import io.swagger.client.model.InlineResponse4xx65;
import io.swagger.client.model.InlineResponse4xx66;
import io.swagger.client.model.InlineResponse4xx67;
import io.swagger.client.model.InlineResponse4xx73;
import io.swagger.client.model.LoadBalancersMonitorsBody1;
import io.swagger.client.model.MonitorComponentsSchemasIdResponse;
import io.swagger.client.model.MonitorComponentsSchemasIdentifier;
import io.swagger.client.model.MonitorComponentsSchemasResponseCollection;
import io.swagger.client.model.MonitorComponentsSchemasSingleResponse;
import io.swagger.client.model.MonitorsIdentifierBody2;
import io.swagger.client.model.MonitorsIdentifierBody3;
import io.swagger.client.model.PreviewId;
import io.swagger.client.model.PreviewResponse;
import io.swagger.client.model.PreviewResultResponse;
import io.swagger.client.model.ReferencesResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for LoadBalancerMonitorsApi
 */
@Ignore
public class LoadBalancerMonitorsApiTest {

    private final LoadBalancerMonitorsApi api = new LoadBalancerMonitorsApi();

    /**
     * Create Monitor
     *
     * Create a configured monitor.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loadBalancerMonitorsCreateMonitorTest() throws Exception {
        LoadBalancersMonitorsBody1 body = null;
        MonitorComponentsSchemasSingleResponse response = api.loadBalancerMonitorsCreateMonitor(body);

        // TODO: test validations
    }
    /**
     * Delete Monitor
     *
     * Delete a configured monitor.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loadBalancerMonitorsDeleteMonitorTest() throws Exception {
        MonitorComponentsSchemasIdentifier identifier = null;
        MonitorComponentsSchemasIdResponse response = api.loadBalancerMonitorsDeleteMonitor(identifier);

        // TODO: test validations
    }
    /**
     * List Monitor References
     *
     * Get the list of resources that reference the provided monitor.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loadBalancerMonitorsListMonitorReferencesTest() throws Exception {
        MonitorComponentsSchemasIdentifier identifier = null;
        ReferencesResponse response = api.loadBalancerMonitorsListMonitorReferences(identifier);

        // TODO: test validations
    }
    /**
     * List Monitors
     *
     * List configured monitors for a user.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loadBalancerMonitorsListMonitorsTest() throws Exception {
        MonitorComponentsSchemasResponseCollection response = api.loadBalancerMonitorsListMonitors();

        // TODO: test validations
    }
    /**
     * Monitor Details
     *
     * List a single configured monitor for a user.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loadBalancerMonitorsMonitorDetailsTest() throws Exception {
        MonitorComponentsSchemasIdentifier identifier = null;
        MonitorComponentsSchemasSingleResponse response = api.loadBalancerMonitorsMonitorDetails(identifier);

        // TODO: test validations
    }
    /**
     * Patch Monitor
     *
     * Apply changes to an existing monitor, overwriting the supplied properties.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loadBalancerMonitorsPatchMonitorTest() throws Exception {
        MonitorsIdentifierBody3 body = null;
        MonitorComponentsSchemasIdentifier identifier = null;
        MonitorComponentsSchemasSingleResponse response = api.loadBalancerMonitorsPatchMonitor(body, identifier);

        // TODO: test validations
    }
    /**
     * Preview Monitor
     *
     * Preview pools using the specified monitor with provided monitor details. The returned preview_id can be used in the preview endpoint to retrieve the results.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loadBalancerMonitorsPreviewMonitorTest() throws Exception {
        IdentifierPreviewBody2 body = null;
        MonitorComponentsSchemasIdentifier identifier = null;
        PreviewResponse response = api.loadBalancerMonitorsPreviewMonitor(body, identifier);

        // TODO: test validations
    }
    /**
     * Preview Result
     *
     * Get the result of a previous preview operation using the provided preview_id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loadBalancerMonitorsPreviewResultTest() throws Exception {
        PreviewId previewId = null;
        PreviewResultResponse response = api.loadBalancerMonitorsPreviewResult(previewId);

        // TODO: test validations
    }
    /**
     * Update Monitor
     *
     * Modify a configured monitor.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void loadBalancerMonitorsUpdateMonitorTest() throws Exception {
        MonitorsIdentifierBody2 body = null;
        MonitorComponentsSchemasIdentifier identifier = null;
        MonitorComponentsSchemasSingleResponse response = api.loadBalancerMonitorsUpdateMonitor(body, identifier);

        // TODO: test validations
    }
}
