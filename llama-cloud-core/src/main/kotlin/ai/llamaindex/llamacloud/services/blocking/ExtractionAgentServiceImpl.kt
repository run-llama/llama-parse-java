// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

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
import ai.llamaindex.llamacloud.core.prepare
import ai.llamaindex.llamacloud.models.extractionagents.ExtractionAgentListPage
import ai.llamaindex.llamacloud.models.extractionagents.ExtractionAgentListPageResponse
import ai.llamaindex.llamacloud.models.extractionagents.ExtractionAgentListParams
import java.util.function.Consumer

class ExtractionAgentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExtractionAgentService {

    private val withRawResponse: ExtractionAgentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExtractionAgentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtractionAgentService =
        ExtractionAgentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ExtractionAgentListParams,
        requestOptions: RequestOptions,
    ): ExtractionAgentListPage =
        // get /api/v1/beta/extraction-agents
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExtractionAgentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExtractionAgentService.WithRawResponse =
            ExtractionAgentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ExtractionAgentListPageResponse> =
            jsonHandler<ExtractionAgentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ExtractionAgentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtractionAgentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "extraction-agents")
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
                        ExtractionAgentListPage.builder()
                            .service(ExtractionAgentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
