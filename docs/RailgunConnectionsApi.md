# RailgunConnectionsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**railgunConnectionsConnectionDetails**](RailgunConnectionsApi.md#railgunConnectionsConnectionDetails) | **GET** /accounts/{account_identifier}/railguns/{railgun_identifier}/connections/{identifier} | Connection details
[**railgunConnectionsCreateConnection**](RailgunConnectionsApi.md#railgunConnectionsCreateConnection) | **POST** /accounts/{account_identifier}/railguns/{railgun_identifier}/connections | Create connection
[**railgunConnectionsDeleteConnection**](RailgunConnectionsApi.md#railgunConnectionsDeleteConnection) | **DELETE** /accounts/{account_identifier}/railguns/{railgun_identifier}/connections/{identifier} | Delete connection
[**railgunConnectionsListConnections**](RailgunConnectionsApi.md#railgunConnectionsListConnections) | **GET** /accounts/{account_identifier}/railguns/{railgun_identifier}/connections | List Connections
[**railgunConnectionsUpdateConnection**](RailgunConnectionsApi.md#railgunConnectionsUpdateConnection) | **PUT** /accounts/{account_identifier}/railguns/{railgun_identifier}/connections/{identifier} | Update connection

<a name="railgunConnectionsConnectionDetails"></a>
# **railgunConnectionsConnectionDetails**
> ConnectionSingleResponse railgunConnectionsConnectionDetails(identifier, railgunIdentifier, accountIdentifier)

Connection details

Get a connection by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunConnectionsApi;

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


RailgunConnectionsApi apiInstance = new RailgunConnectionsApi();
String identifier = "identifier_example"; // String | 
String railgunIdentifier = "railgunIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ConnectionSingleResponse result = apiInstance.railgunConnectionsConnectionDetails(identifier, railgunIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunConnectionsApi#railgunConnectionsConnectionDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **railgunIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ConnectionSingleResponse**](ConnectionSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="railgunConnectionsCreateConnection"></a>
# **railgunConnectionsCreateConnection**
> ConnectionSingleResponse railgunConnectionsCreateConnection(body, railgunIdentifier, accountIdentifier)

Create connection

Associates a zone to the Railgun.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunConnectionsApi;

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


RailgunConnectionsApi apiInstance = new RailgunConnectionsApi();
ConnectionSingleRequest body = new ConnectionSingleRequest(); // ConnectionSingleRequest | 
String railgunIdentifier = "railgunIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ConnectionSingleResponse result = apiInstance.railgunConnectionsCreateConnection(body, railgunIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunConnectionsApi#railgunConnectionsCreateConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectionSingleRequest**](ConnectionSingleRequest.md)|  |
 **railgunIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ConnectionSingleResponse**](ConnectionSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="railgunConnectionsDeleteConnection"></a>
# **railgunConnectionsDeleteConnection**
> ConnectionSingleIdResponse railgunConnectionsDeleteConnection(identifier, railgunIdentifier, accountIdentifier)

Delete connection

Disable and remove the connection to a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunConnectionsApi;

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


RailgunConnectionsApi apiInstance = new RailgunConnectionsApi();
String identifier = "identifier_example"; // String | 
String railgunIdentifier = "railgunIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ConnectionSingleIdResponse result = apiInstance.railgunConnectionsDeleteConnection(identifier, railgunIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunConnectionsApi#railgunConnectionsDeleteConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **railgunIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ConnectionSingleIdResponse**](ConnectionSingleIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="railgunConnectionsListConnections"></a>
# **railgunConnectionsListConnections**
> ConnectionCollectionResponse railgunConnectionsListConnections(railgunIdentifier, accountIdentifier)

List Connections

List connections associated with the Railgun.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunConnectionsApi;

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


RailgunConnectionsApi apiInstance = new RailgunConnectionsApi();
String railgunIdentifier = "railgunIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ConnectionCollectionResponse result = apiInstance.railgunConnectionsListConnections(railgunIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunConnectionsApi#railgunConnectionsListConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **railgunIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ConnectionCollectionResponse**](ConnectionCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="railgunConnectionsUpdateConnection"></a>
# **railgunConnectionsUpdateConnection**
> ConnectionSingleResponse railgunConnectionsUpdateConnection(body, identifier, railgunIdentifier, accountIdentifier)

Update connection

Enable or disable a connection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunConnectionsApi;

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


RailgunConnectionsApi apiInstance = new RailgunConnectionsApi();
SchemasConnection body = new SchemasConnection(); // SchemasConnection | 
String identifier = "identifier_example"; // String | 
String railgunIdentifier = "railgunIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ConnectionSingleResponse result = apiInstance.railgunConnectionsUpdateConnection(body, identifier, railgunIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunConnectionsApi#railgunConnectionsUpdateConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchemasConnection**](SchemasConnection.md)|  |
 **identifier** | [**String**](.md)|  |
 **railgunIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ConnectionSingleResponse**](ConnectionSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

