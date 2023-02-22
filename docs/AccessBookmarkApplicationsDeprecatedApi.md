# AccessBookmarkApplicationsDeprecatedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessBookmarkApplicationsDeprecatedCreateABookmarkApplication**](AccessBookmarkApplicationsDeprecatedApi.md#accessBookmarkApplicationsDeprecatedCreateABookmarkApplication) | **POST** /accounts/{identifier}/access/bookmarks/{uuid} | Create a Bookmark application
[**accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication**](AccessBookmarkApplicationsDeprecatedApi.md#accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication) | **DELETE** /accounts/{identifier}/access/bookmarks/{uuid} | Delete a Bookmark application
[**accessBookmarkApplicationsDeprecatedGetABookmarkApplication**](AccessBookmarkApplicationsDeprecatedApi.md#accessBookmarkApplicationsDeprecatedGetABookmarkApplication) | **GET** /accounts/{identifier}/access/bookmarks/{uuid} | Get a Bookmark application
[**accessBookmarkApplicationsDeprecatedListBookmarkApplications**](AccessBookmarkApplicationsDeprecatedApi.md#accessBookmarkApplicationsDeprecatedListBookmarkApplications) | **GET** /accounts/{identifier}/access/bookmarks | List Bookmark applications
[**accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication**](AccessBookmarkApplicationsDeprecatedApi.md#accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication) | **PUT** /accounts/{identifier}/access/bookmarks/{uuid} | Update a Bookmark application

<a name="accessBookmarkApplicationsDeprecatedCreateABookmarkApplication"></a>
# **accessBookmarkApplicationsDeprecatedCreateABookmarkApplication**
> BookmarksComponentsSchemasSingleResponse accessBookmarkApplicationsDeprecatedCreateABookmarkApplication(uuid, identifier)

Create a Bookmark application

Create a new Bookmark application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessBookmarkApplicationsDeprecatedApi;

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


AccessBookmarkApplicationsDeprecatedApi apiInstance = new AccessBookmarkApplicationsDeprecatedApi();
String uuid = "uuid_example"; // String | 
BookmarksComponentsSchemasIdentifier identifier = new BookmarksComponentsSchemasIdentifier(); // BookmarksComponentsSchemasIdentifier | 
try {
    BookmarksComponentsSchemasSingleResponse result = apiInstance.accessBookmarkApplicationsDeprecatedCreateABookmarkApplication(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessBookmarkApplicationsDeprecatedApi#accessBookmarkApplicationsDeprecatedCreateABookmarkApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**BookmarksComponentsSchemasIdentifier**](.md)|  |

### Return type

[**BookmarksComponentsSchemasSingleResponse**](BookmarksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication"></a>
# **accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication**
> BookmarksComponentsSchemasIdResponse accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication(uuid, identifier)

Delete a Bookmark application

Deletes a Bookmark application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessBookmarkApplicationsDeprecatedApi;

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


AccessBookmarkApplicationsDeprecatedApi apiInstance = new AccessBookmarkApplicationsDeprecatedApi();
String uuid = "uuid_example"; // String | 
BookmarksComponentsSchemasIdentifier identifier = new BookmarksComponentsSchemasIdentifier(); // BookmarksComponentsSchemasIdentifier | 
try {
    BookmarksComponentsSchemasIdResponse result = apiInstance.accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessBookmarkApplicationsDeprecatedApi#accessBookmarkApplicationsDeprecatedDeleteABookmarkApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**BookmarksComponentsSchemasIdentifier**](.md)|  |

### Return type

[**BookmarksComponentsSchemasIdResponse**](BookmarksComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessBookmarkApplicationsDeprecatedGetABookmarkApplication"></a>
# **accessBookmarkApplicationsDeprecatedGetABookmarkApplication**
> BookmarksComponentsSchemasSingleResponse accessBookmarkApplicationsDeprecatedGetABookmarkApplication(uuid, identifier)

Get a Bookmark application

Fetches a single Bookmark application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessBookmarkApplicationsDeprecatedApi;

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


AccessBookmarkApplicationsDeprecatedApi apiInstance = new AccessBookmarkApplicationsDeprecatedApi();
String uuid = "uuid_example"; // String | 
BookmarksComponentsSchemasIdentifier identifier = new BookmarksComponentsSchemasIdentifier(); // BookmarksComponentsSchemasIdentifier | 
try {
    BookmarksComponentsSchemasSingleResponse result = apiInstance.accessBookmarkApplicationsDeprecatedGetABookmarkApplication(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessBookmarkApplicationsDeprecatedApi#accessBookmarkApplicationsDeprecatedGetABookmarkApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**BookmarksComponentsSchemasIdentifier**](.md)|  |

### Return type

[**BookmarksComponentsSchemasSingleResponse**](BookmarksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessBookmarkApplicationsDeprecatedListBookmarkApplications"></a>
# **accessBookmarkApplicationsDeprecatedListBookmarkApplications**
> BookmarksComponentsSchemasResponseCollection accessBookmarkApplicationsDeprecatedListBookmarkApplications(identifier)

List Bookmark applications

Lists Bookmark applications.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessBookmarkApplicationsDeprecatedApi;

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


AccessBookmarkApplicationsDeprecatedApi apiInstance = new AccessBookmarkApplicationsDeprecatedApi();
BookmarksComponentsSchemasIdentifier identifier = new BookmarksComponentsSchemasIdentifier(); // BookmarksComponentsSchemasIdentifier | 
try {
    BookmarksComponentsSchemasResponseCollection result = apiInstance.accessBookmarkApplicationsDeprecatedListBookmarkApplications(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessBookmarkApplicationsDeprecatedApi#accessBookmarkApplicationsDeprecatedListBookmarkApplications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**BookmarksComponentsSchemasIdentifier**](.md)|  |

### Return type

[**BookmarksComponentsSchemasResponseCollection**](BookmarksComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication"></a>
# **accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication**
> BookmarksComponentsSchemasSingleResponse accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication(uuid, identifier)

Update a Bookmark application

Updates a configured Bookmark application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessBookmarkApplicationsDeprecatedApi;

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


AccessBookmarkApplicationsDeprecatedApi apiInstance = new AccessBookmarkApplicationsDeprecatedApi();
String uuid = "uuid_example"; // String | 
BookmarksComponentsSchemasIdentifier identifier = new BookmarksComponentsSchemasIdentifier(); // BookmarksComponentsSchemasIdentifier | 
try {
    BookmarksComponentsSchemasSingleResponse result = apiInstance.accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessBookmarkApplicationsDeprecatedApi#accessBookmarkApplicationsDeprecatedUpdateABookmarkApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**BookmarksComponentsSchemasIdentifier**](.md)|  |

### Return type

[**BookmarksComponentsSchemasSingleResponse**](BookmarksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

