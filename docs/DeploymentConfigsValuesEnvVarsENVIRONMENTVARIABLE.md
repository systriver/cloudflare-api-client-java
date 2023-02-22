# DeploymentConfigsValuesEnvVarsENVIRONMENTVARIABLE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of environment variable (plain text or secret) |  [optional]
**value** | **String** | Environment variable value. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PLAIN_TEXT | &quot;plain_text&quot;
SECRET_TEXT | &quot;secret_text&quot;
