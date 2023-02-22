# ZoneLevelZeroTrustOrganizationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization**](ZoneLevelZeroTrustOrganizationApi.md#zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization) | **POST** /zones/{identifier}/access/organizations | Create your Zero Trust organization
[**zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization**](ZoneLevelZeroTrustOrganizationApi.md#zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization) | **GET** /zones/{identifier}/access/organizations | Get your Zero Trust organization
[**zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser**](ZoneLevelZeroTrustOrganizationApi.md#zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser) | **POST** /zones/{identifier}/access/organizations/revoke_user | Revoke all Access tokens for a user
[**zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization**](ZoneLevelZeroTrustOrganizationApi.md#zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization) | **PUT** /zones/{identifier}/access/organizations | Update your Zero Trust organization

<a name="zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization"></a>
# **zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization**
> OrganizationsComponentsSchemasSingleResponse zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization(body, identifier)

Create your Zero Trust organization

Sets up a Zero Trust organization for your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelZeroTrustOrganizationApi;

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


ZoneLevelZeroTrustOrganizationApi apiInstance = new ZoneLevelZeroTrustOrganizationApi();
AccessOrganizationsBody3 body = new AccessOrganizationsBody3(); // AccessOrganizationsBody3 | 
OrganizationsComponentsSchemasIdentifier identifier = new OrganizationsComponentsSchemasIdentifier(); // OrganizationsComponentsSchemasIdentifier | 
try {
    OrganizationsComponentsSchemasSingleResponse result = apiInstance.zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelZeroTrustOrganizationApi#zoneLevelZeroTrustOrganizationCreateYourZeroTrustOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessOrganizationsBody3**](AccessOrganizationsBody3.md)|  |
 **identifier** | [**OrganizationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**OrganizationsComponentsSchemasSingleResponse**](OrganizationsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization"></a>
# **zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization**
> OrganizationsComponentsSchemasSingleResponse zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization(identifier)

Get your Zero Trust organization

Returns the configuration for your Zero Trust organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelZeroTrustOrganizationApi;

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


ZoneLevelZeroTrustOrganizationApi apiInstance = new ZoneLevelZeroTrustOrganizationApi();
OrganizationsComponentsSchemasIdentifier identifier = new OrganizationsComponentsSchemasIdentifier(); // OrganizationsComponentsSchemasIdentifier | 
try {
    OrganizationsComponentsSchemasSingleResponse result = apiInstance.zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelZeroTrustOrganizationApi#zoneLevelZeroTrustOrganizationGetYourZeroTrustOrganization");
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

<a name="zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser"></a>
# **zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser**
> CloudflareClientAPISchemasEmptyResponse zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser(body, identifier)

Revoke all Access tokens for a user

Revokes a user&#x27;s access across all applications.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelZeroTrustOrganizationApi;

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


ZoneLevelZeroTrustOrganizationApi apiInstance = new ZoneLevelZeroTrustOrganizationApi();
OrganizationsRevokeUserBody1 body = new OrganizationsRevokeUserBody1(); // OrganizationsRevokeUserBody1 | 
OrganizationsComponentsSchemasIdentifier identifier = new OrganizationsComponentsSchemasIdentifier(); // OrganizationsComponentsSchemasIdentifier | 
try {
    CloudflareClientAPISchemasEmptyResponse result = apiInstance.zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelZeroTrustOrganizationApi#zoneLevelZeroTrustOrganizationRevokeAllAccessTokensForAUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationsRevokeUserBody1**](OrganizationsRevokeUserBody1.md)|  |
 **identifier** | [**OrganizationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPISchemasEmptyResponse**](CloudflareClientAPISchemasEmptyResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization"></a>
# **zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization**
> OrganizationsComponentsSchemasSingleResponse zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization(body, identifier)

Update your Zero Trust organization

Updates the configuration for your Zero Trust organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelZeroTrustOrganizationApi;

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


ZoneLevelZeroTrustOrganizationApi apiInstance = new ZoneLevelZeroTrustOrganizationApi();
AccessOrganizationsBody2 body = new AccessOrganizationsBody2(); // AccessOrganizationsBody2 | 
OrganizationsComponentsSchemasIdentifier identifier = new OrganizationsComponentsSchemasIdentifier(); // OrganizationsComponentsSchemasIdentifier | 
try {
    OrganizationsComponentsSchemasSingleResponse result = apiInstance.zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelZeroTrustOrganizationApi#zoneLevelZeroTrustOrganizationUpdateYourZeroTrustOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessOrganizationsBody2**](AccessOrganizationsBody2.md)|  |
 **identifier** | [**OrganizationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**OrganizationsComponentsSchemasSingleResponse**](OrganizationsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

