# WorkersKvNamespaceApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workersKvNamespaceCreateANamespace**](WorkersKvNamespaceApi.md#workersKvNamespaceCreateANamespace) | **POST** /accounts/{account_identifier}/storage/kv/namespaces | Create a Namespace
[**workersKvNamespaceDeleteKeyValuePair**](WorkersKvNamespaceApi.md#workersKvNamespaceDeleteKeyValuePair) | **DELETE** /accounts/{account_identifier}/storage/kv/namespaces/{namespace_identifier}/values/{key_name} | Delete key-value pair
[**workersKvNamespaceDeleteMultipleKeyValuePairs**](WorkersKvNamespaceApi.md#workersKvNamespaceDeleteMultipleKeyValuePairs) | **DELETE** /accounts/{account_identifier}/storage/kv/namespaces/{namespace_identifier}/bulk | Delete multiple key-value pairs
[**workersKvNamespaceListANamespaceSKeys**](WorkersKvNamespaceApi.md#workersKvNamespaceListANamespaceSKeys) | **GET** /accounts/{account_identifier}/storage/kv/namespaces/{namespace_identifier}/keys | List a Namespace&#x27;s Keys
[**workersKvNamespaceListNamespaces**](WorkersKvNamespaceApi.md#workersKvNamespaceListNamespaces) | **GET** /accounts/{account_identifier}/storage/kv/namespaces | List Namespaces
[**workersKvNamespaceReadKeyValuePair**](WorkersKvNamespaceApi.md#workersKvNamespaceReadKeyValuePair) | **GET** /accounts/{account_identifier}/storage/kv/namespaces/{namespace_identifier}/values/{key_name} | Read key-value pair
[**workersKvNamespaceReadTheMetadataForAKey**](WorkersKvNamespaceApi.md#workersKvNamespaceReadTheMetadataForAKey) | **GET** /accounts/{account_identifier}/storage/kv/namespaces/{namespace_identifier}/metadata/{key_name} | Read the metadata for a key
[**workersKvNamespaceRemoveANamespace**](WorkersKvNamespaceApi.md#workersKvNamespaceRemoveANamespace) | **DELETE** /accounts/{account_identifier}/storage/kv/namespaces/{namespace_identifier} | Remove a Namespace
[**workersKvNamespaceRenameANamespace**](WorkersKvNamespaceApi.md#workersKvNamespaceRenameANamespace) | **PUT** /accounts/{account_identifier}/storage/kv/namespaces/{namespace_identifier} | Rename a Namespace
[**workersKvNamespaceWriteKeyValuePairWithMetadata**](WorkersKvNamespaceApi.md#workersKvNamespaceWriteKeyValuePairWithMetadata) | **PUT** /accounts/{account_identifier}/storage/kv/namespaces/{namespace_identifier}/values/{key_name} | Write key-value pair with metadata
[**workersKvNamespaceWriteMultipleKeyValuePairs**](WorkersKvNamespaceApi.md#workersKvNamespaceWriteMultipleKeyValuePairs) | **PUT** /accounts/{account_identifier}/storage/kv/namespaces/{namespace_identifier}/bulk | Write multiple key-value pairs

<a name="workersKvNamespaceCreateANamespace"></a>
# **workersKvNamespaceCreateANamespace**
> InlineResponse2009 workersKvNamespaceCreateANamespace(body, accountIdentifier)

Create a Namespace

Creates a namespace under the given title. A 400 is returned if the account already owns a namespace with this title. A namespace must be explicitly deleted to be replaced.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkersKvNamespaceApi;

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


WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi();
CreateRenameNamespaceBody body = new CreateRenameNamespaceBody(); // CreateRenameNamespaceBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse2009 result = apiInstance.workersKvNamespaceCreateANamespace(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceCreateANamespace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRenameNamespaceBody**](CreateRenameNamespaceBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workersKvNamespaceDeleteKeyValuePair"></a>
# **workersKvNamespaceDeleteKeyValuePair**
> ApiResponseSingle workersKvNamespaceDeleteKeyValuePair(keyName, namespaceIdentifier, accountIdentifier)

Delete key-value pair

Remove a KV pair from the Namespace. Use URL-encoding to use special characters (e.g. :, !, %) in the key name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkersKvNamespaceApi;

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


WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi();
String keyName = "keyName_example"; // String | 
String namespaceIdentifier = "namespaceIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.workersKvNamespaceDeleteKeyValuePair(keyName, namespaceIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceDeleteKeyValuePair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyName** | [**String**](.md)|  |
 **namespaceIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workersKvNamespaceDeleteMultipleKeyValuePairs"></a>
# **workersKvNamespaceDeleteMultipleKeyValuePairs**
> ApiResponseSingle workersKvNamespaceDeleteMultipleKeyValuePairs(body, namespaceIdentifier, accountIdentifier)

Delete multiple key-value pairs

Remove multiple KV pairs from the Namespace. Body should be an array of up to 10,000 keys to be removed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkersKvNamespaceApi;

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


WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi();
List<String> body = Arrays.asList("body_example"); // List<String> | 
String namespaceIdentifier = "namespaceIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.workersKvNamespaceDeleteMultipleKeyValuePairs(body, namespaceIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceDeleteMultipleKeyValuePairs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;String&gt;**](String.md)|  |
 **namespaceIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workersKvNamespaceListANamespaceSKeys"></a>
# **workersKvNamespaceListANamespaceSKeys**
> InlineResponse20010 workersKvNamespaceListANamespaceSKeys(namespaceIdentifier, accountIdentifier)

List a Namespace&#x27;s Keys

Lists a namespace&#x27;s keys.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkersKvNamespaceApi;

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


WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi();
String namespaceIdentifier = "namespaceIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20010 result = apiInstance.workersKvNamespaceListANamespaceSKeys(namespaceIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceListANamespaceSKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespaceIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workersKvNamespaceListNamespaces"></a>
# **workersKvNamespaceListNamespaces**
> InlineResponse2008 workersKvNamespaceListNamespaces(accountIdentifier)

List Namespaces

Returns the namespaces owned by an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkersKvNamespaceApi;

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


WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse2008 result = apiInstance.workersKvNamespaceListNamespaces(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceListNamespaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workersKvNamespaceReadKeyValuePair"></a>
# **workersKvNamespaceReadKeyValuePair**
> String workersKvNamespaceReadKeyValuePair(keyName, namespaceIdentifier, accountIdentifier)

Read key-value pair

Returns the value associated with the given key in the given namespace. Use URL-encoding to use special characters (e.g. :, !, %) in the key name. If the KV-pair is set to expire at some point, the expiration time as measured in seconds since the UNIX epoch will be returned in the \&quot;Expiration\&quot; response header.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkersKvNamespaceApi;

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


WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi();
String keyName = "keyName_example"; // String | 
String namespaceIdentifier = "namespaceIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    String result = apiInstance.workersKvNamespaceReadKeyValuePair(keyName, namespaceIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceReadKeyValuePair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyName** | [**String**](.md)|  |
 **namespaceIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

**String**

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workersKvNamespaceReadTheMetadataForAKey"></a>
# **workersKvNamespaceReadTheMetadataForAKey**
> InlineResponse20011 workersKvNamespaceReadTheMetadataForAKey(keyName, namespaceIdentifier, accountIdentifier)

Read the metadata for a key

Returns the metadata associated with the given key in the given namespace. Use URL-encoding to use special characters (e.g. :, !, %) in the key name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkersKvNamespaceApi;

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


WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi();
String keyName = "keyName_example"; // String | 
String namespaceIdentifier = "namespaceIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20011 result = apiInstance.workersKvNamespaceReadTheMetadataForAKey(keyName, namespaceIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceReadTheMetadataForAKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyName** | [**String**](.md)|  |
 **namespaceIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workersKvNamespaceRemoveANamespace"></a>
# **workersKvNamespaceRemoveANamespace**
> ApiResponseSingle workersKvNamespaceRemoveANamespace(namespaceIdentifier, accountIdentifier)

Remove a Namespace

Deletes the namespace corresponding to the given ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkersKvNamespaceApi;

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


WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi();
String namespaceIdentifier = "namespaceIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.workersKvNamespaceRemoveANamespace(namespaceIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceRemoveANamespace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespaceIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workersKvNamespaceRenameANamespace"></a>
# **workersKvNamespaceRenameANamespace**
> ApiResponseSingle workersKvNamespaceRenameANamespace(body, namespaceIdentifier, accountIdentifier)

Rename a Namespace

Modifies a namespace&#x27;s title.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkersKvNamespaceApi;

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


WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi();
CreateRenameNamespaceBody body = new CreateRenameNamespaceBody(); // CreateRenameNamespaceBody | 
String namespaceIdentifier = "namespaceIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.workersKvNamespaceRenameANamespace(body, namespaceIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceRenameANamespace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRenameNamespaceBody**](CreateRenameNamespaceBody.md)|  |
 **namespaceIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workersKvNamespaceWriteKeyValuePairWithMetadata"></a>
# **workersKvNamespaceWriteKeyValuePairWithMetadata**
> ApiResponseSingle workersKvNamespaceWriteKeyValuePairWithMetadata(metadata, value, keyName, namespaceIdentifier, accountIdentifier)

Write key-value pair with metadata

Write a value identified by a key. Use URL-encoding to use special characters (e.g. :, !, %) in the key name. Body should be the value to be stored along with json metadata to be associated with the key/value pair. Existing values, expirations and metadata will be overwritten. If neither &#x60;expiration&#x60; nor &#x60;expiration_ttl&#x60; is specified, the key-value pair will never expire. If both are set, &#x60;expiration_ttl&#x60; is used and &#x60;expiration&#x60; is ignored.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkersKvNamespaceApi;

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


WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi();
String metadata = "metadata_example"; // String | 
String value = "value_example"; // String | 
String keyName = "keyName_example"; // String | 
String namespaceIdentifier = "namespaceIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.workersKvNamespaceWriteKeyValuePairWithMetadata(metadata, value, keyName, namespaceIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceWriteKeyValuePairWithMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metadata** | [**String**](.md)|  |
 **value** | [**String**](.md)|  |
 **keyName** | [**String**](.md)|  |
 **namespaceIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="workersKvNamespaceWriteMultipleKeyValuePairs"></a>
# **workersKvNamespaceWriteMultipleKeyValuePairs**
> ApiResponseSingle workersKvNamespaceWriteMultipleKeyValuePairs(body, namespaceIdentifier, accountIdentifier)

Write multiple key-value pairs

Write multiple keys and values at once. Body should be an array of up to 10,000 key-value pairs to be stored, along with optional expiration information. Existing values and expirations will be overwritten. If neither expiration nor expiration_ttl is specified, the key-value pair will never expire. If both are set, &#x60;expiration_ttl&#x60; is used and &#x60;expiration&#x60; is ignored. The entire request size must be 100 megabytes or less.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkersKvNamespaceApi;

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


WorkersKvNamespaceApi apiInstance = new WorkersKvNamespaceApi();
List<BulkWriteInner> body = Arrays.asList(new BulkWriteInner()); // List<BulkWriteInner> | 
String namespaceIdentifier = "namespaceIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.workersKvNamespaceWriteMultipleKeyValuePairs(body, namespaceIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkersKvNamespaceApi#workersKvNamespaceWriteMultipleKeyValuePairs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;BulkWriteInner&gt;**](BulkWriteInner.md)|  |
 **namespaceIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

