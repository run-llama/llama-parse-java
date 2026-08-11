// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectGetParams
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectGetResponse
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectListPage
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface V2ProjectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ProjectService

    /** List projects in an organization. Requires `organization_id` or a project-scoped API key. */
    fun list(): V2ProjectListPage = list(V2ProjectListParams.none())

    /** @see list */
    fun list(
        params: V2ProjectListParams = V2ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2ProjectListPage

    /** @see list */
    fun list(params: V2ProjectListParams = V2ProjectListParams.none()): V2ProjectListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): V2ProjectListPage =
        list(V2ProjectListParams.none(), requestOptions)

    /** Get a project by ID. */
    fun get(projectId: String): V2ProjectGetResponse = get(projectId, V2ProjectGetParams.none())

    /** @see get */
    fun get(
        projectId: String,
        params: V2ProjectGetParams = V2ProjectGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2ProjectGetResponse = get(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see get */
    fun get(
        projectId: String,
        params: V2ProjectGetParams = V2ProjectGetParams.none(),
    ): V2ProjectGetResponse = get(projectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: V2ProjectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2ProjectGetResponse

    /** @see get */
    fun get(params: V2ProjectGetParams): V2ProjectGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(projectId: String, requestOptions: RequestOptions): V2ProjectGetResponse =
        get(projectId, V2ProjectGetParams.none(), requestOptions)

    /** A view of [V2ProjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ProjectService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v2/projects`, but is otherwise the same as
         * [V2ProjectService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<V2ProjectListPage> = list(V2ProjectListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: V2ProjectListParams = V2ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2ProjectListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: V2ProjectListParams = V2ProjectListParams.none()
        ): HttpResponseFor<V2ProjectListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<V2ProjectListPage> =
            list(V2ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/projects/{project_id}`, but is otherwise the
         * same as [V2ProjectService.get].
         */
        @MustBeClosed
        fun get(projectId: String): HttpResponseFor<V2ProjectGetResponse> =
            get(projectId, V2ProjectGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            projectId: String,
            params: V2ProjectGetParams = V2ProjectGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2ProjectGetResponse> =
            get(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            projectId: String,
            params: V2ProjectGetParams = V2ProjectGetParams.none(),
        ): HttpResponseFor<V2ProjectGetResponse> = get(projectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: V2ProjectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2ProjectGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: V2ProjectGetParams): HttpResponseFor<V2ProjectGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            projectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2ProjectGetResponse> =
            get(projectId, V2ProjectGetParams.none(), requestOptions)
    }
}
