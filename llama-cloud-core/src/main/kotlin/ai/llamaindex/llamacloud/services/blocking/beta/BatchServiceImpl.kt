// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta

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
import ai.llamaindex.llamacloud.models.beta.batch.BatchCancelParams
import ai.llamaindex.llamacloud.models.beta.batch.BatchCancelResponse
import ai.llamaindex.llamacloud.models.beta.batch.BatchCreateParams
import ai.llamaindex.llamacloud.models.beta.batch.BatchCreateResponse
import ai.llamaindex.llamacloud.models.beta.batch.BatchGetStatusParams
import ai.llamaindex.llamacloud.models.beta.batch.BatchGetStatusResponse
import ai.llamaindex.llamacloud.models.beta.batch.BatchListPage
import ai.llamaindex.llamacloud.models.beta.batch.BatchListPageResponse
import ai.llamaindex.llamacloud.models.beta.batch.BatchListParams
import ai.llamaindex.llamacloud.services.blocking.beta.batch.JobItemService
import ai.llamaindex.llamacloud.services.blocking.beta.batch.JobItemServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchService {

    private val withRawResponse: BatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobItems: JobItemService by lazy { JobItemServiceImpl(clientOptions) }

    override fun withRawResponse(): BatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService =
        BatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun jobItems(): JobItemService = jobItems

    override fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions,
    ): BatchCreateResponse =
        // post /api/v1/beta/batch-processing
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: BatchListParams, requestOptions: RequestOptions): BatchListPage =
        // get /api/v1/beta/batch-processing
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(
        params: BatchCancelParams,
        requestOptions: RequestOptions,
    ): BatchCancelResponse =
        // post /api/v1/beta/batch-processing/{job_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun getStatus(
        params: BatchGetStatusParams,
        requestOptions: RequestOptions,
    ): BatchGetStatusResponse =
        // get /api/v1/beta/batch-processing/{job_id}
        withRawResponse().getStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val jobItems: JobItemService.WithRawResponse by lazy {
            JobItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchService.WithRawResponse =
            BatchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun jobItems(): JobItemService.WithRawResponse = jobItems

        private val createHandler: Handler<BatchCreateResponse> =
            jsonHandler<BatchCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "batch-processing")
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

        private val listHandler: Handler<BatchListPageResponse> =
            jsonHandler<BatchListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BatchListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "batch-processing")
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
                        BatchListPage.builder()
                            .service(BatchServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<BatchCancelResponse> =
            jsonHandler<BatchCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: BatchCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchCancelResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "beta",
                        "batch-processing",
                        params._pathParam(0),
                        "cancel",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getStatusHandler: Handler<BatchGetStatusResponse> =
            jsonHandler<BatchGetStatusResponse>(clientOptions.jsonMapper)

        override fun getStatus(
            params: BatchGetStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchGetStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "batch-processing", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
