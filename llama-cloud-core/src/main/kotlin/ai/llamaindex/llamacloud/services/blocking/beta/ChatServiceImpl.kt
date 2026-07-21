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
import ai.llamaindex.llamacloud.models.beta.chat.ChatCreateParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatCreateResponse
import ai.llamaindex.llamacloud.models.beta.chat.ChatDeleteParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatGetSummaryParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatGetSummaryResponse
import ai.llamaindex.llamacloud.models.beta.chat.ChatListPage
import ai.llamaindex.llamacloud.models.beta.chat.ChatListPageResponse
import ai.llamaindex.llamacloud.models.beta.chat.ChatListParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatRetrieveParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatRetrieveResponse
import ai.llamaindex.llamacloud.models.beta.chat.ChatStreamParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatStreamResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChatServiceImpl internal constructor(private val clientOptions: ClientOptions) : ChatService {

    private val withRawResponse: ChatService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChatService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService =
        ChatServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ChatCreateParams,
        requestOptions: RequestOptions,
    ): ChatCreateResponse =
        // post /api/v1/chat
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ChatRetrieveParams,
        requestOptions: RequestOptions,
    ): ChatRetrieveResponse =
        // get /api/v1/chat/{session_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: ChatListParams, requestOptions: RequestOptions): ChatListPage =
        // get /api/v1/chat
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ChatDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/chat/{session_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun getSummary(
        params: ChatGetSummaryParams,
        requestOptions: RequestOptions,
    ): ChatGetSummaryResponse =
        // get /api/v1/chat/{session_id}/summary
        withRawResponse().getSummary(params, requestOptions).parse()

    override fun stream(
        params: ChatStreamParams,
        requestOptions: RequestOptions,
    ): ChatStreamResponse =
        // post /api/v1/chat/{session_id}/messages/stream
        withRawResponse().stream(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChatService.WithRawResponse =
            ChatServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ChatCreateResponse> =
            jsonHandler<ChatCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ChatCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "chat")
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

        private val retrieveHandler: Handler<ChatRetrieveResponse> =
            jsonHandler<ChatRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ChatRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "chat", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ChatListPageResponse> =
            jsonHandler<ChatListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ChatListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "chat")
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
                        ChatListPage.builder()
                            .service(ChatServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ChatDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "chat", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getSummaryHandler: Handler<ChatGetSummaryResponse> =
            jsonHandler<ChatGetSummaryResponse>(clientOptions.jsonMapper)

        override fun getSummary(
            params: ChatGetSummaryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatGetSummaryResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "chat", params._pathParam(0), "summary")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSummaryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val streamHandler: Handler<ChatStreamResponse> =
            jsonHandler<ChatStreamResponse>(clientOptions.jsonMapper)

        override fun stream(
            params: ChatStreamParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatStreamResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sessionId", params.sessionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "chat",
                        params._pathParam(0),
                        "messages",
                        "stream",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { streamHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
