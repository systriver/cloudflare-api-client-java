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

import io.swagger.client.model.InlineResponse4xx148;
import io.swagger.client.model.InlineResponse4xx149;
import io.swagger.client.model.InlineResponse4xx150;
import io.swagger.client.model.Peer;
import io.swagger.client.model.PeerComponentsSchemasIdResponse;
import io.swagger.client.model.PeerComponentsSchemasIdentifier;
import io.swagger.client.model.PeerComponentsSchemasResponseCollection;
import io.swagger.client.model.PeerComponentsSchemasSingleResponse;
import io.swagger.client.model.SchemasAccountIdentifier;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for SecondaryDnsPeerApi
 */
@Ignore
public class SecondaryDnsPeerApiTest {

    private final SecondaryDnsPeerApi api = new SecondaryDnsPeerApi();

    /**
     * Create Peer
     *
     * Create Peer.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void secondaryDnsPeerCreatePeerTest() throws Exception {
        Object body = null;
        SchemasAccountIdentifier accountIdentifier = null;
        PeerComponentsSchemasSingleResponse response = api.secondaryDnsPeerCreatePeer(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Delete Peer
     *
     * Delete Peer.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void secondaryDnsPeerDeletePeerTest() throws Exception {
        PeerComponentsSchemasIdentifier identifier = null;
        SchemasAccountIdentifier accountIdentifier = null;
        PeerComponentsSchemasIdResponse response = api.secondaryDnsPeerDeletePeer(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List Peers
     *
     * List Peers.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void secondaryDnsPeerListPeersTest() throws Exception {
        SchemasAccountIdentifier accountIdentifier = null;
        PeerComponentsSchemasResponseCollection response = api.secondaryDnsPeerListPeers(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Peer Details
     *
     * Get Peer.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void secondaryDnsPeerPeerDetailsTest() throws Exception {
        PeerComponentsSchemasIdentifier identifier = null;
        SchemasAccountIdentifier accountIdentifier = null;
        PeerComponentsSchemasSingleResponse response = api.secondaryDnsPeerPeerDetails(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update Peer
     *
     * Modify Peer.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void secondaryDnsPeerUpdatePeerTest() throws Exception {
        Peer body = null;
        PeerComponentsSchemasIdentifier identifier = null;
        SchemasAccountIdentifier accountIdentifier = null;
        PeerComponentsSchemasSingleResponse response = api.secondaryDnsPeerUpdatePeer(body, identifier, accountIdentifier);

        // TODO: test validations
    }
}
