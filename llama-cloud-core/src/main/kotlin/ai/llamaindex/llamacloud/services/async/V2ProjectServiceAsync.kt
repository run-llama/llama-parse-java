// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectGetParams
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectGetResponse
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectListPageAsync
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V2ProjectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ProjectServiceAsync

    /** List projects in an organization. Requires `organization_id` or a project-scoped API key. */
    fun list(): CompletableFuture<V2ProjectListPageAsync> = list(V2ProjectListParams.none())

    /** @see list */
    fun list(
        params: V2ProjectListParams = V2ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2ProjectListPageAsync>

    /** @see list */
    fun list(
        params: V2ProjectListParams = V2ProjectListParams.none()
    ): CompletableFuture<V2ProjectListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<V2ProjectListPageAsync> =
        list(V2ProjectListParams.none(), requestOptions)

    /** Get a project by ID. */
    fun get(projectId: String): CompletableFuture<V2ProjectGetResponse> =
        get(projectId, V2ProjectGetParams.none())

    /** @see get */
    fun get(
        projectId: String,
        params: V2ProjectGetParams = V2ProjectGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2ProjectGetResponse> =
        get(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see get */
    fun get(
        projectId: String,
        params: V2ProjectGetParams = V2ProjectGetParams.none(),
    ): CompletableFuture<V2ProjectGetResponse> = get(projectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: V2ProjectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2ProjectGetResponse>

    /** @see get */
    fun get(params: V2ProjectGetParams): CompletableFuture<V2ProjectGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        projectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2ProjectGetResponse> =
        get(projectId, V2ProjectGetParams.none(), requestOptions)

    /**
     * A view of [V2ProjectServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2ProjectServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v2/projects`, but is otherwise the same as
         * [V2ProjectServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<V2ProjectListPageAsync>> =
            list(V2ProjectListParams.none())

        /** @see list */
        fun list(
            params: V2ProjectListParams = V2ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2ProjectListPageAsync>>

        /** @see list */
        fun list(
            params: V2ProjectListParams = V2ProjectListParams.none()
        ): CompletableFuture<HttpResponseFor<V2ProjectListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<V2ProjectListPageAsync>> =
            list(V2ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/projects/{project_id}`, but is otherwise the
         * same as [V2ProjectServiceAsync.get].
         */
        fun get(projectId: String): CompletableFuture<HttpResponseFor<V2ProjectGetResponse>> =
            get(projectId, V2ProjectGetParams.none())

        /** @see get */
        fun get(
            projectId: String,
            params: V2ProjectGetParams = V2ProjectGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2ProjectGetResponse>> =
            get(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see get */
        fun get(
            projectId: String,
            params: V2ProjectGetParams = V2ProjectGetParams.none(),
        ): CompletableFuture<HttpResponseFor<V2ProjectGetResponse>> =
            get(projectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: V2ProjectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2ProjectGetResponse>>

        /** @see get */
        fun get(
            params: V2ProjectGetParams
        ): CompletableFuture<HttpResponseFor<V2ProjectGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2ProjectGetResponse>> =
            get(projectId, V2ProjectGetParams.none(), requestOptions)
    }
}
