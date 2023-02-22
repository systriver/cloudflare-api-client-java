# DnsFirewallApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dnsFirewallCreateDnsFirewallCluster**](DnsFirewallApi.md#dnsFirewallCreateDnsFirewallCluster) | **POST** /accounts/{account_identifier}/dns_firewall | Create DNS Firewall Cluster
[**dnsFirewallDeleteDnsFirewallCluster**](DnsFirewallApi.md#dnsFirewallDeleteDnsFirewallCluster) | **DELETE** /accounts/{account_identifier}/dns_firewall/{identifier} | Delete DNS Firewall Cluster
[**dnsFirewallDnsFirewallClusterDetails**](DnsFirewallApi.md#dnsFirewallDnsFirewallClusterDetails) | **GET** /accounts/{account_identifier}/dns_firewall/{identifier} | DNS Firewall Cluster Details
[**dnsFirewallListDnsFirewallClusters**](DnsFirewallApi.md#dnsFirewallListDnsFirewallClusters) | **GET** /accounts/{account_identifier}/dns_firewall | List DNS Firewall Clusters
[**dnsFirewallUpdateDnsFirewallCluster**](DnsFirewallApi.md#dnsFirewallUpdateDnsFirewallCluster) | **PATCH** /accounts/{account_identifier}/dns_firewall/{identifier} | Update DNS Firewall Cluster

<a name="dnsFirewallCreateDnsFirewallCluster"></a>
# **dnsFirewallCreateDnsFirewallCluster**
> DnsFirewallSingleResponse dnsFirewallCreateDnsFirewallCluster(body, accountIdentifier)

Create DNS Firewall Cluster

Create a configured DNS Firewall Cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallApi;

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


DnsFirewallApi apiInstance = new DnsFirewallApi();
AccountIdentifierDnsFirewallBody body = new AccountIdentifierDnsFirewallBody(); // AccountIdentifierDnsFirewallBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DnsFirewallSingleResponse result = apiInstance.dnsFirewallCreateDnsFirewallCluster(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallApi#dnsFirewallCreateDnsFirewallCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountIdentifierDnsFirewallBody**](AccountIdentifierDnsFirewallBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DnsFirewallSingleResponse**](DnsFirewallSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dnsFirewallDeleteDnsFirewallCluster"></a>
# **dnsFirewallDeleteDnsFirewallCluster**
> InlineResponse200 dnsFirewallDeleteDnsFirewallCluster(identifier, accountIdentifier)

Delete DNS Firewall Cluster

Delete a configured DNS Firewall Cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallApi;

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


DnsFirewallApi apiInstance = new DnsFirewallApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse200 result = apiInstance.dnsFirewallDeleteDnsFirewallCluster(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallApi#dnsFirewallDeleteDnsFirewallCluster");
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

<a name="dnsFirewallDnsFirewallClusterDetails"></a>
# **dnsFirewallDnsFirewallClusterDetails**
> DnsFirewallSingleResponse dnsFirewallDnsFirewallClusterDetails(identifier, accountIdentifier)

DNS Firewall Cluster Details

Show a single configured DNS Firewall cluster for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallApi;

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


DnsFirewallApi apiInstance = new DnsFirewallApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DnsFirewallSingleResponse result = apiInstance.dnsFirewallDnsFirewallClusterDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallApi#dnsFirewallDnsFirewallClusterDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DnsFirewallSingleResponse**](DnsFirewallSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dnsFirewallListDnsFirewallClusters"></a>
# **dnsFirewallListDnsFirewallClusters**
> DnsFirewallResponseCollection dnsFirewallListDnsFirewallClusters(accountIdentifier)

List DNS Firewall Clusters

List configured DNS Firewall clusters for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallApi;

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


DnsFirewallApi apiInstance = new DnsFirewallApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DnsFirewallResponseCollection result = apiInstance.dnsFirewallListDnsFirewallClusters(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallApi#dnsFirewallListDnsFirewallClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DnsFirewallResponseCollection**](DnsFirewallResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dnsFirewallUpdateDnsFirewallCluster"></a>
# **dnsFirewallUpdateDnsFirewallCluster**
> DnsFirewallSingleResponse dnsFirewallUpdateDnsFirewallCluster(body, identifier, accountIdentifier)

Update DNS Firewall Cluster

Modify a DNS Firewall Cluster configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallApi;

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


DnsFirewallApi apiInstance = new DnsFirewallApi();
SchemasDnsFirewall body = new SchemasDnsFirewall(); // SchemasDnsFirewall | 
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DnsFirewallSingleResponse result = apiInstance.dnsFirewallUpdateDnsFirewallCluster(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallApi#dnsFirewallUpdateDnsFirewallCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchemasDnsFirewall**](SchemasDnsFirewall.md)|  |
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DnsFirewallSingleResponse**](DnsFirewallSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

