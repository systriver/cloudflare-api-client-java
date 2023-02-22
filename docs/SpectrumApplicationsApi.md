# SpectrumApplicationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin**](SpectrumApplicationsApi.md#spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin) | **POST** /zones/{zone}/spectrum/apps | Create Spectrum application using a name for the origin
[**spectrumApplicationsDeleteSpectrumApplication**](SpectrumApplicationsApi.md#spectrumApplicationsDeleteSpectrumApplication) | **DELETE** /zones/{zone}/spectrum/apps/{app_id} | Delete Spectrum application
[**spectrumApplicationsGetSpectrumApplicationConfiguration**](SpectrumApplicationsApi.md#spectrumApplicationsGetSpectrumApplicationConfiguration) | **GET** /zones/{zone}/spectrum/apps/{app_id} | Get Spectrum application configuration
[**spectrumApplicationsListSpectrumApplications**](SpectrumApplicationsApi.md#spectrumApplicationsListSpectrumApplications) | **GET** /zones/{zone}/spectrum/apps | List Spectrum applications
[**spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin**](SpectrumApplicationsApi.md#spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin) | **PUT** /zones/{zone}/spectrum/apps/{app_id} | Update Spectrum application configuration using a name for the origin

<a name="spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin"></a>
# **spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin**
> ResponseSingleOriginDns spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin(body, zone)

Create Spectrum application using a name for the origin

Creates a new Spectrum application from a configuration using a name for the origin.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpectrumApplicationsApi;

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


SpectrumApplicationsApi apiInstance = new SpectrumApplicationsApi();
SpectrumAppsBody body = new SpectrumAppsBody(); // SpectrumAppsBody | 
String zone = "zone_example"; // String | 
try {
    ResponseSingleOriginDns result = apiInstance.spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin(body, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpectrumApplicationsApi#spectrumApplicationsCreateSpectrumApplicationUsingANameForTheOrigin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SpectrumAppsBody**](SpectrumAppsBody.md)|  |
 **zone** | [**String**](.md)|  |

### Return type

[**ResponseSingleOriginDns**](ResponseSingleOriginDns.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="spectrumApplicationsDeleteSpectrumApplication"></a>
# **spectrumApplicationsDeleteSpectrumApplication**
> InlineResponse200178 spectrumApplicationsDeleteSpectrumApplication(appId, zone)

Delete Spectrum application

Deletes a previously existing application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpectrumApplicationsApi;

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


SpectrumApplicationsApi apiInstance = new SpectrumApplicationsApi();
String appId = "appId_example"; // String | 
String zone = "zone_example"; // String | 
try {
    InlineResponse200178 result = apiInstance.spectrumApplicationsDeleteSpectrumApplication(appId, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpectrumApplicationsApi#spectrumApplicationsDeleteSpectrumApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**String**](.md)|  |
 **zone** | [**String**](.md)|  |

### Return type

[**InlineResponse200178**](InlineResponse200178.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="spectrumApplicationsGetSpectrumApplicationConfiguration"></a>
# **spectrumApplicationsGetSpectrumApplicationConfiguration**
> SchemasResponseSingle spectrumApplicationsGetSpectrumApplicationConfiguration(appId, zone)

Get Spectrum application configuration

Gets the application configuration of a specific application inside a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpectrumApplicationsApi;

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


SpectrumApplicationsApi apiInstance = new SpectrumApplicationsApi();
String appId = "appId_example"; // String | 
String zone = "zone_example"; // String | 
try {
    SchemasResponseSingle result = apiInstance.spectrumApplicationsGetSpectrumApplicationConfiguration(appId, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpectrumApplicationsApi#spectrumApplicationsGetSpectrumApplicationConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**String**](.md)|  |
 **zone** | [**String**](.md)|  |

### Return type

[**SchemasResponseSingle**](SchemasResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spectrumApplicationsListSpectrumApplications"></a>
# **spectrumApplicationsListSpectrumApplications**
> AppComponentsSchemasResponseCollection spectrumApplicationsListSpectrumApplications(zone)

List Spectrum applications

Retrieves a list of currently existing Spectrum applications inside a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpectrumApplicationsApi;

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


SpectrumApplicationsApi apiInstance = new SpectrumApplicationsApi();
String zone = "zone_example"; // String | 
try {
    AppComponentsSchemasResponseCollection result = apiInstance.spectrumApplicationsListSpectrumApplications(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpectrumApplicationsApi#spectrumApplicationsListSpectrumApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | [**String**](.md)|  |

### Return type

[**AppComponentsSchemasResponseCollection**](AppComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin"></a>
# **spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin**
> ResponseSingleOriginDns spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin(body, appId, zone)

Update Spectrum application configuration using a name for the origin

Updates a previously existing application&#x27;s configuration that uses a name for the origin.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpectrumApplicationsApi;

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


SpectrumApplicationsApi apiInstance = new SpectrumApplicationsApi();
AppsAppIdBody body = new AppsAppIdBody(); // AppsAppIdBody | 
String appId = "appId_example"; // String | 
String zone = "zone_example"; // String | 
try {
    ResponseSingleOriginDns result = apiInstance.spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin(body, appId, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpectrumApplicationsApi#spectrumApplicationsUpdateSpectrumApplicationConfigurationUsingANameForTheOrigin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AppsAppIdBody**](AppsAppIdBody.md)|  |
 **appId** | [**String**](.md)|  |
 **zone** | [**String**](.md)|  |

### Return type

[**ResponseSingleOriginDns**](ResponseSingleOriginDns.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

