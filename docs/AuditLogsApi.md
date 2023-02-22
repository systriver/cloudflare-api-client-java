# AuditLogsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auditLogsGetAccountAuditLogs**](AuditLogsApi.md#auditLogsGetAccountAuditLogs) | **GET** /accounts/{account_identifier}/audit_logs | Get account audit logs
[**auditLogsGetOrganizationAuditLogs**](AuditLogsApi.md#auditLogsGetOrganizationAuditLogs) | **GET** /organizations/{organization_identifier}/audit_logs | Get organization audit logs
[**auditLogsGetUserAuditLogs**](AuditLogsApi.md#auditLogsGetUserAuditLogs) | **GET** /user/audit_logs | Get user audit logs

<a name="auditLogsGetAccountAuditLogs"></a>
# **auditLogsGetAccountAuditLogs**
> AuditLogsResponseCollection auditLogsGetAccountAuditLogs(accountIdentifier)

Get account audit logs

Gets a list of audit logs for an account. The list can be filtered by who made the change, which zone was the change made on, and the timeframe of the change.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditLogsApi;

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


AuditLogsApi apiInstance = new AuditLogsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    AuditLogsResponseCollection result = apiInstance.auditLogsGetAccountAuditLogs(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogsApi#auditLogsGetAccountAuditLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**AuditLogsResponseCollection**](AuditLogsResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auditLogsGetOrganizationAuditLogs"></a>
# **auditLogsGetOrganizationAuditLogs**
> AuditLogsResponseCollection auditLogsGetOrganizationAuditLogs(organizationIdentifier)

Get organization audit logs

Gets a list of audit logs for an organization. The list can be filtered by who made the change, which zone was the change made on, and the timeframe of the change.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditLogsApi;

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


AuditLogsApi apiInstance = new AuditLogsApi();
String organizationIdentifier = "organizationIdentifier_example"; // String | 
try {
    AuditLogsResponseCollection result = apiInstance.auditLogsGetOrganizationAuditLogs(organizationIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogsApi#auditLogsGetOrganizationAuditLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationIdentifier** | [**String**](.md)|  |

### Return type

[**AuditLogsResponseCollection**](AuditLogsResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="auditLogsGetUserAuditLogs"></a>
# **auditLogsGetUserAuditLogs**
> AuditLogsResponseCollection auditLogsGetUserAuditLogs()

Get user audit logs

Gets a list of audit logs for a user account. The list can be filtered by who made the change, which zone was the change made on, and the timeframe of the change.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditLogsApi;

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


AuditLogsApi apiInstance = new AuditLogsApi();
try {
    AuditLogsResponseCollection result = apiInstance.auditLogsGetUserAuditLogs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogsApi#auditLogsGetUserAuditLogs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuditLogsResponseCollection**](AuditLogsResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

