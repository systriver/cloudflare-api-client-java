# UsersInvitesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userSInvitesInvitationDetails**](UsersInvitesApi.md#userSInvitesInvitationDetails) | **GET** /user/invites/{identifier} | Invitation Details
[**userSInvitesListInvitations**](UsersInvitesApi.md#userSInvitesListInvitations) | **GET** /user/invites | List Invitations
[**userSInvitesRespondToInvitation**](UsersInvitesApi.md#userSInvitesRespondToInvitation) | **PATCH** /user/invites/{identifier} | Respond to Invitation

<a name="userSInvitesInvitationDetails"></a>
# **userSInvitesInvitationDetails**
> SingleInviteResponse userSInvitesInvitationDetails(identifier)

Invitation Details

Gets the details of an invitation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersInvitesApi;

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


UsersInvitesApi apiInstance = new UsersInvitesApi();
String identifier = "identifier_example"; // String | 
try {
    SingleInviteResponse result = apiInstance.userSInvitesInvitationDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInvitesApi#userSInvitesInvitationDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**SingleInviteResponse**](SingleInviteResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userSInvitesListInvitations"></a>
# **userSInvitesListInvitations**
> SchemasCollectionInviteResponse userSInvitesListInvitations()

List Invitations

Lists all invitations associated with my user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersInvitesApi;

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


UsersInvitesApi apiInstance = new UsersInvitesApi();
try {
    SchemasCollectionInviteResponse result = apiInstance.userSInvitesListInvitations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInvitesApi#userSInvitesListInvitations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SchemasCollectionInviteResponse**](SchemasCollectionInviteResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userSInvitesRespondToInvitation"></a>
# **userSInvitesRespondToInvitation**
> SingleInviteResponse userSInvitesRespondToInvitation(body, identifier)

Respond to Invitation

Responds to an invitation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersInvitesApi;

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


UsersInvitesApi apiInstance = new UsersInvitesApi();
InvitesIdentifierBody1 body = new InvitesIdentifierBody1(); // InvitesIdentifierBody1 | 
String identifier = "identifier_example"; // String | 
try {
    SingleInviteResponse result = apiInstance.userSInvitesRespondToInvitation(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersInvitesApi#userSInvitesRespondToInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvitesIdentifierBody1**](InvitesIdentifierBody1.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**SingleInviteResponse**](SingleInviteResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

