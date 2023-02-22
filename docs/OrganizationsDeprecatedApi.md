# OrganizationsDeprecatedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organizationsDeprecatedEditOrganization**](OrganizationsDeprecatedApi.md#organizationsDeprecatedEditOrganization) | **PATCH** /organizations/{identifier} | Edit Organization
[**organizationsDeprecatedOrganizationDetails**](OrganizationsDeprecatedApi.md#organizationsDeprecatedOrganizationDetails) | **GET** /organizations/{identifier} | Organization Details

<a name="organizationsDeprecatedEditOrganization"></a>
# **organizationsDeprecatedEditOrganization**
> SingleOrganizationResponse organizationsDeprecatedEditOrganization(body, identifier)

Edit Organization

Update an existing Organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationsDeprecatedApi;

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


OrganizationsDeprecatedApi apiInstance = new OrganizationsDeprecatedApi();
OrganizationsIdentifierBody body = new OrganizationsIdentifierBody(); // OrganizationsIdentifierBody | 
String identifier = "identifier_example"; // String | 
try {
    SingleOrganizationResponse result = apiInstance.organizationsDeprecatedEditOrganization(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsDeprecatedApi#organizationsDeprecatedEditOrganization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationsIdentifierBody**](OrganizationsIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**SingleOrganizationResponse**](SingleOrganizationResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="organizationsDeprecatedOrganizationDetails"></a>
# **organizationsDeprecatedOrganizationDetails**
> SingleOrganizationResponse organizationsDeprecatedOrganizationDetails(identifier)

Organization Details

Get information about a specific organization that you are a member of.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationsDeprecatedApi;

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


OrganizationsDeprecatedApi apiInstance = new OrganizationsDeprecatedApi();
String identifier = "identifier_example"; // String | 
try {
    SingleOrganizationResponse result = apiInstance.organizationsDeprecatedOrganizationDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsDeprecatedApi#organizationsDeprecatedOrganizationDetails");
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

