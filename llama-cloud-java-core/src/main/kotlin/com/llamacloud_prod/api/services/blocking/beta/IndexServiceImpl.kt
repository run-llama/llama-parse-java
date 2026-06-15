// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta

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
import com.llamacloud_prod.api.models.beta.indexes.IndexCreateParams
import com.llamacloud_prod.api.models.beta.indexes.IndexCreateResponse
import com.llamacloud_prod.api.models.beta.indexes.IndexDeleteParams
import com.llamacloud_prod.api.models.beta.indexes.IndexGetParams
import com.llamacloud_prod.api.models.beta.indexes.IndexGetResponse
import com.llamacloud_prod.api.models.beta.indexes.IndexListPage
import com.llamacloud_prod.api.models.beta.indexes.IndexListPageResponse
import com.llamacloud_prod.api.models.beta.indexes.IndexListParams
import com.llamacloud_prod.api.models.beta.indexes.IndexSyncParams
import com.llamacloud_prod.api.models.beta.indexes.IndexSyncResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class IndexServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IndexService {

    private val withRawResponse: IndexService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IndexService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndexService =
        IndexServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: IndexCreateParams,
        requestOptions: RequestOptions,
    ): IndexCreateResponse =
        // post /api/v1/indexes
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: IndexListParams, requestOptions: RequestOptions): IndexListPage =
        // get /api/v1/indexes
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: IndexDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/indexes/{index_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: IndexGetParams, requestOptions: RequestOptions): IndexGetResponse =
        // get /api/v1/indexes/{index_id}
        withRawResponse().get(params, requestOptions).parse()

    override fun sync(params: IndexSyncParams, requestOptions: RequestOptions): IndexSyncResponse =
        // post /api/v1/indexes/{index_id}/sync
        withRawResponse().sync(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndexService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndexService.WithRawResponse =
            IndexServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<IndexCreateResponse> =
            jsonHandler<IndexCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: IndexCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "indexes")
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

        private val listHandler: Handler<IndexListPageResponse> =
            jsonHandler<IndexListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: IndexListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "indexes")
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
                        IndexListPage.builder()
                            .service(IndexServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: IndexDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("indexId", params.indexId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "indexes", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<IndexGetResponse> =
            jsonHandler<IndexGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: IndexGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("indexId", params.indexId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "indexes", params._pathParam(0))
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

        private val syncHandler: Handler<IndexSyncResponse> =
            jsonHandler<IndexSyncResponse>(clientOptions.jsonMapper)

        override fun sync(
            params: IndexSyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexSyncResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("indexId", params.indexId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "indexes", params._pathParam(0), "sync")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { syncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
