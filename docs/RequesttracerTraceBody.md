# RequesttracerTraceBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | [**AccountsaccountIdentifierrequesttracertraceBody**](AccountsaccountIdentifierrequesttracertraceBody.md) |  |  [optional]
**context** | [**AccountsaccountIdentifierrequesttracertraceContext**](AccountsaccountIdentifierrequesttracertraceContext.md) |  |  [optional]
**cookies** | **Map&lt;String, String&gt;** | Cookies added to tracing request |  [optional]
**headers** | **Map&lt;String, String&gt;** | Headers added to tracing request |  [optional]
**method** | **String** | HTTP Method of tracing request | 
**protocol** | **String** | HTTP Protocol of tracing request |  [optional]
**skipResponse** | **Boolean** | Skip sending the request to the Origin server after all rules evaluation |  [optional]
**url** | **String** | URL to which perform tracing request | 
