# PcapsOwnershipResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationConf** | **String** |  | 
**filename** | **String** |  | 
**id** | **String** | The bucket ID associated with the packet captures API. | 
**status** | [**StatusEnum**](#StatusEnum) | The status of the ownership challenge. Can be pending, success or failed. | 
**submitted** | **String** | The RFC 3339 timestamp when the bucket was added to packet captures API. | 
**validated** | **String** | The RFC 3339 timestamp when the bucket was validated. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
SUCCESS | &quot;success&quot;
FAILED | &quot;failed&quot;
