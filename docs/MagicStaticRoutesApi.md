# MagicStaticRoutesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**magicStaticRoutesCreateRoutes**](MagicStaticRoutesApi.md#magicStaticRoutesCreateRoutes) | **POST** /accounts/{account_identifier}/magic/routes | Create Routes
[**magicStaticRoutesDeleteManyRoutes**](MagicStaticRoutesApi.md#magicStaticRoutesDeleteManyRoutes) | **DELETE** /accounts/{account_identifier}/magic/routes | Delete Many Routes
[**magicStaticRoutesDeleteRoute**](MagicStaticRoutesApi.md#magicStaticRoutesDeleteRoute) | **DELETE** /accounts/{account_identifier}/magic/routes/{route_identifier} | Delete Route
[**magicStaticRoutesListRoutes**](MagicStaticRoutesApi.md#magicStaticRoutesListRoutes) | **GET** /accounts/{account_identifier}/magic/routes | List Routes
[**magicStaticRoutesRouteDetails**](MagicStaticRoutesApi.md#magicStaticRoutesRouteDetails) | **GET** /accounts/{account_identifier}/magic/routes/{route_identifier} | Route Details
[**magicStaticRoutesUpdateManyRoutes**](MagicStaticRoutesApi.md#magicStaticRoutesUpdateManyRoutes) | **PUT** /accounts/{account_identifier}/magic/routes | Update Many Routes
[**magicStaticRoutesUpdateRoute**](MagicStaticRoutesApi.md#magicStaticRoutesUpdateRoute) | **PUT** /accounts/{account_identifier}/magic/routes/{route_identifier} | Update Route

<a name="magicStaticRoutesCreateRoutes"></a>
# **magicStaticRoutesCreateRoutes**
> RoutesCollectionResponse magicStaticRoutesCreateRoutes(body, accountIdentifier)

Create Routes

Creates a new Magic static route. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to run validation only without persisting changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicStaticRoutesApi;

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


MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi();
Object body = null; // Object | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RoutesCollectionResponse result = apiInstance.magicStaticRoutesCreateRoutes(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesCreateRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RoutesCollectionResponse**](RoutesCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicStaticRoutesDeleteManyRoutes"></a>
# **magicStaticRoutesDeleteManyRoutes**
> MultipleRouteDeleteResponse magicStaticRoutesDeleteManyRoutes(body, accountIdentifier)

Delete Many Routes

Delete multiple Magic static routes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicStaticRoutesApi;

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


MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi();
RouteDeleteManyRequest body = new RouteDeleteManyRequest(); // RouteDeleteManyRequest | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    MultipleRouteDeleteResponse result = apiInstance.magicStaticRoutesDeleteManyRoutes(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesDeleteManyRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RouteDeleteManyRequest**](RouteDeleteManyRequest.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**MultipleRouteDeleteResponse**](MultipleRouteDeleteResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicStaticRoutesDeleteRoute"></a>
# **magicStaticRoutesDeleteRoute**
> RouteDeletedResponse magicStaticRoutesDeleteRoute(routeIdentifier, accountIdentifier)

Delete Route

Disable and remove a specific Magic static route.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicStaticRoutesApi;

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


MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi();
String routeIdentifier = "routeIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RouteDeletedResponse result = apiInstance.magicStaticRoutesDeleteRoute(routeIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesDeleteRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RouteDeletedResponse**](RouteDeletedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicStaticRoutesListRoutes"></a>
# **magicStaticRoutesListRoutes**
> RoutesCollectionResponse magicStaticRoutesListRoutes(accountIdentifier)

List Routes

List all Magic static routes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicStaticRoutesApi;

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


MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RoutesCollectionResponse result = apiInstance.magicStaticRoutesListRoutes(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesListRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RoutesCollectionResponse**](RoutesCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicStaticRoutesRouteDetails"></a>
# **magicStaticRoutesRouteDetails**
> RouteSingleResponse magicStaticRoutesRouteDetails(routeIdentifier, accountIdentifier)

Route Details

Get a specific Magic static route.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicStaticRoutesApi;

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


MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi();
String routeIdentifier = "routeIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RouteSingleResponse result = apiInstance.magicStaticRoutesRouteDetails(routeIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesRouteDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RouteSingleResponse**](RouteSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicStaticRoutesUpdateManyRoutes"></a>
# **magicStaticRoutesUpdateManyRoutes**
> MultipleRouteModifiedResponse magicStaticRoutesUpdateManyRoutes(body, accountIdentifier)

Update Many Routes

Update multiple Magic static routes. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to run validation only without persisting changes. Only fields for a route that need to be changed need be provided.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicStaticRoutesApi;

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


MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi();
RouteUpdateManyRequest body = new RouteUpdateManyRequest(); // RouteUpdateManyRequest | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    MultipleRouteModifiedResponse result = apiInstance.magicStaticRoutesUpdateManyRoutes(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesUpdateManyRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RouteUpdateManyRequest**](RouteUpdateManyRequest.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**MultipleRouteModifiedResponse**](MultipleRouteModifiedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicStaticRoutesUpdateRoute"></a>
# **magicStaticRoutesUpdateRoute**
> RouteModifiedResponse magicStaticRoutesUpdateRoute(body, routeIdentifier, accountIdentifier)

Update Route

Update a specific Magic static route. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to run validation only without persisting changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicStaticRoutesApi;

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


MagicStaticRoutesApi apiInstance = new MagicStaticRoutesApi();
RouteUpdateRequest body = new RouteUpdateRequest(); // RouteUpdateRequest | 
String routeIdentifier = "routeIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RouteModifiedResponse result = apiInstance.magicStaticRoutesUpdateRoute(body, routeIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicStaticRoutesApi#magicStaticRoutesUpdateRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RouteUpdateRequest**](RouteUpdateRequest.md)|  |
 **routeIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RouteModifiedResponse**](RouteModifiedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

