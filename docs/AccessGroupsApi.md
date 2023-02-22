# AccessGroupsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessGroupsCreateAnAccessGroup**](AccessGroupsApi.md#accessGroupsCreateAnAccessGroup) | **POST** /accounts/{identifier}/access/groups | Create an Access group
[**accessGroupsDeleteAnAccessGroup**](AccessGroupsApi.md#accessGroupsDeleteAnAccessGroup) | **DELETE** /accounts/{identifier}/access/groups/{uuid} | Delete an Access group
[**accessGroupsGetAnAccessGroup**](AccessGroupsApi.md#accessGroupsGetAnAccessGroup) | **GET** /accounts/{identifier}/access/groups/{uuid} | Get an Access group
[**accessGroupsListAccessGroups**](AccessGroupsApi.md#accessGroupsListAccessGroups) | **GET** /accounts/{identifier}/access/groups | List Access groups
[**accessGroupsUpdateAnAccessGroup**](AccessGroupsApi.md#accessGroupsUpdateAnAccessGroup) | **PUT** /accounts/{identifier}/access/groups/{uuid} | Update an Access group

<a name="accessGroupsCreateAnAccessGroup"></a>
# **accessGroupsCreateAnAccessGroup**
> GroupsComponentsSchemasSingleResponse accessGroupsCreateAnAccessGroup(body, identifier)

Create an Access group

Creates a new Access group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessGroupsApi;

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


AccessGroupsApi apiInstance = new AccessGroupsApi();
AccessGroupsBody body = new AccessGroupsBody(); // AccessGroupsBody | 
String identifier = "identifier_example"; // String | 
try {
    GroupsComponentsSchemasSingleResponse result = apiInstance.accessGroupsCreateAnAccessGroup(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessGroupsApi#accessGroupsCreateAnAccessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessGroupsBody**](AccessGroupsBody.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**GroupsComponentsSchemasSingleResponse**](GroupsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessGroupsDeleteAnAccessGroup"></a>
# **accessGroupsDeleteAnAccessGroup**
> GroupsComponentsSchemasIdResponse accessGroupsDeleteAnAccessGroup(uuid, identifier)

Delete an Access group

Deletes an Access group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessGroupsApi;

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


AccessGroupsApi apiInstance = new AccessGroupsApi();
SchemasUuid uuid = new SchemasUuid(); // SchemasUuid | 
String identifier = "identifier_example"; // String | 
try {
    GroupsComponentsSchemasIdResponse result = apiInstance.accessGroupsDeleteAnAccessGroup(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessGroupsApi#accessGroupsDeleteAnAccessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**SchemasUuid**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**GroupsComponentsSchemasIdResponse**](GroupsComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessGroupsGetAnAccessGroup"></a>
# **accessGroupsGetAnAccessGroup**
> GroupsComponentsSchemasSingleResponse accessGroupsGetAnAccessGroup(uuid, identifier)

Get an Access group

Fetches a single Access group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessGroupsApi;

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


AccessGroupsApi apiInstance = new AccessGroupsApi();
SchemasUuid uuid = new SchemasUuid(); // SchemasUuid | 
String identifier = "identifier_example"; // String | 
try {
    GroupsComponentsSchemasSingleResponse result = apiInstance.accessGroupsGetAnAccessGroup(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessGroupsApi#accessGroupsGetAnAccessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**SchemasUuid**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**GroupsComponentsSchemasSingleResponse**](GroupsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessGroupsListAccessGroups"></a>
# **accessGroupsListAccessGroups**
> GroupsComponentsSchemasResponseCollection accessGroupsListAccessGroups(identifier)

List Access groups

Lists all Access groups.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessGroupsApi;

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


AccessGroupsApi apiInstance = new AccessGroupsApi();
String identifier = "identifier_example"; // String | 
try {
    GroupsComponentsSchemasResponseCollection result = apiInstance.accessGroupsListAccessGroups(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessGroupsApi#accessGroupsListAccessGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**GroupsComponentsSchemasResponseCollection**](GroupsComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessGroupsUpdateAnAccessGroup"></a>
# **accessGroupsUpdateAnAccessGroup**
> GroupsComponentsSchemasSingleResponse accessGroupsUpdateAnAccessGroup(body, uuid, identifier)

Update an Access group

Updates a configured Access group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessGroupsApi;

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


AccessGroupsApi apiInstance = new AccessGroupsApi();
GroupsUuidBody body = new GroupsUuidBody(); // GroupsUuidBody | 
SchemasUuid uuid = new SchemasUuid(); // SchemasUuid | 
String identifier = "identifier_example"; // String | 
try {
    GroupsComponentsSchemasSingleResponse result = apiInstance.accessGroupsUpdateAnAccessGroup(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessGroupsApi#accessGroupsUpdateAnAccessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GroupsUuidBody**](GroupsUuidBody.md)|  |
 **uuid** | [**SchemasUuid**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**GroupsComponentsSchemasSingleResponse**](GroupsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

