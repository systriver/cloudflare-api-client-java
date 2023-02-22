# RegistrarDomainsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registrarDomainsGetDomain**](RegistrarDomainsApi.md#registrarDomainsGetDomain) | **GET** /accounts/{account_identifier}/registrar/domains/{domain_name} | Get domain
[**registrarDomainsListDomains**](RegistrarDomainsApi.md#registrarDomainsListDomains) | **POST** /accounts/{account_identifier}/registrar/domains | List domains
[**registrarDomainsUpdateDomain**](RegistrarDomainsApi.md#registrarDomainsUpdateDomain) | **PUT** /accounts/{account_identifier}/registrar/domains/{domain_name} | Update domain

<a name="registrarDomainsGetDomain"></a>
# **registrarDomainsGetDomain**
> DomainResponseSingle registrarDomainsGetDomain(domainName, accountIdentifier)

Get domain

Show individual domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RegistrarDomainsApi;

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


RegistrarDomainsApi apiInstance = new RegistrarDomainsApi();
String domainName = "domainName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DomainResponseSingle result = apiInstance.registrarDomainsGetDomain(domainName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrarDomainsApi#registrarDomainsGetDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DomainResponseSingle**](DomainResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registrarDomainsListDomains"></a>
# **registrarDomainsListDomains**
> DomainResponseCollection registrarDomainsListDomains(body, accountIdentifier)

List domains

List domains handled by Registrar.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RegistrarDomainsApi;

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


RegistrarDomainsApi apiInstance = new RegistrarDomainsApi();
RegistrarDomainsBody body = new RegistrarDomainsBody(); // RegistrarDomainsBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DomainResponseCollection result = apiInstance.registrarDomainsListDomains(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrarDomainsApi#registrarDomainsListDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RegistrarDomainsBody**](RegistrarDomainsBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DomainResponseCollection**](DomainResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registrarDomainsUpdateDomain"></a>
# **registrarDomainsUpdateDomain**
> DomainResponseSingle registrarDomainsUpdateDomain(body, domainName, accountIdentifier)

Update domain

Update individual domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RegistrarDomainsApi;

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


RegistrarDomainsApi apiInstance = new RegistrarDomainsApi();
DomainsDomainNameBody body = new DomainsDomainNameBody(); // DomainsDomainNameBody | 
String domainName = "domainName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DomainResponseSingle result = apiInstance.registrarDomainsUpdateDomain(body, domainName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrarDomainsApi#registrarDomainsUpdateDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DomainsDomainNameBody**](DomainsDomainNameBody.md)|  |
 **domainName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DomainResponseSingle**](DomainResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

