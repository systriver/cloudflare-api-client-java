# R2BucketApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**r2BucketCreateBucket**](R2BucketApi.md#r2BucketCreateBucket) | **POST** /accounts/{account_identifier}/r2/buckets | Create Bucket
[**r2BucketDeleteBucket**](R2BucketApi.md#r2BucketDeleteBucket) | **DELETE** /accounts/{account_identifier}/r2/buckets/{bucket_name} | Delete Bucket
[**r2BucketListBuckets**](R2BucketApi.md#r2BucketListBuckets) | **GET** /accounts/{account_identifier}/r2/buckets | List Buckets

<a name="r2BucketCreateBucket"></a>
# **r2BucketCreateBucket**
> R2SingleBucketOperationResponse r2BucketCreateBucket(body, accountIdentifier)

Create Bucket

Creates a new R2 bucket.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.R2BucketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


R2BucketApi apiInstance = new R2BucketApi();
Object body = null; // Object | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    R2SingleBucketOperationResponse result = apiInstance.r2BucketCreateBucket(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling R2BucketApi#r2BucketCreateBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**R2SingleBucketOperationResponse**](R2SingleBucketOperationResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="r2BucketDeleteBucket"></a>
# **r2BucketDeleteBucket**
> R2SingleBucketOperationResponse r2BucketDeleteBucket(bucketName, accountIdentifier)

Delete Bucket

Deletes an existing R2 bucket.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.R2BucketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


R2BucketApi apiInstance = new R2BucketApi();
String bucketName = "bucketName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    R2SingleBucketOperationResponse result = apiInstance.r2BucketDeleteBucket(bucketName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling R2BucketApi#r2BucketDeleteBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**R2SingleBucketOperationResponse**](R2SingleBucketOperationResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="r2BucketListBuckets"></a>
# **r2BucketListBuckets**
> R2SingleBucketOperationResponse r2BucketListBuckets(accountIdentifier)

List Buckets

Lists all R2 buckets on your account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.R2BucketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


R2BucketApi apiInstance = new R2BucketApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    R2SingleBucketOperationResponse result = apiInstance.r2BucketListBuckets(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling R2BucketApi#r2BucketListBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**R2SingleBucketOperationResponse**](R2SingleBucketOperationResponse.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

