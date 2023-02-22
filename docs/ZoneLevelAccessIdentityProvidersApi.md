# ZoneLevelAccessIdentityProvidersApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider**](ZoneLevelAccessIdentityProvidersApi.md#zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider) | **POST** /zones/{identifier}/access/identity_providers | Add an Access identity provider
[**zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider**](ZoneLevelAccessIdentityProvidersApi.md#zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider) | **DELETE** /zones/{identifier}/access/identity_providers/{uuid} | Delete an Access identity provider
[**zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider**](ZoneLevelAccessIdentityProvidersApi.md#zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider) | **GET** /zones/{identifier}/access/identity_providers/{uuid} | Get an Access identity provider
[**zoneLevelAccessIdentityProvidersListAccessIdentityProviders**](ZoneLevelAccessIdentityProvidersApi.md#zoneLevelAccessIdentityProvidersListAccessIdentityProviders) | **GET** /zones/{identifier}/access/identity_providers | List Access identity providers
[**zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider**](ZoneLevelAccessIdentityProvidersApi.md#zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider) | **PUT** /zones/{identifier}/access/identity_providers/{uuid} | Update an Access identity provider

<a name="zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider"></a>
# **zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider**
> CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider(body, identifier)

Add an Access identity provider

Adds a new identity provider to Access.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessIdentityProvidersApi;

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


ZoneLevelAccessIdentityProvidersApi apiInstance = new ZoneLevelAccessIdentityProvidersApi();
AccessIdentityProvidersBody1 body = new AccessIdentityProvidersBody1(); // AccessIdentityProvidersBody1 | 
IdentityProvidersComponentsSchemasIdentifier identifier = new IdentityProvidersComponentsSchemasIdentifier(); // IdentityProvidersComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessIdentityProvidersApi#zoneLevelAccessIdentityProvidersAddAnAccessIdentityProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessIdentityProvidersBody1**](AccessIdentityProvidersBody1.md)|  |
 **identifier** | [**IdentityProvidersComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse**](CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider"></a>
# **zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider**
> CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider(uuid, identifier)

Delete an Access identity provider

Deletes an identity provider from Access.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessIdentityProvidersApi;

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


ZoneLevelAccessIdentityProvidersApi apiInstance = new ZoneLevelAccessIdentityProvidersApi();
String uuid = "uuid_example"; // String | 
IdentityProvidersComponentsSchemasIdentifier identifier = new IdentityProvidersComponentsSchemasIdentifier(); // IdentityProvidersComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessIdentityProvidersApi#zoneLevelAccessIdentityProvidersDeleteAnAccessIdentityProvider");
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

<a name="zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider"></a>
# **zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider**
> CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider(uuid, identifier)

Get an Access identity provider

Fetches a configured identity provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessIdentityProvidersApi;

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


ZoneLevelAccessIdentityProvidersApi apiInstance = new ZoneLevelAccessIdentityProvidersApi();
String uuid = "uuid_example"; // String | 
IdentityProvidersComponentsSchemasIdentifier identifier = new IdentityProvidersComponentsSchemasIdentifier(); // IdentityProvidersComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessIdentityProvidersApi#zoneLevelAccessIdentityProvidersGetAnAccessIdentityProvider");
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

<a name="zoneLevelAccessIdentityProvidersListAccessIdentityProviders"></a>
# **zoneLevelAccessIdentityProvidersListAccessIdentityProviders**
> CloudflareClientAPIIdentityProvidersComponentsSchemasResponseCollection zoneLevelAccessIdentityProvidersListAccessIdentityProviders(identifier)

List Access identity providers

Lists all configured identity providers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessIdentityProvidersApi;

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


ZoneLevelAccessIdentityProvidersApi apiInstance = new ZoneLevelAccessIdentityProvidersApi();
IdentityProvidersComponentsSchemasIdentifier identifier = new IdentityProvidersComponentsSchemasIdentifier(); // IdentityProvidersComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIIdentityProvidersComponentsSchemasResponseCollection result = apiInstance.zoneLevelAccessIdentityProvidersListAccessIdentityProviders(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessIdentityProvidersApi#zoneLevelAccessIdentityProvidersListAccessIdentityProviders");
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

<a name="zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider"></a>
# **zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider**
> CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider(body, uuid, identifier)

Update an Access identity provider

Updates a configured identity provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessIdentityProvidersApi;

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


ZoneLevelAccessIdentityProvidersApi apiInstance = new ZoneLevelAccessIdentityProvidersApi();
IdentityProvidersUuidBody1 body = new IdentityProvidersUuidBody1(); // IdentityProvidersUuidBody1 | 
String uuid = "uuid_example"; // String | 
IdentityProvidersComponentsSchemasIdentifier identifier = new IdentityProvidersComponentsSchemasIdentifier(); // IdentityProvidersComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessIdentityProvidersApi#zoneLevelAccessIdentityProvidersUpdateAnAccessIdentityProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdentityProvidersUuidBody1**](IdentityProvidersUuidBody1.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**IdentityProvidersComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse**](CloudflareClientAPIIdentityProvidersComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

