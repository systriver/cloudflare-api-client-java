# StreamWebhookApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streamWebhookCreateWebhooks**](StreamWebhookApi.md#streamWebhookCreateWebhooks) | **PUT** /accounts/{account_identifier}/stream/webhook | Create webhooks
[**streamWebhookDeleteWebhooks**](StreamWebhookApi.md#streamWebhookDeleteWebhooks) | **DELETE** /accounts/{account_identifier}/stream/webhook | Delete webhooks
[**streamWebhookViewWebhooks**](StreamWebhookApi.md#streamWebhookViewWebhooks) | **GET** /accounts/{account_identifier}/stream/webhook | View webhooks

<a name="streamWebhookCreateWebhooks"></a>
# **streamWebhookCreateWebhooks**
> WebhookResponseSingle streamWebhookCreateWebhooks(body, accountIdentifier)

Create webhooks

Creates a webhook notification.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamWebhookApi;

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


StreamWebhookApi apiInstance = new StreamWebhookApi();
WebhookRequest body = new WebhookRequest(); // WebhookRequest | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    WebhookResponseSingle result = apiInstance.streamWebhookCreateWebhooks(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamWebhookApi#streamWebhookCreateWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebhookRequest**](WebhookRequest.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**WebhookResponseSingle**](WebhookResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamWebhookDeleteWebhooks"></a>
# **streamWebhookDeleteWebhooks**
> DeletedResponse streamWebhookDeleteWebhooks(accountIdentifier)

Delete webhooks

Deletes a webhook.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamWebhookApi;

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


StreamWebhookApi apiInstance = new StreamWebhookApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DeletedResponse result = apiInstance.streamWebhookDeleteWebhooks(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamWebhookApi#streamWebhookDeleteWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DeletedResponse**](DeletedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamWebhookViewWebhooks"></a>
# **streamWebhookViewWebhooks**
> WebhookResponseSingle streamWebhookViewWebhooks(accountIdentifier)

View webhooks

Retrieves a list of webhooks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamWebhookApi;

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


StreamWebhookApi apiInstance = new StreamWebhookApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    WebhookResponseSingle result = apiInstance.streamWebhookViewWebhooks(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamWebhookApi#streamWebhookViewWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**WebhookResponseSingle**](WebhookResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

