# UserSubscriptionApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userSubscriptionDeleteUserSubscription**](UserSubscriptionApi.md#userSubscriptionDeleteUserSubscription) | **DELETE** /user/subscriptions/{identifier} | Delete User Subscription
[**userSubscriptionGetUserSubscriptions**](UserSubscriptionApi.md#userSubscriptionGetUserSubscriptions) | **GET** /user/subscriptions | Get User Subscriptions
[**userSubscriptionUpdateUserSubscription**](UserSubscriptionApi.md#userSubscriptionUpdateUserSubscription) | **PUT** /user/subscriptions/{identifier} | Update User Subscription

<a name="userSubscriptionDeleteUserSubscription"></a>
# **userSubscriptionDeleteUserSubscription**
> InlineResponse200105 userSubscriptionDeleteUserSubscription(identifier)

Delete User Subscription

Deletes a user&#x27;s subscription.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserSubscriptionApi;

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


UserSubscriptionApi apiInstance = new UserSubscriptionApi();
String identifier = "identifier_example"; // String | 
try {
    InlineResponse200105 result = apiInstance.userSubscriptionDeleteUserSubscription(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSubscriptionApi#userSubscriptionDeleteUserSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200105**](InlineResponse200105.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userSubscriptionGetUserSubscriptions"></a>
# **userSubscriptionGetUserSubscriptions**
> UserSubscriptionResponseCollection userSubscriptionGetUserSubscriptions()

Get User Subscriptions

Lists all of a user&#x27;s subscriptions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserSubscriptionApi;

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


UserSubscriptionApi apiInstance = new UserSubscriptionApi();
try {
    UserSubscriptionResponseCollection result = apiInstance.userSubscriptionGetUserSubscriptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSubscriptionApi#userSubscriptionGetUserSubscriptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserSubscriptionResponseCollection**](UserSubscriptionResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userSubscriptionUpdateUserSubscription"></a>
# **userSubscriptionUpdateUserSubscription**
> UserSubscriptionResponseSingle userSubscriptionUpdateUserSubscription(body, identifier)

Update User Subscription

Updates a user&#x27;s subscriptions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserSubscriptionApi;

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


UserSubscriptionApi apiInstance = new UserSubscriptionApi();
SubscriptionV2 body = new SubscriptionV2(); // SubscriptionV2 | 
String identifier = "identifier_example"; // String | 
try {
    UserSubscriptionResponseSingle result = apiInstance.userSubscriptionUpdateUserSubscription(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserSubscriptionApi#userSubscriptionUpdateUserSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionV2**](SubscriptionV2.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**UserSubscriptionResponseSingle**](UserSubscriptionResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

