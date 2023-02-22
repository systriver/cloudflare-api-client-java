# ZoneLevelAccessGroupsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneLevelAccessGroupsCreateAnAccessGroup**](ZoneLevelAccessGroupsApi.md#zoneLevelAccessGroupsCreateAnAccessGroup) | **POST** /zones/{identifier}/access/groups | Create an Access group
[**zoneLevelAccessGroupsDeleteAnAccessGroup**](ZoneLevelAccessGroupsApi.md#zoneLevelAccessGroupsDeleteAnAccessGroup) | **DELETE** /zones/{identifier}/access/groups/{uuid} | Delete an Access group
[**zoneLevelAccessGroupsGetAnAccessGroup**](ZoneLevelAccessGroupsApi.md#zoneLevelAccessGroupsGetAnAccessGroup) | **GET** /zones/{identifier}/access/groups/{uuid} | Get an Access group
[**zoneLevelAccessGroupsListAccessGroups**](ZoneLevelAccessGroupsApi.md#zoneLevelAccessGroupsListAccessGroups) | **GET** /zones/{identifier}/access/groups | List Access groups
[**zoneLevelAccessGroupsUpdateAnAccessGroup**](ZoneLevelAccessGroupsApi.md#zoneLevelAccessGroupsUpdateAnAccessGroup) | **PUT** /zones/{identifier}/access/groups/{uuid} | Update an Access group

<a name="zoneLevelAccessGroupsCreateAnAccessGroup"></a>
# **zoneLevelAccessGroupsCreateAnAccessGroup**
> GroupsComponentsSchemasSingleResponse zoneLevelAccessGroupsCreateAnAccessGroup(body, identifier)

Create an Access group

Creates a new Access group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessGroupsApi;

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


ZoneLevelAccessGroupsApi apiInstance = new ZoneLevelAccessGroupsApi();
AccessGroupsBody1 body = new AccessGroupsBody1(); // AccessGroupsBody1 | 
String identifier = "identifier_example"; // String | 
try {
    GroupsComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessGroupsCreateAnAccessGroup(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessGroupsApi#zoneLevelAccessGroupsCreateAnAccessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessGroupsBody1**](AccessGroupsBody1.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**GroupsComponentsSchemasSingleResponse**](GroupsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLevelAccessGroupsDeleteAnAccessGroup"></a>
# **zoneLevelAccessGroupsDeleteAnAccessGroup**
> GroupsComponentsSchemasIdResponse zoneLevelAccessGroupsDeleteAnAccessGroup(uuid, identifier)

Delete an Access group

Deletes an Access group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessGroupsApi;

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


ZoneLevelAccessGroupsApi apiInstance = new ZoneLevelAccessGroupsApi();
SchemasUuid uuid = new SchemasUuid(); // SchemasUuid | 
String identifier = "identifier_example"; // String | 
try {
    GroupsComponentsSchemasIdResponse result = apiInstance.zoneLevelAccessGroupsDeleteAnAccessGroup(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessGroupsApi#zoneLevelAccessGroupsDeleteAnAccessGroup");
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

<a name="zoneLevelAccessGroupsGetAnAccessGroup"></a>
# **zoneLevelAccessGroupsGetAnAccessGroup**
> GroupsComponentsSchemasSingleResponse zoneLevelAccessGroupsGetAnAccessGroup(uuid, identifier)

Get an Access group

Fetches a single Access group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessGroupsApi;

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


ZoneLevelAccessGroupsApi apiInstance = new ZoneLevelAccessGroupsApi();
SchemasUuid uuid = new SchemasUuid(); // SchemasUuid | 
String identifier = "identifier_example"; // String | 
try {
    GroupsComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessGroupsGetAnAccessGroup(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessGroupsApi#zoneLevelAccessGroupsGetAnAccessGroup");
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

<a name="zoneLevelAccessGroupsListAccessGroups"></a>
# **zoneLevelAccessGroupsListAccessGroups**
> GroupsComponentsSchemasResponseCollection zoneLevelAccessGroupsListAccessGroups(identifier)

List Access groups

Lists all Access groups.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessGroupsApi;

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


ZoneLevelAccessGroupsApi apiInstance = new ZoneLevelAccessGroupsApi();
String identifier = "identifier_example"; // String | 
try {
    GroupsComponentsSchemasResponseCollection result = apiInstance.zoneLevelAccessGroupsListAccessGroups(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessGroupsApi#zoneLevelAccessGroupsListAccessGroups");
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

<a name="zoneLevelAccessGroupsUpdateAnAccessGroup"></a>
# **zoneLevelAccessGroupsUpdateAnAccessGroup**
> GroupsComponentsSchemasSingleResponse zoneLevelAccessGroupsUpdateAnAccessGroup(body, uuid, identifier)

Update an Access group

Updates a configured Access group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessGroupsApi;

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


ZoneLevelAccessGroupsApi apiInstance = new ZoneLevelAccessGroupsApi();
GroupsUuidBody1 body = new GroupsUuidBody1(); // GroupsUuidBody1 | 
SchemasUuid uuid = new SchemasUuid(); // SchemasUuid | 
String identifier = "identifier_example"; // String | 
try {
    GroupsComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessGroupsUpdateAnAccessGroup(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessGroupsApi#zoneLevelAccessGroupsUpdateAnAccessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GroupsUuidBody1**](GroupsUuidBody1.md)|  |
 **uuid** | [**SchemasUuid**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**GroupsComponentsSchemasSingleResponse**](GroupsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

