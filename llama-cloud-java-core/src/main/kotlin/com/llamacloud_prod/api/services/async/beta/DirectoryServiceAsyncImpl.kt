// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta

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
import com.llamacloud_prod.api.core.prepareAsync
import com.llamacloud_prod.api.models.beta.directories.DirectoryCreateParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryCreateResponse
import com.llamacloud_prod.api.models.beta.directories.DirectoryDeleteParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryGetParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryGetResponse
import com.llamacloud_prod.api.models.beta.directories.DirectoryListPageAsync
import com.llamacloud_prod.api.models.beta.directories.DirectoryListPageResponse
import com.llamacloud_prod.api.models.beta.directories.DirectoryListParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryUpdateParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryUpdateResponse
import com.llamacloud_prod.api.services.async.beta.directories.FileServiceAsync
import com.llamacloud_prod.api.services.async.beta.directories.FileServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DirectoryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DirectoryServiceAsync {

    private val withRawResponse: DirectoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DirectoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectoryServiceAsync =
        DirectoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun files(): FileServiceAsync = files

    override fun create(
        params: DirectoryCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirectoryCreateResponse> =
        // post /api/v1/beta/directories
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: DirectoryUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirectoryUpdateResponse> =
        // patch /api/v1/beta/directories/{directory_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DirectoryListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirectoryListPageAsync> =
        // get /api/v1/beta/directories
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DirectoryDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/v1/beta/directories/{directory_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: DirectoryGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DirectoryGetResponse> =
        // get /api/v1/beta/directories/{directory_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DirectoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DirectoryServiceAsync.WithRawResponse =
            DirectoryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun files(): FileServiceAsync.WithRawResponse = files

        private val createHandler: Handler<DirectoryCreateResponse> =
            jsonHandler<DirectoryCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DirectoryCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirectoryCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "directories")
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

        private val updateHandler: Handler<DirectoryUpdateResponse> =
            jsonHandler<DirectoryUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DirectoryUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirectoryUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("directoryId", params.directoryId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "directories", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<DirectoryListPageResponse> =
            jsonHandler<DirectoryListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DirectoryListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirectoryListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "directories")
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
                                DirectoryListPageAsync.builder()
                                    .service(DirectoryServiceAsyncImpl(clientOptions))
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
            params: DirectoryDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("directoryId", params.directoryId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "directories", params._pathParam(0))
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

        private val getHandler: Handler<DirectoryGetResponse> =
            jsonHandler<DirectoryGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: DirectoryGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DirectoryGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("directoryId", params.directoryId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "directories", params._pathParam(0))
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
    }
}
