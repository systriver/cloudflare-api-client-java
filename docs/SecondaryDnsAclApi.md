# SecondaryDnsAclApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secondaryDnsAclAclDetails**](SecondaryDnsAclApi.md#secondaryDnsAclAclDetails) | **GET** /accounts/{account_identifier}/secondary_dns/acls/{identifier} | ACL Details
[**secondaryDnsAclCreateAcl**](SecondaryDnsAclApi.md#secondaryDnsAclCreateAcl) | **POST** /accounts/{account_identifier}/secondary_dns/acls | Create ACL
[**secondaryDnsAclDeleteAcl**](SecondaryDnsAclApi.md#secondaryDnsAclDeleteAcl) | **DELETE** /accounts/{account_identifier}/secondary_dns/acls/{identifier} | Delete ACL
[**secondaryDnsAclListAcLs**](SecondaryDnsAclApi.md#secondaryDnsAclListAcLs) | **GET** /accounts/{account_identifier}/secondary_dns/acls | List ACLs
[**secondaryDnsAclUpdateAcl**](SecondaryDnsAclApi.md#secondaryDnsAclUpdateAcl) | **PUT** /accounts/{account_identifier}/secondary_dns/acls/{identifier} | Update ACL

<a name="secondaryDnsAclAclDetails"></a>
# **secondaryDnsAclAclDetails**
> AclComponentsSchemasSingleResponse secondaryDnsAclAclDetails(identifier, accountIdentifier)

ACL Details

Get ACL.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsAclApi;

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


SecondaryDnsAclApi apiInstance = new SecondaryDnsAclApi();
AclComponentsSchemasIdentifier identifier = new AclComponentsSchemasIdentifier(); // AclComponentsSchemasIdentifier | 
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    AclComponentsSchemasSingleResponse result = apiInstance.secondaryDnsAclAclDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsAclApi#secondaryDnsAclAclDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**AclComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**AclComponentsSchemasSingleResponse**](AclComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secondaryDnsAclCreateAcl"></a>
# **secondaryDnsAclCreateAcl**
> AclComponentsSchemasSingleResponse secondaryDnsAclCreateAcl(body, accountIdentifier)

Create ACL

Create ACL.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsAclApi;

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


SecondaryDnsAclApi apiInstance = new SecondaryDnsAclApi();
Object body = null; // Object | 
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    AclComponentsSchemasSingleResponse result = apiInstance.secondaryDnsAclCreateAcl(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsAclApi#secondaryDnsAclCreateAcl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**AclComponentsSchemasSingleResponse**](AclComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsAclDeleteAcl"></a>
# **secondaryDnsAclDeleteAcl**
> AclComponentsSchemasIdResponse secondaryDnsAclDeleteAcl(identifier, accountIdentifier)

Delete ACL

Delete ACL.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsAclApi;

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


SecondaryDnsAclApi apiInstance = new SecondaryDnsAclApi();
AclComponentsSchemasIdentifier identifier = new AclComponentsSchemasIdentifier(); // AclComponentsSchemasIdentifier | 
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    AclComponentsSchemasIdResponse result = apiInstance.secondaryDnsAclDeleteAcl(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsAclApi#secondaryDnsAclDeleteAcl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**AclComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**AclComponentsSchemasIdResponse**](AclComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsAclListAcLs"></a>
# **secondaryDnsAclListAcLs**
> AclComponentsSchemasResponseCollection secondaryDnsAclListAcLs(accountIdentifier)

List ACLs

List ACLs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsAclApi;

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


SecondaryDnsAclApi apiInstance = new SecondaryDnsAclApi();
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    AclComponentsSchemasResponseCollection result = apiInstance.secondaryDnsAclListAcLs(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsAclApi#secondaryDnsAclListAcLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**AclComponentsSchemasResponseCollection**](AclComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secondaryDnsAclUpdateAcl"></a>
# **secondaryDnsAclUpdateAcl**
> AclComponentsSchemasSingleResponse secondaryDnsAclUpdateAcl(body, identifier, accountIdentifier)

Update ACL

Modify ACL.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsAclApi;

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


SecondaryDnsAclApi apiInstance = new SecondaryDnsAclApi();
CloudflareClientAPIAcl body = new CloudflareClientAPIAcl(); // CloudflareClientAPIAcl | 
AclComponentsSchemasIdentifier identifier = new AclComponentsSchemasIdentifier(); // AclComponentsSchemasIdentifier | 
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    AclComponentsSchemasSingleResponse result = apiInstance.secondaryDnsAclUpdateAcl(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsAclApi#secondaryDnsAclUpdateAcl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPIAcl**](CloudflareClientAPIAcl.md)|  |
 **identifier** | [**AclComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**AclComponentsSchemasSingleResponse**](AclComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

