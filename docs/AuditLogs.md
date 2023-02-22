# AuditLogs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**AuditlogsAction**](AuditlogsAction.md) |  |  [optional]
**actor** | [**AuditlogsActor**](AuditlogsActor.md) |  |  [optional]
**id** | **String** | A string that uniquely identifies the audit log. |  [optional]
**_interface** | **String** | The source of the event. |  [optional]
**metadata** | **Object** | An object which can lend more context to the action being logged. This is a flexible value and varies between different actions. |  [optional]
**newValue** | **String** | The new value of the resource that was modified. |  [optional]
**oldValue** | **String** | The value of the resource before it was modified. |  [optional]
**owner** | [**InlineResponse200104**](InlineResponse200104.md) |  |  [optional]
**resource** | [**AuditlogsResource**](AuditlogsResource.md) |  |  [optional]
**when** | [**OffsetDateTime**](OffsetDateTime.md) | A UTC RFC3339 timestamp that specifies when the action being logged occured. |  [optional]
