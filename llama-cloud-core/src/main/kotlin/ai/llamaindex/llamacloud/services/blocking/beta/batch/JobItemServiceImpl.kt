// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta.batch

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
import ai.llamaindex.llamacloud.core.http.parseable
import ai.llamaindex.llamacloud.core.prepare
import ai.llamaindex.llamacloud.models.beta.batch.jobitems.JobItemGetProcessingResultsParams
import ai.llamaindex.llamacloud.models.beta.batch.jobitems.JobItemGetProcessingResultsResponse
import ai.llamaindex.llamacloud.models.beta.batch.jobitems.JobItemListPage
import ai.llamaindex.llamacloud.models.beta.batch.jobitems.JobItemListPageResponse
import ai.llamaindex.llamacloud.models.beta.batch.jobitems.JobItemListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JobItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    JobItemService {

    private val withRawResponse: JobItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobItemService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobItemService =
        JobItemServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: JobItemListParams, requestOptions: RequestOptions): JobItemListPage =
        // get /api/v1/beta/batch-processing/{job_id}/items
        withRawResponse().list(params, requestOptions).parse()

    override fun getProcessingResults(
        params: JobItemGetProcessingResultsParams,
        requestOptions: RequestOptions,
    ): JobItemGetProcessingResultsResponse =
        // get /api/v1/beta/batch-processing/items/{item_id}/processing-results
        withRawResponse().getProcessingResults(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobItemService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JobItemService.WithRawResponse =
            JobItemServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<JobItemListPageResponse> =
            jsonHandler<JobItemListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: JobItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobItemListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "beta",
                        "batch-processing",
                        params._pathParam(0),
                        "items",
                    )
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
                        JobItemListPage.builder()
                            .service(JobItemServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getProcessingResultsHandler: Handler<JobItemGetProcessingResultsResponse> =
            jsonHandler<JobItemGetProcessingResultsResponse>(clientOptions.jsonMapper)

        override fun getProcessingResults(
            params: JobItemGetProcessingResultsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobItemGetProcessingResultsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("itemId", params.itemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "beta",
                        "batch-processing",
                        "items",
                        params._pathParam(0),
                        "processing-results",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getProcessingResultsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
