/*
 * Cloudflare API
 * Interact with Cloudflare's products and services via the Cloudflare API. For more information on how to create and troubleshoot API tokens, refer to our [API fundamentals](https://developers.cloudflare.com/fundamentals/api/).  Totally new to Cloudflare? [Start here](https://developers.cloudflare.com/fundamentals/get-started/).
 *
 * OpenAPI spec version: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.InlineResponse4xx115;
import io.swagger.client.model.InlineResponse4xx116;
import io.swagger.client.model.InlineResponse4xx117;
import io.swagger.client.model.InlineResponse4xx118;
import io.swagger.client.model.NewProjectResponse;
import io.swagger.client.model.ProjectResponse;
import io.swagger.client.model.Projects;
import io.swagger.client.model.ProjectsResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PagesProjectApi
 */
@Ignore
public class PagesProjectApiTest {

    private final PagesProjectApi api = new PagesProjectApi();

    /**
     * Create project
     *
     * Make a new project.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pagesProjectCreateProjectTest() throws Exception {
        Projects body = null;
        String accountIdentifier = null;
        NewProjectResponse response = api.pagesProjectCreateProject(body, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Delete project
     *
     * Destroy a project by name.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pagesProjectDeleteProjectTest() throws Exception {
        String projectName = null;
        String accountIdentifier = null;
        Object response = api.pagesProjectDeleteProject(projectName, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get project
     *
     * Fetch a project by name.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pagesProjectGetProjectTest() throws Exception {
        String projectName = null;
        String accountIdentifier = null;
        ProjectResponse response = api.pagesProjectGetProject(projectName, accountIdentifier);

        // TODO: test validations
    }
    /**
     * Get projects
     *
     * Fetch a list of all user projects.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pagesProjectGetProjectsTest() throws Exception {
        String accountIdentifier = null;
        ProjectsResponse response = api.pagesProjectGetProjects(accountIdentifier);

        // TODO: test validations
    }
    /**
     * Update project
     *
     * Set new attributes for an existing project. Modify environment variables. To delete an environment variable, set the key to null.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pagesProjectUpdateProjectTest() throws Exception {
        Object body = null;
        String projectName = null;
        String accountIdentifier = null;
        NewProjectResponse response = api.pagesProjectUpdateProject(body, projectName, accountIdentifier);

        // TODO: test validations
    }
}