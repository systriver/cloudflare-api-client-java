# PagesProjectApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pagesProjectCreateProject**](PagesProjectApi.md#pagesProjectCreateProject) | **POST** /accounts/{account_identifier}/pages/projects | Create project
[**pagesProjectDeleteProject**](PagesProjectApi.md#pagesProjectDeleteProject) | **DELETE** /accounts/{account_identifier}/pages/projects/{project_name} | Delete project
[**pagesProjectGetProject**](PagesProjectApi.md#pagesProjectGetProject) | **GET** /accounts/{account_identifier}/pages/projects/{project_name} | Get project
[**pagesProjectGetProjects**](PagesProjectApi.md#pagesProjectGetProjects) | **GET** /accounts/{account_identifier}/pages/projects | Get projects
[**pagesProjectUpdateProject**](PagesProjectApi.md#pagesProjectUpdateProject) | **PATCH** /accounts/{account_identifier}/pages/projects/{project_name} | Update project

<a name="pagesProjectCreateProject"></a>
# **pagesProjectCreateProject**
> NewProjectResponse pagesProjectCreateProject(body, accountIdentifier)

Create project

Make a new project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesProjectApi;

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


PagesProjectApi apiInstance = new PagesProjectApi();
Projects body = new Projects(); // Projects | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    NewProjectResponse result = apiInstance.pagesProjectCreateProject(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesProjectApi#pagesProjectCreateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Projects**](Projects.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**NewProjectResponse**](NewProjectResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pagesProjectDeleteProject"></a>
# **pagesProjectDeleteProject**
> Object pagesProjectDeleteProject(projectName, accountIdentifier)

Delete project

Destroy a project by name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesProjectApi;

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


PagesProjectApi apiInstance = new PagesProjectApi();
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    Object result = apiInstance.pagesProjectDeleteProject(projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesProjectApi#pagesProjectDeleteProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

**Object**

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pagesProjectGetProject"></a>
# **pagesProjectGetProject**
> ProjectResponse pagesProjectGetProject(projectName, accountIdentifier)

Get project

Fetch a project by name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesProjectApi;

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


PagesProjectApi apiInstance = new PagesProjectApi();
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ProjectResponse result = apiInstance.pagesProjectGetProject(projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesProjectApi#pagesProjectGetProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ProjectResponse**](ProjectResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pagesProjectGetProjects"></a>
# **pagesProjectGetProjects**
> ProjectsResponse pagesProjectGetProjects(accountIdentifier)

Get projects

Fetch a list of all user projects.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesProjectApi;

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


PagesProjectApi apiInstance = new PagesProjectApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ProjectsResponse result = apiInstance.pagesProjectGetProjects(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesProjectApi#pagesProjectGetProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ProjectsResponse**](ProjectsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pagesProjectUpdateProject"></a>
# **pagesProjectUpdateProject**
> NewProjectResponse pagesProjectUpdateProject(body, projectName, accountIdentifier)

Update project

Set new attributes for an existing project. Modify environment variables. To delete an environment variable, set the key to null.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesProjectApi;

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


PagesProjectApi apiInstance = new PagesProjectApi();
Object body = null; // Object | 
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    NewProjectResponse result = apiInstance.pagesProjectUpdateProject(body, projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesProjectApi#pagesProjectUpdateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**NewProjectResponse**](NewProjectResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

