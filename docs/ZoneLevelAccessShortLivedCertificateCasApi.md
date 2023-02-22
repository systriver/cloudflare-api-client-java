# ZoneLevelAccessShortLivedCertificateCasApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa**](ZoneLevelAccessShortLivedCertificateCasApi.md#zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa) | **POST** /zones/{identifier}/access/apps/{uuid}/ca | Create a short-lived certificate CA
[**zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa**](ZoneLevelAccessShortLivedCertificateCasApi.md#zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa) | **DELETE** /zones/{identifier}/access/apps/{uuid}/ca | Delete a short-lived certificate CA
[**zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa**](ZoneLevelAccessShortLivedCertificateCasApi.md#zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa) | **GET** /zones/{identifier}/access/apps/{uuid}/ca | Get a short-lived certificate CA
[**zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs**](ZoneLevelAccessShortLivedCertificateCasApi.md#zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs) | **GET** /zones/{identifier}/access/apps/ca | List short-lived certificate CAs

<a name="zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa"></a>
# **zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa**
> CaComponentsSchemasSingleResponse zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa(uuid, identifier)

Create a short-lived certificate CA

Generates a new short-lived certificate CA and public key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessShortLivedCertificateCasApi;

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


ZoneLevelAccessShortLivedCertificateCasApi apiInstance = new ZoneLevelAccessShortLivedCertificateCasApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CaComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessShortLivedCertificateCasApi#zoneLevelAccessShortLivedCertificateCAsCreateAShortLivedCertificateCa");
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

<a name="zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa"></a>
# **zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa**
> CaComponentsSchemasIdResponse zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa(uuid, identifier)

Delete a short-lived certificate CA

Deletes a short-lived certificate CA.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessShortLivedCertificateCasApi;

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


ZoneLevelAccessShortLivedCertificateCasApi apiInstance = new ZoneLevelAccessShortLivedCertificateCasApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CaComponentsSchemasIdResponse result = apiInstance.zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessShortLivedCertificateCasApi#zoneLevelAccessShortLivedCertificateCAsDeleteAShortLivedCertificateCa");
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

<a name="zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa"></a>
# **zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa**
> CaComponentsSchemasSingleResponse zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa(uuid, identifier)

Get a short-lived certificate CA

Fetches a short-lived certificate CA and its public key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessShortLivedCertificateCasApi;

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


ZoneLevelAccessShortLivedCertificateCasApi apiInstance = new ZoneLevelAccessShortLivedCertificateCasApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CaComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessShortLivedCertificateCasApi#zoneLevelAccessShortLivedCertificateCAsGetAShortLivedCertificateCa");
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

<a name="zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs"></a>
# **zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs**
> CloudflareClientAPICaComponentsSchemasResponseCollection zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs(identifier)

List short-lived certificate CAs

Lists short-lived certificate CAs and their public keys.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessShortLivedCertificateCasApi;

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


ZoneLevelAccessShortLivedCertificateCasApi apiInstance = new ZoneLevelAccessShortLivedCertificateCasApi();
String identifier = "identifier_example"; // String | 
try {
    CloudflareClientAPICaComponentsSchemasResponseCollection result = apiInstance.zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessShortLivedCertificateCasApi#zoneLevelAccessShortLivedCertificateCAsListShortLivedCertificateCAs");
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

