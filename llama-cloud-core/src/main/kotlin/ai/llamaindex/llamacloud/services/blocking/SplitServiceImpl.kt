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
import ai.llamaindex.llamacloud.models.split.SplitCancelParams
import ai.llamaindex.llamacloud.models.split.SplitCancelResponse
import ai.llamaindex.llamacloud.models.split.SplitCreateParams
import ai.llamaindex.llamacloud.models.split.SplitCreateResponse
import ai.llamaindex.llamacloud.models.split.SplitDeleteParams
import ai.llamaindex.llamacloud.models.split.SplitDeleteResponse
import ai.llamaindex.llamacloud.models.split.SplitGetParams
import ai.llamaindex.llamacloud.models.split.SplitGetResponse
import ai.llamaindex.llamacloud.models.split.SplitListPage
import ai.llamaindex.llamacloud.models.split.SplitListPageResponse
import ai.llamaindex.llamacloud.models.split.SplitListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SplitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SplitService {

    private val withRawResponse: SplitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SplitService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitService =
        SplitServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SplitCreateParams,
        requestOptions: RequestOptions,
    ): SplitCreateResponse =
        // post /api/v1/split/jobs
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: SplitListParams, requestOptions: RequestOptions): SplitListPage =
        // get /api/v1/split/jobs
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: SplitDeleteParams,
        requestOptions: RequestOptions,
    ): SplitDeleteResponse =
        // delete /api/v1/split/jobs/{split_job_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun cancel(
        params: SplitCancelParams,
        requestOptions: RequestOptions,
    ): SplitCancelResponse =
        // post /api/v1/split/jobs/{split_job_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun get(params: SplitGetParams, requestOptions: RequestOptions): SplitGetResponse =
        // get /api/v1/split/jobs/{split_job_id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SplitService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SplitService.WithRawResponse =
            SplitServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SplitCreateResponse> =
            jsonHandler<SplitCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SplitCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SplitCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "split", "jobs")
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

        private val listHandler: Handler<SplitListPageResponse> =
            jsonHandler<SplitListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SplitListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SplitListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "split", "jobs")
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
                        SplitListPage.builder()
                            .service(SplitServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<SplitDeleteResponse> =
            jsonHandler<SplitDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SplitDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SplitDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("splitJobId", params.splitJobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "split", "jobs", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelHandler: Handler<SplitCancelResponse> =
            jsonHandler<SplitCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: SplitCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SplitCancelResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("splitJobId", params.splitJobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "split", "jobs", params._pathParam(0), "cancel")
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

        private val getHandler: Handler<SplitGetResponse> =
            jsonHandler<SplitGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SplitGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SplitGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("splitJobId", params.splitJobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "split", "jobs", params._pathParam(0))
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
