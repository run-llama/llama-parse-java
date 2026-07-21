// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.retrieval

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.beta.RetrievalServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RetrievalServiceAsync.grep */
class RetrievalGrepPageAsync
private constructor(
    private val service: RetrievalServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RetrievalGrepParams,
    private val response: RetrievalGrepPageResponse,
) : PageAsync<RetrievalGrepResponse> {

    /**
     * Delegates to [RetrievalGrepPageResponse], but gracefully handles missing data.
     *
     * @see RetrievalGrepPageResponse.items
     */
    override fun items(): List<RetrievalGrepResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [RetrievalGrepPageResponse], but gracefully handles missing data.
     *
     * @see RetrievalGrepPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): RetrievalGrepParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RetrievalGrepPageAsync> =
        service.grep(nextPageParams())

    fun autoPager(): AutoPagerAsync<RetrievalGrepResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RetrievalGrepParams = params

    /** The response that this page was parsed from. */
    fun response(): RetrievalGrepPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RetrievalGrepPageAsync].
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

    /** A builder for [RetrievalGrepPageAsync]. */
    class Builder internal constructor() {

        private var service: RetrievalServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RetrievalGrepParams? = null
        private var response: RetrievalGrepPageResponse? = null

        @JvmSynthetic
        internal fun from(retrievalGrepPageAsync: RetrievalGrepPageAsync) = apply {
            service = retrievalGrepPageAsync.service
            streamHandlerExecutor = retrievalGrepPageAsync.streamHandlerExecutor
            params = retrievalGrepPageAsync.params
            response = retrievalGrepPageAsync.response
        }

        fun service(service: RetrievalServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RetrievalGrepParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RetrievalGrepPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RetrievalGrepPageAsync].
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
        fun build(): RetrievalGrepPageAsync =
            RetrievalGrepPageAsync(
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

        return other is RetrievalGrepPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RetrievalGrepPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
