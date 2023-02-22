# ClientApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**putZonesZoneIdActivationCheck**](ClientApi.md#putZonesZoneIdActivationCheck) | **PUT** /zones/{zone_id}/activation_check | Rerun the Activation Check

<a name="putZonesZoneIdActivationCheck"></a>
# **putZonesZoneIdActivationCheck**
> InlineResponse200172 putZonesZoneIdActivationCheck(zoneId)

Rerun the Activation Check

Triggeres a new activation check for a PENDING Zone. This can be triggered every 5 min for paygo/ent customers, every hour for FREE Zones.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
String zoneId = "zoneId_example"; // String | Zone ID
try {
    InlineResponse200172 result = apiInstance.putZonesZoneIdActivationCheck(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#putZonesZoneIdActivationCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)| Zone ID |

### Return type

[**InlineResponse200172**](InlineResponse200172.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

