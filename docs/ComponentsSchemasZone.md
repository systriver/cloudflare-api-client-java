# ComponentsSchemasZone

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activatedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The last time proof of ownership was detected and the zone was made active | 
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) | When the zone was created | 
**developmentMode** | [**BigDecimal**](BigDecimal.md) | The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is 0. | 
**id** | **String** |  | 
**modifiedOn** | [**OffsetDateTime**](OffsetDateTime.md) | When the zone was last modified | 
**name** | **String** | The domain name | 
**originalDnshost** | **String** | DNS host at the time of switching to Cloudflare | 
**originalNameServers** | **List&lt;String&gt;** | Original name servers before moving to Cloudflare Notes: Is this only available for full zones? | 
**originalRegistrar** | **String** | Registrar for the domain at the time of switching to Cloudflare | 
