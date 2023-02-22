# AccessServiceTokensApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessServiceTokensCreateAServiceToken**](AccessServiceTokensApi.md#accessServiceTokensCreateAServiceToken) | **POST** /accounts/{identifier}/access/service_tokens | Create a service token
[**accessServiceTokensDeleteAServiceToken**](AccessServiceTokensApi.md#accessServiceTokensDeleteAServiceToken) | **DELETE** /accounts/{identifier}/access/service_tokens/{uuid} | Delete a service token
[**accessServiceTokensListServiceTokens**](AccessServiceTokensApi.md#accessServiceTokensListServiceTokens) | **GET** /accounts/{identifier}/access/service_tokens | List service tokens
[**accessServiceTokensRefreshAServiceToken**](AccessServiceTokensApi.md#accessServiceTokensRefreshAServiceToken) | **POST** /accounts/{identifier}/access/service_tokens/{uuid}/refresh | Refresh a service token
[**accessServiceTokensRotateAServiceToken**](AccessServiceTokensApi.md#accessServiceTokensRotateAServiceToken) | **POST** /accounts/{identifier}/access/service_tokens/{uuid}/rotate | Rotate a service token
[**accessServiceTokensUpdateAServiceToken**](AccessServiceTokensApi.md#accessServiceTokensUpdateAServiceToken) | **PUT** /accounts/{identifier}/access/service_tokens/{uuid} | Update a service token

<a name="accessServiceTokensCreateAServiceToken"></a>
# **accessServiceTokensCreateAServiceToken**
> CreateResponse accessServiceTokensCreateAServiceToken(body, identifier)

Create a service token

Generates a new service token. **Note:** This is the only time you can get the Client Secret. If you lose the Client Secret, you will have to rotate the Client Secret or create a new service token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessServiceTokensApi;

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


AccessServiceTokensApi apiInstance = new AccessServiceTokensApi();
AccessServiceTokensBody body = new AccessServiceTokensBody(); // AccessServiceTokensBody | 
String identifier = "identifier_example"; // String | 
try {
    CreateResponse result = apiInstance.accessServiceTokensCreateAServiceToken(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessServiceTokensApi#accessServiceTokensCreateAServiceToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessServiceTokensBody**](AccessServiceTokensBody.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessServiceTokensDeleteAServiceToken"></a>
# **accessServiceTokensDeleteAServiceToken**
> ServiceTokensComponentsSchemasSingleResponse accessServiceTokensDeleteAServiceToken(uuid, identifier)

Delete a service token

Deletes a service token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessServiceTokensApi;

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


AccessServiceTokensApi apiInstance = new AccessServiceTokensApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    ServiceTokensComponentsSchemasSingleResponse result = apiInstance.accessServiceTokensDeleteAServiceToken(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessServiceTokensApi#accessServiceTokensDeleteAServiceToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**ServiceTokensComponentsSchemasSingleResponse**](ServiceTokensComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessServiceTokensListServiceTokens"></a>
# **accessServiceTokensListServiceTokens**
> ServiceTokensComponentsSchemasResponseCollection accessServiceTokensListServiceTokens(identifier)

List service tokens

Lists all service tokens.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessServiceTokensApi;

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


AccessServiceTokensApi apiInstance = new AccessServiceTokensApi();
String identifier = "identifier_example"; // String | 
try {
    ServiceTokensComponentsSchemasResponseCollection result = apiInstance.accessServiceTokensListServiceTokens(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessServiceTokensApi#accessServiceTokensListServiceTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**ServiceTokensComponentsSchemasResponseCollection**](ServiceTokensComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessServiceTokensRefreshAServiceToken"></a>
# **accessServiceTokensRefreshAServiceToken**
> ServiceTokensComponentsSchemasSingleResponse accessServiceTokensRefreshAServiceToken(uuid, identifier)

Refresh a service token

Refreshes the expiration of a service token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessServiceTokensApi;

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


AccessServiceTokensApi apiInstance = new AccessServiceTokensApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    ServiceTokensComponentsSchemasSingleResponse result = apiInstance.accessServiceTokensRefreshAServiceToken(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessServiceTokensApi#accessServiceTokensRefreshAServiceToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**ServiceTokensComponentsSchemasSingleResponse**](ServiceTokensComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessServiceTokensRotateAServiceToken"></a>
# **accessServiceTokensRotateAServiceToken**
> CreateResponse accessServiceTokensRotateAServiceToken(uuid, identifier)

Rotate a service token

Generates a new Client Secret for a service token and revokes the old one.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessServiceTokensApi;

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


AccessServiceTokensApi apiInstance = new AccessServiceTokensApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CreateResponse result = apiInstance.accessServiceTokensRotateAServiceToken(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessServiceTokensApi#accessServiceTokensRotateAServiceToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessServiceTokensUpdateAServiceToken"></a>
# **accessServiceTokensUpdateAServiceToken**
> ServiceTokensComponentsSchemasSingleResponse accessServiceTokensUpdateAServiceToken(body, uuid, identifier)

Update a service token

Updates a configured service token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessServiceTokensApi;

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


AccessServiceTokensApi apiInstance = new AccessServiceTokensApi();
ServiceTokensUuidBody body = new ServiceTokensUuidBody(); // ServiceTokensUuidBody | 
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    ServiceTokensComponentsSchemasSingleResponse result = apiInstance.accessServiceTokensUpdateAServiceToken(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessServiceTokensApi#accessServiceTokensUpdateAServiceToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceTokensUuidBody**](ServiceTokensUuidBody.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**ServiceTokensComponentsSchemasSingleResponse**](ServiceTokensComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

