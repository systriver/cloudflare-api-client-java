# CustomNS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dnsRecords** | [**List&lt;CustomNSDnsRecords&gt;**](CustomNSDnsRecords.md) | A and AAAA records associated with the nameserver. | 
**nsName** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) | Verification status of the nameserver. | 
**zoneTag** | **String** |  | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
MOVED | &quot;moved&quot;
PENDING | &quot;pending&quot;
VERIFIED | &quot;verified&quot;
