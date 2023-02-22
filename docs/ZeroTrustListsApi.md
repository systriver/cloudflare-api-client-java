# ZeroTrustListsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zeroTrustListsCreateZeroTrustList**](ZeroTrustListsApi.md#zeroTrustListsCreateZeroTrustList) | **POST** /accounts/{identifier}/gateway/lists | Create Zero Trust List
[**zeroTrustListsDeleteZeroTrustList**](ZeroTrustListsApi.md#zeroTrustListsDeleteZeroTrustList) | **DELETE** /accounts/{identifier}/gateway/lists/{uuid} | Delete Zero Trust List
[**zeroTrustListsListZeroTrustLists**](ZeroTrustListsApi.md#zeroTrustListsListZeroTrustLists) | **GET** /accounts/{identifier}/gateway/lists | List Zero Trust Lists
[**zeroTrustListsPatchZeroTrustList**](ZeroTrustListsApi.md#zeroTrustListsPatchZeroTrustList) | **PATCH** /accounts/{identifier}/gateway/lists/{uuid} | Patch Zero Trust List
[**zeroTrustListsUpdateZeroTrustList**](ZeroTrustListsApi.md#zeroTrustListsUpdateZeroTrustList) | **PUT** /accounts/{identifier}/gateway/lists/{uuid} | Update Zero Trust List
[**zeroTrustListsZeroTrustListDetails**](ZeroTrustListsApi.md#zeroTrustListsZeroTrustListDetails) | **GET** /accounts/{identifier}/gateway/lists/{uuid} | Zero Trust List Details
[**zeroTrustListsZeroTrustListItems**](ZeroTrustListsApi.md#zeroTrustListsZeroTrustListItems) | **GET** /accounts/{identifier}/gateway/lists/{uuid}/items | Zero Trust List Items

<a name="zeroTrustListsCreateZeroTrustList"></a>
# **zeroTrustListsCreateZeroTrustList**
> SingleResponseWithListItems zeroTrustListsCreateZeroTrustList(body, identifier)

Create Zero Trust List

Create a new Zero Trust List.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustListsApi;

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


ZeroTrustListsApi apiInstance = new ZeroTrustListsApi();
GatewayListsBody body = new GatewayListsBody(); // GatewayListsBody | 
ListsComponentsSchemasIdentifier identifier = new ListsComponentsSchemasIdentifier(); // ListsComponentsSchemasIdentifier | 
try {
    SingleResponseWithListItems result = apiInstance.zeroTrustListsCreateZeroTrustList(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsCreateZeroTrustList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayListsBody**](GatewayListsBody.md)|  |
 **identifier** | [**ListsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**SingleResponseWithListItems**](SingleResponseWithListItems.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustListsDeleteZeroTrustList"></a>
# **zeroTrustListsDeleteZeroTrustList**
> ListsComponentsSchemasEmptyResponse zeroTrustListsDeleteZeroTrustList(uuid, identifier)

Delete Zero Trust List

Delete a Zero Trust List.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustListsApi;

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


ZeroTrustListsApi apiInstance = new ZeroTrustListsApi();
String uuid = "uuid_example"; // String | 
ListsComponentsSchemasIdentifier identifier = new ListsComponentsSchemasIdentifier(); // ListsComponentsSchemasIdentifier | 
try {
    ListsComponentsSchemasEmptyResponse result = apiInstance.zeroTrustListsDeleteZeroTrustList(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsDeleteZeroTrustList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**ListsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ListsComponentsSchemasEmptyResponse**](ListsComponentsSchemasEmptyResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustListsListZeroTrustLists"></a>
# **zeroTrustListsListZeroTrustLists**
> ListsComponentsSchemasResponseCollection zeroTrustListsListZeroTrustLists(identifier)

List Zero Trust Lists

List Zero Trust Lists for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustListsApi;

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


ZeroTrustListsApi apiInstance = new ZeroTrustListsApi();
ListsComponentsSchemasIdentifier identifier = new ListsComponentsSchemasIdentifier(); // ListsComponentsSchemasIdentifier | 
try {
    ListsComponentsSchemasResponseCollection result = apiInstance.zeroTrustListsListZeroTrustLists(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsListZeroTrustLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**ListsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ListsComponentsSchemasResponseCollection**](ListsComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zeroTrustListsPatchZeroTrustList"></a>
# **zeroTrustListsPatchZeroTrustList**
> ListsComponentsSchemasSingleResponse zeroTrustListsPatchZeroTrustList(body, uuid, identifier)

Patch Zero Trust List

Append or remove an item from a configured Zero Trust List.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustListsApi;

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


ZeroTrustListsApi apiInstance = new ZeroTrustListsApi();
ListsUuidBody1 body = new ListsUuidBody1(); // ListsUuidBody1 | 
String uuid = "uuid_example"; // String | 
ListsComponentsSchemasIdentifier identifier = new ListsComponentsSchemasIdentifier(); // ListsComponentsSchemasIdentifier | 
try {
    ListsComponentsSchemasSingleResponse result = apiInstance.zeroTrustListsPatchZeroTrustList(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsPatchZeroTrustList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListsUuidBody1**](ListsUuidBody1.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**ListsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ListsComponentsSchemasSingleResponse**](ListsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustListsUpdateZeroTrustList"></a>
# **zeroTrustListsUpdateZeroTrustList**
> ListsComponentsSchemasSingleResponse zeroTrustListsUpdateZeroTrustList(body, uuid, identifier)

Update Zero Trust List

Update a configured Zero Trust List.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustListsApi;

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


ZeroTrustListsApi apiInstance = new ZeroTrustListsApi();
ListsUuidBody body = new ListsUuidBody(); // ListsUuidBody | 
String uuid = "uuid_example"; // String | 
ListsComponentsSchemasIdentifier identifier = new ListsComponentsSchemasIdentifier(); // ListsComponentsSchemasIdentifier | 
try {
    ListsComponentsSchemasSingleResponse result = apiInstance.zeroTrustListsUpdateZeroTrustList(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsUpdateZeroTrustList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListsUuidBody**](ListsUuidBody.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**ListsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ListsComponentsSchemasSingleResponse**](ListsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustListsZeroTrustListDetails"></a>
# **zeroTrustListsZeroTrustListDetails**
> ListsComponentsSchemasSingleResponse zeroTrustListsZeroTrustListDetails(uuid, identifier)

Zero Trust List Details

Fetch a single Zero Trust List.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustListsApi;

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


ZeroTrustListsApi apiInstance = new ZeroTrustListsApi();
String uuid = "uuid_example"; // String | 
ListsComponentsSchemasIdentifier identifier = new ListsComponentsSchemasIdentifier(); // ListsComponentsSchemasIdentifier | 
try {
    ListsComponentsSchemasSingleResponse result = apiInstance.zeroTrustListsZeroTrustListDetails(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsZeroTrustListDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**ListsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ListsComponentsSchemasSingleResponse**](ListsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zeroTrustListsZeroTrustListItems"></a>
# **zeroTrustListsZeroTrustListItems**
> ListItemResponseCollection zeroTrustListsZeroTrustListItems(uuid, identifier)

Zero Trust List Items

Fetch all items of a single Zero Trust List.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustListsApi;

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


ZeroTrustListsApi apiInstance = new ZeroTrustListsApi();
String uuid = "uuid_example"; // String | 
ListsComponentsSchemasIdentifier identifier = new ListsComponentsSchemasIdentifier(); // ListsComponentsSchemasIdentifier | 
try {
    ListItemResponseCollection result = apiInstance.zeroTrustListsZeroTrustListItems(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustListsApi#zeroTrustListsZeroTrustListItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**ListsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ListItemResponseCollection**](ListItemResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

