# OrganizationRailgunApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**organizationRailgunCreateRailgun**](OrganizationRailgunApi.md#organizationRailgunCreateRailgun) | **POST** /organizations/{organization_identifier}/railguns | Create Railgun
[**organizationRailgunDeleteRailgun**](OrganizationRailgunApi.md#organizationRailgunDeleteRailgun) | **DELETE** /organizations/{organization_identifier}/railguns/{identifier} | Delete Railgun
[**organizationRailgunEnableOrDisableARailgun**](OrganizationRailgunApi.md#organizationRailgunEnableOrDisableARailgun) | **PATCH** /organizations/{organization_identifier}/railguns/{identifier} | Enable or disable a Railgun
[**organizationRailgunGetRailgunZones**](OrganizationRailgunApi.md#organizationRailgunGetRailgunZones) | **GET** /organizations/{organization_identifier}/railguns/{identifier}/zones | Get Railgun zones
[**organizationRailgunListRailguns**](OrganizationRailgunApi.md#organizationRailgunListRailguns) | **GET** /organizations/{organization_identifier}/railguns | List Railguns
[**organizationRailgunRailgunDetails**](OrganizationRailgunApi.md#organizationRailgunRailgunDetails) | **GET** /organizations/{organization_identifier}/railguns/{identifier} | Railgun details

<a name="organizationRailgunCreateRailgun"></a>
# **organizationRailgunCreateRailgun**
> RailgunResponseSingle organizationRailgunCreateRailgun(body, organizationIdentifier)

Create Railgun

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationRailgunApi;

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


OrganizationRailgunApi apiInstance = new OrganizationRailgunApi();
OrganizationIdentifierRailgunsBody body = new OrganizationIdentifierRailgunsBody(); // OrganizationIdentifierRailgunsBody | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    RailgunResponseSingle result = apiInstance.organizationRailgunCreateRailgun(body, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationRailgunApi#organizationRailgunCreateRailgun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrganizationIdentifierRailgunsBody**](OrganizationIdentifierRailgunsBody.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingle**](RailgunResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="organizationRailgunDeleteRailgun"></a>
# **organizationRailgunDeleteRailgun**
> RailgunResponseSingleId organizationRailgunDeleteRailgun(identifier, organizationIdentifier)

Delete Railgun

Disable and delete a Railgun. This will immediately disable the Railgun for any connected zones.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationRailgunApi;

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


OrganizationRailgunApi apiInstance = new OrganizationRailgunApi();
String identifier = "identifier_example"; // String | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    RailgunResponseSingleId result = apiInstance.organizationRailgunDeleteRailgun(identifier, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationRailgunApi#organizationRailgunDeleteRailgun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingleId**](RailgunResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="organizationRailgunEnableOrDisableARailgun"></a>
# **organizationRailgunEnableOrDisableARailgun**
> RailgunResponseSingle organizationRailgunEnableOrDisableARailgun(body, identifier, organizationIdentifier)

Enable or disable a Railgun

Enable or disable a Railgun for all zones connected to it.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationRailgunApi;

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


OrganizationRailgunApi apiInstance = new OrganizationRailgunApi();
RailgunsIdentifierBody body = new RailgunsIdentifierBody(); // RailgunsIdentifierBody | 
String identifier = "identifier_example"; // String | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    RailgunResponseSingle result = apiInstance.organizationRailgunEnableOrDisableARailgun(body, identifier, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationRailgunApi#organizationRailgunEnableOrDisableARailgun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RailgunsIdentifierBody**](RailgunsIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingle**](RailgunResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="organizationRailgunGetRailgunZones"></a>
# **organizationRailgunGetRailgunZones**
> InlineResponse20030 organizationRailgunGetRailgunZones(identifier, organizationIdentifier)

Get Railgun zones

Lists the zones that are currently using this Railgun.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationRailgunApi;

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


OrganizationRailgunApi apiInstance = new OrganizationRailgunApi();
String identifier = "identifier_example"; // String | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    InlineResponse20030 result = apiInstance.organizationRailgunGetRailgunZones(identifier, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationRailgunApi#organizationRailgunGetRailgunZones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="organizationRailgunListRailguns"></a>
# **organizationRailgunListRailguns**
> RailgunResponseCollection organizationRailgunListRailguns(organizationIdentifier)

List Railguns

List, search, sort and filter your Railguns.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationRailgunApi;

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


OrganizationRailgunApi apiInstance = new OrganizationRailgunApi();
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    RailgunResponseCollection result = apiInstance.organizationRailgunListRailguns(organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationRailgunApi#organizationRailgunListRailguns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseCollection**](RailgunResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="organizationRailgunRailgunDetails"></a>
# **organizationRailgunRailgunDetails**
> RailgunResponseSingle organizationRailgunRailgunDetails(identifier, organizationIdentifier)

Railgun details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationRailgunApi;

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


OrganizationRailgunApi apiInstance = new OrganizationRailgunApi();
String identifier = "identifier_example"; // String | 
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    RailgunResponseSingle result = apiInstance.organizationRailgunRailgunDetails(identifier, organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationRailgunApi#organizationRailgunRailgunDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingle**](RailgunResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

