# SaasApp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consumerServiceUrl** | **String** | The service provider&#x27;s endpoint that is responsible for receiving and parsing a SAML assertion. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**customAttributes** | [**SaasAppCustomAttributes**](SaasAppCustomAttributes.md) |  |  [optional]
**idpEntityId** | **String** | The unique identifier for your SaaS application. |  [optional]
**nameIdFormat** | [**NameIdFormatEnum**](#NameIdFormatEnum) | The format of the name identifier sent to the SaaS application. |  [optional]
**publicKey** | **String** | The Access public certificate that will be used to verify your identity. |  [optional]
**spEntityId** | **String** | A globally unique name for an identity or service provider. |  [optional]
**ssoEndpoint** | **String** | The endpoint where your SaaS application will send login requests. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="NameIdFormatEnum"></a>
## Enum: NameIdFormatEnum
Name | Value
---- | -----
ID | &quot;id&quot;
EMAIL | &quot;email&quot;
