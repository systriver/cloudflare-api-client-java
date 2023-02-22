# Deployments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | **List&lt;Object&gt;** | A list of alias URLs pointing to this deployment. |  [optional]
**buildConfig** | **Object** |  |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) | When the deployment was created. |  [optional]
**deploymentTrigger** | [**DeploymentsDeploymentTrigger**](DeploymentsDeploymentTrigger.md) |  |  [optional]
**envVars** | **Object** | A dict of env variables to build this deploy. |  [optional]
**environment** | **String** | Type of deploy. |  [optional]
**id** | **String** | Id of the deployment. |  [optional]
**isSkipped** | **Boolean** | If the deployment has been skipped. |  [optional]
**latestStage** | **Object** |  |  [optional]
**modifiedOn** | [**OffsetDateTime**](OffsetDateTime.md) | When the deployment was last modified. |  [optional]
**projectId** | **String** | Id of the project. |  [optional]
**projectName** | **String** | Name of the project. |  [optional]
**shortId** | **String** | Short Id (8 character) of the deployment. |  [optional]
**source** | **Object** |  |  [optional]
**stages** | [**List&lt;Stage&gt;**](Stage.md) | List of past stages. |  [optional]
**url** | **String** | The live URL to view this deployment. |  [optional]
