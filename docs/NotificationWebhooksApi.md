# NotificationWebhooksApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationWebhooksCreateAWebhook**](NotificationWebhooksApi.md#notificationWebhooksCreateAWebhook) | **POST** /accounts/{identifier}/alerting/v3/destinations/webhooks | Create a webhook
[**notificationWebhooksDeleteAWebhook**](NotificationWebhooksApi.md#notificationWebhooksDeleteAWebhook) | **DELETE** /accounts/{identifier}/alerting/v3/destinations/webhooks/{uuid} | Delete a webhook
[**notificationWebhooksGetAWebhook**](NotificationWebhooksApi.md#notificationWebhooksGetAWebhook) | **GET** /accounts/{identifier}/alerting/v3/destinations/webhooks/{uuid} | Get a webhook
[**notificationWebhooksListWebhooks**](NotificationWebhooksApi.md#notificationWebhooksListWebhooks) | **GET** /accounts/{identifier}/alerting/v3/destinations/webhooks | List webhooks
[**notificationWebhooksUpdateAWebhook**](NotificationWebhooksApi.md#notificationWebhooksUpdateAWebhook) | **PUT** /accounts/{identifier}/alerting/v3/destinations/webhooks/{uuid} | Update a webhook

<a name="notificationWebhooksCreateAWebhook"></a>
# **notificationWebhooksCreateAWebhook**
> WebhooksComponentsSchemasIdResponse notificationWebhooksCreateAWebhook(body, identifier)

Create a webhook

Creates a new webhook destination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationWebhooksApi;

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


NotificationWebhooksApi apiInstance = new NotificationWebhooksApi();
DestinationsWebhooksBody body = new DestinationsWebhooksBody(); // DestinationsWebhooksBody | 
String identifier = "identifier_example"; // String | 
try {
    WebhooksComponentsSchemasIdResponse result = apiInstance.notificationWebhooksCreateAWebhook(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationWebhooksApi#notificationWebhooksCreateAWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DestinationsWebhooksBody**](DestinationsWebhooksBody.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**WebhooksComponentsSchemasIdResponse**](WebhooksComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notificationWebhooksDeleteAWebhook"></a>
# **notificationWebhooksDeleteAWebhook**
> ApiResponseCollection notificationWebhooksDeleteAWebhook(uuid, identifier)

Delete a webhook

Delete a configured webhook destination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationWebhooksApi;

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


NotificationWebhooksApi apiInstance = new NotificationWebhooksApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    ApiResponseCollection result = apiInstance.notificationWebhooksDeleteAWebhook(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationWebhooksApi#notificationWebhooksDeleteAWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**ApiResponseCollection**](ApiResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notificationWebhooksGetAWebhook"></a>
# **notificationWebhooksGetAWebhook**
> WebhooksComponentsSchemasSingleResponse notificationWebhooksGetAWebhook(uuid, identifier)

Get a webhook

Get details for a single webhooks destination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationWebhooksApi;

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


NotificationWebhooksApi apiInstance = new NotificationWebhooksApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    WebhooksComponentsSchemasSingleResponse result = apiInstance.notificationWebhooksGetAWebhook(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationWebhooksApi#notificationWebhooksGetAWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**WebhooksComponentsSchemasSingleResponse**](WebhooksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationWebhooksListWebhooks"></a>
# **notificationWebhooksListWebhooks**
> WebhooksComponentsSchemasResponseCollection notificationWebhooksListWebhooks(identifier)

List webhooks

Gets a list of all configured webhook destinations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationWebhooksApi;

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


NotificationWebhooksApi apiInstance = new NotificationWebhooksApi();
String identifier = "identifier_example"; // String | 
try {
    WebhooksComponentsSchemasResponseCollection result = apiInstance.notificationWebhooksListWebhooks(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationWebhooksApi#notificationWebhooksListWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**WebhooksComponentsSchemasResponseCollection**](WebhooksComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationWebhooksUpdateAWebhook"></a>
# **notificationWebhooksUpdateAWebhook**
> WebhooksComponentsSchemasIdResponse notificationWebhooksUpdateAWebhook(body, uuid, identifier)

Update a webhook

Update a webhook destination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationWebhooksApi;

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


NotificationWebhooksApi apiInstance = new NotificationWebhooksApi();
WebhooksUuidBody body = new WebhooksUuidBody(); // WebhooksUuidBody | 
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    WebhooksComponentsSchemasIdResponse result = apiInstance.notificationWebhooksUpdateAWebhook(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationWebhooksApi#notificationWebhooksUpdateAWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebhooksUuidBody**](WebhooksUuidBody.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**WebhooksComponentsSchemasIdResponse**](WebhooksComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

