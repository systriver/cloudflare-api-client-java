# ResourceReference

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**referenceType** | [**ReferenceTypeEnum**](#ReferenceTypeEnum) | When listed as a reference, the type (direction) of the reference. |  [optional]
**references** | **List&lt;Object&gt;** | A list of references to (referrer) or from (referral) this resource. |  [optional]
**resourceId** | **Object** |  |  [optional]
**resourceName** | **String** | The human-identifiable name of the resource. |  [optional]
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | The type of the resource. |  [optional]

<a name="ReferenceTypeEnum"></a>
## Enum: ReferenceTypeEnum
Name | Value
---- | -----
REFERRAL | &quot;referral&quot;
REFERRER | &quot;referrer&quot;

<a name="ResourceTypeEnum"></a>
## Enum: ResourceTypeEnum
Name | Value
---- | -----
LOAD_BALANCER | &quot;load_balancer&quot;
MONITOR | &quot;monitor&quot;
POOL | &quot;pool&quot;
