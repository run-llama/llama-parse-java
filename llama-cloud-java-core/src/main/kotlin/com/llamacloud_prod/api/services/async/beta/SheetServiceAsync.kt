// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.beta.sheets.SheetCreateParams
import com.llamacloud_prod.api.models.beta.sheets.SheetDeleteJobParams
import com.llamacloud_prod.api.models.beta.sheets.SheetDeleteJobResponse
import com.llamacloud_prod.api.models.beta.sheets.SheetGetParams
import com.llamacloud_prod.api.models.beta.sheets.SheetGetResultTableParams
import com.llamacloud_prod.api.models.beta.sheets.SheetListPageAsync
import com.llamacloud_prod.api.models.beta.sheets.SheetListParams
import com.llamacloud_prod.api.models.beta.sheets.SheetsJob
import com.llamacloud_prod.api.models.files.PresignedUrl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SheetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SheetServiceAsync

    /**
     * Create a spreadsheet parsing job.
     *
     * Provide at most one of `configuration` (an inline parsing configuration) or
     * `configuration_id` (a saved configuration preset). If neither is provided, a default
     * configuration is used. Optionally include `webhook_configurations` to receive `sheets.*`
     * status notifications.
     *
     * Experimental: not production-ready and subject to change.
     */
    fun create(params: SheetCreateParams): CompletableFuture<SheetsJob> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SheetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SheetsJob>

    /** List spreadsheet parsing jobs. Experimental: not production-ready and subject to change. */
    fun list(): CompletableFuture<SheetListPageAsync> = list(SheetListParams.none())

    /** @see list */
    fun list(
        params: SheetListParams = SheetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SheetListPageAsync>

    /** @see list */
    fun list(
        params: SheetListParams = SheetListParams.none()
    ): CompletableFuture<SheetListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SheetListPageAsync> =
        list(SheetListParams.none(), requestOptions)

    /**
     * Delete a spreadsheet parsing job and its associated data. Experimental: not production-ready
     * and subject to change.
     */
    fun deleteJob(spreadsheetJobId: String): CompletableFuture<SheetDeleteJobResponse> =
        deleteJob(spreadsheetJobId, SheetDeleteJobParams.none())

    /** @see deleteJob */
    fun deleteJob(
        spreadsheetJobId: String,
        params: SheetDeleteJobParams = SheetDeleteJobParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SheetDeleteJobResponse> =
        deleteJob(params.toBuilder().spreadsheetJobId(spreadsheetJobId).build(), requestOptions)

    /** @see deleteJob */
    fun deleteJob(
        spreadsheetJobId: String,
        params: SheetDeleteJobParams = SheetDeleteJobParams.none(),
    ): CompletableFuture<SheetDeleteJobResponse> =
        deleteJob(spreadsheetJobId, params, RequestOptions.none())

    /** @see deleteJob */
    fun deleteJob(
        params: SheetDeleteJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SheetDeleteJobResponse>

    /** @see deleteJob */
    fun deleteJob(params: SheetDeleteJobParams): CompletableFuture<SheetDeleteJobResponse> =
        deleteJob(params, RequestOptions.none())

    /** @see deleteJob */
    fun deleteJob(
        spreadsheetJobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SheetDeleteJobResponse> =
        deleteJob(spreadsheetJobId, SheetDeleteJobParams.none(), requestOptions)

    /**
     * Get a spreadsheet parsing job. When `include_results=True` (default), embeds extracted
     * regions and results if complete, skipping the separate `/results` call. Experimental: not
     * production-ready and subject to change.
     */
    fun get(spreadsheetJobId: String): CompletableFuture<SheetsJob> =
        get(spreadsheetJobId, SheetGetParams.none())

    /** @see get */
    fun get(
        spreadsheetJobId: String,
        params: SheetGetParams = SheetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SheetsJob> =
        get(params.toBuilder().spreadsheetJobId(spreadsheetJobId).build(), requestOptions)

    /** @see get */
    fun get(
        spreadsheetJobId: String,
        params: SheetGetParams = SheetGetParams.none(),
    ): CompletableFuture<SheetsJob> = get(spreadsheetJobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SheetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SheetsJob>

    /** @see get */
    fun get(params: SheetGetParams): CompletableFuture<SheetsJob> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        spreadsheetJobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SheetsJob> = get(spreadsheetJobId, SheetGetParams.none(), requestOptions)

    /**
     * Generate a presigned URL to download a specific extracted region. Experimental: not
     * production-ready and subject to change.
     */
    fun getResultTable(
        regionType: SheetGetResultTableParams.RegionType,
        params: SheetGetResultTableParams,
    ): CompletableFuture<PresignedUrl> = getResultTable(regionType, params, RequestOptions.none())

    /** @see getResultTable */
    fun getResultTable(
        regionType: SheetGetResultTableParams.RegionType,
        params: SheetGetResultTableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PresignedUrl> =
        getResultTable(params.toBuilder().regionType(regionType).build(), requestOptions)

    /** @see getResultTable */
    fun getResultTable(params: SheetGetResultTableParams): CompletableFuture<PresignedUrl> =
        getResultTable(params, RequestOptions.none())

    /** @see getResultTable */
    fun getResultTable(
        params: SheetGetResultTableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PresignedUrl>

    /** A view of [SheetServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SheetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/sheets/jobs`, but is otherwise the
         * same as [SheetServiceAsync.create].
         */
        fun create(params: SheetCreateParams): CompletableFuture<HttpResponseFor<SheetsJob>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SheetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SheetsJob>>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/sheets/jobs`, but is otherwise the same
         * as [SheetServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SheetListPageAsync>> =
            list(SheetListParams.none())

        /** @see list */
        fun list(
            params: SheetListParams = SheetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SheetListPageAsync>>

        /** @see list */
        fun list(
            params: SheetListParams = SheetListParams.none()
        ): CompletableFuture<HttpResponseFor<SheetListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SheetListPageAsync>> =
            list(SheetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/sheets/jobs/{spreadsheet_job_id}`,
         * but is otherwise the same as [SheetServiceAsync.deleteJob].
         */
        fun deleteJob(
            spreadsheetJobId: String
        ): CompletableFuture<HttpResponseFor<SheetDeleteJobResponse>> =
            deleteJob(spreadsheetJobId, SheetDeleteJobParams.none())

        /** @see deleteJob */
        fun deleteJob(
            spreadsheetJobId: String,
            params: SheetDeleteJobParams = SheetDeleteJobParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SheetDeleteJobResponse>> =
            deleteJob(params.toBuilder().spreadsheetJobId(spreadsheetJobId).build(), requestOptions)

        /** @see deleteJob */
        fun deleteJob(
            spreadsheetJobId: String,
            params: SheetDeleteJobParams = SheetDeleteJobParams.none(),
        ): CompletableFuture<HttpResponseFor<SheetDeleteJobResponse>> =
            deleteJob(spreadsheetJobId, params, RequestOptions.none())

        /** @see deleteJob */
        fun deleteJob(
            params: SheetDeleteJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SheetDeleteJobResponse>>

        /** @see deleteJob */
        fun deleteJob(
            params: SheetDeleteJobParams
        ): CompletableFuture<HttpResponseFor<SheetDeleteJobResponse>> =
            deleteJob(params, RequestOptions.none())

        /** @see deleteJob */
        fun deleteJob(
            spreadsheetJobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SheetDeleteJobResponse>> =
            deleteJob(spreadsheetJobId, SheetDeleteJobParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/sheets/jobs/{spreadsheet_job_id}`, but
         * is otherwise the same as [SheetServiceAsync.get].
         */
        fun get(spreadsheetJobId: String): CompletableFuture<HttpResponseFor<SheetsJob>> =
            get(spreadsheetJobId, SheetGetParams.none())

        /** @see get */
        fun get(
            spreadsheetJobId: String,
            params: SheetGetParams = SheetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SheetsJob>> =
            get(params.toBuilder().spreadsheetJobId(spreadsheetJobId).build(), requestOptions)

        /** @see get */
        fun get(
            spreadsheetJobId: String,
            params: SheetGetParams = SheetGetParams.none(),
        ): CompletableFuture<HttpResponseFor<SheetsJob>> =
            get(spreadsheetJobId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SheetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SheetsJob>>

        /** @see get */
        fun get(params: SheetGetParams): CompletableFuture<HttpResponseFor<SheetsJob>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            spreadsheetJobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SheetsJob>> =
            get(spreadsheetJobId, SheetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/beta/sheets/jobs/{spreadsheet_job_id}/regions/{region_id}/result/{region_type}`,
         * but is otherwise the same as [SheetServiceAsync.getResultTable].
         */
        fun getResultTable(
            regionType: SheetGetResultTableParams.RegionType,
            params: SheetGetResultTableParams,
        ): CompletableFuture<HttpResponseFor<PresignedUrl>> =
            getResultTable(regionType, params, RequestOptions.none())

        /** @see getResultTable */
        fun getResultTable(
            regionType: SheetGetResultTableParams.RegionType,
            params: SheetGetResultTableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PresignedUrl>> =
            getResultTable(params.toBuilder().regionType(regionType).build(), requestOptions)

        /** @see getResultTable */
        fun getResultTable(
            params: SheetGetResultTableParams
        ): CompletableFuture<HttpResponseFor<PresignedUrl>> =
            getResultTable(params, RequestOptions.none())

        /** @see getResultTable */
        fun getResultTable(
            params: SheetGetResultTableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PresignedUrl>>
    }
}
