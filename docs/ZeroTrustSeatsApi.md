# ZeroTrustSeatsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zeroTrustSeatsUpdateAUserSeat**](ZeroTrustSeatsApi.md#zeroTrustSeatsUpdateAUserSeat) | **PATCH** /accounts/{identifier}/access/seats | Update a user seat

<a name="zeroTrustSeatsUpdateAUserSeat"></a>
# **zeroTrustSeatsUpdateAUserSeat**
> SeatsComponentsSchemasResponseCollection zeroTrustSeatsUpdateAUserSeat(body, identifier)

Update a user seat

Removes a user from a Zero Trust seat when both &#x60;access_seat&#x60; and &#x60;gateway_seat&#x60; are set to false.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustSeatsApi;

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


ZeroTrustSeatsApi apiInstance = new ZeroTrustSeatsApi();
List<Seat> body = Arrays.asList(new Seat()); // List<Seat> | 
SeatsComponentsSchemasIdentifier identifier = new SeatsComponentsSchemasIdentifier(); // SeatsComponentsSchemasIdentifier | 
try {
    SeatsComponentsSchemasResponseCollection result = apiInstance.zeroTrustSeatsUpdateAUserSeat(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustSeatsApi#zeroTrustSeatsUpdateAUserSeat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Seat&gt;**](Seat.md)|  |
 **identifier** | [**SeatsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**SeatsComponentsSchemasResponseCollection**](SeatsComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

