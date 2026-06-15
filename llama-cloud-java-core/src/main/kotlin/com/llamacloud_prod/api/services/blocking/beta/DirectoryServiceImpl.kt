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
import com.llamacloud_prod.api.models.beta.directories.DirectoryCreateParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryCreateResponse
import com.llamacloud_prod.api.models.beta.directories.DirectoryDeleteParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryGetParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryGetResponse
import com.llamacloud_prod.api.models.beta.directories.DirectoryListPage
import com.llamacloud_prod.api.models.beta.directories.DirectoryListPageResponse
import com.llamacloud_prod.api.models.beta.directories.DirectoryListParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryUpdateParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryUpdateResponse
import com.llamacloud_prod.api.services.blocking.beta.directories.FileService
import com.llamacloud_prod.api.services.blocking.beta.directories.FileServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DirectoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DirectoryService {

    private val withRawResponse: DirectoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileService by lazy { FileServiceImpl(clientOptions) }

    override fun withRawResponse(): DirectoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectoryService =
        DirectoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun files(): FileService = files

    override fun create(
        params: DirectoryCreateParams,
        requestOptions: RequestOptions,
    ): DirectoryCreateResponse =
        // post /api/v1/beta/directories
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: DirectoryUpdateParams,
        requestOptions: RequestOptions,
    ): DirectoryUpdateResponse =
        // patch /api/v1/beta/directories/{directory_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: DirectoryListParams,
        requestOptions: RequestOptions,
    ): DirectoryListPage =
        // get /api/v1/beta/directories
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DirectoryDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/beta/directories/{directory_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: DirectoryGetParams,
        requestOptions: RequestOptions,
    ): DirectoryGetResponse =
        // get /api/v1/beta/directories/{directory_id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DirectoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DirectoryService.WithRawResponse =
            DirectoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun files(): FileService.WithRawResponse = files

        private val createHandler: Handler<DirectoryCreateResponse> =
            jsonHandler<DirectoryCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DirectoryCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirectoryCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "directories")
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

        private val updateHandler: Handler<DirectoryUpdateResponse> =
            jsonHandler<DirectoryUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DirectoryUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirectoryUpdateResponse> {
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

        private val listHandler: Handler<DirectoryListPageResponse> =
            jsonHandler<DirectoryListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DirectoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirectoryListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "directories")
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
                        DirectoryListPage.builder()
                            .service(DirectoryServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: DirectoryDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<DirectoryGetResponse> =
            jsonHandler<DirectoryGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: DirectoryGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DirectoryGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("directoryId", params.directoryId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "directories", params._pathParam(0))
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
