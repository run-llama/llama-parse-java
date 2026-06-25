// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

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
import com.llamacloud_prod.api.core.prepareAsync
import com.llamacloud_prod.api.models.pipelines.ManagedIngestionStatusResponse
import com.llamacloud_prod.api.models.pipelines.Pipeline
import com.llamacloud_prod.api.models.pipelines.PipelineCreateParams
import com.llamacloud_prod.api.models.pipelines.PipelineDeleteParams
import com.llamacloud_prod.api.models.pipelines.PipelineGetParams
import com.llamacloud_prod.api.models.pipelines.PipelineGetStatusParams
import com.llamacloud_prod.api.models.pipelines.PipelineListParams
import com.llamacloud_prod.api.models.pipelines.PipelineRetrieveParams
import com.llamacloud_prod.api.models.pipelines.PipelineRetrieveResponse
import com.llamacloud_prod.api.models.pipelines.PipelineUpdateParams
import com.llamacloud_prod.api.models.pipelines.PipelineUpsertParams
import com.llamacloud_prod.api.services.async.pipelines.DataSourceServiceAsync
import com.llamacloud_prod.api.services.async.pipelines.DataSourceServiceAsyncImpl
import com.llamacloud_prod.api.services.async.pipelines.DocumentServiceAsync
import com.llamacloud_prod.api.services.async.pipelines.DocumentServiceAsyncImpl
import com.llamacloud_prod.api.services.async.pipelines.FileServiceAsync
import com.llamacloud_prod.api.services.async.pipelines.FileServiceAsyncImpl
import com.llamacloud_prod.api.services.async.pipelines.ImageServiceAsync
import com.llamacloud_prod.api.services.async.pipelines.ImageServiceAsyncImpl
import com.llamacloud_prod.api.services.async.pipelines.MetadataServiceAsync
import com.llamacloud_prod.api.services.async.pipelines.MetadataServiceAsyncImpl
import com.llamacloud_prod.api.services.async.pipelines.SyncServiceAsync
import com.llamacloud_prod.api.services.async.pipelines.SyncServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PipelineServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PipelineServiceAsync {

    private val withRawResponse: PipelineServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sync: SyncServiceAsync by lazy { SyncServiceAsyncImpl(clientOptions) }

    private val dataSources: DataSourceServiceAsync by lazy {
        DataSourceServiceAsyncImpl(clientOptions)
    }

    private val images: ImageServiceAsync by lazy { ImageServiceAsyncImpl(clientOptions) }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptions) }

    private val metadata: MetadataServiceAsync by lazy { MetadataServiceAsyncImpl(clientOptions) }

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PipelineServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineServiceAsync =
        PipelineServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun sync(): SyncServiceAsync = sync

    override fun dataSources(): DataSourceServiceAsync = dataSources

    override fun images(): ImageServiceAsync = images

    override fun files(): FileServiceAsync = files

    override fun metadata(): MetadataServiceAsync = metadata

    override fun documents(): DocumentServiceAsync = documents

    @Deprecated("deprecated")
    override fun create(
        params: PipelineCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pipeline> =
        // post /api/v1/pipelines
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun retrieve(
        params: PipelineRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PipelineRetrieveResponse> =
        // post /api/v1/pipelines/{pipeline_id}/retrieve
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun update(
        params: PipelineUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pipeline> =
        // put /api/v1/pipelines/{pipeline_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun list(
        params: PipelineListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Pipeline>> =
        // get /api/v1/pipelines
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun delete(
        params: PipelineDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/v1/pipelines/{pipeline_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    @Deprecated("deprecated")
    override fun get(
        params: PipelineGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pipeline> =
        // get /api/v1/pipelines/{pipeline_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun getStatus(
        params: PipelineGetStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedIngestionStatusResponse> =
        // get /api/v1/pipelines/{pipeline_id}/status
        withRawResponse().getStatus(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun upsert(
        params: PipelineUpsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pipeline> =
        // put /api/v1/pipelines
        withRawResponse().upsert(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PipelineServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val sync: SyncServiceAsync.WithRawResponse by lazy {
            SyncServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataSources: DataSourceServiceAsync.WithRawResponse by lazy {
            DataSourceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val images: ImageServiceAsync.WithRawResponse by lazy {
            ImageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val metadata: MetadataServiceAsync.WithRawResponse by lazy {
            MetadataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val documents: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PipelineServiceAsync.WithRawResponse =
            PipelineServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun sync(): SyncServiceAsync.WithRawResponse = sync

        override fun dataSources(): DataSourceServiceAsync.WithRawResponse = dataSources

        override fun images(): ImageServiceAsync.WithRawResponse = images

        override fun files(): FileServiceAsync.WithRawResponse = files

        override fun metadata(): MetadataServiceAsync.WithRawResponse = metadata

        override fun documents(): DocumentServiceAsync.WithRawResponse = documents

        private val createHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines")
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
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<PipelineRetrieveResponse> =
            jsonHandler<PipelineRetrieveResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun retrieve(
            params: PipelineRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PipelineRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0), "retrieve")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<Pipeline>> =
            jsonHandler<List<Pipeline>>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun list(
            params: PipelineListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Pipeline>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines")
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
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        @Deprecated("deprecated")
        override fun delete(
            params: PipelineDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0))
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

        private val getHandler: Handler<Pipeline> = jsonHandler<Pipeline>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0))
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

        private val getStatusHandler: Handler<ManagedIngestionStatusResponse> =
            jsonHandler<ManagedIngestionStatusResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun getStatus(
            params: PipelineGetStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0), "status")
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

        private val upsertHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun upsert(
            params: PipelineUpsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines")
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
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
