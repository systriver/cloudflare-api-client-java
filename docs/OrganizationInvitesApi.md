# OrganizationInvitesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organizationInvitesCancelInvitation**](OrganizationInvitesApi.md#organizationInvitesCancelInvitation) | **DELETE** /organizations/{organization_identifier}/invites/{identifier} | Cancel Invitation
[**organizationInvitesCreateInvitation**](OrganizationInvitesApi.md#organizationInvitesCreateInvitation) | **POST** /organizations/{organization_identifier}/invites | Create Invitation
[**organizationInvitesEditInvitationRoles**](OrganizationInvitesApi.md#organizationInvitesEditInvitationRoles) | **PATCH** /organizations/{organization_identifier}/invites/{identifier} | Edit Invitation Roles
[**organizationInvitesInvitationDetails**](OrganizationInvitesApi.md#organizationInvitesInvitationDetails) | **GET** /organizations/{organization_identifier}/invites/{identifier} | Invitation Details
[**organizationInvitesListInvitations**](OrganizationInvitesApi.md#organizationInvitesListInvitations) | **GET** /organizations/{organization_identifier}/invites | List Invitations

<a name="organizationInvitesCancelInvitation"></a>
# **organizationInvitesCancelInvitation**
> InlineResponse20028 organizationInvitesCancelInvitation(identifier, organizationIdentifier)

Cancel Invitation

Cancel an existing invitation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationInvitesApi;

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


OrganizationInvitesApi apiInstance = new OrganizationInvitesApi();
String identifier = "identifier_example"; // String | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    InlineResponse20028 result = apiInstance.organizationInvitesCancelInvitation(identifier, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationInvitesApi#organizationInvitesCancelInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="organizationInvitesCreateInvitation"></a>
# **organizationInvitesCreateInvitation**
> SingleInviteResponse organizationInvitesCreateInvitation(body, organizationIdentifier)

Create Invitation

Invite a User to become a Member of an Organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationInvitesApi;

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


OrganizationInvitesApi apiInstance = new OrganizationInvitesApi();
OrganizationIdentifierInvitesBody body = new OrganizationIdentifierInvitesBody(); // OrganizationIdentifierInvitesBody | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    SingleInviteResponse result = apiInstance.organizationInvitesCreateInvitation(body, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationInvitesApi#organizationInvitesCreateInvitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationIdentifierInvitesBody**](OrganizationIdentifierInvitesBody.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**SingleInviteResponse**](SingleInviteResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="organizationInvitesEditInvitationRoles"></a>
# **organizationInvitesEditInvitationRoles**
> SingleInviteResponse organizationInvitesEditInvitationRoles(body, identifier, organizationIdentifier)

Edit Invitation Roles

Change the Roles of a Pending Invite.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationInvitesApi;

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


OrganizationInvitesApi apiInstance = new OrganizationInvitesApi();
InvitesIdentifierBody body = new InvitesIdentifierBody(); // InvitesIdentifierBody | 
String identifier = "identifier_example"; // String | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    SingleInviteResponse result = apiInstance.organizationInvitesEditInvitationRoles(body, identifier, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationInvitesApi#organizationInvitesEditInvitationRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InvitesIdentifierBody**](InvitesIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**SingleInviteResponse**](SingleInviteResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="organizationInvitesInvitationDetails"></a>
# **organizationInvitesInvitationDetails**
> SingleInviteResponse organizationInvitesInvitationDetails(identifier, organizationIdentifier)

Invitation Details

Get the details of an invitation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationInvitesApi;

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


OrganizationInvitesApi apiInstance = new OrganizationInvitesApi();
String identifier = "identifier_example"; // String | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    SingleInviteResponse result = apiInstance.organizationInvitesInvitationDetails(identifier, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationInvitesApi#organizationInvitesInvitationDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**SingleInviteResponse**](SingleInviteResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="organizationInvitesListInvitations"></a>
# **organizationInvitesListInvitations**
> CollectionInviteResponse organizationInvitesListInvitations(organizationIdentifier)

List Invitations

List all invitations associated with an organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationInvitesApi;

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


OrganizationInvitesApi apiInstance = new OrganizationInvitesApi();
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    CollectionInviteResponse result = apiInstance.organizationInvitesListInvitations(organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationInvitesApi#organizationInvitesListInvitations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**CollectionInviteResponse**](CollectionInviteResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

