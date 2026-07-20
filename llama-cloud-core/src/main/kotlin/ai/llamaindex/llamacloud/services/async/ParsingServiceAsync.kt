// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.parsing.ParsingCreateParams
import ai.llamaindex.llamacloud.models.parsing.ParsingCreateResponse
import ai.llamaindex.llamacloud.models.parsing.ParsingGetParams
import ai.llamaindex.llamacloud.models.parsing.ParsingGetResponse
import ai.llamaindex.llamacloud.models.parsing.ParsingListPageAsync
import ai.llamaindex.llamacloud.models.parsing.ParsingListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ParsingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParsingServiceAsync

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
    fun create(params: ParsingCreateParams): CompletableFuture<ParsingCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ParsingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParsingCreateResponse>

    /**
     * List parse jobs for the current project.
     *
     * Filter by `status` or creation date range. Results are paginated — use `page_token` from the
     * response to fetch subsequent pages.
     */
    fun list(): CompletableFuture<ParsingListPageAsync> = list(ParsingListParams.none())

    /** @see list */
    fun list(
        params: ParsingListParams = ParsingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParsingListPageAsync>

    /** @see list */
    fun list(
        params: ParsingListParams = ParsingListParams.none()
    ): CompletableFuture<ParsingListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ParsingListPageAsync> =
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
    fun get(jobId: String): CompletableFuture<ParsingGetResponse> =
        get(jobId, ParsingGetParams.none())

    /** @see get */
    fun get(
        jobId: String,
        params: ParsingGetParams = ParsingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParsingGetResponse> =
        get(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see get */
    fun get(
        jobId: String,
        params: ParsingGetParams = ParsingGetParams.none(),
    ): CompletableFuture<ParsingGetResponse> = get(jobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ParsingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParsingGetResponse>

    /** @see get */
    fun get(params: ParsingGetParams): CompletableFuture<ParsingGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(jobId: String, requestOptions: RequestOptions): CompletableFuture<ParsingGetResponse> =
        get(jobId, ParsingGetParams.none(), requestOptions)

    /**
     * A view of [ParsingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ParsingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/parse`, but is otherwise the same as
         * [ParsingServiceAsync.create].
         */
        fun create(
            params: ParsingCreateParams
        ): CompletableFuture<HttpResponseFor<ParsingCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ParsingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParsingCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v2/parse`, but is otherwise the same as
         * [ParsingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ParsingListPageAsync>> =
            list(ParsingListParams.none())

        /** @see list */
        fun list(
            params: ParsingListParams = ParsingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParsingListPageAsync>>

        /** @see list */
        fun list(
            params: ParsingListParams = ParsingListParams.none()
        ): CompletableFuture<HttpResponseFor<ParsingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ParsingListPageAsync>> =
            list(ParsingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/parse/{job_id}`, but is otherwise the same
         * as [ParsingServiceAsync.get].
         */
        fun get(jobId: String): CompletableFuture<HttpResponseFor<ParsingGetResponse>> =
            get(jobId, ParsingGetParams.none())

        /** @see get */
        fun get(
            jobId: String,
            params: ParsingGetParams = ParsingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParsingGetResponse>> =
            get(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see get */
        fun get(
            jobId: String,
            params: ParsingGetParams = ParsingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ParsingGetResponse>> =
            get(jobId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ParsingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParsingGetResponse>>

        /** @see get */
        fun get(params: ParsingGetParams): CompletableFuture<HttpResponseFor<ParsingGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParsingGetResponse>> =
            get(jobId, ParsingGetParams.none(), requestOptions)
    }
}
