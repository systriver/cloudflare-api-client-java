# LoadBalancerHealthcheckEventsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loadBalancerHealthcheckEventsListHealthcheckEvents**](LoadBalancerHealthcheckEventsApi.md#loadBalancerHealthcheckEventsListHealthcheckEvents) | **GET** /user/load_balancing_analytics/events | List Healthcheck Events

<a name="loadBalancerHealthcheckEventsListHealthcheckEvents"></a>
# **loadBalancerHealthcheckEventsListHealthcheckEvents**
> AnalyticsComponentsSchemasResponseCollection loadBalancerHealthcheckEventsListHealthcheckEvents()

List Healthcheck Events

List origin health changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerHealthcheckEventsApi;

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


LoadBalancerHealthcheckEventsApi apiInstance = new LoadBalancerHealthcheckEventsApi();
try {
    AnalyticsComponentsSchemasResponseCollection result = apiInstance.loadBalancerHealthcheckEventsListHealthcheckEvents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerHealthcheckEventsApi#loadBalancerHealthcheckEventsListHealthcheckEvents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AnalyticsComponentsSchemasResponseCollection**](AnalyticsComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

