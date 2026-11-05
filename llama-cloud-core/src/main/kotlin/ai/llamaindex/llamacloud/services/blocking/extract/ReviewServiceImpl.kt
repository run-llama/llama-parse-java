// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.extract

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
import ai.llamaindex.llamacloud.core.prepare
import ai.llamaindex.llamacloud.models.extract.review.ExtractReview
import ai.llamaindex.llamacloud.models.extract.review.ReviewApproveParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewChangeFieldsParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewCreateParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewGetParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewListEventsPage
import ai.llamaindex.llamacloud.models.extract.review.ReviewListEventsPageResponse
import ai.llamaindex.llamacloud.models.extract.review.ReviewListEventsParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewRejectParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewReopenParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ReviewServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReviewService {

    private val withRawResponse: ReviewService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReviewService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReviewService =
        ReviewServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: ReviewCreateParams, requestOptions: RequestOptions): ExtractReview =
        // post /api/v2/extract/{job_id}/review
        withRawResponse().create(params, requestOptions).parse()

    override fun approve(
        params: ReviewApproveParams,
        requestOptions: RequestOptions,
    ): ExtractReview =
        // post /api/v2/extract/{job_id}/review/approve
        withRawResponse().approve(params, requestOptions).parse()

    override fun changeFields(
        params: ReviewChangeFieldsParams,
        requestOptions: RequestOptions,
    ): ExtractReview =
        // post /api/v2/extract/{job_id}/review/fields
        withRawResponse().changeFields(params, requestOptions).parse()

    override fun get(params: ReviewGetParams, requestOptions: RequestOptions): ExtractReview =
        // get /api/v2/extract/{job_id}/review
        withRawResponse().get(params, requestOptions).parse()

    override fun listEvents(
        params: ReviewListEventsParams,
        requestOptions: RequestOptions,
    ): ReviewListEventsPage =
        // get /api/v2/extract/{job_id}/review/events
        withRawResponse().listEvents(params, requestOptions).parse()

    override fun reject(params: ReviewRejectParams, requestOptions: RequestOptions): ExtractReview =
        // post /api/v2/extract/{job_id}/review/reject
        withRawResponse().reject(params, requestOptions).parse()

    override fun reopen(params: ReviewReopenParams, requestOptions: RequestOptions): ExtractReview =
        // post /api/v2/extract/{job_id}/review/reopen
        withRawResponse().reopen(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReviewService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReviewService.WithRawResponse =
            ReviewServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExtractReview> =
            jsonHandler<ExtractReview>(clientOptions.jsonMapper)

        override fun create(
            params: ReviewCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractReview> {
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

        private val approveHandler: Handler<ExtractReview> =
            jsonHandler<ExtractReview>(clientOptions.jsonMapper)

        override fun approve(
            params: ReviewApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractReview> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { approveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val changeFieldsHandler: Handler<ExtractReview> =
            jsonHandler<ExtractReview>(clientOptions.jsonMapper)

        override fun changeFields(
            params: ReviewChangeFieldsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractReview> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { changeFieldsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<ExtractReview> =
            jsonHandler<ExtractReview>(clientOptions.jsonMapper)

        override fun get(
            params: ReviewGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractReview> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "extract", params._pathParam(0), "review")
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

        private val listEventsHandler: Handler<ReviewListEventsPageResponse> =
            jsonHandler<ReviewListEventsPageResponse>(clientOptions.jsonMapper)

        override fun listEvents(
            params: ReviewListEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReviewListEventsPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ReviewListEventsPage.builder()
                            .service(ReviewServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val rejectHandler: Handler<ExtractReview> =
            jsonHandler<ExtractReview>(clientOptions.jsonMapper)

        override fun reject(
            params: ReviewRejectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractReview> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { rejectHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val reopenHandler: Handler<ExtractReview> =
            jsonHandler<ExtractReview>(clientOptions.jsonMapper)

        override fun reopen(
            params: ReviewReopenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractReview> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
