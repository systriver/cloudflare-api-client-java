# DeviceManagedNetworksApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deviceManagedNetworksCreateDeviceManagedNetwork**](DeviceManagedNetworksApi.md#deviceManagedNetworksCreateDeviceManagedNetwork) | **POST** /accounts/{identifier}/devices/networks | Create Device Managed Network
[**deviceManagedNetworksDeleteDeviceManagedNetwork**](DeviceManagedNetworksApi.md#deviceManagedNetworksDeleteDeviceManagedNetwork) | **DELETE** /accounts/{identifier}/devices/networks/{uuid} | Delete Device Managed Network
[**deviceManagedNetworksDeviceManagedNetworkDetails**](DeviceManagedNetworksApi.md#deviceManagedNetworksDeviceManagedNetworkDetails) | **GET** /accounts/{identifier}/devices/networks/{uuid} | Device Managed Network Details
[**deviceManagedNetworksListDeviceManagedNetworks**](DeviceManagedNetworksApi.md#deviceManagedNetworksListDeviceManagedNetworks) | **GET** /accounts/{identifier}/devices/networks | List Device Managed Networks
[**deviceManagedNetworksUpdateDeviceManagedNetwork**](DeviceManagedNetworksApi.md#deviceManagedNetworksUpdateDeviceManagedNetwork) | **PUT** /accounts/{identifier}/devices/networks/{uuid} | Update Device Managed Network

<a name="deviceManagedNetworksCreateDeviceManagedNetwork"></a>
# **deviceManagedNetworksCreateDeviceManagedNetwork**
> DeviceManagedNetworksComponentsSchemasSingleResponse deviceManagedNetworksCreateDeviceManagedNetwork(body, identifier)

Create Device Managed Network

Create a new Device Managed Network.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeviceManagedNetworksApi;

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


DeviceManagedNetworksApi apiInstance = new DeviceManagedNetworksApi();
DevicesNetworksBody body = new DevicesNetworksBody(); // DevicesNetworksBody | 
DeviceManagedNetworksComponentsSchemasIdentifier identifier = new DeviceManagedNetworksComponentsSchemasIdentifier(); // DeviceManagedNetworksComponentsSchemasIdentifier | 
try {
    DeviceManagedNetworksComponentsSchemasSingleResponse result = apiInstance.deviceManagedNetworksCreateDeviceManagedNetwork(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagedNetworksApi#deviceManagedNetworksCreateDeviceManagedNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DevicesNetworksBody**](DevicesNetworksBody.md)|  |
 **identifier** | [**DeviceManagedNetworksComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DeviceManagedNetworksComponentsSchemasSingleResponse**](DeviceManagedNetworksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceManagedNetworksDeleteDeviceManagedNetwork"></a>
# **deviceManagedNetworksDeleteDeviceManagedNetwork**
> DeviceManagedNetworksComponentsSchemasResponseCollection deviceManagedNetworksDeleteDeviceManagedNetwork(uuid, identifier)

Delete Device Managed Network

Delete a Device Managed Network. Returns the remaining device managed networks for the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeviceManagedNetworksApi;

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


DeviceManagedNetworksApi apiInstance = new DeviceManagedNetworksApi();
String uuid = "uuid_example"; // String | 
DeviceManagedNetworksComponentsSchemasIdentifier identifier = new DeviceManagedNetworksComponentsSchemasIdentifier(); // DeviceManagedNetworksComponentsSchemasIdentifier | 
try {
    DeviceManagedNetworksComponentsSchemasResponseCollection result = apiInstance.deviceManagedNetworksDeleteDeviceManagedNetwork(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagedNetworksApi#deviceManagedNetworksDeleteDeviceManagedNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DeviceManagedNetworksComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DeviceManagedNetworksComponentsSchemasResponseCollection**](DeviceManagedNetworksComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deviceManagedNetworksDeviceManagedNetworkDetails"></a>
# **deviceManagedNetworksDeviceManagedNetworkDetails**
> DeviceManagedNetworksComponentsSchemasSingleResponse deviceManagedNetworksDeviceManagedNetworkDetails(uuid, identifier)

Device Managed Network Details

Fetch a single Managed Network.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeviceManagedNetworksApi;

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


DeviceManagedNetworksApi apiInstance = new DeviceManagedNetworksApi();
String uuid = "uuid_example"; // String | 
DeviceManagedNetworksComponentsSchemasIdentifier identifier = new DeviceManagedNetworksComponentsSchemasIdentifier(); // DeviceManagedNetworksComponentsSchemasIdentifier | 
try {
    DeviceManagedNetworksComponentsSchemasSingleResponse result = apiInstance.deviceManagedNetworksDeviceManagedNetworkDetails(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagedNetworksApi#deviceManagedNetworksDeviceManagedNetworkDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DeviceManagedNetworksComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DeviceManagedNetworksComponentsSchemasSingleResponse**](DeviceManagedNetworksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deviceManagedNetworksListDeviceManagedNetworks"></a>
# **deviceManagedNetworksListDeviceManagedNetworks**
> DeviceManagedNetworksComponentsSchemasResponseCollection deviceManagedNetworksListDeviceManagedNetworks(identifier)

List Device Managed Networks

List Managed Networks for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeviceManagedNetworksApi;

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


DeviceManagedNetworksApi apiInstance = new DeviceManagedNetworksApi();
DeviceManagedNetworksComponentsSchemasIdentifier identifier = new DeviceManagedNetworksComponentsSchemasIdentifier(); // DeviceManagedNetworksComponentsSchemasIdentifier | 
try {
    DeviceManagedNetworksComponentsSchemasResponseCollection result = apiInstance.deviceManagedNetworksListDeviceManagedNetworks(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagedNetworksApi#deviceManagedNetworksListDeviceManagedNetworks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DeviceManagedNetworksComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DeviceManagedNetworksComponentsSchemasResponseCollection**](DeviceManagedNetworksComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deviceManagedNetworksUpdateDeviceManagedNetwork"></a>
# **deviceManagedNetworksUpdateDeviceManagedNetwork**
> DeviceManagedNetworksComponentsSchemasSingleResponse deviceManagedNetworksUpdateDeviceManagedNetwork(body, uuid, identifier)

Update Device Managed Network

Update a Device Managed Network.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeviceManagedNetworksApi;

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


DeviceManagedNetworksApi apiInstance = new DeviceManagedNetworksApi();
NetworksUuidBody body = new NetworksUuidBody(); // NetworksUuidBody | 
String uuid = "uuid_example"; // String | 
DeviceManagedNetworksComponentsSchemasIdentifier identifier = new DeviceManagedNetworksComponentsSchemasIdentifier(); // DeviceManagedNetworksComponentsSchemasIdentifier | 
try {
    DeviceManagedNetworksComponentsSchemasSingleResponse result = apiInstance.deviceManagedNetworksUpdateDeviceManagedNetwork(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagedNetworksApi#deviceManagedNetworksUpdateDeviceManagedNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetworksUuidBody**](NetworksUuidBody.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DeviceManagedNetworksComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DeviceManagedNetworksComponentsSchemasSingleResponse**](DeviceManagedNetworksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

