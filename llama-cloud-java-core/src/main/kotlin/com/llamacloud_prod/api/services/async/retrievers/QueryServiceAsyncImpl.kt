// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.retrievers

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
import com.llamacloud_prod.api.models.retrievers.CompositeRetrievalResult
import com.llamacloud_prod.api.models.retrievers.query.QuerySearchParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class QueryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    QueryServiceAsync {

    private val withRawResponse: QueryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): QueryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueryServiceAsync =
        QueryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun search(
        params: QuerySearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompositeRetrievalResult> =
        // post /api/v1/retrievers/{retriever_id}/retrieve
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QueryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueryServiceAsync.WithRawResponse =
            QueryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val searchHandler: Handler<CompositeRetrievalResult> =
            jsonHandler<CompositeRetrievalResult>(clientOptions.jsonMapper)

        override fun search(
            params: QuerySearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompositeRetrievalResult>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("retrieverId", params.retrieverId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "retrievers", params._pathParam(0), "retrieve")
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
    }
}
