# ZoneRulesetsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneRulesetsCreateAZoneRuleset**](ZoneRulesetsApi.md#zoneRulesetsCreateAZoneRuleset) | **POST** /zones/{zone_id}/rulesets | Create a zone ruleset
[**zoneRulesetsCreateAZoneRulesetRule**](ZoneRulesetsApi.md#zoneRulesetsCreateAZoneRulesetRule) | **POST** /zones/{zone_id}/rulesets/{ruleset_id}/rules | Create a zone ruleset rule
[**zoneRulesetsDeleteAZoneRuleset**](ZoneRulesetsApi.md#zoneRulesetsDeleteAZoneRuleset) | **DELETE** /zones/{zone_id}/rulesets/{ruleset_id} | Delete a zone ruleset
[**zoneRulesetsDeleteAZoneRulesetRule**](ZoneRulesetsApi.md#zoneRulesetsDeleteAZoneRulesetRule) | **DELETE** /zones/{zone_id}/rulesets/{ruleset_id}/rules/{rule_id} | Delete a zone ruleset rule
[**zoneRulesetsDeleteAZoneRulesetVersion**](ZoneRulesetsApi.md#zoneRulesetsDeleteAZoneRulesetVersion) | **DELETE** /zones/{zone_id}/rulesets/{ruleset_id}/versions/{ruleset_version} | Delete a zone ruleset version
[**zoneRulesetsGetAZoneEntryPointRuleset**](ZoneRulesetsApi.md#zoneRulesetsGetAZoneEntryPointRuleset) | **GET** /zones/{zone_id}/rulesets/phases/{ruleset_phase}/entrypoint | Get a zone entry point ruleset
[**zoneRulesetsGetAZoneEntryPointRulesetVersion**](ZoneRulesetsApi.md#zoneRulesetsGetAZoneEntryPointRulesetVersion) | **GET** /zones/{zone_id}/rulesets/phases/{ruleset_phase}/entrypoint/versions/{ruleset_version} | Get a zone entry point ruleset version
[**zoneRulesetsGetAZoneRuleset**](ZoneRulesetsApi.md#zoneRulesetsGetAZoneRuleset) | **GET** /zones/{zone_id}/rulesets/{ruleset_id} | Get a zone ruleset
[**zoneRulesetsGetAZoneRulesetVersion**](ZoneRulesetsApi.md#zoneRulesetsGetAZoneRulesetVersion) | **GET** /zones/{zone_id}/rulesets/{ruleset_id}/versions/{ruleset_version} | Get a zone ruleset version
[**zoneRulesetsListAZoneEntryPointRulesetSVersions**](ZoneRulesetsApi.md#zoneRulesetsListAZoneEntryPointRulesetSVersions) | **GET** /zones/{zone_id}/rulesets/phases/{ruleset_phase}/entrypoint/versions | List a zone entry point ruleset&#x27;s versions
[**zoneRulesetsListAZoneRulesetSVersions**](ZoneRulesetsApi.md#zoneRulesetsListAZoneRulesetSVersions) | **GET** /zones/{zone_id}/rulesets/{ruleset_id}/versions | List a zone ruleset&#x27;s versions
[**zoneRulesetsListZoneRulesets**](ZoneRulesetsApi.md#zoneRulesetsListZoneRulesets) | **GET** /zones/{zone_id}/rulesets | List zone rulesets
[**zoneRulesetsUpdateAZoneEntryPointRuleset**](ZoneRulesetsApi.md#zoneRulesetsUpdateAZoneEntryPointRuleset) | **PUT** /zones/{zone_id}/rulesets/phases/{ruleset_phase}/entrypoint | Update a zone entry point ruleset
[**zoneRulesetsUpdateAZoneRuleset**](ZoneRulesetsApi.md#zoneRulesetsUpdateAZoneRuleset) | **PUT** /zones/{zone_id}/rulesets/{ruleset_id} | Update a zone ruleset
[**zoneRulesetsUpdateAZoneRulesetRule**](ZoneRulesetsApi.md#zoneRulesetsUpdateAZoneRulesetRule) | **PATCH** /zones/{zone_id}/rulesets/{ruleset_id}/rules/{rule_id} | Update a zone ruleset rule

<a name="zoneRulesetsCreateAZoneRuleset"></a>
# **zoneRulesetsCreateAZoneRuleset**
> RulesetResponse zoneRulesetsCreateAZoneRuleset(body, zoneId)

Create a zone ruleset

Creates a ruleset at the zone level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
CreateRuleset body = new CreateRuleset(); // CreateRuleset | 
String zoneId = "zoneId_example"; // String | 
try {
    RulesetResponse result = apiInstance.zoneRulesetsCreateAZoneRuleset(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsCreateAZoneRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRuleset**](CreateRuleset.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneRulesetsCreateAZoneRulesetRule"></a>
# **zoneRulesetsCreateAZoneRulesetRule**
> RulesetResponse zoneRulesetsCreateAZoneRulesetRule(body, rulesetId, zoneId)

Create a zone ruleset rule

Adds a new rule to a zone ruleset. The rule will be added to the end of the existing list of rules in the ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
CreateUpdateRule body = new CreateUpdateRule(); // CreateUpdateRule | 
String rulesetId = "rulesetId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RulesetResponse result = apiInstance.zoneRulesetsCreateAZoneRulesetRule(body, rulesetId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsCreateAZoneRulesetRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateUpdateRule**](CreateUpdateRule.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneRulesetsDeleteAZoneRuleset"></a>
# **zoneRulesetsDeleteAZoneRuleset**
> zoneRulesetsDeleteAZoneRuleset(rulesetId, zoneId)

Delete a zone ruleset

Deletes all versions of an existing zone ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
String rulesetId = "rulesetId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    apiInstance.zoneRulesetsDeleteAZoneRuleset(rulesetId, zoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsDeleteAZoneRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneRulesetsDeleteAZoneRulesetRule"></a>
# **zoneRulesetsDeleteAZoneRulesetRule**
> RulesetResponse zoneRulesetsDeleteAZoneRulesetRule(ruleId, rulesetId, zoneId)

Delete a zone ruleset rule

Deletes an existing rule from a zone ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
String ruleId = "ruleId_example"; // String | 
String rulesetId = "rulesetId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RulesetResponse result = apiInstance.zoneRulesetsDeleteAZoneRulesetRule(ruleId, rulesetId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsDeleteAZoneRulesetRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | [**String**](.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneRulesetsDeleteAZoneRulesetVersion"></a>
# **zoneRulesetsDeleteAZoneRulesetVersion**
> zoneRulesetsDeleteAZoneRulesetVersion(rulesetVersion, rulesetId, zoneId)

Delete a zone ruleset version

Deletes an existing version of a zone ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
String rulesetVersion = "rulesetVersion_example"; // String | 
String rulesetId = "rulesetId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    apiInstance.zoneRulesetsDeleteAZoneRulesetVersion(rulesetVersion, rulesetId, zoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsDeleteAZoneRulesetVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetVersion** | [**String**](.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneRulesetsGetAZoneEntryPointRuleset"></a>
# **zoneRulesetsGetAZoneEntryPointRuleset**
> RulesetResponse zoneRulesetsGetAZoneEntryPointRuleset(rulesetPhase, zoneId)

Get a zone entry point ruleset

Fetches the latest version of the zone entry point ruleset for a given phase.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
String rulesetPhase = "rulesetPhase_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RulesetResponse result = apiInstance.zoneRulesetsGetAZoneEntryPointRuleset(rulesetPhase, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsGetAZoneEntryPointRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetPhase** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneRulesetsGetAZoneEntryPointRulesetVersion"></a>
# **zoneRulesetsGetAZoneEntryPointRulesetVersion**
> RulesetResponse zoneRulesetsGetAZoneEntryPointRulesetVersion(rulesetVersion, rulesetPhase, zoneId)

Get a zone entry point ruleset version

Fetches a specific version of a zone entry point ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
String rulesetVersion = "rulesetVersion_example"; // String | 
String rulesetPhase = "rulesetPhase_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RulesetResponse result = apiInstance.zoneRulesetsGetAZoneEntryPointRulesetVersion(rulesetVersion, rulesetPhase, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsGetAZoneEntryPointRulesetVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetVersion** | [**String**](.md)|  |
 **rulesetPhase** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneRulesetsGetAZoneRuleset"></a>
# **zoneRulesetsGetAZoneRuleset**
> RulesetResponse zoneRulesetsGetAZoneRuleset(rulesetId, zoneId)

Get a zone ruleset

Fetches the latest version of a zone ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
String rulesetId = "rulesetId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RulesetResponse result = apiInstance.zoneRulesetsGetAZoneRuleset(rulesetId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsGetAZoneRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneRulesetsGetAZoneRulesetVersion"></a>
# **zoneRulesetsGetAZoneRulesetVersion**
> RulesetResponse zoneRulesetsGetAZoneRulesetVersion(rulesetVersion, rulesetId, zoneId)

Get a zone ruleset version

Fetches a specific version of a zone ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
String rulesetVersion = "rulesetVersion_example"; // String | 
String rulesetId = "rulesetId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RulesetResponse result = apiInstance.zoneRulesetsGetAZoneRulesetVersion(rulesetVersion, rulesetId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsGetAZoneRulesetVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetVersion** | [**String**](.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneRulesetsListAZoneEntryPointRulesetSVersions"></a>
# **zoneRulesetsListAZoneEntryPointRulesetSVersions**
> RulesetsResponse zoneRulesetsListAZoneEntryPointRulesetSVersions(rulesetPhase, zoneId)

List a zone entry point ruleset&#x27;s versions

Fetches the versions of a zone entry point ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
String rulesetPhase = "rulesetPhase_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RulesetsResponse result = apiInstance.zoneRulesetsListAZoneEntryPointRulesetSVersions(rulesetPhase, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsListAZoneEntryPointRulesetSVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetPhase** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetsResponse**](RulesetsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneRulesetsListAZoneRulesetSVersions"></a>
# **zoneRulesetsListAZoneRulesetSVersions**
> RulesetsResponse zoneRulesetsListAZoneRulesetSVersions(rulesetId, zoneId)

List a zone ruleset&#x27;s versions

Fetches the versions of a zone ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
String rulesetId = "rulesetId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RulesetsResponse result = apiInstance.zoneRulesetsListAZoneRulesetSVersions(rulesetId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsListAZoneRulesetSVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rulesetId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetsResponse**](RulesetsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneRulesetsListZoneRulesets"></a>
# **zoneRulesetsListZoneRulesets**
> RulesetsResponse zoneRulesetsListZoneRulesets(zoneId)

List zone rulesets

Fetches all rulesets at the zone level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
String zoneId = "zoneId_example"; // String | 
try {
    RulesetsResponse result = apiInstance.zoneRulesetsListZoneRulesets(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsListZoneRulesets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetsResponse**](RulesetsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneRulesetsUpdateAZoneEntryPointRuleset"></a>
# **zoneRulesetsUpdateAZoneEntryPointRuleset**
> RulesetResponse zoneRulesetsUpdateAZoneEntryPointRuleset(body, rulesetPhase, zoneId)

Update a zone entry point ruleset

Updates a zone entry point ruleset, creating a new version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
UpdateRuleset body = new UpdateRuleset(); // UpdateRuleset | 
String rulesetPhase = "rulesetPhase_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RulesetResponse result = apiInstance.zoneRulesetsUpdateAZoneEntryPointRuleset(body, rulesetPhase, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsUpdateAZoneEntryPointRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRuleset**](UpdateRuleset.md)|  |
 **rulesetPhase** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneRulesetsUpdateAZoneRuleset"></a>
# **zoneRulesetsUpdateAZoneRuleset**
> RulesetResponse zoneRulesetsUpdateAZoneRuleset(body, rulesetId, zoneId)

Update a zone ruleset

Updates a zone ruleset, creating a new version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
UpdateRuleset body = new UpdateRuleset(); // UpdateRuleset | 
String rulesetId = "rulesetId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RulesetResponse result = apiInstance.zoneRulesetsUpdateAZoneRuleset(body, rulesetId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsUpdateAZoneRuleset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRuleset**](UpdateRuleset.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneRulesetsUpdateAZoneRulesetRule"></a>
# **zoneRulesetsUpdateAZoneRulesetRule**
> RulesetResponse zoneRulesetsUpdateAZoneRulesetRule(body, ruleId, rulesetId, zoneId)

Update a zone ruleset rule

Updates an existing rule in a zone ruleset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneRulesetsApi;

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


ZoneRulesetsApi apiInstance = new ZoneRulesetsApi();
CreateUpdateRule body = new CreateUpdateRule(); // CreateUpdateRule | 
String ruleId = "ruleId_example"; // String | 
String rulesetId = "rulesetId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RulesetResponse result = apiInstance.zoneRulesetsUpdateAZoneRulesetRule(body, ruleId, rulesetId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneRulesetsApi#zoneRulesetsUpdateAZoneRulesetRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateUpdateRule**](CreateUpdateRule.md)|  |
 **ruleId** | [**String**](.md)|  |
 **rulesetId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RulesetResponse**](RulesetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

