# MagicNetworkMonitoringRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**magicNetworkMonitoringRulesCreateRules**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesCreateRules) | **POST** /accounts/{account_identifier}/mnm/rules | Create rules
[**magicNetworkMonitoringRulesDeleteRule**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesDeleteRule) | **DELETE** /accounts/{account_identifier}/mnm/rules/{rule_identifier} | Delete rule
[**magicNetworkMonitoringRulesGetRule**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesGetRule) | **GET** /accounts/{account_identifier}/mnm/rules/{rule_identifier} | Get rule
[**magicNetworkMonitoringRulesListRules**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesListRules) | **GET** /accounts/{account_identifier}/mnm/rules | List rules
[**magicNetworkMonitoringRulesUpdateAdvertisementForRule**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesUpdateAdvertisementForRule) | **PATCH** /accounts/{account_identifier}/mnm/rules/{rule_identifier}/advertisement | Update advertisement for rule
[**magicNetworkMonitoringRulesUpdateRule**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesUpdateRule) | **PATCH** /accounts/{account_identifier}/mnm/rules/{rule_identifier} | Update rule
[**magicNetworkMonitoringRulesUpdateRules**](MagicNetworkMonitoringRulesApi.md#magicNetworkMonitoringRulesUpdateRules) | **PUT** /accounts/{account_identifier}/mnm/rules | Update rules

<a name="magicNetworkMonitoringRulesCreateRules"></a>
# **magicNetworkMonitoringRulesCreateRules**
> MnmRulesSingleResponse magicNetworkMonitoringRulesCreateRules(accountIdentifier)

Create rules

Create network monitoring rules for account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringRulesApi;

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


MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi();
RulesComponentsSchemasAccountIdentifier accountIdentifier = new RulesComponentsSchemasAccountIdentifier(); // RulesComponentsSchemasAccountIdentifier | 
try {
    MnmRulesSingleResponse result = apiInstance.magicNetworkMonitoringRulesCreateRules(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesCreateRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**RulesComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmRulesSingleResponse**](MnmRulesSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicNetworkMonitoringRulesDeleteRule"></a>
# **magicNetworkMonitoringRulesDeleteRule**
> MnmRulesSingleResponse magicNetworkMonitoringRulesDeleteRule(ruleIdentifier, accountIdentifier)

Delete rule

Delete a network monitoring rule for account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringRulesApi;

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


MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi();
SchemasRuleIdentifier ruleIdentifier = new SchemasRuleIdentifier(); // SchemasRuleIdentifier | 
RulesComponentsSchemasAccountIdentifier accountIdentifier = new RulesComponentsSchemasAccountIdentifier(); // RulesComponentsSchemasAccountIdentifier | 
try {
    MnmRulesSingleResponse result = apiInstance.magicNetworkMonitoringRulesDeleteRule(ruleIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesDeleteRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleIdentifier** | [**SchemasRuleIdentifier**](.md)|  |
 **accountIdentifier** | [**RulesComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmRulesSingleResponse**](MnmRulesSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicNetworkMonitoringRulesGetRule"></a>
# **magicNetworkMonitoringRulesGetRule**
> MnmRulesSingleResponse magicNetworkMonitoringRulesGetRule(ruleIdentifier, accountIdentifier)

Get rule

List a single network monitoring rule for account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringRulesApi;

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


MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi();
SchemasRuleIdentifier ruleIdentifier = new SchemasRuleIdentifier(); // SchemasRuleIdentifier | 
RulesComponentsSchemasAccountIdentifier accountIdentifier = new RulesComponentsSchemasAccountIdentifier(); // RulesComponentsSchemasAccountIdentifier | 
try {
    MnmRulesSingleResponse result = apiInstance.magicNetworkMonitoringRulesGetRule(ruleIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesGetRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleIdentifier** | [**SchemasRuleIdentifier**](.md)|  |
 **accountIdentifier** | [**RulesComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmRulesSingleResponse**](MnmRulesSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicNetworkMonitoringRulesListRules"></a>
# **magicNetworkMonitoringRulesListRules**
> MnmRulesCollectionResponse magicNetworkMonitoringRulesListRules(accountIdentifier)

List rules

Lists network monitoring rules for account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringRulesApi;

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


MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi();
RulesComponentsSchemasAccountIdentifier accountIdentifier = new RulesComponentsSchemasAccountIdentifier(); // RulesComponentsSchemasAccountIdentifier | 
try {
    MnmRulesCollectionResponse result = apiInstance.magicNetworkMonitoringRulesListRules(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesListRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**RulesComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmRulesCollectionResponse**](MnmRulesCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicNetworkMonitoringRulesUpdateAdvertisementForRule"></a>
# **magicNetworkMonitoringRulesUpdateAdvertisementForRule**
> MnmRuleAdvertisementSingleResponse magicNetworkMonitoringRulesUpdateAdvertisementForRule(ruleIdentifier, accountIdentifier)

Update advertisement for rule

Update advertisement for rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringRulesApi;

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


MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi();
SchemasRuleIdentifier ruleIdentifier = new SchemasRuleIdentifier(); // SchemasRuleIdentifier | 
RulesComponentsSchemasAccountIdentifier accountIdentifier = new RulesComponentsSchemasAccountIdentifier(); // RulesComponentsSchemasAccountIdentifier | 
try {
    MnmRuleAdvertisementSingleResponse result = apiInstance.magicNetworkMonitoringRulesUpdateAdvertisementForRule(ruleIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesUpdateAdvertisementForRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleIdentifier** | [**SchemasRuleIdentifier**](.md)|  |
 **accountIdentifier** | [**RulesComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmRuleAdvertisementSingleResponse**](MnmRuleAdvertisementSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicNetworkMonitoringRulesUpdateRule"></a>
# **magicNetworkMonitoringRulesUpdateRule**
> MnmRulesSingleResponse magicNetworkMonitoringRulesUpdateRule(ruleIdentifier, accountIdentifier)

Update rule

Update a network monitoring rule for account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringRulesApi;

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


MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi();
SchemasRuleIdentifier ruleIdentifier = new SchemasRuleIdentifier(); // SchemasRuleIdentifier | 
RulesComponentsSchemasAccountIdentifier accountIdentifier = new RulesComponentsSchemasAccountIdentifier(); // RulesComponentsSchemasAccountIdentifier | 
try {
    MnmRulesSingleResponse result = apiInstance.magicNetworkMonitoringRulesUpdateRule(ruleIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesUpdateRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleIdentifier** | [**SchemasRuleIdentifier**](.md)|  |
 **accountIdentifier** | [**RulesComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmRulesSingleResponse**](MnmRulesSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicNetworkMonitoringRulesUpdateRules"></a>
# **magicNetworkMonitoringRulesUpdateRules**
> MnmRulesSingleResponse magicNetworkMonitoringRulesUpdateRules(accountIdentifier)

Update rules

Update network monitoring rules for account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringRulesApi;

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


MagicNetworkMonitoringRulesApi apiInstance = new MagicNetworkMonitoringRulesApi();
RulesComponentsSchemasAccountIdentifier accountIdentifier = new RulesComponentsSchemasAccountIdentifier(); // RulesComponentsSchemasAccountIdentifier | 
try {
    MnmRulesSingleResponse result = apiInstance.magicNetworkMonitoringRulesUpdateRules(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringRulesApi#magicNetworkMonitoringRulesUpdateRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**RulesComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmRulesSingleResponse**](MnmRulesSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

