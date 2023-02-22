# NotificationPoliciesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationPoliciesCreateANotificationPolicy**](NotificationPoliciesApi.md#notificationPoliciesCreateANotificationPolicy) | **POST** /accounts/{identifier}/alerting/v3/policies | Create a Notification policy
[**notificationPoliciesDeleteANotificationPolicy**](NotificationPoliciesApi.md#notificationPoliciesDeleteANotificationPolicy) | **DELETE** /accounts/{identifier}/alerting/v3/policies/{uuid} | Delete a Notification policy
[**notificationPoliciesGetANotificationPolicy**](NotificationPoliciesApi.md#notificationPoliciesGetANotificationPolicy) | **GET** /accounts/{identifier}/alerting/v3/policies/{uuid} | Get a Notification policy
[**notificationPoliciesListNotificationPolicies**](NotificationPoliciesApi.md#notificationPoliciesListNotificationPolicies) | **GET** /accounts/{identifier}/alerting/v3/policies | List Notification policies
[**notificationPoliciesUpdateANotificationPolicy**](NotificationPoliciesApi.md#notificationPoliciesUpdateANotificationPolicy) | **PUT** /accounts/{identifier}/alerting/v3/policies/{uuid} | Update a Notification policy

<a name="notificationPoliciesCreateANotificationPolicy"></a>
# **notificationPoliciesCreateANotificationPolicy**
> PoliciesComponentsSchemasIdResponse2 notificationPoliciesCreateANotificationPolicy(body, identifier)

Create a Notification policy

Creates a new Notification policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationPoliciesApi;

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


NotificationPoliciesApi apiInstance = new NotificationPoliciesApi();
V3PoliciesBody body = new V3PoliciesBody(); // V3PoliciesBody | 
String identifier = "identifier_example"; // String | 
try {
    PoliciesComponentsSchemasIdResponse2 result = apiInstance.notificationPoliciesCreateANotificationPolicy(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationPoliciesApi#notificationPoliciesCreateANotificationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**V3PoliciesBody**](V3PoliciesBody.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**PoliciesComponentsSchemasIdResponse2**](PoliciesComponentsSchemasIdResponse2.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="notificationPoliciesDeleteANotificationPolicy"></a>
# **notificationPoliciesDeleteANotificationPolicy**
> ApiResponseCollection notificationPoliciesDeleteANotificationPolicy(uuid, identifier)

Delete a Notification policy

Delete a Notification policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationPoliciesApi;

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


NotificationPoliciesApi apiInstance = new NotificationPoliciesApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    ApiResponseCollection result = apiInstance.notificationPoliciesDeleteANotificationPolicy(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationPoliciesApi#notificationPoliciesDeleteANotificationPolicy");
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

<a name="notificationPoliciesGetANotificationPolicy"></a>
# **notificationPoliciesGetANotificationPolicy**
> PoliciesComponentsSchemasSingleResponse2 notificationPoliciesGetANotificationPolicy(uuid, identifier)

Get a Notification policy

Get details for a single policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationPoliciesApi;

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


NotificationPoliciesApi apiInstance = new NotificationPoliciesApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    PoliciesComponentsSchemasSingleResponse2 result = apiInstance.notificationPoliciesGetANotificationPolicy(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationPoliciesApi#notificationPoliciesGetANotificationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**PoliciesComponentsSchemasSingleResponse2**](PoliciesComponentsSchemasSingleResponse2.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationPoliciesListNotificationPolicies"></a>
# **notificationPoliciesListNotificationPolicies**
> PoliciesComponentsSchemasResponseCollection2 notificationPoliciesListNotificationPolicies(identifier)

List Notification policies

Get a list of all Notification policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationPoliciesApi;

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


NotificationPoliciesApi apiInstance = new NotificationPoliciesApi();
String identifier = "identifier_example"; // String | 
try {
    PoliciesComponentsSchemasResponseCollection2 result = apiInstance.notificationPoliciesListNotificationPolicies(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationPoliciesApi#notificationPoliciesListNotificationPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**PoliciesComponentsSchemasResponseCollection2**](PoliciesComponentsSchemasResponseCollection2.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="notificationPoliciesUpdateANotificationPolicy"></a>
# **notificationPoliciesUpdateANotificationPolicy**
> PoliciesComponentsSchemasIdResponse2 notificationPoliciesUpdateANotificationPolicy(body, uuid, identifier)

Update a Notification policy

Update a Notification policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationPoliciesApi;

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


NotificationPoliciesApi apiInstance = new NotificationPoliciesApi();
PoliciesUuidBody1 body = new PoliciesUuidBody1(); // PoliciesUuidBody1 | 
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    PoliciesComponentsSchemasIdResponse2 result = apiInstance.notificationPoliciesUpdateANotificationPolicy(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationPoliciesApi#notificationPoliciesUpdateANotificationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoliciesUuidBody1**](PoliciesUuidBody1.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**PoliciesComponentsSchemasIdResponse2**](PoliciesComponentsSchemasIdResponse2.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

