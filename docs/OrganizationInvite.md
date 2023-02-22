# OrganizationInvite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationIsEnforcingTwofactor** | **Boolean** | Current status of two-factor enforcement on the organization. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current status of the invitation. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
ACCEPTED | &quot;accepted&quot;
REJECTED | &quot;rejected&quot;
CANCELED | &quot;canceled&quot;
LEFT | &quot;left&quot;
EXPIRED | &quot;expired&quot;
