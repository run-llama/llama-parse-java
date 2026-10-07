// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.core.handlers.errorBodyHandler
import ai.llamaindex.llamacloud.core.handlers.errorHandler
import ai.llamaindex.llamacloud.core.handlers.jsonHandler
import ai.llamaindex.llamacloud.core.http.HttpMethod
import ai.llamaindex.llamacloud.core.http.HttpRequest
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponse.Handler
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.core.http.parseable
import ai.llamaindex.llamacloud.core.prepare
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentGetParams
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentListPage
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentListPageResponse
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentListParams
import ai.llamaindex.llamacloud.models.files.PresignedUrl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AttachmentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AttachmentService {

    private val withRawResponse: AttachmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AttachmentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AttachmentService =
        AttachmentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AttachmentListParams,
        requestOptions: RequestOptions,
    ): AttachmentListPage =
        // get /api/v1/beta/attachments
        withRawResponse().list(params, requestOptions).parse()

    override fun get(params: AttachmentGetParams, requestOptions: RequestOptions): PresignedUrl =
        // get /api/v1/beta/attachments/{attachment_name}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AttachmentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AttachmentService.WithRawResponse =
            AttachmentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<AttachmentListPageResponse> =
            jsonHandler<AttachmentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AttachmentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "attachments")
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
                        AttachmentListPage.builder()
                            .service(AttachmentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<PresignedUrl> =
            jsonHandler<PresignedUrl>(clientOptions.jsonMapper)

        override fun get(
            params: AttachmentGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PresignedUrl> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("attachmentName", params.attachmentName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "beta", "attachments", params._pathParam(0))
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
