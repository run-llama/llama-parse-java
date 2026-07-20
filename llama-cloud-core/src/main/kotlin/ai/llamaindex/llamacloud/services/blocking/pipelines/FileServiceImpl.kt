// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.pipelines

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.handlers.emptyHandler
import ai.llamaindex.llamacloud.core.handlers.errorBodyHandler
import ai.llamaindex.llamacloud.core.handlers.errorHandler
import ai.llamaindex.llamacloud.core.handlers.jsonHandler
import ai.llamaindex.llamacloud.core.http.HttpMethod
import ai.llamaindex.llamacloud.core.http.HttpRequest
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponse.Handler
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.core.http.json
import ai.llamaindex.llamacloud.core.http.parseable
import ai.llamaindex.llamacloud.core.prepare
import ai.llamaindex.llamacloud.models.pipelines.ManagedIngestionStatusResponse
import ai.llamaindex.llamacloud.models.pipelines.files.FileCreateParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileDeleteParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileGetStatusCountsParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileGetStatusCountsResponse
import ai.llamaindex.llamacloud.models.pipelines.files.FileGetStatusParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileListPage
import ai.llamaindex.llamacloud.models.pipelines.files.FileListPageResponse
import ai.llamaindex.llamacloud.models.pipelines.files.FileListParams
import ai.llamaindex.llamacloud.models.pipelines.files.FileUpdateParams
import ai.llamaindex.llamacloud.models.pipelines.files.PipelineFile
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FileServiceImpl internal constructor(private val clientOptions: ClientOptions) : FileService {

    private val withRawResponse: FileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService =
        FileServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions,
    ): List<PipelineFile> =
        // put /api/v1/pipelines/{pipeline_id}/files
        withRawResponse().create(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun update(params: FileUpdateParams, requestOptions: RequestOptions): PipelineFile =
        // put /api/v1/pipelines/{pipeline_id}/files/{file_id}
        withRawResponse().update(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun list(params: FileListParams, requestOptions: RequestOptions): FileListPage =
        // get /api/v1/pipelines/{pipeline_id}/files2
        withRawResponse().list(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun delete(params: FileDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/pipelines/{pipeline_id}/files/{file_id}
        withRawResponse().delete(params, requestOptions)
    }

    @Deprecated("deprecated")
    override fun getStatus(
        params: FileGetStatusParams,
        requestOptions: RequestOptions,
    ): ManagedIngestionStatusResponse =
        // get /api/v1/pipelines/{pipeline_id}/files/{file_id}/status
        withRawResponse().getStatus(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun getStatusCounts(
        params: FileGetStatusCountsParams,
        requestOptions: RequestOptions,
    ): FileGetStatusCountsResponse =
        // get /api/v1/pipelines/{pipeline_id}/files/status-counts
        withRawResponse().getStatusCounts(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileService.WithRawResponse =
            FileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<List<PipelineFile>> =
            jsonHandler<List<PipelineFile>>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<PipelineFile>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0), "files")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val updateHandler: Handler<PipelineFile> =
            jsonHandler<PipelineFile>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun update(
            params: FileUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PipelineFile> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "files",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<FileListPageResponse> =
            jsonHandler<FileListPageResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun list(
            params: FileListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0), "files2")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        FileListPage.builder()
                            .service(FileServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        @Deprecated("deprecated")
        override fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "files",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getStatusHandler: Handler<ManagedIngestionStatusResponse> =
            jsonHandler<ManagedIngestionStatusResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun getStatus(
            params: FileGetStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagedIngestionStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "files",
                        params._pathParam(1),
                        "status",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getStatusCountsHandler: Handler<FileGetStatusCountsResponse> =
            jsonHandler<FileGetStatusCountsResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun getStatusCounts(
            params: FileGetStatusCountsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileGetStatusCountsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "files",
                        "status-counts",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getStatusCountsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
