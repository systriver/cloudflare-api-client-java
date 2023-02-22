# BulkWriteInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base64** | **Boolean** | Whether or not the server should base64 decode the value before storing it. Useful for writing values that wouldn&#x27;t otherwise be valid JSON strings, such as images. |  [optional]
**expiration** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**expirationTtl** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**key** | **String** |  |  [optional]
**metadata** | [**ListMetadata**](ListMetadata.md) |  |  [optional]
**value** | **String** | A UTF-8 encoded string to be stored, up to 10 MB in length. |  [optional]
