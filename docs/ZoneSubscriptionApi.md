# ZoneSubscriptionApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneSubscriptionCreateZoneSubscription**](ZoneSubscriptionApi.md#zoneSubscriptionCreateZoneSubscription) | **POST** /zones/{identifier}/subscription | Create Zone Subscription
[**zoneSubscriptionUpdateZoneSubscription**](ZoneSubscriptionApi.md#zoneSubscriptionUpdateZoneSubscription) | **PUT** /zones/{identifier}/subscription | Update Zone Subscription
[**zoneSubscriptionZoneSubscriptionDetails**](ZoneSubscriptionApi.md#zoneSubscriptionZoneSubscriptionDetails) | **GET** /zones/{identifier}/subscription | Zone Subscription Details

<a name="zoneSubscriptionCreateZoneSubscription"></a>
# **zoneSubscriptionCreateZoneSubscription**
> ZoneSubscriptionResponseSingle zoneSubscriptionCreateZoneSubscription(body, identifier)

Create Zone Subscription

Create a zone subscription, either plan or add-ons.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneSubscriptionApi;

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


ZoneSubscriptionApi apiInstance = new ZoneSubscriptionApi();
SubscriptionV2 body = new SubscriptionV2(); // SubscriptionV2 | 
String identifier = "identifier_example"; // String | 
try {
    ZoneSubscriptionResponseSingle result = apiInstance.zoneSubscriptionCreateZoneSubscription(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneSubscriptionApi#zoneSubscriptionCreateZoneSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionV2**](SubscriptionV2.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**ZoneSubscriptionResponseSingle**](ZoneSubscriptionResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneSubscriptionUpdateZoneSubscription"></a>
# **zoneSubscriptionUpdateZoneSubscription**
> ZoneSubscriptionResponseSingle zoneSubscriptionUpdateZoneSubscription(body, identifier)

Update Zone Subscription

Updates zone subscriptions, either plan or add-ons.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneSubscriptionApi;

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


ZoneSubscriptionApi apiInstance = new ZoneSubscriptionApi();
SubscriptionV2 body = new SubscriptionV2(); // SubscriptionV2 | 
String identifier = "identifier_example"; // String | 
try {
    ZoneSubscriptionResponseSingle result = apiInstance.zoneSubscriptionUpdateZoneSubscription(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneSubscriptionApi#zoneSubscriptionUpdateZoneSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionV2**](SubscriptionV2.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**ZoneSubscriptionResponseSingle**](ZoneSubscriptionResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneSubscriptionZoneSubscriptionDetails"></a>
# **zoneSubscriptionZoneSubscriptionDetails**
> ZoneSubscriptionResponseSingle zoneSubscriptionZoneSubscriptionDetails(identifier)

Zone Subscription Details

Lists zone subscription details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneSubscriptionApi;

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


ZoneSubscriptionApi apiInstance = new ZoneSubscriptionApi();
String identifier = "identifier_example"; // String | 
try {
    ZoneSubscriptionResponseSingle result = apiInstance.zoneSubscriptionZoneSubscriptionDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneSubscriptionApi#zoneSubscriptionZoneSubscriptionDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**ZoneSubscriptionResponseSingle**](ZoneSubscriptionResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

