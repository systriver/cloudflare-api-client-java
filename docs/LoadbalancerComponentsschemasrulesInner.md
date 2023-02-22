# LoadbalancerComponentsschemasrulesInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**condition** | **String** | The condition expressions to evaluate. If the condition evaluates to true, the overrides or fixed_response in this rule will be applied. An empty condition is always true. For more details on condition expressions, please see https://developers.cloudflare.com/load-balancing/understand-basics/load-balancing-rules/expressions. |  [optional]
**disabled** | **Boolean** | Disable this specific rule. It will no longer be evaluated by this load balancer. |  [optional]
**fixedResponse** | **Object** | A collection of fields used to directly respond to the eyeball instead of routing to a pool. If a fixed_response is supplied the rule will be marked as terminates. |  [optional]
**name** | **String** | Name of this rule. Only used for human readability. |  [optional]
**overrides** | **Object** | A collection of overrides to apply to the load balancer when this rule&#x27;s condition is true. All fields are optional. |  [optional]
**priority** | **Integer** | The order in which rules should be executed in relation to each other. Lower values are executed first. Values do not need to be sequential. If no value is provided for any rule the array order of the rules field will be used to assign a priority. |  [optional]
**terminates** | **Boolean** | If this rule&#x27;s condition is true, this causes rule evaluation to stop after processing this rule. |  [optional]
