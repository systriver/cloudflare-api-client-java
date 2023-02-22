# WorkerDomainApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workerDomainAttachToDomain**](WorkerDomainApi.md#workerDomainAttachToDomain) | **PUT** /accounts/{account_identifier}/workers/domains | Attach to Domain
[**workerDomainDetachFromDomain**](WorkerDomainApi.md#workerDomainDetachFromDomain) | **DELETE** /accounts/{account_identifier}/workers/domains/{domain_identifier} | Detach from Domain
[**workerDomainGetADomain**](WorkerDomainApi.md#workerDomainGetADomain) | **GET** /accounts/{account_identifier}/workers/domains/{domain_identifier} | Get a Domain
[**workerDomainListDomains**](WorkerDomainApi.md#workerDomainListDomains) | **GET** /accounts/{account_identifier}/workers/domains | List Domains

<a name="workerDomainAttachToDomain"></a>
# **workerDomainAttachToDomain**
> CloudflareClientAPIDomainResponseSingle workerDomainAttachToDomain(body, accountIdentifier)

Attach to Domain

Attaches a worker to a zone and hostname.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerDomainApi;

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


WorkerDomainApi apiInstance = new WorkerDomainApi();
WorkersDomainsBody body = new WorkersDomainsBody(); // WorkersDomainsBody | 
DomainsComponentsSchemasAccountIdentifier accountIdentifier = new DomainsComponentsSchemasAccountIdentifier(); // DomainsComponentsSchemasAccountIdentifier | 
try {
    CloudflareClientAPIDomainResponseSingle result = apiInstance.workerDomainAttachToDomain(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerDomainApi#workerDomainAttachToDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkersDomainsBody**](WorkersDomainsBody.md)|  |
 **accountIdentifier** | [**DomainsComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIDomainResponseSingle**](CloudflareClientAPIDomainResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workerDomainDetachFromDomain"></a>
# **workerDomainDetachFromDomain**
> workerDomainDetachFromDomain(domainIdentifier, accountIdentifier)

Detach from Domain

Detaches a worker from a zone and hostname.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerDomainApi;

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


WorkerDomainApi apiInstance = new WorkerDomainApi();
DomainIdentifier domainIdentifier = new DomainIdentifier(); // DomainIdentifier | 
DomainsComponentsSchemasAccountIdentifier accountIdentifier = new DomainsComponentsSchemasAccountIdentifier(); // DomainsComponentsSchemasAccountIdentifier | 
try {
    apiInstance.workerDomainDetachFromDomain(domainIdentifier, accountIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerDomainApi#workerDomainDetachFromDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainIdentifier** | [**DomainIdentifier**](.md)|  |
 **accountIdentifier** | [**DomainsComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workerDomainGetADomain"></a>
# **workerDomainGetADomain**
> CloudflareClientAPIDomainResponseSingle workerDomainGetADomain(domainIdentifier, accountIdentifier)

Get a Domain

Gets a Worker Domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerDomainApi;

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


WorkerDomainApi apiInstance = new WorkerDomainApi();
DomainIdentifier domainIdentifier = new DomainIdentifier(); // DomainIdentifier | 
DomainsComponentsSchemasAccountIdentifier accountIdentifier = new DomainsComponentsSchemasAccountIdentifier(); // DomainsComponentsSchemasAccountIdentifier | 
try {
    CloudflareClientAPIDomainResponseSingle result = apiInstance.workerDomainGetADomain(domainIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerDomainApi#workerDomainGetADomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainIdentifier** | [**DomainIdentifier**](.md)|  |
 **accountIdentifier** | [**DomainsComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIDomainResponseSingle**](CloudflareClientAPIDomainResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workerDomainListDomains"></a>
# **workerDomainListDomains**
> CloudflareClientAPIDomainResponseCollection workerDomainListDomains(accountIdentifier)

List Domains

Lists all Worker Domains.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerDomainApi;

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


WorkerDomainApi apiInstance = new WorkerDomainApi();
DomainsComponentsSchemasAccountIdentifier accountIdentifier = new DomainsComponentsSchemasAccountIdentifier(); // DomainsComponentsSchemasAccountIdentifier | 
try {
    CloudflareClientAPIDomainResponseCollection result = apiInstance.workerDomainListDomains(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerDomainApi#workerDomainListDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**DomainsComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIDomainResponseCollection**](CloudflareClientAPIDomainResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

