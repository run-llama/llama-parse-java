// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta

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
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryCreateParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryCreateResponse
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryDeleteParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryGetParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryGetResponse
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryListPage
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryListPageResponse
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryListParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryUpdateParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryUpdateResponse
import ai.llamaindex.llamacloud.services.blocking.beta.directories.FileService
import ai.llamaindex.llamacloud.services.blocking.beta.directories.FileServiceImpl
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
