// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.beta

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.beta.chat.ChatCreateParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatCreateResponse
import ai.llamaindex.llamacloud.models.beta.chat.ChatDeleteParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatGetSummaryParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatGetSummaryResponse
import ai.llamaindex.llamacloud.models.beta.chat.ChatListPageAsync
import ai.llamaindex.llamacloud.models.beta.chat.ChatListParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatRetrieveParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatRetrieveResponse
import ai.llamaindex.llamacloud.models.beta.chat.ChatStreamParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatStreamResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChatServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync

    /** Create a chat session, optionally bound to indexes (locked after the first message). */
    fun create(): CompletableFuture<ChatCreateResponse> = create(ChatCreateParams.none())

    /** @see create */
    fun create(
        params: ChatCreateParams = ChatCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatCreateResponse>

    /** @see create */
    fun create(
        params: ChatCreateParams = ChatCreateParams.none()
    ): CompletableFuture<ChatCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<ChatCreateResponse> =
        create(ChatCreateParams.none(), requestOptions)

    /** Retrieve a full session by ID, including its event history. */
    fun retrieve(sessionId: String): CompletableFuture<ChatRetrieveResponse> =
        retrieve(sessionId, ChatRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        sessionId: String,
        params: ChatRetrieveParams = ChatRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatRetrieveResponse> =
        retrieve(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        sessionId: String,
        params: ChatRetrieveParams = ChatRetrieveParams.none(),
    ): CompletableFuture<ChatRetrieveResponse> = retrieve(sessionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChatRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ChatRetrieveParams): CompletableFuture<ChatRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatRetrieveResponse> =
        retrieve(sessionId, ChatRetrieveParams.none(), requestOptions)

    /** List all chat sessions for the current project. */
    fun list(): CompletableFuture<ChatListPageAsync> = list(ChatListParams.none())

    /** @see list */
    fun list(
        params: ChatListParams = ChatListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatListPageAsync>

    /** @see list */
    fun list(params: ChatListParams = ChatListParams.none()): CompletableFuture<ChatListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ChatListPageAsync> =
        list(ChatListParams.none(), requestOptions)

    /** Delete a session. */
    fun delete(sessionId: String): CompletableFuture<Void?> =
        delete(sessionId, ChatDeleteParams.none())

    /** @see delete */
    fun delete(
        sessionId: String,
        params: ChatDeleteParams = ChatDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        sessionId: String,
        params: ChatDeleteParams = ChatDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(sessionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ChatDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ChatDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(sessionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(sessionId, ChatDeleteParams.none(), requestOptions)

    /** Retrieve a session summary by ID. */
    fun getSummary(sessionId: String): CompletableFuture<ChatGetSummaryResponse> =
        getSummary(sessionId, ChatGetSummaryParams.none())

    /** @see getSummary */
    fun getSummary(
        sessionId: String,
        params: ChatGetSummaryParams = ChatGetSummaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatGetSummaryResponse> =
        getSummary(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see getSummary */
    fun getSummary(
        sessionId: String,
        params: ChatGetSummaryParams = ChatGetSummaryParams.none(),
    ): CompletableFuture<ChatGetSummaryResponse> =
        getSummary(sessionId, params, RequestOptions.none())

    /** @see getSummary */
    fun getSummary(
        params: ChatGetSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatGetSummaryResponse>

    /** @see getSummary */
    fun getSummary(params: ChatGetSummaryParams): CompletableFuture<ChatGetSummaryResponse> =
        getSummary(params, RequestOptions.none())

    /** @see getSummary */
    fun getSummary(
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatGetSummaryResponse> =
        getSummary(sessionId, ChatGetSummaryParams.none(), requestOptions)

    /** Stream agent events for a chat turn as Server-Sent Events. */
    fun stream(sessionId: String, params: ChatStreamParams): CompletableFuture<ChatStreamResponse> =
        stream(sessionId, params, RequestOptions.none())

    /** @see stream */
    fun stream(
        sessionId: String,
        params: ChatStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatStreamResponse> =
        stream(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see stream */
    fun stream(params: ChatStreamParams): CompletableFuture<ChatStreamResponse> =
        stream(params, RequestOptions.none())

    /** @see stream */
    fun stream(
        params: ChatStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatStreamResponse>

    /** A view of [ChatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/chat`, but is otherwise the same as
         * [ChatServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<ChatCreateResponse>> =
            create(ChatCreateParams.none())

        /** @see create */
        fun create(
            params: ChatCreateParams = ChatCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatCreateResponse>>

        /** @see create */
        fun create(
            params: ChatCreateParams = ChatCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ChatCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ChatCreateResponse>> =
            create(ChatCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/chat/{session_id}`, but is otherwise the
         * same as [ChatServiceAsync.retrieve].
         */
        fun retrieve(sessionId: String): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>> =
            retrieve(sessionId, ChatRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            sessionId: String,
            params: ChatRetrieveParams = ChatRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>> =
            retrieve(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            sessionId: String,
            params: ChatRetrieveParams = ChatRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>> =
            retrieve(sessionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ChatRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ChatRetrieveParams
        ): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatRetrieveResponse>> =
            retrieve(sessionId, ChatRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/chat`, but is otherwise the same as
         * [ChatServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ChatListPageAsync>> =
            list(ChatListParams.none())

        /** @see list */
        fun list(
            params: ChatListParams = ChatListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatListPageAsync>>

        /** @see list */
        fun list(
            params: ChatListParams = ChatListParams.none()
        ): CompletableFuture<HttpResponseFor<ChatListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ChatListPageAsync>> =
            list(ChatListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/chat/{session_id}`, but is otherwise the
         * same as [ChatServiceAsync.delete].
         */
        fun delete(sessionId: String): CompletableFuture<HttpResponse> =
            delete(sessionId, ChatDeleteParams.none())

        /** @see delete */
        fun delete(
            sessionId: String,
            params: ChatDeleteParams = ChatDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            sessionId: String,
            params: ChatDeleteParams = ChatDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(sessionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ChatDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ChatDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(sessionId, ChatDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/chat/{session_id}/summary`, but is otherwise
         * the same as [ChatServiceAsync.getSummary].
         */
        fun getSummary(
            sessionId: String
        ): CompletableFuture<HttpResponseFor<ChatGetSummaryResponse>> =
            getSummary(sessionId, ChatGetSummaryParams.none())

        /** @see getSummary */
        fun getSummary(
            sessionId: String,
            params: ChatGetSummaryParams = ChatGetSummaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatGetSummaryResponse>> =
            getSummary(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see getSummary */
        fun getSummary(
            sessionId: String,
            params: ChatGetSummaryParams = ChatGetSummaryParams.none(),
        ): CompletableFuture<HttpResponseFor<ChatGetSummaryResponse>> =
            getSummary(sessionId, params, RequestOptions.none())

        /** @see getSummary */
        fun getSummary(
            params: ChatGetSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatGetSummaryResponse>>

        /** @see getSummary */
        fun getSummary(
            params: ChatGetSummaryParams
        ): CompletableFuture<HttpResponseFor<ChatGetSummaryResponse>> =
            getSummary(params, RequestOptions.none())

        /** @see getSummary */
        fun getSummary(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatGetSummaryResponse>> =
            getSummary(sessionId, ChatGetSummaryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/chat/{session_id}/messages/stream`, but is
         * otherwise the same as [ChatServiceAsync.stream].
         */
        fun stream(
            sessionId: String,
            params: ChatStreamParams,
        ): CompletableFuture<HttpResponseFor<ChatStreamResponse>> =
            stream(sessionId, params, RequestOptions.none())

        /** @see stream */
        fun stream(
            sessionId: String,
            params: ChatStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatStreamResponse>> =
            stream(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see stream */
        fun stream(
            params: ChatStreamParams
        ): CompletableFuture<HttpResponseFor<ChatStreamResponse>> =
            stream(params, RequestOptions.none())

        /** @see stream */
        fun stream(
            params: ChatStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatStreamResponse>>
    }
}
