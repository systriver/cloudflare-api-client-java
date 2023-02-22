# CloudflareIpsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloudflareIPsCloudflareIpDetails**](CloudflareIpsApi.md#cloudflareIPsCloudflareIpDetails) | **GET** /ips | Cloudflare IP Details

<a name="cloudflareIPsCloudflareIpDetails"></a>
# **cloudflareIPsCloudflareIpDetails**
> InlineResponse20026 cloudflareIPsCloudflareIpDetails()

Cloudflare IP Details

Get Cloudflare IPs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareIpsApi;

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


CloudflareIpsApi apiInstance = new CloudflareIpsApi();
try {
    InlineResponse20026 result = apiInstance.cloudflareIPsCloudflareIpDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareIpsApi#cloudflareIPsCloudflareIpDetails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

