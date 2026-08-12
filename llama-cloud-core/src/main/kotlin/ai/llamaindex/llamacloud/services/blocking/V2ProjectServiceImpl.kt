// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

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
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectGetParams
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectGetResponse
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectListPage
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectListPageResponse
import ai.llamaindex.llamacloud.models.v2projects.V2ProjectListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V2ProjectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    V2ProjectService {

    private val withRawResponse: V2ProjectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V2ProjectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ProjectService =
        V2ProjectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: V2ProjectListParams,
        requestOptions: RequestOptions,
    ): V2ProjectListPage =
        // get /api/v2/projects
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: V2ProjectGetParams,
        requestOptions: RequestOptions,
    ): V2ProjectGetResponse =
        // get /api/v2/projects/{project_id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2ProjectService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2ProjectService.WithRawResponse =
            V2ProjectServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<V2ProjectListPageResponse> =
            jsonHandler<V2ProjectListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: V2ProjectListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2ProjectListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "projects")
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
                        V2ProjectListPage.builder()
                            .service(V2ProjectServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<V2ProjectGetResponse> =
            jsonHandler<V2ProjectGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: V2ProjectGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2ProjectGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("projectId", params.projectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "projects", params._pathParam(0))
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
    }
}
