// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.extract

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
import ai.llamaindex.llamacloud.models.extract.review.ExtractReview
import ai.llamaindex.llamacloud.models.extract.review.ReviewApproveParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewChangeFieldsParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewCreateParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewGetParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewListEventsPageAsync
import ai.llamaindex.llamacloud.models.extract.review.ReviewListEventsPageResponse
import ai.llamaindex.llamacloud.models.extract.review.ReviewListEventsParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewRejectParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewReopenParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ReviewServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReviewServiceAsync {

    private val withRawResponse: ReviewServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReviewServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReviewServiceAsync =
        ReviewServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ReviewCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExtractReview> =
        // post /api/v2/extract/{job_id}/review
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun approve(
        params: ReviewApproveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExtractReview> =
        // post /api/v2/extract/{job_id}/review/approve
        withRawResponse().approve(params, requestOptions).thenApply { it.parse() }

    override fun changeFields(
        params: ReviewChangeFieldsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExtractReview> =
        // post /api/v2/extract/{job_id}/review/fields
        withRawResponse().changeFields(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: ReviewGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExtractReview> =
        // get /api/v2/extract/{job_id}/review
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun listEvents(
        params: ReviewListEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReviewListEventsPageAsync> =
        // get /api/v2/extract/{job_id}/review/events
        withRawResponse().listEvents(params, requestOptions).thenApply { it.parse() }

    override fun reject(
        params: ReviewRejectParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExtractReview> =
        // post /api/v2/extract/{job_id}/review/reject
        withRawResponse().reject(params, requestOptions).thenApply { it.parse() }

    override fun reopen(
        params: ReviewReopenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExtractReview> =
        // post /api/v2/extract/{job_id}/review/reopen
        withRawResponse().reopen(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReviewServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReviewServiceAsync.WithRawResponse =
            ReviewServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExtractReview> =
            jsonHandler<ExtractReview>(clientOptions.jsonMapper)

        override fun create(
            params: ReviewCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExtractReview>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "extract", params._pathParam(0), "review")
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

        private val approveHandler: Handler<ExtractReview> =
            jsonHandler<ExtractReview>(clientOptions.jsonMapper)

        override fun approve(
            params: ReviewApproveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExtractReview>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v2",
                        "extract",
                        params._pathParam(0),
                        "review",
                        "approve",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { approveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val changeFieldsHandler: Handler<ExtractReview> =
            jsonHandler<ExtractReview>(clientOptions.jsonMapper)

        override fun changeFields(
            params: ReviewChangeFieldsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExtractReview>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v2",
                        "extract",
                        params._pathParam(0),
                        "review",
                        "fields",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { changeFieldsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<ExtractReview> =
            jsonHandler<ExtractReview>(clientOptions.jsonMapper)

        override fun get(
            params: ReviewGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExtractReview>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "extract", params._pathParam(0), "review")
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

        private val listEventsHandler: Handler<ReviewListEventsPageResponse> =
            jsonHandler<ReviewListEventsPageResponse>(clientOptions.jsonMapper)

        override fun listEvents(
            params: ReviewListEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReviewListEventsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v2",
                        "extract",
                        params._pathParam(0),
                        "review",
                        "events",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listEventsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ReviewListEventsPageAsync.builder()
                                    .service(ReviewServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val rejectHandler: Handler<ExtractReview> =
            jsonHandler<ExtractReview>(clientOptions.jsonMapper)

        override fun reject(
            params: ReviewRejectParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExtractReview>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v2",
                        "extract",
                        params._pathParam(0),
                        "review",
                        "reject",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { rejectHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val reopenHandler: Handler<ExtractReview> =
            jsonHandler<ExtractReview>(clientOptions.jsonMapper)

        override fun reopen(
            params: ReviewReopenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExtractReview>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v2",
                        "extract",
                        params._pathParam(0),
                        "review",
                        "reopen",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { reopenHandler.handle(it) }
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
