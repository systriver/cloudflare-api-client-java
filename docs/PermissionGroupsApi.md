# PermissionGroupsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**permissionGroupsListPermissionGroups**](PermissionGroupsApi.md#permissionGroupsListPermissionGroups) | **GET** /user/tokens/permission_groups | List Permission Groups

<a name="permissionGroupsListPermissionGroups"></a>
# **permissionGroupsListPermissionGroups**
> CloudflareClientAPISchemasResponseCollection permissionGroupsListPermissionGroups()

List Permission Groups

Find all available permission groups.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PermissionGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PermissionGroupsApi apiInstance = new PermissionGroupsApi();
try {
    CloudflareClientAPISchemasResponseCollection result = apiInstance.permissionGroupsListPermissionGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionGroupsApi#permissionGroupsListPermissionGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CloudflareClientAPISchemasResponseCollection**](CloudflareClientAPISchemasResponseCollection.md)

### Authorization

[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

