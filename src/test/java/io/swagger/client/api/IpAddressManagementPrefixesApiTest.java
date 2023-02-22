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

import io.swagger.client.model.AddressingPrefixesBody;
import io.swagger.client.model.ApiResponseCollection;
import io.swagger.client.model.InlineResponse4xx1;
import io.swagger.client.model.InlineResponse4xx5;
import io.swagger.client.model.InlineResponse4xx6;
import io.swagger.client.model.InlineResponse4xx7;
import io.swagger.client.model.InlineResponse4xx8;
import io.swagger.client.model.IpamPrefixesComponentsSchemasResponseCollection;
import io.swagger.client.model.IpamPrefixesComponentsSchemasSingleResponse;
import io.swagger.client.model.LoaUploadResponse;
import io.swagger.client.model.PrefixesPrefixIdentifierBody;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IpAddressManagementPrefixesApi
 */
@Ignore
public class IpAddressManagementPrefixesApiTest {

    private final IpAddressManagementPrefixesApi api = new IpAddressManagementPrefixesApi();

    /**
     * Add Prefix
     *
     * Add a prefix under the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesAddPrefixTest() throws Exception {
        AddressingPrefixesBody body = null;
        String accountIdentifier = null;
        IpamPrefixesComponentsSchemasSingleResponse response = api.ipAddressManagementPrefixesAddPrefix(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Delete Prefix
     *
     * Delete an unapproved prefix owned by the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesDeletePrefixTest() throws Exception {
        String prefixIdentifier = null;
        String accountIdentifier = null;
        ApiResponseCollection response = api.ipAddressManagementPrefixesDeletePrefix(prefixIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Download LOA Document
     *
     * Download specified LOA document under the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesDownloadLoaDocumentTest() throws Exception {
        String loaDocumentIdentifier = null;
        String accountIdentifier = null;
        Object response = api.ipAddressManagementPrefixesDownloadLoaDocument(loaDocumentIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List Prefixes
     *
     * List all prefixes owned by the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesListPrefixesTest() throws Exception {
        String accountIdentifier = null;
        IpamPrefixesComponentsSchemasResponseCollection response = api.ipAddressManagementPrefixesListPrefixes(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Prefix Details
     *
     * List a particular prefix owned by the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesPrefixDetailsTest() throws Exception {
        String prefixIdentifier = null;
        String accountIdentifier = null;
        IpamPrefixesComponentsSchemasSingleResponse response = api.ipAddressManagementPrefixesPrefixDetails(prefixIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update Prefix Description
     *
     * Modify the description for a prefix owned by the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesUpdatePrefixDescriptionTest() throws Exception {
        PrefixesPrefixIdentifierBody body = null;
        String prefixIdentifier = null;
        String accountIdentifier = null;
        IpamPrefixesComponentsSchemasSingleResponse response = api.ipAddressManagementPrefixesUpdatePrefixDescription(body, prefixIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Upload LOA Document
     *
     * Submit LOA document (pdf format) under the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementPrefixesUploadLoaDocumentTest() throws Exception {
        String loaDocument = null;
        String accountIdentifier = null;
        LoaUploadResponse response = api.ipAddressManagementPrefixesUploadLoaDocument(loaDocument, accountIdentifier);

        // TODO: test validations
    }
}