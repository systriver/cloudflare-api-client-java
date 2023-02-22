# LoadBalancerPoolsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loadBalancerPoolsCreatePool**](LoadBalancerPoolsApi.md#loadBalancerPoolsCreatePool) | **POST** /user/load_balancers/pools | Create Pool
[**loadBalancerPoolsDeletePool**](LoadBalancerPoolsApi.md#loadBalancerPoolsDeletePool) | **DELETE** /user/load_balancers/pools/{identifier} | Delete Pool
[**loadBalancerPoolsListPoolReferences**](LoadBalancerPoolsApi.md#loadBalancerPoolsListPoolReferences) | **GET** /user/load_balancers/pools/{identifier}/references | List Pool References
[**loadBalancerPoolsListPools**](LoadBalancerPoolsApi.md#loadBalancerPoolsListPools) | **GET** /user/load_balancers/pools | List Pools
[**loadBalancerPoolsPatchPool**](LoadBalancerPoolsApi.md#loadBalancerPoolsPatchPool) | **PATCH** /user/load_balancers/pools/{identifier} | Patch Pool
[**loadBalancerPoolsPatchPools**](LoadBalancerPoolsApi.md#loadBalancerPoolsPatchPools) | **PATCH** /user/load_balancers/pools | Patch Pools
[**loadBalancerPoolsPoolDetails**](LoadBalancerPoolsApi.md#loadBalancerPoolsPoolDetails) | **GET** /user/load_balancers/pools/{identifier} | Pool Details
[**loadBalancerPoolsPoolHealthDetails**](LoadBalancerPoolsApi.md#loadBalancerPoolsPoolHealthDetails) | **GET** /user/load_balancers/pools/{identifier}/health | Pool Health Details
[**loadBalancerPoolsPreviewPool**](LoadBalancerPoolsApi.md#loadBalancerPoolsPreviewPool) | **POST** /user/load_balancers/pools/{identifier}/preview | Preview Pool
[**loadBalancerPoolsUpdatePool**](LoadBalancerPoolsApi.md#loadBalancerPoolsUpdatePool) | **PUT** /user/load_balancers/pools/{identifier} | Update Pool

<a name="loadBalancerPoolsCreatePool"></a>
# **loadBalancerPoolsCreatePool**
> PoolComponentsSchemasSingleResponse loadBalancerPoolsCreatePool(body)

Create Pool

Create a new pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerPoolsApi;

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


LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi();
LoadBalancersPoolsBody2 body = new LoadBalancersPoolsBody2(); // LoadBalancersPoolsBody2 | 
try {
    PoolComponentsSchemasSingleResponse result = apiInstance.loadBalancerPoolsCreatePool(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsCreatePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoadBalancersPoolsBody2**](LoadBalancersPoolsBody2.md)|  |

### Return type

[**PoolComponentsSchemasSingleResponse**](PoolComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadBalancerPoolsDeletePool"></a>
# **loadBalancerPoolsDeletePool**
> PoolComponentsSchemasIdResponse loadBalancerPoolsDeletePool(identifier)

Delete Pool

Delete a configured pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerPoolsApi;

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


LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi();
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
try {
    PoolComponentsSchemasIdResponse result = apiInstance.loadBalancerPoolsDeletePool(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsDeletePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |

### Return type

[**PoolComponentsSchemasIdResponse**](PoolComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadBalancerPoolsListPoolReferences"></a>
# **loadBalancerPoolsListPoolReferences**
> SchemasReferencesResponse loadBalancerPoolsListPoolReferences(identifier)

List Pool References

Get the list of resources that reference the provided pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerPoolsApi;

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


LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi();
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
try {
    SchemasReferencesResponse result = apiInstance.loadBalancerPoolsListPoolReferences(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsListPoolReferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |

### Return type

[**SchemasReferencesResponse**](SchemasReferencesResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loadBalancerPoolsListPools"></a>
# **loadBalancerPoolsListPools**
> PoolComponentsSchemasResponseCollection loadBalancerPoolsListPools()

List Pools

List configured pools.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerPoolsApi;

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


LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi();
try {
    PoolComponentsSchemasResponseCollection result = apiInstance.loadBalancerPoolsListPools();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsListPools");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PoolComponentsSchemasResponseCollection**](PoolComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loadBalancerPoolsPatchPool"></a>
# **loadBalancerPoolsPatchPool**
> PoolComponentsSchemasSingleResponse loadBalancerPoolsPatchPool(body, identifier)

Patch Pool

Apply changes to an existing pool, overwriting the supplied properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerPoolsApi;

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


LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi();
PoolsIdentifierBody3 body = new PoolsIdentifierBody3(); // PoolsIdentifierBody3 | 
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
try {
    PoolComponentsSchemasSingleResponse result = apiInstance.loadBalancerPoolsPatchPool(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsPatchPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoolsIdentifierBody3**](PoolsIdentifierBody3.md)|  |
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |

### Return type

[**PoolComponentsSchemasSingleResponse**](PoolComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadBalancerPoolsPatchPools"></a>
# **loadBalancerPoolsPatchPools**
> PoolComponentsSchemasResponseCollection loadBalancerPoolsPatchPools(body)

Patch Pools

Apply changes to a number of existing pools, overwriting the supplied properties. Pools are ordered by ascending &#x60;name&#x60;. Returns the list of affected pools. Supports the standard pagination query parameters, either &#x60;limit&#x60;/&#x60;offset&#x60; or &#x60;per_page&#x60;/&#x60;page&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerPoolsApi;

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


LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi();
LoadBalancersPoolsBody3 body = new LoadBalancersPoolsBody3(); // LoadBalancersPoolsBody3 | 
try {
    PoolComponentsSchemasResponseCollection result = apiInstance.loadBalancerPoolsPatchPools(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsPatchPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoadBalancersPoolsBody3**](LoadBalancersPoolsBody3.md)|  |

### Return type

[**PoolComponentsSchemasResponseCollection**](PoolComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadBalancerPoolsPoolDetails"></a>
# **loadBalancerPoolsPoolDetails**
> PoolComponentsSchemasSingleResponse loadBalancerPoolsPoolDetails(identifier)

Pool Details

Fetch a single configured pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerPoolsApi;

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


LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi();
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
try {
    PoolComponentsSchemasSingleResponse result = apiInstance.loadBalancerPoolsPoolDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsPoolDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |

### Return type

[**PoolComponentsSchemasSingleResponse**](PoolComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loadBalancerPoolsPoolHealthDetails"></a>
# **loadBalancerPoolsPoolHealthDetails**
> HealthDetails loadBalancerPoolsPoolHealthDetails(identifier)

Pool Health Details

Fetch the latest pool health status for a single pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerPoolsApi;

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


LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi();
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
try {
    HealthDetails result = apiInstance.loadBalancerPoolsPoolHealthDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsPoolHealthDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |

### Return type

[**HealthDetails**](HealthDetails.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loadBalancerPoolsPreviewPool"></a>
# **loadBalancerPoolsPreviewPool**
> CloudflareClientAPIPreviewResponse loadBalancerPoolsPreviewPool(body, identifier)

Preview Pool

Preview pool health using provided monitor details. The returned preview_id can be used in the preview endpoint to retrieve the results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerPoolsApi;

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


LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi();
IdentifierPreviewBody3 body = new IdentifierPreviewBody3(); // IdentifierPreviewBody3 | 
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIPreviewResponse result = apiInstance.loadBalancerPoolsPreviewPool(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsPreviewPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdentifierPreviewBody3**](IdentifierPreviewBody3.md)|  |
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIPreviewResponse**](CloudflareClientAPIPreviewResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadBalancerPoolsUpdatePool"></a>
# **loadBalancerPoolsUpdatePool**
> PoolComponentsSchemasSingleResponse loadBalancerPoolsUpdatePool(body, identifier)

Update Pool

Modify a configured pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerPoolsApi;

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


LoadBalancerPoolsApi apiInstance = new LoadBalancerPoolsApi();
PoolsIdentifierBody2 body = new PoolsIdentifierBody2(); // PoolsIdentifierBody2 | 
PoolComponentsSchemasIdentifier identifier = new PoolComponentsSchemasIdentifier(); // PoolComponentsSchemasIdentifier | 
try {
    PoolComponentsSchemasSingleResponse result = apiInstance.loadBalancerPoolsUpdatePool(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerPoolsApi#loadBalancerPoolsUpdatePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoolsIdentifierBody2**](PoolsIdentifierBody2.md)|  |
 **identifier** | [**PoolComponentsSchemasIdentifier**](.md)|  |

### Return type

[**PoolComponentsSchemasSingleResponse**](PoolComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

