# AdaptiveRouting

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**failoverAcrossPools** | **Boolean** | Extends zero-downtime failover of requests to healthy origins from alternate pools, when no healthy alternate exists in the same pool, according to the failover order defined by traffic and origin steering. When set false (the default) zero-downtime failover will only occur between origins within the same pool. See &#x60;session_affinity_attributes&#x60; for control over when sessions are broken or reassigned. |  [optional]
