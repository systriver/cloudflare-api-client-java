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

import io.swagger.client.model.InlineResponse4xx90;
import io.swagger.client.model.InlineResponse4xx91;
import io.swagger.client.model.InlineResponse4xx92;
import io.swagger.client.model.InlineResponse4xx93;
import io.swagger.client.model.InlineResponse4xx94;
import io.swagger.client.model.ModifiedTunnelsCollectionResponse;
import io.swagger.client.model.TunnelDeletedResponse;
import io.swagger.client.model.TunnelModifiedResponse;
import io.swagger.client.model.TunnelSingleResponse;
import io.swagger.client.model.TunnelUpdateRequest;
import io.swagger.client.model.TunnelsCollectionResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MagicGreTunnelsApi
 */
@Ignore
public class MagicGreTunnelsApiTest {

    private final MagicGreTunnelsApi api = new MagicGreTunnelsApi();

    /**
     * Create GRE tunnels
     *
     * Creates new GRE tunnels. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicGreTunnelsCreateGreTunnelsTest() throws Exception {
        Object body = null;
        String accountIdentifier = null;
        TunnelsCollectionResponse response = api.magicGreTunnelsCreateGreTunnels(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Delete GRE Tunnel
     *
     * Disables and removes a specific static GRE tunnel. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicGreTunnelsDeleteGreTunnelTest() throws Exception {
        String tunnelIdentifier = null;
        String accountIdentifier = null;
        TunnelDeletedResponse response = api.magicGreTunnelsDeleteGreTunnel(tunnelIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List GRE Tunnel Details
     *
     * Lists informtion for a specific GRE tunnel.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicGreTunnelsListGreTunnelDetailsTest() throws Exception {
        String tunnelIdentifier = null;
        String accountIdentifier = null;
        TunnelSingleResponse response = api.magicGreTunnelsListGreTunnelDetails(tunnelIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List GRE tunnels
     *
     * Lists GRE tunnels associated with an account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicGreTunnelsListGreTunnelsTest() throws Exception {
        String accountIdentifier = null;
        TunnelsCollectionResponse response = api.magicGreTunnelsListGreTunnels(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update GRE Tunnel
     *
     * Updates a specific GRE tunnel. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicGreTunnelsUpdateGreTunnelTest() throws Exception {
        TunnelUpdateRequest body = null;
        String tunnelIdentifier = null;
        String accountIdentifier = null;
        TunnelModifiedResponse response = api.magicGreTunnelsUpdateGreTunnel(body, tunnelIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update multiple GRE tunnels
     *
     * Updates multiple GRE tunnels. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void magicGreTunnelsUpdateMultipleGreTunnelsTest() throws Exception {
        Object body = null;
        String accountIdentifier = null;
        ModifiedTunnelsCollectionResponse response = api.magicGreTunnelsUpdateMultipleGreTunnels(body, accountIdentifier);

        // TODO: test validations
    }
}
