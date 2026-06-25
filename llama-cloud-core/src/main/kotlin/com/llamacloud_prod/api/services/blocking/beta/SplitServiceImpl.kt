// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta

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
import com.llamacloud_prod.api.core.http.json
import com.llamacloud_prod.api.core.http.parseable
import com.llamacloud_prod.api.core.prepare
import com.llamacloud_prod.api.models.beta.split.SplitCreateParams
import com.llamacloud_prod.api.models.beta.split.SplitCreateResponse
import com.llamacloud_prod.api.models.beta.split.SplitGetParams
import com.llamacloud_prod.api.models.beta.split.SplitGetResponse
import com.llamacloud_prod.api.models.beta.split.SplitListPage
import com.llamacloud_prod.api.models.beta.split.SplitListPageResponse
import com.llamacloud_prod.api.models.beta.split.SplitListParams
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
        // post /api/v1/beta/split/jobs
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: SplitListParams, requestOptions: RequestOptions): SplitListPage =
        // get /api/v1/beta/split/jobs
        withRawResponse().list(params, requestOptions).parse()

    override fun get(params: SplitGetParams, requestOptions: RequestOptions): SplitGetResponse =
        // get /api/v1/beta/split/jobs/{split_job_id}
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
                    .addPathSegments("api", "v1", "beta", "split", "jobs")
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
                    .addPathSegments("api", "v1", "beta", "split", "jobs")
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
                    .addPathSegments("api", "v1", "beta", "split", "jobs", params._pathParam(0))
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
