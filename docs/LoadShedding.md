# LoadShedding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultPercent** | [**BigDecimal**](BigDecimal.md) | The percent of traffic to shed from the pool, according to the default policy. Applies to new sessions and traffic without session affinity. |  [optional]
**defaultPolicy** | [**DefaultPolicyEnum**](#DefaultPolicyEnum) | The default policy to use when load shedding. A random policy randomly sheds a given percent of requests. A hash policy computes a hash over the CF-Connecting-IP address and sheds all requests originating from a percent of IPs. |  [optional]
**sessionPercent** | [**BigDecimal**](BigDecimal.md) | The percent of existing sessions to shed from the pool, according to the session policy. |  [optional]
**sessionPolicy** | [**SessionPolicyEnum**](#SessionPolicyEnum) | Only the hash policy is supported for existing sessions (to avoid exponential decay). |  [optional]

<a name="DefaultPolicyEnum"></a>
## Enum: DefaultPolicyEnum
Name | Value
---- | -----
RANDOM | &quot;random&quot;
HASH | &quot;hash&quot;

<a name="SessionPolicyEnum"></a>
## Enum: SessionPolicyEnum
Name | Value
---- | -----
HASH | &quot;hash&quot;
