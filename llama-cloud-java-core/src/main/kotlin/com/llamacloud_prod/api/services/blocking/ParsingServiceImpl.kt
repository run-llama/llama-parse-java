// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

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
import com.llamacloud_prod.api.models.parsing.ParsingCreateParams
import com.llamacloud_prod.api.models.parsing.ParsingCreateResponse
import com.llamacloud_prod.api.models.parsing.ParsingGetParams
import com.llamacloud_prod.api.models.parsing.ParsingGetResponse
import com.llamacloud_prod.api.models.parsing.ParsingListPage
import com.llamacloud_prod.api.models.parsing.ParsingListPageResponse
import com.llamacloud_prod.api.models.parsing.ParsingListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ParsingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ParsingService {

    private val withRawResponse: ParsingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ParsingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParsingService =
        ParsingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ParsingCreateParams,
        requestOptions: RequestOptions,
    ): ParsingCreateResponse =
        // post /api/v2/parse
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: ParsingListParams, requestOptions: RequestOptions): ParsingListPage =
        // get /api/v2/parse
        withRawResponse().list(params, requestOptions).parse()

    override fun get(params: ParsingGetParams, requestOptions: RequestOptions): ParsingGetResponse =
        // get /api/v2/parse/{job_id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ParsingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ParsingService.WithRawResponse =
            ParsingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ParsingCreateResponse> =
            jsonHandler<ParsingCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ParsingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParsingCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "parse")
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

        private val listHandler: Handler<ParsingListPageResponse> =
            jsonHandler<ParsingListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ParsingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParsingListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "parse")
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
                        ParsingListPage.builder()
                            .service(ParsingServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<ParsingGetResponse> =
            jsonHandler<ParsingGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ParsingGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParsingGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "parse", params._pathParam(0))
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
