# AccessShortLivedCertificateCasApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessShortLivedCertificateCAsCreateAShortLivedCertificateCa**](AccessShortLivedCertificateCasApi.md#accessShortLivedCertificateCAsCreateAShortLivedCertificateCa) | **POST** /accounts/{identifier}/access/apps/{uuid}/ca | Create a short-lived certificate CA
[**accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa**](AccessShortLivedCertificateCasApi.md#accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa) | **DELETE** /accounts/{identifier}/access/apps/{uuid}/ca | Delete a short-lived certificate CA
[**accessShortLivedCertificateCAsGetAShortLivedCertificateCa**](AccessShortLivedCertificateCasApi.md#accessShortLivedCertificateCAsGetAShortLivedCertificateCa) | **GET** /accounts/{identifier}/access/apps/{uuid}/ca | Get a short-lived certificate CA
[**accessShortLivedCertificateCAsListShortLivedCertificateCAs**](AccessShortLivedCertificateCasApi.md#accessShortLivedCertificateCAsListShortLivedCertificateCAs) | **GET** /accounts/{identifier}/access/apps/ca | List short-lived certificate CAs

<a name="accessShortLivedCertificateCAsCreateAShortLivedCertificateCa"></a>
# **accessShortLivedCertificateCAsCreateAShortLivedCertificateCa**
> CaComponentsSchemasSingleResponse accessShortLivedCertificateCAsCreateAShortLivedCertificateCa(uuid, identifier)

Create a short-lived certificate CA

Generates a new short-lived certificate CA and public key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessShortLivedCertificateCasApi;

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


AccessShortLivedCertificateCasApi apiInstance = new AccessShortLivedCertificateCasApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CaComponentsSchemasSingleResponse result = apiInstance.accessShortLivedCertificateCAsCreateAShortLivedCertificateCa(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessShortLivedCertificateCasApi#accessShortLivedCertificateCAsCreateAShortLivedCertificateCa");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CaComponentsSchemasSingleResponse**](CaComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa"></a>
# **accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa**
> CaComponentsSchemasIdResponse accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa(uuid, identifier)

Delete a short-lived certificate CA

Deletes a short-lived certificate CA.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessShortLivedCertificateCasApi;

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


AccessShortLivedCertificateCasApi apiInstance = new AccessShortLivedCertificateCasApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CaComponentsSchemasIdResponse result = apiInstance.accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessShortLivedCertificateCasApi#accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CaComponentsSchemasIdResponse**](CaComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessShortLivedCertificateCAsGetAShortLivedCertificateCa"></a>
# **accessShortLivedCertificateCAsGetAShortLivedCertificateCa**
> CaComponentsSchemasSingleResponse accessShortLivedCertificateCAsGetAShortLivedCertificateCa(uuid, identifier)

Get a short-lived certificate CA

Fetches a short-lived certificate CA and its public key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessShortLivedCertificateCasApi;

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


AccessShortLivedCertificateCasApi apiInstance = new AccessShortLivedCertificateCasApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CaComponentsSchemasSingleResponse result = apiInstance.accessShortLivedCertificateCAsGetAShortLivedCertificateCa(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessShortLivedCertificateCasApi#accessShortLivedCertificateCAsGetAShortLivedCertificateCa");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CaComponentsSchemasSingleResponse**](CaComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessShortLivedCertificateCAsListShortLivedCertificateCAs"></a>
# **accessShortLivedCertificateCAsListShortLivedCertificateCAs**
> CloudflareClientAPICaComponentsSchemasResponseCollection accessShortLivedCertificateCAsListShortLivedCertificateCAs(identifier)

List short-lived certificate CAs

Lists short-lived certificate CAs and their public keys.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessShortLivedCertificateCasApi;

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


AccessShortLivedCertificateCasApi apiInstance = new AccessShortLivedCertificateCasApi();
String identifier = "identifier_example"; // String | 
try {
    CloudflareClientAPICaComponentsSchemasResponseCollection result = apiInstance.accessShortLivedCertificateCAsListShortLivedCertificateCAs(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessShortLivedCertificateCasApi#accessShortLivedCertificateCAsListShortLivedCertificateCAs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPICaComponentsSchemasResponseCollection**](CloudflareClientAPICaComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

