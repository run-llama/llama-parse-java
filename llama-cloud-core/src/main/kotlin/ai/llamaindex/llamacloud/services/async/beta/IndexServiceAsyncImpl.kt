// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.beta

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
import ai.llamaindex.llamacloud.core.prepareAsync
import ai.llamaindex.llamacloud.models.beta.indexes.IndexCreateParams
import ai.llamaindex.llamacloud.models.beta.indexes.IndexCreateResponse
import ai.llamaindex.llamacloud.models.beta.indexes.IndexDeleteParams
import ai.llamaindex.llamacloud.models.beta.indexes.IndexGetParams
import ai.llamaindex.llamacloud.models.beta.indexes.IndexGetResponse
import ai.llamaindex.llamacloud.models.beta.indexes.IndexListPageAsync
import ai.llamaindex.llamacloud.models.beta.indexes.IndexListPageResponse
import ai.llamaindex.llamacloud.models.beta.indexes.IndexListParams
import ai.llamaindex.llamacloud.models.beta.indexes.IndexSyncParams
import ai.llamaindex.llamacloud.models.beta.indexes.IndexSyncResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class IndexServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IndexServiceAsync {

    private val withRawResponse: IndexServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IndexServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IndexServiceAsync =
        IndexServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: IndexCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndexCreateResponse> =
        // post /api/v1/indexes
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: IndexListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndexListPageAsync> =
        // get /api/v1/indexes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: IndexDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/v1/indexes/{index_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: IndexGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndexGetResponse> =
        // get /api/v1/indexes/{index_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun sync(
        params: IndexSyncParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndexSyncResponse> =
        // post /api/v1/indexes/{index_id}/sync
        withRawResponse().sync(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IndexServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IndexServiceAsync.WithRawResponse =
            IndexServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<IndexCreateResponse> =
            jsonHandler<IndexCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: IndexCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "indexes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<IndexListPageResponse> =
            jsonHandler<IndexListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: IndexListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "indexes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                IndexListPageAsync.builder()
                                    .service(IndexServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: IndexDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<IndexGetResponse> =
            jsonHandler<IndexGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: IndexGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("indexId", params.indexId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "indexes", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val syncHandler: Handler<IndexSyncResponse> =
            jsonHandler<IndexSyncResponse>(clientOptions.jsonMapper)

        override fun sync(
            params: IndexSyncParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexSyncResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
