// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.projects.Project
import ai.llamaindex.llamacloud.models.projects.ProjectGetParams
import ai.llamaindex.llamacloud.models.projects.ProjectListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ProjectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService

    /** List projects or get one by name */
    fun list(): List<Project> = list(ProjectListParams.none())

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Project>

    /** @see list */
    fun list(params: ProjectListParams = ProjectListParams.none()): List<Project> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<Project> =
        list(ProjectListParams.none(), requestOptions)

    /** Get a project by ID. */
    fun get(projectId: String): Project = get(projectId, ProjectGetParams.none())

    /** @see get */
    fun get(
        projectId: String,
        params: ProjectGetParams = ProjectGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project = get(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see get */
    fun get(projectId: String, params: ProjectGetParams = ProjectGetParams.none()): Project =
        get(projectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ProjectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project

    /** @see get */
    fun get(params: ProjectGetParams): Project = get(params, RequestOptions.none())

    /** @see get */
    fun get(projectId: String, requestOptions: RequestOptions): Project =
        get(projectId, ProjectGetParams.none(), requestOptions)

    /** A view of [ProjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/projects`, but is otherwise the same as
         * [ProjectService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<List<Project>> = list(ProjectListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Project>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none()
        ): HttpResponseFor<List<Project>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Project>> =
            list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/projects/{project_id}`, but is otherwise the
         * same as [ProjectService.get].
         */
        @MustBeClosed
        fun get(projectId: String): HttpResponseFor<Project> =
            get(projectId, ProjectGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            projectId: String,
            params: ProjectGetParams = ProjectGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project> =
            get(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            projectId: String,
            params: ProjectGetParams = ProjectGetParams.none(),
        ): HttpResponseFor<Project> = get(projectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ProjectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project>

        /** @see get */
        @MustBeClosed
        fun get(params: ProjectGetParams): HttpResponseFor<Project> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(projectId: String, requestOptions: RequestOptions): HttpResponseFor<Project> =
            get(projectId, ProjectGetParams.none(), requestOptions)
    }
}
