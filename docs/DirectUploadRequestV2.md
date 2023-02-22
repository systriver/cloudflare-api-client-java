# DirectUploadRequestV2

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expiry** | [**OffsetDateTime**](OffsetDateTime.md) | The date after which the upload will not be accepted. Minimum: Now + 2 minutes. Maximum: Now + 6 hours. |  [optional]
**id** | **String** | Optional Image Custom ID. Up to 1024 chars. Can include any number of subpaths, and utf8 characters. Cannot start nor end with a / (forward slash). Cannot be a UUID. |  [optional]
**metadata** | **Object** | User modifiable key-value store. Can be used for keeping references to another system of record, for managing images. |  [optional]
**requireSignedURLs** | **Boolean** | Indicates whether the image requires a signature token to be accessed. |  [optional]
