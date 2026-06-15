// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

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
import com.llamacloud_prod.api.services.blocking.pipelines.DataSourceService
import com.llamacloud_prod.api.services.blocking.pipelines.DataSourceServiceImpl
import com.llamacloud_prod.api.services.blocking.pipelines.DocumentService
import com.llamacloud_prod.api.services.blocking.pipelines.DocumentServiceImpl
import com.llamacloud_prod.api.services.blocking.pipelines.FileService
import com.llamacloud_prod.api.services.blocking.pipelines.FileServiceImpl
import com.llamacloud_prod.api.services.blocking.pipelines.ImageService
import com.llamacloud_prod.api.services.blocking.pipelines.ImageServiceImpl
import com.llamacloud_prod.api.services.blocking.pipelines.MetadataService
import com.llamacloud_prod.api.services.blocking.pipelines.MetadataServiceImpl
import com.llamacloud_prod.api.services.blocking.pipelines.SyncService
import com.llamacloud_prod.api.services.blocking.pipelines.SyncServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PipelineServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PipelineService {

    private val withRawResponse: PipelineService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sync: SyncService by lazy { SyncServiceImpl(clientOptions) }

    private val dataSources: DataSourceService by lazy { DataSourceServiceImpl(clientOptions) }

    private val images: ImageService by lazy { ImageServiceImpl(clientOptions) }

    private val files: FileService by lazy { FileServiceImpl(clientOptions) }

    private val metadata: MetadataService by lazy { MetadataServiceImpl(clientOptions) }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    override fun withRawResponse(): PipelineService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PipelineService =
        PipelineServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun sync(): SyncService = sync

    override fun dataSources(): DataSourceService = dataSources

    override fun images(): ImageService = images

    override fun files(): FileService = files

    override fun metadata(): MetadataService = metadata

    override fun documents(): DocumentService = documents

    override fun create(params: PipelineCreateParams, requestOptions: RequestOptions): Pipeline =
        // post /api/v1/pipelines
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PipelineRetrieveParams,
        requestOptions: RequestOptions,
    ): PipelineRetrieveResponse =
        // post /api/v1/pipelines/{pipeline_id}/retrieve
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: PipelineUpdateParams, requestOptions: RequestOptions): Pipeline =
        // put /api/v1/pipelines/{pipeline_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: PipelineListParams, requestOptions: RequestOptions): List<Pipeline> =
        // get /api/v1/pipelines
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PipelineDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/pipelines/{pipeline_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: PipelineGetParams, requestOptions: RequestOptions): Pipeline =
        // get /api/v1/pipelines/{pipeline_id}
        withRawResponse().get(params, requestOptions).parse()

    override fun getStatus(
        params: PipelineGetStatusParams,
        requestOptions: RequestOptions,
    ): ManagedIngestionStatusResponse =
        // get /api/v1/pipelines/{pipeline_id}/status
        withRawResponse().getStatus(params, requestOptions).parse()

    override fun upsert(params: PipelineUpsertParams, requestOptions: RequestOptions): Pipeline =
        // put /api/v1/pipelines
        withRawResponse().upsert(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PipelineService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val sync: SyncService.WithRawResponse by lazy {
            SyncServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dataSources: DataSourceService.WithRawResponse by lazy {
            DataSourceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val images: ImageService.WithRawResponse by lazy {
            ImageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val metadata: MetadataService.WithRawResponse by lazy {
            MetadataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val documents: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PipelineService.WithRawResponse =
            PipelineServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun sync(): SyncService.WithRawResponse = sync

        override fun dataSources(): DataSourceService.WithRawResponse = dataSources

        override fun images(): ImageService.WithRawResponse = images

        override fun files(): FileService.WithRawResponse = files

        override fun metadata(): MetadataService.WithRawResponse = metadata

        override fun documents(): DocumentService.WithRawResponse = documents

        private val createHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun create(
            params: PipelineCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Pipeline> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines")
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
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<PipelineRetrieveResponse> =
            jsonHandler<PipelineRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PipelineRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PipelineRetrieveResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun update(
            params: PipelineUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Pipeline> {
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

        private val listHandler: Handler<List<Pipeline>> =
            jsonHandler<List<Pipeline>>(clientOptions.jsonMapper)

        override fun list(
            params: PipelineListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Pipeline>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: PipelineDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<Pipeline> = jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun get(
            params: PipelineGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Pipeline> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0))
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

        private val getStatusHandler: Handler<ManagedIngestionStatusResponse> =
            jsonHandler<ManagedIngestionStatusResponse>(clientOptions.jsonMapper)

        override fun getStatus(
            params: PipelineGetStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagedIngestionStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0), "status")
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

        private val upsertHandler: Handler<Pipeline> =
            jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun upsert(
            params: PipelineUpsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Pipeline> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines")
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
                            it.validate()
                        }
                    }
            }
        }
    }
}
