// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.classifier

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
import ai.llamaindex.llamacloud.models.classifier.jobs.ClassifyJob
import ai.llamaindex.llamacloud.models.classifier.jobs.JobCreateParams
import ai.llamaindex.llamacloud.models.classifier.jobs.JobGetParams
import ai.llamaindex.llamacloud.models.classifier.jobs.JobGetResultsParams
import ai.llamaindex.llamacloud.models.classifier.jobs.JobGetResultsResponse
import ai.llamaindex.llamacloud.models.classifier.jobs.JobListPage
import ai.llamaindex.llamacloud.models.classifier.jobs.JobListPageResponse
import ai.llamaindex.llamacloud.models.classifier.jobs.JobListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JobServiceImpl internal constructor(private val clientOptions: ClientOptions) : JobService {

    private val withRawResponse: JobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService =
        JobServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    @Deprecated("Please use `client.classify.create()`")
    override fun create(params: JobCreateParams, requestOptions: RequestOptions): ClassifyJob =
        // post /api/v1/classifier/jobs
        withRawResponse().create(params, requestOptions).parse()

    @Deprecated("Please use `client.classify.list()`")
    override fun list(params: JobListParams, requestOptions: RequestOptions): JobListPage =
        // get /api/v1/classifier/jobs
        withRawResponse().list(params, requestOptions).parse()

    @Deprecated("Please use `client.classify.get()`")
    override fun get(params: JobGetParams, requestOptions: RequestOptions): ClassifyJob =
        // get /api/v1/classifier/jobs/{classify_job_id}
        withRawResponse().get(params, requestOptions).parse()

    @Deprecated("Please use `client.classify.get()`")
    override fun getResults(
        params: JobGetResultsParams,
        requestOptions: RequestOptions,
    ): JobGetResultsResponse =
        // get /api/v1/classifier/jobs/{classify_job_id}/results
        withRawResponse().getResults(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JobService.WithRawResponse =
            JobServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ClassifyJob> =
            jsonHandler<ClassifyJob>(clientOptions.jsonMapper)

        @Deprecated("Please use `client.classify.create()`")
        override fun create(
            params: JobCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassifyJob> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "classifier", "jobs")
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

        private val listHandler: Handler<JobListPageResponse> =
            jsonHandler<JobListPageResponse>(clientOptions.jsonMapper)

        @Deprecated("Please use `client.classify.list()`")
        override fun list(
            params: JobListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "classifier", "jobs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        JobListPage.builder()
                            .service(JobServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<ClassifyJob> =
            jsonHandler<ClassifyJob>(clientOptions.jsonMapper)

        @Deprecated("Please use `client.classify.get()`")
        override fun get(
            params: JobGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassifyJob> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("classifyJobId", params.classifyJobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "classifier", "jobs", params._pathParam(0))
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

        private val getResultsHandler: Handler<JobGetResultsResponse> =
            jsonHandler<JobGetResultsResponse>(clientOptions.jsonMapper)

        @Deprecated("Please use `client.classify.get()`")
        override fun getResults(
            params: JobGetResultsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobGetResultsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
