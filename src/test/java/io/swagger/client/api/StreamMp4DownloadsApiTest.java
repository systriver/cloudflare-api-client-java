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

import io.swagger.client.model.ApiResponseCommonFailure;
import io.swagger.client.model.DeletedResponse;
import io.swagger.client.model.DownloadsResponse;
import io.swagger.client.model.InlineResponse4xx181;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for StreamMp4DownloadsApi
 */
@Ignore
public class StreamMp4DownloadsApiTest {

    private final StreamMp4DownloadsApi api = new StreamMp4DownloadsApi();

    /**
     * Create downloads
     *
     * Creates a download for a video when a video is ready to view.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamMP4DownloadsCreateDownloadsTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        DownloadsResponse response = api.streamMP4DownloadsCreateDownloads(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Create downloads
     *
     * Creates a download for a video when a video is ready to view.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamMP4DownloadsCreateDownloads_0Test() throws Exception {
        String videoIdentifier = null;
        String accountIdentifier = null;
        DownloadsResponse response = api.streamMP4DownloadsCreateDownloads_0(videoIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Delete downloads
     *
     * Delete the downloads for a video.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamMP4DownloadsDeleteDownloadsTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        DeletedResponse response = api.streamMP4DownloadsDeleteDownloads(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List downloads
     *
     * Lists the downloads created for a video.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamMP4DownloadsListDownloadsTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        DownloadsResponse response = api.streamMP4DownloadsListDownloads(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List downloads
     *
     * Lists the downloads created for a video.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamMP4DownloadsListDownloads_0Test() throws Exception {
        String videoIdentifier = null;
        String accountIdentifier = null;
        DownloadsResponse response = api.streamMP4DownloadsListDownloads_0(videoIdentifier, accountIdentifier);

        // TODO: test validations
    }
}