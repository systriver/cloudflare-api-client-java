# ZoneRatePlanApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneRatePlanAvailablePlanDetails**](ZoneRatePlanApi.md#zoneRatePlanAvailablePlanDetails) | **GET** /zones/{zone_identifier}/available_plans/{plan_identifier} | Available Plan Details
[**zoneRatePlanListAvailablePlans**](ZoneRatePlanApi.md#zoneRatePlanListAvailablePlans) | **GET** /zones/{zone_identifier}/available_plans | List Available Plans
[**zoneRatePlanListAvailableRatePlans**](ZoneRatePlanApi.md#zoneRatePlanListAvailableRatePlans) | **GET** /zones/{zone_identifier}/available_rate_plans | List Available Rate Plans

<a name="zoneRatePlanAvailablePlanDetails"></a>
# **zoneRatePlanAvailablePlanDetails**
> InlineResponse200108 zoneRatePlanAvailablePlanDetails(planIdentifier, zoneIdentifier)

Available Plan Details

Details of the available plan that the zone can subscribe to.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRatePlanApi;

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


ZoneRatePlanApi apiInstance = new ZoneRatePlanApi();
String planIdentifier = "planIdentifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200108 result = apiInstance.zoneRatePlanAvailablePlanDetails(planIdentifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRatePlanApi#zoneRatePlanAvailablePlanDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planIdentifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200108**](InlineResponse200108.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneRatePlanListAvailablePlans"></a>
# **zoneRatePlanListAvailablePlans**
> InlineResponse200107 zoneRatePlanListAvailablePlans(zoneIdentifier)

List Available Plans

Lists available plans the zone can subscribe to.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRatePlanApi;

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


ZoneRatePlanApi apiInstance = new ZoneRatePlanApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200107 result = apiInstance.zoneRatePlanListAvailablePlans(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRatePlanApi#zoneRatePlanListAvailablePlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200107**](InlineResponse200107.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneRatePlanListAvailableRatePlans"></a>
# **zoneRatePlanListAvailableRatePlans**
> PlanResponseCollection zoneRatePlanListAvailableRatePlans(zoneIdentifier)

List Available Rate Plans

Lists all rate plans the zone can subscribe to.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRatePlanApi;

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


ZoneRatePlanApi apiInstance = new ZoneRatePlanApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    PlanResponseCollection result = apiInstance.zoneRatePlanListAvailableRatePlans(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRatePlanApi#zoneRatePlanListAvailableRatePlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**PlanResponseCollection**](PlanResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

