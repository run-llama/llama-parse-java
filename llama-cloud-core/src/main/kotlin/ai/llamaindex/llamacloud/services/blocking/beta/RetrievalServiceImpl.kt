// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta

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
import ai.llamaindex.llamacloud.core.prepare
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalFindPage
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalFindPageResponse
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalFindParams
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalGrepPage
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalGrepPageResponse
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalGrepParams
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalReadParams
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalReadResponse
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalRetrieveParams
import ai.llamaindex.llamacloud.models.beta.retrieval.RetrievalRetrieveResponse
import java.util.function.Consumer

class RetrievalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RetrievalService {

    private val withRawResponse: RetrievalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RetrievalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetrievalService =
        RetrievalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RetrievalRetrieveParams,
        requestOptions: RequestOptions,
    ): RetrievalRetrieveResponse =
        // post /api/v1/retrieval/retrieve
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun find(
        params: RetrievalFindParams,
        requestOptions: RequestOptions,
    ): RetrievalFindPage =
        // post /api/v1/retrieval/files/find
        withRawResponse().find(params, requestOptions).parse()

    override fun grep(
        params: RetrievalGrepParams,
        requestOptions: RequestOptions,
    ): RetrievalGrepPage =
        // post /api/v1/retrieval/files/grep
        withRawResponse().grep(params, requestOptions).parse()

    override fun read(
        params: RetrievalReadParams,
        requestOptions: RequestOptions,
    ): RetrievalReadResponse =
        // post /api/v1/retrieval/files/read
        withRawResponse().read(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RetrievalService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RetrievalService.WithRawResponse =
            RetrievalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<RetrievalRetrieveResponse> =
            jsonHandler<RetrievalRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RetrievalRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RetrievalRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrieval", "retrieve")
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

        private val findHandler: Handler<RetrievalFindPageResponse> =
            jsonHandler<RetrievalFindPageResponse>(clientOptions.jsonMapper)

        override fun find(
            params: RetrievalFindParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RetrievalFindPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrieval", "files", "find")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { findHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        RetrievalFindPage.builder()
                            .service(RetrievalServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val grepHandler: Handler<RetrievalGrepPageResponse> =
            jsonHandler<RetrievalGrepPageResponse>(clientOptions.jsonMapper)

        override fun grep(
            params: RetrievalGrepParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RetrievalGrepPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrieval", "files", "grep")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { grepHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        RetrievalGrepPage.builder()
                            .service(RetrievalServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val readHandler: Handler<RetrievalReadResponse> =
            jsonHandler<RetrievalReadResponse>(clientOptions.jsonMapper)

        override fun read(
            params: RetrievalReadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RetrievalReadResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrieval", "files", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
