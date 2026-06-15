// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async

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
import com.llamacloud_prod.api.models.parsing.ParsingCreateParams
import com.llamacloud_prod.api.models.parsing.ParsingCreateResponse
import com.llamacloud_prod.api.models.parsing.ParsingGetParams
import com.llamacloud_prod.api.models.parsing.ParsingGetResponse
import com.llamacloud_prod.api.models.parsing.ParsingListPageAsync
import com.llamacloud_prod.api.models.parsing.ParsingListPageResponse
import com.llamacloud_prod.api.models.parsing.ParsingListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ParsingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ParsingServiceAsync {

    private val withRawResponse: ParsingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ParsingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParsingServiceAsync =
        ParsingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ParsingCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParsingCreateResponse> =
        // post /api/v2/parse
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ParsingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParsingListPageAsync> =
        // get /api/v2/parse
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: ParsingGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParsingGetResponse> =
        // get /api/v2/parse/{job_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ParsingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ParsingServiceAsync.WithRawResponse =
            ParsingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ParsingCreateResponse> =
            jsonHandler<ParsingCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ParsingCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParsingCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "parse")
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

        private val listHandler: Handler<ParsingListPageResponse> =
            jsonHandler<ParsingListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ParsingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParsingListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "parse")
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
                                    it.validate()
                                }
                            }
                            .let {
                                ParsingListPageAsync.builder()
                                    .service(ParsingServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val getHandler: Handler<ParsingGetResponse> =
            jsonHandler<ParsingGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ParsingGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParsingGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "parse", params._pathParam(0))
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
