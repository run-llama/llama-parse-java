// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.pipelines

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.pipelines.ManagedIngestionStatusResponse
import com.llamacloud_prod.api.models.pipelines.Pipeline
import com.llamacloud_prod.api.models.pipelines.datasources.DataSourceGetDataSourcesParams
import com.llamacloud_prod.api.models.pipelines.datasources.DataSourceGetStatusParams
import com.llamacloud_prod.api.models.pipelines.datasources.DataSourceSyncParams
import com.llamacloud_prod.api.models.pipelines.datasources.DataSourceUpdateDataSourcesParams
import com.llamacloud_prod.api.models.pipelines.datasources.DataSourceUpdateParams
import com.llamacloud_prod.api.models.pipelines.datasources.PipelineDataSource
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

    /** Update the configuration of a data source in a pipeline. */
    fun update(
        dataSourceId: String,
        params: DataSourceUpdateParams,
    ): CompletableFuture<PipelineDataSource> = update(dataSourceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        dataSourceId: String,
        params: DataSourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineDataSource> =
        update(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

    /** @see update */
    fun update(params: DataSourceUpdateParams): CompletableFuture<PipelineDataSource> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DataSourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PipelineDataSource>

    /** Get data sources for a pipeline. */
    fun getDataSources(pipelineId: String): CompletableFuture<List<PipelineDataSource>> =
        getDataSources(pipelineId, DataSourceGetDataSourcesParams.none())

    /** @see getDataSources */
    fun getDataSources(
        pipelineId: String,
        params: DataSourceGetDataSourcesParams = DataSourceGetDataSourcesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PipelineDataSource>> =
        getDataSources(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see getDataSources */
    fun getDataSources(
        pipelineId: String,
        params: DataSourceGetDataSourcesParams = DataSourceGetDataSourcesParams.none(),
    ): CompletableFuture<List<PipelineDataSource>> =
        getDataSources(pipelineId, params, RequestOptions.none())

    /** @see getDataSources */
    fun getDataSources(
        params: DataSourceGetDataSourcesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PipelineDataSource>>

    /** @see getDataSources */
    fun getDataSources(
        params: DataSourceGetDataSourcesParams
    ): CompletableFuture<List<PipelineDataSource>> = getDataSources(params, RequestOptions.none())

    /** @see getDataSources */
    fun getDataSources(
        pipelineId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<PipelineDataSource>> =
        getDataSources(pipelineId, DataSourceGetDataSourcesParams.none(), requestOptions)

    /** Get the status of a data source for a pipeline. */
    fun getStatus(
        dataSourceId: String,
        params: DataSourceGetStatusParams,
    ): CompletableFuture<ManagedIngestionStatusResponse> =
        getStatus(dataSourceId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        dataSourceId: String,
        params: DataSourceGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedIngestionStatusResponse> =
        getStatus(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        params: DataSourceGetStatusParams
    ): CompletableFuture<ManagedIngestionStatusResponse> = getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: DataSourceGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedIngestionStatusResponse>

    /** Run incremental ingestion: pull upstream changes from the data source into the data sink. */
    fun sync(dataSourceId: String, params: DataSourceSyncParams): CompletableFuture<Pipeline> =
        sync(dataSourceId, params, RequestOptions.none())

    /** @see sync */
    fun sync(
        dataSourceId: String,
        params: DataSourceSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline> =
        sync(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

    /** @see sync */
    fun sync(params: DataSourceSyncParams): CompletableFuture<Pipeline> =
        sync(params, RequestOptions.none())

    /** @see sync */
    fun sync(
        params: DataSourceSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Pipeline>

    /** Add data sources to a pipeline. */
    fun updateDataSources(
        pipelineId: String,
        params: DataSourceUpdateDataSourcesParams,
    ): CompletableFuture<List<PipelineDataSource>> =
        updateDataSources(pipelineId, params, RequestOptions.none())

    /** @see updateDataSources */
    fun updateDataSources(
        pipelineId: String,
        params: DataSourceUpdateDataSourcesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PipelineDataSource>> =
        updateDataSources(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see updateDataSources */
    fun updateDataSources(
        params: DataSourceUpdateDataSourcesParams
    ): CompletableFuture<List<PipelineDataSource>> =
        updateDataSources(params, RequestOptions.none())

    /** @see updateDataSources */
    fun updateDataSources(
        params: DataSourceUpdateDataSourcesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PipelineDataSource>>

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
         * Returns a raw HTTP response for `put
         * /api/v1/pipelines/{pipeline_id}/data-sources/{data_source_id}`, but is otherwise the same
         * as [DataSourceServiceAsync.update].
         */
        fun update(
            dataSourceId: String,
            params: DataSourceUpdateParams,
        ): CompletableFuture<HttpResponseFor<PipelineDataSource>> =
            update(dataSourceId, params, RequestOptions.none())

        /** @see update */
        fun update(
            dataSourceId: String,
            params: DataSourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineDataSource>> =
            update(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

        /** @see update */
        fun update(
            params: DataSourceUpdateParams
        ): CompletableFuture<HttpResponseFor<PipelineDataSource>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DataSourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PipelineDataSource>>

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines/{pipeline_id}/data-sources`, but
         * is otherwise the same as [DataSourceServiceAsync.getDataSources].
         */
        fun getDataSources(
            pipelineId: String
        ): CompletableFuture<HttpResponseFor<List<PipelineDataSource>>> =
            getDataSources(pipelineId, DataSourceGetDataSourcesParams.none())

        /** @see getDataSources */
        fun getDataSources(
            pipelineId: String,
            params: DataSourceGetDataSourcesParams = DataSourceGetDataSourcesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PipelineDataSource>>> =
            getDataSources(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see getDataSources */
        fun getDataSources(
            pipelineId: String,
            params: DataSourceGetDataSourcesParams = DataSourceGetDataSourcesParams.none(),
        ): CompletableFuture<HttpResponseFor<List<PipelineDataSource>>> =
            getDataSources(pipelineId, params, RequestOptions.none())

        /** @see getDataSources */
        fun getDataSources(
            params: DataSourceGetDataSourcesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PipelineDataSource>>>

        /** @see getDataSources */
        fun getDataSources(
            params: DataSourceGetDataSourcesParams
        ): CompletableFuture<HttpResponseFor<List<PipelineDataSource>>> =
            getDataSources(params, RequestOptions.none())

        /** @see getDataSources */
        fun getDataSources(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<PipelineDataSource>>> =
            getDataSources(pipelineId, DataSourceGetDataSourcesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/data-sources/{data_source_id}/status`, but is otherwise
         * the same as [DataSourceServiceAsync.getStatus].
         */
        fun getStatus(
            dataSourceId: String,
            params: DataSourceGetStatusParams,
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(dataSourceId, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            dataSourceId: String,
            params: DataSourceGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(
            params: DataSourceGetStatusParams
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: DataSourceGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/pipelines/{pipeline_id}/data-sources/{data_source_id}/sync`, but is otherwise the
         * same as [DataSourceServiceAsync.sync].
         */
        fun sync(
            dataSourceId: String,
            params: DataSourceSyncParams,
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            sync(dataSourceId, params, RequestOptions.none())

        /** @see sync */
        fun sync(
            dataSourceId: String,
            params: DataSourceSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>> =
            sync(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

        /** @see sync */
        fun sync(params: DataSourceSyncParams): CompletableFuture<HttpResponseFor<Pipeline>> =
            sync(params, RequestOptions.none())

        /** @see sync */
        fun sync(
            params: DataSourceSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Pipeline>>

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}/data-sources`, but
         * is otherwise the same as [DataSourceServiceAsync.updateDataSources].
         */
        fun updateDataSources(
            pipelineId: String,
            params: DataSourceUpdateDataSourcesParams,
        ): CompletableFuture<HttpResponseFor<List<PipelineDataSource>>> =
            updateDataSources(pipelineId, params, RequestOptions.none())

        /** @see updateDataSources */
        fun updateDataSources(
            pipelineId: String,
            params: DataSourceUpdateDataSourcesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PipelineDataSource>>> =
            updateDataSources(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see updateDataSources */
        fun updateDataSources(
            params: DataSourceUpdateDataSourcesParams
        ): CompletableFuture<HttpResponseFor<List<PipelineDataSource>>> =
            updateDataSources(params, RequestOptions.none())

        /** @see updateDataSources */
        fun updateDataSources(
            params: DataSourceUpdateDataSourcesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PipelineDataSource>>>
    }
}
