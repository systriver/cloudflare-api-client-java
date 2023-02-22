# AccessApplicationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessApplicationsAddABookmarkApplication**](AccessApplicationsApi.md#accessApplicationsAddABookmarkApplication) | **POST** /accounts/{identifier}/access/apps | Add a Bookmark application
[**accessApplicationsDeleteAnAccessApplication**](AccessApplicationsApi.md#accessApplicationsDeleteAnAccessApplication) | **DELETE** /accounts/{identifier}/access/apps/{app_id} | Delete an Access application
[**accessApplicationsGetAnAccessApplication**](AccessApplicationsApi.md#accessApplicationsGetAnAccessApplication) | **GET** /accounts/{identifier}/access/apps/{app_id} | Get an Access application
[**accessApplicationsListAccessApplications**](AccessApplicationsApi.md#accessApplicationsListAccessApplications) | **GET** /accounts/{identifier}/access/apps | List Access applications
[**accessApplicationsRevokeServiceTokens**](AccessApplicationsApi.md#accessApplicationsRevokeServiceTokens) | **POST** /accounts/{identifier}/access/apps/{app_id}/revoke_tokens | Revoke service tokens
[**accessApplicationsTestAccessPolicies**](AccessApplicationsApi.md#accessApplicationsTestAccessPolicies) | **GET** /accounts/{identifier}/access/apps/{app_id}/user_policy_checks | Test Access policies
[**accessApplicationsUpdateABookmarkApplication**](AccessApplicationsApi.md#accessApplicationsUpdateABookmarkApplication) | **PUT** /accounts/{identifier}/access/apps/{app_id} | Update a Bookmark application

<a name="accessApplicationsAddABookmarkApplication"></a>
# **accessApplicationsAddABookmarkApplication**
> InlineResponse20025 accessApplicationsAddABookmarkApplication(body, identifier)

Add a Bookmark application

Adds a custom link to the App Launcher. Bookmark applications are not protected by Access.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessApplicationsApi;

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


AccessApplicationsApi apiInstance = new AccessApplicationsApi();
Object body = null; // Object | 
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    InlineResponse20025 result = apiInstance.accessApplicationsAddABookmarkApplication(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsAddABookmarkApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **identifier** | [**AppsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessApplicationsDeleteAnAccessApplication"></a>
# **accessApplicationsDeleteAnAccessApplication**
> AppsComponentsSchemasIdResponse accessApplicationsDeleteAnAccessApplication(appId, identifier)

Delete an Access application

Deletes an application from Access.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessApplicationsApi;

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


AccessApplicationsApi apiInstance = new AccessApplicationsApi();
SchemasAppId appId = new SchemasAppId(); // SchemasAppId | 
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    AppsComponentsSchemasIdResponse result = apiInstance.accessApplicationsDeleteAnAccessApplication(appId, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsDeleteAnAccessApplication");
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

<a name="accessApplicationsGetAnAccessApplication"></a>
# **accessApplicationsGetAnAccessApplication**
> AppsComponentsSchemasSingleResponse accessApplicationsGetAnAccessApplication(appId, identifier)

Get an Access application

Fetches information about an Access application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessApplicationsApi;

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


AccessApplicationsApi apiInstance = new AccessApplicationsApi();
SchemasAppId appId = new SchemasAppId(); // SchemasAppId | 
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    AppsComponentsSchemasSingleResponse result = apiInstance.accessApplicationsGetAnAccessApplication(appId, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsGetAnAccessApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**SchemasAppId**](.md)|  |
 **identifier** | [**AppsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**AppsComponentsSchemasSingleResponse**](AppsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessApplicationsListAccessApplications"></a>
# **accessApplicationsListAccessApplications**
> AppsComponentsSchemasResponseCollection accessApplicationsListAccessApplications(identifier)

List Access applications

Lists all Access applications in an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessApplicationsApi;

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


AccessApplicationsApi apiInstance = new AccessApplicationsApi();
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    AppsComponentsSchemasResponseCollection result = apiInstance.accessApplicationsListAccessApplications(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsListAccessApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**AppsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**AppsComponentsSchemasResponseCollection**](AppsComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessApplicationsRevokeServiceTokens"></a>
# **accessApplicationsRevokeServiceTokens**
> ComponentsSchemasEmptyResponse accessApplicationsRevokeServiceTokens(appId, identifier)

Revoke service tokens

Revokes all service tokens used by an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessApplicationsApi;

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


AccessApplicationsApi apiInstance = new AccessApplicationsApi();
SchemasAppId appId = new SchemasAppId(); // SchemasAppId | 
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    ComponentsSchemasEmptyResponse result = apiInstance.accessApplicationsRevokeServiceTokens(appId, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsRevokeServiceTokens");
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

<a name="accessApplicationsTestAccessPolicies"></a>
# **accessApplicationsTestAccessPolicies**
> PolicyCheckResponse accessApplicationsTestAccessPolicies(appId, identifier)

Test Access policies

Tests if a specific user has permission to access an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessApplicationsApi;

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


AccessApplicationsApi apiInstance = new AccessApplicationsApi();
SchemasAppId appId = new SchemasAppId(); // SchemasAppId | 
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    PolicyCheckResponse result = apiInstance.accessApplicationsTestAccessPolicies(appId, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsTestAccessPolicies");
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

<a name="accessApplicationsUpdateABookmarkApplication"></a>
# **accessApplicationsUpdateABookmarkApplication**
> InlineResponse20025 accessApplicationsUpdateABookmarkApplication(body, appId, identifier)

Update a Bookmark application

Updates a Bookmark application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessApplicationsApi;

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


AccessApplicationsApi apiInstance = new AccessApplicationsApi();
Object body = null; // Object | 
SchemasAppId appId = new SchemasAppId(); // SchemasAppId | 
AppsComponentsSchemasIdentifier identifier = new AppsComponentsSchemasIdentifier(); // AppsComponentsSchemasIdentifier | 
try {
    InlineResponse20025 result = apiInstance.accessApplicationsUpdateABookmarkApplication(body, appId, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessApplicationsApi#accessApplicationsUpdateABookmarkApplication");
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

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

