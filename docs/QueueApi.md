# QueueApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queueCreateQueue**](QueueApi.md#queueCreateQueue) | **POST** /accounts/{account_identifier}/workers/queues | Create Queue
[**queueCreateQueueConsumer**](QueueApi.md#queueCreateQueueConsumer) | **POST** /accounts/{account_identifier}/workers/queues/{name}/consumers | Create Queue Consumer
[**queueDeleteQueue**](QueueApi.md#queueDeleteQueue) | **DELETE** /accounts/{account_identifier}/workers/queues/{name} | Delete Queue
[**queueDeleteQueueConsumer**](QueueApi.md#queueDeleteQueueConsumer) | **DELETE** /accounts/{account_identifier}/workers/queues/{name}/consumers/{consumer_name} | Delete Queue Consumer
[**queueListQueueConsumers**](QueueApi.md#queueListQueueConsumers) | **GET** /accounts/{account_identifier}/workers/queues/{name}/consumers | List Queue Consumers
[**queueListQueues**](QueueApi.md#queueListQueues) | **GET** /accounts/{account_identifier}/workers/queues | List Queues
[**queueQueueDetails**](QueueApi.md#queueQueueDetails) | **GET** /accounts/{account_identifier}/workers/queues/{name} | Queue Details
[**queueUpdateQueue**](QueueApi.md#queueUpdateQueue) | **PUT** /accounts/{account_identifier}/workers/queues/{name} | Update Queue
[**queueUpdateQueueConsumer**](QueueApi.md#queueUpdateQueueConsumer) | **PUT** /accounts/{account_identifier}/workers/queues/{name}/consumers/{consumer_name} | Update Queue Consumer

<a name="queueCreateQueue"></a>
# **queueCreateQueue**
> InlineResponse20018 queueCreateQueue(body, accountIdentifier)

Create Queue

Creates a new queue.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QueueApi;

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


QueueApi apiInstance = new QueueApi();
Object body = null; // Object | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20018 result = apiInstance.queueCreateQueue(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#queueCreateQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queueCreateQueueConsumer"></a>
# **queueCreateQueueConsumer**
> InlineResponse20023 queueCreateQueueConsumer(body, name, accountIdentifier)

Create Queue Consumer

Creates a new consumer for a queue.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QueueApi;

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


QueueApi apiInstance = new QueueApi();
Object body = null; // Object | 
String name = "name_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20023 result = apiInstance.queueCreateQueueConsumer(body, name, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#queueCreateQueueConsumer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **name** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queueDeleteQueue"></a>
# **queueDeleteQueue**
> InlineResponse20021 queueDeleteQueue(name, accountIdentifier)

Delete Queue

Deletes a queue.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QueueApi;

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


QueueApi apiInstance = new QueueApi();
String name = "name_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20021 result = apiInstance.queueDeleteQueue(name, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#queueDeleteQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queueDeleteQueueConsumer"></a>
# **queueDeleteQueueConsumer**
> InlineResponse20021 queueDeleteQueueConsumer(consumerName, name, accountIdentifier)

Delete Queue Consumer

Deletes the consumer for a queue.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QueueApi;

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


QueueApi apiInstance = new QueueApi();
String consumerName = "consumerName_example"; // String | 
String name = "name_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20021 result = apiInstance.queueDeleteQueueConsumer(consumerName, name, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#queueDeleteQueueConsumer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consumerName** | [**String**](.md)|  |
 **name** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queueListQueueConsumers"></a>
# **queueListQueueConsumers**
> InlineResponse20022 queueListQueueConsumers(name, accountIdentifier)

List Queue Consumers

Returns the consumers for a queue.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QueueApi;

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


QueueApi apiInstance = new QueueApi();
String name = "name_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20022 result = apiInstance.queueListQueueConsumers(name, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#queueListQueueConsumers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queueListQueues"></a>
# **queueListQueues**
> InlineResponse20017 queueListQueues(accountIdentifier)

List Queues

Returns the queues owned by an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QueueApi;

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


QueueApi apiInstance = new QueueApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20017 result = apiInstance.queueListQueues(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#queueListQueues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queueQueueDetails"></a>
# **queueQueueDetails**
> InlineResponse20019 queueQueueDetails(name, accountIdentifier)

Queue Details

Get information about a specific queue.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QueueApi;

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


QueueApi apiInstance = new QueueApi();
String name = "name_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20019 result = apiInstance.queueQueueDetails(name, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#queueQueueDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queueUpdateQueue"></a>
# **queueUpdateQueue**
> InlineResponse20020 queueUpdateQueue(body, name, accountIdentifier)

Update Queue

Updates a queue.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QueueApi;

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


QueueApi apiInstance = new QueueApi();
Object body = null; // Object | 
String name = "name_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20020 result = apiInstance.queueUpdateQueue(body, name, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#queueUpdateQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **name** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queueUpdateQueueConsumer"></a>
# **queueUpdateQueueConsumer**
> InlineResponse20024 queueUpdateQueueConsumer(body, consumerName, name, accountIdentifier)

Update Queue Consumer

Updates the consumer for a queue, or creates one if it does not exist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QueueApi;

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


QueueApi apiInstance = new QueueApi();
Object body = null; // Object | 
String consumerName = "consumerName_example"; // String | 
String name = "name_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20024 result = apiInstance.queueUpdateQueueConsumer(body, consumerName, name, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueueApi#queueUpdateQueueConsumer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **consumerName** | [**String**](.md)|  |
 **name** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

