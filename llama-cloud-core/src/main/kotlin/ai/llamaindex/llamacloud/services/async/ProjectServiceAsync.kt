// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.projects.Project
import ai.llamaindex.llamacloud.models.projects.ProjectGetParams
import ai.llamaindex.llamacloud.models.projects.ProjectListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProjectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectServiceAsync

    /** List projects or get one by name */
    fun list(): CompletableFuture<List<Project>> = list(ProjectListParams.none())

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Project>>

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none()
    ): CompletableFuture<List<Project>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<Project>> =
        list(ProjectListParams.none(), requestOptions)

    /** Get a project by ID. */
    fun get(projectId: String): CompletableFuture<Project> = get(projectId, ProjectGetParams.none())

    /** @see get */
    fun get(
        projectId: String,
        params: ProjectGetParams = ProjectGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project> =
        get(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see get */
    fun get(
        projectId: String,
        params: ProjectGetParams = ProjectGetParams.none(),
    ): CompletableFuture<Project> = get(projectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ProjectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project>

    /** @see get */
    fun get(params: ProjectGetParams): CompletableFuture<Project> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(projectId: String, requestOptions: RequestOptions): CompletableFuture<Project> =
        get(projectId, ProjectGetParams.none(), requestOptions)

    /**
     * A view of [ProjectServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProjectServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/projects`, but is otherwise the same as
         * [ProjectServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<Project>>> =
            list(ProjectListParams.none())

        /** @see list */
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Project>>>

        /** @see list */
        fun list(
            params: ProjectListParams = ProjectListParams.none()
        ): CompletableFuture<HttpResponseFor<List<Project>>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<Project>>> =
            list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/projects/{project_id}`, but is otherwise the
         * same as [ProjectServiceAsync.get].
         */
        fun get(projectId: String): CompletableFuture<HttpResponseFor<Project>> =
            get(projectId, ProjectGetParams.none())

        /** @see get */
        fun get(
            projectId: String,
            params: ProjectGetParams = ProjectGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>> =
            get(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see get */
        fun get(
            projectId: String,
            params: ProjectGetParams = ProjectGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Project>> =
            get(projectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ProjectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>>

        /** @see get */
        fun get(params: ProjectGetParams): CompletableFuture<HttpResponseFor<Project>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Project>> =
            get(projectId, ProjectGetParams.none(), requestOptions)
    }
}
