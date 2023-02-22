# DeviceDexTestsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deviceDexTestCreateDeviceDexTest**](DeviceDexTestsApi.md#deviceDexTestCreateDeviceDexTest) | **POST** /accounts/{identifier}/devices/dex_tests | Create Device DEX test
[**deviceDexTestDeleteDeviceDexTest**](DeviceDexTestsApi.md#deviceDexTestDeleteDeviceDexTest) | **DELETE** /accounts/{identifier}/devices/dex_tests/{uuid} | Delete Device DEX test
[**deviceDexTestDetails**](DeviceDexTestsApi.md#deviceDexTestDetails) | **GET** /accounts/{identifier}/devices/dex_tests | List Device DEX tests
[**deviceDexTestGetDeviceDexTest**](DeviceDexTestsApi.md#deviceDexTestGetDeviceDexTest) | **GET** /accounts/{identifier}/devices/dex_tests/{uuid} | Get Device DEX test
[**deviceDexTestUpdateDeviceDexTest**](DeviceDexTestsApi.md#deviceDexTestUpdateDeviceDexTest) | **PUT** /accounts/{identifier}/devices/dex_tests/{uuid} | Update Device DEX test

<a name="deviceDexTestCreateDeviceDexTest"></a>
# **deviceDexTestCreateDeviceDexTest**
> DexSingleResponse deviceDexTestCreateDeviceDexTest(body, identifier)

Create Device DEX test

Create a DEX test.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeviceDexTestsApi;

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


DeviceDexTestsApi apiInstance = new DeviceDexTestsApi();
DeviceDexTestSchemasHttp body = new DeviceDexTestSchemasHttp(); // DeviceDexTestSchemasHttp | 
String identifier = "identifier_example"; // String | 
try {
    DexSingleResponse result = apiInstance.deviceDexTestCreateDeviceDexTest(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDexTestsApi#deviceDexTestCreateDeviceDexTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeviceDexTestSchemasHttp**](DeviceDexTestSchemasHttp.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**DexSingleResponse**](DexSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceDexTestDeleteDeviceDexTest"></a>
# **deviceDexTestDeleteDeviceDexTest**
> DexResponseCollection deviceDexTestDeleteDeviceDexTest(identifier, uuid)

Delete Device DEX test

Delete a Device DEX test. Returns the remaining device dex tests for the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeviceDexTestsApi;

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


DeviceDexTestsApi apiInstance = new DeviceDexTestsApi();
String identifier = "identifier_example"; // String | 
String uuid = "uuid_example"; // String | 
try {
    DexResponseCollection result = apiInstance.deviceDexTestDeleteDeviceDexTest(identifier, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDexTestsApi#deviceDexTestDeleteDeviceDexTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **uuid** | [**String**](.md)|  |

### Return type

[**DexResponseCollection**](DexResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deviceDexTestDetails"></a>
# **deviceDexTestDetails**
> DexResponseCollection deviceDexTestDetails(identifier)

List Device DEX tests

Fetch all DEX tests.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeviceDexTestsApi;

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


DeviceDexTestsApi apiInstance = new DeviceDexTestsApi();
String identifier = "identifier_example"; // String | 
try {
    DexResponseCollection result = apiInstance.deviceDexTestDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDexTestsApi#deviceDexTestDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**DexResponseCollection**](DexResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deviceDexTestGetDeviceDexTest"></a>
# **deviceDexTestGetDeviceDexTest**
> DexSingleResponse deviceDexTestGetDeviceDexTest(identifier, uuid)

Get Device DEX test

Fetch a single DEX test.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeviceDexTestsApi;

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


DeviceDexTestsApi apiInstance = new DeviceDexTestsApi();
String identifier = "identifier_example"; // String | 
String uuid = "uuid_example"; // String | 
try {
    DexSingleResponse result = apiInstance.deviceDexTestGetDeviceDexTest(identifier, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDexTestsApi#deviceDexTestGetDeviceDexTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **uuid** | [**String**](.md)|  |

### Return type

[**DexSingleResponse**](DexSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deviceDexTestUpdateDeviceDexTest"></a>
# **deviceDexTestUpdateDeviceDexTest**
> DexSingleResponse deviceDexTestUpdateDeviceDexTest(body, identifier, uuid)

Update Device DEX test

Update a DEX test.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeviceDexTestsApi;

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


DeviceDexTestsApi apiInstance = new DeviceDexTestsApi();
DeviceDexTestSchemasHttp body = new DeviceDexTestSchemasHttp(); // DeviceDexTestSchemasHttp | 
String identifier = "identifier_example"; // String | 
String uuid = "uuid_example"; // String | 
try {
    DexSingleResponse result = apiInstance.deviceDexTestUpdateDeviceDexTest(body, identifier, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceDexTestsApi#deviceDexTestUpdateDeviceDexTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeviceDexTestSchemasHttp**](DeviceDexTestSchemasHttp.md)|  |
 **identifier** | [**String**](.md)|  |
 **uuid** | [**String**](.md)|  |

### Return type

[**DexSingleResponse**](DexSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

