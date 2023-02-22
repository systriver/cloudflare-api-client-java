# UsersOrganizationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userSOrganizationsLeaveOrganization**](UsersOrganizationsApi.md#userSOrganizationsLeaveOrganization) | **DELETE** /user/organizations/{identifier} | Leave Organization
[**userSOrganizationsListOrganizations**](UsersOrganizationsApi.md#userSOrganizationsListOrganizations) | **GET** /user/organizations | List Organizations
[**userSOrganizationsOrganizationDetails**](UsersOrganizationsApi.md#userSOrganizationsOrganizationDetails) | **GET** /user/organizations/{identifier} | Organization Details

<a name="userSOrganizationsLeaveOrganization"></a>
# **userSOrganizationsLeaveOrganization**
> InlineResponse200104 userSOrganizationsLeaveOrganization(identifier)

Leave Organization

Removes association to an organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersOrganizationsApi;

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


UsersOrganizationsApi apiInstance = new UsersOrganizationsApi();
String identifier = "identifier_example"; // String | 
try {
    InlineResponse200104 result = apiInstance.userSOrganizationsLeaveOrganization(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersOrganizationsApi#userSOrganizationsLeaveOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200104**](InlineResponse200104.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userSOrganizationsListOrganizations"></a>
# **userSOrganizationsListOrganizations**
> CollectionOrganizationResponse userSOrganizationsListOrganizations()

List Organizations

Lists organizations the user is associated with.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersOrganizationsApi;

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


UsersOrganizationsApi apiInstance = new UsersOrganizationsApi();
try {
    CollectionOrganizationResponse result = apiInstance.userSOrganizationsListOrganizations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersOrganizationsApi#userSOrganizationsListOrganizations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CollectionOrganizationResponse**](CollectionOrganizationResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userSOrganizationsOrganizationDetails"></a>
# **userSOrganizationsOrganizationDetails**
> SingleOrganizationResponse userSOrganizationsOrganizationDetails(identifier)

Organization Details

Gets a specific organization the user is associated with.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersOrganizationsApi;

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


UsersOrganizationsApi apiInstance = new UsersOrganizationsApi();
String identifier = "identifier_example"; // String | 
try {
    SingleOrganizationResponse result = apiInstance.userSOrganizationsOrganizationDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersOrganizationsApi#userSOrganizationsOrganizationDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**SingleOrganizationResponse**](SingleOrganizationResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

