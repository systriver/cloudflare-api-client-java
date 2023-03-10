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

import io.swagger.client.model.InlineResponse4xx185;
import io.swagger.client.model.InlineResponse4xx186;
import io.swagger.client.model.NetworkIpNetworkEncodedBody;
import io.swagger.client.model.NetworkIpNetworkEncodedBody1;
import io.swagger.client.model.NetworkIpNetworkEncodedBody2;
import io.swagger.client.model.RouteResponseCollection;
import io.swagger.client.model.RouteResponseSingle;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TunnelRouteApi
 */
@Ignore
public class TunnelRouteApiTest {

    private final TunnelRouteApi api = new TunnelRouteApi();

    /**
     * Create a tunnel route
     *
     * Routes a private network through a Cloudflare Tunnel. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void tunnelRouteCreateATunnelRouteTest() throws Exception {
        NetworkIpNetworkEncodedBody body = null;
        String ipNetworkEncoded = null;
        String accountIdentifier = null;
        RouteResponseSingle response = api.tunnelRouteCreateATunnelRoute(body, ipNetworkEncoded, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Delete a tunnel route
     *
     * Deletes a private network route from an account. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void tunnelRouteDeleteATunnelRouteTest() throws Exception {
        NetworkIpNetworkEncodedBody1 body = null;
        String ipNetworkEncoded = null;
        String accountIdentifier = null;
        RouteResponseSingle response = api.tunnelRouteDeleteATunnelRoute(body, ipNetworkEncoded, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get tunnel route by IP
     *
     * Fetches routes that contain the given IP address.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void tunnelRouteGetTunnelRouteByIpTest() throws Exception {
        String ip = null;
        String accountIdentifier = null;
        RouteResponseSingle response = api.tunnelRouteGetTunnelRouteByIp(ip, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List tunnel routes
     *
     * Lists and filters private network routes in an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void tunnelRouteListTunnelRoutesTest() throws Exception {
        String accountIdentifier = null;
        RouteResponseCollection response = api.tunnelRouteListTunnelRoutes(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update a tunnel route
     *
     * Updates an existing private network route in an account. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void tunnelRouteUpdateATunnelRouteTest() throws Exception {
        NetworkIpNetworkEncodedBody2 body = null;
        String ipNetworkEncoded = null;
        String accountIdentifier = null;
        RouteResponseSingle response = api.tunnelRouteUpdateATunnelRoute(body, ipNetworkEncoded, accountIdentifier);

        // TODO: test validations
    }
}
