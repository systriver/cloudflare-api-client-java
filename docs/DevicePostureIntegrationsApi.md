# DevicePostureIntegrationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**devicePostureIntegrationsCreateDevicePostureIntegration**](DevicePostureIntegrationsApi.md#devicePostureIntegrationsCreateDevicePostureIntegration) | **POST** /accounts/{identifier}/devices/posture/integration | Create Device Posture Integration
[**devicePostureIntegrationsDeleteDevicePostureIntegration**](DevicePostureIntegrationsApi.md#devicePostureIntegrationsDeleteDevicePostureIntegration) | **DELETE** /accounts/{identifier}/devices/posture/integration/{uuid} | Delete Device Posture Integration
[**devicePostureIntegrationsDevicePostureIntegrationDetails**](DevicePostureIntegrationsApi.md#devicePostureIntegrationsDevicePostureIntegrationDetails) | **GET** /accounts/{identifier}/devices/posture/integration/{uuid} | Device Posture Integration Details
[**devicePostureIntegrationsListDevicePostureIntegrations**](DevicePostureIntegrationsApi.md#devicePostureIntegrationsListDevicePostureIntegrations) | **GET** /accounts/{identifier}/devices/posture/integration | List Device Posture Integrations
[**devicePostureIntegrationsUpdateDevicePostureIntegration**](DevicePostureIntegrationsApi.md#devicePostureIntegrationsUpdateDevicePostureIntegration) | **PATCH** /accounts/{identifier}/devices/posture/integration/{uuid} | Update Device Posture Integration

<a name="devicePostureIntegrationsCreateDevicePostureIntegration"></a>
# **devicePostureIntegrationsCreateDevicePostureIntegration**
> DevicePostureIntegrationsComponentsSchemasSingleResponse devicePostureIntegrationsCreateDevicePostureIntegration(body, identifier)

Create Device Posture Integration

Create a new Device Posture Integration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicePostureIntegrationsApi;

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


DevicePostureIntegrationsApi apiInstance = new DevicePostureIntegrationsApi();
PostureIntegrationBody body = new PostureIntegrationBody(); // PostureIntegrationBody | 
DevicePostureIntegrationsComponentsSchemasIdentifier identifier = new DevicePostureIntegrationsComponentsSchemasIdentifier(); // DevicePostureIntegrationsComponentsSchemasIdentifier | 
try {
    DevicePostureIntegrationsComponentsSchemasSingleResponse result = apiInstance.devicePostureIntegrationsCreateDevicePostureIntegration(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicePostureIntegrationsApi#devicePostureIntegrationsCreateDevicePostureIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostureIntegrationBody**](PostureIntegrationBody.md)|  |
 **identifier** | [**DevicePostureIntegrationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DevicePostureIntegrationsComponentsSchemasSingleResponse**](DevicePostureIntegrationsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicePostureIntegrationsDeleteDevicePostureIntegration"></a>
# **devicePostureIntegrationsDeleteDevicePostureIntegration**
> DevicePostureIntegrationsComponentsSchemasIdResponse devicePostureIntegrationsDeleteDevicePostureIntegration(uuid, identifier)

Delete Device Posture Integration

Delete a Device Posture Integration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicePostureIntegrationsApi;

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


DevicePostureIntegrationsApi apiInstance = new DevicePostureIntegrationsApi();
String uuid = "uuid_example"; // String | 
DevicePostureIntegrationsComponentsSchemasIdentifier identifier = new DevicePostureIntegrationsComponentsSchemasIdentifier(); // DevicePostureIntegrationsComponentsSchemasIdentifier | 
try {
    DevicePostureIntegrationsComponentsSchemasIdResponse result = apiInstance.devicePostureIntegrationsDeleteDevicePostureIntegration(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicePostureIntegrationsApi#devicePostureIntegrationsDeleteDevicePostureIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicePostureIntegrationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DevicePostureIntegrationsComponentsSchemasIdResponse**](DevicePostureIntegrationsComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicePostureIntegrationsDevicePostureIntegrationDetails"></a>
# **devicePostureIntegrationsDevicePostureIntegrationDetails**
> DevicePostureIntegrationsComponentsSchemasSingleResponse devicePostureIntegrationsDevicePostureIntegrationDetails(uuid, identifier)

Device Posture Integration Details

Fetch a single Device Posture Integration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicePostureIntegrationsApi;

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


DevicePostureIntegrationsApi apiInstance = new DevicePostureIntegrationsApi();
String uuid = "uuid_example"; // String | 
DevicePostureIntegrationsComponentsSchemasIdentifier identifier = new DevicePostureIntegrationsComponentsSchemasIdentifier(); // DevicePostureIntegrationsComponentsSchemasIdentifier | 
try {
    DevicePostureIntegrationsComponentsSchemasSingleResponse result = apiInstance.devicePostureIntegrationsDevicePostureIntegrationDetails(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicePostureIntegrationsApi#devicePostureIntegrationsDevicePostureIntegrationDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicePostureIntegrationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DevicePostureIntegrationsComponentsSchemasSingleResponse**](DevicePostureIntegrationsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicePostureIntegrationsListDevicePostureIntegrations"></a>
# **devicePostureIntegrationsListDevicePostureIntegrations**
> DevicePostureIntegrationsComponentsSchemasResponseCollection devicePostureIntegrationsListDevicePostureIntegrations(identifier)

List Device Posture Integrations

List Device Posture Integrations for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicePostureIntegrationsApi;

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


DevicePostureIntegrationsApi apiInstance = new DevicePostureIntegrationsApi();
DevicePostureIntegrationsComponentsSchemasIdentifier identifier = new DevicePostureIntegrationsComponentsSchemasIdentifier(); // DevicePostureIntegrationsComponentsSchemasIdentifier | 
try {
    DevicePostureIntegrationsComponentsSchemasResponseCollection result = apiInstance.devicePostureIntegrationsListDevicePostureIntegrations(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicePostureIntegrationsApi#devicePostureIntegrationsListDevicePostureIntegrations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DevicePostureIntegrationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DevicePostureIntegrationsComponentsSchemasResponseCollection**](DevicePostureIntegrationsComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicePostureIntegrationsUpdateDevicePostureIntegration"></a>
# **devicePostureIntegrationsUpdateDevicePostureIntegration**
> DevicePostureIntegrationsComponentsSchemasSingleResponse devicePostureIntegrationsUpdateDevicePostureIntegration(body, uuid, identifier)

Update Device Posture Integration

Update a Device Posture Integration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicePostureIntegrationsApi;

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


DevicePostureIntegrationsApi apiInstance = new DevicePostureIntegrationsApi();
IntegrationUuidBody body = new IntegrationUuidBody(); // IntegrationUuidBody | 
String uuid = "uuid_example"; // String | 
DevicePostureIntegrationsComponentsSchemasIdentifier identifier = new DevicePostureIntegrationsComponentsSchemasIdentifier(); // DevicePostureIntegrationsComponentsSchemasIdentifier | 
try {
    DevicePostureIntegrationsComponentsSchemasSingleResponse result = apiInstance.devicePostureIntegrationsUpdateDevicePostureIntegration(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicePostureIntegrationsApi#devicePostureIntegrationsUpdateDevicePostureIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IntegrationUuidBody**](IntegrationUuidBody.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicePostureIntegrationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DevicePostureIntegrationsComponentsSchemasSingleResponse**](DevicePostureIntegrationsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

