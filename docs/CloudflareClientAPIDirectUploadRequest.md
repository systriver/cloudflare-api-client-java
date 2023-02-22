# CloudflareClientAPIDirectUploadRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedOrigins** | [**AllowedOrigins**](AllowedOrigins.md) |  |  [optional]
**creator** | **String** |  |  [optional]
**expiry** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time after upload when videos will not be accepted. |  [optional]
**maxDurationSeconds** | **Integer** | Calculates the amount of time a video occupies before the video is uploaded. Direct uploads occupy minutes of videos on your Stream account until they are expired. After upload, the upload duration is used instead. If a video longer than the value is uploaded, the video results in an error. | 
**requireSignedURLs** | **Boolean** |  |  [optional]
**thumbnailTimestampPct** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**watermark** | [**WatermarkAtUpload**](WatermarkAtUpload.md) |  |  [optional]
