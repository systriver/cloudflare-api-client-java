# ZoneLevelAccessApplicationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneLevelAccessApplicationsAddABookmarkApplication**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsAddABookmarkApplication) | **POST** /zones/{identifier}/access/apps | Add a Bookmark application
[**zoneLevelAccessApplicationsDeleteAnAccessApplication**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsDeleteAnAccessApplication) | **DELETE** /zones/{identifier}/access/apps/{app_id} | Delete an Access application
[**zoneLevelAccessApplicationsGetAnAccessApplication**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsGetAnAccessApplication) | **GET** /zones/{identifier}/access/apps/{app_id} | Get an Access application
[**zoneLevelAccessApplicationsListAccessApplications**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsListAccessApplications) | **GET** /zones/{identifier}/access/apps | List Access Applications
[**zoneLevelAccessApplicationsRevokeServiceTokens**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsRevokeServiceTokens) | **POST** /zones/{identifier}/access/apps/{app_id}/revoke_tokens | Revoke service tokens
[**zoneLevelAccessApplicationsTestAccessPolicies**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsTestAccessPolicies) | **GET** /zones/{identifier}/access/apps/{app_id}/user_policy_checks | Test Access policies
[**zoneLevelAccessApplicationsUpdateABookmarkApplication**](ZoneLevelAccessApplicationsApi.md#zoneLevelAccessApplicationsUpdateABookmarkApplication) | **PUT** /zones/{identifier}/access/apps/{app_id} | Update a Bookmark application

<a name="zoneLevelAccessApplicationsAddABookmarkApplication"></a>
# **zoneLevelAccessApplicationsAddABookmarkApplication**
> InlineResponse200106 zoneLevelAccessApplicationsAddABookmarkApplication(body, identifier)

Add a Bookmark application

Adds a custom link to the App Launcher. Bookmark applications are not protected by Access.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessApplicationsApi;

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


ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi();
Object body = null; // Object | 
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    InlineResponse200106 result = apiInstance.zoneLevelAccessApplicationsAddABookmarkApplication(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsAddABookmarkApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **identifier** | [**AppsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**InlineResponse200106**](InlineResponse200106.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLevelAccessApplicationsDeleteAnAccessApplication"></a>
# **zoneLevelAccessApplicationsDeleteAnAccessApplication**
> AppsComponentsSchemasIdResponse zoneLevelAccessApplicationsDeleteAnAccessApplication(appId, identifier)

Delete an Access application

Deletes an application from Access.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessApplicationsApi;

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


ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi();
SchemasAppId appId = new SchemasAppId(); // SchemasAppId | 
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    AppsComponentsSchemasIdResponse result = apiInstance.zoneLevelAccessApplicationsDeleteAnAccessApplication(appId, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsDeleteAnAccessApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**SchemasAppId**](.md)|  |
 **identifier** | [**AppsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**AppsComponentsSchemasIdResponse**](AppsComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLevelAccessApplicationsGetAnAccessApplication"></a>
# **zoneLevelAccessApplicationsGetAnAccessApplication**
> AppsComponentsSchemasSingleResponse2 zoneLevelAccessApplicationsGetAnAccessApplication(appId, identifier)

Get an Access application

Fetches information about an Access application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessApplicationsApi;

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


ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi();
SchemasAppId appId = new SchemasAppId(); // SchemasAppId | 
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    AppsComponentsSchemasSingleResponse2 result = apiInstance.zoneLevelAccessApplicationsGetAnAccessApplication(appId, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsGetAnAccessApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**SchemasAppId**](.md)|  |
 **identifier** | [**AppsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**AppsComponentsSchemasSingleResponse2**](AppsComponentsSchemasSingleResponse2.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneLevelAccessApplicationsListAccessApplications"></a>
# **zoneLevelAccessApplicationsListAccessApplications**
> AppsComponentsSchemasResponseCollection2 zoneLevelAccessApplicationsListAccessApplications(identifier)

List Access Applications

List all Access Applications in a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessApplicationsApi;

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


ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi();
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    AppsComponentsSchemasResponseCollection2 result = apiInstance.zoneLevelAccessApplicationsListAccessApplications(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsListAccessApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**AppsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**AppsComponentsSchemasResponseCollection2**](AppsComponentsSchemasResponseCollection2.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneLevelAccessApplicationsRevokeServiceTokens"></a>
# **zoneLevelAccessApplicationsRevokeServiceTokens**
> ComponentsSchemasEmptyResponse zoneLevelAccessApplicationsRevokeServiceTokens(appId, identifier)

Revoke service tokens

Revokes all service tokens used by an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessApplicationsApi;

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


ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi();
SchemasAppId appId = new SchemasAppId(); // SchemasAppId | 
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    ComponentsSchemasEmptyResponse result = apiInstance.zoneLevelAccessApplicationsRevokeServiceTokens(appId, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsRevokeServiceTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**SchemasAppId**](.md)|  |
 **identifier** | [**AppsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ComponentsSchemasEmptyResponse**](ComponentsSchemasEmptyResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLevelAccessApplicationsTestAccessPolicies"></a>
# **zoneLevelAccessApplicationsTestAccessPolicies**
> PolicyCheckResponse zoneLevelAccessApplicationsTestAccessPolicies(appId, identifier)

Test Access policies

Tests if a specific user has permission to access an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessApplicationsApi;

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


ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi();
SchemasAppId appId = new SchemasAppId(); // SchemasAppId | 
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    PolicyCheckResponse result = apiInstance.zoneLevelAccessApplicationsTestAccessPolicies(appId, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsTestAccessPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**SchemasAppId**](.md)|  |
 **identifier** | [**AppsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**PolicyCheckResponse**](PolicyCheckResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneLevelAccessApplicationsUpdateABookmarkApplication"></a>
# **zoneLevelAccessApplicationsUpdateABookmarkApplication**
> InlineResponse200106 zoneLevelAccessApplicationsUpdateABookmarkApplication(body, appId, identifier)

Update a Bookmark application

Updates a Bookmark application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessApplicationsApi;

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


ZoneLevelAccessApplicationsApi apiInstance = new ZoneLevelAccessApplicationsApi();
Object body = null; // Object | 
SchemasAppId appId = new SchemasAppId(); // SchemasAppId | 
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    InlineResponse200106 result = apiInstance.zoneLevelAccessApplicationsUpdateABookmarkApplication(body, appId, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessApplicationsApi#zoneLevelAccessApplicationsUpdateABookmarkApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **appId** | [**SchemasAppId**](.md)|  |
 **identifier** | [**AppsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**InlineResponse200106**](InlineResponse200106.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

