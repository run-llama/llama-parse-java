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
import ai.llamaindex.llamacloud.core.http.json
import ai.llamaindex.llamacloud.core.http.parseable
import ai.llamaindex.llamacloud.core.prepare
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateParams
import ai.llamaindex.llamacloud.models.classify.ClassifyCreateResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyGetParams
import ai.llamaindex.llamacloud.models.classify.ClassifyGetResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyListPage
import ai.llamaindex.llamacloud.models.classify.ClassifyListPageResponse
import ai.llamaindex.llamacloud.models.classify.ClassifyListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ClassifyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ClassifyService {

    private val withRawResponse: ClassifyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ClassifyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClassifyService =
        ClassifyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ClassifyCreateParams,
        requestOptions: RequestOptions,
    ): ClassifyCreateResponse =
        // post /api/v2/classify
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: ClassifyListParams,
        requestOptions: RequestOptions,
    ): ClassifyListPage =
        // get /api/v2/classify
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: ClassifyGetParams,
        requestOptions: RequestOptions,
    ): ClassifyGetResponse =
        // get /api/v2/classify/{job_id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClassifyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClassifyService.WithRawResponse =
            ClassifyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ClassifyCreateResponse> =
            jsonHandler<ClassifyCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ClassifyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassifyCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "classify")
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

        private val listHandler: Handler<ClassifyListPageResponse> =
            jsonHandler<ClassifyListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ClassifyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassifyListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "classify")
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
                        ClassifyListPage.builder()
                            .service(ClassifyServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<ClassifyGetResponse> =
            jsonHandler<ClassifyGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ClassifyGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassifyGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "classify", params._pathParam(0))
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
