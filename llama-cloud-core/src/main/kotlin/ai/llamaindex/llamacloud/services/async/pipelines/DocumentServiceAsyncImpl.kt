// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.pipelines

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
import ai.llamaindex.llamacloud.core.prepareAsync
import ai.llamaindex.llamacloud.models.pipelines.ManagedIngestionStatusResponse
import ai.llamaindex.llamacloud.models.pipelines.documents.CloudDocument
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentCreateParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentDeleteParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentGetChunksParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentGetParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentGetStatusParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentListPageAsync
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentListPageResponse
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentListParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentSyncParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentSyncResponse
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentUpsertParams
import ai.llamaindex.llamacloud.models.pipelines.documents.TextNode
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DocumentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentServiceAsync {

    private val withRawResponse: DocumentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentServiceAsync =
        DocumentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("deprecated")
    override fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<CloudDocument>> =
        // post /api/v1/pipelines/{pipeline_id}/documents
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentListPageAsync> =
        // get /api/v1/pipelines/{pipeline_id}/documents/paginated
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun delete(
        params: DocumentDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/v1/pipelines/{pipeline_id}/documents/{document_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    @Deprecated("deprecated")
    override fun get(
        params: DocumentGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CloudDocument> =
        // get /api/v1/pipelines/{pipeline_id}/documents/{document_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun getChunks(
        params: DocumentGetChunksParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TextNode>> =
        // get /api/v1/pipelines/{pipeline_id}/documents/{document_id}/chunks
        withRawResponse().getChunks(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun getStatus(
        params: DocumentGetStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedIngestionStatusResponse> =
        // get /api/v1/pipelines/{pipeline_id}/documents/{document_id}/status
        withRawResponse().getStatus(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun sync(
        params: DocumentSyncParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentSyncResponse> =
        // post /api/v1/pipelines/{pipeline_id}/documents/{document_id}/sync
        withRawResponse().sync(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun upsert(
        params: DocumentUpsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<CloudDocument>> =
        // put /api/v1/pipelines/{pipeline_id}/documents
        withRawResponse().upsert(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentServiceAsync.WithRawResponse =
            DocumentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<List<CloudDocument>> =
            jsonHandler<List<CloudDocument>>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<CloudDocument>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0), "documents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<DocumentListPageResponse> =
            jsonHandler<DocumentListPageResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> {
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
                        "documents",
                        "paginated",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                DocumentListPageAsync.builder()
                                    .service(DocumentServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        @Deprecated("deprecated")
        override fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "documents",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<CloudDocument> =
            jsonHandler<CloudDocument>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun get(
            params: DocumentGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CloudDocument>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "documents",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getChunksHandler: Handler<List<TextNode>> =
            jsonHandler<List<TextNode>>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun getChunks(
            params: DocumentGetChunksParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TextNode>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "documents",
                        params._pathParam(1),
                        "chunks",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getChunksHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val getStatusHandler: Handler<ManagedIngestionStatusResponse> =
            jsonHandler<ManagedIngestionStatusResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun getStatus(
            params: DocumentGetStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "documents",
                        params._pathParam(1),
                        "status",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val syncHandler: Handler<DocumentSyncResponse> =
            jsonHandler<DocumentSyncResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun sync(
            params: DocumentSyncParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentSyncResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("documentId", params.documentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "documents",
                        params._pathParam(1),
                        "sync",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { syncHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val upsertHandler: Handler<List<CloudDocument>> =
            jsonHandler<List<CloudDocument>>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun upsert(
            params: DocumentUpsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<CloudDocument>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0), "documents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { upsertHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }
    }
}
