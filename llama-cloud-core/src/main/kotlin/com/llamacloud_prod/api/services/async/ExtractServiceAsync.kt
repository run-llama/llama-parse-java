// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.configurations.ConfigurationCreate
import com.llamacloud_prod.api.models.extract.ExtractCreateParams
import com.llamacloud_prod.api.models.extract.ExtractDeleteParams
import com.llamacloud_prod.api.models.extract.ExtractDeleteResponse
import com.llamacloud_prod.api.models.extract.ExtractGenerateSchemaParams
import com.llamacloud_prod.api.models.extract.ExtractGetParams
import com.llamacloud_prod.api.models.extract.ExtractListPageAsync
import com.llamacloud_prod.api.models.extract.ExtractListParams
import com.llamacloud_prod.api.models.extract.ExtractV2Job
import com.llamacloud_prod.api.models.extract.ExtractV2JobCreate
import com.llamacloud_prod.api.models.extract.ExtractV2SchemaGenerateRequest
import com.llamacloud_prod.api.models.extract.ExtractV2SchemaValidateRequest
import com.llamacloud_prod.api.models.extract.ExtractV2SchemaValidateResponse
import com.llamacloud_prod.api.models.extract.ExtractValidateSchemaParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExtractServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtractServiceAsync

    /**
     * Create an extraction job.
     *
     * Extracts structured data from a document using either a saved configuration or an inline JSON
     * Schema.
     *
     * ## Input
     *
     * Provide exactly one of:
     * - `configuration_id` — reference a saved extraction config
     * - `configuration` — inline configuration with a `data_schema`
     *
     * ## Document input
     *
     * Set `file_input` to a file ID (`dfl-...`) or a completed parse job ID (`pjb-...`).
     *
     * The job runs asynchronously. Poll `GET /extract/{job_id}` or register a webhook to monitor
     * completion.
     */
    fun create(params: ExtractCreateParams): CompletableFuture<ExtractV2Job> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExtractCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtractV2Job>

    /** @see create */
    fun create(
        extractV2JobCreate: ExtractV2JobCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtractV2Job> =
        create(
            ExtractCreateParams.builder().extractV2JobCreate(extractV2JobCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(extractV2JobCreate: ExtractV2JobCreate): CompletableFuture<ExtractV2Job> =
        create(extractV2JobCreate, RequestOptions.none())

    /**
     * List extraction jobs with optional filtering and pagination.
     *
     * Filter by `configuration_id`, `status`, `file_input`, or creation date range. Results are
     * returned newest-first. Use `expand=configuration` to include the full configuration used, and
     * `expand=extract_metadata` for per-field metadata.
     */
    fun list(): CompletableFuture<ExtractListPageAsync> = list(ExtractListParams.none())

    /** @see list */
    fun list(
        params: ExtractListParams = ExtractListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtractListPageAsync>

    /** @see list */
    fun list(
        params: ExtractListParams = ExtractListParams.none()
    ): CompletableFuture<ExtractListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExtractListPageAsync> =
        list(ExtractListParams.none(), requestOptions)

    /** Delete an extraction job and its results. */
    fun delete(jobId: String): CompletableFuture<ExtractDeleteResponse> =
        delete(jobId, ExtractDeleteParams.none())

    /** @see delete */
    fun delete(
        jobId: String,
        params: ExtractDeleteParams = ExtractDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtractDeleteResponse> =
        delete(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see delete */
    fun delete(
        jobId: String,
        params: ExtractDeleteParams = ExtractDeleteParams.none(),
    ): CompletableFuture<ExtractDeleteResponse> = delete(jobId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ExtractDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtractDeleteResponse>

    /** @see delete */
    fun delete(params: ExtractDeleteParams): CompletableFuture<ExtractDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        jobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExtractDeleteResponse> =
        delete(jobId, ExtractDeleteParams.none(), requestOptions)

    /** Generate a JSON schema and return a product configuration request. */
    fun generateSchema(
        params: ExtractGenerateSchemaParams
    ): CompletableFuture<ConfigurationCreate> = generateSchema(params, RequestOptions.none())

    /** @see generateSchema */
    fun generateSchema(
        params: ExtractGenerateSchemaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigurationCreate>

    /** @see generateSchema */
    fun generateSchema(
        extractV2SchemaGenerateRequest: ExtractV2SchemaGenerateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigurationCreate> =
        generateSchema(
            ExtractGenerateSchemaParams.builder()
                .extractV2SchemaGenerateRequest(extractV2SchemaGenerateRequest)
                .build(),
            requestOptions,
        )

    /** @see generateSchema */
    fun generateSchema(
        extractV2SchemaGenerateRequest: ExtractV2SchemaGenerateRequest
    ): CompletableFuture<ConfigurationCreate> =
        generateSchema(extractV2SchemaGenerateRequest, RequestOptions.none())

    /**
     * Get a single extraction job by ID.
     *
     * Returns the job status and results when complete. Use `expand=configuration` to include the
     * full configuration used, and `expand=extract_metadata` for per-field metadata.
     */
    fun get(jobId: String): CompletableFuture<ExtractV2Job> = get(jobId, ExtractGetParams.none())

    /** @see get */
    fun get(
        jobId: String,
        params: ExtractGetParams = ExtractGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtractV2Job> =
        get(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see get */
    fun get(
        jobId: String,
        params: ExtractGetParams = ExtractGetParams.none(),
    ): CompletableFuture<ExtractV2Job> = get(jobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ExtractGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtractV2Job>

    /** @see get */
    fun get(params: ExtractGetParams): CompletableFuture<ExtractV2Job> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(jobId: String, requestOptions: RequestOptions): CompletableFuture<ExtractV2Job> =
        get(jobId, ExtractGetParams.none(), requestOptions)

    /** Validate a JSON schema for extraction. */
    fun validateSchema(
        params: ExtractValidateSchemaParams
    ): CompletableFuture<ExtractV2SchemaValidateResponse> =
        validateSchema(params, RequestOptions.none())

    /** @see validateSchema */
    fun validateSchema(
        params: ExtractValidateSchemaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtractV2SchemaValidateResponse>

    /** @see validateSchema */
    fun validateSchema(
        extractV2SchemaValidateRequest: ExtractV2SchemaValidateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtractV2SchemaValidateResponse> =
        validateSchema(
            ExtractValidateSchemaParams.builder()
                .extractV2SchemaValidateRequest(extractV2SchemaValidateRequest)
                .build(),
            requestOptions,
        )

    /** @see validateSchema */
    fun validateSchema(
        extractV2SchemaValidateRequest: ExtractV2SchemaValidateRequest
    ): CompletableFuture<ExtractV2SchemaValidateResponse> =
        validateSchema(extractV2SchemaValidateRequest, RequestOptions.none())

    /**
     * A view of [ExtractServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExtractServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/extract`, but is otherwise the same as
         * [ExtractServiceAsync.create].
         */
        fun create(params: ExtractCreateParams): CompletableFuture<HttpResponseFor<ExtractV2Job>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExtractCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtractV2Job>>

        /** @see create */
        fun create(
            extractV2JobCreate: ExtractV2JobCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtractV2Job>> =
            create(
                ExtractCreateParams.builder().extractV2JobCreate(extractV2JobCreate).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            extractV2JobCreate: ExtractV2JobCreate
        ): CompletableFuture<HttpResponseFor<ExtractV2Job>> =
            create(extractV2JobCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v2/extract`, but is otherwise the same as
         * [ExtractServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ExtractListPageAsync>> =
            list(ExtractListParams.none())

        /** @see list */
        fun list(
            params: ExtractListParams = ExtractListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtractListPageAsync>>

        /** @see list */
        fun list(
            params: ExtractListParams = ExtractListParams.none()
        ): CompletableFuture<HttpResponseFor<ExtractListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExtractListPageAsync>> =
            list(ExtractListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/extract/{job_id}`, but is otherwise the
         * same as [ExtractServiceAsync.delete].
         */
        fun delete(jobId: String): CompletableFuture<HttpResponseFor<ExtractDeleteResponse>> =
            delete(jobId, ExtractDeleteParams.none())

        /** @see delete */
        fun delete(
            jobId: String,
            params: ExtractDeleteParams = ExtractDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtractDeleteResponse>> =
            delete(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see delete */
        fun delete(
            jobId: String,
            params: ExtractDeleteParams = ExtractDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ExtractDeleteResponse>> =
            delete(jobId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ExtractDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtractDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ExtractDeleteParams
        ): CompletableFuture<HttpResponseFor<ExtractDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExtractDeleteResponse>> =
            delete(jobId, ExtractDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/extract/schema/generate`, but is otherwise
         * the same as [ExtractServiceAsync.generateSchema].
         */
        fun generateSchema(
            params: ExtractGenerateSchemaParams
        ): CompletableFuture<HttpResponseFor<ConfigurationCreate>> =
            generateSchema(params, RequestOptions.none())

        /** @see generateSchema */
        fun generateSchema(
            params: ExtractGenerateSchemaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigurationCreate>>

        /** @see generateSchema */
        fun generateSchema(
            extractV2SchemaGenerateRequest: ExtractV2SchemaGenerateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigurationCreate>> =
            generateSchema(
                ExtractGenerateSchemaParams.builder()
                    .extractV2SchemaGenerateRequest(extractV2SchemaGenerateRequest)
                    .build(),
                requestOptions,
            )

        /** @see generateSchema */
        fun generateSchema(
            extractV2SchemaGenerateRequest: ExtractV2SchemaGenerateRequest
        ): CompletableFuture<HttpResponseFor<ConfigurationCreate>> =
            generateSchema(extractV2SchemaGenerateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v2/extract/{job_id}`, but is otherwise the same
         * as [ExtractServiceAsync.get].
         */
        fun get(jobId: String): CompletableFuture<HttpResponseFor<ExtractV2Job>> =
            get(jobId, ExtractGetParams.none())

        /** @see get */
        fun get(
            jobId: String,
            params: ExtractGetParams = ExtractGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtractV2Job>> =
            get(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see get */
        fun get(
            jobId: String,
            params: ExtractGetParams = ExtractGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ExtractV2Job>> =
            get(jobId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ExtractGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtractV2Job>>

        /** @see get */
        fun get(params: ExtractGetParams): CompletableFuture<HttpResponseFor<ExtractV2Job>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExtractV2Job>> =
            get(jobId, ExtractGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/extract/schema/validation`, but is
         * otherwise the same as [ExtractServiceAsync.validateSchema].
         */
        fun validateSchema(
            params: ExtractValidateSchemaParams
        ): CompletableFuture<HttpResponseFor<ExtractV2SchemaValidateResponse>> =
            validateSchema(params, RequestOptions.none())

        /** @see validateSchema */
        fun validateSchema(
            params: ExtractValidateSchemaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtractV2SchemaValidateResponse>>

        /** @see validateSchema */
        fun validateSchema(
            extractV2SchemaValidateRequest: ExtractV2SchemaValidateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtractV2SchemaValidateResponse>> =
            validateSchema(
                ExtractValidateSchemaParams.builder()
                    .extractV2SchemaValidateRequest(extractV2SchemaValidateRequest)
                    .build(),
                requestOptions,
            )

        /** @see validateSchema */
        fun validateSchema(
            extractV2SchemaValidateRequest: ExtractV2SchemaValidateRequest
        ): CompletableFuture<HttpResponseFor<ExtractV2SchemaValidateResponse>> =
            validateSchema(extractV2SchemaValidateRequest, RequestOptions.none())
    }
}
