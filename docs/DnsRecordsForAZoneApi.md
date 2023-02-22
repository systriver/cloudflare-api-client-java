# DnsRecordsForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dnsRecordsForAZoneCreateDnsRecord**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneCreateDnsRecord) | **POST** /zones/{zone_identifier}/dns_records | Create DNS Record
[**dnsRecordsForAZoneDeleteDnsRecord**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneDeleteDnsRecord) | **DELETE** /zones/{zone_identifier}/dns_records/{identifier} | Delete DNS Record
[**dnsRecordsForAZoneDnsRecordDetails**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneDnsRecordDetails) | **GET** /zones/{zone_identifier}/dns_records/{identifier} | DNS Record Details
[**dnsRecordsForAZoneExportDnsRecords**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneExportDnsRecords) | **GET** /zones/{zone_identifier}/dns_records/export | Export DNS Records
[**dnsRecordsForAZoneImportDnsRecords**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneImportDnsRecords) | **POST** /zones/{zone_identifier}/dns_records/import | Import DNS Records
[**dnsRecordsForAZoneListDnsRecords**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneListDnsRecords) | **GET** /zones/{zone_identifier}/dns_records | List DNS Records
[**dnsRecordsForAZonePatchDnsRecord**](DnsRecordsForAZoneApi.md#dnsRecordsForAZonePatchDnsRecord) | **PATCH** /zones/{zone_identifier}/dns_records/{identifier} | Patch DNS Record
[**dnsRecordsForAZoneScanDnsRecords**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneScanDnsRecords) | **POST** /zones/{zone_identifier}/dns_records/scan | Scan DNS Records
[**dnsRecordsForAZoneUpdateDnsRecord**](DnsRecordsForAZoneApi.md#dnsRecordsForAZoneUpdateDnsRecord) | **PUT** /zones/{zone_identifier}/dns_records/{identifier} | Update DNS Record

<a name="dnsRecordsForAZoneCreateDnsRecord"></a>
# **dnsRecordsForAZoneCreateDnsRecord**
> DnsResponseSingle dnsRecordsForAZoneCreateDnsRecord(body, zoneIdentifier)

Create DNS Record

Create a new DNS record for a zone. See the record object definitions for required attributes for each record type.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsRecordsForAZoneApi;

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


DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi();
ZoneIdentifierDnsRecordsBody body = new ZoneIdentifierDnsRecordsBody(); // ZoneIdentifierDnsRecordsBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DnsResponseSingle result = apiInstance.dnsRecordsForAZoneCreateDnsRecord(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneCreateDnsRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZoneIdentifierDnsRecordsBody**](ZoneIdentifierDnsRecordsBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DnsResponseSingle**](DnsResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dnsRecordsForAZoneDeleteDnsRecord"></a>
# **dnsRecordsForAZoneDeleteDnsRecord**
> InlineResponse200113 dnsRecordsForAZoneDeleteDnsRecord(identifier, zoneIdentifier)

Delete DNS Record

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsRecordsForAZoneApi;

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


DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200113 result = apiInstance.dnsRecordsForAZoneDeleteDnsRecord(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneDeleteDnsRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200113**](InlineResponse200113.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dnsRecordsForAZoneDnsRecordDetails"></a>
# **dnsRecordsForAZoneDnsRecordDetails**
> DnsResponseSingle dnsRecordsForAZoneDnsRecordDetails(identifier, zoneIdentifier)

DNS Record Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsRecordsForAZoneApi;

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


DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DnsResponseSingle result = apiInstance.dnsRecordsForAZoneDnsRecordDetails(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneDnsRecordDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DnsResponseSingle**](DnsResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dnsRecordsForAZoneExportDnsRecords"></a>
# **dnsRecordsForAZoneExportDnsRecords**
> Object dnsRecordsForAZoneExportDnsRecords(zoneIdentifier)

Export DNS Records

You can export your [BIND config](https://en.wikipedia.org/wiki/Zone_file \&quot;Zone file\&quot;) through this endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsRecordsForAZoneApi;

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


DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    Object result = apiInstance.dnsRecordsForAZoneExportDnsRecords(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneExportDnsRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

**Object**

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dnsRecordsForAZoneImportDnsRecords"></a>
# **dnsRecordsForAZoneImportDnsRecords**
> DnsResponseImportScan dnsRecordsForAZoneImportDnsRecords(file, proxied, zoneIdentifier)

Import DNS Records

You can upload your [BIND config](https://en.wikipedia.org/wiki/Zone_file \&quot;Zone file\&quot;) through this endpoint. It assumes that cURL is called from a location with bind_config.txt (valid BIND config) present.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsRecordsForAZoneApi;

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


DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi();
String file = "file_example"; // String | 
Boolean proxied = true; // Boolean | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DnsResponseImportScan result = apiInstance.dnsRecordsForAZoneImportDnsRecords(file, proxied, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneImportDnsRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **String**|  |
 **proxied** | **Boolean**|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DnsResponseImportScan**](DnsResponseImportScan.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="dnsRecordsForAZoneListDnsRecords"></a>
# **dnsRecordsForAZoneListDnsRecords**
> DnsResponseCollection dnsRecordsForAZoneListDnsRecords(zoneIdentifier)

List DNS Records

List, search, sort, and filter a zones&#x27; DNS records.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsRecordsForAZoneApi;

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


DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DnsResponseCollection result = apiInstance.dnsRecordsForAZoneListDnsRecords(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneListDnsRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DnsResponseCollection**](DnsResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dnsRecordsForAZonePatchDnsRecord"></a>
# **dnsRecordsForAZonePatchDnsRecord**
> DnsResponseSingle dnsRecordsForAZonePatchDnsRecord(body, identifier, zoneIdentifier)

Patch DNS Record

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsRecordsForAZoneApi;

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


DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi();
DnsRecordsIdentifierBody1 body = new DnsRecordsIdentifierBody1(); // DnsRecordsIdentifierBody1 | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DnsResponseSingle result = apiInstance.dnsRecordsForAZonePatchDnsRecord(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZonePatchDnsRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DnsRecordsIdentifierBody1**](DnsRecordsIdentifierBody1.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DnsResponseSingle**](DnsResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dnsRecordsForAZoneScanDnsRecords"></a>
# **dnsRecordsForAZoneScanDnsRecords**
> DnsResponseImportScan dnsRecordsForAZoneScanDnsRecords(zoneIdentifier)

Scan DNS Records

Scan for common DNS records on your domain and automatically add them to your zone. Useful if you haven&#x27;t updated your nameservers yet.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsRecordsForAZoneApi;

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


DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DnsResponseImportScan result = apiInstance.dnsRecordsForAZoneScanDnsRecords(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneScanDnsRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DnsResponseImportScan**](DnsResponseImportScan.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dnsRecordsForAZoneUpdateDnsRecord"></a>
# **dnsRecordsForAZoneUpdateDnsRecord**
> DnsResponseSingle dnsRecordsForAZoneUpdateDnsRecord(body, identifier, zoneIdentifier)

Update DNS Record

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsRecordsForAZoneApi;

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


DnsRecordsForAZoneApi apiInstance = new DnsRecordsForAZoneApi();
DnsRecordsIdentifierBody body = new DnsRecordsIdentifierBody(); // DnsRecordsIdentifierBody | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DnsResponseSingle result = apiInstance.dnsRecordsForAZoneUpdateDnsRecord(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsRecordsForAZoneApi#dnsRecordsForAZoneUpdateDnsRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DnsRecordsIdentifierBody**](DnsRecordsIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DnsResponseSingle**](DnsResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

