# OrganizationMembersApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organizationMembersEditMemberRoles**](OrganizationMembersApi.md#organizationMembersEditMemberRoles) | **PATCH** /organizations/{organization_identifier}/members/{identifier} | Edit Member Roles
[**organizationMembersListMembers**](OrganizationMembersApi.md#organizationMembersListMembers) | **GET** /organizations/{organization_identifier}/members | List Members
[**organizationMembersMemberDetails**](OrganizationMembersApi.md#organizationMembersMemberDetails) | **GET** /organizations/{organization_identifier}/members/{identifier} | Member Details
[**organizationMembersRemoveMember**](OrganizationMembersApi.md#organizationMembersRemoveMember) | **DELETE** /organizations/{organization_identifier}/members/{identifier} | Remove Member

<a name="organizationMembersEditMemberRoles"></a>
# **organizationMembersEditMemberRoles**
> SingleMemberResponse organizationMembersEditMemberRoles(body, identifier, organizationIdentifier)

Edit Member Roles

Change the Roles of an Organization&#x27;s Member.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationMembersApi;

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


OrganizationMembersApi apiInstance = new OrganizationMembersApi();
MembersIdentifierBody body = new MembersIdentifierBody(); // MembersIdentifierBody | 
String identifier = "identifier_example"; // String | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    SingleMemberResponse result = apiInstance.organizationMembersEditMemberRoles(body, identifier, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationMembersApi#organizationMembersEditMemberRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MembersIdentifierBody**](MembersIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**SingleMemberResponse**](SingleMemberResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="organizationMembersListMembers"></a>
# **organizationMembersListMembers**
> CollectionMemberResponse organizationMembersListMembers(organizationIdentifier)

List Members

List all members of a organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationMembersApi;

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


OrganizationMembersApi apiInstance = new OrganizationMembersApi();
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    CollectionMemberResponse result = apiInstance.organizationMembersListMembers(organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationMembersApi#organizationMembersListMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**CollectionMemberResponse**](CollectionMemberResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="organizationMembersMemberDetails"></a>
# **organizationMembersMemberDetails**
> SingleMemberResponse organizationMembersMemberDetails(identifier, organizationIdentifier)

Member Details

Get information about a specific member of an organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationMembersApi;

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


OrganizationMembersApi apiInstance = new OrganizationMembersApi();
String identifier = "identifier_example"; // String | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    SingleMemberResponse result = apiInstance.organizationMembersMemberDetails(identifier, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationMembersApi#organizationMembersMemberDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**SingleMemberResponse**](SingleMemberResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="organizationMembersRemoveMember"></a>
# **organizationMembersRemoveMember**
> InlineResponse20029 organizationMembersRemoveMember(identifier, organizationIdentifier)

Remove Member

Remove a member from an organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationMembersApi;

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


OrganizationMembersApi apiInstance = new OrganizationMembersApi();
String identifier = "identifier_example"; // String | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    InlineResponse20029 result = apiInstance.organizationMembersRemoveMember(identifier, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationMembersApi#organizationMembersRemoveMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

