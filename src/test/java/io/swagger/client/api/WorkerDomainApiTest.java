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

import io.swagger.client.model.CloudflareClientAPIDomainResponseCollection;
import io.swagger.client.model.CloudflareClientAPIDomainResponseSingle;
import io.swagger.client.model.DomainIdentifier;
import io.swagger.client.model.DomainsComponentsSchemasAccountIdentifier;
import io.swagger.client.model.InlineResponse4xx197;
import io.swagger.client.model.InlineResponse4xx198;
import io.swagger.client.model.WorkersDomainsBody;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for WorkerDomainApi
 */
@Ignore
public class WorkerDomainApiTest {

    private final WorkerDomainApi api = new WorkerDomainApi();

    /**
     * Attach to Domain
     *
     * Attaches a worker to a zone and hostname.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void workerDomainAttachToDomainTest() throws Exception {
        WorkersDomainsBody body = null;
        DomainsComponentsSchemasAccountIdentifier accountIdentifier = null;
        CloudflareClientAPIDomainResponseSingle response = api.workerDomainAttachToDomain(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Detach from Domain
     *
     * Detaches a worker from a zone and hostname.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void workerDomainDetachFromDomainTest() throws Exception {
        DomainIdentifier domainIdentifier = null;
        DomainsComponentsSchemasAccountIdentifier accountIdentifier = null;
        api.workerDomainDetachFromDomain(domainIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get a Domain
     *
     * Gets a Worker Domain.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void workerDomainGetADomainTest() throws Exception {
        DomainIdentifier domainIdentifier = null;
        DomainsComponentsSchemasAccountIdentifier accountIdentifier = null;
        CloudflareClientAPIDomainResponseSingle response = api.workerDomainGetADomain(domainIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List Domains
     *
     * Lists all Worker Domains.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void workerDomainListDomainsTest() throws Exception {
        DomainsComponentsSchemasAccountIdentifier accountIdentifier = null;
        CloudflareClientAPIDomainResponseCollection response = api.workerDomainListDomains(accountIdentifier);

        // TODO: test validations
    }
}
