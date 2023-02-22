# SecondaryDnsTsigApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secondaryDnsTsigCreateTsig**](SecondaryDnsTsigApi.md#secondaryDnsTsigCreateTsig) | **POST** /accounts/{account_identifier}/secondary_dns/tsigs | Create TSIG
[**secondaryDnsTsigDeleteTsig**](SecondaryDnsTsigApi.md#secondaryDnsTsigDeleteTsig) | **DELETE** /accounts/{account_identifier}/secondary_dns/tsigs/{identifier} | Delete TSIG
[**secondaryDnsTsigListTsiGs**](SecondaryDnsTsigApi.md#secondaryDnsTsigListTsiGs) | **GET** /accounts/{account_identifier}/secondary_dns/tsigs | List TSIGs
[**secondaryDnsTsigTsigDetails**](SecondaryDnsTsigApi.md#secondaryDnsTsigTsigDetails) | **GET** /accounts/{account_identifier}/secondary_dns/tsigs/{identifier} | TSIG Details
[**secondaryDnsTsigUpdateTsig**](SecondaryDnsTsigApi.md#secondaryDnsTsigUpdateTsig) | **PUT** /accounts/{account_identifier}/secondary_dns/tsigs/{identifier} | Update TSIG

<a name="secondaryDnsTsigCreateTsig"></a>
# **secondaryDnsTsigCreateTsig**
> CloudflareClientAPIComponentsSchemasSingleResponse secondaryDnsTsigCreateTsig(body, accountIdentifier)

Create TSIG

Create TSIG.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsTsigApi;

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


SecondaryDnsTsigApi apiInstance = new SecondaryDnsTsigApi();
Object body = null; // Object | 
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    CloudflareClientAPIComponentsSchemasSingleResponse result = apiInstance.secondaryDnsTsigCreateTsig(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsTsigApi#secondaryDnsTsigCreateTsig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIComponentsSchemasSingleResponse**](CloudflareClientAPIComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsTsigDeleteTsig"></a>
# **secondaryDnsTsigDeleteTsig**
> CloudflareClientAPIComponentsSchemasIdResponse secondaryDnsTsigDeleteTsig(identifier, accountIdentifier)

Delete TSIG

Delete TSIG.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsTsigApi;

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


SecondaryDnsTsigApi apiInstance = new SecondaryDnsTsigApi();
TsigComponentsSchemasIdentifier identifier = new TsigComponentsSchemasIdentifier(); // TsigComponentsSchemasIdentifier | 
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    CloudflareClientAPIComponentsSchemasIdResponse result = apiInstance.secondaryDnsTsigDeleteTsig(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsTsigApi#secondaryDnsTsigDeleteTsig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**TsigComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIComponentsSchemasIdResponse**](CloudflareClientAPIComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsTsigListTsiGs"></a>
# **secondaryDnsTsigListTsiGs**
> TsigComponentsSchemasResponseCollection secondaryDnsTsigListTsiGs(accountIdentifier)

List TSIGs

List TSIGs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsTsigApi;

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


SecondaryDnsTsigApi apiInstance = new SecondaryDnsTsigApi();
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    TsigComponentsSchemasResponseCollection result = apiInstance.secondaryDnsTsigListTsiGs(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsTsigApi#secondaryDnsTsigListTsiGs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**TsigComponentsSchemasResponseCollection**](TsigComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secondaryDnsTsigTsigDetails"></a>
# **secondaryDnsTsigTsigDetails**
> CloudflareClientAPIComponentsSchemasSingleResponse secondaryDnsTsigTsigDetails(identifier, accountIdentifier)

TSIG Details

Get TSIG.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsTsigApi;

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


SecondaryDnsTsigApi apiInstance = new SecondaryDnsTsigApi();
TsigComponentsSchemasIdentifier identifier = new TsigComponentsSchemasIdentifier(); // TsigComponentsSchemasIdentifier | 
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    CloudflareClientAPIComponentsSchemasSingleResponse result = apiInstance.secondaryDnsTsigTsigDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsTsigApi#secondaryDnsTsigTsigDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**TsigComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIComponentsSchemasSingleResponse**](CloudflareClientAPIComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secondaryDnsTsigUpdateTsig"></a>
# **secondaryDnsTsigUpdateTsig**
> CloudflareClientAPIComponentsSchemasSingleResponse secondaryDnsTsigUpdateTsig(body, identifier, accountIdentifier)

Update TSIG

Modify TSIG.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsTsigApi;

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


SecondaryDnsTsigApi apiInstance = new SecondaryDnsTsigApi();
CloudflareClientAPITsig body = new CloudflareClientAPITsig(); // CloudflareClientAPITsig | 
TsigComponentsSchemasIdentifier identifier = new TsigComponentsSchemasIdentifier(); // TsigComponentsSchemasIdentifier | 
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    CloudflareClientAPIComponentsSchemasSingleResponse result = apiInstance.secondaryDnsTsigUpdateTsig(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsTsigApi#secondaryDnsTsigUpdateTsig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPITsig**](CloudflareClientAPITsig.md)|  |
 **identifier** | [**TsigComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIComponentsSchemasSingleResponse**](CloudflareClientAPIComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

