# Web3HostnameApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**web3HostnameCreateIpfsUniversalPathGatewayContentListEntry**](Web3HostnameApi.md#web3HostnameCreateIpfsUniversalPathGatewayContentListEntry) | **POST** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list/entries | Create IPFS Universal Path Gateway Content List Entry
[**web3HostnameCreateWeb3Hostname**](Web3HostnameApi.md#web3HostnameCreateWeb3Hostname) | **POST** /zones/{zone_identifier}/web3/hostnames | Create Web3 Hostname
[**web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry**](Web3HostnameApi.md#web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry) | **DELETE** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list/entries/{content_list_entry_identifier} | Delete IPFS Universal Path Gateway Content List Entry
[**web3HostnameDeleteWeb3Hostname**](Web3HostnameApi.md#web3HostnameDeleteWeb3Hostname) | **DELETE** /zones/{zone_identifier}/web3/hostnames/{identifier} | Delete Web3 Hostname
[**web3HostnameEditIpfsUniversalPathGatewayContentListEntry**](Web3HostnameApi.md#web3HostnameEditIpfsUniversalPathGatewayContentListEntry) | **PUT** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list/entries/{content_list_entry_identifier} | Edit IPFS Universal Path Gateway Content List Entry
[**web3HostnameEditWeb3Hostname**](Web3HostnameApi.md#web3HostnameEditWeb3Hostname) | **PATCH** /zones/{zone_identifier}/web3/hostnames/{identifier} | Edit Web3 Hostname
[**web3HostnameIpfsUniversalPathGatewayContentListDetails**](Web3HostnameApi.md#web3HostnameIpfsUniversalPathGatewayContentListDetails) | **GET** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list | IPFS Universal Path Gateway Content List Details
[**web3HostnameIpfsUniversalPathGatewayContentListEntryDetails**](Web3HostnameApi.md#web3HostnameIpfsUniversalPathGatewayContentListEntryDetails) | **GET** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list/entries/{content_list_entry_identifier} | IPFS Universal Path Gateway Content List Entry Details
[**web3HostnameListIpfsUniversalPathGatewayContentListEntries**](Web3HostnameApi.md#web3HostnameListIpfsUniversalPathGatewayContentListEntries) | **GET** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list/entries | List IPFS Universal Path Gateway Content List Entries
[**web3HostnameListWeb3Hostnames**](Web3HostnameApi.md#web3HostnameListWeb3Hostnames) | **GET** /zones/{zone_identifier}/web3/hostnames | List Web3 Hostnames
[**web3HostnameUpdateIpfsUniversalPathGatewayContentList**](Web3HostnameApi.md#web3HostnameUpdateIpfsUniversalPathGatewayContentList) | **PUT** /zones/{zone_identifier}/web3/hostnames/{identifier}/ipfs_universal_path/content_list | Update IPFS Universal Path Gateway Content List
[**web3HostnameWeb3HostnameDetails**](Web3HostnameApi.md#web3HostnameWeb3HostnameDetails) | **GET** /zones/{zone_identifier}/web3/hostnames/{identifier} | Web3 Hostname Details

<a name="web3HostnameCreateIpfsUniversalPathGatewayContentListEntry"></a>
# **web3HostnameCreateIpfsUniversalPathGatewayContentListEntry**
> ContentListEntrySingleResponse web3HostnameCreateIpfsUniversalPathGatewayContentListEntry(body, identifier, zoneIdentifier)

Create IPFS Universal Path Gateway Content List Entry

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Web3HostnameApi;

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


Web3HostnameApi apiInstance = new Web3HostnameApi();
ContentListEntryCreateRequest body = new ContentListEntryCreateRequest(); // ContentListEntryCreateRequest | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ContentListEntrySingleResponse result = apiInstance.web3HostnameCreateIpfsUniversalPathGatewayContentListEntry(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Web3HostnameApi#web3HostnameCreateIpfsUniversalPathGatewayContentListEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentListEntryCreateRequest**](ContentListEntryCreateRequest.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ContentListEntrySingleResponse**](ContentListEntrySingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="web3HostnameCreateWeb3Hostname"></a>
# **web3HostnameCreateWeb3Hostname**
> Web3HostnameComponentsSchemasSingleResponse web3HostnameCreateWeb3Hostname(body, zoneIdentifier)

Create Web3 Hostname

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Web3HostnameApi;

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


Web3HostnameApi apiInstance = new Web3HostnameApi();
CreateRequest body = new CreateRequest(); // CreateRequest | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    Web3HostnameComponentsSchemasSingleResponse result = apiInstance.web3HostnameCreateWeb3Hostname(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Web3HostnameApi#web3HostnameCreateWeb3Hostname");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRequest**](CreateRequest.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**Web3HostnameComponentsSchemasSingleResponse**](Web3HostnameComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry"></a>
# **web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry**
> CloudflareClientAPIApiResponseSingleId web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry(contentListEntryIdentifier, identifier, zoneIdentifier)

Delete IPFS Universal Path Gateway Content List Entry

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Web3HostnameApi;

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


Web3HostnameApi apiInstance = new Web3HostnameApi();
String contentListEntryIdentifier = "contentListEntryIdentifier_example"; // String | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry(contentListEntryIdentifier, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Web3HostnameApi#web3HostnameDeleteIpfsUniversalPathGatewayContentListEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentListEntryIdentifier** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="web3HostnameDeleteWeb3Hostname"></a>
# **web3HostnameDeleteWeb3Hostname**
> CloudflareClientAPIApiResponseSingleId web3HostnameDeleteWeb3Hostname(identifier, zoneIdentifier)

Delete Web3 Hostname

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Web3HostnameApi;

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


Web3HostnameApi apiInstance = new Web3HostnameApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.web3HostnameDeleteWeb3Hostname(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Web3HostnameApi#web3HostnameDeleteWeb3Hostname");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="web3HostnameEditIpfsUniversalPathGatewayContentListEntry"></a>
# **web3HostnameEditIpfsUniversalPathGatewayContentListEntry**
> ContentListEntrySingleResponse web3HostnameEditIpfsUniversalPathGatewayContentListEntry(body, contentListEntryIdentifier, identifier, zoneIdentifier)

Edit IPFS Universal Path Gateway Content List Entry

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Web3HostnameApi;

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


Web3HostnameApi apiInstance = new Web3HostnameApi();
ContentListEntryCreateRequest body = new ContentListEntryCreateRequest(); // ContentListEntryCreateRequest | 
String contentListEntryIdentifier = "contentListEntryIdentifier_example"; // String | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ContentListEntrySingleResponse result = apiInstance.web3HostnameEditIpfsUniversalPathGatewayContentListEntry(body, contentListEntryIdentifier, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Web3HostnameApi#web3HostnameEditIpfsUniversalPathGatewayContentListEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentListEntryCreateRequest**](ContentListEntryCreateRequest.md)|  |
 **contentListEntryIdentifier** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ContentListEntrySingleResponse**](ContentListEntrySingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="web3HostnameEditWeb3Hostname"></a>
# **web3HostnameEditWeb3Hostname**
> Web3HostnameComponentsSchemasSingleResponse web3HostnameEditWeb3Hostname(body, identifier, zoneIdentifier)

Edit Web3 Hostname

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Web3HostnameApi;

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


Web3HostnameApi apiInstance = new Web3HostnameApi();
ModifyRequest body = new ModifyRequest(); // ModifyRequest | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    Web3HostnameComponentsSchemasSingleResponse result = apiInstance.web3HostnameEditWeb3Hostname(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Web3HostnameApi#web3HostnameEditWeb3Hostname");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModifyRequest**](ModifyRequest.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**Web3HostnameComponentsSchemasSingleResponse**](Web3HostnameComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="web3HostnameIpfsUniversalPathGatewayContentListDetails"></a>
# **web3HostnameIpfsUniversalPathGatewayContentListDetails**
> ContentListDetailsResponse web3HostnameIpfsUniversalPathGatewayContentListDetails(identifier, zoneIdentifier)

IPFS Universal Path Gateway Content List Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Web3HostnameApi;

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


Web3HostnameApi apiInstance = new Web3HostnameApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ContentListDetailsResponse result = apiInstance.web3HostnameIpfsUniversalPathGatewayContentListDetails(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Web3HostnameApi#web3HostnameIpfsUniversalPathGatewayContentListDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ContentListDetailsResponse**](ContentListDetailsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="web3HostnameIpfsUniversalPathGatewayContentListEntryDetails"></a>
# **web3HostnameIpfsUniversalPathGatewayContentListEntryDetails**
> ContentListEntrySingleResponse web3HostnameIpfsUniversalPathGatewayContentListEntryDetails(contentListEntryIdentifier, identifier, zoneIdentifier)

IPFS Universal Path Gateway Content List Entry Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Web3HostnameApi;

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


Web3HostnameApi apiInstance = new Web3HostnameApi();
String contentListEntryIdentifier = "contentListEntryIdentifier_example"; // String | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ContentListEntrySingleResponse result = apiInstance.web3HostnameIpfsUniversalPathGatewayContentListEntryDetails(contentListEntryIdentifier, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Web3HostnameApi#web3HostnameIpfsUniversalPathGatewayContentListEntryDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentListEntryIdentifier** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ContentListEntrySingleResponse**](ContentListEntrySingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="web3HostnameListIpfsUniversalPathGatewayContentListEntries"></a>
# **web3HostnameListIpfsUniversalPathGatewayContentListEntries**
> ContentListEntryCollectionResponse web3HostnameListIpfsUniversalPathGatewayContentListEntries(identifier, zoneIdentifier)

List IPFS Universal Path Gateway Content List Entries

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Web3HostnameApi;

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


Web3HostnameApi apiInstance = new Web3HostnameApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ContentListEntryCollectionResponse result = apiInstance.web3HostnameListIpfsUniversalPathGatewayContentListEntries(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Web3HostnameApi#web3HostnameListIpfsUniversalPathGatewayContentListEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ContentListEntryCollectionResponse**](ContentListEntryCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="web3HostnameListWeb3Hostnames"></a>
# **web3HostnameListWeb3Hostnames**
> ComponentsSchemasCollectionResponse web3HostnameListWeb3Hostnames(zoneIdentifier)

List Web3 Hostnames

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Web3HostnameApi;

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


Web3HostnameApi apiInstance = new Web3HostnameApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ComponentsSchemasCollectionResponse result = apiInstance.web3HostnameListWeb3Hostnames(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Web3HostnameApi#web3HostnameListWeb3Hostnames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ComponentsSchemasCollectionResponse**](ComponentsSchemasCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="web3HostnameUpdateIpfsUniversalPathGatewayContentList"></a>
# **web3HostnameUpdateIpfsUniversalPathGatewayContentList**
> ContentListDetailsResponse web3HostnameUpdateIpfsUniversalPathGatewayContentList(body, identifier, zoneIdentifier)

Update IPFS Universal Path Gateway Content List

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Web3HostnameApi;

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


Web3HostnameApi apiInstance = new Web3HostnameApi();
ContentListUpdateRequest body = new ContentListUpdateRequest(); // ContentListUpdateRequest | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ContentListDetailsResponse result = apiInstance.web3HostnameUpdateIpfsUniversalPathGatewayContentList(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Web3HostnameApi#web3HostnameUpdateIpfsUniversalPathGatewayContentList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentListUpdateRequest**](ContentListUpdateRequest.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ContentListDetailsResponse**](ContentListDetailsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="web3HostnameWeb3HostnameDetails"></a>
# **web3HostnameWeb3HostnameDetails**
> Web3HostnameComponentsSchemasSingleResponse web3HostnameWeb3HostnameDetails(identifier, zoneIdentifier)

Web3 Hostname Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.Web3HostnameApi;

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


Web3HostnameApi apiInstance = new Web3HostnameApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    Web3HostnameComponentsSchemasSingleResponse result = apiInstance.web3HostnameWeb3HostnameDetails(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling Web3HostnameApi#web3HostnameWeb3HostnameDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**Web3HostnameComponentsSchemasSingleResponse**](Web3HostnameComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

