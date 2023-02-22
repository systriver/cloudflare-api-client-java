# ZoneComponentsSchemasPatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paused** | **Boolean** |  |  [optional]
**plan** | [**ZoneComponentsschemaspatchPlan**](ZoneComponentsschemaspatchPlan.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. This parameter is only available to Enterprise customers or if it has been explicitly enabled on a zone. |  [optional]
**vanityNameServers** | [**VanityNameServers**](VanityNameServers.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FULL | &quot;full&quot;
PARTIAL | &quot;partial&quot;
