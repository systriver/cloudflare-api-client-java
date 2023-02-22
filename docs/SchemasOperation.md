# SchemasOperation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completed** | **String** | The RFC 3339 timestamp of when the operation was completed. |  [optional]
**error** | **String** | A message describing the error when the status is &#x60;failed&#x60;. |  [optional]
**id** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) | The current status of the asynchronous operation. | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
RUNNING | &quot;running&quot;
COMPLETED | &quot;completed&quot;
FAILED | &quot;failed&quot;
