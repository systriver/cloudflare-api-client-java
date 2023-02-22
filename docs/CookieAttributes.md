# CookieAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**samesite** | [**SamesiteEnum**](#SamesiteEnum) | Configures the SameSite attribute on the waiting room cookie. Value &#x60;auto&#x60; will be translated to &#x60;lax&#x60; or &#x60;none&#x60; depending if **Always Use HTTPS** is enabled. Note that when using value &#x60;none&#x60;, the secure attribute cannot be set to &#x60;never&#x60;. |  [optional]
**secure** | [**SecureEnum**](#SecureEnum) | Configures the Secure attribute on the waiting room cookie. Value &#x60;always&#x60; indicates that the Secure attribute will be set in the Set-Cookie header, &#x60;never&#x60; indicates that the Secure attribute will not be set, and &#x60;auto&#x60; will set the Secure attribute depending if **Always Use HTTPS** is enabled. |  [optional]

<a name="SamesiteEnum"></a>
## Enum: SamesiteEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
LAX | &quot;lax&quot;
NONE | &quot;none&quot;
STRICT | &quot;strict&quot;

<a name="SecureEnum"></a>
## Enum: SecureEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
ALWAYS | &quot;always&quot;
NEVER | &quot;never&quot;
