# DevicePostureRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**devicePostureRulesCreateDevicePostureRule**](DevicePostureRulesApi.md#devicePostureRulesCreateDevicePostureRule) | **POST** /accounts/{identifier}/devices/posture | Create Device Posture Rule
[**devicePostureRulesDeleteDevicePostureRule**](DevicePostureRulesApi.md#devicePostureRulesDeleteDevicePostureRule) | **DELETE** /accounts/{identifier}/devices/posture/{uuid} | Delete Device Posture Rule
[**devicePostureRulesDevicePostureRulesDetails**](DevicePostureRulesApi.md#devicePostureRulesDevicePostureRulesDetails) | **GET** /accounts/{identifier}/devices/posture/{uuid} | Device Posture Rules Details
[**devicePostureRulesListDevicePostureRules**](DevicePostureRulesApi.md#devicePostureRulesListDevicePostureRules) | **GET** /accounts/{identifier}/devices/posture | List Device Posture Rules
[**devicePostureRulesUpdateDevicePostureRule**](DevicePostureRulesApi.md#devicePostureRulesUpdateDevicePostureRule) | **PUT** /accounts/{identifier}/devices/posture/{uuid} | Update Device Posture Rule

<a name="devicePostureRulesCreateDevicePostureRule"></a>
# **devicePostureRulesCreateDevicePostureRule**
> DevicePostureRulesComponentsSchemasSingleResponse devicePostureRulesCreateDevicePostureRule(body, identifier)

Create Device Posture Rule

Create a new Device Posture Rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicePostureRulesApi;

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


DevicePostureRulesApi apiInstance = new DevicePostureRulesApi();
DevicesPostureBody body = new DevicesPostureBody(); // DevicesPostureBody | 
DevicePostureRulesComponentsSchemasIdentifier identifier = new DevicePostureRulesComponentsSchemasIdentifier(); // DevicePostureRulesComponentsSchemasIdentifier | 
try {
    DevicePostureRulesComponentsSchemasSingleResponse result = apiInstance.devicePostureRulesCreateDevicePostureRule(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicePostureRulesApi#devicePostureRulesCreateDevicePostureRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DevicesPostureBody**](DevicesPostureBody.md)|  |
 **identifier** | [**DevicePostureRulesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DevicePostureRulesComponentsSchemasSingleResponse**](DevicePostureRulesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicePostureRulesDeleteDevicePostureRule"></a>
# **devicePostureRulesDeleteDevicePostureRule**
> DevicePostureRulesComponentsSchemasIdResponse devicePostureRulesDeleteDevicePostureRule(uuid, identifier)

Delete Device Posture Rule

Delete a Device Posture Rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicePostureRulesApi;

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


DevicePostureRulesApi apiInstance = new DevicePostureRulesApi();
String uuid = "uuid_example"; // String | 
DevicePostureRulesComponentsSchemasIdentifier identifier = new DevicePostureRulesComponentsSchemasIdentifier(); // DevicePostureRulesComponentsSchemasIdentifier | 
try {
    DevicePostureRulesComponentsSchemasIdResponse result = apiInstance.devicePostureRulesDeleteDevicePostureRule(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicePostureRulesApi#devicePostureRulesDeleteDevicePostureRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicePostureRulesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DevicePostureRulesComponentsSchemasIdResponse**](DevicePostureRulesComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicePostureRulesDevicePostureRulesDetails"></a>
# **devicePostureRulesDevicePostureRulesDetails**
> DevicePostureRulesComponentsSchemasSingleResponse devicePostureRulesDevicePostureRulesDetails(uuid, identifier)

Device Posture Rules Details

Fetch a single Device Posture Rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicePostureRulesApi;

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


DevicePostureRulesApi apiInstance = new DevicePostureRulesApi();
String uuid = "uuid_example"; // String | 
DevicePostureRulesComponentsSchemasIdentifier identifier = new DevicePostureRulesComponentsSchemasIdentifier(); // DevicePostureRulesComponentsSchemasIdentifier | 
try {
    DevicePostureRulesComponentsSchemasSingleResponse result = apiInstance.devicePostureRulesDevicePostureRulesDetails(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicePostureRulesApi#devicePostureRulesDevicePostureRulesDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicePostureRulesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DevicePostureRulesComponentsSchemasSingleResponse**](DevicePostureRulesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicePostureRulesListDevicePostureRules"></a>
# **devicePostureRulesListDevicePostureRules**
> DevicePostureRulesComponentsSchemasResponseCollection devicePostureRulesListDevicePostureRules(identifier)

List Device Posture Rules

List Device Posture Rules for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicePostureRulesApi;

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


DevicePostureRulesApi apiInstance = new DevicePostureRulesApi();
DevicePostureRulesComponentsSchemasIdentifier identifier = new DevicePostureRulesComponentsSchemasIdentifier(); // DevicePostureRulesComponentsSchemasIdentifier | 
try {
    DevicePostureRulesComponentsSchemasResponseCollection result = apiInstance.devicePostureRulesListDevicePostureRules(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicePostureRulesApi#devicePostureRulesListDevicePostureRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DevicePostureRulesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DevicePostureRulesComponentsSchemasResponseCollection**](DevicePostureRulesComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicePostureRulesUpdateDevicePostureRule"></a>
# **devicePostureRulesUpdateDevicePostureRule**
> DevicePostureRulesComponentsSchemasSingleResponse devicePostureRulesUpdateDevicePostureRule(body, uuid, identifier)

Update Device Posture Rule

Update a Device Posture Rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicePostureRulesApi;

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


DevicePostureRulesApi apiInstance = new DevicePostureRulesApi();
PostureUuidBody body = new PostureUuidBody(); // PostureUuidBody | 
String uuid = "uuid_example"; // String | 
DevicePostureRulesComponentsSchemasIdentifier identifier = new DevicePostureRulesComponentsSchemasIdentifier(); // DevicePostureRulesComponentsSchemasIdentifier | 
try {
    DevicePostureRulesComponentsSchemasSingleResponse result = apiInstance.devicePostureRulesUpdateDevicePostureRule(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicePostureRulesApi#devicePostureRulesUpdateDevicePostureRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostureUuidBody**](PostureUuidBody.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicePostureRulesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DevicePostureRulesComponentsSchemasSingleResponse**](DevicePostureRulesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

