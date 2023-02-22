# WaitingRoomApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**waitingRoomCreateACustomWaitingRoomPagePreview**](WaitingRoomApi.md#waitingRoomCreateACustomWaitingRoomPagePreview) | **POST** /zones/{zone_identifier}/waiting_rooms/preview | Create a custom waiting room page preview
[**waitingRoomCreateEvent**](WaitingRoomApi.md#waitingRoomCreateEvent) | **POST** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/events | Create event
[**waitingRoomCreateWaitingRoom**](WaitingRoomApi.md#waitingRoomCreateWaitingRoom) | **POST** /zones/{zone_identifier}/waiting_rooms | Create waiting room
[**waitingRoomCreateWaitingRoomRule**](WaitingRoomApi.md#waitingRoomCreateWaitingRoomRule) | **POST** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/rules | Create Waiting Room Rule
[**waitingRoomDeleteEvent**](WaitingRoomApi.md#waitingRoomDeleteEvent) | **DELETE** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/events/{event_id} | Delete event
[**waitingRoomDeleteWaitingRoom**](WaitingRoomApi.md#waitingRoomDeleteWaitingRoom) | **DELETE** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id} | Delete waiting room
[**waitingRoomDeleteWaitingRoomRule**](WaitingRoomApi.md#waitingRoomDeleteWaitingRoomRule) | **DELETE** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/rules/{rule_id} | Delete Waiting Room Rule
[**waitingRoomEventDetails**](WaitingRoomApi.md#waitingRoomEventDetails) | **GET** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/events/{event_id} | Event details
[**waitingRoomGetWaitingRoomStatus**](WaitingRoomApi.md#waitingRoomGetWaitingRoomStatus) | **GET** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/status | Get waiting room status
[**waitingRoomListEvents**](WaitingRoomApi.md#waitingRoomListEvents) | **GET** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/events | List events
[**waitingRoomListWaitingRoomRules**](WaitingRoomApi.md#waitingRoomListWaitingRoomRules) | **GET** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/rules | List Waiting Room Rules
[**waitingRoomListWaitingRooms**](WaitingRoomApi.md#waitingRoomListWaitingRooms) | **GET** /zones/{zone_identifier}/waiting_rooms | List waiting rooms
[**waitingRoomPatchEvent**](WaitingRoomApi.md#waitingRoomPatchEvent) | **PATCH** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/events/{event_id} | Patch event
[**waitingRoomPatchWaitingRoom**](WaitingRoomApi.md#waitingRoomPatchWaitingRoom) | **PATCH** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id} | Patch waiting room
[**waitingRoomPatchWaitingRoomRule**](WaitingRoomApi.md#waitingRoomPatchWaitingRoomRule) | **PATCH** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/rules/{rule_id} | Patch Waiting Room Rule
[**waitingRoomPreviewActiveEventDetails**](WaitingRoomApi.md#waitingRoomPreviewActiveEventDetails) | **GET** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/events/{event_id}/details | Preview active event details
[**waitingRoomReplaceWaitingRoomRules**](WaitingRoomApi.md#waitingRoomReplaceWaitingRoomRules) | **PUT** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/rules | Replace Waiting Room Rules
[**waitingRoomUpdateEvent**](WaitingRoomApi.md#waitingRoomUpdateEvent) | **PUT** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id}/events/{event_id} | Update event
[**waitingRoomUpdateWaitingRoom**](WaitingRoomApi.md#waitingRoomUpdateWaitingRoom) | **PUT** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id} | Update waiting room
[**waitingRoomWaitingRoomDetails**](WaitingRoomApi.md#waitingRoomWaitingRoomDetails) | **GET** /zones/{zone_identifier}/waiting_rooms/{waiting_room_id} | Waiting room details

<a name="waitingRoomCreateACustomWaitingRoomPagePreview"></a>
# **waitingRoomCreateACustomWaitingRoomPagePreview**
> SchemasPreviewResponse waitingRoomCreateACustomWaitingRoomPagePreview(body, zoneIdentifier)

Create a custom waiting room page preview

Creates a waiting room page preview. Upload a custom waiting room page for preview. You will receive a preview URL in the form &#x60;http://waitingrooms.dev/preview/&lt;uuid&gt;&#x60;. You can use the following query parameters to change the state of the preview: 1. &#x60;force_queue&#x60;: Boolean indicating if all users will be queued in the waiting room and no one will be let into the origin website (also known as queueAll). 2. &#x60;queue_is_full&#x60;: Boolean indicating if the waiting room&#x27;s queue is currently full and not accepting new users at the moment. 3. &#x60;queueing_method&#x60;: The queueing method currently used by the waiting room.  - **fifo** indicates a FIFO queue.  - **random** indicates a Random queue.  - **passthrough** indicates a Passthrough queue. Keep in mind that the waiting room page will only be displayed if &#x60;force_queue&#x3D;true&#x60; or &#x60;event&#x3D;prequeueing&#x60; — for other cases the request will pass through to the origin. For our preview, this will be a fake origin website returning \&quot;Welcome\&quot;.   - **reject** indicates a Reject queue. 4. &#x60;event&#x60;: Used to preview a waiting room event.  - **none** indicates no event is occurring.  - **prequeueing** indicates that an event is prequeueing (between &#x60;prequeue_start_time&#x60; and &#x60;event_start_time&#x60;).  - **started** indicates that an event has started (between &#x60;event_start_time&#x60; and &#x60;event_end_time&#x60;). 5. &#x60;shuffle_at_event_start&#x60;: Boolean indicating if the event will shuffle users in the prequeue when it starts. This can only be set to **true** if an event is active (&#x60;event&#x60; is not **none**).  For example, you can make a request to &#x60;http://waitingrooms.dev/preview/&lt;uuid&gt;?force_queue&#x3D;false&amp;queue_is_full&#x3D;false&amp;queueing_method&#x3D;random&amp;event&#x3D;started&amp;shuffle_at_event_start&#x3D;true&#x60; 6. &#x60;waitTime&#x60;: Non-zero, positive integer indicating the estimated wait time in minutes. The default value is 10 minutes.  For example, you can make a request to &#x60;http://waitingrooms.dev/preview/&lt;uuid&gt;?waitTime&#x3D;50&#x60; to configure the estimated wait time as 50 minutes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
QueryPreview body = new QueryPreview(); // QueryPreview | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasPreviewResponse result = apiInstance.waitingRoomCreateACustomWaitingRoomPagePreview(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomCreateACustomWaitingRoomPagePreview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QueryPreview**](QueryPreview.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasPreviewResponse**](SchemasPreviewResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomCreateEvent"></a>
# **waitingRoomCreateEvent**
> EventResponse waitingRoomCreateEvent(body, waitingRoomId, zoneIdentifier)

Create event

Only available for the Waiting Room Advanced subscription. Creates an event for a waiting room. An event takes place during a specified period of time, temporarily changing the behavior of a waiting room. While the event is active, some of the properties in the event&#x27;s configuration may either override or inherit from the waiting room&#x27;s configuration. Note that events cannot overlap with each other, so only one event can be active at a time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
QueryEvent body = new QueryEvent(); // QueryEvent | 
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    EventResponse result = apiInstance.waitingRoomCreateEvent(body, waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomCreateEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QueryEvent**](QueryEvent.md)|  |
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomCreateWaitingRoom"></a>
# **waitingRoomCreateWaitingRoom**
> WaitingroomComponentsSchemasSingleResponse waitingRoomCreateWaitingRoom(body, zoneIdentifier)

Create waiting room

Creates a new waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
CloudflareClientAPIQueryWaitingroom body = new CloudflareClientAPIQueryWaitingroom(); // CloudflareClientAPIQueryWaitingroom | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    WaitingroomComponentsSchemasSingleResponse result = apiInstance.waitingRoomCreateWaitingRoom(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomCreateWaitingRoom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPIQueryWaitingroom**](CloudflareClientAPIQueryWaitingroom.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**WaitingroomComponentsSchemasSingleResponse**](WaitingroomComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomCreateWaitingRoomRule"></a>
# **waitingRoomCreateWaitingRoomRule**
> SchemasRulesResponseCollection waitingRoomCreateWaitingRoomRule(body, waitingRoomId, zoneIdentifier)

Create Waiting Room Rule

Only available for the Waiting Room Advanced subscription. Creates a rule for a waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
CreateRule body = new CreateRule(); // CreateRule | 
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasRulesResponseCollection result = apiInstance.waitingRoomCreateWaitingRoomRule(body, waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomCreateWaitingRoomRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRule**](CreateRule.md)|  |
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasRulesResponseCollection**](SchemasRulesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomDeleteEvent"></a>
# **waitingRoomDeleteEvent**
> EventIdResponse waitingRoomDeleteEvent(eventId, waitingRoomId, zoneIdentifier)

Delete event

Deletes an event for a waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
EventId eventId = new EventId(); // EventId | 
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    EventIdResponse result = apiInstance.waitingRoomDeleteEvent(eventId, waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomDeleteEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | [**EventId**](.md)|  |
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**EventIdResponse**](EventIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomDeleteWaitingRoom"></a>
# **waitingRoomDeleteWaitingRoom**
> WaitingRoomIdResponse waitingRoomDeleteWaitingRoom(waitingRoomId, zoneIdentifier)

Delete waiting room

Deletes a waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    WaitingRoomIdResponse result = apiInstance.waitingRoomDeleteWaitingRoom(waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomDeleteWaitingRoom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**WaitingRoomIdResponse**](WaitingRoomIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomDeleteWaitingRoomRule"></a>
# **waitingRoomDeleteWaitingRoomRule**
> SchemasRulesResponseCollection waitingRoomDeleteWaitingRoomRule(ruleId, waitingRoomId, zoneIdentifier)

Delete Waiting Room Rule

Deletes a rule for a waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
String ruleId = "ruleId_example"; // String | 
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasRulesResponseCollection result = apiInstance.waitingRoomDeleteWaitingRoomRule(ruleId, waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomDeleteWaitingRoomRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | [**String**](.md)|  |
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasRulesResponseCollection**](SchemasRulesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomEventDetails"></a>
# **waitingRoomEventDetails**
> EventResponse waitingRoomEventDetails(eventId, waitingRoomId, zoneIdentifier)

Event details

Fetches a single configured event for a waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
EventId eventId = new EventId(); // EventId | 
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    EventResponse result = apiInstance.waitingRoomEventDetails(eventId, waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomEventDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | [**EventId**](.md)|  |
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="waitingRoomGetWaitingRoomStatus"></a>
# **waitingRoomGetWaitingRoomStatus**
> CloudflareClientAPIStatusResponse waitingRoomGetWaitingRoomStatus(waitingRoomId, zoneIdentifier)

Get waiting room status

Fetches the status of a configured waiting room. Response fields include: 1. &#x60;status&#x60;: String indicating the status of the waiting room. The possible status are:  - **not_queueing** indicates that the configured thresholds have not been met and all users are going through to the origin.  - **queueing** indicates that the thresholds have been met and some users are held in the waiting room.  - **event_prequeueing** indicates that an event is active and is currently prequeueing users before it starts. 2. &#x60;event_id&#x60;: String of the current event&#x27;s &#x60;id&#x60; if an event is active, otherwise an empty string. 3. &#x60;estimated_queued_users&#x60;: Integer of the estimated number of users currently waiting in the queue. 4. &#x60;estimated_total_active_users&#x60;: Integer of the estimated number of users currently active on the origin. 5. &#x60;max_estimated_time_minutes&#x60;: Integer of the maximum estimated time currently presented to the users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CloudflareClientAPIStatusResponse result = apiInstance.waitingRoomGetWaitingRoomStatus(waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomGetWaitingRoomStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIStatusResponse**](CloudflareClientAPIStatusResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="waitingRoomListEvents"></a>
# **waitingRoomListEvents**
> EventResponseCollection waitingRoomListEvents(waitingRoomId, zoneIdentifier)

List events

Lists events for a waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    EventResponseCollection result = apiInstance.waitingRoomListEvents(waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomListEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**EventResponseCollection**](EventResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="waitingRoomListWaitingRoomRules"></a>
# **waitingRoomListWaitingRoomRules**
> SchemasRulesResponseCollection waitingRoomListWaitingRoomRules(waitingRoomId, zoneIdentifier)

List Waiting Room Rules

Lists rules for a waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasRulesResponseCollection result = apiInstance.waitingRoomListWaitingRoomRules(waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomListWaitingRoomRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasRulesResponseCollection**](SchemasRulesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="waitingRoomListWaitingRooms"></a>
# **waitingRoomListWaitingRooms**
> WaitingroomComponentsSchemasResponseCollection waitingRoomListWaitingRooms(zoneIdentifier)

List waiting rooms

Lists waiting rooms.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    WaitingroomComponentsSchemasResponseCollection result = apiInstance.waitingRoomListWaitingRooms(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomListWaitingRooms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**WaitingroomComponentsSchemasResponseCollection**](WaitingroomComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="waitingRoomPatchEvent"></a>
# **waitingRoomPatchEvent**
> EventResponse waitingRoomPatchEvent(body, eventId, waitingRoomId, zoneIdentifier)

Patch event

Patches a configured event for a waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
QueryEvent body = new QueryEvent(); // QueryEvent | 
EventId eventId = new EventId(); // EventId | 
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    EventResponse result = apiInstance.waitingRoomPatchEvent(body, eventId, waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomPatchEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QueryEvent**](QueryEvent.md)|  |
 **eventId** | [**EventId**](.md)|  |
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomPatchWaitingRoom"></a>
# **waitingRoomPatchWaitingRoom**
> WaitingroomComponentsSchemasSingleResponse waitingRoomPatchWaitingRoom(body, waitingRoomId, zoneIdentifier)

Patch waiting room

Patches a configured waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
CloudflareClientAPIQueryWaitingroom body = new CloudflareClientAPIQueryWaitingroom(); // CloudflareClientAPIQueryWaitingroom | 
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    WaitingroomComponentsSchemasSingleResponse result = apiInstance.waitingRoomPatchWaitingRoom(body, waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomPatchWaitingRoom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPIQueryWaitingroom**](CloudflareClientAPIQueryWaitingroom.md)|  |
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**WaitingroomComponentsSchemasSingleResponse**](WaitingroomComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomPatchWaitingRoomRule"></a>
# **waitingRoomPatchWaitingRoomRule**
> SchemasRulesResponseCollection waitingRoomPatchWaitingRoomRule(body, ruleId, waitingRoomId, zoneIdentifier)

Patch Waiting Room Rule

Patches a rule for a waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
PatchRule body = new PatchRule(); // PatchRule | 
String ruleId = "ruleId_example"; // String | 
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasRulesResponseCollection result = apiInstance.waitingRoomPatchWaitingRoomRule(body, ruleId, waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomPatchWaitingRoomRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PatchRule**](PatchRule.md)|  |
 **ruleId** | [**String**](.md)|  |
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasRulesResponseCollection**](SchemasRulesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomPreviewActiveEventDetails"></a>
# **waitingRoomPreviewActiveEventDetails**
> EventDetailsResponse waitingRoomPreviewActiveEventDetails(eventId, waitingRoomId, zoneIdentifier)

Preview active event details

Previews an event&#x27;s configuration as if it was active. Inherited fields from the waiting room will be displayed with their current values.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
EventId eventId = new EventId(); // EventId | 
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    EventDetailsResponse result = apiInstance.waitingRoomPreviewActiveEventDetails(eventId, waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomPreviewActiveEventDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | [**EventId**](.md)|  |
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**EventDetailsResponse**](EventDetailsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="waitingRoomReplaceWaitingRoomRules"></a>
# **waitingRoomReplaceWaitingRoomRules**
> SchemasRulesResponseCollection waitingRoomReplaceWaitingRoomRules(body, waitingRoomId, zoneIdentifier)

Replace Waiting Room Rules

Only available for the Waiting Room Advanced subscription. Replaces all rules for a waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
List<CreateRule> body = Arrays.asList(new CreateRule()); // List<CreateRule> | 
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasRulesResponseCollection result = apiInstance.waitingRoomReplaceWaitingRoomRules(body, waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomReplaceWaitingRoomRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;CreateRule&gt;**](CreateRule.md)|  |
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasRulesResponseCollection**](SchemasRulesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomUpdateEvent"></a>
# **waitingRoomUpdateEvent**
> EventResponse waitingRoomUpdateEvent(body, eventId, waitingRoomId, zoneIdentifier)

Update event

Updates a configured event for a waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
QueryEvent body = new QueryEvent(); // QueryEvent | 
EventId eventId = new EventId(); // EventId | 
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    EventResponse result = apiInstance.waitingRoomUpdateEvent(body, eventId, waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomUpdateEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**QueryEvent**](QueryEvent.md)|  |
 **eventId** | [**EventId**](.md)|  |
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomUpdateWaitingRoom"></a>
# **waitingRoomUpdateWaitingRoom**
> WaitingroomComponentsSchemasSingleResponse waitingRoomUpdateWaitingRoom(body, waitingRoomId, zoneIdentifier)

Update waiting room

Updates a configured waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
CloudflareClientAPIQueryWaitingroom body = new CloudflareClientAPIQueryWaitingroom(); // CloudflareClientAPIQueryWaitingroom | 
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    WaitingroomComponentsSchemasSingleResponse result = apiInstance.waitingRoomUpdateWaitingRoom(body, waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomUpdateWaitingRoom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPIQueryWaitingroom**](CloudflareClientAPIQueryWaitingroom.md)|  |
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**WaitingroomComponentsSchemasSingleResponse**](WaitingroomComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitingRoomWaitingRoomDetails"></a>
# **waitingRoomWaitingRoomDetails**
> WaitingroomComponentsSchemasSingleResponse waitingRoomWaitingRoomDetails(waitingRoomId, zoneIdentifier)

Waiting room details

Fetches a single configured waiting room.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WaitingRoomApi;

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


WaitingRoomApi apiInstance = new WaitingRoomApi();
WaitingRoomId waitingRoomId = new WaitingRoomId(); // WaitingRoomId | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    WaitingroomComponentsSchemasSingleResponse result = apiInstance.waitingRoomWaitingRoomDetails(waitingRoomId, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WaitingRoomApi#waitingRoomWaitingRoomDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **waitingRoomId** | [**WaitingRoomId**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**WaitingroomComponentsSchemasSingleResponse**](WaitingroomComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

