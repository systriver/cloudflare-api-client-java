# ZoneLevelAccessServiceTokensApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneLevelAccessServiceTokensCreateAServiceToken**](ZoneLevelAccessServiceTokensApi.md#zoneLevelAccessServiceTokensCreateAServiceToken) | **POST** /zones/{identifier}/access/service_tokens | Create a service token
[**zoneLevelAccessServiceTokensDeleteAServiceToken**](ZoneLevelAccessServiceTokensApi.md#zoneLevelAccessServiceTokensDeleteAServiceToken) | **DELETE** /zones/{identifier}/access/service_tokens/{uuid} | Delete a service token
[**zoneLevelAccessServiceTokensListServiceTokens**](ZoneLevelAccessServiceTokensApi.md#zoneLevelAccessServiceTokensListServiceTokens) | **GET** /zones/{identifier}/access/service_tokens | List service tokens
[**zoneLevelAccessServiceTokensUpdateAServiceToken**](ZoneLevelAccessServiceTokensApi.md#zoneLevelAccessServiceTokensUpdateAServiceToken) | **PUT** /zones/{identifier}/access/service_tokens/{uuid} | Update a service token

<a name="zoneLevelAccessServiceTokensCreateAServiceToken"></a>
# **zoneLevelAccessServiceTokensCreateAServiceToken**
> CreateResponse zoneLevelAccessServiceTokensCreateAServiceToken(body, identifier)

Create a service token

Generates a new service token. **Note:** This is the only time you can get the Client Secret. If you lose the Client Secret, you will have to create a new service token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessServiceTokensApi;

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


ZoneLevelAccessServiceTokensApi apiInstance = new ZoneLevelAccessServiceTokensApi();
AccessServiceTokensBody1 body = new AccessServiceTokensBody1(); // AccessServiceTokensBody1 | 
String identifier = "identifier_example"; // String | 
try {
    CreateResponse result = apiInstance.zoneLevelAccessServiceTokensCreateAServiceToken(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessServiceTokensApi#zoneLevelAccessServiceTokensCreateAServiceToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessServiceTokensBody1**](AccessServiceTokensBody1.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLevelAccessServiceTokensDeleteAServiceToken"></a>
# **zoneLevelAccessServiceTokensDeleteAServiceToken**
> ServiceTokensComponentsSchemasSingleResponse zoneLevelAccessServiceTokensDeleteAServiceToken(uuid, identifier)

Delete a service token

Deletes a service token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessServiceTokensApi;

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


ZoneLevelAccessServiceTokensApi apiInstance = new ZoneLevelAccessServiceTokensApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    ServiceTokensComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessServiceTokensDeleteAServiceToken(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessServiceTokensApi#zoneLevelAccessServiceTokensDeleteAServiceToken");
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

<a name="zoneLevelAccessServiceTokensListServiceTokens"></a>
# **zoneLevelAccessServiceTokensListServiceTokens**
> ServiceTokensComponentsSchemasResponseCollection zoneLevelAccessServiceTokensListServiceTokens(identifier)

List service tokens

Lists all service tokens.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessServiceTokensApi;

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


ZoneLevelAccessServiceTokensApi apiInstance = new ZoneLevelAccessServiceTokensApi();
String identifier = "identifier_example"; // String | 
try {
    ServiceTokensComponentsSchemasResponseCollection result = apiInstance.zoneLevelAccessServiceTokensListServiceTokens(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessServiceTokensApi#zoneLevelAccessServiceTokensListServiceTokens");
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

<a name="zoneLevelAccessServiceTokensUpdateAServiceToken"></a>
# **zoneLevelAccessServiceTokensUpdateAServiceToken**
> ServiceTokensComponentsSchemasSingleResponse zoneLevelAccessServiceTokensUpdateAServiceToken(body, uuid, identifier)

Update a service token

Updates a configured service token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessServiceTokensApi;

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


ZoneLevelAccessServiceTokensApi apiInstance = new ZoneLevelAccessServiceTokensApi();
ServiceTokensUuidBody1 body = new ServiceTokensUuidBody1(); // ServiceTokensUuidBody1 | 
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    ServiceTokensComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessServiceTokensUpdateAServiceToken(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessServiceTokensApi#zoneLevelAccessServiceTokensUpdateAServiceToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceTokensUuidBody1**](ServiceTokensUuidBody1.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**ServiceTokensComponentsSchemasSingleResponse**](ServiceTokensComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

