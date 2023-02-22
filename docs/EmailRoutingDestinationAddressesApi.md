# EmailRoutingDestinationAddressesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailRoutingDestinationAddressesCreateADestinationAddress**](EmailRoutingDestinationAddressesApi.md#emailRoutingDestinationAddressesCreateADestinationAddress) | **POST** /accounts/{account_identifier}/email/routing/addresses | Create a destination address
[**emailRoutingDestinationAddressesDeleteDestinationAddress**](EmailRoutingDestinationAddressesApi.md#emailRoutingDestinationAddressesDeleteDestinationAddress) | **DELETE** /accounts/{account_identifier}/email/routing/addresses/{destination_address_identifier} | Delete destination address
[**emailRoutingDestinationAddressesGetADestinationAddress**](EmailRoutingDestinationAddressesApi.md#emailRoutingDestinationAddressesGetADestinationAddress) | **GET** /accounts/{account_identifier}/email/routing/addresses/{destination_address_identifier} | Get a destination address
[**emailRoutingDestinationAddressesListDestinationAddresses**](EmailRoutingDestinationAddressesApi.md#emailRoutingDestinationAddressesListDestinationAddresses) | **GET** /accounts/{account_identifier}/email/routing/addresses | List destination addresses

<a name="emailRoutingDestinationAddressesCreateADestinationAddress"></a>
# **emailRoutingDestinationAddressesCreateADestinationAddress**
> DestinationAddressResponseSingle emailRoutingDestinationAddressesCreateADestinationAddress(body, accountIdentifier)

Create a destination address

Create a destination address to forward your emails to. Destination addresses need to be verified before they can be used.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingDestinationAddressesApi;

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


EmailRoutingDestinationAddressesApi apiInstance = new EmailRoutingDestinationAddressesApi();
CreateDestinationAddressProperties body = new CreateDestinationAddressProperties(); // CreateDestinationAddressProperties | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DestinationAddressResponseSingle result = apiInstance.emailRoutingDestinationAddressesCreateADestinationAddress(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingDestinationAddressesApi#emailRoutingDestinationAddressesCreateADestinationAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateDestinationAddressProperties**](CreateDestinationAddressProperties.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DestinationAddressResponseSingle**](DestinationAddressResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailRoutingDestinationAddressesDeleteDestinationAddress"></a>
# **emailRoutingDestinationAddressesDeleteDestinationAddress**
> DestinationAddressResponseSingle emailRoutingDestinationAddressesDeleteDestinationAddress(destinationAddressIdentifier, accountIdentifier)

Delete destination address

Deletes a specific destination address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingDestinationAddressesApi;

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


EmailRoutingDestinationAddressesApi apiInstance = new EmailRoutingDestinationAddressesApi();
String destinationAddressIdentifier = "destinationAddressIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DestinationAddressResponseSingle result = apiInstance.emailRoutingDestinationAddressesDeleteDestinationAddress(destinationAddressIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingDestinationAddressesApi#emailRoutingDestinationAddressesDeleteDestinationAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destinationAddressIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DestinationAddressResponseSingle**](DestinationAddressResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailRoutingDestinationAddressesGetADestinationAddress"></a>
# **emailRoutingDestinationAddressesGetADestinationAddress**
> DestinationAddressResponseSingle emailRoutingDestinationAddressesGetADestinationAddress(destinationAddressIdentifier, accountIdentifier)

Get a destination address

Gets information for a specific destination email already created.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingDestinationAddressesApi;

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


EmailRoutingDestinationAddressesApi apiInstance = new EmailRoutingDestinationAddressesApi();
String destinationAddressIdentifier = "destinationAddressIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DestinationAddressResponseSingle result = apiInstance.emailRoutingDestinationAddressesGetADestinationAddress(destinationAddressIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingDestinationAddressesApi#emailRoutingDestinationAddressesGetADestinationAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destinationAddressIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DestinationAddressResponseSingle**](DestinationAddressResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="emailRoutingDestinationAddressesListDestinationAddresses"></a>
# **emailRoutingDestinationAddressesListDestinationAddresses**
> DestinationAddressesResponseCollection emailRoutingDestinationAddressesListDestinationAddresses(accountIdentifier)

List destination addresses

Lists existing destination addresses.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingDestinationAddressesApi;

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


EmailRoutingDestinationAddressesApi apiInstance = new EmailRoutingDestinationAddressesApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DestinationAddressesResponseCollection result = apiInstance.emailRoutingDestinationAddressesListDestinationAddresses(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingDestinationAddressesApi#emailRoutingDestinationAddressesListDestinationAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DestinationAddressesResponseCollection**](DestinationAddressesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

