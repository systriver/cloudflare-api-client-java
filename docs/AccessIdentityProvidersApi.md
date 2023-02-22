# AccessIdentityProvidersApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessIdentityProvidersAddAnAccessIdentityProvider**](AccessIdentityProvidersApi.md#accessIdentityProvidersAddAnAccessIdentityProvider) | **POST** /accounts/{identifier}/access/identity_providers | Add an Access identity provider
[**accessIdentityProvidersDeleteAnAccessIdentityProvider**](AccessIdentityProvidersApi.md#accessIdentityProvidersDeleteAnAccessIdentityProvider) | **DELETE** /accounts/{identifier}/access/identity_providers/{uuid} | Delete an Access identity provider
[**accessIdentityProvidersGetAnAccessIdentityProvider**](AccessIdentityProvidersApi.md#accessIdentityProvidersGetAnAccessIdentityProvider) | **GET** /accounts/{identifier}/access/identity_providers/{uuid} | Get an Access identity provider
[**accessIdentityProvidersListAccessIdentityProviders**](AccessIdentityProvidersApi.md#accessIdentityProvidersListAccessIdentityProviders) | **GET** /accounts/{identifier}/access/identity_providers | List Access identity providers
[**accessIdentityProvidersUpdateAnAccessIdentityProvider**](AccessIdentityProvidersApi.md#accessIdentityProvidersUpdateAnAccessIdentityProvider) | **PUT** /accounts/{identifier}/access/identity_providers/{uuid} | Update an Access identity provider

<a name="accessIdentityProvidersAddAnAccessIdentityProvider"></a>
# **accessIdentityProvidersAddAnAccessIdentityProvider**
> CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse accessIdentityProvidersAddAnAccessIdentityProvider(body, identifier)

Add an Access identity provider

Adds a new identity provider to Access.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessIdentityProvidersApi;

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


AccessIdentityProvidersApi apiInstance = new AccessIdentityProvidersApi();
AccessIdentityProvidersBody body = new AccessIdentityProvidersBody(); // AccessIdentityProvidersBody | 
IdentityProvidersComponentsSchemasIdentifier identifier = new IdentityProvidersComponentsSchemasIdentifier(); // IdentityProvidersComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse result = apiInstance.accessIdentityProvidersAddAnAccessIdentityProvider(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessIdentityProvidersApi#accessIdentityProvidersAddAnAccessIdentityProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessIdentityProvidersBody**](AccessIdentityProvidersBody.md)|  |
 **identifier** | [**IdentityProvidersComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse**](CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessIdentityProvidersDeleteAnAccessIdentityProvider"></a>
# **accessIdentityProvidersDeleteAnAccessIdentityProvider**
> CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse accessIdentityProvidersDeleteAnAccessIdentityProvider(uuid, identifier)

Delete an Access identity provider

Deletes an identity provider from Access.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessIdentityProvidersApi;

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


AccessIdentityProvidersApi apiInstance = new AccessIdentityProvidersApi();
String uuid = "uuid_example"; // String | 
IdentityProvidersComponentsSchemasIdentifier identifier = new IdentityProvidersComponentsSchemasIdentifier(); // IdentityProvidersComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse result = apiInstance.accessIdentityProvidersDeleteAnAccessIdentityProvider(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessIdentityProvidersApi#accessIdentityProvidersDeleteAnAccessIdentityProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**IdentityProvidersComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse**](CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessIdentityProvidersGetAnAccessIdentityProvider"></a>
# **accessIdentityProvidersGetAnAccessIdentityProvider**
> CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse accessIdentityProvidersGetAnAccessIdentityProvider(uuid, identifier)

Get an Access identity provider

Fetches a configured identity provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessIdentityProvidersApi;

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


AccessIdentityProvidersApi apiInstance = new AccessIdentityProvidersApi();
String uuid = "uuid_example"; // String | 
IdentityProvidersComponentsSchemasIdentifier identifier = new IdentityProvidersComponentsSchemasIdentifier(); // IdentityProvidersComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse result = apiInstance.accessIdentityProvidersGetAnAccessIdentityProvider(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessIdentityProvidersApi#accessIdentityProvidersGetAnAccessIdentityProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**IdentityProvidersComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse**](CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessIdentityProvidersListAccessIdentityProviders"></a>
# **accessIdentityProvidersListAccessIdentityProviders**
> CloudflareClientAPIIdentityProvidersComponentsSchemasResponseCollection accessIdentityProvidersListAccessIdentityProviders(identifier)

List Access identity providers

Lists all configured identity providers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessIdentityProvidersApi;

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


AccessIdentityProvidersApi apiInstance = new AccessIdentityProvidersApi();
IdentityProvidersComponentsSchemasIdentifier identifier = new IdentityProvidersComponentsSchemasIdentifier(); // IdentityProvidersComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIIdentityProvidersComponentsSchemasResponseCollection result = apiInstance.accessIdentityProvidersListAccessIdentityProviders(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessIdentityProvidersApi#accessIdentityProvidersListAccessIdentityProviders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**IdentityProvidersComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIIdentityProvidersComponentsSchemasResponseCollection**](CloudflareClientAPIIdentityProvidersComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessIdentityProvidersUpdateAnAccessIdentityProvider"></a>
# **accessIdentityProvidersUpdateAnAccessIdentityProvider**
> CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse accessIdentityProvidersUpdateAnAccessIdentityProvider(body, uuid, identifier)

Update an Access identity provider

Updates a configured identity provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessIdentityProvidersApi;

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


AccessIdentityProvidersApi apiInstance = new AccessIdentityProvidersApi();
IdentityProvidersUuidBody body = new IdentityProvidersUuidBody(); // IdentityProvidersUuidBody | 
String uuid = "uuid_example"; // String | 
IdentityProvidersComponentsSchemasIdentifier identifier = new IdentityProvidersComponentsSchemasIdentifier(); // IdentityProvidersComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse result = apiInstance.accessIdentityProvidersUpdateAnAccessIdentityProvider(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessIdentityProvidersApi#accessIdentityProvidersUpdateAnAccessIdentityProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdentityProvidersUuidBody**](IdentityProvidersUuidBody.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**IdentityProvidersComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse**](CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

