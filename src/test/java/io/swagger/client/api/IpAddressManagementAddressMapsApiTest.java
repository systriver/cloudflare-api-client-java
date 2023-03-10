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

import io.swagger.client.model.AddressMapsAddressMapIdentifierBody;
import io.swagger.client.model.AddressMapsComponentsSchemasResponseCollection;
import io.swagger.client.model.AddressMapsComponentsSchemasSingleResponse;
import io.swagger.client.model.AddressingAddressMapsBody;
import io.swagger.client.model.ApiResponseCollection;
import io.swagger.client.model.FullResponse;
import io.swagger.client.model.InlineResponse4xx1;
import io.swagger.client.model.InlineResponse4xx2;
import io.swagger.client.model.InlineResponse4xx3;
import io.swagger.client.model.InlineResponse4xx4;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for IpAddressManagementAddressMapsApi
 */
@Ignore
public class IpAddressManagementAddressMapsApiTest {

    private final IpAddressManagementAddressMapsApi api = new IpAddressManagementAddressMapsApi();

    /**
     * Add a zone membership to an Address Map
     *
     * Add a zone as a member of a particular address map.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMapTest() throws Exception {
        String zoneIdentifier = null;
        String addressMapIdentifier = null;
        String accountIdentifier = null;
        ApiResponseCollection response = api.ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap(zoneIdentifier, addressMapIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Add an account membership to an Address Map
     *
     * Add an account as a member of a particular address map.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMapTest() throws Exception {
        String accountIdentifier = null;
        String addressMapIdentifier = null;
        String accountIdentifier1 = null;
        ApiResponseCollection response = api.ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap(accountIdentifier, addressMapIdentifier, accountIdentifier1);

        // TODO: test validations
    }
    /**
     * Add an IP to an Address Map
     *
     * Add an IP from a prefix owned by the account to a particular address map.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsAddAnIpToAnAddressMapTest() throws Exception {
        String ipAddress = null;
        String addressMapIdentifier = null;
        String accountIdentifier = null;
        ApiResponseCollection response = api.ipAddressManagementAddressMapsAddAnIpToAnAddressMap(ipAddress, addressMapIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Address Map Details
     *
     * Show a particular address map owned by the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsAddressMapDetailsTest() throws Exception {
        String addressMapIdentifier = null;
        String accountIdentifier = null;
        FullResponse response = api.ipAddressManagementAddressMapsAddressMapDetails(addressMapIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Create Address Map
     *
     * Create a new address map under the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsCreateAddressMapTest() throws Exception {
        AddressingAddressMapsBody body = null;
        String accountIdentifier = null;
        FullResponse response = api.ipAddressManagementAddressMapsCreateAddressMap(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Delete Address Map
     *
     * Delete a particular address map owned by the account. An Address Map must be disabled before it can be deleted.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsDeleteAddressMapTest() throws Exception {
        String addressMapIdentifier = null;
        String accountIdentifier = null;
        ApiResponseCollection response = api.ipAddressManagementAddressMapsDeleteAddressMap(addressMapIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * List Address Maps
     *
     * List all address maps owned by the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsListAddressMapsTest() throws Exception {
        String accountIdentifier = null;
        AddressMapsComponentsSchemasResponseCollection response = api.ipAddressManagementAddressMapsListAddressMaps(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Remove a zone membership from an Address Map
     *
     * Remove a zone as a member of a particular address map.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMapTest() throws Exception {
        String zoneIdentifier = null;
        String addressMapIdentifier = null;
        String accountIdentifier = null;
        ApiResponseCollection response = api.ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap(zoneIdentifier, addressMapIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Remove an account membership from an Address Map
     *
     * Remove an account as a member of a particular address map.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMapTest() throws Exception {
        String accountIdentifier = null;
        String addressMapIdentifier = null;
        String accountIdentifier1 = null;
        ApiResponseCollection response = api.ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap(accountIdentifier, addressMapIdentifier, accountIdentifier1);

        // TODO: test validations
    }
    /**
     * Remove an IP from an Address Map
     *
     * Remove an IP from a particular address map.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMapTest() throws Exception {
        String ipAddress = null;
        String addressMapIdentifier = null;
        String accountIdentifier = null;
        ApiResponseCollection response = api.ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap(ipAddress, addressMapIdentifier, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update Address Map
     *
     * Modify properties of an address map owned by the account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ipAddressManagementAddressMapsUpdateAddressMapTest() throws Exception {
        AddressMapsAddressMapIdentifierBody body = null;
        String addressMapIdentifier = null;
        String accountIdentifier = null;
        AddressMapsComponentsSchemasSingleResponse response = api.ipAddressManagementAddressMapsUpdateAddressMap(body, addressMapIdentifier, accountIdentifier);

        // TODO: test validations
    }
}
