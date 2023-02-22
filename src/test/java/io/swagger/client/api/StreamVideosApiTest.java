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

import io.swagger.client.model.CloudflareClientAPIDirectUploadRequest;
import io.swagger.client.model.CloudflareClientAPIDirectUploadResponse;
import io.swagger.client.model.CloudflareClientAPIVideoResponseSingle;
import io.swagger.client.model.InlineResponse4xx161;
import io.swagger.client.model.InlineResponse4xx163;
import io.swagger.client.model.InlineResponse4xx164;
import io.swagger.client.model.InlineResponse4xx176;
import io.swagger.client.model.InlineResponse4xx177;
import io.swagger.client.model.Nft;
import io.swagger.client.model.SignedTokenRequest;
import io.swagger.client.model.SignedTokenResponse;
import io.swagger.client.model.TusResumable;
import io.swagger.client.model.VideoCopyRequest;
import io.swagger.client.model.VideoResponseCollection;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for StreamVideosApi
 */
@Ignore
public class StreamVideosApiTest {

    private final StreamVideosApi api = new StreamVideosApi();

    /**
     * Associate videos to NFTs
     *
     * Asssociates videos with a token ID and contract address to transfer admin rights on a video. If a change in ownership of the ERC-721 token happens on the Ethereum blockchain, the new token owner can claim control of the video.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamVideosAssociateVideosToNfTsTest() throws Exception {
        Nft body = null;
        String identifier = null;
        String accountIdentifier = null;
        VideoResponseCollection response = api.streamVideosAssociateVideosToNfTs(body, identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Create signed URL tokens for videos
     *
     * Creates a signed URL token for a video. If a body is not provided in the request, a token is created with default values.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamVideosCreateSignedUrlTokensForVideosTest() throws Exception {
        SignedTokenRequest body = null;
        String identifier = null;
        String accountIdentifier = null;
        SignedTokenResponse response = api.streamVideosCreateSignedUrlTokensForVideos(body, identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Delete video
     *
     * Deletes a video and its copies from Cloudflare Stream.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamVideosDeleteVideoTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        api.streamVideosDeleteVideo(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Initiate video uploads using TUS
     *
     * Initiates a video upload using the TUS protocol. On success, the server responds with a status code 201 (created) and includes a &#x60;location&#x60; header to indicate where the content should be uploaded. Refer to https://tus.io for protocol details.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamVideosInitiateVideoUploadsUsingTusTest() throws Exception {
        TusResumable tusResumable = null;
        String uploadCreator = null;
        Integer uploadLength = null;
        String accountIdentifier = null;
        api.streamVideosInitiateVideoUploadsUsingTus(tusResumable, uploadCreator, uploadLength, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List videos
     *
     * Lists up to 1000 videos from a single request. For a specific range, refer to the optional parameters.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamVideosListVideosTest() throws Exception {
        String accountIdentifier = null;
        VideoResponseCollection response = api.streamVideosListVideos(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Retreieve embed Code HTML
     *
     * Fetches an HTML code snippet to embed a video in a web page delivered through Cloudflare. On success, returns an HTML fragment for use on web pages to display a video. On failure, returns a JSON response body.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamVideosRetreieveEmbedCodeHtmlTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        Object response = api.streamVideosRetreieveEmbedCodeHtml(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Retrieve video details
     *
     * Fetches details for a single video.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamVideosRetrieveVideoDetailsTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        CloudflareClientAPIVideoResponseSingle response = api.streamVideosRetrieveVideoDetails(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Upload videos from a URL
     *
     * Uploads a video to Stream from a provided URL.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamVideosUploadVideosFromAUrlTest() throws Exception {
        VideoCopyRequest body = null;
        String accountIdentifier = null;
        CloudflareClientAPIVideoResponseSingle response = api.streamVideosUploadVideosFromAUrl(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Upload videos via direct upload URLs
     *
     * Creates a direct upload that allows video uploads without an API key.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamVideosUploadVideosViaDirectUploadUrLsTest() throws Exception {
        CloudflareClientAPIDirectUploadRequest body = null;
        String accountIdentifier = null;
        CloudflareClientAPIDirectUploadResponse response = api.streamVideosUploadVideosViaDirectUploadUrLs(body, accountIdentifier);

        // TODO: test validations
    }
}
