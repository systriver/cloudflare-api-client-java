# OrganizationRolesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organizationRolesListRoles**](OrganizationRolesApi.md#organizationRolesListRoles) | **GET** /organizations/{organization_identifier}/roles | List Roles
[**organizationRolesRoleDetails**](OrganizationRolesApi.md#organizationRolesRoleDetails) | **GET** /organizations/{organization_identifier}/roles/{identifier} | Role Details

<a name="organizationRolesListRoles"></a>
# **organizationRolesListRoles**
> CollectionRoleResponse organizationRolesListRoles(organizationIdentifier)

List Roles

Get all available roles for an organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationRolesApi;

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


OrganizationRolesApi apiInstance = new OrganizationRolesApi();
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    CollectionRoleResponse result = apiInstance.organizationRolesListRoles(organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationRolesApi#organizationRolesListRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**CollectionRoleResponse**](CollectionRoleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="organizationRolesRoleDetails"></a>
# **organizationRolesRoleDetails**
> SingleRoleResponse organizationRolesRoleDetails(identifier, organizationIdentifier)

Role Details

Get information about a specific role for an organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationRolesApi;

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


OrganizationRolesApi apiInstance = new OrganizationRolesApi();
String identifier = "identifier_example"; // String | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    SingleRoleResponse result = apiInstance.organizationRolesRoleDetails(identifier, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationRolesApi#organizationRolesRoleDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**SingleRoleResponse**](SingleRoleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

