# DlpProfilesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dlpProfilesCreateCustomProfiles**](DlpProfilesApi.md#dlpProfilesCreateCustomProfiles) | **POST** /accounts/{account_identifier}/dlp/profiles/custom | Create custom profiles
[**dlpProfilesDeleteCustomProfile**](DlpProfilesApi.md#dlpProfilesDeleteCustomProfile) | **DELETE** /accounts/{account_identifier}/dlp/profiles/custom/{profile_id} | Delete custom profile
[**dlpProfilesGetCustomProfile**](DlpProfilesApi.md#dlpProfilesGetCustomProfile) | **GET** /accounts/{account_identifier}/dlp/profiles/custom/{profile_id} | Get custom profile
[**dlpProfilesGetDlpProfile**](DlpProfilesApi.md#dlpProfilesGetDlpProfile) | **GET** /accounts/{account_identifier}/dlp/profiles/{profile_id} | Get DLP Profile
[**dlpProfilesGetPredefinedProfile**](DlpProfilesApi.md#dlpProfilesGetPredefinedProfile) | **GET** /accounts/{account_identifier}/dlp/profiles/predefined/{profile_id} | Get predefined profile
[**dlpProfilesListAllProfiles**](DlpProfilesApi.md#dlpProfilesListAllProfiles) | **GET** /accounts/{account_identifier}/dlp/profiles | List all profiles
[**dlpProfilesUpdateCustomProfile**](DlpProfilesApi.md#dlpProfilesUpdateCustomProfile) | **PUT** /accounts/{account_identifier}/dlp/profiles/custom/{profile_id} | Update custom profile
[**dlpProfilesUpdatePredefinedProfile**](DlpProfilesApi.md#dlpProfilesUpdatePredefinedProfile) | **PUT** /accounts/{account_identifier}/dlp/profiles/predefined/{profile_id} | Update predefined profile

<a name="dlpProfilesCreateCustomProfiles"></a>
# **dlpProfilesCreateCustomProfiles**
> CreateCustomProfileResponse dlpProfilesCreateCustomProfiles(body, accountIdentifier)

Create custom profiles

Creates a set of DLP custom profiles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DlpProfilesApi;

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


DlpProfilesApi apiInstance = new DlpProfilesApi();
CreateCustomProfiles body = new CreateCustomProfiles(); // CreateCustomProfiles | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CreateCustomProfileResponse result = apiInstance.dlpProfilesCreateCustomProfiles(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DlpProfilesApi#dlpProfilesCreateCustomProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateCustomProfiles**](CreateCustomProfiles.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CreateCustomProfileResponse**](CreateCustomProfileResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dlpProfilesDeleteCustomProfile"></a>
# **dlpProfilesDeleteCustomProfile**
> ApiResponseSingle dlpProfilesDeleteCustomProfile(profileId, accountIdentifier)

Delete custom profile

Deletes a DLP custom profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DlpProfilesApi;

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


DlpProfilesApi apiInstance = new DlpProfilesApi();
ProfileId profileId = new ProfileId(); // ProfileId | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.dlpProfilesDeleteCustomProfile(profileId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DlpProfilesApi#dlpProfilesDeleteCustomProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | [**ProfileId**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dlpProfilesGetCustomProfile"></a>
# **dlpProfilesGetCustomProfile**
> CustomProfileResponse dlpProfilesGetCustomProfile(profileId, accountIdentifier)

Get custom profile

Fetches a custom DLP profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DlpProfilesApi;

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


DlpProfilesApi apiInstance = new DlpProfilesApi();
ProfileId profileId = new ProfileId(); // ProfileId | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CustomProfileResponse result = apiInstance.dlpProfilesGetCustomProfile(profileId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DlpProfilesApi#dlpProfilesGetCustomProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | [**ProfileId**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CustomProfileResponse**](CustomProfileResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dlpProfilesGetDlpProfile"></a>
# **dlpProfilesGetDlpProfile**
> EitherProfileResponse dlpProfilesGetDlpProfile(profileId, accountIdentifier)

Get DLP Profile

Fetches a DLP profile by ID. Supports both predefined and custom profiles

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DlpProfilesApi;

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


DlpProfilesApi apiInstance = new DlpProfilesApi();
ProfileId profileId = new ProfileId(); // ProfileId | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    EitherProfileResponse result = apiInstance.dlpProfilesGetDlpProfile(profileId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DlpProfilesApi#dlpProfilesGetDlpProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | [**ProfileId**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**EitherProfileResponse**](EitherProfileResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dlpProfilesGetPredefinedProfile"></a>
# **dlpProfilesGetPredefinedProfile**
> PredefinedProfileResponse dlpProfilesGetPredefinedProfile(profileId, accountIdentifier)

Get predefined profile

Fetches a predefined DLP profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DlpProfilesApi;

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


DlpProfilesApi apiInstance = new DlpProfilesApi();
ProfileId profileId = new ProfileId(); // ProfileId | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PredefinedProfileResponse result = apiInstance.dlpProfilesGetPredefinedProfile(profileId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DlpProfilesApi#dlpProfilesGetPredefinedProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileId** | [**ProfileId**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PredefinedProfileResponse**](PredefinedProfileResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dlpProfilesListAllProfiles"></a>
# **dlpProfilesListAllProfiles**
> ProfilesComponentsSchemasResponseCollection dlpProfilesListAllProfiles(accountIdentifier)

List all profiles

Lists all DLP profiles in an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DlpProfilesApi;

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


DlpProfilesApi apiInstance = new DlpProfilesApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ProfilesComponentsSchemasResponseCollection result = apiInstance.dlpProfilesListAllProfiles(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DlpProfilesApi#dlpProfilesListAllProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ProfilesComponentsSchemasResponseCollection**](ProfilesComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dlpProfilesUpdateCustomProfile"></a>
# **dlpProfilesUpdateCustomProfile**
> CustomProfile dlpProfilesUpdateCustomProfile(body, profileId, accountIdentifier)

Update custom profile

Updates a DLP custom profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DlpProfilesApi;

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


DlpProfilesApi apiInstance = new DlpProfilesApi();
UpdateCustomProfile body = new UpdateCustomProfile(); // UpdateCustomProfile | 
ProfileId profileId = new ProfileId(); // ProfileId | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CustomProfile result = apiInstance.dlpProfilesUpdateCustomProfile(body, profileId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DlpProfilesApi#dlpProfilesUpdateCustomProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateCustomProfile**](UpdateCustomProfile.md)|  |
 **profileId** | [**ProfileId**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CustomProfile**](CustomProfile.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dlpProfilesUpdatePredefinedProfile"></a>
# **dlpProfilesUpdatePredefinedProfile**
> PredefinedProfile dlpProfilesUpdatePredefinedProfile(body, profileId, accountIdentifier)

Update predefined profile

Updates a DLP predefined profile. Only supports enabling/disabling entries.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DlpProfilesApi;

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


DlpProfilesApi apiInstance = new DlpProfilesApi();
UpdatePredefinedProfile body = new UpdatePredefinedProfile(); // UpdatePredefinedProfile | 
ProfileId profileId = new ProfileId(); // ProfileId | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PredefinedProfile result = apiInstance.dlpProfilesUpdatePredefinedProfile(body, profileId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DlpProfilesApi#dlpProfilesUpdatePredefinedProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdatePredefinedProfile**](UpdatePredefinedProfile.md)|  |
 **profileId** | [**ProfileId**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PredefinedProfile**](PredefinedProfile.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

