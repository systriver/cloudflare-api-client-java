# StreamLiveInputsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streamLiveInputsCreateALiveInput**](StreamLiveInputsApi.md#streamLiveInputsCreateALiveInput) | **POST** /accounts/{account_identifier}/stream/live_inputs | Create a live input
[**streamLiveInputsCreateANewOutputConnectedToALiveInput**](StreamLiveInputsApi.md#streamLiveInputsCreateANewOutputConnectedToALiveInput) | **POST** /accounts/{account_identifier}/stream/live_inputs/{live_input_identifier}/outputs | Create a new output, connected to a live input
[**streamLiveInputsDeleteALiveInput**](StreamLiveInputsApi.md#streamLiveInputsDeleteALiveInput) | **DELETE** /accounts/{account_identifier}/stream/live_inputs/{live_input_identifier} | Delete a live input
[**streamLiveInputsDeleteAnOutput**](StreamLiveInputsApi.md#streamLiveInputsDeleteAnOutput) | **DELETE** /accounts/{account_identifier}/stream/live_inputs/{live_input_identifier}/outputs/{output_identifier} | Delete an output
[**streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput**](StreamLiveInputsApi.md#streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput) | **GET** /accounts/{account_identifier}/stream/live_inputs/{live_input_identifier}/outputs | List all outputs associated with a specified live input
[**streamLiveInputsListLiveInputs**](StreamLiveInputsApi.md#streamLiveInputsListLiveInputs) | **GET** /accounts/{account_identifier}/stream/live_inputs | List live inputs
[**streamLiveInputsRetrieveALiveInput**](StreamLiveInputsApi.md#streamLiveInputsRetrieveALiveInput) | **GET** /accounts/{account_identifier}/stream/live_inputs/{live_input_identifier} | Retrieve a live input
[**streamLiveInputsUpdateALiveInput**](StreamLiveInputsApi.md#streamLiveInputsUpdateALiveInput) | **PUT** /accounts/{account_identifier}/stream/live_inputs/{live_input_identifier} | Update a live input
[**streamLiveInputsUpdateAnOutput**](StreamLiveInputsApi.md#streamLiveInputsUpdateAnOutput) | **PUT** /accounts/{account_identifier}/stream/live_inputs/{live_input_identifier}/outputs/{output_identifier} | Update an output

<a name="streamLiveInputsCreateALiveInput"></a>
# **streamLiveInputsCreateALiveInput**
> LiveInputResponseSingle streamLiveInputsCreateALiveInput(body, accountIdentifier)

Create a live input

Creates a live input, and returns credentials that you or your users can use to stream live video to Cloudflare Stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamLiveInputsApi;

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


StreamLiveInputsApi apiInstance = new StreamLiveInputsApi();
CreateInputRequest body = new CreateInputRequest(); // CreateInputRequest | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LiveInputResponseSingle result = apiInstance.streamLiveInputsCreateALiveInput(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsCreateALiveInput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateInputRequest**](CreateInputRequest.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LiveInputResponseSingle**](LiveInputResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamLiveInputsCreateANewOutputConnectedToALiveInput"></a>
# **streamLiveInputsCreateANewOutputConnectedToALiveInput**
> OutputResponseSingle streamLiveInputsCreateANewOutputConnectedToALiveInput(body, liveInputIdentifier, accountIdentifier)

Create a new output, connected to a live input

Creates a new output that can be used to simulcast or restream live video to other RTMP or SRT destinations. Outputs are always linked to a specific live input — one live input can have many outputs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamLiveInputsApi;

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


StreamLiveInputsApi apiInstance = new StreamLiveInputsApi();
CreateOutputRequest body = new CreateOutputRequest(); // CreateOutputRequest | 
String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    OutputResponseSingle result = apiInstance.streamLiveInputsCreateANewOutputConnectedToALiveInput(body, liveInputIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsCreateANewOutputConnectedToALiveInput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateOutputRequest**](CreateOutputRequest.md)|  |
 **liveInputIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**OutputResponseSingle**](OutputResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamLiveInputsDeleteALiveInput"></a>
# **streamLiveInputsDeleteALiveInput**
> streamLiveInputsDeleteALiveInput(liveInputIdentifier, accountIdentifier)

Delete a live input

Prevents a live input from being streamed to and makes the live input inaccessible to any future API calls.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamLiveInputsApi;

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


StreamLiveInputsApi apiInstance = new StreamLiveInputsApi();
String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    apiInstance.streamLiveInputsDeleteALiveInput(liveInputIdentifier, accountIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsDeleteALiveInput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveInputIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamLiveInputsDeleteAnOutput"></a>
# **streamLiveInputsDeleteAnOutput**
> streamLiveInputsDeleteAnOutput(outputIdentifier, liveInputIdentifier, accountIdentifier)

Delete an output

Deletes an output and removes it from the associated live input.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamLiveInputsApi;

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


StreamLiveInputsApi apiInstance = new StreamLiveInputsApi();
String outputIdentifier = "outputIdentifier_example"; // String | 
String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    apiInstance.streamLiveInputsDeleteAnOutput(outputIdentifier, liveInputIdentifier, accountIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsDeleteAnOutput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outputIdentifier** | [**String**](.md)|  |
 **liveInputIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput"></a>
# **streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput**
> OutputResponseCollection streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput(liveInputIdentifier, accountIdentifier)

List all outputs associated with a specified live input

Retrieves all outputs associated with a specified live input.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamLiveInputsApi;

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


StreamLiveInputsApi apiInstance = new StreamLiveInputsApi();
String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    OutputResponseCollection result = apiInstance.streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput(liveInputIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsListAllOutputsAssociatedWithASpecifiedLiveInput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveInputIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**OutputResponseCollection**](OutputResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="streamLiveInputsListLiveInputs"></a>
# **streamLiveInputsListLiveInputs**
> LiveInputResponseCollection streamLiveInputsListLiveInputs(accountIdentifier)

List live inputs

Lists the live inputs created for an account. To get the credentials needed to stream to a specific live input, request a single live input.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamLiveInputsApi;

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


StreamLiveInputsApi apiInstance = new StreamLiveInputsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LiveInputResponseCollection result = apiInstance.streamLiveInputsListLiveInputs(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsListLiveInputs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LiveInputResponseCollection**](LiveInputResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="streamLiveInputsRetrieveALiveInput"></a>
# **streamLiveInputsRetrieveALiveInput**
> LiveInputResponseSingle streamLiveInputsRetrieveALiveInput(liveInputIdentifier, accountIdentifier)

Retrieve a live input

Retrieves details of an existing live input.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamLiveInputsApi;

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


StreamLiveInputsApi apiInstance = new StreamLiveInputsApi();
String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LiveInputResponseSingle result = apiInstance.streamLiveInputsRetrieveALiveInput(liveInputIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsRetrieveALiveInput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveInputIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LiveInputResponseSingle**](LiveInputResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="streamLiveInputsUpdateALiveInput"></a>
# **streamLiveInputsUpdateALiveInput**
> LiveInputResponseSingle streamLiveInputsUpdateALiveInput(body, liveInputIdentifier, accountIdentifier)

Update a live input

Updates a specified live input.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamLiveInputsApi;

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


StreamLiveInputsApi apiInstance = new StreamLiveInputsApi();
UpdateInputRequest body = new UpdateInputRequest(); // UpdateInputRequest | 
String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LiveInputResponseSingle result = apiInstance.streamLiveInputsUpdateALiveInput(body, liveInputIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsUpdateALiveInput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateInputRequest**](UpdateInputRequest.md)|  |
 **liveInputIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LiveInputResponseSingle**](LiveInputResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamLiveInputsUpdateAnOutput"></a>
# **streamLiveInputsUpdateAnOutput**
> OutputResponseSingle streamLiveInputsUpdateAnOutput(body, outputIdentifier, liveInputIdentifier, accountIdentifier)

Update an output

Updates the state of an output.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamLiveInputsApi;

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


StreamLiveInputsApi apiInstance = new StreamLiveInputsApi();
UpdateOutputRequest body = new UpdateOutputRequest(); // UpdateOutputRequest | 
String outputIdentifier = "outputIdentifier_example"; // String | 
String liveInputIdentifier = "liveInputIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    OutputResponseSingle result = apiInstance.streamLiveInputsUpdateAnOutput(body, outputIdentifier, liveInputIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamLiveInputsApi#streamLiveInputsUpdateAnOutput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateOutputRequest**](UpdateOutputRequest.md)|  |
 **outputIdentifier** | [**String**](.md)|  |
 **liveInputIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**OutputResponseSingle**](OutputResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

