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
import io.swagger.client.model.InlineResponse20013;
import io.swagger.client.model.InlineResponse4xx178;
import io.swagger.client.model.InlineResponse4xx179;
import io.swagger.client.model.InlineResponse4xx180;
import io.swagger.client.model.LanguageResponseCollection;
import io.swagger.client.model.LanguageResponseSingle;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for StreamSubtitlesCaptionsApi
 */
@Ignore
public class StreamSubtitlesCaptionsApiTest {

    private final StreamSubtitlesCaptionsApi api = new StreamSubtitlesCaptionsApi();

    /**
     * Delete captions or subtitles
     *
     * Removes the captions or subtitles from a video.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamSubtitlesCaptionsDeleteCaptionsOrSubtitlesTest() throws Exception {
        String language = null;
        String identifier = null;
        String accountIdentifier = null;
        InlineResponse20013 response = api.streamSubtitlesCaptionsDeleteCaptionsOrSubtitles(language, identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Delete captions or subtitles
     *
     * Removes the captions or subtitles from a video.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamSubtitlesCaptionsDeleteCaptionsOrSubtitles_0Test() throws Exception {
        String language = null;
        String videoIdentifier = null;
        String accountIdentifier = null;
        InlineResponse20013 response = api.streamSubtitlesCaptionsDeleteCaptionsOrSubtitles_0(language, videoIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List captions or subtitles
     *
     * Lists the available captions or subtitles for a specific video.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamSubtitlesCaptionsListCaptionsOrSubtitlesTest() throws Exception {
        String identifier = null;
        String accountIdentifier = null;
        LanguageResponseCollection response = api.streamSubtitlesCaptionsListCaptionsOrSubtitles(identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List captions or subtitles
     *
     * Lists the available captions or subtitles for a specific video.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamSubtitlesCaptionsListCaptionsOrSubtitles_0Test() throws Exception {
        String videoIdentifier = null;
        String accountIdentifier = null;
        LanguageResponseCollection response = api.streamSubtitlesCaptionsListCaptionsOrSubtitles_0(videoIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Upload captions or subtitles
     *
     * Uploads the caption or subtitle file to the endpoint for a specific BCP47 language. One caption or subtitle file per language is allowed.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamSubtitlesCaptionsUploadCaptionsOrSubtitlesTest() throws Exception {
        String file = null;
        String language = null;
        String identifier = null;
        String accountIdentifier = null;
        LanguageResponseSingle response = api.streamSubtitlesCaptionsUploadCaptionsOrSubtitles(file, language, identifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Upload captions or subtitles
     *
     * Uploads the caption or subtitle file to the endpoint for a specific BCP47 language. One caption or subtitle file per language is allowed.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void streamSubtitlesCaptionsUploadCaptionsOrSubtitles_0Test() throws Exception {
        String file = null;
        String language = null;
        String videoIdentifier = null;
        String accountIdentifier = null;
        LanguageResponseSingle response = api.streamSubtitlesCaptionsUploadCaptionsOrSubtitles_0(file, language, videoIdentifier, accountIdentifier);

        // TODO: test validations
    }
}
