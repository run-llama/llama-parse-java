// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.datasources.DataSource
import ai.llamaindex.llamacloud.models.datasources.DataSourceCreateParams
import ai.llamaindex.llamacloud.models.datasources.DataSourceDeleteParams
import ai.llamaindex.llamacloud.models.datasources.DataSourceGetParams
import ai.llamaindex.llamacloud.models.datasources.DataSourceListParams
import ai.llamaindex.llamacloud.models.datasources.DataSourceUpdateParams
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

    /** Create a new data source. */
    fun create(params: DataSourceCreateParams): DataSource = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DataSourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSource

    /** Update a data source by ID. */
    fun update(dataSourceId: String, params: DataSourceUpdateParams): DataSource =
        update(dataSourceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        dataSourceId: String,
        params: DataSourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSource = update(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

    /** @see update */
    fun update(params: DataSourceUpdateParams): DataSource = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DataSourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSource

    /**
     * List data sources for a given project. If project_id is not provided, uses the default
     * project.
     */
    fun list(): List<DataSource> = list(DataSourceListParams.none())

    /** @see list */
    fun list(
        params: DataSourceListParams = DataSourceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DataSource>

    /** @see list */
    fun list(params: DataSourceListParams = DataSourceListParams.none()): List<DataSource> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<DataSource> =
        list(DataSourceListParams.none(), requestOptions)

    /** Delete a data source by ID. */
    fun delete(dataSourceId: String) = delete(dataSourceId, DataSourceDeleteParams.none())

    /** @see delete */
    fun delete(
        dataSourceId: String,
        params: DataSourceDeleteParams = DataSourceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

    /** @see delete */
    fun delete(
        dataSourceId: String,
        params: DataSourceDeleteParams = DataSourceDeleteParams.none(),
    ) = delete(dataSourceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DataSourceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: DataSourceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(dataSourceId: String, requestOptions: RequestOptions) =
        delete(dataSourceId, DataSourceDeleteParams.none(), requestOptions)

    /** Get a data source by ID. */
    fun get(dataSourceId: String): DataSource = get(dataSourceId, DataSourceGetParams.none())

    /** @see get */
    fun get(
        dataSourceId: String,
        params: DataSourceGetParams = DataSourceGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSource = get(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

    /** @see get */
    fun get(
        dataSourceId: String,
        params: DataSourceGetParams = DataSourceGetParams.none(),
    ): DataSource = get(dataSourceId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DataSourceGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSource

    /** @see get */
    fun get(params: DataSourceGetParams): DataSource = get(params, RequestOptions.none())

    /** @see get */
    fun get(dataSourceId: String, requestOptions: RequestOptions): DataSource =
        get(dataSourceId, DataSourceGetParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /api/v1/data-sources`, but is otherwise the same as
         * [DataSourceService.create].
         */
        @MustBeClosed
        fun create(params: DataSourceCreateParams): HttpResponseFor<DataSource> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DataSourceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSource>

        /**
         * Returns a raw HTTP response for `put /api/v1/data-sources/{data_source_id}`, but is
         * otherwise the same as [DataSourceService.update].
         */
        @MustBeClosed
        fun update(
            dataSourceId: String,
            params: DataSourceUpdateParams,
        ): HttpResponseFor<DataSource> = update(dataSourceId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            dataSourceId: String,
            params: DataSourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSource> =
            update(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DataSourceUpdateParams): HttpResponseFor<DataSource> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DataSourceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSource>

        /**
         * Returns a raw HTTP response for `get /api/v1/data-sources`, but is otherwise the same as
         * [DataSourceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<DataSource>> = list(DataSourceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DataSourceListParams = DataSourceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DataSource>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DataSourceListParams = DataSourceListParams.none()
        ): HttpResponseFor<List<DataSource>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<DataSource>> =
            list(DataSourceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/data-sources/{data_source_id}`, but is
         * otherwise the same as [DataSourceService.delete].
         */
        @MustBeClosed
        fun delete(dataSourceId: String): HttpResponse =
            delete(dataSourceId, DataSourceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            dataSourceId: String,
            params: DataSourceDeleteParams = DataSourceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            dataSourceId: String,
            params: DataSourceDeleteParams = DataSourceDeleteParams.none(),
        ): HttpResponse = delete(dataSourceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DataSourceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: DataSourceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(dataSourceId: String, requestOptions: RequestOptions): HttpResponse =
            delete(dataSourceId, DataSourceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/data-sources/{data_source_id}`, but is
         * otherwise the same as [DataSourceService.get].
         */
        @MustBeClosed
        fun get(dataSourceId: String): HttpResponseFor<DataSource> =
            get(dataSourceId, DataSourceGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            dataSourceId: String,
            params: DataSourceGetParams = DataSourceGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSource> =
            get(params.toBuilder().dataSourceId(dataSourceId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            dataSourceId: String,
            params: DataSourceGetParams = DataSourceGetParams.none(),
        ): HttpResponseFor<DataSource> = get(dataSourceId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DataSourceGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSource>

        /** @see get */
        @MustBeClosed
        fun get(params: DataSourceGetParams): HttpResponseFor<DataSource> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(dataSourceId: String, requestOptions: RequestOptions): HttpResponseFor<DataSource> =
            get(dataSourceId, DataSourceGetParams.none(), requestOptions)
    }
}
