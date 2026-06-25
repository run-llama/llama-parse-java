// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.datasources.DataSource
import com.llamacloud_prod.api.models.datasources.DataSourceCreateParams
import com.llamacloud_prod.api.models.datasources.DataSourceDeleteParams
import com.llamacloud_prod.api.models.datasources.DataSourceGetParams
import com.llamacloud_prod.api.models.datasources.DataSourceListParams
import com.llamacloud_prod.api.models.datasources.DataSourceUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DataSourceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataSourceServiceAsync

    /** Create a new data source. */
    fun create(params: DataSourceCreateParams): CompletableFuture<DataSource> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DataSourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSource>

    /** Update a data source by ID. */
    fun update(
        dataSourceId: String,
        params: DataSourceUpdateParams,
    ): CompletableFuture<DataSource> = update(dataSourceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        dataSourceId: String,
        params: DataSourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSource> =
        update(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

    /** @see update */
    fun update(params: DataSourceUpdateParams): CompletableFuture<DataSource> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DataSourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSource>

    /**
     * List data sources for a given project. If project_id is not provided, uses the default
     * project.
     */
    fun list(): CompletableFuture<List<DataSource>> = list(DataSourceListParams.none())

    /** @see list */
    fun list(
        params: DataSourceListParams = DataSourceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DataSource>>

    /** @see list */
    fun list(
        params: DataSourceListParams = DataSourceListParams.none()
    ): CompletableFuture<List<DataSource>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<DataSource>> =
        list(DataSourceListParams.none(), requestOptions)

    /** Delete a data source by ID. */
    fun delete(dataSourceId: String): CompletableFuture<Void?> =
        delete(dataSourceId, DataSourceDeleteParams.none())

    /** @see delete */
    fun delete(
        dataSourceId: String,
        params: DataSourceDeleteParams = DataSourceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

    /** @see delete */
    fun delete(
        dataSourceId: String,
        params: DataSourceDeleteParams = DataSourceDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(dataSourceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DataSourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: DataSourceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(dataSourceId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(dataSourceId, DataSourceDeleteParams.none(), requestOptions)

    /** Get a data source by ID. */
    fun get(dataSourceId: String): CompletableFuture<DataSource> =
        get(dataSourceId, DataSourceGetParams.none())

    /** @see get */
    fun get(
        dataSourceId: String,
        params: DataSourceGetParams = DataSourceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSource> =
        get(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

    /** @see get */
    fun get(
        dataSourceId: String,
        params: DataSourceGetParams = DataSourceGetParams.none(),
    ): CompletableFuture<DataSource> = get(dataSourceId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DataSourceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSource>

    /** @see get */
    fun get(params: DataSourceGetParams): CompletableFuture<DataSource> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(dataSourceId: String, requestOptions: RequestOptions): CompletableFuture<DataSource> =
        get(dataSourceId, DataSourceGetParams.none(), requestOptions)

    /**
     * A view of [DataSourceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataSourceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/data-sources`, but is otherwise the same as
         * [DataSourceServiceAsync.create].
         */
        fun create(params: DataSourceCreateParams): CompletableFuture<HttpResponseFor<DataSource>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DataSourceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSource>>

        /**
         * Returns a raw HTTP response for `put /api/v1/data-sources/{data_source_id}`, but is
         * otherwise the same as [DataSourceServiceAsync.update].
         */
        fun update(
            dataSourceId: String,
            params: DataSourceUpdateParams,
        ): CompletableFuture<HttpResponseFor<DataSource>> =
            update(dataSourceId, params, RequestOptions.none())

        /** @see update */
        fun update(
            dataSourceId: String,
            params: DataSourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSource>> =
            update(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

        /** @see update */
        fun update(params: DataSourceUpdateParams): CompletableFuture<HttpResponseFor<DataSource>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DataSourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSource>>

        /**
         * Returns a raw HTTP response for `get /api/v1/data-sources`, but is otherwise the same as
         * [DataSourceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<DataSource>>> =
            list(DataSourceListParams.none())

        /** @see list */
        fun list(
            params: DataSourceListParams = DataSourceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DataSource>>>

        /** @see list */
        fun list(
            params: DataSourceListParams = DataSourceListParams.none()
        ): CompletableFuture<HttpResponseFor<List<DataSource>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<DataSource>>> =
            list(DataSourceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/data-sources/{data_source_id}`, but is
         * otherwise the same as [DataSourceServiceAsync.delete].
         */
        fun delete(dataSourceId: String): CompletableFuture<HttpResponse> =
            delete(dataSourceId, DataSourceDeleteParams.none())

        /** @see delete */
        fun delete(
            dataSourceId: String,
            params: DataSourceDeleteParams = DataSourceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

        /** @see delete */
        fun delete(
            dataSourceId: String,
            params: DataSourceDeleteParams = DataSourceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(dataSourceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DataSourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: DataSourceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            dataSourceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(dataSourceId, DataSourceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/data-sources/{data_source_id}`, but is
         * otherwise the same as [DataSourceServiceAsync.get].
         */
        fun get(dataSourceId: String): CompletableFuture<HttpResponseFor<DataSource>> =
            get(dataSourceId, DataSourceGetParams.none())

        /** @see get */
        fun get(
            dataSourceId: String,
            params: DataSourceGetParams = DataSourceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSource>> =
            get(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

        /** @see get */
        fun get(
            dataSourceId: String,
            params: DataSourceGetParams = DataSourceGetParams.none(),
        ): CompletableFuture<HttpResponseFor<DataSource>> =
            get(dataSourceId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DataSourceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSource>>

        /** @see get */
        fun get(params: DataSourceGetParams): CompletableFuture<HttpResponseFor<DataSource>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            dataSourceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataSource>> =
            get(dataSourceId, DataSourceGetParams.none(), requestOptions)
    }
}
