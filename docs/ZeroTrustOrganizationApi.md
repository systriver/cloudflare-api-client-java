# ZeroTrustOrganizationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zeroTrustOrganizationCreateYourZeroTrustOrganization**](ZeroTrustOrganizationApi.md#zeroTrustOrganizationCreateYourZeroTrustOrganization) | **POST** /accounts/{identifier}/access/organizations | Create your Zero Trust organization
[**zeroTrustOrganizationGetYourZeroTrustOrganization**](ZeroTrustOrganizationApi.md#zeroTrustOrganizationGetYourZeroTrustOrganization) | **GET** /accounts/{identifier}/access/organizations | Get your Zero Trust organization
[**zeroTrustOrganizationRevokeAllAccessTokensForAUser**](ZeroTrustOrganizationApi.md#zeroTrustOrganizationRevokeAllAccessTokensForAUser) | **POST** /accounts/{identifier}/access/organizations/revoke_user | Revoke all Access tokens for a user
[**zeroTrustOrganizationUpdateYourZeroTrustOrganization**](ZeroTrustOrganizationApi.md#zeroTrustOrganizationUpdateYourZeroTrustOrganization) | **PUT** /accounts/{identifier}/access/organizations | Update your Zero Trust organization

<a name="zeroTrustOrganizationCreateYourZeroTrustOrganization"></a>
# **zeroTrustOrganizationCreateYourZeroTrustOrganization**
> OrganizationsComponentsSchemasSingleResponse zeroTrustOrganizationCreateYourZeroTrustOrganization(body, identifier)

Create your Zero Trust organization

Sets up a Zero Trust organization for your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustOrganizationApi;

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


ZeroTrustOrganizationApi apiInstance = new ZeroTrustOrganizationApi();
AccessOrganizationsBody1 body = new AccessOrganizationsBody1(); // AccessOrganizationsBody1 | 
OrganizationsComponentsSchemasIdentifier identifier = new OrganizationsComponentsSchemasIdentifier(); // OrganizationsComponentsSchemasIdentifier | 
try {
    OrganizationsComponentsSchemasSingleResponse result = apiInstance.zeroTrustOrganizationCreateYourZeroTrustOrganization(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustOrganizationApi#zeroTrustOrganizationCreateYourZeroTrustOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessOrganizationsBody1**](AccessOrganizationsBody1.md)|  |
 **identifier** | [**OrganizationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**OrganizationsComponentsSchemasSingleResponse**](OrganizationsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustOrganizationGetYourZeroTrustOrganization"></a>
# **zeroTrustOrganizationGetYourZeroTrustOrganization**
> OrganizationsComponentsSchemasSingleResponse zeroTrustOrganizationGetYourZeroTrustOrganization(identifier)

Get your Zero Trust organization

Returns the configuration for your Zero Trust organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustOrganizationApi;

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


ZeroTrustOrganizationApi apiInstance = new ZeroTrustOrganizationApi();
OrganizationsComponentsSchemasIdentifier identifier = new OrganizationsComponentsSchemasIdentifier(); // OrganizationsComponentsSchemasIdentifier | 
try {
    OrganizationsComponentsSchemasSingleResponse result = apiInstance.zeroTrustOrganizationGetYourZeroTrustOrganization(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustOrganizationApi#zeroTrustOrganizationGetYourZeroTrustOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**OrganizationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**OrganizationsComponentsSchemasSingleResponse**](OrganizationsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zeroTrustOrganizationRevokeAllAccessTokensForAUser"></a>
# **zeroTrustOrganizationRevokeAllAccessTokensForAUser**
> CloudflareClientAPISchemasEmptyResponse zeroTrustOrganizationRevokeAllAccessTokensForAUser(body, identifier)

Revoke all Access tokens for a user

Revokes a user&#x27;s access across all applications.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustOrganizationApi;

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


ZeroTrustOrganizationApi apiInstance = new ZeroTrustOrganizationApi();
OrganizationsRevokeUserBody body = new OrganizationsRevokeUserBody(); // OrganizationsRevokeUserBody | 
OrganizationsComponentsSchemasIdentifier identifier = new OrganizationsComponentsSchemasIdentifier(); // OrganizationsComponentsSchemasIdentifier | 
try {
    CloudflareClientAPISchemasEmptyResponse result = apiInstance.zeroTrustOrganizationRevokeAllAccessTokensForAUser(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustOrganizationApi#zeroTrustOrganizationRevokeAllAccessTokensForAUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationsRevokeUserBody**](OrganizationsRevokeUserBody.md)|  |
 **identifier** | [**OrganizationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPISchemasEmptyResponse**](CloudflareClientAPISchemasEmptyResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustOrganizationUpdateYourZeroTrustOrganization"></a>
# **zeroTrustOrganizationUpdateYourZeroTrustOrganization**
> OrganizationsComponentsSchemasSingleResponse zeroTrustOrganizationUpdateYourZeroTrustOrganization(body, identifier)

Update your Zero Trust organization

Updates the configuration for your Zero Trust organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustOrganizationApi;

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


ZeroTrustOrganizationApi apiInstance = new ZeroTrustOrganizationApi();
AccessOrganizationsBody body = new AccessOrganizationsBody(); // AccessOrganizationsBody | 
OrganizationsComponentsSchemasIdentifier identifier = new OrganizationsComponentsSchemasIdentifier(); // OrganizationsComponentsSchemasIdentifier | 
try {
    OrganizationsComponentsSchemasSingleResponse result = apiInstance.zeroTrustOrganizationUpdateYourZeroTrustOrganization(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustOrganizationApi#zeroTrustOrganizationUpdateYourZeroTrustOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessOrganizationsBody**](AccessOrganizationsBody.md)|  |
 **identifier** | [**OrganizationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**OrganizationsComponentsSchemasSingleResponse**](OrganizationsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

