// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.beta

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
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
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalFindPageAsync
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalFindPageResponse
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalFindParams
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalGrepPageAsync
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalGrepPageResponse
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalGrepParams
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalReadParams
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalReadResponse
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalRetrieveParams
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class RetrievalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RetrievalServiceAsync {

    private val withRawResponse: RetrievalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RetrievalServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetrievalServiceAsync =
        RetrievalServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RetrievalRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RetrievalRetrieveResponse> =
        // post /api/v1/retrieval/retrieve
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun find(
        params: RetrievalFindParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RetrievalFindPageAsync> =
        // post /api/v1/retrieval/files/find
        withRawResponse().find(params, requestOptions).thenApply { it.parse() }

    override fun grep(
        params: RetrievalGrepParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RetrievalGrepPageAsync> =
        // post /api/v1/retrieval/files/grep
        withRawResponse().grep(params, requestOptions).thenApply { it.parse() }

    override fun read(
        params: RetrievalReadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RetrievalReadResponse> =
        // post /api/v1/retrieval/files/read
        withRawResponse().read(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RetrievalServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RetrievalServiceAsync.WithRawResponse =
            RetrievalServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<RetrievalRetrieveResponse> =
            jsonHandler<RetrievalRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RetrievalRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RetrievalRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrieval", "retrieve")
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

        private val findHandler: Handler<RetrievalFindPageResponse> =
            jsonHandler<RetrievalFindPageResponse>(clientOptions.jsonMapper)

        override fun find(
            params: RetrievalFindParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RetrievalFindPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrieval", "files", "find")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { findHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                RetrievalFindPageAsync.builder()
                                    .service(RetrievalServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val grepHandler: Handler<RetrievalGrepPageResponse> =
            jsonHandler<RetrievalGrepPageResponse>(clientOptions.jsonMapper)

        override fun grep(
            params: RetrievalGrepParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RetrievalGrepPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrieval", "files", "grep")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { grepHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                RetrievalGrepPageAsync.builder()
                                    .service(RetrievalServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val readHandler: Handler<RetrievalReadResponse> =
            jsonHandler<RetrievalReadResponse>(clientOptions.jsonMapper)

        override fun read(
            params: RetrievalReadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RetrievalReadResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrieval", "files", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { readHandler.handle(it) }
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
