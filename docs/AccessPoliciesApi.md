# AccessPoliciesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessPoliciesCreateAnAccessPolicy**](AccessPoliciesApi.md#accessPoliciesCreateAnAccessPolicy) | **POST** /accounts/{identifier}/access/apps/{uuid}/policies | Create an Access policy
[**accessPoliciesDeleteAnAccessPolicy**](AccessPoliciesApi.md#accessPoliciesDeleteAnAccessPolicy) | **DELETE** /accounts/{identifier}/access/apps/{uuid1}/policies/{uuid} | Delete an Access policy
[**accessPoliciesGetAnAccessPolicy**](AccessPoliciesApi.md#accessPoliciesGetAnAccessPolicy) | **GET** /accounts/{identifier}/access/apps/{uuid1}/policies/{uuid} | Get an Access policy
[**accessPoliciesListAccessPolicies**](AccessPoliciesApi.md#accessPoliciesListAccessPolicies) | **GET** /accounts/{identifier}/access/apps/{uuid}/policies | List Access policies
[**accessPoliciesUpdateAnAccessPolicy**](AccessPoliciesApi.md#accessPoliciesUpdateAnAccessPolicy) | **PUT** /accounts/{identifier}/access/apps/{uuid1}/policies/{uuid} | Update an Access policy

<a name="accessPoliciesCreateAnAccessPolicy"></a>
# **accessPoliciesCreateAnAccessPolicy**
> CloudflareClientAPIPoliciesComponentsSchemasSingleResponse accessPoliciesCreateAnAccessPolicy(body, uuid, identifier)

Create an Access policy

Create a new Access policy for an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessPoliciesApi;

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


AccessPoliciesApi apiInstance = new AccessPoliciesApi();
UuidPoliciesBody body = new UuidPoliciesBody(); // UuidPoliciesBody | 
String uuid = "uuid_example"; // String | 
PoliciesComponentsSchemasIdentifier identifier = new PoliciesComponentsSchemasIdentifier(); // PoliciesComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIPoliciesComponentsSchemasSingleResponse result = apiInstance.accessPoliciesCreateAnAccessPolicy(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessPoliciesApi#accessPoliciesCreateAnAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UuidPoliciesBody**](UuidPoliciesBody.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**PoliciesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIPoliciesComponentsSchemasSingleResponse**](CloudflareClientAPIPoliciesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessPoliciesDeleteAnAccessPolicy"></a>
# **accessPoliciesDeleteAnAccessPolicy**
> PoliciesComponentsSchemasIdResponse accessPoliciesDeleteAnAccessPolicy(uuid, uuid1, identifier)

Delete an Access policy

Delete an Access policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessPoliciesApi;

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


AccessPoliciesApi apiInstance = new AccessPoliciesApi();
String uuid = "uuid_example"; // String | 
String uuid1 = "uuid1_example"; // String | 
PoliciesComponentsSchemasIdentifier identifier = new PoliciesComponentsSchemasIdentifier(); // PoliciesComponentsSchemasIdentifier | 
try {
    PoliciesComponentsSchemasIdResponse result = apiInstance.accessPoliciesDeleteAnAccessPolicy(uuid, uuid1, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessPoliciesApi#accessPoliciesDeleteAnAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **uuid1** | [**String**](.md)|  |
 **identifier** | [**PoliciesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**PoliciesComponentsSchemasIdResponse**](PoliciesComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessPoliciesGetAnAccessPolicy"></a>
# **accessPoliciesGetAnAccessPolicy**
> CloudflareClientAPIPoliciesComponentsSchemasSingleResponse accessPoliciesGetAnAccessPolicy(uuid, uuid1, identifier)

Get an Access policy

Fetches a single Access policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessPoliciesApi;

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


AccessPoliciesApi apiInstance = new AccessPoliciesApi();
String uuid = "uuid_example"; // String | 
String uuid1 = "uuid1_example"; // String | 
PoliciesComponentsSchemasIdentifier identifier = new PoliciesComponentsSchemasIdentifier(); // PoliciesComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIPoliciesComponentsSchemasSingleResponse result = apiInstance.accessPoliciesGetAnAccessPolicy(uuid, uuid1, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessPoliciesApi#accessPoliciesGetAnAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **uuid1** | [**String**](.md)|  |
 **identifier** | [**PoliciesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIPoliciesComponentsSchemasSingleResponse**](CloudflareClientAPIPoliciesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessPoliciesListAccessPolicies"></a>
# **accessPoliciesListAccessPolicies**
> CloudflareClientAPIPoliciesComponentsSchemasResponseCollection accessPoliciesListAccessPolicies(uuid, identifier)

List Access policies

Lists Access policies configured for an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessPoliciesApi;

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


AccessPoliciesApi apiInstance = new AccessPoliciesApi();
String uuid = "uuid_example"; // String | 
PoliciesComponentsSchemasIdentifier identifier = new PoliciesComponentsSchemasIdentifier(); // PoliciesComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIPoliciesComponentsSchemasResponseCollection result = apiInstance.accessPoliciesListAccessPolicies(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessPoliciesApi#accessPoliciesListAccessPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**PoliciesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIPoliciesComponentsSchemasResponseCollection**](CloudflareClientAPIPoliciesComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessPoliciesUpdateAnAccessPolicy"></a>
# **accessPoliciesUpdateAnAccessPolicy**
> CloudflareClientAPIPoliciesComponentsSchemasSingleResponse accessPoliciesUpdateAnAccessPolicy(body, uuid, uuid1, identifier)

Update an Access policy

Update a configured Access policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessPoliciesApi;

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


AccessPoliciesApi apiInstance = new AccessPoliciesApi();
PoliciesUuidBody body = new PoliciesUuidBody(); // PoliciesUuidBody | 
String uuid = "uuid_example"; // String | 
String uuid1 = "uuid1_example"; // String | 
PoliciesComponentsSchemasIdentifier identifier = new PoliciesComponentsSchemasIdentifier(); // PoliciesComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIPoliciesComponentsSchemasSingleResponse result = apiInstance.accessPoliciesUpdateAnAccessPolicy(body, uuid, uuid1, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessPoliciesApi#accessPoliciesUpdateAnAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoliciesUuidBody**](PoliciesUuidBody.md)|  |
 **uuid** | [**String**](.md)|  |
 **uuid1** | [**String**](.md)|  |
 **identifier** | [**PoliciesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIPoliciesComponentsSchemasSingleResponse**](CloudflareClientAPIPoliciesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

