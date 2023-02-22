# Projects

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buildConfig** | [**BuildConfig**](BuildConfig.md) |  |  [optional]
**canonicalDeployment** | **OneOfprojectsCanonicalDeployment** | Most recent deployment to the repo. |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) | When the project was created. |  [optional]
**deploymentConfigs** | [**DeploymentConfigs**](DeploymentConfigs.md) |  |  [optional]
**domains** | **List&lt;Object&gt;** | A list of associated custom domains for the project. |  [optional]
**id** | **String** | Id of the project. |  [optional]
**latestDeployment** | **OneOfprojectsLatestDeployment** | Most recent deployment to the repo. |  [optional]
**name** | **String** | Name of the project. |  [optional]
**productionBranch** | **String** | Production branch of the project. Used to identify production deployments. |  [optional]
**source** | **Object** |  |  [optional]
**subdomain** | **String** | The Cloudflare subdomain associated with the project. |  [optional]
