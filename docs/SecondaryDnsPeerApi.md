# SecondaryDnsPeerApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secondaryDnsPeerCreatePeer**](SecondaryDnsPeerApi.md#secondaryDnsPeerCreatePeer) | **POST** /accounts/{account_identifier}/secondary_dns/peers | Create Peer
[**secondaryDnsPeerDeletePeer**](SecondaryDnsPeerApi.md#secondaryDnsPeerDeletePeer) | **DELETE** /accounts/{account_identifier}/secondary_dns/peers/{identifier} | Delete Peer
[**secondaryDnsPeerListPeers**](SecondaryDnsPeerApi.md#secondaryDnsPeerListPeers) | **GET** /accounts/{account_identifier}/secondary_dns/peers | List Peers
[**secondaryDnsPeerPeerDetails**](SecondaryDnsPeerApi.md#secondaryDnsPeerPeerDetails) | **GET** /accounts/{account_identifier}/secondary_dns/peers/{identifier} | Peer Details
[**secondaryDnsPeerUpdatePeer**](SecondaryDnsPeerApi.md#secondaryDnsPeerUpdatePeer) | **PUT** /accounts/{account_identifier}/secondary_dns/peers/{identifier} | Update Peer

<a name="secondaryDnsPeerCreatePeer"></a>
# **secondaryDnsPeerCreatePeer**
> PeerComponentsSchemasSingleResponse secondaryDnsPeerCreatePeer(body, accountIdentifier)

Create Peer

Create Peer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPeerApi;

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


SecondaryDnsPeerApi apiInstance = new SecondaryDnsPeerApi();
Object body = null; // Object | 
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    PeerComponentsSchemasSingleResponse result = apiInstance.secondaryDnsPeerCreatePeer(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPeerApi#secondaryDnsPeerCreatePeer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**PeerComponentsSchemasSingleResponse**](PeerComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsPeerDeletePeer"></a>
# **secondaryDnsPeerDeletePeer**
> PeerComponentsSchemasIdResponse secondaryDnsPeerDeletePeer(identifier, accountIdentifier)

Delete Peer

Delete Peer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPeerApi;

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


SecondaryDnsPeerApi apiInstance = new SecondaryDnsPeerApi();
PeerComponentsSchemasIdentifier identifier = new PeerComponentsSchemasIdentifier(); // PeerComponentsSchemasIdentifier | 
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    PeerComponentsSchemasIdResponse result = apiInstance.secondaryDnsPeerDeletePeer(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPeerApi#secondaryDnsPeerDeletePeer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**PeerComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**PeerComponentsSchemasIdResponse**](PeerComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsPeerListPeers"></a>
# **secondaryDnsPeerListPeers**
> PeerComponentsSchemasResponseCollection secondaryDnsPeerListPeers(accountIdentifier)

List Peers

List Peers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPeerApi;

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


SecondaryDnsPeerApi apiInstance = new SecondaryDnsPeerApi();
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    PeerComponentsSchemasResponseCollection result = apiInstance.secondaryDnsPeerListPeers(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPeerApi#secondaryDnsPeerListPeers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**PeerComponentsSchemasResponseCollection**](PeerComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secondaryDnsPeerPeerDetails"></a>
# **secondaryDnsPeerPeerDetails**
> PeerComponentsSchemasSingleResponse secondaryDnsPeerPeerDetails(identifier, accountIdentifier)

Peer Details

Get Peer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPeerApi;

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


SecondaryDnsPeerApi apiInstance = new SecondaryDnsPeerApi();
PeerComponentsSchemasIdentifier identifier = new PeerComponentsSchemasIdentifier(); // PeerComponentsSchemasIdentifier | 
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    PeerComponentsSchemasSingleResponse result = apiInstance.secondaryDnsPeerPeerDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPeerApi#secondaryDnsPeerPeerDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**PeerComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**PeerComponentsSchemasSingleResponse**](PeerComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secondaryDnsPeerUpdatePeer"></a>
# **secondaryDnsPeerUpdatePeer**
> PeerComponentsSchemasSingleResponse secondaryDnsPeerUpdatePeer(body, identifier, accountIdentifier)

Update Peer

Modify Peer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPeerApi;

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


SecondaryDnsPeerApi apiInstance = new SecondaryDnsPeerApi();
CloudflareClientAPIPeer body = new CloudflareClientAPIPeer(); // CloudflareClientAPIPeer | 
PeerComponentsSchemasIdentifier identifier = new PeerComponentsSchemasIdentifier(); // PeerComponentsSchemasIdentifier | 
SchemasAccountIdentifier accountIdentifier = new SchemasAccountIdentifier(); // SchemasAccountIdentifier | 
try {
    PeerComponentsSchemasSingleResponse result = apiInstance.secondaryDnsPeerUpdatePeer(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPeerApi#secondaryDnsPeerUpdatePeer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPIPeer**](CloudflareClientAPIPeer.md)|  |
 **identifier** | [**PeerComponentsSchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**SchemasAccountIdentifier**](.md)|  |

### Return type

[**PeerComponentsSchemasSingleResponse**](PeerComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

