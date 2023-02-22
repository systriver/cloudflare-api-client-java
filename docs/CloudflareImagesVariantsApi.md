# CloudflareImagesVariantsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloudflareImagesVariantsCreateAVariant**](CloudflareImagesVariantsApi.md#cloudflareImagesVariantsCreateAVariant) | **POST** /accounts/{account_identifier}/images/v1/variants | Create a variant
[**cloudflareImagesVariantsDeleteAVariant**](CloudflareImagesVariantsApi.md#cloudflareImagesVariantsDeleteAVariant) | **DELETE** /accounts/{account_identifier}/images/v1/variants/{identifier} | Delete a variant
[**cloudflareImagesVariantsListVariants**](CloudflareImagesVariantsApi.md#cloudflareImagesVariantsListVariants) | **GET** /accounts/{account_identifier}/images/v1/variants | List variants
[**cloudflareImagesVariantsUpdateAVariant**](CloudflareImagesVariantsApi.md#cloudflareImagesVariantsUpdateAVariant) | **PATCH** /accounts/{account_identifier}/images/v1/variants/{identifier} | Update a variant
[**cloudflareImagesVariantsVariantDetails**](CloudflareImagesVariantsApi.md#cloudflareImagesVariantsVariantDetails) | **GET** /accounts/{account_identifier}/images/v1/variants/{identifier} | Variant details

<a name="cloudflareImagesVariantsCreateAVariant"></a>
# **cloudflareImagesVariantsCreateAVariant**
> VariantSimpleResponse cloudflareImagesVariantsCreateAVariant(body, accountIdentifier)

Create a variant

Specify variants that allow you to resize images for different use cases.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesVariantsApi;

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


CloudflareImagesVariantsApi apiInstance = new CloudflareImagesVariantsApi();
VariantGenerationRequest body = new VariantGenerationRequest(); // VariantGenerationRequest | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VariantSimpleResponse result = apiInstance.cloudflareImagesVariantsCreateAVariant(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesVariantsApi#cloudflareImagesVariantsCreateAVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VariantGenerationRequest**](VariantGenerationRequest.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VariantSimpleResponse**](VariantSimpleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloudflareImagesVariantsDeleteAVariant"></a>
# **cloudflareImagesVariantsDeleteAVariant**
> CloudflareClientAPIDeletedResponse cloudflareImagesVariantsDeleteAVariant(identifier, accountIdentifier)

Delete a variant

Deleting a variant purges the cache for all images associated with the variant.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesVariantsApi;

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


CloudflareImagesVariantsApi apiInstance = new CloudflareImagesVariantsApi();
VariantsComponentsSchemasIdentifier identifier = new VariantsComponentsSchemasIdentifier(); // VariantsComponentsSchemasIdentifier | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CloudflareClientAPIDeletedResponse result = apiInstance.cloudflareImagesVariantsDeleteAVariant(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesVariantsApi#cloudflareImagesVariantsDeleteAVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**VariantsComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIDeletedResponse**](CloudflareClientAPIDeletedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloudflareImagesVariantsListVariants"></a>
# **cloudflareImagesVariantsListVariants**
> VariantListResponse cloudflareImagesVariantsListVariants(accountIdentifier)

List variants

Lists existing variants.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesVariantsApi;

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


CloudflareImagesVariantsApi apiInstance = new CloudflareImagesVariantsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VariantListResponse result = apiInstance.cloudflareImagesVariantsListVariants(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesVariantsApi#cloudflareImagesVariantsListVariants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VariantListResponse**](VariantListResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cloudflareImagesVariantsUpdateAVariant"></a>
# **cloudflareImagesVariantsUpdateAVariant**
> VariantSimpleResponse cloudflareImagesVariantsUpdateAVariant(body, identifier, accountIdentifier)

Update a variant

Updating a variant purges the cache for all images associated with the variant.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesVariantsApi;

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


CloudflareImagesVariantsApi apiInstance = new CloudflareImagesVariantsApi();
VariantPatchRequest body = new VariantPatchRequest(); // VariantPatchRequest | 
VariantsComponentsSchemasIdentifier identifier = new VariantsComponentsSchemasIdentifier(); // VariantsComponentsSchemasIdentifier | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VariantSimpleResponse result = apiInstance.cloudflareImagesVariantsUpdateAVariant(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesVariantsApi#cloudflareImagesVariantsUpdateAVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VariantPatchRequest**](VariantPatchRequest.md)|  |
 **identifier** | [**VariantsComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VariantSimpleResponse**](VariantSimpleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloudflareImagesVariantsVariantDetails"></a>
# **cloudflareImagesVariantsVariantDetails**
> VariantSimpleResponse cloudflareImagesVariantsVariantDetails(identifier, accountIdentifier)

Variant details

Fetch details for a single variant.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesVariantsApi;

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


CloudflareImagesVariantsApi apiInstance = new CloudflareImagesVariantsApi();
VariantsComponentsSchemasIdentifier identifier = new VariantsComponentsSchemasIdentifier(); // VariantsComponentsSchemasIdentifier | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VariantSimpleResponse result = apiInstance.cloudflareImagesVariantsVariantDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesVariantsApi#cloudflareImagesVariantsVariantDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**VariantsComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VariantSimpleResponse**](VariantSimpleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

