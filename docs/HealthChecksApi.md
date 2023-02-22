# HealthChecksApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthChecksCreateHealthCheck**](HealthChecksApi.md#healthChecksCreateHealthCheck) | **POST** /zones/{zone_identifier}/healthchecks | Create Health Check
[**healthChecksCreatePreviewHealthCheck**](HealthChecksApi.md#healthChecksCreatePreviewHealthCheck) | **POST** /zones/{zone_identifier}/healthchecks/preview | Create Preview Health Check
[**healthChecksDeleteHealthCheck**](HealthChecksApi.md#healthChecksDeleteHealthCheck) | **DELETE** /zones/{zone_identifier}/healthchecks/{identifier} | Delete Health Check
[**healthChecksDeletePreviewHealthCheck**](HealthChecksApi.md#healthChecksDeletePreviewHealthCheck) | **DELETE** /zones/{zone_identifier}/healthchecks/preview/{identifier} | Delete Preview Health Check
[**healthChecksHealthCheckDetails**](HealthChecksApi.md#healthChecksHealthCheckDetails) | **GET** /zones/{zone_identifier}/healthchecks/{identifier} | Health Check Details
[**healthChecksHealthCheckPreviewDetails**](HealthChecksApi.md#healthChecksHealthCheckPreviewDetails) | **GET** /zones/{zone_identifier}/healthchecks/preview/{identifier} | Health Check Preview Details
[**healthChecksListHealthChecks**](HealthChecksApi.md#healthChecksListHealthChecks) | **GET** /zones/{zone_identifier}/healthchecks | List Health Checks
[**healthChecksPatchHealthCheck**](HealthChecksApi.md#healthChecksPatchHealthCheck) | **PATCH** /zones/{zone_identifier}/healthchecks/{identifier} | Patch Health Check
[**healthChecksUpdateHealthCheck**](HealthChecksApi.md#healthChecksUpdateHealthCheck) | **PUT** /zones/{zone_identifier}/healthchecks/{identifier} | Update Health Check

<a name="healthChecksCreateHealthCheck"></a>
# **healthChecksCreateHealthCheck**
> HealthchecksComponentsSchemasSingleResponse healthChecksCreateHealthCheck(body, zoneIdentifier)

Create Health Check

Create a new health check.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HealthChecksApi;

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


HealthChecksApi apiInstance = new HealthChecksApi();
CloudflareClientAPIQueryHealthcheck body = new CloudflareClientAPIQueryHealthcheck(); // CloudflareClientAPIQueryHealthcheck | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    HealthchecksComponentsSchemasSingleResponse result = apiInstance.healthChecksCreateHealthCheck(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthChecksApi#healthChecksCreateHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPIQueryHealthcheck**](CloudflareClientAPIQueryHealthcheck.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**HealthchecksComponentsSchemasSingleResponse**](HealthchecksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="healthChecksCreatePreviewHealthCheck"></a>
# **healthChecksCreatePreviewHealthCheck**
> HealthchecksComponentsSchemasSingleResponse healthChecksCreatePreviewHealthCheck(body, zoneIdentifier)

Create Preview Health Check

Create a new preview health check.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HealthChecksApi;

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


HealthChecksApi apiInstance = new HealthChecksApi();
CloudflareClientAPIQueryHealthcheck body = new CloudflareClientAPIQueryHealthcheck(); // CloudflareClientAPIQueryHealthcheck | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    HealthchecksComponentsSchemasSingleResponse result = apiInstance.healthChecksCreatePreviewHealthCheck(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthChecksApi#healthChecksCreatePreviewHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPIQueryHealthcheck**](CloudflareClientAPIQueryHealthcheck.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**HealthchecksComponentsSchemasSingleResponse**](HealthchecksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="healthChecksDeleteHealthCheck"></a>
# **healthChecksDeleteHealthCheck**
> HealthchecksComponentsSchemasIdResponse healthChecksDeleteHealthCheck(identifier, zoneIdentifier)

Delete Health Check

Delete a health check.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HealthChecksApi;

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


HealthChecksApi apiInstance = new HealthChecksApi();
HealthchecksComponentsSchemasIdentifier identifier = new HealthchecksComponentsSchemasIdentifier(); // HealthchecksComponentsSchemasIdentifier | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    HealthchecksComponentsSchemasIdResponse result = apiInstance.healthChecksDeleteHealthCheck(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthChecksApi#healthChecksDeleteHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**HealthchecksComponentsSchemasIdentifier**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**HealthchecksComponentsSchemasIdResponse**](HealthchecksComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="healthChecksDeletePreviewHealthCheck"></a>
# **healthChecksDeletePreviewHealthCheck**
> HealthchecksComponentsSchemasIdResponse healthChecksDeletePreviewHealthCheck(identifier, zoneIdentifier)

Delete Preview Health Check

Delete a health check.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HealthChecksApi;

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


HealthChecksApi apiInstance = new HealthChecksApi();
HealthchecksComponentsSchemasIdentifier identifier = new HealthchecksComponentsSchemasIdentifier(); // HealthchecksComponentsSchemasIdentifier | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    HealthchecksComponentsSchemasIdResponse result = apiInstance.healthChecksDeletePreviewHealthCheck(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthChecksApi#healthChecksDeletePreviewHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**HealthchecksComponentsSchemasIdentifier**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**HealthchecksComponentsSchemasIdResponse**](HealthchecksComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="healthChecksHealthCheckDetails"></a>
# **healthChecksHealthCheckDetails**
> HealthchecksComponentsSchemasSingleResponse healthChecksHealthCheckDetails(identifier, zoneIdentifier)

Health Check Details

Fetch a single configured health check.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HealthChecksApi;

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


HealthChecksApi apiInstance = new HealthChecksApi();
HealthchecksComponentsSchemasIdentifier identifier = new HealthchecksComponentsSchemasIdentifier(); // HealthchecksComponentsSchemasIdentifier | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    HealthchecksComponentsSchemasSingleResponse result = apiInstance.healthChecksHealthCheckDetails(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthChecksApi#healthChecksHealthCheckDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**HealthchecksComponentsSchemasIdentifier**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**HealthchecksComponentsSchemasSingleResponse**](HealthchecksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="healthChecksHealthCheckPreviewDetails"></a>
# **healthChecksHealthCheckPreviewDetails**
> HealthchecksComponentsSchemasSingleResponse healthChecksHealthCheckPreviewDetails(identifier, zoneIdentifier)

Health Check Preview Details

Fetch a single configured health check preview.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HealthChecksApi;

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


HealthChecksApi apiInstance = new HealthChecksApi();
HealthchecksComponentsSchemasIdentifier identifier = new HealthchecksComponentsSchemasIdentifier(); // HealthchecksComponentsSchemasIdentifier | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    HealthchecksComponentsSchemasSingleResponse result = apiInstance.healthChecksHealthCheckPreviewDetails(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthChecksApi#healthChecksHealthCheckPreviewDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**HealthchecksComponentsSchemasIdentifier**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**HealthchecksComponentsSchemasSingleResponse**](HealthchecksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="healthChecksListHealthChecks"></a>
# **healthChecksListHealthChecks**
> HealthchecksComponentsSchemasResponseCollection healthChecksListHealthChecks(zoneIdentifier)

List Health Checks

List configured health checks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HealthChecksApi;

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


HealthChecksApi apiInstance = new HealthChecksApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    HealthchecksComponentsSchemasResponseCollection result = apiInstance.healthChecksListHealthChecks(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthChecksApi#healthChecksListHealthChecks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**HealthchecksComponentsSchemasResponseCollection**](HealthchecksComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="healthChecksPatchHealthCheck"></a>
# **healthChecksPatchHealthCheck**
> HealthchecksComponentsSchemasSingleResponse healthChecksPatchHealthCheck(body, identifier, zoneIdentifier)

Patch Health Check

Patch a configured health check.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HealthChecksApi;

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


HealthChecksApi apiInstance = new HealthChecksApi();
CloudflareClientAPIQueryHealthcheck body = new CloudflareClientAPIQueryHealthcheck(); // CloudflareClientAPIQueryHealthcheck | 
HealthchecksComponentsSchemasIdentifier identifier = new HealthchecksComponentsSchemasIdentifier(); // HealthchecksComponentsSchemasIdentifier | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    HealthchecksComponentsSchemasSingleResponse result = apiInstance.healthChecksPatchHealthCheck(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthChecksApi#healthChecksPatchHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPIQueryHealthcheck**](CloudflareClientAPIQueryHealthcheck.md)|  |
 **identifier** | [**HealthchecksComponentsSchemasIdentifier**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**HealthchecksComponentsSchemasSingleResponse**](HealthchecksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="healthChecksUpdateHealthCheck"></a>
# **healthChecksUpdateHealthCheck**
> HealthchecksComponentsSchemasSingleResponse healthChecksUpdateHealthCheck(body, identifier, zoneIdentifier)

Update Health Check

Update a configured health check.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HealthChecksApi;

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


HealthChecksApi apiInstance = new HealthChecksApi();
CloudflareClientAPIQueryHealthcheck body = new CloudflareClientAPIQueryHealthcheck(); // CloudflareClientAPIQueryHealthcheck | 
HealthchecksComponentsSchemasIdentifier identifier = new HealthchecksComponentsSchemasIdentifier(); // HealthchecksComponentsSchemasIdentifier | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    HealthchecksComponentsSchemasSingleResponse result = apiInstance.healthChecksUpdateHealthCheck(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthChecksApi#healthChecksUpdateHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPIQueryHealthcheck**](CloudflareClientAPIQueryHealthcheck.md)|  |
 **identifier** | [**HealthchecksComponentsSchemasIdentifier**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**HealthchecksComponentsSchemasSingleResponse**](HealthchecksComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

