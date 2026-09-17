// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.retrievers

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.RetrieverServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RetrieverServiceAsync.listPaginated */
class RetrieverListPaginatedPageAsync
private constructor(
    private val service: RetrieverServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RetrieverListPaginatedParams,
    private val response: RetrieverListPaginatedPageResponse,
) : PageAsync<Retriever> {

    /**
     * Delegates to [RetrieverListPaginatedPageResponse], but gracefully handles missing data.
     *
     * @see RetrieverListPaginatedPageResponse.items
     */
    override fun items(): List<Retriever> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [RetrieverListPaginatedPageResponse], but gracefully handles missing data.
     *
     * @see RetrieverListPaginatedPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): RetrieverListPaginatedParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RetrieverListPaginatedPageAsync> =
        service.listPaginated(nextPageParams())

    fun autoPager(): AutoPagerAsync<Retriever> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RetrieverListPaginatedParams = params

    /** The response that this page was parsed from. */
    fun response(): RetrieverListPaginatedPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RetrieverListPaginatedPageAsync].
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

    /** A builder for [RetrieverListPaginatedPageAsync]. */
    class Builder internal constructor() {

        private var service: RetrieverServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RetrieverListPaginatedParams? = null
        private var response: RetrieverListPaginatedPageResponse? = null

        @JvmSynthetic
        internal fun from(retrieverListPaginatedPageAsync: RetrieverListPaginatedPageAsync) =
            apply {
                service = retrieverListPaginatedPageAsync.service
                streamHandlerExecutor = retrieverListPaginatedPageAsync.streamHandlerExecutor
                params = retrieverListPaginatedPageAsync.params
                response = retrieverListPaginatedPageAsync.response
            }

        fun service(service: RetrieverServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RetrieverListPaginatedParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RetrieverListPaginatedPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RetrieverListPaginatedPageAsync].
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
        fun build(): RetrieverListPaginatedPageAsync =
            RetrieverListPaginatedPageAsync(
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

        return other is RetrieverListPaginatedPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RetrieverListPaginatedPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
