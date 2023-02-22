# IpAddressManagementPrefixesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipAddressManagementPrefixesAddPrefix**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesAddPrefix) | **POST** /accounts/{account_identifier}/addressing/prefixes | Add Prefix
[**ipAddressManagementPrefixesDeletePrefix**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesDeletePrefix) | **DELETE** /accounts/{account_identifier}/addressing/prefixes/{prefix_identifier} | Delete Prefix
[**ipAddressManagementPrefixesDownloadLoaDocument**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesDownloadLoaDocument) | **GET** /accounts/{account_identifier}/addressing/loa_documents/{loa_document_identifier}/download | Download LOA Document
[**ipAddressManagementPrefixesListPrefixes**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesListPrefixes) | **GET** /accounts/{account_identifier}/addressing/prefixes | List Prefixes
[**ipAddressManagementPrefixesPrefixDetails**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesPrefixDetails) | **GET** /accounts/{account_identifier}/addressing/prefixes/{prefix_identifier} | Prefix Details
[**ipAddressManagementPrefixesUpdatePrefixDescription**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesUpdatePrefixDescription) | **PATCH** /accounts/{account_identifier}/addressing/prefixes/{prefix_identifier} | Update Prefix Description
[**ipAddressManagementPrefixesUploadLoaDocument**](IpAddressManagementPrefixesApi.md#ipAddressManagementPrefixesUploadLoaDocument) | **POST** /accounts/{account_identifier}/addressing/loa_documents | Upload LOA Document

<a name="ipAddressManagementPrefixesAddPrefix"></a>
# **ipAddressManagementPrefixesAddPrefix**
> IpamPrefixesComponentsSchemasSingleResponse ipAddressManagementPrefixesAddPrefix(body, accountIdentifier)

Add Prefix

Add a prefix under the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementPrefixesApi;

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


IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi();
AddressingPrefixesBody body = new AddressingPrefixesBody(); // AddressingPrefixesBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    IpamPrefixesComponentsSchemasSingleResponse result = apiInstance.ipAddressManagementPrefixesAddPrefix(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesAddPrefix");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddressingPrefixesBody**](AddressingPrefixesBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**IpamPrefixesComponentsSchemasSingleResponse**](IpamPrefixesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementPrefixesDeletePrefix"></a>
# **ipAddressManagementPrefixesDeletePrefix**
> ApiResponseCollection ipAddressManagementPrefixesDeletePrefix(prefixIdentifier, accountIdentifier)

Delete Prefix

Delete an unapproved prefix owned by the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementPrefixesApi;

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


IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi();
String prefixIdentifier = "prefixIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseCollection result = apiInstance.ipAddressManagementPrefixesDeletePrefix(prefixIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesDeletePrefix");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefixIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseCollection**](ApiResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementPrefixesDownloadLoaDocument"></a>
# **ipAddressManagementPrefixesDownloadLoaDocument**
> Object ipAddressManagementPrefixesDownloadLoaDocument(loaDocumentIdentifier, accountIdentifier)

Download LOA Document

Download specified LOA document under the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementPrefixesApi;

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


IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi();
String loaDocumentIdentifier = "loaDocumentIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    Object result = apiInstance.ipAddressManagementPrefixesDownloadLoaDocument(loaDocumentIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesDownloadLoaDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loaDocumentIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

**Object**

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipAddressManagementPrefixesListPrefixes"></a>
# **ipAddressManagementPrefixesListPrefixes**
> IpamPrefixesComponentsSchemasResponseCollection ipAddressManagementPrefixesListPrefixes(accountIdentifier)

List Prefixes

List all prefixes owned by the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementPrefixesApi;

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


IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    IpamPrefixesComponentsSchemasResponseCollection result = apiInstance.ipAddressManagementPrefixesListPrefixes(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesListPrefixes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**IpamPrefixesComponentsSchemasResponseCollection**](IpamPrefixesComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipAddressManagementPrefixesPrefixDetails"></a>
# **ipAddressManagementPrefixesPrefixDetails**
> IpamPrefixesComponentsSchemasSingleResponse ipAddressManagementPrefixesPrefixDetails(prefixIdentifier, accountIdentifier)

Prefix Details

List a particular prefix owned by the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementPrefixesApi;

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


IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi();
String prefixIdentifier = "prefixIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    IpamPrefixesComponentsSchemasSingleResponse result = apiInstance.ipAddressManagementPrefixesPrefixDetails(prefixIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesPrefixDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefixIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**IpamPrefixesComponentsSchemasSingleResponse**](IpamPrefixesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipAddressManagementPrefixesUpdatePrefixDescription"></a>
# **ipAddressManagementPrefixesUpdatePrefixDescription**
> IpamPrefixesComponentsSchemasSingleResponse ipAddressManagementPrefixesUpdatePrefixDescription(body, prefixIdentifier, accountIdentifier)

Update Prefix Description

Modify the description for a prefix owned by the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementPrefixesApi;

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


IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi();
PrefixesPrefixIdentifierBody body = new PrefixesPrefixIdentifierBody(); // PrefixesPrefixIdentifierBody | 
String prefixIdentifier = "prefixIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    IpamPrefixesComponentsSchemasSingleResponse result = apiInstance.ipAddressManagementPrefixesUpdatePrefixDescription(body, prefixIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesUpdatePrefixDescription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrefixesPrefixIdentifierBody**](PrefixesPrefixIdentifierBody.md)|  |
 **prefixIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**IpamPrefixesComponentsSchemasSingleResponse**](IpamPrefixesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementPrefixesUploadLoaDocument"></a>
# **ipAddressManagementPrefixesUploadLoaDocument**
> LoaUploadResponse ipAddressManagementPrefixesUploadLoaDocument(loaDocument, accountIdentifier)

Upload LOA Document

Submit LOA document (pdf format) under the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementPrefixesApi;

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


IpAddressManagementPrefixesApi apiInstance = new IpAddressManagementPrefixesApi();
String loaDocument = "loaDocument_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LoaUploadResponse result = apiInstance.ipAddressManagementPrefixesUploadLoaDocument(loaDocument, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementPrefixesApi#ipAddressManagementPrefixesUploadLoaDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loaDocument** | **String**|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LoaUploadResponse**](LoaUploadResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

