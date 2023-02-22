# ApiShieldEndpointManagementApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiShieldEndpointManagementAddOperationsToAZone**](ApiShieldEndpointManagementApi.md#apiShieldEndpointManagementAddOperationsToAZone) | **POST** /zones/{zone_id}/api_gateway/operations | Add operations to a zone
[**apiShieldEndpointManagementDeleteAnOperation**](ApiShieldEndpointManagementApi.md#apiShieldEndpointManagementDeleteAnOperation) | **DELETE** /zones/{zone_id}/api_gateway/operations/{operation_id} | Delete an operation
[**apiShieldEndpointManagementRetrieveApiDiscoveryResultsForAZone**](ApiShieldEndpointManagementApi.md#apiShieldEndpointManagementRetrieveApiDiscoveryResultsForAZone) | **GET** /zones/{zone_id}/api_gateway/discovery | Retrieve API Discovery results for a zone
[**apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone**](ApiShieldEndpointManagementApi.md#apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone) | **GET** /zones/{zone_id}/api_gateway/operations | Retrieve information about all operations on a zone
[**apiShieldEndpointManagementRetrieveInformationAboutAnOperation**](ApiShieldEndpointManagementApi.md#apiShieldEndpointManagementRetrieveInformationAboutAnOperation) | **GET** /zones/{zone_id}/api_gateway/operations/{operation_id} | Retrieve information about an operation
[**apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas**](ApiShieldEndpointManagementApi.md#apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas) | **GET** /zones/{zone_id}/api_gateway/schemas | Retrieve operations and features as OpenAPI schemas

<a name="apiShieldEndpointManagementAddOperationsToAZone"></a>
# **apiShieldEndpointManagementAddOperationsToAZone**
> CollectionResponse apiShieldEndpointManagementAddOperationsToAZone(body, zoneId)

Add operations to a zone

Add one or more operations to a zone. Endpoints can contain path variables. Host, method, endpoint will be normalized to a canoncial form when creating an operation and must be unique on the zone. Inserting an operation that matches an existing one will return the record of the already existing operation and update its last_updated date.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiShieldEndpointManagementApi;

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


ApiShieldEndpointManagementApi apiInstance = new ApiShieldEndpointManagementApi();
List<ApiGatewayOperationsBody> body = Arrays.asList(new ApiGatewayOperationsBody()); // List<ApiGatewayOperationsBody> | 
String zoneId = "zoneId_example"; // String | 
try {
    CollectionResponse result = apiInstance.apiShieldEndpointManagementAddOperationsToAZone(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiShieldEndpointManagementApi#apiShieldEndpointManagementAddOperationsToAZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;ApiGatewayOperationsBody&gt;**](ApiGatewayOperationsBody.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**CollectionResponse**](CollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiShieldEndpointManagementDeleteAnOperation"></a>
# **apiShieldEndpointManagementDeleteAnOperation**
> DefaultResponse apiShieldEndpointManagementDeleteAnOperation(operationId, zoneId)

Delete an operation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiShieldEndpointManagementApi;

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


ApiShieldEndpointManagementApi apiInstance = new ApiShieldEndpointManagementApi();
String operationId = "operationId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    DefaultResponse result = apiInstance.apiShieldEndpointManagementDeleteAnOperation(operationId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiShieldEndpointManagementApi#apiShieldEndpointManagementDeleteAnOperation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operationId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**DefaultResponse**](DefaultResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiShieldEndpointManagementRetrieveApiDiscoveryResultsForAZone"></a>
# **apiShieldEndpointManagementRetrieveApiDiscoveryResultsForAZone**
> SchemaResponseDiscovery apiShieldEndpointManagementRetrieveApiDiscoveryResultsForAZone(zoneId)

Retrieve API Discovery results for a zone

Retrieve the most up to date view of API Discovery on a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiShieldEndpointManagementApi;

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


ApiShieldEndpointManagementApi apiInstance = new ApiShieldEndpointManagementApi();
String zoneId = "zoneId_example"; // String | 
try {
    SchemaResponseDiscovery result = apiInstance.apiShieldEndpointManagementRetrieveApiDiscoveryResultsForAZone(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiShieldEndpointManagementApi#apiShieldEndpointManagementRetrieveApiDiscoveryResultsForAZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**SchemaResponseDiscovery**](SchemaResponseDiscovery.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone"></a>
# **apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone**
> CollectionResponsePaginated apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone(zoneId)

Retrieve information about all operations on a zone

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiShieldEndpointManagementApi;

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


ApiShieldEndpointManagementApi apiInstance = new ApiShieldEndpointManagementApi();
String zoneId = "zoneId_example"; // String | 
try {
    CollectionResponsePaginated result = apiInstance.apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiShieldEndpointManagementApi#apiShieldEndpointManagementRetrieveInformationAboutAllOperationsOnAZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**CollectionResponsePaginated**](CollectionResponsePaginated.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiShieldEndpointManagementRetrieveInformationAboutAnOperation"></a>
# **apiShieldEndpointManagementRetrieveInformationAboutAnOperation**
> CloudflareClientAPISchemasSingleResponse apiShieldEndpointManagementRetrieveInformationAboutAnOperation(operationId, zoneId)

Retrieve information about an operation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiShieldEndpointManagementApi;

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


ApiShieldEndpointManagementApi apiInstance = new ApiShieldEndpointManagementApi();
String operationId = "operationId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    CloudflareClientAPISchemasSingleResponse result = apiInstance.apiShieldEndpointManagementRetrieveInformationAboutAnOperation(operationId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiShieldEndpointManagementApi#apiShieldEndpointManagementRetrieveInformationAboutAnOperation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operationId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPISchemasSingleResponse**](CloudflareClientAPISchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas"></a>
# **apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas**
> SchemaResponseWithThresholds apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas(zoneId)

Retrieve operations and features as OpenAPI schemas

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiShieldEndpointManagementApi;

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


ApiShieldEndpointManagementApi apiInstance = new ApiShieldEndpointManagementApi();
String zoneId = "zoneId_example"; // String | 
try {
    SchemaResponseWithThresholds result = apiInstance.apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiShieldEndpointManagementApi#apiShieldEndpointManagementRetrieveOperationsAndFeaturesAsOpenApiSchemas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**SchemaResponseWithThresholds**](SchemaResponseWithThresholds.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

