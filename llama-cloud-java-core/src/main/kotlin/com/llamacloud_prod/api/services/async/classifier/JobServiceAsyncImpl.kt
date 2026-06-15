// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.classifier

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
import com.llamacloud_prod.api.models.classifier.jobs.ClassifyJob
import com.llamacloud_prod.api.models.classifier.jobs.JobCreateParams
import com.llamacloud_prod.api.models.classifier.jobs.JobGetParams
import com.llamacloud_prod.api.models.classifier.jobs.JobGetResultsParams
import com.llamacloud_prod.api.models.classifier.jobs.JobGetResultsResponse
import com.llamacloud_prod.api.models.classifier.jobs.JobListPageAsync
import com.llamacloud_prod.api.models.classifier.jobs.JobListPageResponse
import com.llamacloud_prod.api.models.classifier.jobs.JobListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JobServiceAsync {

    private val withRawResponse: JobServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync =
        JobServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("Please use `client.classify.create()`")
    override fun create(
        params: JobCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClassifyJob> =
        // post /api/v1/classifier/jobs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    @Deprecated("Please use `client.classify.list()`")
    override fun list(
        params: JobListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobListPageAsync> =
        // get /api/v1/classifier/jobs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    @Deprecated("Please use `client.classify.get()`")
    override fun get(
        params: JobGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ClassifyJob> =
        // get /api/v1/classifier/jobs/{classify_job_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    @Deprecated("Please use `client.classify.get()`")
    override fun getResults(
        params: JobGetResultsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobGetResultsResponse> =
        // get /api/v1/classifier/jobs/{classify_job_id}/results
        withRawResponse().getResults(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JobServiceAsync.WithRawResponse =
            JobServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ClassifyJob> =
            jsonHandler<ClassifyJob>(clientOptions.jsonMapper)

        @Deprecated("Please use `client.classify.create()`")
        override fun create(
            params: JobCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClassifyJob>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "classifier", "jobs")
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

        private val listHandler: Handler<JobListPageResponse> =
            jsonHandler<JobListPageResponse>(clientOptions.jsonMapper)

        @Deprecated("Please use `client.classify.list()`")
        override fun list(
            params: JobListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "classifier", "jobs")
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
                                JobListPageAsync.builder()
                                    .service(JobServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val getHandler: Handler<ClassifyJob> =
            jsonHandler<ClassifyJob>(clientOptions.jsonMapper)

        @Deprecated("Please use `client.classify.get()`")
        override fun get(
            params: JobGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ClassifyJob>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("classifyJobId", params.classifyJobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "classifier", "jobs", params._pathParam(0))
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

        private val getResultsHandler: Handler<JobGetResultsResponse> =
            jsonHandler<JobGetResultsResponse>(clientOptions.jsonMapper)

        @Deprecated("Please use `client.classify.get()`")
        override fun getResults(
            params: JobGetResultsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobGetResultsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("classifyJobId", params.classifyJobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "classifier",
                        "jobs",
                        params._pathParam(0),
                        "results",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getResultsHandler.handle(it) }
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
