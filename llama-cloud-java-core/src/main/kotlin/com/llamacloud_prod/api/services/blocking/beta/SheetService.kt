// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta

import com.google.errorprone.annotations.MustBeClosed
import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.beta.sheets.SheetCreateParams
import com.llamacloud_prod.api.models.beta.sheets.SheetDeleteJobParams
import com.llamacloud_prod.api.models.beta.sheets.SheetDeleteJobResponse
import com.llamacloud_prod.api.models.beta.sheets.SheetGetParams
import com.llamacloud_prod.api.models.beta.sheets.SheetGetResultTableParams
import com.llamacloud_prod.api.models.beta.sheets.SheetListPage
import com.llamacloud_prod.api.models.beta.sheets.SheetListParams
import com.llamacloud_prod.api.models.beta.sheets.SheetsJob
import com.llamacloud_prod.api.models.files.PresignedUrl
import java.util.function.Consumer

interface SheetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SheetService

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
    fun create(params: SheetCreateParams): SheetsJob = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SheetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SheetsJob

    /** List spreadsheet parsing jobs. Experimental: not production-ready and subject to change. */
    fun list(): SheetListPage = list(SheetListParams.none())

    /** @see list */
    fun list(
        params: SheetListParams = SheetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SheetListPage

    /** @see list */
    fun list(params: SheetListParams = SheetListParams.none()): SheetListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SheetListPage =
        list(SheetListParams.none(), requestOptions)

    /**
     * Delete a spreadsheet parsing job and its associated data. Experimental: not production-ready
     * and subject to change.
     */
    fun deleteJob(spreadsheetJobId: String): SheetDeleteJobResponse =
        deleteJob(spreadsheetJobId, SheetDeleteJobParams.none())

    /** @see deleteJob */
    fun deleteJob(
        spreadsheetJobId: String,
        params: SheetDeleteJobParams = SheetDeleteJobParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SheetDeleteJobResponse =
        deleteJob(params.toBuilder().spreadsheetJobId(spreadsheetJobId).build(), requestOptions)

    /** @see deleteJob */
    fun deleteJob(
        spreadsheetJobId: String,
        params: SheetDeleteJobParams = SheetDeleteJobParams.none(),
    ): SheetDeleteJobResponse = deleteJob(spreadsheetJobId, params, RequestOptions.none())

    /** @see deleteJob */
    fun deleteJob(
        params: SheetDeleteJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SheetDeleteJobResponse

    /** @see deleteJob */
    fun deleteJob(params: SheetDeleteJobParams): SheetDeleteJobResponse =
        deleteJob(params, RequestOptions.none())

    /** @see deleteJob */
    fun deleteJob(
        spreadsheetJobId: String,
        requestOptions: RequestOptions,
    ): SheetDeleteJobResponse =
        deleteJob(spreadsheetJobId, SheetDeleteJobParams.none(), requestOptions)

    /**
     * Get a spreadsheet parsing job. When `include_results=True` (default), embeds extracted
     * regions and results if complete, skipping the separate `/results` call. Experimental: not
     * production-ready and subject to change.
     */
    fun get(spreadsheetJobId: String): SheetsJob = get(spreadsheetJobId, SheetGetParams.none())

    /** @see get */
    fun get(
        spreadsheetJobId: String,
        params: SheetGetParams = SheetGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SheetsJob =
        get(params.toBuilder().spreadsheetJobId(spreadsheetJobId).build(), requestOptions)

    /** @see get */
    fun get(spreadsheetJobId: String, params: SheetGetParams = SheetGetParams.none()): SheetsJob =
        get(spreadsheetJobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SheetGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SheetsJob

    /** @see get */
    fun get(params: SheetGetParams): SheetsJob = get(params, RequestOptions.none())

    /** @see get */
    fun get(spreadsheetJobId: String, requestOptions: RequestOptions): SheetsJob =
        get(spreadsheetJobId, SheetGetParams.none(), requestOptions)

    /**
     * Generate a presigned URL to download a specific extracted region. Experimental: not
     * production-ready and subject to change.
     */
    fun getResultTable(
        regionType: SheetGetResultTableParams.RegionType,
        params: SheetGetResultTableParams,
    ): PresignedUrl = getResultTable(regionType, params, RequestOptions.none())

    /** @see getResultTable */
    fun getResultTable(
        regionType: SheetGetResultTableParams.RegionType,
        params: SheetGetResultTableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PresignedUrl =
        getResultTable(params.toBuilder().regionType(regionType).build(), requestOptions)

    /** @see getResultTable */
    fun getResultTable(params: SheetGetResultTableParams): PresignedUrl =
        getResultTable(params, RequestOptions.none())

    /** @see getResultTable */
    fun getResultTable(
        params: SheetGetResultTableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PresignedUrl

    /** A view of [SheetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SheetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/beta/sheets/jobs`, but is otherwise the
         * same as [SheetService.create].
         */
        @MustBeClosed
        fun create(params: SheetCreateParams): HttpResponseFor<SheetsJob> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SheetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SheetsJob>

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/sheets/jobs`, but is otherwise the same
         * as [SheetService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SheetListPage> = list(SheetListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SheetListParams = SheetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SheetListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: SheetListParams = SheetListParams.none()): HttpResponseFor<SheetListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SheetListPage> =
            list(SheetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/beta/sheets/jobs/{spreadsheet_job_id}`,
         * but is otherwise the same as [SheetService.deleteJob].
         */
        @MustBeClosed
        fun deleteJob(spreadsheetJobId: String): HttpResponseFor<SheetDeleteJobResponse> =
            deleteJob(spreadsheetJobId, SheetDeleteJobParams.none())

        /** @see deleteJob */
        @MustBeClosed
        fun deleteJob(
            spreadsheetJobId: String,
            params: SheetDeleteJobParams = SheetDeleteJobParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SheetDeleteJobResponse> =
            deleteJob(params.toBuilder().spreadsheetJobId(spreadsheetJobId).build(), requestOptions)

        /** @see deleteJob */
        @MustBeClosed
        fun deleteJob(
            spreadsheetJobId: String,
            params: SheetDeleteJobParams = SheetDeleteJobParams.none(),
        ): HttpResponseFor<SheetDeleteJobResponse> =
            deleteJob(spreadsheetJobId, params, RequestOptions.none())

        /** @see deleteJob */
        @MustBeClosed
        fun deleteJob(
            params: SheetDeleteJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SheetDeleteJobResponse>

        /** @see deleteJob */
        @MustBeClosed
        fun deleteJob(params: SheetDeleteJobParams): HttpResponseFor<SheetDeleteJobResponse> =
            deleteJob(params, RequestOptions.none())

        /** @see deleteJob */
        @MustBeClosed
        fun deleteJob(
            spreadsheetJobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SheetDeleteJobResponse> =
            deleteJob(spreadsheetJobId, SheetDeleteJobParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/beta/sheets/jobs/{spreadsheet_job_id}`, but
         * is otherwise the same as [SheetService.get].
         */
        @MustBeClosed
        fun get(spreadsheetJobId: String): HttpResponseFor<SheetsJob> =
            get(spreadsheetJobId, SheetGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            spreadsheetJobId: String,
            params: SheetGetParams = SheetGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SheetsJob> =
            get(params.toBuilder().spreadsheetJobId(spreadsheetJobId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            spreadsheetJobId: String,
            params: SheetGetParams = SheetGetParams.none(),
        ): HttpResponseFor<SheetsJob> = get(spreadsheetJobId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SheetGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SheetsJob>

        /** @see get */
        @MustBeClosed
        fun get(params: SheetGetParams): HttpResponseFor<SheetsJob> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            spreadsheetJobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SheetsJob> = get(spreadsheetJobId, SheetGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/beta/sheets/jobs/{spreadsheet_job_id}/regions/{region_id}/result/{region_type}`,
         * but is otherwise the same as [SheetService.getResultTable].
         */
        @MustBeClosed
        fun getResultTable(
            regionType: SheetGetResultTableParams.RegionType,
            params: SheetGetResultTableParams,
        ): HttpResponseFor<PresignedUrl> = getResultTable(regionType, params, RequestOptions.none())

        /** @see getResultTable */
        @MustBeClosed
        fun getResultTable(
            regionType: SheetGetResultTableParams.RegionType,
            params: SheetGetResultTableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PresignedUrl> =
            getResultTable(params.toBuilder().regionType(regionType).build(), requestOptions)

        /** @see getResultTable */
        @MustBeClosed
        fun getResultTable(params: SheetGetResultTableParams): HttpResponseFor<PresignedUrl> =
            getResultTable(params, RequestOptions.none())

        /** @see getResultTable */
        @MustBeClosed
        fun getResultTable(
            params: SheetGetResultTableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PresignedUrl>
    }
}
