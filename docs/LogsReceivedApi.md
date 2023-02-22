# LogsReceivedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logsReceivedGetLogRetentionFlag**](LogsReceivedApi.md#logsReceivedGetLogRetentionFlag) | **GET** /zones/{zone_identifier}/logs/control/retention/flag | Get log retention flag
[**logsReceivedGetLogsRayIDs**](LogsReceivedApi.md#logsReceivedGetLogsRayIDs) | **GET** /zones/{zone_identifier}/logs/rayids/{ray_identifier} | Get logs RayIDs
[**logsReceivedGetLogsReceived**](LogsReceivedApi.md#logsReceivedGetLogsReceived) | **GET** /zones/{zone_identifier}/logs/received | Get logs received
[**logsReceivedListFields**](LogsReceivedApi.md#logsReceivedListFields) | **GET** /zones/{zone_identifier}/logs/received/fields | List fields
[**logsReceivedUpdateLogRetentionFlag**](LogsReceivedApi.md#logsReceivedUpdateLogRetentionFlag) | **POST** /zones/{zone_identifier}/logs/control/retention/flag | Update log retention flag

<a name="logsReceivedGetLogRetentionFlag"></a>
# **logsReceivedGetLogRetentionFlag**
> FlagResponse logsReceivedGetLogRetentionFlag(zoneIdentifier)

Get log retention flag

Gets log retention flag for Logpull API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogsReceivedApi;

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


LogsReceivedApi apiInstance = new LogsReceivedApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FlagResponse result = apiInstance.logsReceivedGetLogRetentionFlag(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsReceivedApi#logsReceivedGetLogRetentionFlag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FlagResponse**](FlagResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logsReceivedGetLogsRayIDs"></a>
# **logsReceivedGetLogsRayIDs**
> Logs logsReceivedGetLogsRayIDs(rayIdentifier, zoneIdentifier)

Get logs RayIDs

The &#x60;/rayids&#x60; api route allows lookups by specific rayid. The rayids route will return zero, one, or more records (ray ids are not unique).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogsReceivedApi;

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


LogsReceivedApi apiInstance = new LogsReceivedApi();
String rayIdentifier = "rayIdentifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    Logs result = apiInstance.logsReceivedGetLogsRayIDs(rayIdentifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsReceivedApi#logsReceivedGetLogsRayIDs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rayIdentifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**Logs**](Logs.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logsReceivedGetLogsReceived"></a>
# **logsReceivedGetLogsReceived**
> Logs logsReceivedGetLogsReceived(zoneIdentifier)

Get logs received

The &#x60;/received&#x60; api route allows customers to retrieve their edge HTTP logs. The basic access pattern is \&quot;give me all the logs for zone Z for minute M\&quot;, where the minute M refers to the time records were received at Cloudflare&#x27;s central data center. &#x60;start&#x60; is inclusive, and &#x60;end&#x60; is exclusive. Because of that, to get all data, at minutely cadence, starting at 10AM, the proper values are: &#x60;start&#x3D;2018-05-20T10:00:00Z&amp;end&#x3D;2018-05-20T10:01:00Z&#x60;, then &#x60;start&#x3D;2018-05-20T10:01:00Z&amp;end&#x3D;2018-05-20T10:02:00Z&#x60; and so on; the overlap will be handled properly.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogsReceivedApi;

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


LogsReceivedApi apiInstance = new LogsReceivedApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    Logs result = apiInstance.logsReceivedGetLogsReceived(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsReceivedApi#logsReceivedGetLogsReceived");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**Logs**](Logs.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logsReceivedListFields"></a>
# **logsReceivedListFields**
> FieldsResponse logsReceivedListFields(zoneIdentifier)

List fields

Lists all fields available. The response is json object with key-value pairs, where keys are field names, and values are descriptions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogsReceivedApi;

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


LogsReceivedApi apiInstance = new LogsReceivedApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FieldsResponse result = apiInstance.logsReceivedListFields(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsReceivedApi#logsReceivedListFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FieldsResponse**](FieldsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logsReceivedUpdateLogRetentionFlag"></a>
# **logsReceivedUpdateLogRetentionFlag**
> FlagResponse logsReceivedUpdateLogRetentionFlag(body, zoneIdentifier)

Update log retention flag

Updates log retention flag for Logpull API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogsReceivedApi;

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


LogsReceivedApi apiInstance = new LogsReceivedApi();
RetentionFlagBody body = new RetentionFlagBody(); // RetentionFlagBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FlagResponse result = apiInstance.logsReceivedUpdateLogRetentionFlag(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogsReceivedApi#logsReceivedUpdateLogRetentionFlag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RetentionFlagBody**](RetentionFlagBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FlagResponse**](FlagResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

