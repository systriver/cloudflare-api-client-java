# PagesDomainsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pagesDomainsAddDomain**](PagesDomainsApi.md#pagesDomainsAddDomain) | **POST** /accounts/{account_identifier}/pages/projects/{project_name}/domains | Add domain
[**pagesDomainsDeleteDomain**](PagesDomainsApi.md#pagesDomainsDeleteDomain) | **DELETE** /accounts/{account_identifier}/pages/projects/{project_name}/domains/{domain_name} | Delete domain
[**pagesDomainsGetDomain**](PagesDomainsApi.md#pagesDomainsGetDomain) | **GET** /accounts/{account_identifier}/pages/projects/{project_name}/domains/{domain_name} | Get domain
[**pagesDomainsGetDomains**](PagesDomainsApi.md#pagesDomainsGetDomains) | **GET** /accounts/{account_identifier}/pages/projects/{project_name}/domains | Get domains
[**pagesDomainsPatchDomain**](PagesDomainsApi.md#pagesDomainsPatchDomain) | **PATCH** /accounts/{account_identifier}/pages/projects/{project_name}/domains/{domain_name} | Patch domain

<a name="pagesDomainsAddDomain"></a>
# **pagesDomainsAddDomain**
> DomainResponseSingle pagesDomainsAddDomain(body, projectName, accountIdentifier)

Add domain

Add a new domain for the Pages project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesDomainsApi;

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


PagesDomainsApi apiInstance = new PagesDomainsApi();
Object body = null; // Object | 
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DomainResponseSingle result = apiInstance.pagesDomainsAddDomain(body, projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesDomainsApi#pagesDomainsAddDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DomainResponseSingle**](DomainResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pagesDomainsDeleteDomain"></a>
# **pagesDomainsDeleteDomain**
> Object pagesDomainsDeleteDomain(domainName, projectName, accountIdentifier)

Delete domain

Delete a domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesDomainsApi;

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


PagesDomainsApi apiInstance = new PagesDomainsApi();
String domainName = "domainName_example"; // String | 
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    Object result = apiInstance.pagesDomainsDeleteDomain(domainName, projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesDomainsApi#pagesDomainsDeleteDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainName** | [**String**](.md)|  |
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

**Object**

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pagesDomainsGetDomain"></a>
# **pagesDomainsGetDomain**
> DomainResponseSingle pagesDomainsGetDomain(domainName, projectName, accountIdentifier)

Get domain

Fetch a single domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesDomainsApi;

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


PagesDomainsApi apiInstance = new PagesDomainsApi();
String domainName = "domainName_example"; // String | 
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DomainResponseSingle result = apiInstance.pagesDomainsGetDomain(domainName, projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesDomainsApi#pagesDomainsGetDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainName** | [**String**](.md)|  |
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DomainResponseSingle**](DomainResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pagesDomainsGetDomains"></a>
# **pagesDomainsGetDomains**
> DomainResponseCollection pagesDomainsGetDomains(projectName, accountIdentifier)

Get domains

Fetch a list of all domains.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesDomainsApi;

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


PagesDomainsApi apiInstance = new PagesDomainsApi();
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DomainResponseCollection result = apiInstance.pagesDomainsGetDomains(projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesDomainsApi#pagesDomainsGetDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DomainResponseCollection**](DomainResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pagesDomainsPatchDomain"></a>
# **pagesDomainsPatchDomain**
> DomainResponseSingle pagesDomainsPatchDomain(domainName, projectName, accountIdentifier)

Patch domain

Retry the validation status of a single domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesDomainsApi;

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


PagesDomainsApi apiInstance = new PagesDomainsApi();
String domainName = "domainName_example"; // String | 
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DomainResponseSingle result = apiInstance.pagesDomainsPatchDomain(domainName, projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesDomainsApi#pagesDomainsPatchDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainName** | [**String**](.md)|  |
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DomainResponseSingle**](DomainResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

