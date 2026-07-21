// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.directories

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.beta.DirectoryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DirectoryServiceAsync.list */
class DirectoryListPageAsync
private constructor(
    private val service: DirectoryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DirectoryListParams,
    private val response: DirectoryListPageResponse,
) : PageAsync<DirectoryListResponse> {

    /**
     * Delegates to [DirectoryListPageResponse], but gracefully handles missing data.
     *
     * @see DirectoryListPageResponse.items
     */
    override fun items(): List<DirectoryListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [DirectoryListPageResponse], but gracefully handles missing data.
     *
     * @see DirectoryListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): DirectoryListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DirectoryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DirectoryListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DirectoryListParams = params

    /** The response that this page was parsed from. */
    fun response(): DirectoryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DirectoryListPageAsync].
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

    /** A builder for [DirectoryListPageAsync]. */
    class Builder internal constructor() {

        private var service: DirectoryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DirectoryListParams? = null
        private var response: DirectoryListPageResponse? = null

        @JvmSynthetic
        internal fun from(directoryListPageAsync: DirectoryListPageAsync) = apply {
            service = directoryListPageAsync.service
            streamHandlerExecutor = directoryListPageAsync.streamHandlerExecutor
            params = directoryListPageAsync.params
            response = directoryListPageAsync.response
        }

        fun service(service: DirectoryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DirectoryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DirectoryListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DirectoryListPageAsync].
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
        fun build(): DirectoryListPageAsync =
            DirectoryListPageAsync(
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

        return other is DirectoryListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DirectoryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
