// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.indexes

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.beta.IndexServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see IndexServiceAsync.list */
class IndexListPageAsync
private constructor(
    private val service: IndexServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IndexListParams,
    private val response: IndexListPageResponse,
) : PageAsync<IndexListResponse> {

    /**
     * Delegates to [IndexListPageResponse], but gracefully handles missing data.
     *
     * @see IndexListPageResponse.items
     */
    override fun items(): List<IndexListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [IndexListPageResponse], but gracefully handles missing data.
     *
     * @see IndexListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): IndexListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<IndexListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IndexListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IndexListParams = params

    /** The response that this page was parsed from. */
    fun response(): IndexListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IndexListPageAsync].
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

    /** A builder for [IndexListPageAsync]. */
    class Builder internal constructor() {

        private var service: IndexServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IndexListParams? = null
        private var response: IndexListPageResponse? = null

        @JvmSynthetic
        internal fun from(indexListPageAsync: IndexListPageAsync) = apply {
            service = indexListPageAsync.service
            streamHandlerExecutor = indexListPageAsync.streamHandlerExecutor
            params = indexListPageAsync.params
            response = indexListPageAsync.response
        }

        fun service(service: IndexServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IndexListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IndexListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [IndexListPageAsync].
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
        fun build(): IndexListPageAsync =
            IndexListPageAsync(
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

        return other is IndexListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "IndexListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
