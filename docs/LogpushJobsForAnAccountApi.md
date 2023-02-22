# LogpushJobsForAnAccountApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccountsAccountIdentifierLogpushJobsJobIdentifier**](LogpushJobsForAnAccountApi.md#deleteAccountsAccountIdentifierLogpushJobsJobIdentifier) | **DELETE** /accounts/{account_identifier}/logpush/jobs/{job_identifier} | Delete Logpush job
[**deleteAccountsAccountIdentifierLogpushValidateDestinationExists**](LogpushJobsForAnAccountApi.md#deleteAccountsAccountIdentifierLogpushValidateDestinationExists) | **POST** /accounts/{account_identifier}/logpush/validate/destination/exists | Check destination exists
[**getAccountsAccountIdentifierLogpushDatasetsDatasetFields**](LogpushJobsForAnAccountApi.md#getAccountsAccountIdentifierLogpushDatasetsDatasetFields) | **GET** /accounts/{account_identifier}/logpush/datasets/{dataset}/fields | List fields
[**getAccountsAccountIdentifierLogpushDatasetsDatasetJobs**](LogpushJobsForAnAccountApi.md#getAccountsAccountIdentifierLogpushDatasetsDatasetJobs) | **GET** /accounts/{account_identifier}/logpush/datasets/{dataset}/jobs | List Logpush jobs for a dataset
[**getAccountsAccountIdentifierLogpushJobs**](LogpushJobsForAnAccountApi.md#getAccountsAccountIdentifierLogpushJobs) | **GET** /accounts/{account_identifier}/logpush/jobs | List Logpush jobs
[**getAccountsAccountIdentifierLogpushJobsJobIdentifier**](LogpushJobsForAnAccountApi.md#getAccountsAccountIdentifierLogpushJobsJobIdentifier) | **GET** /accounts/{account_identifier}/logpush/jobs/{job_identifier} | Get Logpush job details
[**postAccountsAccountIdentifierLogpushJobs**](LogpushJobsForAnAccountApi.md#postAccountsAccountIdentifierLogpushJobs) | **POST** /accounts/{account_identifier}/logpush/jobs | Create Logpush job
[**postAccountsAccountIdentifierLogpushOwnership**](LogpushJobsForAnAccountApi.md#postAccountsAccountIdentifierLogpushOwnership) | **POST** /accounts/{account_identifier}/logpush/ownership | Get ownership challenge
[**postAccountsAccountIdentifierLogpushOwnershipValidate**](LogpushJobsForAnAccountApi.md#postAccountsAccountIdentifierLogpushOwnershipValidate) | **POST** /accounts/{account_identifier}/logpush/ownership/validate | Validate ownership challenge
[**postAccountsAccountIdentifierLogpushValidateOrigin**](LogpushJobsForAnAccountApi.md#postAccountsAccountIdentifierLogpushValidateOrigin) | **POST** /accounts/{account_identifier}/logpush/validate/origin | Validate origin
[**putAccountsAccountIdentifierLogpushJobsJobIdentifier**](LogpushJobsForAnAccountApi.md#putAccountsAccountIdentifierLogpushJobsJobIdentifier) | **PUT** /accounts/{account_identifier}/logpush/jobs/{job_identifier} | Update Logpush job

<a name="deleteAccountsAccountIdentifierLogpushJobsJobIdentifier"></a>
# **deleteAccountsAccountIdentifierLogpushJobsJobIdentifier**
> InlineResponse2004 deleteAccountsAccountIdentifierLogpushJobsJobIdentifier(jobIdentifier, accountIdentifier)

Delete Logpush job

Deletes a Logpush job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAnAccountApi;

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


LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi();
String jobIdentifier = "jobIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse2004 result = apiInstance.deleteAccountsAccountIdentifierLogpushJobsJobIdentifier(jobIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAnAccountApi#deleteAccountsAccountIdentifierLogpushJobsJobIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountsAccountIdentifierLogpushValidateDestinationExists"></a>
# **deleteAccountsAccountIdentifierLogpushValidateDestinationExists**
> DestinationExistsResponse deleteAccountsAccountIdentifierLogpushValidateDestinationExists(body, accountIdentifier)

Check destination exists

Checks if there is an existing job with a destination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAnAccountApi;

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


LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi();
DestinationExistsBody body = new DestinationExistsBody(); // DestinationExistsBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DestinationExistsResponse result = apiInstance.deleteAccountsAccountIdentifierLogpushValidateDestinationExists(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAnAccountApi#deleteAccountsAccountIdentifierLogpushValidateDestinationExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DestinationExistsBody**](DestinationExistsBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DestinationExistsResponse**](DestinationExistsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountsAccountIdentifierLogpushDatasetsDatasetFields"></a>
# **getAccountsAccountIdentifierLogpushDatasetsDatasetFields**
> LogpushFieldResponseCollection getAccountsAccountIdentifierLogpushDatasetsDatasetFields(dataset, accountIdentifier)

List fields

Lists all fields available for a dataset. The response result is an object with key-value pairs, where keys are field names, and values are descriptions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAnAccountApi;

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


LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi();
String dataset = "dataset_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LogpushFieldResponseCollection result = apiInstance.getAccountsAccountIdentifierLogpushDatasetsDatasetFields(dataset, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAnAccountApi#getAccountsAccountIdentifierLogpushDatasetsDatasetFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LogpushFieldResponseCollection**](LogpushFieldResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountsAccountIdentifierLogpushDatasetsDatasetJobs"></a>
# **getAccountsAccountIdentifierLogpushDatasetsDatasetJobs**
> LogpushJobResponseCollection getAccountsAccountIdentifierLogpushDatasetsDatasetJobs(dataset, accountIdentifier)

List Logpush jobs for a dataset

Lists Logpush jobs for an account for a dataset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAnAccountApi;

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


LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi();
String dataset = "dataset_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LogpushJobResponseCollection result = apiInstance.getAccountsAccountIdentifierLogpushDatasetsDatasetJobs(dataset, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAnAccountApi#getAccountsAccountIdentifierLogpushDatasetsDatasetJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LogpushJobResponseCollection**](LogpushJobResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountsAccountIdentifierLogpushJobs"></a>
# **getAccountsAccountIdentifierLogpushJobs**
> LogpushJobResponseCollection getAccountsAccountIdentifierLogpushJobs(accountIdentifier)

List Logpush jobs

Lists Logpush jobs for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAnAccountApi;

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


LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LogpushJobResponseCollection result = apiInstance.getAccountsAccountIdentifierLogpushJobs(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAnAccountApi#getAccountsAccountIdentifierLogpushJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LogpushJobResponseCollection**](LogpushJobResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountsAccountIdentifierLogpushJobsJobIdentifier"></a>
# **getAccountsAccountIdentifierLogpushJobsJobIdentifier**
> LogpushJobResponseSingle getAccountsAccountIdentifierLogpushJobsJobIdentifier(jobIdentifier, accountIdentifier)

Get Logpush job details

Gets the details of a Logpush job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAnAccountApi;

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


LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi();
String jobIdentifier = "jobIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LogpushJobResponseSingle result = apiInstance.getAccountsAccountIdentifierLogpushJobsJobIdentifier(jobIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAnAccountApi#getAccountsAccountIdentifierLogpushJobsJobIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LogpushJobResponseSingle**](LogpushJobResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postAccountsAccountIdentifierLogpushJobs"></a>
# **postAccountsAccountIdentifierLogpushJobs**
> LogpushJobResponseSingle postAccountsAccountIdentifierLogpushJobs(body, accountIdentifier)

Create Logpush job

Creates a new Logpush job for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAnAccountApi;

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


LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi();
LogpushJobsBody body = new LogpushJobsBody(); // LogpushJobsBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LogpushJobResponseSingle result = apiInstance.postAccountsAccountIdentifierLogpushJobs(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAnAccountApi#postAccountsAccountIdentifierLogpushJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogpushJobsBody**](LogpushJobsBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LogpushJobResponseSingle**](LogpushJobResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountsAccountIdentifierLogpushOwnership"></a>
# **postAccountsAccountIdentifierLogpushOwnership**
> GetOwnershipResponse postAccountsAccountIdentifierLogpushOwnership(body, accountIdentifier)

Get ownership challenge

Gets a new ownership challenge sent to your destination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAnAccountApi;

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


LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi();
LogpushOwnershipBody body = new LogpushOwnershipBody(); // LogpushOwnershipBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    GetOwnershipResponse result = apiInstance.postAccountsAccountIdentifierLogpushOwnership(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAnAccountApi#postAccountsAccountIdentifierLogpushOwnership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogpushOwnershipBody**](LogpushOwnershipBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**GetOwnershipResponse**](GetOwnershipResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountsAccountIdentifierLogpushOwnershipValidate"></a>
# **postAccountsAccountIdentifierLogpushOwnershipValidate**
> ValidateOwnershipResponse postAccountsAccountIdentifierLogpushOwnershipValidate(body, accountIdentifier)

Validate ownership challenge

Validates ownership challenge of the destination.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAnAccountApi;

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


LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi();
OwnershipValidateBody body = new OwnershipValidateBody(); // OwnershipValidateBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ValidateOwnershipResponse result = apiInstance.postAccountsAccountIdentifierLogpushOwnershipValidate(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAnAccountApi#postAccountsAccountIdentifierLogpushOwnershipValidate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OwnershipValidateBody**](OwnershipValidateBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ValidateOwnershipResponse**](ValidateOwnershipResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postAccountsAccountIdentifierLogpushValidateOrigin"></a>
# **postAccountsAccountIdentifierLogpushValidateOrigin**
> ValidateResponse postAccountsAccountIdentifierLogpushValidateOrigin(body, accountIdentifier)

Validate origin

Validates logpull origin with logpull_options.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAnAccountApi;

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


LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi();
ValidateOriginBody body = new ValidateOriginBody(); // ValidateOriginBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ValidateResponse result = apiInstance.postAccountsAccountIdentifierLogpushValidateOrigin(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAnAccountApi#postAccountsAccountIdentifierLogpushValidateOrigin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ValidateOriginBody**](ValidateOriginBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ValidateResponse**](ValidateResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putAccountsAccountIdentifierLogpushJobsJobIdentifier"></a>
# **putAccountsAccountIdentifierLogpushJobsJobIdentifier**
> LogpushJobResponseSingle putAccountsAccountIdentifierLogpushJobsJobIdentifier(body, jobIdentifier, accountIdentifier)

Update Logpush job

Updates a Logpush job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogpushJobsForAnAccountApi;

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


LogpushJobsForAnAccountApi apiInstance = new LogpushJobsForAnAccountApi();
JobsJobIdentifierBody body = new JobsJobIdentifierBody(); // JobsJobIdentifierBody | 
String jobIdentifier = "jobIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LogpushJobResponseSingle result = apiInstance.putAccountsAccountIdentifierLogpushJobsJobIdentifier(body, jobIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogpushJobsForAnAccountApi#putAccountsAccountIdentifierLogpushJobsJobIdentifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobsJobIdentifierBody**](JobsJobIdentifierBody.md)|  |
 **jobIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LogpushJobResponseSingle**](LogpushJobResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

