// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta

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
import com.llamacloud_prod.api.models.beta.agentdata.AgentData
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataAggregatePageAsync
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataAggregatePageResponse
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataAggregateParams
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataCreateParams
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataDeleteByQueryParams
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataDeleteByQueryResponse
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataDeleteParams
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataDeleteResponse
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataGetParams
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataSearchPageAsync
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataSearchPageResponse
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataSearchParams
import com.llamacloud_prod.api.models.beta.agentdata.AgentDataUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AgentDataServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentDataServiceAsync {

    private val withRawResponse: AgentDataServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AgentDataServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentDataServiceAsync =
        AgentDataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AgentDataCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentData> =
        // post /api/v1/beta/agent-data
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AgentDataUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentData> =
        // put /api/v1/beta/agent-data/{item_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AgentDataDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentDataDeleteResponse> =
        // delete /api/v1/beta/agent-data/{item_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun aggregate(
        params: AgentDataAggregateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentDataAggregatePageAsync> =
        // post /api/v1/beta/agent-data/:aggregate
        withRawResponse().aggregate(params, requestOptions).thenApply { it.parse() }

    override fun deleteByQuery(
        params: AgentDataDeleteByQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentDataDeleteByQueryResponse> =
        // post /api/v1/beta/agent-data/:delete
        withRawResponse().deleteByQuery(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: AgentDataGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentData> =
        // get /api/v1/beta/agent-data/{item_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: AgentDataSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentDataSearchPageAsync> =
        // post /api/v1/beta/agent-data/:search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentDataServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentDataServiceAsync.WithRawResponse =
            AgentDataServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AgentData> =
            jsonHandler<AgentData>(clientOptions.jsonMapper)

        override fun create(
            params: AgentDataCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentData>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "agent-data")
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

        private val updateHandler: Handler<AgentData> =
            jsonHandler<AgentData>(clientOptions.jsonMapper)

        override fun update(
            params: AgentDataUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentData>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("itemId", params.itemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "agent-data", params._pathParam(0))
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

        private val deleteHandler: Handler<AgentDataDeleteResponse> =
            jsonHandler<AgentDataDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AgentDataDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentDataDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("itemId", params.itemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "agent-data", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val aggregateHandler: Handler<AgentDataAggregatePageResponse> =
            jsonHandler<AgentDataAggregatePageResponse>(clientOptions.jsonMapper)

        override fun aggregate(
            params: AgentDataAggregateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentDataAggregatePageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "agent-data", ":aggregate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { aggregateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                AgentDataAggregatePageAsync.builder()
                                    .service(AgentDataServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteByQueryHandler: Handler<AgentDataDeleteByQueryResponse> =
            jsonHandler<AgentDataDeleteByQueryResponse>(clientOptions.jsonMapper)

        override fun deleteByQuery(
            params: AgentDataDeleteByQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentDataDeleteByQueryResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "agent-data", ":delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteByQueryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<AgentData> =
            jsonHandler<AgentData>(clientOptions.jsonMapper)

        override fun get(
            params: AgentDataGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentData>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("itemId", params.itemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "agent-data", params._pathParam(0))
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

        private val searchHandler: Handler<AgentDataSearchPageResponse> =
            jsonHandler<AgentDataSearchPageResponse>(clientOptions.jsonMapper)

        override fun search(
            params: AgentDataSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentDataSearchPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "agent-data", ":search")
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
                            .let {
                                AgentDataSearchPageAsync.builder()
                                    .service(AgentDataServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
