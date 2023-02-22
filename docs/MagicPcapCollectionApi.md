# MagicPcapCollectionApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**magicPcapCollectionAddBucketsForFullPacketCaptures**](MagicPcapCollectionApi.md#magicPcapCollectionAddBucketsForFullPacketCaptures) | **POST** /accounts/{account_identifier}/pcaps/ownership | Add buckets for full packet captures
[**magicPcapCollectionCreatePcapRequest**](MagicPcapCollectionApi.md#magicPcapCollectionCreatePcapRequest) | **POST** /accounts/{account_identifier}/pcaps | Create PCAP request
[**magicPcapCollectionDeleteBucketsForFullPacketCaptures**](MagicPcapCollectionApi.md#magicPcapCollectionDeleteBucketsForFullPacketCaptures) | **DELETE** /accounts/{account_identifier}/pcaps/ownership/{identifier} | Delete buckets for full packet captures
[**magicPcapCollectionDownloadSimplePcap**](MagicPcapCollectionApi.md#magicPcapCollectionDownloadSimplePcap) | **GET** /accounts/{account_identifier}/pcaps/{identifier}/download | Download Simple PCAP
[**magicPcapCollectionGetPcapRequest**](MagicPcapCollectionApi.md#magicPcapCollectionGetPcapRequest) | **GET** /accounts/{account_identifier}/pcaps/{identifier} | Get PCAP request
[**magicPcapCollectionListPacketCaptureRequests**](MagicPcapCollectionApi.md#magicPcapCollectionListPacketCaptureRequests) | **GET** /accounts/{account_identifier}/pcaps | List packet capture requests
[**magicPcapCollectionListPcaPsBucketOwnership**](MagicPcapCollectionApi.md#magicPcapCollectionListPcaPsBucketOwnership) | **GET** /accounts/{account_identifier}/pcaps/ownership | List PCAPs Bucket Ownership
[**magicPcapCollectionValidateBucketsForFullPacketCaptures**](MagicPcapCollectionApi.md#magicPcapCollectionValidateBucketsForFullPacketCaptures) | **POST** /accounts/{account_identifier}/pcaps/ownership/validate | Validate buckets for full packet captures

<a name="magicPcapCollectionAddBucketsForFullPacketCaptures"></a>
# **magicPcapCollectionAddBucketsForFullPacketCaptures**
> PcapsOwnershipSingleResponse magicPcapCollectionAddBucketsForFullPacketCaptures(body, accountIdentifier)

Add buckets for full packet captures

Adds an AWS or GCP bucket to use with full packet captures.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicPcapCollectionApi;

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


MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi();
PcapsOwnershipRequest body = new PcapsOwnershipRequest(); // PcapsOwnershipRequest | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PcapsOwnershipSingleResponse result = apiInstance.magicPcapCollectionAddBucketsForFullPacketCaptures(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionAddBucketsForFullPacketCaptures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PcapsOwnershipRequest**](PcapsOwnershipRequest.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PcapsOwnershipSingleResponse**](PcapsOwnershipSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicPcapCollectionCreatePcapRequest"></a>
# **magicPcapCollectionCreatePcapRequest**
> PcapsSingleResponse magicPcapCollectionCreatePcapRequest(body, accountIdentifier)

Create PCAP request

Create new PCAP request for account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicPcapCollectionApi;

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


MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi();
PcapsRequestPcap body = new PcapsRequestPcap(); // PcapsRequestPcap | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PcapsSingleResponse result = apiInstance.magicPcapCollectionCreatePcapRequest(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionCreatePcapRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PcapsRequestPcap**](PcapsRequestPcap.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PcapsSingleResponse**](PcapsSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicPcapCollectionDeleteBucketsForFullPacketCaptures"></a>
# **magicPcapCollectionDeleteBucketsForFullPacketCaptures**
> magicPcapCollectionDeleteBucketsForFullPacketCaptures(identifier, accountIdentifier)

Delete buckets for full packet captures

Deletes buckets added to the packet captures API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicPcapCollectionApi;

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


MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    apiInstance.magicPcapCollectionDeleteBucketsForFullPacketCaptures(identifier, accountIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionDeleteBucketsForFullPacketCaptures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicPcapCollectionDownloadSimplePcap"></a>
# **magicPcapCollectionDownloadSimplePcap**
> magicPcapCollectionDownloadSimplePcap(identifier, accountIdentifier)

Download Simple PCAP

Download PCAP information into a file. Response is a binary PCAP file.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicPcapCollectionApi;

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


MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    apiInstance.magicPcapCollectionDownloadSimplePcap(identifier, accountIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionDownloadSimplePcap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicPcapCollectionGetPcapRequest"></a>
# **magicPcapCollectionGetPcapRequest**
> PcapsSingleResponse magicPcapCollectionGetPcapRequest(identifier, accountIdentifier)

Get PCAP request

Get information for a PCAP request by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicPcapCollectionApi;

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


MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PcapsSingleResponse result = apiInstance.magicPcapCollectionGetPcapRequest(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionGetPcapRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PcapsSingleResponse**](PcapsSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicPcapCollectionListPacketCaptureRequests"></a>
# **magicPcapCollectionListPacketCaptureRequests**
> PcapsCollectionResponse magicPcapCollectionListPacketCaptureRequests(accountIdentifier)

List packet capture requests

Lists all packet capture requests for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicPcapCollectionApi;

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


MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PcapsCollectionResponse result = apiInstance.magicPcapCollectionListPacketCaptureRequests(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionListPacketCaptureRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PcapsCollectionResponse**](PcapsCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicPcapCollectionListPcaPsBucketOwnership"></a>
# **magicPcapCollectionListPcaPsBucketOwnership**
> PcapsOwnershipCollection magicPcapCollectionListPcaPsBucketOwnership(accountIdentifier)

List PCAPs Bucket Ownership

List all buckets configured for use with PCAPs API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicPcapCollectionApi;

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


MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PcapsOwnershipCollection result = apiInstance.magicPcapCollectionListPcaPsBucketOwnership(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionListPcaPsBucketOwnership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PcapsOwnershipCollection**](PcapsOwnershipCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicPcapCollectionValidateBucketsForFullPacketCaptures"></a>
# **magicPcapCollectionValidateBucketsForFullPacketCaptures**
> PcapsOwnershipSingleResponse magicPcapCollectionValidateBucketsForFullPacketCaptures(body, accountIdentifier)

Validate buckets for full packet captures

Validates buckets added to the packet captures API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicPcapCollectionApi;

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


MagicPcapCollectionApi apiInstance = new MagicPcapCollectionApi();
PcapsOwnershipValidateRequest body = new PcapsOwnershipValidateRequest(); // PcapsOwnershipValidateRequest | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PcapsOwnershipSingleResponse result = apiInstance.magicPcapCollectionValidateBucketsForFullPacketCaptures(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicPcapCollectionApi#magicPcapCollectionValidateBucketsForFullPacketCaptures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PcapsOwnershipValidateRequest**](PcapsOwnershipValidateRequest.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PcapsOwnershipSingleResponse**](PcapsOwnershipSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

