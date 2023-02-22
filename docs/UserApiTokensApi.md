# UserApiTokensApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userApiTokensCreateToken**](UserApiTokensApi.md#userApiTokensCreateToken) | **POST** /user/tokens | Create Token
[**userApiTokensDeleteToken**](UserApiTokensApi.md#userApiTokensDeleteToken) | **DELETE** /user/tokens/{identifier} | Delete Token
[**userApiTokensListTokens**](UserApiTokensApi.md#userApiTokensListTokens) | **GET** /user/tokens | List Tokens
[**userApiTokensRollToken**](UserApiTokensApi.md#userApiTokensRollToken) | **PUT** /user/tokens/{identifier}/value | Roll Token
[**userApiTokensTokenDetails**](UserApiTokensApi.md#userApiTokensTokenDetails) | **GET** /user/tokens/{identifier} | Token Details
[**userApiTokensUpdateToken**](UserApiTokensApi.md#userApiTokensUpdateToken) | **PUT** /user/tokens/{identifier} | Update Token
[**userApiTokensVerifyToken**](UserApiTokensApi.md#userApiTokensVerifyToken) | **GET** /user/tokens/verify | Verify Token

<a name="userApiTokensCreateToken"></a>
# **userApiTokensCreateToken**
> ResponseCreate userApiTokensCreateToken(body)

Create Token

Create a new access token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApiTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApiTokensApi apiInstance = new UserApiTokensApi();
CreatePayload body = new CreatePayload(); // CreatePayload | 
try {
    ResponseCreate result = apiInstance.userApiTokensCreateToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApiTokensApi#userApiTokensCreateToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreatePayload**](CreatePayload.md)|  |

### Return type

[**ResponseCreate**](ResponseCreate.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userApiTokensDeleteToken"></a>
# **userApiTokensDeleteToken**
> CloudflareClientAPIApiResponseSingleId userApiTokensDeleteToken(identifier)

Delete Token

Destroy a token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApiTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApiTokensApi apiInstance = new UserApiTokensApi();
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.userApiTokensDeleteToken(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApiTokensApi#userApiTokensDeleteToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userApiTokensListTokens"></a>
# **userApiTokensListTokens**
> CloudflareClientAPIResponseCollection userApiTokensListTokens()

List Tokens

List all access tokens you created.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApiTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApiTokensApi apiInstance = new UserApiTokensApi();
try {
    CloudflareClientAPIResponseCollection result = apiInstance.userApiTokensListTokens();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApiTokensApi#userApiTokensListTokens");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CloudflareClientAPIResponseCollection**](CloudflareClientAPIResponseCollection.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userApiTokensRollToken"></a>
# **userApiTokensRollToken**
> ResponseSingleValue userApiTokensRollToken(body, identifier)

Roll Token

Roll the token secret.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApiTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApiTokensApi apiInstance = new UserApiTokensApi();
Object body = null; // Object | 
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
try {
    ResponseSingleValue result = apiInstance.userApiTokensRollToken(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApiTokensApi#userApiTokensRollToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |

### Return type

[**ResponseSingleValue**](ResponseSingleValue.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userApiTokensTokenDetails"></a>
# **userApiTokensTokenDetails**
> ResponseSingle userApiTokensTokenDetails(identifier)

Token Details

Get information about a specific token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApiTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApiTokensApi apiInstance = new UserApiTokensApi();
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
try {
    ResponseSingle result = apiInstance.userApiTokensTokenDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApiTokensApi#userApiTokensTokenDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |

### Return type

[**ResponseSingle**](ResponseSingle.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userApiTokensUpdateToken"></a>
# **userApiTokensUpdateToken**
> ResponseSingle userApiTokensUpdateToken(body, identifier)

Update Token

Update an existing token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApiTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApiTokensApi apiInstance = new UserApiTokensApi();
SchemasToken body = new SchemasToken(); // SchemasToken | 
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
try {
    ResponseSingle result = apiInstance.userApiTokensUpdateToken(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApiTokensApi#userApiTokensUpdateToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchemasToken**](SchemasToken.md)|  |
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |

### Return type

[**ResponseSingle**](ResponseSingle.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userApiTokensVerifyToken"></a>
# **userApiTokensVerifyToken**
> ResponseSingleSegment userApiTokensVerifyToken()

Verify Token

Test whether a token works.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApiTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UserApiTokensApi apiInstance = new UserApiTokensApi();
try {
    ResponseSingleSegment result = apiInstance.userApiTokensVerifyToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApiTokensApi#userApiTokensVerifyToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResponseSingleSegment**](ResponseSingleSegment.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

