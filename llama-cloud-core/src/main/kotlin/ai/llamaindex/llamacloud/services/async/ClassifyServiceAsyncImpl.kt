// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

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
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateParams
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyGetParams
import ai.llamaindex.llamacloud.models.classify.ClassifyGetResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyListPageAsync
import ai.llamaindex.llamacloud.models.classify.ClassifyListPageResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ClassifyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ClassifyServiceAsync {

    private val withRawResponse: ClassifyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ClassifyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClassifyServiceAsync =
        ClassifyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ClassifyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClassifyCreateResponse> =
        // post /api/v2/classify
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ClassifyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClassifyListPageAsync> =
        // get /api/v2/classify
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: ClassifyGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClassifyGetResponse> =
        // get /api/v2/classify/{job_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClassifyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClassifyServiceAsync.WithRawResponse =
            ClassifyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ClassifyCreateResponse> =
            jsonHandler<ClassifyCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ClassifyCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClassifyCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "classify")
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

        private val listHandler: Handler<ClassifyListPageResponse> =
            jsonHandler<ClassifyListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ClassifyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClassifyListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "classify")
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
                                ClassifyListPageAsync.builder()
                                    .service(ClassifyServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val getHandler: Handler<ClassifyGetResponse> =
            jsonHandler<ClassifyGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ClassifyGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClassifyGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "classify", params._pathParam(0))
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
