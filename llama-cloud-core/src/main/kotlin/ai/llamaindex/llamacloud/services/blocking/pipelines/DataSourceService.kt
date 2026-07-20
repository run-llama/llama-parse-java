// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.pipelines

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.pipelines.ManagedIngestionStatusResponse
import ai.llamaindex.llamacloud.models.pipelines.Pipeline
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceGetDataSourcesParams
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceGetStatusParams
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceSyncParams
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceUpdateDataSourcesParams
import ai.llamaindex.llamacloud.models.pipelines.datasources.DataSourceUpdateParams
import ai.llamaindex.llamacloud.models.pipelines.datasources.PipelineDataSource
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface DataSourceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataSourceService

    /** Update the configuration of a data source in a pipeline. */
    @Deprecated("deprecated")
    fun update(dataSourceId: String, params: DataSourceUpdateParams): PipelineDataSource =
        update(dataSourceId, params, RequestOptions.none())

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        dataSourceId: String,
        params: DataSourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineDataSource =
        update(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

    /** @see update */
    @Deprecated("deprecated")
    fun update(params: DataSourceUpdateParams): PipelineDataSource =
        update(params, RequestOptions.none())

    /** @see update */
    @Deprecated("deprecated")
    fun update(
        params: DataSourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PipelineDataSource

    /** Get data sources for a pipeline. */
    @Deprecated("deprecated")
    fun getDataSources(pipelineId: String): List<PipelineDataSource> =
        getDataSources(pipelineId, DataSourceGetDataSourcesParams.none())

    /** @see getDataSources */
    @Deprecated("deprecated")
    fun getDataSources(
        pipelineId: String,
        params: DataSourceGetDataSourcesParams = DataSourceGetDataSourcesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PipelineDataSource> =
        getDataSources(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see getDataSources */
    @Deprecated("deprecated")
    fun getDataSources(
        pipelineId: String,
        params: DataSourceGetDataSourcesParams = DataSourceGetDataSourcesParams.none(),
    ): List<PipelineDataSource> = getDataSources(pipelineId, params, RequestOptions.none())

    /** @see getDataSources */
    @Deprecated("deprecated")
    fun getDataSources(
        params: DataSourceGetDataSourcesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PipelineDataSource>

    /** @see getDataSources */
    @Deprecated("deprecated")
    fun getDataSources(params: DataSourceGetDataSourcesParams): List<PipelineDataSource> =
        getDataSources(params, RequestOptions.none())

    /** @see getDataSources */
    @Deprecated("deprecated")
    fun getDataSources(
        pipelineId: String,
        requestOptions: RequestOptions,
    ): List<PipelineDataSource> =
        getDataSources(pipelineId, DataSourceGetDataSourcesParams.none(), requestOptions)

    /** Get the status of a data source for a pipeline. */
    @Deprecated("deprecated")
    fun getStatus(
        dataSourceId: String,
        params: DataSourceGetStatusParams,
    ): ManagedIngestionStatusResponse = getStatus(dataSourceId, params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        dataSourceId: String,
        params: DataSourceGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedIngestionStatusResponse =
        getStatus(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(params: DataSourceGetStatusParams): ManagedIngestionStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    @Deprecated("deprecated")
    fun getStatus(
        params: DataSourceGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedIngestionStatusResponse

    /** Run incremental ingestion: pull upstream changes from the data source into the data sink. */
    @Deprecated("deprecated")
    fun sync(dataSourceId: String, params: DataSourceSyncParams): Pipeline =
        sync(dataSourceId, params, RequestOptions.none())

    /** @see sync */
    @Deprecated("deprecated")
    fun sync(
        dataSourceId: String,
        params: DataSourceSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline = sync(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

    /** @see sync */
    @Deprecated("deprecated")
    fun sync(params: DataSourceSyncParams): Pipeline = sync(params, RequestOptions.none())

    /** @see sync */
    @Deprecated("deprecated")
    fun sync(
        params: DataSourceSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Pipeline

    /** Add data sources to a pipeline. */
    @Deprecated("deprecated")
    fun updateDataSources(
        pipelineId: String,
        params: DataSourceUpdateDataSourcesParams,
    ): List<PipelineDataSource> = updateDataSources(pipelineId, params, RequestOptions.none())

    /** @see updateDataSources */
    @Deprecated("deprecated")
    fun updateDataSources(
        pipelineId: String,
        params: DataSourceUpdateDataSourcesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PipelineDataSource> =
        updateDataSources(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

    /** @see updateDataSources */
    @Deprecated("deprecated")
    fun updateDataSources(params: DataSourceUpdateDataSourcesParams): List<PipelineDataSource> =
        updateDataSources(params, RequestOptions.none())

    /** @see updateDataSources */
    @Deprecated("deprecated")
    fun updateDataSources(
        params: DataSourceUpdateDataSourcesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PipelineDataSource>

    /** A view of [DataSourceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataSourceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /api/v1/pipelines/{pipeline_id}/data-sources/{data_source_id}`, but is otherwise the same
         * as [DataSourceService.update].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(
            dataSourceId: String,
            params: DataSourceUpdateParams,
        ): HttpResponseFor<PipelineDataSource> = update(dataSourceId, params, RequestOptions.none())

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(
            dataSourceId: String,
            params: DataSourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineDataSource> =
            update(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(params: DataSourceUpdateParams): HttpResponseFor<PipelineDataSource> =
            update(params, RequestOptions.none())

        /** @see update */
        @Deprecated("deprecated")
        @MustBeClosed
        fun update(
            params: DataSourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PipelineDataSource>

        /**
         * Returns a raw HTTP response for `get /api/v1/pipelines/{pipeline_id}/data-sources`, but
         * is otherwise the same as [DataSourceService.getDataSources].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getDataSources(pipelineId: String): HttpResponseFor<List<PipelineDataSource>> =
            getDataSources(pipelineId, DataSourceGetDataSourcesParams.none())

        /** @see getDataSources */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getDataSources(
            pipelineId: String,
            params: DataSourceGetDataSourcesParams = DataSourceGetDataSourcesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PipelineDataSource>> =
            getDataSources(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see getDataSources */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getDataSources(
            pipelineId: String,
            params: DataSourceGetDataSourcesParams = DataSourceGetDataSourcesParams.none(),
        ): HttpResponseFor<List<PipelineDataSource>> =
            getDataSources(pipelineId, params, RequestOptions.none())

        /** @see getDataSources */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getDataSources(
            params: DataSourceGetDataSourcesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PipelineDataSource>>

        /** @see getDataSources */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getDataSources(
            params: DataSourceGetDataSourcesParams
        ): HttpResponseFor<List<PipelineDataSource>> = getDataSources(params, RequestOptions.none())

        /** @see getDataSources */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getDataSources(
            pipelineId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<PipelineDataSource>> =
            getDataSources(pipelineId, DataSourceGetDataSourcesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/pipelines/{pipeline_id}/data-sources/{data_source_id}/status`, but is otherwise
         * the same as [DataSourceService.getStatus].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            dataSourceId: String,
            params: DataSourceGetStatusParams,
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(dataSourceId, params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            dataSourceId: String,
            params: DataSourceGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

        /** @see getStatus */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            params: DataSourceGetStatusParams
        ): HttpResponseFor<ManagedIngestionStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getStatus(
            params: DataSourceGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedIngestionStatusResponse>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/pipelines/{pipeline_id}/data-sources/{data_source_id}/sync`, but is otherwise the
         * same as [DataSourceService.sync].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun sync(dataSourceId: String, params: DataSourceSyncParams): HttpResponseFor<Pipeline> =
            sync(dataSourceId, params, RequestOptions.none())

        /** @see sync */
        @Deprecated("deprecated")
        @MustBeClosed
        fun sync(
            dataSourceId: String,
            params: DataSourceSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline> =
            sync(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

        /** @see sync */
        @Deprecated("deprecated")
        @MustBeClosed
        fun sync(params: DataSourceSyncParams): HttpResponseFor<Pipeline> =
            sync(params, RequestOptions.none())

        /** @see sync */
        @Deprecated("deprecated")
        @MustBeClosed
        fun sync(
            params: DataSourceSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Pipeline>

        /**
         * Returns a raw HTTP response for `put /api/v1/pipelines/{pipeline_id}/data-sources`, but
         * is otherwise the same as [DataSourceService.updateDataSources].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun updateDataSources(
            pipelineId: String,
            params: DataSourceUpdateDataSourcesParams,
        ): HttpResponseFor<List<PipelineDataSource>> =
            updateDataSources(pipelineId, params, RequestOptions.none())

        /** @see updateDataSources */
        @Deprecated("deprecated")
        @MustBeClosed
        fun updateDataSources(
            pipelineId: String,
            params: DataSourceUpdateDataSourcesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PipelineDataSource>> =
            updateDataSources(params.toBuilder().pipelineId(pipelineId).build(), requestOptions)

        /** @see updateDataSources */
        @Deprecated("deprecated")
        @MustBeClosed
        fun updateDataSources(
            params: DataSourceUpdateDataSourcesParams
        ): HttpResponseFor<List<PipelineDataSource>> =
            updateDataSources(params, RequestOptions.none())

        /** @see updateDataSources */
        @Deprecated("deprecated")
        @MustBeClosed
        fun updateDataSources(
            params: DataSourceUpdateDataSourcesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PipelineDataSource>>
    }
}
