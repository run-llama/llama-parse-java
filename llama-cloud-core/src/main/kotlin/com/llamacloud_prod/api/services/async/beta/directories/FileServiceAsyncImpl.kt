// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta.directories

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
import com.llamacloud_prod.api.core.http.multipartFormData
import com.llamacloud_prod.api.core.http.parseable
import com.llamacloud_prod.api.core.prepareAsync
import com.llamacloud_prod.api.models.beta.directories.files.FileAddParams
import com.llamacloud_prod.api.models.beta.directories.files.FileAddResponse
import com.llamacloud_prod.api.models.beta.directories.files.FileDeleteParams
import com.llamacloud_prod.api.models.beta.directories.files.FileGetParams
import com.llamacloud_prod.api.models.beta.directories.files.FileGetResponse
import com.llamacloud_prod.api.models.beta.directories.files.FileListPageAsync
import com.llamacloud_prod.api.models.beta.directories.files.FileListPageResponse
import com.llamacloud_prod.api.models.beta.directories.files.FileListParams
import com.llamacloud_prod.api.models.beta.directories.files.FileUpdateParams
import com.llamacloud_prod.api.models.beta.directories.files.FileUpdateResponse
import com.llamacloud_prod.api.models.beta.directories.files.FileUploadParams
import com.llamacloud_prod.api.models.beta.directories.files.FileUploadResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FileServiceAsync {

    private val withRawResponse: FileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync =
        FileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: FileUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileUpdateResponse> =
        // patch /api/v1/beta/directories/{directory_id}/files/{directory_file_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FileListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileListPageAsync> =
        // get /api/v1/beta/directories/{directory_id}/files
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/v1/beta/directories/{directory_id}/files/{directory_file_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun add(
        params: FileAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileAddResponse> =
        // post /api/v1/beta/directories/{directory_id}/files
        withRawResponse().add(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: FileGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileGetResponse> =
        // get /api/v1/beta/directories/{directory_id}/files/{directory_file_id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun upload(
        params: FileUploadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileUploadResponse> =
        // post /api/v1/beta/directories/{directory_id}/files/upload
        withRawResponse().upload(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileServiceAsync.WithRawResponse =
            FileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<FileUpdateResponse> =
            jsonHandler<FileUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FileUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("directoryFileId", params.directoryFileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "beta",
                        "directories",
                        params._pathParam(0),
                        "files",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<FileListPageResponse> =
            jsonHandler<FileListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("directoryId", params.directoryId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "beta",
                        "directories",
                        params._pathParam(0),
                        "files",
                    )
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
                                FileListPageAsync.builder()
                                    .service(FileServiceAsyncImpl(clientOptions))
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
            params: FileDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("directoryFileId", params.directoryFileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "beta",
                        "directories",
                        params._pathParam(0),
                        "files",
                        params._pathParam(1),
                    )
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

        private val addHandler: Handler<FileAddResponse> =
            jsonHandler<FileAddResponse>(clientOptions.jsonMapper)

        override fun add(
            params: FileAddParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileAddResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("directoryId", params.directoryId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "beta",
                        "directories",
                        params._pathParam(0),
                        "files",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<FileGetResponse> =
            jsonHandler<FileGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: FileGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("directoryFileId", params.directoryFileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "beta",
                        "directories",
                        params._pathParam(0),
                        "files",
                        params._pathParam(1),
                    )
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

        private val uploadHandler: Handler<FileUploadResponse> =
            jsonHandler<FileUploadResponse>(clientOptions.jsonMapper)

        override fun upload(
            params: FileUploadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileUploadResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("directoryId", params.directoryId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "beta",
                        "directories",
                        params._pathParam(0),
                        "files",
                        "upload",
                    )
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { uploadHandler.handle(it) }
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
