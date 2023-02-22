# CustomPagesForAnAccountApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customPagesForAnAccountGetACustomPage**](CustomPagesForAnAccountApi.md#customPagesForAnAccountGetACustomPage) | **GET** /accounts/{account_identifier}/custom_pages/{identifier} | Get a custom page
[**customPagesForAnAccountListCustomPages**](CustomPagesForAnAccountApi.md#customPagesForAnAccountListCustomPages) | **GET** /accounts/{account_identifier}/custom_pages | List custom pages
[**customPagesForAnAccountUpdateACustomPage**](CustomPagesForAnAccountApi.md#customPagesForAnAccountUpdateACustomPage) | **PUT** /accounts/{account_identifier}/custom_pages/{identifier} | Update a custom page

<a name="customPagesForAnAccountGetACustomPage"></a>
# **customPagesForAnAccountGetACustomPage**
> CustomPagesResponseSingle customPagesForAnAccountGetACustomPage(identifier, accountIdentifier)

Get a custom page

Fetches the details of a custom page.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomPagesForAnAccountApi;

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


CustomPagesForAnAccountApi apiInstance = new CustomPagesForAnAccountApi();
CustomPagesComponentsSchemasIdentifier2 identifier = new CustomPagesComponentsSchemasIdentifier2(); // CustomPagesComponentsSchemasIdentifier2 | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CustomPagesResponseSingle result = apiInstance.customPagesForAnAccountGetACustomPage(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomPagesForAnAccountApi#customPagesForAnAccountGetACustomPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CustomPagesComponentsSchemasIdentifier2**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CustomPagesResponseSingle**](CustomPagesResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customPagesForAnAccountListCustomPages"></a>
# **customPagesForAnAccountListCustomPages**
> CustomPagesResponseCollection customPagesForAnAccountListCustomPages(accountIdentifier)

List custom pages

Fetches all the custom pages at the account level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomPagesForAnAccountApi;

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


CustomPagesForAnAccountApi apiInstance = new CustomPagesForAnAccountApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CustomPagesResponseCollection result = apiInstance.customPagesForAnAccountListCustomPages(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomPagesForAnAccountApi#customPagesForAnAccountListCustomPages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CustomPagesResponseCollection**](CustomPagesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customPagesForAnAccountUpdateACustomPage"></a>
# **customPagesForAnAccountUpdateACustomPage**
> CustomPagesResponseSingle customPagesForAnAccountUpdateACustomPage(body, identifier, accountIdentifier)

Update a custom page

Updates the configuration of an existing custom page.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomPagesForAnAccountApi;

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


CustomPagesForAnAccountApi apiInstance = new CustomPagesForAnAccountApi();
CustomPagesIdentifierBody body = new CustomPagesIdentifierBody(); // CustomPagesIdentifierBody | 
CustomPagesComponentsSchemasIdentifier2 identifier = new CustomPagesComponentsSchemasIdentifier2(); // CustomPagesComponentsSchemasIdentifier2 | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CustomPagesResponseSingle result = apiInstance.customPagesForAnAccountUpdateACustomPage(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomPagesForAnAccountApi#customPagesForAnAccountUpdateACustomPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomPagesIdentifierBody**](CustomPagesIdentifierBody.md)|  |
 **identifier** | [**CustomPagesComponentsSchemasIdentifier2**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CustomPagesResponseSingle**](CustomPagesResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

