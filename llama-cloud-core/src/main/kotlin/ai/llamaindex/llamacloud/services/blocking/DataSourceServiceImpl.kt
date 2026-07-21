// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.handlers.emptyHandler
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
import ai.llamaindex.llamacloud.models.datasources.DataSource
import ai.llamaindex.llamacloud.models.datasources.DataSourceCreateParams
import ai.llamaindex.llamacloud.models.datasources.DataSourceDeleteParams
import ai.llamaindex.llamacloud.models.datasources.DataSourceGetParams
import ai.llamaindex.llamacloud.models.datasources.DataSourceListParams
import ai.llamaindex.llamacloud.models.datasources.DataSourceUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DataSourceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DataSourceService {

    private val withRawResponse: DataSourceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DataSourceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataSourceService =
        DataSourceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DataSourceCreateParams,
        requestOptions: RequestOptions,
    ): DataSource =
        // post /api/v1/data-sources
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: DataSourceUpdateParams,
        requestOptions: RequestOptions,
    ): DataSource =
        // put /api/v1/data-sources/{data_source_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: DataSourceListParams,
        requestOptions: RequestOptions,
    ): List<DataSource> =
        // get /api/v1/data-sources
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DataSourceDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/data-sources/{data_source_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: DataSourceGetParams, requestOptions: RequestOptions): DataSource =
        // get /api/v1/data-sources/{data_source_id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataSourceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataSourceService.WithRawResponse =
            DataSourceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DataSource> =
            jsonHandler<DataSource>(clientOptions.jsonMapper)

        override fun create(
            params: DataSourceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataSource> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sources")
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

        private val updateHandler: Handler<DataSource> =
            jsonHandler<DataSource>(clientOptions.jsonMapper)

        override fun update(
            params: DataSourceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataSource> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dataSourceId", params.dataSourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sources", params._pathParam(0))
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

        private val listHandler: Handler<List<DataSource>> =
            jsonHandler<List<DataSource>>(clientOptions.jsonMapper)

        override fun list(
            params: DataSourceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<DataSource>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sources")
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
            params: DataSourceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dataSourceId", params.dataSourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sources", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<DataSource> =
            jsonHandler<DataSource>(clientOptions.jsonMapper)

        override fun get(
            params: DataSourceGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataSource> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dataSourceId", params.dataSourceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "data-sources", params._pathParam(0))
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
