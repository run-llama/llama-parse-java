// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.configurations.ConfigurationCreate
import ai.llamaindex.llamacloud.models.extract.ExtractCreateParams
import ai.llamaindex.llamacloud.models.extract.ExtractDeleteParams
import ai.llamaindex.llamacloud.models.extract.ExtractDeleteResponse
import ai.llamaindex.llamacloud.models.extract.ExtractGenerateSchemaParams
import ai.llamaindex.llamacloud.models.extract.ExtractGetParams
import ai.llamaindex.llamacloud.models.extract.ExtractListPage
import ai.llamaindex.llamacloud.models.extract.ExtractListParams
import ai.llamaindex.llamacloud.models.extract.ExtractV2Job
import ai.llamaindex.llamacloud.models.extract.ExtractV2JobCreate
import ai.llamaindex.llamacloud.models.extract.ExtractV2SchemaGenerateRequest
import ai.llamaindex.llamacloud.models.extract.ExtractV2SchemaValidateRequest
import ai.llamaindex.llamacloud.models.extract.ExtractV2SchemaValidateResponse
import ai.llamaindex.llamacloud.models.extract.ExtractValidateSchemaParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ExtractService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtractService

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
    fun create(params: ExtractCreateParams): ExtractV2Job = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExtractCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractV2Job

    /** @see create */
    fun create(
        extractV2JobCreate: ExtractV2JobCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractV2Job =
        create(
            ExtractCreateParams.builder().extractV2JobCreate(extractV2JobCreate).build(),
            requestOptions,
        )

    /** @see create */
    fun create(extractV2JobCreate: ExtractV2JobCreate): ExtractV2Job =
        create(extractV2JobCreate, RequestOptions.none())

    /**
     * List extraction jobs with optional filtering and pagination.
     *
     * Filter by `configuration_id`, `status`, `file_input`, or creation date range. Results are
     * returned newest-first. Use `expand=configuration` to include the full configuration used, and
     * `expand=extract_metadata` for per-field metadata.
     */
    fun list(): ExtractListPage = list(ExtractListParams.none())

    /** @see list */
    fun list(
        params: ExtractListParams = ExtractListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractListPage

    /** @see list */
    fun list(params: ExtractListParams = ExtractListParams.none()): ExtractListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ExtractListPage =
        list(ExtractListParams.none(), requestOptions)

    /** Delete an extraction job and its results. */
    fun delete(jobId: String): ExtractDeleteResponse = delete(jobId, ExtractDeleteParams.none())

    /** @see delete */
    fun delete(
        jobId: String,
        params: ExtractDeleteParams = ExtractDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractDeleteResponse = delete(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see delete */
    fun delete(
        jobId: String,
        params: ExtractDeleteParams = ExtractDeleteParams.none(),
    ): ExtractDeleteResponse = delete(jobId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ExtractDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractDeleteResponse

    /** @see delete */
    fun delete(params: ExtractDeleteParams): ExtractDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(jobId: String, requestOptions: RequestOptions): ExtractDeleteResponse =
        delete(jobId, ExtractDeleteParams.none(), requestOptions)

    /** Generate a JSON schema and return a product configuration request. */
    fun generateSchema(params: ExtractGenerateSchemaParams): ConfigurationCreate =
        generateSchema(params, RequestOptions.none())

    /** @see generateSchema */
    fun generateSchema(
        params: ExtractGenerateSchemaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationCreate

    /** @see generateSchema */
    fun generateSchema(
        extractV2SchemaGenerateRequest: ExtractV2SchemaGenerateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationCreate =
        generateSchema(
            ExtractGenerateSchemaParams.builder()
                .extractV2SchemaGenerateRequest(extractV2SchemaGenerateRequest)
                .build(),
            requestOptions,
        )

    /** @see generateSchema */
    fun generateSchema(
        extractV2SchemaGenerateRequest: ExtractV2SchemaGenerateRequest
    ): ConfigurationCreate = generateSchema(extractV2SchemaGenerateRequest, RequestOptions.none())

    /**
     * Get a single extraction job by ID.
     *
     * Returns the job status and results when complete. Use `expand=configuration` to include the
     * full configuration used, and `expand=extract_metadata` for per-field metadata.
     */
    fun get(jobId: String): ExtractV2Job = get(jobId, ExtractGetParams.none())

    /** @see get */
    fun get(
        jobId: String,
        params: ExtractGetParams = ExtractGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractV2Job = get(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see get */
    fun get(jobId: String, params: ExtractGetParams = ExtractGetParams.none()): ExtractV2Job =
        get(jobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ExtractGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractV2Job

    /** @see get */
    fun get(params: ExtractGetParams): ExtractV2Job = get(params, RequestOptions.none())

    /** @see get */
    fun get(jobId: String, requestOptions: RequestOptions): ExtractV2Job =
        get(jobId, ExtractGetParams.none(), requestOptions)

    /** Validate a JSON schema for extraction. */
    fun validateSchema(params: ExtractValidateSchemaParams): ExtractV2SchemaValidateResponse =
        validateSchema(params, RequestOptions.none())

    /** @see validateSchema */
    fun validateSchema(
        params: ExtractValidateSchemaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractV2SchemaValidateResponse

    /** @see validateSchema */
    fun validateSchema(
        extractV2SchemaValidateRequest: ExtractV2SchemaValidateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractV2SchemaValidateResponse =
        validateSchema(
            ExtractValidateSchemaParams.builder()
                .extractV2SchemaValidateRequest(extractV2SchemaValidateRequest)
                .build(),
            requestOptions,
        )

    /** @see validateSchema */
    fun validateSchema(
        extractV2SchemaValidateRequest: ExtractV2SchemaValidateRequest
    ): ExtractV2SchemaValidateResponse =
        validateSchema(extractV2SchemaValidateRequest, RequestOptions.none())

    /** A view of [ExtractService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtractService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/extract`, but is otherwise the same as
         * [ExtractService.create].
         */
        @MustBeClosed
        fun create(params: ExtractCreateParams): HttpResponseFor<ExtractV2Job> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExtractCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractV2Job>

        /** @see create */
        @MustBeClosed
        fun create(
            extractV2JobCreate: ExtractV2JobCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractV2Job> =
            create(
                ExtractCreateParams.builder().extractV2JobCreate(extractV2JobCreate).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(extractV2JobCreate: ExtractV2JobCreate): HttpResponseFor<ExtractV2Job> =
            create(extractV2JobCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v2/extract`, but is otherwise the same as
         * [ExtractService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ExtractListPage> = list(ExtractListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExtractListParams = ExtractListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExtractListParams = ExtractListParams.none()
        ): HttpResponseFor<ExtractListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExtractListPage> =
            list(ExtractListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/extract/{job_id}`, but is otherwise the
         * same as [ExtractService.delete].
         */
        @MustBeClosed
        fun delete(jobId: String): HttpResponseFor<ExtractDeleteResponse> =
            delete(jobId, ExtractDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            jobId: String,
            params: ExtractDeleteParams = ExtractDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractDeleteResponse> =
            delete(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            jobId: String,
            params: ExtractDeleteParams = ExtractDeleteParams.none(),
        ): HttpResponseFor<ExtractDeleteResponse> = delete(jobId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ExtractDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ExtractDeleteParams): HttpResponseFor<ExtractDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractDeleteResponse> =
            delete(jobId, ExtractDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/extract/schema/generate`, but is otherwise
         * the same as [ExtractService.generateSchema].
         */
        @MustBeClosed
        fun generateSchema(
            params: ExtractGenerateSchemaParams
        ): HttpResponseFor<ConfigurationCreate> = generateSchema(params, RequestOptions.none())

        /** @see generateSchema */
        @MustBeClosed
        fun generateSchema(
            params: ExtractGenerateSchemaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationCreate>

        /** @see generateSchema */
        @MustBeClosed
        fun generateSchema(
            extractV2SchemaGenerateRequest: ExtractV2SchemaGenerateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationCreate> =
            generateSchema(
                ExtractGenerateSchemaParams.builder()
                    .extractV2SchemaGenerateRequest(extractV2SchemaGenerateRequest)
                    .build(),
                requestOptions,
            )

        /** @see generateSchema */
        @MustBeClosed
        fun generateSchema(
            extractV2SchemaGenerateRequest: ExtractV2SchemaGenerateRequest
        ): HttpResponseFor<ConfigurationCreate> =
            generateSchema(extractV2SchemaGenerateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v2/extract/{job_id}`, but is otherwise the same
         * as [ExtractService.get].
         */
        @MustBeClosed
        fun get(jobId: String): HttpResponseFor<ExtractV2Job> = get(jobId, ExtractGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            jobId: String,
            params: ExtractGetParams = ExtractGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractV2Job> =
            get(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            jobId: String,
            params: ExtractGetParams = ExtractGetParams.none(),
        ): HttpResponseFor<ExtractV2Job> = get(jobId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ExtractGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractV2Job>

        /** @see get */
        @MustBeClosed
        fun get(params: ExtractGetParams): HttpResponseFor<ExtractV2Job> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(jobId: String, requestOptions: RequestOptions): HttpResponseFor<ExtractV2Job> =
            get(jobId, ExtractGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/extract/schema/validation`, but is
         * otherwise the same as [ExtractService.validateSchema].
         */
        @MustBeClosed
        fun validateSchema(
            params: ExtractValidateSchemaParams
        ): HttpResponseFor<ExtractV2SchemaValidateResponse> =
            validateSchema(params, RequestOptions.none())

        /** @see validateSchema */
        @MustBeClosed
        fun validateSchema(
            params: ExtractValidateSchemaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractV2SchemaValidateResponse>

        /** @see validateSchema */
        @MustBeClosed
        fun validateSchema(
            extractV2SchemaValidateRequest: ExtractV2SchemaValidateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractV2SchemaValidateResponse> =
            validateSchema(
                ExtractValidateSchemaParams.builder()
                    .extractV2SchemaValidateRequest(extractV2SchemaValidateRequest)
                    .build(),
                requestOptions,
            )

        /** @see validateSchema */
        @MustBeClosed
        fun validateSchema(
            extractV2SchemaValidateRequest: ExtractV2SchemaValidateRequest
        ): HttpResponseFor<ExtractV2SchemaValidateResponse> =
            validateSchema(extractV2SchemaValidateRequest, RequestOptions.none())
    }
}
