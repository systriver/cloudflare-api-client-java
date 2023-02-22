# Base

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comment** | **String** |  |  [optional]
**content** | **String** |  |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) | When the record was created. |  [optional]
**data** | **Object** | Metadata about the record. |  [optional]
**id** | **String** |  |  [optional]
**locked** | **Boolean** | Whether this record can be modified/deleted (true means it&#x27;s managed by Cloudflare). |  [optional]
**meta** | [**BaseMeta**](BaseMeta.md) |  |  [optional]
**modifiedOn** | [**OffsetDateTime**](OffsetDateTime.md) | When the record was last modified. |  [optional]
**name** | **String** |  |  [optional]
**proxiable** | **Boolean** | Whether the record can be proxied by Cloudflare or not. |  [optional]
**proxied** | **Boolean** |  |  [optional]
**tags** | [**Tags**](Tags.md) |  |  [optional]
**ttl** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**type** | **String** |  |  [optional]
**zoneId** | **String** |  |  [optional]
**zoneName** | **String** | The domain of the record. |  [optional]
