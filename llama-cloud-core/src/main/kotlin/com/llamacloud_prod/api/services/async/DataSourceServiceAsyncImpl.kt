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
import com.llamacloud_prod.api.models.datasources.DataSource
import com.llamacloud_prod.api.models.datasources.DataSourceCreateParams
import com.llamacloud_prod.api.models.datasources.DataSourceDeleteParams
import com.llamacloud_prod.api.models.datasources.DataSourceGetParams
import com.llamacloud_prod.api.models.datasources.DataSourceListParams
import com.llamacloud_prod.api.models.datasources.DataSourceUpdateParams
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

    override fun create(
        params: DataSourceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataSource> =
        // post /api/v1/data-sources
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: DataSourceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataSource> =
        // put /api/v1/data-sources/{data_source_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DataSourceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<DataSource>> =
        // get /api/v1/data-sources
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DataSourceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/v1/data-sources/{data_source_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: DataSourceGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataSource> =
        // get /api/v1/data-sources/{data_source_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

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

        private val createHandler: Handler<DataSource> =
            jsonHandler<DataSource>(clientOptions.jsonMapper)

        override fun create(
            params: DataSourceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataSource>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sources")
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

        private val updateHandler: Handler<DataSource> =
            jsonHandler<DataSource>(clientOptions.jsonMapper)

        override fun update(
            params: DataSourceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataSource>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dataSourceId", params.dataSourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sources", params._pathParam(0))
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

        private val listHandler: Handler<List<DataSource>> =
            jsonHandler<List<DataSource>>(clientOptions.jsonMapper)

        override fun list(
            params: DataSourceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<DataSource>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sources")
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

        override fun delete(
            params: DataSourceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dataSourceId", params.dataSourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sources", params._pathParam(0))
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

        private val getHandler: Handler<DataSource> =
            jsonHandler<DataSource>(clientOptions.jsonMapper)

        override fun get(
            params: DataSourceGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataSource>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dataSourceId", params.dataSourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sources", params._pathParam(0))
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
    }
}
