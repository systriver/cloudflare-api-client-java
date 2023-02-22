# ZoneLevelAccessPoliciesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneLevelAccessPoliciesCreateAnAccessPolicy**](ZoneLevelAccessPoliciesApi.md#zoneLevelAccessPoliciesCreateAnAccessPolicy) | **POST** /zones/{identifier}/access/apps/{uuid}/policies | Create an Access policy
[**zoneLevelAccessPoliciesDeleteAnAccessPolicy**](ZoneLevelAccessPoliciesApi.md#zoneLevelAccessPoliciesDeleteAnAccessPolicy) | **DELETE** /zones/{identifier}/access/apps/{uuid1}/policies/{uuid} | Delete an Access policy
[**zoneLevelAccessPoliciesGetAnAccessPolicy**](ZoneLevelAccessPoliciesApi.md#zoneLevelAccessPoliciesGetAnAccessPolicy) | **GET** /zones/{identifier}/access/apps/{uuid1}/policies/{uuid} | Get an Access policy
[**zoneLevelAccessPoliciesListAccessPolicies**](ZoneLevelAccessPoliciesApi.md#zoneLevelAccessPoliciesListAccessPolicies) | **GET** /zones/{identifier}/access/apps/{uuid}/policies | List Access policies
[**zoneLevelAccessPoliciesUpdateAnAccessPolicy**](ZoneLevelAccessPoliciesApi.md#zoneLevelAccessPoliciesUpdateAnAccessPolicy) | **PUT** /zones/{identifier}/access/apps/{uuid1}/policies/{uuid} | Update an Access policy

<a name="zoneLevelAccessPoliciesCreateAnAccessPolicy"></a>
# **zoneLevelAccessPoliciesCreateAnAccessPolicy**
> CloudflareClientAPIPoliciesComponentsSchemasSingleResponse zoneLevelAccessPoliciesCreateAnAccessPolicy(body, uuid, identifier)

Create an Access policy

Create a new Access policy for an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessPoliciesApi;

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


ZoneLevelAccessPoliciesApi apiInstance = new ZoneLevelAccessPoliciesApi();
UuidPoliciesBody1 body = new UuidPoliciesBody1(); // UuidPoliciesBody1 | 
String uuid = "uuid_example"; // String | 
PoliciesComponentsSchemasIdentifier identifier = new PoliciesComponentsSchemasIdentifier(); // PoliciesComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIPoliciesComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessPoliciesCreateAnAccessPolicy(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessPoliciesApi#zoneLevelAccessPoliciesCreateAnAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UuidPoliciesBody1**](UuidPoliciesBody1.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**PoliciesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIPoliciesComponentsSchemasSingleResponse**](CloudflareClientAPIPoliciesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLevelAccessPoliciesDeleteAnAccessPolicy"></a>
# **zoneLevelAccessPoliciesDeleteAnAccessPolicy**
> PoliciesComponentsSchemasIdResponse zoneLevelAccessPoliciesDeleteAnAccessPolicy(uuid, uuid1, identifier)

Delete an Access policy

Delete an Access policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessPoliciesApi;

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


ZoneLevelAccessPoliciesApi apiInstance = new ZoneLevelAccessPoliciesApi();
String uuid = "uuid_example"; // String | 
String uuid1 = "uuid1_example"; // String | 
PoliciesComponentsSchemasIdentifier identifier = new PoliciesComponentsSchemasIdentifier(); // PoliciesComponentsSchemasIdentifier | 
try {
    PoliciesComponentsSchemasIdResponse result = apiInstance.zoneLevelAccessPoliciesDeleteAnAccessPolicy(uuid, uuid1, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessPoliciesApi#zoneLevelAccessPoliciesDeleteAnAccessPolicy");
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

<a name="zoneLevelAccessPoliciesGetAnAccessPolicy"></a>
# **zoneLevelAccessPoliciesGetAnAccessPolicy**
> CloudflareClientAPIPoliciesComponentsSchemasSingleResponse zoneLevelAccessPoliciesGetAnAccessPolicy(uuid, uuid1, identifier)

Get an Access policy

Fetches a single Access policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessPoliciesApi;

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


ZoneLevelAccessPoliciesApi apiInstance = new ZoneLevelAccessPoliciesApi();
String uuid = "uuid_example"; // String | 
String uuid1 = "uuid1_example"; // String | 
PoliciesComponentsSchemasIdentifier identifier = new PoliciesComponentsSchemasIdentifier(); // PoliciesComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIPoliciesComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessPoliciesGetAnAccessPolicy(uuid, uuid1, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessPoliciesApi#zoneLevelAccessPoliciesGetAnAccessPolicy");
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

<a name="zoneLevelAccessPoliciesListAccessPolicies"></a>
# **zoneLevelAccessPoliciesListAccessPolicies**
> CloudflareClientAPIPoliciesComponentsSchemasResponseCollection zoneLevelAccessPoliciesListAccessPolicies(uuid, identifier)

List Access policies

Lists Access policies configured for an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessPoliciesApi;

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


ZoneLevelAccessPoliciesApi apiInstance = new ZoneLevelAccessPoliciesApi();
String uuid = "uuid_example"; // String | 
PoliciesComponentsSchemasIdentifier identifier = new PoliciesComponentsSchemasIdentifier(); // PoliciesComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIPoliciesComponentsSchemasResponseCollection result = apiInstance.zoneLevelAccessPoliciesListAccessPolicies(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessPoliciesApi#zoneLevelAccessPoliciesListAccessPolicies");
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

<a name="zoneLevelAccessPoliciesUpdateAnAccessPolicy"></a>
# **zoneLevelAccessPoliciesUpdateAnAccessPolicy**
> CloudflareClientAPIPoliciesComponentsSchemasSingleResponse zoneLevelAccessPoliciesUpdateAnAccessPolicy(body, uuid, uuid1, identifier)

Update an Access policy

Update a configured Access policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessPoliciesApi;

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


ZoneLevelAccessPoliciesApi apiInstance = new ZoneLevelAccessPoliciesApi();
PoliciesUuidBody2 body = new PoliciesUuidBody2(); // PoliciesUuidBody2 | 
String uuid = "uuid_example"; // String | 
String uuid1 = "uuid1_example"; // String | 
PoliciesComponentsSchemasIdentifier identifier = new PoliciesComponentsSchemasIdentifier(); // PoliciesComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIPoliciesComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessPoliciesUpdateAnAccessPolicy(body, uuid, uuid1, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessPoliciesApi#zoneLevelAccessPoliciesUpdateAnAccessPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoliciesUuidBody2**](PoliciesUuidBody2.md)|  |
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

