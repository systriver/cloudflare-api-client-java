# DnsFirewallLegacyApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dnsFirewallLegacyCreateDnsFirewallCluster**](DnsFirewallLegacyApi.md#dnsFirewallLegacyCreateDnsFirewallCluster) | **POST** /accounts/{account_identifier}/virtual_dns | Create DNS Firewall Cluster
[**dnsFirewallLegacyDeleteDnsFirewallCluster**](DnsFirewallLegacyApi.md#dnsFirewallLegacyDeleteDnsFirewallCluster) | **DELETE** /accounts/{account_identifier}/virtual_dns/{identifier} | Delete DNS Firewall Cluster
[**dnsFirewallLegacyDnsFirewallClusterDetails**](DnsFirewallLegacyApi.md#dnsFirewallLegacyDnsFirewallClusterDetails) | **GET** /accounts/{account_identifier}/virtual_dns/{identifier} | DNS Firewall Cluster Details
[**dnsFirewallLegacyListDnsFirewallClusters**](DnsFirewallLegacyApi.md#dnsFirewallLegacyListDnsFirewallClusters) | **GET** /accounts/{account_identifier}/virtual_dns | List DNS Firewall Clusters
[**dnsFirewallLegacyUpdateDnsFirewallCluster**](DnsFirewallLegacyApi.md#dnsFirewallLegacyUpdateDnsFirewallCluster) | **PUT** /accounts/{account_identifier}/virtual_dns/{identifier} | Update DNS Firewall Cluster

<a name="dnsFirewallLegacyCreateDnsFirewallCluster"></a>
# **dnsFirewallLegacyCreateDnsFirewallCluster**
> VirtualDnsSingleResponse dnsFirewallLegacyCreateDnsFirewallCluster(body, accountIdentifier)

Create DNS Firewall Cluster

Create a configured DNS Firewall Cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallLegacyApi;

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


DnsFirewallLegacyApi apiInstance = new DnsFirewallLegacyApi();
AccountIdentifierVirtualDnsBody body = new AccountIdentifierVirtualDnsBody(); // AccountIdentifierVirtualDnsBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VirtualDnsSingleResponse result = apiInstance.dnsFirewallLegacyCreateDnsFirewallCluster(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallLegacyApi#dnsFirewallLegacyCreateDnsFirewallCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountIdentifierVirtualDnsBody**](AccountIdentifierVirtualDnsBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VirtualDnsSingleResponse**](VirtualDnsSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dnsFirewallLegacyDeleteDnsFirewallCluster"></a>
# **dnsFirewallLegacyDeleteDnsFirewallCluster**
> InlineResponse200 dnsFirewallLegacyDeleteDnsFirewallCluster(identifier, accountIdentifier)

Delete DNS Firewall Cluster

Delete a configured DNS Firewall Cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallLegacyApi;

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


DnsFirewallLegacyApi apiInstance = new DnsFirewallLegacyApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse200 result = apiInstance.dnsFirewallLegacyDeleteDnsFirewallCluster(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallLegacyApi#dnsFirewallLegacyDeleteDnsFirewallCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dnsFirewallLegacyDnsFirewallClusterDetails"></a>
# **dnsFirewallLegacyDnsFirewallClusterDetails**
> VirtualDnsSingleResponse dnsFirewallLegacyDnsFirewallClusterDetails(identifier, accountIdentifier)

DNS Firewall Cluster Details

Show a single configured DNS Firewall cluster for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallLegacyApi;

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


DnsFirewallLegacyApi apiInstance = new DnsFirewallLegacyApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VirtualDnsSingleResponse result = apiInstance.dnsFirewallLegacyDnsFirewallClusterDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallLegacyApi#dnsFirewallLegacyDnsFirewallClusterDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VirtualDnsSingleResponse**](VirtualDnsSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dnsFirewallLegacyListDnsFirewallClusters"></a>
# **dnsFirewallLegacyListDnsFirewallClusters**
> VirtualDnsResponseCollection dnsFirewallLegacyListDnsFirewallClusters(accountIdentifier)

List DNS Firewall Clusters

List configured DNS Firewall clusters for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallLegacyApi;

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


DnsFirewallLegacyApi apiInstance = new DnsFirewallLegacyApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VirtualDnsResponseCollection result = apiInstance.dnsFirewallLegacyListDnsFirewallClusters(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallLegacyApi#dnsFirewallLegacyListDnsFirewallClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VirtualDnsResponseCollection**](VirtualDnsResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dnsFirewallLegacyUpdateDnsFirewallCluster"></a>
# **dnsFirewallLegacyUpdateDnsFirewallCluster**
> VirtualDnsSingleResponse dnsFirewallLegacyUpdateDnsFirewallCluster(body, identifier, accountIdentifier)

Update DNS Firewall Cluster

Modify a DNS Firewall Cluster configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallLegacyApi;

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


DnsFirewallLegacyApi apiInstance = new DnsFirewallLegacyApi();
SchemasVirtualDns body = new SchemasVirtualDns(); // SchemasVirtualDns | 
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VirtualDnsSingleResponse result = apiInstance.dnsFirewallLegacyUpdateDnsFirewallCluster(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallLegacyApi#dnsFirewallLegacyUpdateDnsFirewallCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchemasVirtualDns**](SchemasVirtualDns.md)|  |
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VirtualDnsSingleResponse**](VirtualDnsSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

