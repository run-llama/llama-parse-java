// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.chat

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.beta.ChatService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ChatService.list */
class ChatListPage
private constructor(
    private val service: ChatService,
    private val params: ChatListParams,
    private val response: ChatListPageResponse,
) : Page<ChatListResponse> {

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

    override fun nextPage(): ChatListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ChatListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ChatListParams = params

    /** The response that this page was parsed from. */
    fun response(): ChatListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChatListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatListPage]. */
    class Builder internal constructor() {

        private var service: ChatService? = null
        private var params: ChatListParams? = null
        private var response: ChatListPageResponse? = null

        @JvmSynthetic
        internal fun from(chatListPage: ChatListPage) = apply {
            service = chatListPage.service
            params = chatListPage.params
            response = chatListPage.response
        }

        fun service(service: ChatService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ChatListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ChatListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ChatListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatListPage =
            ChatListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "ChatListPage{service=$service, params=$params, response=$response}"
}
