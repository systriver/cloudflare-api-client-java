# NotificationHistoryApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationHistoryListHistory**](NotificationHistoryApi.md#notificationHistoryListHistory) | **GET** /accounts/{identifier}/alerting/v3/history | List History

<a name="notificationHistoryListHistory"></a>
# **notificationHistoryListHistory**
> HistoryComponentsSchemasResponseCollection notificationHistoryListHistory(identifier)

List History

Gets a list of history records for notifications sent to an account. The records are displayed for last &#x60;x&#x60; number of days based on the zone plan (free &#x3D; 30, pro &#x3D; 30, biz &#x3D; 30, ent &#x3D; 90).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationHistoryApi;

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


NotificationHistoryApi apiInstance = new NotificationHistoryApi();
String identifier = "identifier_example"; // String | 
try {
    HistoryComponentsSchemasResponseCollection result = apiInstance.notificationHistoryListHistory(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationHistoryApi#notificationHistoryListHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**HistoryComponentsSchemasResponseCollection**](HistoryComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

