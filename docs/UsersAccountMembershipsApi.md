# UsersAccountMembershipsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userSAccountMembershipsDeleteMembership**](UsersAccountMembershipsApi.md#userSAccountMembershipsDeleteMembership) | **DELETE** /memberships/{identifier} | Delete Membership
[**userSAccountMembershipsListMemberships**](UsersAccountMembershipsApi.md#userSAccountMembershipsListMemberships) | **GET** /memberships | List Memberships
[**userSAccountMembershipsMembershipDetails**](UsersAccountMembershipsApi.md#userSAccountMembershipsMembershipDetails) | **GET** /memberships/{identifier} | Membership Details
[**userSAccountMembershipsUpdateMembership**](UsersAccountMembershipsApi.md#userSAccountMembershipsUpdateMembership) | **PUT** /memberships/{identifier} | Update Membership

<a name="userSAccountMembershipsDeleteMembership"></a>
# **userSAccountMembershipsDeleteMembership**
> InlineResponse20027 userSAccountMembershipsDeleteMembership(identifier)

Delete Membership

Remove the associated member from an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersAccountMembershipsApi;

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


UsersAccountMembershipsApi apiInstance = new UsersAccountMembershipsApi();
String identifier = "identifier_example"; // String | 
try {
    InlineResponse20027 result = apiInstance.userSAccountMembershipsDeleteMembership(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAccountMembershipsApi#userSAccountMembershipsDeleteMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userSAccountMembershipsListMemberships"></a>
# **userSAccountMembershipsListMemberships**
> CollectionMembershipResponse userSAccountMembershipsListMemberships()

List Memberships

List memberships of accounts the user can access.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersAccountMembershipsApi;

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


UsersAccountMembershipsApi apiInstance = new UsersAccountMembershipsApi();
try {
    CollectionMembershipResponse result = apiInstance.userSAccountMembershipsListMemberships();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAccountMembershipsApi#userSAccountMembershipsListMemberships");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CollectionMembershipResponse**](CollectionMembershipResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userSAccountMembershipsMembershipDetails"></a>
# **userSAccountMembershipsMembershipDetails**
> SingleMembershipResponse userSAccountMembershipsMembershipDetails(identifier)

Membership Details

Get a specific membership.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersAccountMembershipsApi;

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


UsersAccountMembershipsApi apiInstance = new UsersAccountMembershipsApi();
String identifier = "identifier_example"; // String | 
try {
    SingleMembershipResponse result = apiInstance.userSAccountMembershipsMembershipDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAccountMembershipsApi#userSAccountMembershipsMembershipDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**SingleMembershipResponse**](SingleMembershipResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userSAccountMembershipsUpdateMembership"></a>
# **userSAccountMembershipsUpdateMembership**
> SingleMembershipResponse userSAccountMembershipsUpdateMembership(body, identifier)

Update Membership

Accept or reject this account invitation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersAccountMembershipsApi;

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


UsersAccountMembershipsApi apiInstance = new UsersAccountMembershipsApi();
MembershipsIdentifierBody body = new MembershipsIdentifierBody(); // MembershipsIdentifierBody | 
String identifier = "identifier_example"; // String | 
try {
    SingleMembershipResponse result = apiInstance.userSAccountMembershipsUpdateMembership(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersAccountMembershipsApi#userSAccountMembershipsUpdateMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MembershipsIdentifierBody**](MembershipsIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**SingleMembershipResponse**](SingleMembershipResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

