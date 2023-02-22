# PageShieldApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pageShieldGetAPageShieldConnection**](PageShieldApi.md#pageShieldGetAPageShieldConnection) | **GET** /zones/{zone_id}/page_shield/connections/{id} | Get a Page Shield connection
[**pageShieldGetAPageShieldScript**](PageShieldApi.md#pageShieldGetAPageShieldScript) | **GET** /zones/{zone_id}/page_shield/scripts/{id} | Get a Page Shield script
[**pageShieldGetPageShieldSettings**](PageShieldApi.md#pageShieldGetPageShieldSettings) | **GET** /zones/{zone_id}/page_shield | Get Page Shield settings
[**pageShieldListPageShieldConnections**](PageShieldApi.md#pageShieldListPageShieldConnections) | **GET** /zones/{zone_id}/page_shield/connections | List Page Shield connections
[**pageShieldListPageShieldScripts**](PageShieldApi.md#pageShieldListPageShieldScripts) | **GET** /zones/{zone_id}/page_shield/scripts | List Page Shield scripts
[**pageShieldUpdatePageShieldSettings**](PageShieldApi.md#pageShieldUpdatePageShieldSettings) | **PUT** /zones/{zone_id}/page_shield | Update Page Shield settings

<a name="pageShieldGetAPageShieldConnection"></a>
# **pageShieldGetAPageShieldConnection**
> GetZoneConnectionResponse pageShieldGetAPageShieldConnection(id, zoneId)

Get a Page Shield connection

Fetches a connection detected by Page Shield by connection ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PageShieldApi;

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


PageShieldApi apiInstance = new PageShieldApi();
String id = "id_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    GetZoneConnectionResponse result = apiInstance.pageShieldGetAPageShieldConnection(id, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageShieldApi#pageShieldGetAPageShieldConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**GetZoneConnectionResponse**](GetZoneConnectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pageShieldGetAPageShieldScript"></a>
# **pageShieldGetAPageShieldScript**
> GetZoneScriptResponse pageShieldGetAPageShieldScript(id, zoneId)

Get a Page Shield script

Fetches a script detected by Page Shield by script ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PageShieldApi;

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


PageShieldApi apiInstance = new PageShieldApi();
String id = "id_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    GetZoneScriptResponse result = apiInstance.pageShieldGetAPageShieldScript(id, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageShieldApi#pageShieldGetAPageShieldScript");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**GetZoneScriptResponse**](GetZoneScriptResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pageShieldGetPageShieldSettings"></a>
# **pageShieldGetPageShieldSettings**
> InlineResponse200176 pageShieldGetPageShieldSettings(zoneId)

Get Page Shield settings

Fetches the Page Shield settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PageShieldApi;

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


PageShieldApi apiInstance = new PageShieldApi();
String zoneId = "zoneId_example"; // String | 
try {
    InlineResponse200176 result = apiInstance.pageShieldGetPageShieldSettings(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageShieldApi#pageShieldGetPageShieldSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**InlineResponse200176**](InlineResponse200176.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pageShieldListPageShieldConnections"></a>
# **pageShieldListPageShieldConnections**
> ListZoneConnectionsResponse pageShieldListPageShieldConnections(zoneId)

List Page Shield connections

Lists all connections detected by Page Shield.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PageShieldApi;

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


PageShieldApi apiInstance = new PageShieldApi();
String zoneId = "zoneId_example"; // String | 
try {
    ListZoneConnectionsResponse result = apiInstance.pageShieldListPageShieldConnections(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageShieldApi#pageShieldListPageShieldConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**ListZoneConnectionsResponse**](ListZoneConnectionsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pageShieldListPageShieldScripts"></a>
# **pageShieldListPageShieldScripts**
> ListZoneScriptsResponse pageShieldListPageShieldScripts(zoneId)

List Page Shield scripts

Lists all scripts detected by Page Shield.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PageShieldApi;

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


PageShieldApi apiInstance = new PageShieldApi();
String zoneId = "zoneId_example"; // String | 
try {
    ListZoneScriptsResponse result = apiInstance.pageShieldListPageShieldScripts(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageShieldApi#pageShieldListPageShieldScripts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**ListZoneScriptsResponse**](ListZoneScriptsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pageShieldUpdatePageShieldSettings"></a>
# **pageShieldUpdatePageShieldSettings**
> InlineResponse200177 pageShieldUpdatePageShieldSettings(body, zoneId)

Update Page Shield settings

Updates Page Shield settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PageShieldApi;

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


PageShieldApi apiInstance = new PageShieldApi();
ZoneIdPageShieldBody body = new ZoneIdPageShieldBody(); // ZoneIdPageShieldBody | 
String zoneId = "zoneId_example"; // String | 
try {
    InlineResponse200177 result = apiInstance.pageShieldUpdatePageShieldSettings(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageShieldApi#pageShieldUpdatePageShieldSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZoneIdPageShieldBody**](ZoneIdPageShieldBody.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**InlineResponse200177**](InlineResponse200177.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

