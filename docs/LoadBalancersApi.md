# LoadBalancersApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loadBalancersCreateLoadBalancer**](LoadBalancersApi.md#loadBalancersCreateLoadBalancer) | **POST** /zones/{identifier}/load_balancers | Create Load Balancer
[**loadBalancersDeleteLoadBalancer**](LoadBalancersApi.md#loadBalancersDeleteLoadBalancer) | **DELETE** /zones/{identifier1}/load_balancers/{identifier} | Delete Load Balancer
[**loadBalancersListLoadBalancers**](LoadBalancersApi.md#loadBalancersListLoadBalancers) | **GET** /zones/{identifier}/load_balancers | List Load Balancers
[**loadBalancersLoadBalancerDetails**](LoadBalancersApi.md#loadBalancersLoadBalancerDetails) | **GET** /zones/{identifier1}/load_balancers/{identifier} | Load Balancer Details
[**loadBalancersPatchLoadBalancer**](LoadBalancersApi.md#loadBalancersPatchLoadBalancer) | **PATCH** /zones/{identifier1}/load_balancers/{identifier} | Patch Load Balancer
[**loadBalancersUpdateLoadBalancer**](LoadBalancersApi.md#loadBalancersUpdateLoadBalancer) | **PUT** /zones/{identifier1}/load_balancers/{identifier} | Update Load Balancer

<a name="loadBalancersCreateLoadBalancer"></a>
# **loadBalancersCreateLoadBalancer**
> LoadBalancerComponentsSchemasSingleResponse loadBalancersCreateLoadBalancer(body, identifier)

Create Load Balancer

Create a new load balancer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancersApi;

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


LoadBalancersApi apiInstance = new LoadBalancersApi();
IdentifierLoadBalancersBody body = new IdentifierLoadBalancersBody(); // IdentifierLoadBalancersBody | 
LoadBalancerComponentsSchemasIdentifier identifier = new LoadBalancerComponentsSchemasIdentifier(); // LoadBalancerComponentsSchemasIdentifier | 
try {
    LoadBalancerComponentsSchemasSingleResponse result = apiInstance.loadBalancersCreateLoadBalancer(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancersApi#loadBalancersCreateLoadBalancer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdentifierLoadBalancersBody**](IdentifierLoadBalancersBody.md)|  |
 **identifier** | [**LoadBalancerComponentsSchemasIdentifier**](.md)|  |

### Return type

[**LoadBalancerComponentsSchemasSingleResponse**](LoadBalancerComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadBalancersDeleteLoadBalancer"></a>
# **loadBalancersDeleteLoadBalancer**
> LoadBalancerComponentsSchemasIdResponse loadBalancersDeleteLoadBalancer(identifier, identifier1)

Delete Load Balancer

Delete a configured load balancer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancersApi;

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


LoadBalancersApi apiInstance = new LoadBalancersApi();
LoadBalancerComponentsSchemasIdentifier identifier = new LoadBalancerComponentsSchemasIdentifier(); // LoadBalancerComponentsSchemasIdentifier | 
LoadBalancerComponentsSchemasIdentifier identifier1 = new LoadBalancerComponentsSchemasIdentifier(); // LoadBalancerComponentsSchemasIdentifier | 
try {
    LoadBalancerComponentsSchemasIdResponse result = apiInstance.loadBalancersDeleteLoadBalancer(identifier, identifier1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancersApi#loadBalancersDeleteLoadBalancer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**LoadBalancerComponentsSchemasIdentifier**](.md)|  |
 **identifier1** | [**LoadBalancerComponentsSchemasIdentifier**](.md)|  |

### Return type

[**LoadBalancerComponentsSchemasIdResponse**](LoadBalancerComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadBalancersListLoadBalancers"></a>
# **loadBalancersListLoadBalancers**
> LoadBalancerComponentsSchemasResponseCollection loadBalancersListLoadBalancers(identifier)

List Load Balancers

List configured load balancers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancersApi;

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


LoadBalancersApi apiInstance = new LoadBalancersApi();
LoadBalancerComponentsSchemasIdentifier identifier = new LoadBalancerComponentsSchemasIdentifier(); // LoadBalancerComponentsSchemasIdentifier | 
try {
    LoadBalancerComponentsSchemasResponseCollection result = apiInstance.loadBalancersListLoadBalancers(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancersApi#loadBalancersListLoadBalancers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**LoadBalancerComponentsSchemasIdentifier**](.md)|  |

### Return type

[**LoadBalancerComponentsSchemasResponseCollection**](LoadBalancerComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loadBalancersLoadBalancerDetails"></a>
# **loadBalancersLoadBalancerDetails**
> LoadBalancerComponentsSchemasSingleResponse loadBalancersLoadBalancerDetails(identifier, identifier1)

Load Balancer Details

Fetch a single configured load balancer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancersApi;

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


LoadBalancersApi apiInstance = new LoadBalancersApi();
LoadBalancerComponentsSchemasIdentifier identifier = new LoadBalancerComponentsSchemasIdentifier(); // LoadBalancerComponentsSchemasIdentifier | 
LoadBalancerComponentsSchemasIdentifier identifier1 = new LoadBalancerComponentsSchemasIdentifier(); // LoadBalancerComponentsSchemasIdentifier | 
try {
    LoadBalancerComponentsSchemasSingleResponse result = apiInstance.loadBalancersLoadBalancerDetails(identifier, identifier1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancersApi#loadBalancersLoadBalancerDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**LoadBalancerComponentsSchemasIdentifier**](.md)|  |
 **identifier1** | [**LoadBalancerComponentsSchemasIdentifier**](.md)|  |

### Return type

[**LoadBalancerComponentsSchemasSingleResponse**](LoadBalancerComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loadBalancersPatchLoadBalancer"></a>
# **loadBalancersPatchLoadBalancer**
> LoadBalancerComponentsSchemasSingleResponse loadBalancersPatchLoadBalancer(body, identifier, identifier1)

Patch Load Balancer

Apply changes to an existing load balancer, overwriting the supplied properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancersApi;

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


LoadBalancersApi apiInstance = new LoadBalancersApi();
LoadBalancersIdentifierBody1 body = new LoadBalancersIdentifierBody1(); // LoadBalancersIdentifierBody1 | 
LoadBalancerComponentsSchemasIdentifier identifier = new LoadBalancerComponentsSchemasIdentifier(); // LoadBalancerComponentsSchemasIdentifier | 
LoadBalancerComponentsSchemasIdentifier identifier1 = new LoadBalancerComponentsSchemasIdentifier(); // LoadBalancerComponentsSchemasIdentifier | 
try {
    LoadBalancerComponentsSchemasSingleResponse result = apiInstance.loadBalancersPatchLoadBalancer(body, identifier, identifier1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancersApi#loadBalancersPatchLoadBalancer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoadBalancersIdentifierBody1**](LoadBalancersIdentifierBody1.md)|  |
 **identifier** | [**LoadBalancerComponentsSchemasIdentifier**](.md)|  |
 **identifier1** | [**LoadBalancerComponentsSchemasIdentifier**](.md)|  |

### Return type

[**LoadBalancerComponentsSchemasSingleResponse**](LoadBalancerComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadBalancersUpdateLoadBalancer"></a>
# **loadBalancersUpdateLoadBalancer**
> LoadBalancerComponentsSchemasSingleResponse loadBalancersUpdateLoadBalancer(body, identifier, identifier1)

Update Load Balancer

Update a configured load balancer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancersApi;

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


LoadBalancersApi apiInstance = new LoadBalancersApi();
LoadBalancersIdentifierBody body = new LoadBalancersIdentifierBody(); // LoadBalancersIdentifierBody | 
LoadBalancerComponentsSchemasIdentifier identifier = new LoadBalancerComponentsSchemasIdentifier(); // LoadBalancerComponentsSchemasIdentifier | 
LoadBalancerComponentsSchemasIdentifier identifier1 = new LoadBalancerComponentsSchemasIdentifier(); // LoadBalancerComponentsSchemasIdentifier | 
try {
    LoadBalancerComponentsSchemasSingleResponse result = apiInstance.loadBalancersUpdateLoadBalancer(body, identifier, identifier1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancersApi#loadBalancersUpdateLoadBalancer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoadBalancersIdentifierBody**](LoadBalancersIdentifierBody.md)|  |
 **identifier** | [**LoadBalancerComponentsSchemasIdentifier**](.md)|  |
 **identifier1** | [**LoadBalancerComponentsSchemasIdentifier**](.md)|  |

### Return type

[**LoadBalancerComponentsSchemasSingleResponse**](LoadBalancerComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

