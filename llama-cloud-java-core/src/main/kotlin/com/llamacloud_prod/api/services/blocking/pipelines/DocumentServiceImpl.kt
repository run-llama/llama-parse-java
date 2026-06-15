// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.pipelines

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.handlers.emptyHandler
import com.llamacloud_prod.api.core.handlers.errorBodyHandler
import com.llamacloud_prod.api.core.handlers.errorHandler
import com.llamacloud_prod.api.core.handlers.jsonHandler
import com.llamacloud_prod.api.core.http.HttpMethod
import com.llamacloud_prod.api.core.http.HttpRequest
import com.llamacloud_prod.api.core.http.HttpResponse
import com.llamacloud_prod.api.core.http.HttpResponse.Handler
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.core.http.json
import com.llamacloud_prod.api.core.http.parseable
import com.llamacloud_prod.api.core.prepare
import com.llamacloud_prod.api.models.pipelines.ManagedIngestionStatusResponse
import com.llamacloud_prod.api.models.pipelines.documents.CloudDocument
import com.llamacloud_prod.api.models.pipelines.documents.DocumentCreateParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentDeleteParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentGetChunksParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentGetParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentGetStatusParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentListPage
import com.llamacloud_prod.api.models.pipelines.documents.DocumentListPageResponse
import com.llamacloud_prod.api.models.pipelines.documents.DocumentListParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentSyncParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentSyncResponse
import com.llamacloud_prod.api.models.pipelines.documents.DocumentUpsertParams
import com.llamacloud_prod.api.models.pipelines.documents.TextNode
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DocumentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentService {

    private val withRawResponse: DocumentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService =
        DocumentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions,
    ): List<CloudDocument> =
        // post /api/v1/pipelines/{pipeline_id}/documents
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions,
    ): DocumentListPage =
        // get /api/v1/pipelines/{pipeline_id}/documents/paginated
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DocumentDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/pipelines/{pipeline_id}/documents/{document_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: DocumentGetParams, requestOptions: RequestOptions): CloudDocument =
        // get /api/v1/pipelines/{pipeline_id}/documents/{document_id}
        withRawResponse().get(params, requestOptions).parse()

    override fun getChunks(
        params: DocumentGetChunksParams,
        requestOptions: RequestOptions,
    ): List<TextNode> =
        // get /api/v1/pipelines/{pipeline_id}/documents/{document_id}/chunks
        withRawResponse().getChunks(params, requestOptions).parse()

    override fun getStatus(
        params: DocumentGetStatusParams,
        requestOptions: RequestOptions,
    ): ManagedIngestionStatusResponse =
        // get /api/v1/pipelines/{pipeline_id}/documents/{document_id}/status
        withRawResponse().getStatus(params, requestOptions).parse()

    override fun sync(
        params: DocumentSyncParams,
        requestOptions: RequestOptions,
    ): DocumentSyncResponse =
        // post /api/v1/pipelines/{pipeline_id}/documents/{document_id}/sync
        withRawResponse().sync(params, requestOptions).parse()

    override fun upsert(
        params: DocumentUpsertParams,
        requestOptions: RequestOptions,
    ): List<CloudDocument> =
        // put /api/v1/pipelines/{pipeline_id}/documents
        withRawResponse().upsert(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentService.WithRawResponse =
            DocumentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<List<CloudDocument>> =
            jsonHandler<List<CloudDocument>>(clientOptions.jsonMapper)

        override fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CloudDocument>> {
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

        private val listHandler: Handler<DocumentListPageResponse> =
            jsonHandler<DocumentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentListPage> {
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
                        DocumentListPage.builder()
                            .service(DocumentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: DocumentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<CloudDocument> =
            jsonHandler<CloudDocument>(clientOptions.jsonMapper)

        override fun get(
            params: DocumentGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CloudDocument> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getChunksHandler: Handler<List<TextNode>> =
            jsonHandler<List<TextNode>>(clientOptions.jsonMapper)

        override fun getChunks(
            params: DocumentGetChunksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TextNode>> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getChunksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val getStatusHandler: Handler<ManagedIngestionStatusResponse> =
            jsonHandler<ManagedIngestionStatusResponse>(clientOptions.jsonMapper)

        override fun getStatus(
            params: DocumentGetStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagedIngestionStatusResponse> {
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

        private val syncHandler: Handler<DocumentSyncResponse> =
            jsonHandler<DocumentSyncResponse>(clientOptions.jsonMapper)

        override fun sync(
            params: DocumentSyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentSyncResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { syncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val upsertHandler: Handler<List<CloudDocument>> =
            jsonHandler<List<CloudDocument>>(clientOptions.jsonMapper)

        override fun upsert(
            params: DocumentUpsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CloudDocument>> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
