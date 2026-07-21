// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.datasinks.DataSink
import ai.llamaindex.llamacloud.models.datasinks.DataSinkCreateParams
import ai.llamaindex.llamacloud.models.datasinks.DataSinkDeleteParams
import ai.llamaindex.llamacloud.models.datasinks.DataSinkGetParams
import ai.llamaindex.llamacloud.models.datasinks.DataSinkListParams
import ai.llamaindex.llamacloud.models.datasinks.DataSinkUpdateParams
import ai.llamaindex.llamacloud.models.pipelines.DataSinkCreate
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DataSinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataSinkServiceAsync

    /** Create a new data sink. */
    fun create(params: DataSinkCreateParams): CompletableFuture<DataSink> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DataSinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSink>

    /** @see create */
    fun create(
        dataSinkCreate: DataSinkCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSink> =
        create(
            DataSinkCreateParams.builder().dataSinkCreate(dataSinkCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(dataSinkCreate: DataSinkCreate): CompletableFuture<DataSink> =
        create(dataSinkCreate, RequestOptions.none())

    /** Update a data sink by ID. */
    fun update(dataSinkId: String, params: DataSinkUpdateParams): CompletableFuture<DataSink> =
        update(dataSinkId, params, RequestOptions.none())

    /** @see update */
    fun update(
        dataSinkId: String,
        params: DataSinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSink> =
        update(params.toBuilder().dataSinkId(dataSinkId).build(), requestOptions)

    /** @see update */
    fun update(params: DataSinkUpdateParams): CompletableFuture<DataSink> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DataSinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSink>

    /** List data sinks for a given project. */
    fun list(): CompletableFuture<List<DataSink>> = list(DataSinkListParams.none())

    /** @see list */
    fun list(
        params: DataSinkListParams = DataSinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DataSink>>

    /** @see list */
    fun list(
        params: DataSinkListParams = DataSinkListParams.none()
    ): CompletableFuture<List<DataSink>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<DataSink>> =
        list(DataSinkListParams.none(), requestOptions)

    /** Delete a data sink by ID. */
    fun delete(dataSinkId: String): CompletableFuture<Void?> =
        delete(dataSinkId, DataSinkDeleteParams.none())

    /** @see delete */
    fun delete(
        dataSinkId: String,
        params: DataSinkDeleteParams = DataSinkDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().dataSinkId(dataSinkId).build(), requestOptions)

    /** @see delete */
    fun delete(
        dataSinkId: String,
        params: DataSinkDeleteParams = DataSinkDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(dataSinkId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DataSinkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: DataSinkDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(dataSinkId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(dataSinkId, DataSinkDeleteParams.none(), requestOptions)

    /** Get a data sink by ID. */
    fun get(dataSinkId: String): CompletableFuture<DataSink> =
        get(dataSinkId, DataSinkGetParams.none())

    /** @see get */
    fun get(
        dataSinkId: String,
        params: DataSinkGetParams = DataSinkGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSink> =
        get(params.toBuilder().dataSinkId(dataSinkId).build(), requestOptions)

    /** @see get */
    fun get(
        dataSinkId: String,
        params: DataSinkGetParams = DataSinkGetParams.none(),
    ): CompletableFuture<DataSink> = get(dataSinkId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DataSinkGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataSink>

    /** @see get */
    fun get(params: DataSinkGetParams): CompletableFuture<DataSink> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(dataSinkId: String, requestOptions: RequestOptions): CompletableFuture<DataSink> =
        get(dataSinkId, DataSinkGetParams.none(), requestOptions)

    /**
     * A view of [DataSinkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataSinkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/data-sinks`, but is otherwise the same as
         * [DataSinkServiceAsync.create].
         */
        fun create(params: DataSinkCreateParams): CompletableFuture<HttpResponseFor<DataSink>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DataSinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSink>>

        /** @see create */
        fun create(
            dataSinkCreate: DataSinkCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSink>> =
            create(
                DataSinkCreateParams.builder().dataSinkCreate(dataSinkCreate).build(),
                requestOptions,
            )

        /** @see create */
        fun create(dataSinkCreate: DataSinkCreate): CompletableFuture<HttpResponseFor<DataSink>> =
            create(dataSinkCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /api/v1/data-sinks/{data_sink_id}`, but is otherwise
         * the same as [DataSinkServiceAsync.update].
         */
        fun update(
            dataSinkId: String,
            params: DataSinkUpdateParams,
        ): CompletableFuture<HttpResponseFor<DataSink>> =
            update(dataSinkId, params, RequestOptions.none())

        /** @see update */
        fun update(
            dataSinkId: String,
            params: DataSinkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSink>> =
            update(params.toBuilder().dataSinkId(dataSinkId).build(), requestOptions)

        /** @see update */
        fun update(params: DataSinkUpdateParams): CompletableFuture<HttpResponseFor<DataSink>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DataSinkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSink>>

        /**
         * Returns a raw HTTP response for `get /api/v1/data-sinks`, but is otherwise the same as
         * [DataSinkServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<DataSink>>> =
            list(DataSinkListParams.none())

        /** @see list */
        fun list(
            params: DataSinkListParams = DataSinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DataSink>>>

        /** @see list */
        fun list(
            params: DataSinkListParams = DataSinkListParams.none()
        ): CompletableFuture<HttpResponseFor<List<DataSink>>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<DataSink>>> =
            list(DataSinkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/data-sinks/{data_sink_id}`, but is
         * otherwise the same as [DataSinkServiceAsync.delete].
         */
        fun delete(dataSinkId: String): CompletableFuture<HttpResponse> =
            delete(dataSinkId, DataSinkDeleteParams.none())

        /** @see delete */
        fun delete(
            dataSinkId: String,
            params: DataSinkDeleteParams = DataSinkDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().dataSinkId(dataSinkId).build(), requestOptions)

        /** @see delete */
        fun delete(
            dataSinkId: String,
            params: DataSinkDeleteParams = DataSinkDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(dataSinkId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DataSinkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: DataSinkDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            dataSinkId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(dataSinkId, DataSinkDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/data-sinks/{data_sink_id}`, but is otherwise
         * the same as [DataSinkServiceAsync.get].
         */
        fun get(dataSinkId: String): CompletableFuture<HttpResponseFor<DataSink>> =
            get(dataSinkId, DataSinkGetParams.none())

        /** @see get */
        fun get(
            dataSinkId: String,
            params: DataSinkGetParams = DataSinkGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSink>> =
            get(params.toBuilder().dataSinkId(dataSinkId).build(), requestOptions)

        /** @see get */
        fun get(
            dataSinkId: String,
            params: DataSinkGetParams = DataSinkGetParams.none(),
        ): CompletableFuture<HttpResponseFor<DataSink>> =
            get(dataSinkId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DataSinkGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataSink>>

        /** @see get */
        fun get(params: DataSinkGetParams): CompletableFuture<HttpResponseFor<DataSink>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            dataSinkId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataSink>> =
            get(dataSinkId, DataSinkGetParams.none(), requestOptions)
    }
}
