// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.handlers.emptyHandler
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
import com.llamacloud_prod.api.models.datasinks.DataSink
import com.llamacloud_prod.api.models.datasinks.DataSinkCreateParams
import com.llamacloud_prod.api.models.datasinks.DataSinkDeleteParams
import com.llamacloud_prod.api.models.datasinks.DataSinkGetParams
import com.llamacloud_prod.api.models.datasinks.DataSinkListParams
import com.llamacloud_prod.api.models.datasinks.DataSinkUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DataSinkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DataSinkService {

    private val withRawResponse: DataSinkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DataSinkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataSinkService =
        DataSinkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: DataSinkCreateParams, requestOptions: RequestOptions): DataSink =
        // post /api/v1/data-sinks
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: DataSinkUpdateParams, requestOptions: RequestOptions): DataSink =
        // put /api/v1/data-sinks/{data_sink_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: DataSinkListParams, requestOptions: RequestOptions): List<DataSink> =
        // get /api/v1/data-sinks
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DataSinkDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/data-sinks/{data_sink_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: DataSinkGetParams, requestOptions: RequestOptions): DataSink =
        // get /api/v1/data-sinks/{data_sink_id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataSinkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataSinkService.WithRawResponse =
            DataSinkServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DataSink> =
            jsonHandler<DataSink>(clientOptions.jsonMapper)

        override fun create(
            params: DataSinkCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataSink> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sinks")
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

        private val updateHandler: Handler<DataSink> =
            jsonHandler<DataSink>(clientOptions.jsonMapper)

        override fun update(
            params: DataSinkUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataSink> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dataSinkId", params.dataSinkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sinks", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<DataSink>> =
            jsonHandler<List<DataSink>>(clientOptions.jsonMapper)

        override fun list(
            params: DataSinkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<DataSink>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sinks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: DataSinkDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dataSinkId", params.dataSinkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sinks", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<DataSink> = jsonHandler<DataSink>(clientOptions.jsonMapper)

        override fun get(
            params: DataSinkGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataSink> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dataSinkId", params.dataSinkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sinks", params._pathParam(0))
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
