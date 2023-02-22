# AccountLoadBalancerPoolsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountLoadBalancerPoolsCreatePool**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsCreatePool) | **POST** /accounts/{account_identifier}/load_balancers/pools | Create Pool
[**accountLoadBalancerPoolsDeletePool**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsDeletePool) | **DELETE** /accounts/{account_identifier}/load_balancers/pools/{identifier} | Delete Pool
[**accountLoadBalancerPoolsListPoolReferences**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsListPoolReferences) | **GET** /accounts/{account_identifier}/load_balancers/pools/{identifier}/references | List Pool References
[**accountLoadBalancerPoolsListPools**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsListPools) | **GET** /accounts/{account_identifier}/load_balancers/pools | List Pools
[**accountLoadBalancerPoolsPatchPool**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsPatchPool) | **PATCH** /accounts/{account_identifier}/load_balancers/pools/{identifier} | Patch Pool
[**accountLoadBalancerPoolsPatchPools**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsPatchPools) | **PATCH** /accounts/{account_identifier}/load_balancers/pools | Patch Pools
[**accountLoadBalancerPoolsPoolDetails**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsPoolDetails) | **GET** /accounts/{account_identifier}/load_balancers/pools/{identifier} | Pool Details
[**accountLoadBalancerPoolsPoolHealthDetails**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsPoolHealthDetails) | **GET** /accounts/{account_identifier}/load_balancers/pools/{identifier}/health | Pool Health Details
[**accountLoadBalancerPoolsPreviewPool**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsPreviewPool) | **POST** /accounts/{account_identifier}/load_balancers/pools/{identifier}/preview | Preview Pool
[**accountLoadBalancerPoolsUpdatePool**](AccountLoadBalancerPoolsApi.md#accountLoadBalancerPoolsUpdatePool) | **PUT** /accounts/{account_identifier}/load_balancers/pools/{identifier} | Update Pool

<a name="accountLoadBalancerPoolsCreatePool"></a>
# **accountLoadBalancerPoolsCreatePool**
> PoolComponentsSchemasSingleResponse accountLoadBalancerPoolsCreatePool(body, accountIdentifier)

Create Pool

Create a new pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLoadBalancerPoolsApi;

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


AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi();
LoadBalancersPoolsBody body = new LoadBalancersPoolsBody(); // LoadBalancersPoolsBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PoolComponentsSchemasSingleResponse result = apiInstance.accountLoadBalancerPoolsCreatePool(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsCreatePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoadBalancersPoolsBody**](LoadBalancersPoolsBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PoolComponentsSchemasSingleResponse**](PoolComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountLoadBalancerPoolsDeletePool"></a>
# **accountLoadBalancerPoolsDeletePool**
> PoolComponentsSchemasIdResponse accountLoadBalancerPoolsDeletePool(identifier, accountIdentifier)

Delete Pool

Delete a configured pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLoadBalancerPoolsApi;

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


AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi();
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PoolComponentsSchemasIdResponse result = apiInstance.accountLoadBalancerPoolsDeletePool(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsDeletePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PoolComponentsSchemasIdResponse**](PoolComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountLoadBalancerPoolsListPoolReferences"></a>
# **accountLoadBalancerPoolsListPoolReferences**
> SchemasReferencesResponse accountLoadBalancerPoolsListPoolReferences(identifier, accountIdentifier)

List Pool References

Get the list of resources that reference the provided pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLoadBalancerPoolsApi;

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


AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi();
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasReferencesResponse result = apiInstance.accountLoadBalancerPoolsListPoolReferences(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsListPoolReferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasReferencesResponse**](SchemasReferencesResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountLoadBalancerPoolsListPools"></a>
# **accountLoadBalancerPoolsListPools**
> PoolComponentsSchemasResponseCollection accountLoadBalancerPoolsListPools(accountIdentifier)

List Pools

List configured pools.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLoadBalancerPoolsApi;

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


AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PoolComponentsSchemasResponseCollection result = apiInstance.accountLoadBalancerPoolsListPools(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsListPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PoolComponentsSchemasResponseCollection**](PoolComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountLoadBalancerPoolsPatchPool"></a>
# **accountLoadBalancerPoolsPatchPool**
> PoolComponentsSchemasSingleResponse accountLoadBalancerPoolsPatchPool(body, identifier, accountIdentifier)

Patch Pool

Apply changes to an existing pool, overwriting the supplied properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLoadBalancerPoolsApi;

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


AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi();
PoolsIdentifierBody1 body = new PoolsIdentifierBody1(); // PoolsIdentifierBody1 | 
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PoolComponentsSchemasSingleResponse result = apiInstance.accountLoadBalancerPoolsPatchPool(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsPatchPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoolsIdentifierBody1**](PoolsIdentifierBody1.md)|  |
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PoolComponentsSchemasSingleResponse**](PoolComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountLoadBalancerPoolsPatchPools"></a>
# **accountLoadBalancerPoolsPatchPools**
> PoolComponentsSchemasResponseCollection accountLoadBalancerPoolsPatchPools(body, accountIdentifier)

Patch Pools

Apply changes to a number of existing pools, overwriting the supplied properties. Pools are ordered by ascending &#x60;name&#x60;. Returns the list of affected pools. Supports the standard pagination query parameters, either &#x60;limit&#x60;/&#x60;offset&#x60; or &#x60;per_page&#x60;/&#x60;page&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLoadBalancerPoolsApi;

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


AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi();
LoadBalancersPoolsBody1 body = new LoadBalancersPoolsBody1(); // LoadBalancersPoolsBody1 | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PoolComponentsSchemasResponseCollection result = apiInstance.accountLoadBalancerPoolsPatchPools(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsPatchPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoadBalancersPoolsBody1**](LoadBalancersPoolsBody1.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PoolComponentsSchemasResponseCollection**](PoolComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountLoadBalancerPoolsPoolDetails"></a>
# **accountLoadBalancerPoolsPoolDetails**
> PoolComponentsSchemasSingleResponse accountLoadBalancerPoolsPoolDetails(identifier, accountIdentifier)

Pool Details

Fetch a single configured pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLoadBalancerPoolsApi;

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


AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi();
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PoolComponentsSchemasSingleResponse result = apiInstance.accountLoadBalancerPoolsPoolDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsPoolDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PoolComponentsSchemasSingleResponse**](PoolComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountLoadBalancerPoolsPoolHealthDetails"></a>
# **accountLoadBalancerPoolsPoolHealthDetails**
> HealthDetails accountLoadBalancerPoolsPoolHealthDetails(identifier, accountIdentifier)

Pool Health Details

Fetch the latest pool health status for a single pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLoadBalancerPoolsApi;

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


AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi();
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    HealthDetails result = apiInstance.accountLoadBalancerPoolsPoolHealthDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsPoolHealthDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**HealthDetails**](HealthDetails.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountLoadBalancerPoolsPreviewPool"></a>
# **accountLoadBalancerPoolsPreviewPool**
> CloudflareClientAPIPreviewResponse accountLoadBalancerPoolsPreviewPool(body, identifier, accountIdentifier)

Preview Pool

Preview pool health using provided monitor details. The returned preview_id can be used in the preview endpoint to retrieve the results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLoadBalancerPoolsApi;

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


AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi();
IdentifierPreviewBody1 body = new IdentifierPreviewBody1(); // IdentifierPreviewBody1 | 
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CloudflareClientAPIPreviewResponse result = apiInstance.accountLoadBalancerPoolsPreviewPool(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsPreviewPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdentifierPreviewBody1**](IdentifierPreviewBody1.md)|  |
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIPreviewResponse**](CloudflareClientAPIPreviewResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountLoadBalancerPoolsUpdatePool"></a>
# **accountLoadBalancerPoolsUpdatePool**
> PoolComponentsSchemasSingleResponse accountLoadBalancerPoolsUpdatePool(body, identifier, accountIdentifier)

Update Pool

Modify a configured pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLoadBalancerPoolsApi;

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


AccountLoadBalancerPoolsApi apiInstance = new AccountLoadBalancerPoolsApi();
PoolsIdentifierBody body = new PoolsIdentifierBody(); // PoolsIdentifierBody | 
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PoolComponentsSchemasSingleResponse result = apiInstance.accountLoadBalancerPoolsUpdatePool(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLoadBalancerPoolsApi#accountLoadBalancerPoolsUpdatePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoolsIdentifierBody**](PoolsIdentifierBody.md)|  |
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PoolComponentsSchemasSingleResponse**](PoolComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

