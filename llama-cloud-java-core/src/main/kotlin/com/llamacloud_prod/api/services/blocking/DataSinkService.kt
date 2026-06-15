// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.datasinks.DataSink
import com.llamacloud_prod.api.models.datasinks.DataSinkCreateParams
import com.llamacloud_prod.api.models.datasinks.DataSinkDeleteParams
import com.llamacloud_prod.api.models.datasinks.DataSinkGetParams
import com.llamacloud_prod.api.models.datasinks.DataSinkListParams
import com.llamacloud_prod.api.models.datasinks.DataSinkUpdateParams
import com.llamacloud_prod.api.models.pipelines.DataSinkCreate
import java.util.function.Consumer

interface DataSinkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataSinkService

    /** Create a new data sink. */
    fun create(params: DataSinkCreateParams): DataSink = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DataSinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSink

    /** @see create */
    fun create(
        dataSinkCreate: DataSinkCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSink =
        create(
            DataSinkCreateParams.builder().dataSinkCreate(dataSinkCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(dataSinkCreate: DataSinkCreate): DataSink =
        create(dataSinkCreate, RequestOptions.none())

    /** Update a data sink by ID. */
    fun update(dataSinkId: String, params: DataSinkUpdateParams): DataSink =
        update(dataSinkId, params, RequestOptions.none())

    /** @see update */
    fun update(
        dataSinkId: String,
        params: DataSinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSink = update(params.toBuilder().dataSinkId(dataSinkId).build(), requestOptions)

    /** @see update */
    fun update(params: DataSinkUpdateParams): DataSink = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DataSinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSink

    /** List data sinks for a given project. */
    fun list(): List<DataSink> = list(DataSinkListParams.none())

    /** @see list */
    fun list(
        params: DataSinkListParams = DataSinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DataSink>

    /** @see list */
    fun list(params: DataSinkListParams = DataSinkListParams.none()): List<DataSink> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<DataSink> =
        list(DataSinkListParams.none(), requestOptions)

    /** Delete a data sink by ID. */
    fun delete(dataSinkId: String) = delete(dataSinkId, DataSinkDeleteParams.none())

    /** @see delete */
    fun delete(
        dataSinkId: String,
        params: DataSinkDeleteParams = DataSinkDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().dataSinkId(dataSinkId).build(), requestOptions)

    /** @see delete */
    fun delete(dataSinkId: String, params: DataSinkDeleteParams = DataSinkDeleteParams.none()) =
        delete(dataSinkId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: DataSinkDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: DataSinkDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(dataSinkId: String, requestOptions: RequestOptions) =
        delete(dataSinkId, DataSinkDeleteParams.none(), requestOptions)

    /** Get a data sink by ID. */
    fun get(dataSinkId: String): DataSink = get(dataSinkId, DataSinkGetParams.none())

    /** @see get */
    fun get(
        dataSinkId: String,
        params: DataSinkGetParams = DataSinkGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSink = get(params.toBuilder().dataSinkId(dataSinkId).build(), requestOptions)

    /** @see get */
    fun get(dataSinkId: String, params: DataSinkGetParams = DataSinkGetParams.none()): DataSink =
        get(dataSinkId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DataSinkGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataSink

    /** @see get */
    fun get(params: DataSinkGetParams): DataSink = get(params, RequestOptions.none())

    /** @see get */
    fun get(dataSinkId: String, requestOptions: RequestOptions): DataSink =
        get(dataSinkId, DataSinkGetParams.none(), requestOptions)

    /** A view of [DataSinkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataSinkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/data-sinks`, but is otherwise the same as
         * [DataSinkService.create].
         */
        @MustBeClosed
        fun create(params: DataSinkCreateParams): HttpResponseFor<DataSink> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DataSinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSink>

        /** @see create */
        @MustBeClosed
        fun create(
            dataSinkCreate: DataSinkCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSink> =
            create(
                DataSinkCreateParams.builder().dataSinkCreate(dataSinkCreate).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(dataSinkCreate: DataSinkCreate): HttpResponseFor<DataSink> =
            create(dataSinkCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put /api/v1/data-sinks/{data_sink_id}`, but is otherwise
         * the same as [DataSinkService.update].
         */
        @MustBeClosed
        fun update(dataSinkId: String, params: DataSinkUpdateParams): HttpResponseFor<DataSink> =
            update(dataSinkId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            dataSinkId: String,
            params: DataSinkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSink> =
            update(params.toBuilder().dataSinkId(dataSinkId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: DataSinkUpdateParams): HttpResponseFor<DataSink> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DataSinkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSink>

        /**
         * Returns a raw HTTP response for `get /api/v1/data-sinks`, but is otherwise the same as
         * [DataSinkService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<List<DataSink>> = list(DataSinkListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DataSinkListParams = DataSinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DataSink>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DataSinkListParams = DataSinkListParams.none()
        ): HttpResponseFor<List<DataSink>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<DataSink>> =
            list(DataSinkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/data-sinks/{data_sink_id}`, but is
         * otherwise the same as [DataSinkService.delete].
         */
        @MustBeClosed
        fun delete(dataSinkId: String): HttpResponse =
            delete(dataSinkId, DataSinkDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            dataSinkId: String,
            params: DataSinkDeleteParams = DataSinkDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().dataSinkId(dataSinkId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            dataSinkId: String,
            params: DataSinkDeleteParams = DataSinkDeleteParams.none(),
        ): HttpResponse = delete(dataSinkId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DataSinkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: DataSinkDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(dataSinkId: String, requestOptions: RequestOptions): HttpResponse =
            delete(dataSinkId, DataSinkDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/data-sinks/{data_sink_id}`, but is otherwise
         * the same as [DataSinkService.get].
         */
        @MustBeClosed
        fun get(dataSinkId: String): HttpResponseFor<DataSink> =
            get(dataSinkId, DataSinkGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            dataSinkId: String,
            params: DataSinkGetParams = DataSinkGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSink> =
            get(params.toBuilder().dataSinkId(dataSinkId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            dataSinkId: String,
            params: DataSinkGetParams = DataSinkGetParams.none(),
        ): HttpResponseFor<DataSink> = get(dataSinkId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DataSinkGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataSink>

        /** @see get */
        @MustBeClosed
        fun get(params: DataSinkGetParams): HttpResponseFor<DataSink> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(dataSinkId: String, requestOptions: RequestOptions): HttpResponseFor<DataSink> =
            get(dataSinkId, DataSinkGetParams.none(), requestOptions)
    }
}
