// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.handlers.errorBodyHandler
import ai.llamaindex.llamacloud.core.handlers.errorHandler
import ai.llamaindex.llamacloud.core.handlers.jsonHandler
import ai.llamaindex.llamacloud.core.http.HttpMethod
import ai.llamaindex.llamacloud.core.http.HttpRequest
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponse.Handler
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.core.http.parseable
import ai.llamaindex.llamacloud.core.prepareAsync
import ai.llamaindex.llamacloud.models.extractionagents.ExtractionAgentListPageAsync
import ai.llamaindex.llamacloud.models.extractionagents.ExtractionAgentListPageResponse
import ai.llamaindex.llamacloud.models.extractionagents.ExtractionAgentListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ExtractionAgentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExtractionAgentServiceAsync {

    private val withRawResponse: ExtractionAgentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExtractionAgentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExtractionAgentServiceAsync =
        ExtractionAgentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ExtractionAgentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExtractionAgentListPageAsync> =
        // get /api/v1/beta/extraction-agents
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExtractionAgentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExtractionAgentServiceAsync.WithRawResponse =
            ExtractionAgentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ExtractionAgentListPageResponse> =
            jsonHandler<ExtractionAgentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ExtractionAgentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExtractionAgentListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "extraction-agents")
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
                                ExtractionAgentListPageAsync.builder()
                                    .service(ExtractionAgentServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
