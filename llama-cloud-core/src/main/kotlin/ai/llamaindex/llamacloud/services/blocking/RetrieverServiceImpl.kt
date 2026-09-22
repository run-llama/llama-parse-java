// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

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
import ai.llamaindex.llamacloud.models.retrievers.CompositeRetrievalResult
import ai.llamaindex.llamacloud.models.retrievers.Retriever
import ai.llamaindex.llamacloud.models.retrievers.RetrieverCreateParams
import ai.llamaindex.llamacloud.models.retrievers.RetrieverDeleteParams
import ai.llamaindex.llamacloud.models.retrievers.RetrieverGetParams
import ai.llamaindex.llamacloud.models.retrievers.RetrieverListParams
import ai.llamaindex.llamacloud.models.retrievers.RetrieverSearchParams
import ai.llamaindex.llamacloud.models.retrievers.RetrieverUpdateParams
import ai.llamaindex.llamacloud.models.retrievers.RetrieverUpsertParams
import ai.llamaindex.llamacloud.services.blocking.retrievers.QueryService
import ai.llamaindex.llamacloud.services.blocking.retrievers.QueryServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RetrieverServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RetrieverService {

    private val withRawResponse: RetrieverService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val query: QueryService by lazy { QueryServiceImpl(clientOptions) }

    override fun withRawResponse(): RetrieverService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RetrieverService =
        RetrieverServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun query(): QueryService = query

    override fun create(params: RetrieverCreateParams, requestOptions: RequestOptions): Retriever =
        // post /api/v1/retrievers
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: RetrieverUpdateParams, requestOptions: RequestOptions): Retriever =
        // put /api/v1/retrievers/{retriever_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: RetrieverListParams,
        requestOptions: RequestOptions,
    ): List<Retriever> =
        // get /api/v1/retrievers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: RetrieverDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/retrievers/{retriever_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: RetrieverGetParams, requestOptions: RequestOptions): Retriever =
        // get /api/v1/retrievers/{retriever_id}
        withRawResponse().get(params, requestOptions).parse()

    override fun search(
        params: RetrieverSearchParams,
        requestOptions: RequestOptions,
    ): CompositeRetrievalResult =
        // post /api/v1/retrievers/retrieve
        withRawResponse().search(params, requestOptions).parse()

    override fun upsert(params: RetrieverUpsertParams, requestOptions: RequestOptions): Retriever =
        // put /api/v1/retrievers
        withRawResponse().upsert(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RetrieverService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val query: QueryService.WithRawResponse by lazy {
            QueryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RetrieverService.WithRawResponse =
            RetrieverServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun query(): QueryService.WithRawResponse = query

        private val createHandler: Handler<Retriever> =
            jsonHandler<Retriever>(clientOptions.jsonMapper)

        override fun create(
            params: RetrieverCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Retriever> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers")
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

        private val updateHandler: Handler<Retriever> =
            jsonHandler<Retriever>(clientOptions.jsonMapper)

        override fun update(
            params: RetrieverUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Retriever> {
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

        private val listHandler: Handler<List<Retriever>> =
            jsonHandler<List<Retriever>>(clientOptions.jsonMapper)

        override fun list(
            params: RetrieverListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Retriever>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers")
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
            params: RetrieverDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<Retriever> =
            jsonHandler<Retriever>(clientOptions.jsonMapper)

        override fun get(
            params: RetrieverGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Retriever> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("retrieverId", params.retrieverId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers", params._pathParam(0))
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

        private val searchHandler: Handler<CompositeRetrievalResult> =
            jsonHandler<CompositeRetrievalResult>(clientOptions.jsonMapper)

        override fun search(
            params: RetrieverSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompositeRetrievalResult> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers", "retrieve")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val upsertHandler: Handler<Retriever> =
            jsonHandler<Retriever>(clientOptions.jsonMapper)

        override fun upsert(
            params: RetrieverUpsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Retriever> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers")
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
