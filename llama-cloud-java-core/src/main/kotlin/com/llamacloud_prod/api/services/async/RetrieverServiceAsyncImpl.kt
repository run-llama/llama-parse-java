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
import com.llamacloud_prod.api.models.retrievers.CompositeRetrievalResult
import com.llamacloud_prod.api.models.retrievers.Retriever
import com.llamacloud_prod.api.models.retrievers.RetrieverCreateParams
import com.llamacloud_prod.api.models.retrievers.RetrieverDeleteParams
import com.llamacloud_prod.api.models.retrievers.RetrieverGetParams
import com.llamacloud_prod.api.models.retrievers.RetrieverListParams
import com.llamacloud_prod.api.models.retrievers.RetrieverSearchParams
import com.llamacloud_prod.api.models.retrievers.RetrieverUpdateParams
import com.llamacloud_prod.api.models.retrievers.RetrieverUpsertParams
import com.llamacloud_prod.api.services.async.retrievers.QueryServiceAsync
import com.llamacloud_prod.api.services.async.retrievers.QueryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RetrieverServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RetrieverServiceAsync {

    private val withRawResponse: RetrieverServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val query: QueryServiceAsync by lazy { QueryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): RetrieverServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetrieverServiceAsync =
        RetrieverServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun query(): QueryServiceAsync = query

    override fun create(
        params: RetrieverCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Retriever> =
        // post /api/v1/retrievers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: RetrieverUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Retriever> =
        // put /api/v1/retrievers/{retriever_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RetrieverListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Retriever>> =
        // get /api/v1/retrievers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: RetrieverDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/v1/retrievers/{retriever_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: RetrieverGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Retriever> =
        // get /api/v1/retrievers/{retriever_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: RetrieverSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompositeRetrievalResult> =
        // post /api/v1/retrievers/retrieve
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    override fun upsert(
        params: RetrieverUpsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Retriever> =
        // put /api/v1/retrievers
        withRawResponse().upsert(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RetrieverServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val query: QueryServiceAsync.WithRawResponse by lazy {
            QueryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RetrieverServiceAsync.WithRawResponse =
            RetrieverServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun query(): QueryServiceAsync.WithRawResponse = query

        private val createHandler: Handler<Retriever> =
            jsonHandler<Retriever>(clientOptions.jsonMapper)

        override fun create(
            params: RetrieverCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Retriever>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers")
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

        private val updateHandler: Handler<Retriever> =
            jsonHandler<Retriever>(clientOptions.jsonMapper)

        override fun update(
            params: RetrieverUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Retriever>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("retrieverId", params.retrieverId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers", params._pathParam(0))
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

        private val listHandler: Handler<List<Retriever>> =
            jsonHandler<List<Retriever>>(clientOptions.jsonMapper)

        override fun list(
            params: RetrieverListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Retriever>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers")
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
            params: RetrieverDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("retrieverId", params.retrieverId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers", params._pathParam(0))
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

        private val getHandler: Handler<Retriever> =
            jsonHandler<Retriever>(clientOptions.jsonMapper)

        override fun get(
            params: RetrieverGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Retriever>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("retrieverId", params.retrieverId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers", params._pathParam(0))
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

        private val searchHandler: Handler<CompositeRetrievalResult> =
            jsonHandler<CompositeRetrievalResult>(clientOptions.jsonMapper)

        override fun search(
            params: RetrieverSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompositeRetrievalResult>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers", "retrieve")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val upsertHandler: Handler<Retriever> =
            jsonHandler<Retriever>(clientOptions.jsonMapper)

        override fun upsert(
            params: RetrieverUpsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Retriever>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers")
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
