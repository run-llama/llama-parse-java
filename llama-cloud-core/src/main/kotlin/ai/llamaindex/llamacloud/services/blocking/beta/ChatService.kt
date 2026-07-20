// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponse
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.beta.chat.ChatCreateParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatCreateResponse
import ai.llamaindex.llamacloud.models.beta.chat.ChatDeleteParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatGetSummaryParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatGetSummaryResponse
import ai.llamaindex.llamacloud.models.beta.chat.ChatListPage
import ai.llamaindex.llamacloud.models.beta.chat.ChatListParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatRetrieveParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatRetrieveResponse
import ai.llamaindex.llamacloud.models.beta.chat.ChatStreamParams
import ai.llamaindex.llamacloud.models.beta.chat.ChatStreamResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ChatService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService

    /** Create a chat session, optionally bound to indexes (locked after the first message). */
    fun create(): ChatCreateResponse = create(ChatCreateParams.none())

    /** @see create */
    fun create(
        params: ChatCreateParams = ChatCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCreateResponse

    /** @see create */
    fun create(params: ChatCreateParams = ChatCreateParams.none()): ChatCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): ChatCreateResponse =
        create(ChatCreateParams.none(), requestOptions)

    /** Retrieve a full session by ID, including its event history. */
    fun retrieve(sessionId: String): ChatRetrieveResponse =
        retrieve(sessionId, ChatRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        sessionId: String,
        params: ChatRetrieveParams = ChatRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatRetrieveResponse =
        retrieve(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        sessionId: String,
        params: ChatRetrieveParams = ChatRetrieveParams.none(),
    ): ChatRetrieveResponse = retrieve(sessionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChatRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ChatRetrieveParams): ChatRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(sessionId: String, requestOptions: RequestOptions): ChatRetrieveResponse =
        retrieve(sessionId, ChatRetrieveParams.none(), requestOptions)

    /** List all chat sessions for the current project. */
    fun list(): ChatListPage = list(ChatListParams.none())

    /** @see list */
    fun list(
        params: ChatListParams = ChatListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatListPage

    /** @see list */
    fun list(params: ChatListParams = ChatListParams.none()): ChatListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ChatListPage =
        list(ChatListParams.none(), requestOptions)

    /** Delete a session. */
    fun delete(sessionId: String) = delete(sessionId, ChatDeleteParams.none())

    /** @see delete */
    fun delete(
        sessionId: String,
        params: ChatDeleteParams = ChatDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see delete */
    fun delete(sessionId: String, params: ChatDeleteParams = ChatDeleteParams.none()) =
        delete(sessionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ChatDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ChatDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(sessionId: String, requestOptions: RequestOptions) =
        delete(sessionId, ChatDeleteParams.none(), requestOptions)

    /** Retrieve a session summary by ID. */
    fun getSummary(sessionId: String): ChatGetSummaryResponse =
        getSummary(sessionId, ChatGetSummaryParams.none())

    /** @see getSummary */
    fun getSummary(
        sessionId: String,
        params: ChatGetSummaryParams = ChatGetSummaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatGetSummaryResponse =
        getSummary(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see getSummary */
    fun getSummary(
        sessionId: String,
        params: ChatGetSummaryParams = ChatGetSummaryParams.none(),
    ): ChatGetSummaryResponse = getSummary(sessionId, params, RequestOptions.none())

    /** @see getSummary */
    fun getSummary(
        params: ChatGetSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatGetSummaryResponse

    /** @see getSummary */
    fun getSummary(params: ChatGetSummaryParams): ChatGetSummaryResponse =
        getSummary(params, RequestOptions.none())

    /** @see getSummary */
    fun getSummary(sessionId: String, requestOptions: RequestOptions): ChatGetSummaryResponse =
        getSummary(sessionId, ChatGetSummaryParams.none(), requestOptions)

    /** Stream agent events for a chat turn as Server-Sent Events. */
    fun stream(sessionId: String, params: ChatStreamParams): ChatStreamResponse =
        stream(sessionId, params, RequestOptions.none())

    /** @see stream */
    fun stream(
        sessionId: String,
        params: ChatStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatStreamResponse = stream(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see stream */
    fun stream(params: ChatStreamParams): ChatStreamResponse = stream(params, RequestOptions.none())

    /** @see stream */
    fun stream(
        params: ChatStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatStreamResponse

    /** A view of [ChatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/chat`, but is otherwise the same as
         * [ChatService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<ChatCreateResponse> = create(ChatCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ChatCreateParams = ChatCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: ChatCreateParams = ChatCreateParams.none()
        ): HttpResponseFor<ChatCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ChatCreateResponse> =
            create(ChatCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/chat/{session_id}`, but is otherwise the
         * same as [ChatService.retrieve].
         */
        @MustBeClosed
        fun retrieve(sessionId: String): HttpResponseFor<ChatRetrieveResponse> =
            retrieve(sessionId, ChatRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sessionId: String,
            params: ChatRetrieveParams = ChatRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatRetrieveResponse> =
            retrieve(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sessionId: String,
            params: ChatRetrieveParams = ChatRetrieveParams.none(),
        ): HttpResponseFor<ChatRetrieveResponse> =
            retrieve(sessionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ChatRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ChatRetrieveParams): HttpResponseFor<ChatRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatRetrieveResponse> =
            retrieve(sessionId, ChatRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/chat`, but is otherwise the same as
         * [ChatService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ChatListPage> = list(ChatListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChatListParams = ChatListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ChatListParams = ChatListParams.none()): HttpResponseFor<ChatListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ChatListPage> =
            list(ChatListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/chat/{session_id}`, but is otherwise the
         * same as [ChatService.delete].
         */
        @MustBeClosed
        fun delete(sessionId: String): HttpResponse = delete(sessionId, ChatDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            sessionId: String,
            params: ChatDeleteParams = ChatDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            sessionId: String,
            params: ChatDeleteParams = ChatDeleteParams.none(),
        ): HttpResponse = delete(sessionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ChatDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ChatDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(sessionId: String, requestOptions: RequestOptions): HttpResponse =
            delete(sessionId, ChatDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/chat/{session_id}/summary`, but is otherwise
         * the same as [ChatService.getSummary].
         */
        @MustBeClosed
        fun getSummary(sessionId: String): HttpResponseFor<ChatGetSummaryResponse> =
            getSummary(sessionId, ChatGetSummaryParams.none())

        /** @see getSummary */
        @MustBeClosed
        fun getSummary(
            sessionId: String,
            params: ChatGetSummaryParams = ChatGetSummaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatGetSummaryResponse> =
            getSummary(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see getSummary */
        @MustBeClosed
        fun getSummary(
            sessionId: String,
            params: ChatGetSummaryParams = ChatGetSummaryParams.none(),
        ): HttpResponseFor<ChatGetSummaryResponse> =
            getSummary(sessionId, params, RequestOptions.none())

        /** @see getSummary */
        @MustBeClosed
        fun getSummary(
            params: ChatGetSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatGetSummaryResponse>

        /** @see getSummary */
        @MustBeClosed
        fun getSummary(params: ChatGetSummaryParams): HttpResponseFor<ChatGetSummaryResponse> =
            getSummary(params, RequestOptions.none())

        /** @see getSummary */
        @MustBeClosed
        fun getSummary(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatGetSummaryResponse> =
            getSummary(sessionId, ChatGetSummaryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/chat/{session_id}/messages/stream`, but is
         * otherwise the same as [ChatService.stream].
         */
        @MustBeClosed
        fun stream(
            sessionId: String,
            params: ChatStreamParams,
        ): HttpResponseFor<ChatStreamResponse> = stream(sessionId, params, RequestOptions.none())

        /** @see stream */
        @MustBeClosed
        fun stream(
            sessionId: String,
            params: ChatStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatStreamResponse> =
            stream(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see stream */
        @MustBeClosed
        fun stream(params: ChatStreamParams): HttpResponseFor<ChatStreamResponse> =
            stream(params, RequestOptions.none())

        /** @see stream */
        @MustBeClosed
        fun stream(
            params: ChatStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatStreamResponse>
    }
}
