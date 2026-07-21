// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.chat

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.beta.ChatServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ChatServiceAsync.list */
class ChatListPageAsync
private constructor(
    private val service: ChatServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ChatListParams,
    private val response: ChatListPageResponse,
) : PageAsync<ChatListResponse> {

    /**
     * Delegates to [ChatListPageResponse], but gracefully handles missing data.
     *
     * @see ChatListPageResponse.items
     */
    override fun items(): List<ChatListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ChatListPageResponse], but gracefully handles missing data.
     *
     * @see ChatListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): ChatListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ChatListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ChatListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ChatListParams = params

    /** The response that this page was parsed from. */
    fun response(): ChatListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChatListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatListPageAsync]. */
    class Builder internal constructor() {

        private var service: ChatServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ChatListParams? = null
        private var response: ChatListPageResponse? = null

        @JvmSynthetic
        internal fun from(chatListPageAsync: ChatListPageAsync) = apply {
            service = chatListPageAsync.service
            streamHandlerExecutor = chatListPageAsync.streamHandlerExecutor
            params = chatListPageAsync.params
            response = chatListPageAsync.response
        }

        fun service(service: ChatServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ChatListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ChatListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ChatListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatListPageAsync =
            ChatListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ChatListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
