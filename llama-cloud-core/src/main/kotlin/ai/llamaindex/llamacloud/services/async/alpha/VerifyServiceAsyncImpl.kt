// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.alpha

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.checkRequired
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
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCancelParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCancelResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCreateParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCreateResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetDetailsParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetDetailsResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyListPageAsync
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyListPageResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VerifyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VerifyServiceAsync {

    private val withRawResponse: VerifyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VerifyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifyServiceAsync =
        VerifyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: VerifyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyCreateResponse> =
        // post /api/alpha/verify
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: VerifyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyListPageAsync> =
        // get /api/alpha/verify
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: VerifyCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyCancelResponse> =
        // post /api/alpha/verify/{job_id}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: VerifyGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyGetResponse> =
        // get /api/alpha/verify/{job_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getDetails(
        params: VerifyGetDetailsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyGetDetailsResponse> =
        // get /api/alpha/verify/{job_id}/details
        withRawResponse().getDetails(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerifyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerifyServiceAsync.WithRawResponse =
            VerifyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VerifyCreateResponse> =
            jsonHandler<VerifyCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VerifyCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "alpha", "verify")
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

        private val listHandler: Handler<VerifyListPageResponse> =
            jsonHandler<VerifyListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VerifyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "alpha", "verify")
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
                                VerifyListPageAsync.builder()
                                    .service(VerifyServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val cancelHandler: Handler<VerifyCancelResponse> =
            jsonHandler<VerifyCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: VerifyCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyCancelResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "alpha", "verify", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<VerifyGetResponse> =
            jsonHandler<VerifyGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: VerifyGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "alpha", "verify", params._pathParam(0))
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

        private val getDetailsHandler: Handler<VerifyGetDetailsResponse> =
            jsonHandler<VerifyGetDetailsResponse>(clientOptions.jsonMapper)

        override fun getDetails(
            params: VerifyGetDetailsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyGetDetailsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "alpha", "verify", params._pathParam(0), "details")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDetailsHandler.handle(it) }
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
