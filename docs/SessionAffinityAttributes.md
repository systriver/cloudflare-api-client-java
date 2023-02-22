# SessionAffinityAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**drainDuration** | [**BigDecimal**](BigDecimal.md) | Configures the drain duration in seconds. This field is only used when session affinity is enabled on the load balancer. |  [optional]
**samesite** | [**SamesiteEnum**](#SamesiteEnum) | Configures the SameSite attribute on session affinity cookie. Value \&quot;Auto\&quot; will be translated to \&quot;Lax\&quot; or \&quot;None\&quot; depending if Always Use HTTPS is enabled. Note: when using value \&quot;None\&quot;, the secure attribute can not be set to \&quot;Never\&quot;. |  [optional]
**secure** | [**SecureEnum**](#SecureEnum) | Configures the Secure attribute on session affinity cookie. Value \&quot;Always\&quot; indicates the Secure attribute will be set in the Set-Cookie header, \&quot;Never\&quot; indicates the Secure attribute will not be set, and \&quot;Auto\&quot; will set the Secure attribute depending if Always Use HTTPS is enabled. |  [optional]
**zeroDowntimeFailover** | [**ZeroDowntimeFailoverEnum**](#ZeroDowntimeFailoverEnum) | Configures the zero-downtime failover between origins within a pool when session affinity is enabled. Value \&quot;none\&quot; means no failover takes place for sessions pinned to the origin (default). Value \&quot;temporary\&quot; means traffic will be sent to another other healthy origin until the originally pinned origin is available; note that this can potentially result in heavy origin flapping. Value \&quot;sticky\&quot; means the session affinity cookie is updated and subsequent requests are sent to the new origin. This feature is currently incompatible with Argo, Tiered Cache, and Bandwidth Alliance. |  [optional]

<a name="SamesiteEnum"></a>
## Enum: SamesiteEnum
Name | Value
---- | -----
AUTO | &quot;Auto&quot;
LAX | &quot;Lax&quot;
NONE | &quot;None&quot;
STRICT | &quot;Strict&quot;

<a name="SecureEnum"></a>
## Enum: SecureEnum
Name | Value
---- | -----
AUTO | &quot;Auto&quot;
ALWAYS | &quot;Always&quot;
NEVER | &quot;Never&quot;

<a name="ZeroDowntimeFailoverEnum"></a>
## Enum: ZeroDowntimeFailoverEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
TEMPORARY | &quot;temporary&quot;
STICKY | &quot;sticky&quot;
