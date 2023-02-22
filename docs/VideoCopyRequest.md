# VideoCopyRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedOrigins** | [**AllowedOrigins**](AllowedOrigins.md) |  |  [optional]
**creator** | **String** |  |  [optional]
**requireSignedURLs** | **Boolean** |  |  [optional]
**thumbnailTimestampPct** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**url** | **String** | A video&#x27;s URL. The server must be publicly routable and support &#x60;HTTP HEAD&#x60; requests and &#x60;HTTP GET&#x60; range requests. The server should respond to &#x60;HTTP HEAD&#x60; requests with a &#x60;content-range&#x60; header that includes the size of the file. | 
**watermark** | [**WatermarkAtUpload**](WatermarkAtUpload.md) |  |  [optional]
