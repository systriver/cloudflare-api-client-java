# ListsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listsCreateAList**](ListsApi.md#listsCreateAList) | **POST** /accounts/{account_identifier}/rules/lists | Create a list
[**listsCreateListItems**](ListsApi.md#listsCreateListItems) | **POST** /accounts/{account_identifier}/rules/lists/{list_id}/items | Create list items
[**listsDeleteAList**](ListsApi.md#listsDeleteAList) | **DELETE** /accounts/{account_identifier}/rules/lists/{list_id} | Delete a list
[**listsDeleteListItems**](ListsApi.md#listsDeleteListItems) | **DELETE** /accounts/{account_identifier}/rules/lists/{list_id}/items | Delete list items
[**listsGetAList**](ListsApi.md#listsGetAList) | **GET** /accounts/{account_identifier}/rules/lists/{list_id} | Get a list
[**listsGetAListItem**](ListsApi.md#listsGetAListItem) | **GET** /accounts/{account_identifier}/rules/lists/{list_id}/items/{item_id} | Get a list item
[**listsGetBulkOperationStatus**](ListsApi.md#listsGetBulkOperationStatus) | **GET** /accounts/{account_identifier}/rules/lists/bulk_operations/{operation_id} | Get bulk operation status
[**listsGetListItems**](ListsApi.md#listsGetListItems) | **GET** /accounts/{account_identifier}/rules/lists/{list_id}/items | Get list items
[**listsGetLists**](ListsApi.md#listsGetLists) | **GET** /accounts/{account_identifier}/rules/lists | Get lists
[**listsUpdateAList**](ListsApi.md#listsUpdateAList) | **PUT** /accounts/{account_identifier}/rules/lists/{list_id} | Update a list
[**listsUpdateAllListItems**](ListsApi.md#listsUpdateAllListItems) | **PUT** /accounts/{account_identifier}/rules/lists/{list_id}/items | Update all list items

<a name="listsCreateAList"></a>
# **listsCreateAList**
> ListResponseCollection listsCreateAList(body, accountIdentifier)

Create a list

Creates a new list of the specified type.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

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


ListsApi apiInstance = new ListsApi();
RulesListsBody body = new RulesListsBody(); // RulesListsBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ListResponseCollection result = apiInstance.listsCreateAList(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#listsCreateAList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RulesListsBody**](RulesListsBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ListResponseCollection**](ListResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsCreateListItems"></a>
# **listsCreateListItems**
> ListsAsyncResponse listsCreateListItems(body, listId, accountIdentifier)

Create list items

Appends new items to the list.  This operation is asynchronous. To get current the operation status, invoke the [Get bulk operation status](#lists-get-bulk-operation-status) endpoint with the returned &#x60;operation_id&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

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


ListsApi apiInstance = new ListsApi();
List<Object> body = null; // List<Object> | 
String listId = "listId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ListsAsyncResponse result = apiInstance.listsCreateListItems(body, listId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#listsCreateListItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Object&gt;**](Object.md)|  |
 **listId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ListsAsyncResponse**](ListsAsyncResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsDeleteAList"></a>
# **listsDeleteAList**
> ListDeleteResponseCollection listsDeleteAList(listId, accountIdentifier)

Delete a list

Deletes a specific list and all its items.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

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


ListsApi apiInstance = new ListsApi();
String listId = "listId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ListDeleteResponseCollection result = apiInstance.listsDeleteAList(listId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#listsDeleteAList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ListDeleteResponseCollection**](ListDeleteResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsDeleteListItems"></a>
# **listsDeleteListItems**
> ListsAsyncResponse listsDeleteListItems(body, listId, accountIdentifier)

Delete list items

Removes one or more items from a list.  This operation is asynchronous. To get current the operation status, invoke the [Get bulk operation status](#lists-get-bulk-operation-status) endpoint with the returned &#x60;operation_id&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

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


ListsApi apiInstance = new ListsApi();
ListIdItemsBody body = new ListIdItemsBody(); // ListIdItemsBody | 
String listId = "listId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ListsAsyncResponse result = apiInstance.listsDeleteListItems(body, listId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#listsDeleteListItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListIdItemsBody**](ListIdItemsBody.md)|  |
 **listId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ListsAsyncResponse**](ListsAsyncResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsGetAList"></a>
# **listsGetAList**
> ListResponseCollection listsGetAList(listId, accountIdentifier)

Get a list

Fetches the details of a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

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


ListsApi apiInstance = new ListsApi();
String listId = "listId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ListResponseCollection result = apiInstance.listsGetAList(listId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#listsGetAList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ListResponseCollection**](ListResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listsGetAListItem"></a>
# **listsGetAListItem**
> ItemResponseCollection listsGetAListItem(itemId, listId, accountIdentifier)

Get a list item

Fetches a list item in the list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

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


ListsApi apiInstance = new ListsApi();
String itemId = "itemId_example"; // String | 
String listId = "listId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ItemResponseCollection result = apiInstance.listsGetAListItem(itemId, listId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#listsGetAListItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | [**String**](.md)|  |
 **listId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ItemResponseCollection**](ItemResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listsGetBulkOperationStatus"></a>
# **listsGetBulkOperationStatus**
> BulkOperationResponseCollection listsGetBulkOperationStatus(operationId, accountIdentifier)

Get bulk operation status

Gets the current status of an asynchronous operation on a list.  The &#x60;status&#x60; property can have one of the following values: &#x60;pending&#x60;, &#x60;running&#x60;, &#x60;completed&#x60;, or &#x60;failed&#x60;. If the status is &#x60;failed&#x60;, the &#x60;error&#x60; property will contain a message describing the error.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

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


ListsApi apiInstance = new ListsApi();
String operationId = "operationId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    BulkOperationResponseCollection result = apiInstance.listsGetBulkOperationStatus(operationId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#listsGetBulkOperationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operationId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**BulkOperationResponseCollection**](BulkOperationResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listsGetListItems"></a>
# **listsGetListItems**
> ItemsListResponseCollection listsGetListItems(listId, accountIdentifier)

Get list items

Fetches all the items in the list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

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


ListsApi apiInstance = new ListsApi();
String listId = "listId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ItemsListResponseCollection result = apiInstance.listsGetListItems(listId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#listsGetListItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ItemsListResponseCollection**](ItemsListResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listsGetLists"></a>
# **listsGetLists**
> ListsResponseCollection listsGetLists(accountIdentifier)

Get lists

Fetches all lists in the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

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


ListsApi apiInstance = new ListsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ListsResponseCollection result = apiInstance.listsGetLists(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#listsGetLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ListsResponseCollection**](ListsResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listsUpdateAList"></a>
# **listsUpdateAList**
> ListResponseCollection listsUpdateAList(body, listId, accountIdentifier)

Update a list

Updates the description of a list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

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


ListsApi apiInstance = new ListsApi();
ListsListIdBody body = new ListsListIdBody(); // ListsListIdBody | 
String listId = "listId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ListResponseCollection result = apiInstance.listsUpdateAList(body, listId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#listsUpdateAList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListsListIdBody**](ListsListIdBody.md)|  |
 **listId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ListResponseCollection**](ListResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listsUpdateAllListItems"></a>
# **listsUpdateAllListItems**
> ListsAsyncResponse listsUpdateAllListItems(body, listId, accountIdentifier)

Update all list items

Removes all existing items from the list and adds the provided items to the list.  This operation is asynchronous. To get current the operation status, invoke the [Get bulk operation status](#lists-get-bulk-operation-status) endpoint with the returned &#x60;operation_id&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

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


ListsApi apiInstance = new ListsApi();
List<Object> body = null; // List<Object> | 
String listId = "listId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ListsAsyncResponse result = apiInstance.listsUpdateAllListItems(body, listId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#listsUpdateAllListItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Object&gt;**](Object.md)|  |
 **listId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ListsAsyncResponse**](ListsAsyncResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

