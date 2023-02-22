# AccountRulesetsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountRulesetsCreateAnAccountRuleset**](AccountRulesetsApi.md#accountRulesetsCreateAnAccountRuleset) | **POST** /accounts/{account_id}/rulesets | Create an account ruleset
[**accountRulesetsCreateAnAccountRulesetRule**](AccountRulesetsApi.md#accountRulesetsCreateAnAccountRulesetRule) | **POST** /accounts/{account_id}/rulesets/{ruleset_id}/rules | Create an account ruleset rule
[**accountRulesetsDeleteAnAccountRuleset**](AccountRulesetsApi.md#accountRulesetsDeleteAnAccountRuleset) | **DELETE** /accounts/{account_id}/rulesets/{ruleset_id} | Delete an account ruleset
[**accountRulesetsDeleteAnAccountRulesetRule**](AccountRulesetsApi.md#accountRulesetsDeleteAnAccountRulesetRule) | **DELETE** /accounts/{account_id}/rulesets/{ruleset_id}/rules/{rule_id} | Delete an account ruleset rule
[**accountRulesetsDeleteAnAccountRulesetVersion**](AccountRulesetsApi.md#accountRulesetsDeleteAnAccountRulesetVersion) | **DELETE** /accounts/{account_id}/rulesets/{ruleset_id}/versions/{ruleset_version} | Delete an account ruleset version
[**accountRulesetsGetAnAccountEntryPointRuleset**](AccountRulesetsApi.md#accountRulesetsGetAnAccountEntryPointRuleset) | **GET** /accounts/{account_id}/rulesets/phases/{ruleset_phase}/entrypoint | Get an account entry point ruleset
[**accountRulesetsGetAnAccountEntryPointRulesetVersion**](AccountRulesetsApi.md#accountRulesetsGetAnAccountEntryPointRulesetVersion) | **GET** /accounts/{account_id}/rulesets/phases/{ruleset_phase}/entrypoint/versions/{ruleset_version} | Get an account entry point ruleset version
[**accountRulesetsGetAnAccountRuleset**](AccountRulesetsApi.md#accountRulesetsGetAnAccountRuleset) | **GET** /accounts/{account_id}/rulesets/{ruleset_id} | Get an account ruleset
[**accountRulesetsGetAnAccountRulesetVersion**](AccountRulesetsApi.md#accountRulesetsGetAnAccountRulesetVersion) | **GET** /accounts/{account_id}/rulesets/{ruleset_id}/versions/{ruleset_version} | Get an account ruleset version
[**accountRulesetsListAccountRulesets**](AccountRulesetsApi.md#accountRulesetsListAccountRulesets) | **GET** /accounts/{account_id}/rulesets | List account rulesets
[**accountRulesetsListAnAccountEntryPointRulesetSVersions**](AccountRulesetsApi.md#accountRulesetsListAnAccountEntryPointRulesetSVersions) | **GET** /accounts/{account_id}/rulesets/phases/{ruleset_phase}/entrypoint/versions | List an account entry point ruleset&#x27;s versions
[**accountRulesetsListAnAccountRulesetSVersions**](AccountRulesetsApi.md#accountRulesetsListAnAccountRulesetSVersions) | **GET** /accounts/{account_id}/rulesets/{ruleset_id}/versions | List an account ruleset&#x27;s versions
[**accountRulesetsListAnAccountRulesetVersionSRulesByTag**](AccountRulesetsApi.md#accountRulesetsListAnAccountRulesetVersionSRulesByTag) | **GET** /accounts/{account_id}/rulesets/{ruleset_id}/versions/{ruleset_version}/by_tag/{rule_tag} | List an account ruleset version&#x27;s rules by tag
[**accountRulesetsUpdateAnAccountEntryPointRuleset**](AccountRulesetsApi.md#accountRulesetsUpdateAnAccountEntryPointRuleset) | **PUT** /accounts/{account_id}/rulesets/phases/{ruleset_phase}/entrypoint | Update an account entry point ruleset
[**accountRulesetsUpdateAnAccountRuleset**](AccountRulesetsApi.md#accountRulesetsUpdateAnAccountRuleset) | **PUT** /accounts/{account_id}/rulesets/{ruleset_id} | Update an account ruleset
[**accountRulesetsUpdateAnAccountRulesetRule**](AccountRulesetsApi.md#accountRulesetsUpdateAnAccountRulesetRule) | **PATCH** /accounts/{account_id}/rulesets/{ruleset_id}/rules/{rule_id} | Update an account ruleset rule

<a name="accountRulesetsCreateAnAccountRuleset"></a>
# **accountRulesetsCreateAnAccountRuleset**
> RulesetResponse accountRulesetsCreateAnAccountRuleset(body, accountId)

Create an account ruleset

Creates a ruleset at the account level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
CreateRuleset body = new CreateRuleset(); // CreateRuleset | 
String accountId = "accountId_example"; // String | 
try {
    RulesetResponse result = apiInstance.accountRulesetsCreateAnAccountRuleset(body, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsCreateAnAccountRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRuleset**](CreateRuleset.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountRulesetsCreateAnAccountRulesetRule"></a>
# **accountRulesetsCreateAnAccountRulesetRule**
> RulesetResponse accountRulesetsCreateAnAccountRulesetRule(body, rulesetId, accountId)

Create an account ruleset rule

Adds a new rule to an account ruleset. The rule will be added to the end of the existing list of rules in the ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
CreateUpdateRule body = new CreateUpdateRule(); // CreateUpdateRule | 
String rulesetId = "rulesetId_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    RulesetResponse result = apiInstance.accountRulesetsCreateAnAccountRulesetRule(body, rulesetId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsCreateAnAccountRulesetRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateUpdateRule**](CreateUpdateRule.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountRulesetsDeleteAnAccountRuleset"></a>
# **accountRulesetsDeleteAnAccountRuleset**
> accountRulesetsDeleteAnAccountRuleset(rulesetId, accountId)

Delete an account ruleset

Deletes all versions of an existing account ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
String rulesetId = "rulesetId_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    apiInstance.accountRulesetsDeleteAnAccountRuleset(rulesetId, accountId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsDeleteAnAccountRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetId** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountRulesetsDeleteAnAccountRulesetRule"></a>
# **accountRulesetsDeleteAnAccountRulesetRule**
> RulesetResponse accountRulesetsDeleteAnAccountRulesetRule(ruleId, rulesetId, accountId)

Delete an account ruleset rule

Deletes an existing rule from an account ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
String ruleId = "ruleId_example"; // String | 
String rulesetId = "rulesetId_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    RulesetResponse result = apiInstance.accountRulesetsDeleteAnAccountRulesetRule(ruleId, rulesetId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsDeleteAnAccountRulesetRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | [**String**](.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountRulesetsDeleteAnAccountRulesetVersion"></a>
# **accountRulesetsDeleteAnAccountRulesetVersion**
> accountRulesetsDeleteAnAccountRulesetVersion(rulesetVersion, rulesetId, accountId)

Delete an account ruleset version

Deletes an existing version of an account ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
String rulesetVersion = "rulesetVersion_example"; // String | 
String rulesetId = "rulesetId_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    apiInstance.accountRulesetsDeleteAnAccountRulesetVersion(rulesetVersion, rulesetId, accountId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsDeleteAnAccountRulesetVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetVersion** | [**String**](.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountRulesetsGetAnAccountEntryPointRuleset"></a>
# **accountRulesetsGetAnAccountEntryPointRuleset**
> RulesetResponse accountRulesetsGetAnAccountEntryPointRuleset(rulesetPhase, accountId)

Get an account entry point ruleset

Fetches the latest version of the account entry point ruleset for a given phase.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
String rulesetPhase = "rulesetPhase_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    RulesetResponse result = apiInstance.accountRulesetsGetAnAccountEntryPointRuleset(rulesetPhase, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsGetAnAccountEntryPointRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetPhase** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountRulesetsGetAnAccountEntryPointRulesetVersion"></a>
# **accountRulesetsGetAnAccountEntryPointRulesetVersion**
> RulesetResponse accountRulesetsGetAnAccountEntryPointRulesetVersion(rulesetVersion, rulesetPhase, accountId)

Get an account entry point ruleset version

Fetches a specific version of an account entry point ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
String rulesetVersion = "rulesetVersion_example"; // String | 
String rulesetPhase = "rulesetPhase_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    RulesetResponse result = apiInstance.accountRulesetsGetAnAccountEntryPointRulesetVersion(rulesetVersion, rulesetPhase, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsGetAnAccountEntryPointRulesetVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetVersion** | [**String**](.md)|  |
 **rulesetPhase** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountRulesetsGetAnAccountRuleset"></a>
# **accountRulesetsGetAnAccountRuleset**
> RulesetResponse accountRulesetsGetAnAccountRuleset(rulesetId, accountId)

Get an account ruleset

Fetches the latest version of an account ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
String rulesetId = "rulesetId_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    RulesetResponse result = apiInstance.accountRulesetsGetAnAccountRuleset(rulesetId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsGetAnAccountRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetId** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountRulesetsGetAnAccountRulesetVersion"></a>
# **accountRulesetsGetAnAccountRulesetVersion**
> RulesetResponse accountRulesetsGetAnAccountRulesetVersion(rulesetVersion, rulesetId, accountId)

Get an account ruleset version

Fetches a specific version of an account ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
String rulesetVersion = "rulesetVersion_example"; // String | 
String rulesetId = "rulesetId_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    RulesetResponse result = apiInstance.accountRulesetsGetAnAccountRulesetVersion(rulesetVersion, rulesetId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsGetAnAccountRulesetVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetVersion** | [**String**](.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountRulesetsListAccountRulesets"></a>
# **accountRulesetsListAccountRulesets**
> RulesetsResponse accountRulesetsListAccountRulesets(accountId)

List account rulesets

Fetches all rulesets at the account level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
String accountId = "accountId_example"; // String | 
try {
    RulesetsResponse result = apiInstance.accountRulesetsListAccountRulesets(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsListAccountRulesets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetsResponse**](RulesetsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountRulesetsListAnAccountEntryPointRulesetSVersions"></a>
# **accountRulesetsListAnAccountEntryPointRulesetSVersions**
> RulesetsResponse accountRulesetsListAnAccountEntryPointRulesetSVersions(rulesetPhase, accountId)

List an account entry point ruleset&#x27;s versions

Fetches the versions of an account entry point ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
String rulesetPhase = "rulesetPhase_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    RulesetsResponse result = apiInstance.accountRulesetsListAnAccountEntryPointRulesetSVersions(rulesetPhase, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsListAnAccountEntryPointRulesetSVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetPhase** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetsResponse**](RulesetsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountRulesetsListAnAccountRulesetSVersions"></a>
# **accountRulesetsListAnAccountRulesetSVersions**
> RulesetsResponse accountRulesetsListAnAccountRulesetSVersions(rulesetId, accountId)

List an account ruleset&#x27;s versions

Fetches the versions of an account ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
String rulesetId = "rulesetId_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    RulesetsResponse result = apiInstance.accountRulesetsListAnAccountRulesetSVersions(rulesetId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsListAnAccountRulesetSVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetId** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetsResponse**](RulesetsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountRulesetsListAnAccountRulesetVersionSRulesByTag"></a>
# **accountRulesetsListAnAccountRulesetVersionSRulesByTag**
> RulesetResponse accountRulesetsListAnAccountRulesetVersionSRulesByTag(ruleTag, rulesetVersion, rulesetId, accountId)

List an account ruleset version&#x27;s rules by tag

Fetches the rules of a managed account ruleset version for a given tag.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
String ruleTag = "ruleTag_example"; // String | 
String rulesetVersion = "rulesetVersion_example"; // String | 
String rulesetId = "rulesetId_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    RulesetResponse result = apiInstance.accountRulesetsListAnAccountRulesetVersionSRulesByTag(ruleTag, rulesetVersion, rulesetId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsListAnAccountRulesetVersionSRulesByTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleTag** | [**String**](.md)|  |
 **rulesetVersion** | [**String**](.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountRulesetsUpdateAnAccountEntryPointRuleset"></a>
# **accountRulesetsUpdateAnAccountEntryPointRuleset**
> RulesetResponse accountRulesetsUpdateAnAccountEntryPointRuleset(body, rulesetPhase, accountId)

Update an account entry point ruleset

Updates an account entry point ruleset, creating a new version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
UpdateRuleset body = new UpdateRuleset(); // UpdateRuleset | 
String rulesetPhase = "rulesetPhase_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    RulesetResponse result = apiInstance.accountRulesetsUpdateAnAccountEntryPointRuleset(body, rulesetPhase, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsUpdateAnAccountEntryPointRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRuleset**](UpdateRuleset.md)|  |
 **rulesetPhase** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountRulesetsUpdateAnAccountRuleset"></a>
# **accountRulesetsUpdateAnAccountRuleset**
> RulesetResponse accountRulesetsUpdateAnAccountRuleset(body, rulesetId, accountId)

Update an account ruleset

Updates an account ruleset, creating a new version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
UpdateRuleset body = new UpdateRuleset(); // UpdateRuleset | 
String rulesetId = "rulesetId_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    RulesetResponse result = apiInstance.accountRulesetsUpdateAnAccountRuleset(body, rulesetId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsUpdateAnAccountRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRuleset**](UpdateRuleset.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountRulesetsUpdateAnAccountRulesetRule"></a>
# **accountRulesetsUpdateAnAccountRulesetRule**
> RulesetResponse accountRulesetsUpdateAnAccountRulesetRule(body, ruleId, rulesetId, accountId)

Update an account ruleset rule

Updates an existing rule in an account ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRulesetsApi;

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


AccountRulesetsApi apiInstance = new AccountRulesetsApi();
CreateUpdateRule body = new CreateUpdateRule(); // CreateUpdateRule | 
String ruleId = "ruleId_example"; // String | 
String rulesetId = "rulesetId_example"; // String | 
String accountId = "accountId_example"; // String | 
try {
    RulesetResponse result = apiInstance.accountRulesetsUpdateAnAccountRulesetRule(body, ruleId, rulesetId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRulesetsApi#accountRulesetsUpdateAnAccountRulesetRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateUpdateRule**](CreateUpdateRule.md)|  |
 **ruleId** | [**String**](.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **accountId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

