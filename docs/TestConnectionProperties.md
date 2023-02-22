# TestConnectionProperties

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bodyHash** | **String** | Hash version of body. |  [optional]
**bodySize** | **String** | Size of the body in bytes. |  [optional]
**cfCacheStatus** | **String** | Lists any &#x60;cf-cache-status&#x60; present. |  [optional]
**cfRay** | **String** | Lists any &#x60;cf-ray&#x60; present. |  [optional]
**cfWanError** | **String** | Lists any &#x60;cf-wan-error&#x60; present. |  [optional]
**cloudflare** | **String** | Whether Cloudflare is enabled on the host. |  [optional]
**connectionClose** | **Boolean** | Connection closed or open. |  [optional]
**elapsedTime** | **String** | Amount of seconds that the test lasted. |  [optional]
**hostName** | **String** | The hostname queried. |  [optional]
**httpStatus** | [**BigDecimal**](BigDecimal.md) | The HTTP status response code. |  [optional]
**method** | **String** | HTTP Method used to test the connection. |  [optional]
**missingHeaders** | **String** | What headers are missing. |  [optional]
**protocol** | **String** | Protocol used to test the connection. |  [optional]
**railgun** | **String** | Indicates if Railgun is enabled on the queried hostname. |  [optional]
**responseStatus** | **String** | HTTP Status code. |  [optional]
**url** | **String** | Url of the domain you can compare the connection to. |  [optional]
