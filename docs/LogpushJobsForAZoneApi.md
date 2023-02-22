# LogpushJobsForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteZonesZoneIdentifierLogpushJobsJobIdentifier**](LogpushJobsForAZoneApi.md#deleteZonesZoneIdentifierLogpushJobsJobIdentifier) | **DELETE** /zones/{zone_identifier}/logpush/jobs/{job_identifier} | Delete Logpush job
[**getZonesZoneIdentifierLogpushDatasetsDatasetFields**](LogpushJobsForAZoneApi.md#getZonesZoneIdentifierLogpushDatasetsDatasetFields) | **GET** /zones/{zone_identifier}/logpush/datasets/{dataset}/fields | List fields
[**getZonesZoneIdentifierLogpushDatasetsDatasetJobs**](LogpushJobsForAZoneApi.md#getZonesZoneIdentifierLogpushDatasetsDatasetJobs) | **GET** /zones/{zone_identifier}/logpush/datasets/{dataset}/jobs | List Logpush jobs for a dataset
[**getZonesZoneIdentifierLogpushJobs**](LogpushJobsForAZoneApi.md#getZonesZoneIdentifierLogpushJobs) | **GET** /zones/{zone_identifier}/logpush/jobs | List Logpush jobs
[**getZonesZoneIdentifierLogpushJobsJobIdentifier**](LogpushJobsForAZoneApi.md#getZonesZoneIdentifierLogpushJobsJobIdentifier) | **GET** /zones/{zone_identifier}/logpush/jobs/{job_identifier} | Get Logpush job details
[**postZonesZoneIdentifierLogpushJobs**](LogpushJobsForAZoneApi.md#postZonesZoneIdentifierLogpushJobs) | **POST** /zones/{zone_identifier}/logpush/jobs | Create Logpush job
[**postZonesZoneIdentifierLogpushOwnership**](LogpushJobsForAZoneApi.md#postZonesZoneIdentifierLogpushOwnership) | **POST** /zones/{zone_identifier}/logpush/ownership | Get ownership challenge
[**postZonesZoneIdentifierLogpushOwnershipValidate**](LogpushJobsForAZoneApi.md#postZonesZoneIdentifierLogpushOwnershipValidate) | **POST** /zones/{zone_identifier}/logpush/ownership/validate | Validate ownership challenge
[**postZonesZoneIdentifierLogpushValidateDestinationExists**](LogpushJobsForAZoneApi.md#postZonesZoneIdentifierLogpushValidateDestinationExists) | **POST** /zones/{zone_identifier}/logpush/validate/destination/exists | Check destination exists
[**postZonesZoneIdentifierLogpushValidateOrigin**](LogpushJobsForAZoneApi.md#postZonesZoneIdentifierLogpushValidateOrigin) | **POST** /zones/{zone_identifier}/logpush/validate/origin | Validate origin
[**putZonesZoneIdentifierLogpushJobsJobIdentifier**](LogpushJobsForAZoneApi.md#putZonesZoneIdentifierLogpushJobsJobIdentifier) | **PUT** /zones/{zone_identifier}/logpush/jobs/{job_identifier} | Update Logpush job

<a name="deleteZonesZoneIdentifierLogpushJobsJobIdentifier"></a>
# **deleteZonesZoneIdentifierLogpushJobsJobIdentifier**
> InlineResponse2004 deleteZonesZoneIdentifierLogpushJobsJobIdentifier(jobIdentifier, zoneIdentifier)

Delete Logpush job

Deletes a Logpush job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAZoneApi;

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


LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi();
String jobIdentifier = "jobIdentifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse2004 result = apiInstance.deleteZonesZoneIdentifierLogpushJobsJobIdentifier(jobIdentifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAZoneApi#deleteZonesZoneIdentifierLogpushJobsJobIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobIdentifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getZonesZoneIdentifierLogpushDatasetsDatasetFields"></a>
# **getZonesZoneIdentifierLogpushDatasetsDatasetFields**
> LogpushFieldResponseCollection getZonesZoneIdentifierLogpushDatasetsDatasetFields(dataset, zoneIdentifier)

List fields

Lists all fields available for a dataset. The response result is an object with key-value pairs, where keys are field names, and values are descriptions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAZoneApi;

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


LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi();
String dataset = "dataset_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    LogpushFieldResponseCollection result = apiInstance.getZonesZoneIdentifierLogpushDatasetsDatasetFields(dataset, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAZoneApi#getZonesZoneIdentifierLogpushDatasetsDatasetFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**LogpushFieldResponseCollection**](LogpushFieldResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getZonesZoneIdentifierLogpushDatasetsDatasetJobs"></a>
# **getZonesZoneIdentifierLogpushDatasetsDatasetJobs**
> LogpushJobResponseCollection getZonesZoneIdentifierLogpushDatasetsDatasetJobs(dataset, zoneIdentifier)

List Logpush jobs for a dataset

Lists Logpush jobs for a zone for a dataset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAZoneApi;

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


LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi();
String dataset = "dataset_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    LogpushJobResponseCollection result = apiInstance.getZonesZoneIdentifierLogpushDatasetsDatasetJobs(dataset, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAZoneApi#getZonesZoneIdentifierLogpushDatasetsDatasetJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**LogpushJobResponseCollection**](LogpushJobResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getZonesZoneIdentifierLogpushJobs"></a>
# **getZonesZoneIdentifierLogpushJobs**
> LogpushJobResponseCollection getZonesZoneIdentifierLogpushJobs(zoneIdentifier)

List Logpush jobs

Lists Logpush jobs for a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAZoneApi;

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


LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    LogpushJobResponseCollection result = apiInstance.getZonesZoneIdentifierLogpushJobs(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAZoneApi#getZonesZoneIdentifierLogpushJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**LogpushJobResponseCollection**](LogpushJobResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getZonesZoneIdentifierLogpushJobsJobIdentifier"></a>
# **getZonesZoneIdentifierLogpushJobsJobIdentifier**
> LogpushJobResponseSingle getZonesZoneIdentifierLogpushJobsJobIdentifier(jobIdentifier, zoneIdentifier)

Get Logpush job details

Gets the details of a Logpush job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAZoneApi;

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


LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi();
String jobIdentifier = "jobIdentifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    LogpushJobResponseSingle result = apiInstance.getZonesZoneIdentifierLogpushJobsJobIdentifier(jobIdentifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAZoneApi#getZonesZoneIdentifierLogpushJobsJobIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobIdentifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**LogpushJobResponseSingle**](LogpushJobResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postZonesZoneIdentifierLogpushJobs"></a>
# **postZonesZoneIdentifierLogpushJobs**
> LogpushJobResponseSingle postZonesZoneIdentifierLogpushJobs(body, zoneIdentifier)

Create Logpush job

Creates a new Logpush job for a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAZoneApi;

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


LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi();
LogpushJobsBody1 body = new LogpushJobsBody1(); // LogpushJobsBody1 | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    LogpushJobResponseSingle result = apiInstance.postZonesZoneIdentifierLogpushJobs(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAZoneApi#postZonesZoneIdentifierLogpushJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogpushJobsBody1**](LogpushJobsBody1.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**LogpushJobResponseSingle**](LogpushJobResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postZonesZoneIdentifierLogpushOwnership"></a>
# **postZonesZoneIdentifierLogpushOwnership**
> GetOwnershipResponse postZonesZoneIdentifierLogpushOwnership(body, zoneIdentifier)

Get ownership challenge

Gets a new ownership challenge sent to your destination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAZoneApi;

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


LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi();
LogpushOwnershipBody1 body = new LogpushOwnershipBody1(); // LogpushOwnershipBody1 | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    GetOwnershipResponse result = apiInstance.postZonesZoneIdentifierLogpushOwnership(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAZoneApi#postZonesZoneIdentifierLogpushOwnership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogpushOwnershipBody1**](LogpushOwnershipBody1.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**GetOwnershipResponse**](GetOwnershipResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postZonesZoneIdentifierLogpushOwnershipValidate"></a>
# **postZonesZoneIdentifierLogpushOwnershipValidate**
> ValidateOwnershipResponse postZonesZoneIdentifierLogpushOwnershipValidate(body, zoneIdentifier)

Validate ownership challenge

Validates ownership challenge of the destination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAZoneApi;

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


LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi();
OwnershipValidateBody1 body = new OwnershipValidateBody1(); // OwnershipValidateBody1 | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ValidateOwnershipResponse result = apiInstance.postZonesZoneIdentifierLogpushOwnershipValidate(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAZoneApi#postZonesZoneIdentifierLogpushOwnershipValidate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OwnershipValidateBody1**](OwnershipValidateBody1.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ValidateOwnershipResponse**](ValidateOwnershipResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postZonesZoneIdentifierLogpushValidateDestinationExists"></a>
# **postZonesZoneIdentifierLogpushValidateDestinationExists**
> DestinationExistsResponse postZonesZoneIdentifierLogpushValidateDestinationExists(body, zoneIdentifier)

Check destination exists

Checks if there is an existing job with a destination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAZoneApi;

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


LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi();
DestinationExistsBody1 body = new DestinationExistsBody1(); // DestinationExistsBody1 | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DestinationExistsResponse result = apiInstance.postZonesZoneIdentifierLogpushValidateDestinationExists(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAZoneApi#postZonesZoneIdentifierLogpushValidateDestinationExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DestinationExistsBody1**](DestinationExistsBody1.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DestinationExistsResponse**](DestinationExistsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postZonesZoneIdentifierLogpushValidateOrigin"></a>
# **postZonesZoneIdentifierLogpushValidateOrigin**
> ValidateResponse postZonesZoneIdentifierLogpushValidateOrigin(body, zoneIdentifier)

Validate origin

Validates logpull origin with logpull_options.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAZoneApi;

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


LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi();
ValidateOriginBody1 body = new ValidateOriginBody1(); // ValidateOriginBody1 | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ValidateResponse result = apiInstance.postZonesZoneIdentifierLogpushValidateOrigin(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAZoneApi#postZonesZoneIdentifierLogpushValidateOrigin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ValidateOriginBody1**](ValidateOriginBody1.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ValidateResponse**](ValidateResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putZonesZoneIdentifierLogpushJobsJobIdentifier"></a>
# **putZonesZoneIdentifierLogpushJobsJobIdentifier**
> LogpushJobResponseSingle putZonesZoneIdentifierLogpushJobsJobIdentifier(body, jobIdentifier, zoneIdentifier)

Update Logpush job

Updates a Logpush job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAZoneApi;

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


LogpushJobsForAZoneApi apiInstance = new LogpushJobsForAZoneApi();
JobsJobIdentifierBody1 body = new JobsJobIdentifierBody1(); // JobsJobIdentifierBody1 | 
String jobIdentifier = "jobIdentifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    LogpushJobResponseSingle result = apiInstance.putZonesZoneIdentifierLogpushJobsJobIdentifier(body, jobIdentifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAZoneApi#putZonesZoneIdentifierLogpushJobsJobIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobsJobIdentifierBody1**](JobsJobIdentifierBody1.md)|  |
 **jobIdentifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**LogpushJobResponseSingle**](LogpushJobResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

