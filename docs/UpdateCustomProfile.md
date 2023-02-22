# UpdateCustomProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedMatchCount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**description** | **String** | The description of the profile. |  [optional]
**entries** | [**List&lt;CustomEntry&gt;**](CustomEntry.md) | The entries for this profile. Array elements with IDs are modifying the existing entry with that ID. Elements without ID will create new entries. Any entry not in the list will be deleted. |  [optional]
**name** | **String** | The name of the profile. |  [optional]
