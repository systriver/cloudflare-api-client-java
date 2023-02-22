# RuleSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addHeaders** | **Object** | Add custom headers to allowed requests, in the form of key-value pairs. Keys are header names, pointing to an array with its header value(s). |  [optional]
**bisoAdminControls** | [**RulesettingsBisoAdminControls**](RulesettingsBisoAdminControls.md) |  |  [optional]
**blockPageEnabled** | **Boolean** | Enable the custom block page. |  [optional]
**blockReason** | **String** | The text describing why this block occurred that will be displayed on the custom block page (if enabled). |  [optional]
**checkSession** | [**RulesettingsCheckSession**](RulesettingsCheckSession.md) |  |  [optional]
**egress** | [**RulesettingsEgress**](RulesettingsEgress.md) |  |  [optional]
**insecureDisableDnssecValidation** | **Boolean** | INSECURE - disable DNSSEC validation (for allow actions). |  [optional]
**ipCategories** | **Boolean** | Include IPs in DNS resolver category blocks. By default categories only block on domain names. |  [optional]
**l4override** | [**RulesettingsL4override**](RulesettingsL4override.md) |  |  [optional]
**overrideHost** | **String** | Override matching DNS queries with this. |  [optional]
**overrideIps** | **List&lt;String&gt;** | Override matching DNS queries with this. |  [optional]
**payloadLog** | [**RulesettingsPayloadLog**](RulesettingsPayloadLog.md) |  |  [optional]
