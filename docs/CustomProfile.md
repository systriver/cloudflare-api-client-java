# CustomProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedMatchCount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**description** | **String** | The description of the profile. |  [optional]
**entries** | [**List&lt;CustomEntry&gt;**](CustomEntry.md) | The entries for this profile. |  [optional]
**id** | [**ProfileId**](ProfileId.md) |  |  [optional]
**name** | **String** | The name of the profile. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the profile. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CUSTOM | &quot;custom&quot;
