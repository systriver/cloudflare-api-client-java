# CustomPagesForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customPagesForAZoneGetACustomPage**](CustomPagesForAZoneApi.md#customPagesForAZoneGetACustomPage) | **GET** /zones/{zone_identifier}/custom_pages/{identifier} | Get a custom page
[**customPagesForAZoneListCustomPages**](CustomPagesForAZoneApi.md#customPagesForAZoneListCustomPages) | **GET** /zones/{zone_identifier}/custom_pages | List custom pages
[**customPagesForAZoneUpdateACustomPage**](CustomPagesForAZoneApi.md#customPagesForAZoneUpdateACustomPage) | **PUT** /zones/{zone_identifier}/custom_pages/{identifier} | Update a custom page

<a name="customPagesForAZoneGetACustomPage"></a>
# **customPagesForAZoneGetACustomPage**
> CustomPagesResponseSingle customPagesForAZoneGetACustomPage(identifier, zoneIdentifier)

Get a custom page

Fetches the details of a custom page.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomPagesForAZoneApi;

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


CustomPagesForAZoneApi apiInstance = new CustomPagesForAZoneApi();
CustomPagesComponentsSchemasIdentifier identifier = new CustomPagesComponentsSchemasIdentifier(); // CustomPagesComponentsSchemasIdentifier | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CustomPagesResponseSingle result = apiInstance.customPagesForAZoneGetACustomPage(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomPagesForAZoneApi#customPagesForAZoneGetACustomPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CustomPagesComponentsSchemasIdentifier**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CustomPagesResponseSingle**](CustomPagesResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customPagesForAZoneListCustomPages"></a>
# **customPagesForAZoneListCustomPages**
> CustomPagesResponseCollection customPagesForAZoneListCustomPages(zoneIdentifier)

List custom pages

Fetches all the custom pages at the zone level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomPagesForAZoneApi;

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


CustomPagesForAZoneApi apiInstance = new CustomPagesForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CustomPagesResponseCollection result = apiInstance.customPagesForAZoneListCustomPages(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomPagesForAZoneApi#customPagesForAZoneListCustomPages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CustomPagesResponseCollection**](CustomPagesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customPagesForAZoneUpdateACustomPage"></a>
# **customPagesForAZoneUpdateACustomPage**
> CustomPagesResponseSingle customPagesForAZoneUpdateACustomPage(body, identifier, zoneIdentifier)

Update a custom page

Updates the configuration of an existing custom page.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomPagesForAZoneApi;

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


CustomPagesForAZoneApi apiInstance = new CustomPagesForAZoneApi();
CustomPagesIdentifierBody1 body = new CustomPagesIdentifierBody1(); // CustomPagesIdentifierBody1 | 
CustomPagesComponentsSchemasIdentifier identifier = new CustomPagesComponentsSchemasIdentifier(); // CustomPagesComponentsSchemasIdentifier | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CustomPagesResponseSingle result = apiInstance.customPagesForAZoneUpdateACustomPage(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomPagesForAZoneApi#customPagesForAZoneUpdateACustomPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomPagesIdentifierBody1**](CustomPagesIdentifierBody1.md)|  |
 **identifier** | [**CustomPagesComponentsSchemasIdentifier**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CustomPagesResponseSingle**](CustomPagesResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

