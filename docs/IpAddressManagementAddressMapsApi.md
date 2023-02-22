# IpAddressManagementAddressMapsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap) | **PUT** /accounts/{account_identifier}/addressing/address_maps/{address_map_identifier}/zones/{zone_identifier} | Add a zone membership to an Address Map
[**ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap) | **PUT** /accounts/{account_identifier1}/addressing/address_maps/{address_map_identifier}/accounts/{account_identifier} | Add an account membership to an Address Map
[**ipAddressManagementAddressMapsAddAnIpToAnAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsAddAnIpToAnAddressMap) | **PUT** /accounts/{account_identifier}/addressing/address_maps/{address_map_identifier}/ips/{ip_address} | Add an IP to an Address Map
[**ipAddressManagementAddressMapsAddressMapDetails**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsAddressMapDetails) | **GET** /accounts/{account_identifier}/addressing/address_maps/{address_map_identifier} | Address Map Details
[**ipAddressManagementAddressMapsCreateAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsCreateAddressMap) | **POST** /accounts/{account_identifier}/addressing/address_maps | Create Address Map
[**ipAddressManagementAddressMapsDeleteAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsDeleteAddressMap) | **DELETE** /accounts/{account_identifier}/addressing/address_maps/{address_map_identifier} | Delete Address Map
[**ipAddressManagementAddressMapsListAddressMaps**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsListAddressMaps) | **GET** /accounts/{account_identifier}/addressing/address_maps | List Address Maps
[**ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap) | **DELETE** /accounts/{account_identifier}/addressing/address_maps/{address_map_identifier}/zones/{zone_identifier} | Remove a zone membership from an Address Map
[**ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap) | **DELETE** /accounts/{account_identifier1}/addressing/address_maps/{address_map_identifier}/accounts/{account_identifier} | Remove an account membership from an Address Map
[**ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap) | **DELETE** /accounts/{account_identifier}/addressing/address_maps/{address_map_identifier}/ips/{ip_address} | Remove an IP from an Address Map
[**ipAddressManagementAddressMapsUpdateAddressMap**](IpAddressManagementAddressMapsApi.md#ipAddressManagementAddressMapsUpdateAddressMap) | **PATCH** /accounts/{account_identifier}/addressing/address_maps/{address_map_identifier} | Update Address Map

<a name="ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap"></a>
# **ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap**
> ApiResponseCollection ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap(zoneIdentifier, addressMapIdentifier, accountIdentifier)

Add a zone membership to an Address Map

Add a zone as a member of a particular address map.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementAddressMapsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
String addressMapIdentifier = "addressMapIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap(zoneIdentifier, addressMapIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsAddAZoneMembershipToAnAddressMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |
 **addressMapIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseCollection**](ApiResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap"></a>
# **ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap**
> ApiResponseCollection ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap(accountIdentifier, addressMapIdentifier, accountIdentifier1)

Add an account membership to an Address Map

Add an account as a member of a particular address map.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementAddressMapsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
String addressMapIdentifier = "addressMapIdentifier_example"; // String | 
String accountIdentifier1 = "accountIdentifier1_example"; // String | 
try {
    ApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap(accountIdentifier, addressMapIdentifier, accountIdentifier1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsAddAnAccountMembershipToAnAddressMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |
 **addressMapIdentifier** | [**String**](.md)|  |
 **accountIdentifier1** | [**String**](.md)|  |

### Return type

[**ApiResponseCollection**](ApiResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementAddressMapsAddAnIpToAnAddressMap"></a>
# **ipAddressManagementAddressMapsAddAnIpToAnAddressMap**
> ApiResponseCollection ipAddressManagementAddressMapsAddAnIpToAnAddressMap(ipAddress, addressMapIdentifier, accountIdentifier)

Add an IP to an Address Map

Add an IP from a prefix owned by the account to a particular address map.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementAddressMapsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi();
String ipAddress = "ipAddress_example"; // String | 
String addressMapIdentifier = "addressMapIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsAddAnIpToAnAddressMap(ipAddress, addressMapIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsAddAnIpToAnAddressMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipAddress** | [**String**](.md)|  |
 **addressMapIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseCollection**](ApiResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementAddressMapsAddressMapDetails"></a>
# **ipAddressManagementAddressMapsAddressMapDetails**
> FullResponse ipAddressManagementAddressMapsAddressMapDetails(addressMapIdentifier, accountIdentifier)

Address Map Details

Show a particular address map owned by the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementAddressMapsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi();
String addressMapIdentifier = "addressMapIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    FullResponse result = apiInstance.ipAddressManagementAddressMapsAddressMapDetails(addressMapIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsAddressMapDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressMapIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**FullResponse**](FullResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipAddressManagementAddressMapsCreateAddressMap"></a>
# **ipAddressManagementAddressMapsCreateAddressMap**
> FullResponse ipAddressManagementAddressMapsCreateAddressMap(body, accountIdentifier)

Create Address Map

Create a new address map under the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementAddressMapsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi();
AddressingAddressMapsBody body = new AddressingAddressMapsBody(); // AddressingAddressMapsBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    FullResponse result = apiInstance.ipAddressManagementAddressMapsCreateAddressMap(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsCreateAddressMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddressingAddressMapsBody**](AddressingAddressMapsBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**FullResponse**](FullResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementAddressMapsDeleteAddressMap"></a>
# **ipAddressManagementAddressMapsDeleteAddressMap**
> ApiResponseCollection ipAddressManagementAddressMapsDeleteAddressMap(addressMapIdentifier, accountIdentifier)

Delete Address Map

Delete a particular address map owned by the account. An Address Map must be disabled before it can be deleted.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementAddressMapsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi();
String addressMapIdentifier = "addressMapIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsDeleteAddressMap(addressMapIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsDeleteAddressMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addressMapIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseCollection**](ApiResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementAddressMapsListAddressMaps"></a>
# **ipAddressManagementAddressMapsListAddressMaps**
> AddressMapsComponentsSchemasResponseCollection ipAddressManagementAddressMapsListAddressMaps(accountIdentifier)

List Address Maps

List all address maps owned by the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementAddressMapsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    AddressMapsComponentsSchemasResponseCollection result = apiInstance.ipAddressManagementAddressMapsListAddressMaps(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsListAddressMaps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**AddressMapsComponentsSchemasResponseCollection**](AddressMapsComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap"></a>
# **ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap**
> ApiResponseCollection ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap(zoneIdentifier, addressMapIdentifier, accountIdentifier)

Remove a zone membership from an Address Map

Remove a zone as a member of a particular address map.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementAddressMapsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
String addressMapIdentifier = "addressMapIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap(zoneIdentifier, addressMapIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsRemoveAZoneMembershipFromAnAddressMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |
 **addressMapIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseCollection**](ApiResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap"></a>
# **ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap**
> ApiResponseCollection ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap(accountIdentifier, addressMapIdentifier, accountIdentifier1)

Remove an account membership from an Address Map

Remove an account as a member of a particular address map.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementAddressMapsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
String addressMapIdentifier = "addressMapIdentifier_example"; // String | 
String accountIdentifier1 = "accountIdentifier1_example"; // String | 
try {
    ApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap(accountIdentifier, addressMapIdentifier, accountIdentifier1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsRemoveAnAccountMembershipFromAnAddressMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |
 **addressMapIdentifier** | [**String**](.md)|  |
 **accountIdentifier1** | [**String**](.md)|  |

### Return type

[**ApiResponseCollection**](ApiResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap"></a>
# **ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap**
> ApiResponseCollection ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap(ipAddress, addressMapIdentifier, accountIdentifier)

Remove an IP from an Address Map

Remove an IP from a particular address map.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementAddressMapsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi();
String ipAddress = "ipAddress_example"; // String | 
String addressMapIdentifier = "addressMapIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseCollection result = apiInstance.ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap(ipAddress, addressMapIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsRemoveAnIpFromAnAddressMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipAddress** | [**String**](.md)|  |
 **addressMapIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseCollection**](ApiResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementAddressMapsUpdateAddressMap"></a>
# **ipAddressManagementAddressMapsUpdateAddressMap**
> AddressMapsComponentsSchemasSingleResponse ipAddressManagementAddressMapsUpdateAddressMap(body, addressMapIdentifier, accountIdentifier)

Update Address Map

Modify properties of an address map owned by the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementAddressMapsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


IpAddressManagementAddressMapsApi apiInstance = new IpAddressManagementAddressMapsApi();
AddressMapsAddressMapIdentifierBody body = new AddressMapsAddressMapIdentifierBody(); // AddressMapsAddressMapIdentifierBody | 
String addressMapIdentifier = "addressMapIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    AddressMapsComponentsSchemasSingleResponse result = apiInstance.ipAddressManagementAddressMapsUpdateAddressMap(body, addressMapIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementAddressMapsApi#ipAddressManagementAddressMapsUpdateAddressMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddressMapsAddressMapIdentifierBody**](AddressMapsAddressMapIdentifierBody.md)|  |
 **addressMapIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**AddressMapsComponentsSchemasSingleResponse**](AddressMapsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

