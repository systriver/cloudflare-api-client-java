# AccountSubscriptionsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountSubscriptionsCreateSubscription**](AccountSubscriptionsApi.md#accountSubscriptionsCreateSubscription) | **POST** /accounts/{account_identifier}/subscriptions | Create Subscription
[**accountSubscriptionsDeleteSubscription**](AccountSubscriptionsApi.md#accountSubscriptionsDeleteSubscription) | **DELETE** /accounts/{account_identifier}/subscriptions/{subscription_identifier} | Delete Subscription
[**accountSubscriptionsListSubscriptions**](AccountSubscriptionsApi.md#accountSubscriptionsListSubscriptions) | **GET** /accounts/{account_identifier}/subscriptions | List Subscriptions
[**accountSubscriptionsUpdateSubscription**](AccountSubscriptionsApi.md#accountSubscriptionsUpdateSubscription) | **PUT** /accounts/{account_identifier}/subscriptions/{subscription_identifier} | Update Subscription

<a name="accountSubscriptionsCreateSubscription"></a>
# **accountSubscriptionsCreateSubscription**
> AccountSubscriptionResponseSingle accountSubscriptionsCreateSubscription(body, accountIdentifier)

Create Subscription

Creates an account subscription.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountSubscriptionsApi;

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


AccountSubscriptionsApi apiInstance = new AccountSubscriptionsApi();
SubscriptionV2 body = new SubscriptionV2(); // SubscriptionV2 | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    AccountSubscriptionResponseSingle result = apiInstance.accountSubscriptionsCreateSubscription(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountSubscriptionsApi#accountSubscriptionsCreateSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionV2**](SubscriptionV2.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**AccountSubscriptionResponseSingle**](AccountSubscriptionResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountSubscriptionsDeleteSubscription"></a>
# **accountSubscriptionsDeleteSubscription**
> InlineResponse20014 accountSubscriptionsDeleteSubscription(subscriptionIdentifier, accountIdentifier)

Delete Subscription

Deletes an account&#x27;s subscription.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountSubscriptionsApi;

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


AccountSubscriptionsApi apiInstance = new AccountSubscriptionsApi();
String subscriptionIdentifier = "subscriptionIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20014 result = apiInstance.accountSubscriptionsDeleteSubscription(subscriptionIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountSubscriptionsApi#accountSubscriptionsDeleteSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountSubscriptionsListSubscriptions"></a>
# **accountSubscriptionsListSubscriptions**
> AccountSubscriptionResponseCollection accountSubscriptionsListSubscriptions(accountIdentifier)

List Subscriptions

Lists all of an account&#x27;s subscriptions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountSubscriptionsApi;

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


AccountSubscriptionsApi apiInstance = new AccountSubscriptionsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    AccountSubscriptionResponseCollection result = apiInstance.accountSubscriptionsListSubscriptions(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountSubscriptionsApi#accountSubscriptionsListSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**AccountSubscriptionResponseCollection**](AccountSubscriptionResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountSubscriptionsUpdateSubscription"></a>
# **accountSubscriptionsUpdateSubscription**
> AccountSubscriptionResponseSingle accountSubscriptionsUpdateSubscription(body, subscriptionIdentifier, accountIdentifier)

Update Subscription

Updates an account subscription.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountSubscriptionsApi;

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


AccountSubscriptionsApi apiInstance = new AccountSubscriptionsApi();
SubscriptionV2 body = new SubscriptionV2(); // SubscriptionV2 | 
String subscriptionIdentifier = "subscriptionIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    AccountSubscriptionResponseSingle result = apiInstance.accountSubscriptionsUpdateSubscription(body, subscriptionIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountSubscriptionsApi#accountSubscriptionsUpdateSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionV2**](SubscriptionV2.md)|  |
 **subscriptionIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**AccountSubscriptionResponseSingle**](AccountSubscriptionResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

