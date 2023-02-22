# AccountMembersApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountMembersAddMember**](AccountMembersApi.md#accountMembersAddMember) | **POST** /accounts/{account_identifier}/members | Add Member
[**accountMembersListMembers**](AccountMembersApi.md#accountMembersListMembers) | **GET** /accounts/{account_identifier}/members | List Members
[**accountMembersMemberDetails**](AccountMembersApi.md#accountMembersMemberDetails) | **GET** /accounts/{account_identifier}/members/{identifier} | Member Details
[**accountMembersRemoveMember**](AccountMembersApi.md#accountMembersRemoveMember) | **DELETE** /accounts/{account_identifier}/members/{identifier} | Remove Member
[**accountMembersUpdateMember**](AccountMembersApi.md#accountMembersUpdateMember) | **PUT** /accounts/{account_identifier}/members/{identifier} | Update Member

<a name="accountMembersAddMember"></a>
# **accountMembersAddMember**
> ResponseSingle accountMembersAddMember(body, accountIdentifier)

Add Member

Add a user to the list of members for this account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountMembersApi;

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


AccountMembersApi apiInstance = new AccountMembersApi();
Create body = new Create(); // Create | 
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    ResponseSingle result = apiInstance.accountMembersAddMember(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMembersApi#accountMembersAddMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Create**](Create.md)|  |
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**ResponseSingle**](ResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountMembersListMembers"></a>
# **accountMembersListMembers**
> CloudflareClientAPIResponseCollection accountMembersListMembers(accountIdentifier)

List Members

List all members of an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountMembersApi;

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


AccountMembersApi apiInstance = new AccountMembersApi();
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    CloudflareClientAPIResponseCollection result = apiInstance.accountMembersListMembers(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMembersApi#accountMembersListMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIResponseCollection**](CloudflareClientAPIResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountMembersMemberDetails"></a>
# **accountMembersMemberDetails**
> ResponseSingle accountMembersMemberDetails(identifier, accountIdentifier)

Member Details

Get information about a specific member of an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountMembersApi;

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


AccountMembersApi apiInstance = new AccountMembersApi();
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    ResponseSingle result = apiInstance.accountMembersMemberDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMembersApi#accountMembersMemberDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**ResponseSingle**](ResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountMembersRemoveMember"></a>
# **accountMembersRemoveMember**
> CloudflareClientAPIApiResponseSingleId accountMembersRemoveMember(identifier, accountIdentifier)

Remove Member

Remove a member from an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountMembersApi;

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


AccountMembersApi apiInstance = new AccountMembersApi();
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.accountMembersRemoveMember(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMembersApi#accountMembersRemoveMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountMembersUpdateMember"></a>
# **accountMembersUpdateMember**
> ResponseSingle accountMembersUpdateMember(body, identifier, accountIdentifier)

Update Member

Modify an account member.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountMembersApi;

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


AccountMembersApi apiInstance = new AccountMembersApi();
SchemasMember body = new SchemasMember(); // SchemasMember | 
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    ResponseSingle result = apiInstance.accountMembersUpdateMember(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountMembersApi#accountMembersUpdateMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchemasMember**](SchemasMember.md)|  |
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**ResponseSingle**](ResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

