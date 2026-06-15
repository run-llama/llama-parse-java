// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.pipelines

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.checkRequired
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
import com.llamacloud_prod.api.models.pipelines.datasources.DataSourceGetDataSourcesParams
import com.llamacloud_prod.api.models.pipelines.datasources.DataSourceGetStatusParams
import com.llamacloud_prod.api.models.pipelines.datasources.DataSourceSyncParams
import com.llamacloud_prod.api.models.pipelines.datasources.DataSourceUpdateDataSourcesParams
import com.llamacloud_prod.api.models.pipelines.datasources.DataSourceUpdateParams
import com.llamacloud_prod.api.models.pipelines.datasources.PipelineDataSource
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DataSourceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DataSourceServiceAsync {

    private val withRawResponse: DataSourceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DataSourceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataSourceServiceAsync =
        DataSourceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: DataSourceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PipelineDataSource> =
        // put /api/v1/pipelines/{pipeline_id}/data-sources/{data_source_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun getDataSources(
        params: DataSourceGetDataSourcesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<PipelineDataSource>> =
        // get /api/v1/pipelines/{pipeline_id}/data-sources
        withRawResponse().getDataSources(params, requestOptions).thenApply { it.parse() }

    override fun getStatus(
        params: DataSourceGetStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedIngestionStatusResponse> =
        // get /api/v1/pipelines/{pipeline_id}/data-sources/{data_source_id}/status
        withRawResponse().getStatus(params, requestOptions).thenApply { it.parse() }

    override fun sync(
        params: DataSourceSyncParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Pipeline> =
        // post /api/v1/pipelines/{pipeline_id}/data-sources/{data_source_id}/sync
        withRawResponse().sync(params, requestOptions).thenApply { it.parse() }

    override fun updateDataSources(
        params: DataSourceUpdateDataSourcesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<PipelineDataSource>> =
        // put /api/v1/pipelines/{pipeline_id}/data-sources
        withRawResponse().updateDataSources(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataSourceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataSourceServiceAsync.WithRawResponse =
            DataSourceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<PipelineDataSource> =
            jsonHandler<PipelineDataSource>(clientOptions.jsonMapper)

        override fun update(
            params: DataSourceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PipelineDataSource>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dataSourceId", params.dataSourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "data-sources",
                        params._pathParam(1),
                    )
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

        private val getDataSourcesHandler: Handler<List<PipelineDataSource>> =
            jsonHandler<List<PipelineDataSource>>(clientOptions.jsonMapper)

        override fun getDataSources(
            params: DataSourceGetDataSourcesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<PipelineDataSource>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0), "data-sources")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDataSourcesHandler.handle(it) }
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

        override fun getStatus(
            params: DataSourceGetStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagedIngestionStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dataSourceId", params.dataSourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "data-sources",
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

        private val syncHandler: Handler<Pipeline> = jsonHandler<Pipeline>(clientOptions.jsonMapper)

        override fun sync(
            params: DataSourceSyncParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Pipeline>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dataSourceId", params.dataSourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "pipelines",
                        params._pathParam(0),
                        "data-sources",
                        params._pathParam(1),
                        "sync",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val updateDataSourcesHandler: Handler<List<PipelineDataSource>> =
            jsonHandler<List<PipelineDataSource>>(clientOptions.jsonMapper)

        override fun updateDataSources(
            params: DataSourceUpdateDataSourcesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<PipelineDataSource>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pipelineId", params.pipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "pipelines", params._pathParam(0), "data-sources")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateDataSourcesHandler.handle(it) }
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
