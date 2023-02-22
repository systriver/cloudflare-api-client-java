# PurgeByCacheTagsOrHostsOrPrefixes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hosts** | **List&lt;String&gt;** | Any assets at URLs with a host that matches one of the provided values will be purged from the Cloudflare cache. |  [optional]
**prefixes** | **List&lt;String&gt;** | Any assets at URLs that match the prefix will be purged from the Cloudflare cache. For example, a.com/b will purge a.com/b/c/d.png but not a.com/bc.png. The prefixes a.com/b and a.com/b/c are redundant. |  [optional]
**tags** | **List&lt;String&gt;** | Any assets served with a Cache-Tag header that matches one of the provided values will be purged from the Cloudflare cache. |  [optional]
