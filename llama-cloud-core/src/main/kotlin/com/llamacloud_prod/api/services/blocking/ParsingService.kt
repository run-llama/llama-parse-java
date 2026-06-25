// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.parsing.ParsingCreateParams
import com.llamacloud_prod.api.models.parsing.ParsingCreateResponse
import com.llamacloud_prod.api.models.parsing.ParsingGetParams
import com.llamacloud_prod.api.models.parsing.ParsingGetResponse
import com.llamacloud_prod.api.models.parsing.ParsingListPage
import com.llamacloud_prod.api.models.parsing.ParsingListParams
import java.util.function.Consumer

interface ParsingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParsingService

    /**
     * Parse a file by file ID or URL.
     *
     * Provide either `file_id` (a previously uploaded file) or `source_url` (a publicly accessible
     * URL). Configure parsing with options like `tier`, `target_pages`, and `lang`.
     *
     * ## Tiers
     * - `fast` — rule-based, cheapest, no AI
     * - `cost_effective` — balanced speed and quality
     * - `agentic` — full AI-powered parsing
     * - `agentic_plus` — premium AI with specialized features
     *
     * The job runs asynchronously. Poll `GET /parse/{job_id}` with `expand=text` or
     * `expand=markdown` to retrieve results.
     */
    fun create(params: ParsingCreateParams): ParsingCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ParsingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParsingCreateResponse

    /**
     * List parse jobs for the current project.
     *
     * Filter by `status` or creation date range. Results are paginated — use `page_token` from the
     * response to fetch subsequent pages.
     */
    fun list(): ParsingListPage = list(ParsingListParams.none())

    /** @see list */
    fun list(
        params: ParsingListParams = ParsingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParsingListPage

    /** @see list */
    fun list(params: ParsingListParams = ParsingListParams.none()): ParsingListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ParsingListPage =
        list(ParsingListParams.none(), requestOptions)

    /**
     * Retrieve a parse job with optional expanded content.
     *
     * By default returns job metadata only. Use `expand` to include parsed content:
     * - `text` — plain text output
     * - `markdown` — markdown output
     * - `items` — structured page-by-page output
     * - `job_metadata` — usage and processing details
     *
     * Content metadata fields (e.g. `text_content_metadata`) return presigned URLs for downloading
     * large results.
     */
    fun get(jobId: String): ParsingGetResponse = get(jobId, ParsingGetParams.none())

    /** @see get */
    fun get(
        jobId: String,
        params: ParsingGetParams = ParsingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParsingGetResponse = get(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see get */
    fun get(jobId: String, params: ParsingGetParams = ParsingGetParams.none()): ParsingGetResponse =
        get(jobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ParsingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParsingGetResponse

    /** @see get */
    fun get(params: ParsingGetParams): ParsingGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(jobId: String, requestOptions: RequestOptions): ParsingGetResponse =
        get(jobId, ParsingGetParams.none(), requestOptions)

    /** A view of [ParsingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParsingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/parse`, but is otherwise the same as
         * [ParsingService.create].
         */
        @MustBeClosed
        fun create(params: ParsingCreateParams): HttpResponseFor<ParsingCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ParsingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParsingCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v2/parse`, but is otherwise the same as
         * [ParsingService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ParsingListPage> = list(ParsingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ParsingListParams = ParsingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParsingListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ParsingListParams = ParsingListParams.none()
        ): HttpResponseFor<ParsingListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ParsingListPage> =
            list(ParsingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/parse/{job_id}`, but is otherwise the same
         * as [ParsingService.get].
         */
        @MustBeClosed
        fun get(jobId: String): HttpResponseFor<ParsingGetResponse> =
            get(jobId, ParsingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            jobId: String,
            params: ParsingGetParams = ParsingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParsingGetResponse> =
            get(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            jobId: String,
            params: ParsingGetParams = ParsingGetParams.none(),
        ): HttpResponseFor<ParsingGetResponse> = get(jobId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ParsingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParsingGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ParsingGetParams): HttpResponseFor<ParsingGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParsingGetResponse> = get(jobId, ParsingGetParams.none(), requestOptions)
    }
}
