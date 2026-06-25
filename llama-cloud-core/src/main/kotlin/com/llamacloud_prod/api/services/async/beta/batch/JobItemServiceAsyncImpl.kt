// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta.batch

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
import com.llamacloud_prod.api.core.http.parseable
import com.llamacloud_prod.api.core.prepareAsync
import com.llamacloud_prod.api.models.beta.batch.jobitems.JobItemGetProcessingResultsParams
import com.llamacloud_prod.api.models.beta.batch.jobitems.JobItemGetProcessingResultsResponse
import com.llamacloud_prod.api.models.beta.batch.jobitems.JobItemListPageAsync
import com.llamacloud_prod.api.models.beta.batch.jobitems.JobItemListPageResponse
import com.llamacloud_prod.api.models.beta.batch.jobitems.JobItemListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JobItemServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JobItemServiceAsync {

    private val withRawResponse: JobItemServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobItemServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobItemServiceAsync =
        JobItemServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: JobItemListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobItemListPageAsync> =
        // get /api/v1/beta/batch-processing/{job_id}/items
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun getProcessingResults(
        params: JobItemGetProcessingResultsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobItemGetProcessingResultsResponse> =
        // get /api/v1/beta/batch-processing/items/{item_id}/processing-results
        withRawResponse().getProcessingResults(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobItemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JobItemServiceAsync.WithRawResponse =
            JobItemServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<JobItemListPageResponse> =
            jsonHandler<JobItemListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: JobItemListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobItemListPageAsync>> {
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
                                JobItemListPageAsync.builder()
                                    .service(JobItemServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val getProcessingResultsHandler: Handler<JobItemGetProcessingResultsResponse> =
            jsonHandler<JobItemGetProcessingResultsResponse>(clientOptions.jsonMapper)

        override fun getProcessingResults(
            params: JobItemGetProcessingResultsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobItemGetProcessingResultsResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
