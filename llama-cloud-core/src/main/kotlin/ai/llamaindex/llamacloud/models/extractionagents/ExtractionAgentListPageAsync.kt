// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extractionagents

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.ExtractionAgentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ExtractionAgentServiceAsync.list */
class ExtractionAgentListPageAsync
private constructor(
    private val service: ExtractionAgentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExtractionAgentListParams,
    private val response: ExtractionAgentListPageResponse,
) : PageAsync<ExtractAgent> {

    /**
     * Delegates to [ExtractionAgentListPageResponse], but gracefully handles missing data.
     *
     * @see ExtractionAgentListPageResponse.items
     */
    override fun items(): List<ExtractAgent> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExtractionAgentListPageResponse], but gracefully handles missing data.
     *
     * @see ExtractionAgentListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): ExtractionAgentListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ExtractionAgentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExtractAgent> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExtractionAgentListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExtractionAgentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExtractionAgentListPageAsync].
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

    /** A builder for [ExtractionAgentListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExtractionAgentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExtractionAgentListParams? = null
        private var response: ExtractionAgentListPageResponse? = null

        @JvmSynthetic
        internal fun from(extractionAgentListPageAsync: ExtractionAgentListPageAsync) = apply {
            service = extractionAgentListPageAsync.service
            streamHandlerExecutor = extractionAgentListPageAsync.streamHandlerExecutor
            params = extractionAgentListPageAsync.params
            response = extractionAgentListPageAsync.response
        }

        fun service(service: ExtractionAgentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExtractionAgentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExtractionAgentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExtractionAgentListPageAsync].
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
        fun build(): ExtractionAgentListPageAsync =
            ExtractionAgentListPageAsync(
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

        return other is ExtractionAgentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ExtractionAgentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
