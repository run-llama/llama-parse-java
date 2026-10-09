// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.alpha

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
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCancelParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCancelResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCreateParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyCreateResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetDetailsParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetDetailsResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetParams
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyGetResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyListPage
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyListPageResponse
import ai.llamaindex.llamacloud.models.alpha.verify.VerifyListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VerifyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VerifyService {

    private val withRawResponse: VerifyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VerifyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifyService =
        VerifyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: VerifyCreateParams,
        requestOptions: RequestOptions,
    ): VerifyCreateResponse =
        // post /api/alpha/verify
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: VerifyListParams, requestOptions: RequestOptions): VerifyListPage =
        // get /api/alpha/verify
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(
        params: VerifyCancelParams,
        requestOptions: RequestOptions,
    ): VerifyCancelResponse =
        // post /api/alpha/verify/{job_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun get(params: VerifyGetParams, requestOptions: RequestOptions): VerifyGetResponse =
        // get /api/alpha/verify/{job_id}
        withRawResponse().get(params, requestOptions).parse()

    override fun getDetails(
        params: VerifyGetDetailsParams,
        requestOptions: RequestOptions,
    ): VerifyGetDetailsResponse =
        // get /api/alpha/verify/{job_id}/details
        withRawResponse().getDetails(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerifyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerifyService.WithRawResponse =
            VerifyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VerifyCreateResponse> =
            jsonHandler<VerifyCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VerifyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "alpha", "verify")
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

        private val listHandler: Handler<VerifyListPageResponse> =
            jsonHandler<VerifyListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VerifyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "alpha", "verify")
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
                        VerifyListPage.builder()
                            .service(VerifyServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<VerifyCancelResponse> =
            jsonHandler<VerifyCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: VerifyCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyCancelResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "alpha", "verify", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val getHandler: Handler<VerifyGetResponse> =
            jsonHandler<VerifyGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: VerifyGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "alpha", "verify", params._pathParam(0))
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

        private val getDetailsHandler: Handler<VerifyGetDetailsResponse> =
            jsonHandler<VerifyGetDetailsResponse>(clientOptions.jsonMapper)

        override fun getDetails(
            params: VerifyGetDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyGetDetailsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "alpha", "verify", params._pathParam(0), "details")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDetailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
