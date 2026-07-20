// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.agentdata

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.beta.AgentDataServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AgentDataServiceAsync.aggregate */
class AgentDataAggregatePageAsync
private constructor(
    private val service: AgentDataServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AgentDataAggregateParams,
    private val response: AgentDataAggregatePageResponse,
) : PageAsync<AgentDataAggregateResponse> {

    /**
     * Delegates to [AgentDataAggregatePageResponse], but gracefully handles missing data.
     *
     * @see AgentDataAggregatePageResponse.items
     */
    override fun items(): List<AgentDataAggregateResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [AgentDataAggregatePageResponse], but gracefully handles missing data.
     *
     * @see AgentDataAggregatePageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): AgentDataAggregateParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AgentDataAggregatePageAsync> =
        service.aggregate(nextPageParams())

    fun autoPager(): AutoPagerAsync<AgentDataAggregateResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AgentDataAggregateParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentDataAggregatePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentDataAggregatePageAsync].
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

    /** A builder for [AgentDataAggregatePageAsync]. */
    class Builder internal constructor() {

        private var service: AgentDataServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AgentDataAggregateParams? = null
        private var response: AgentDataAggregatePageResponse? = null

        @JvmSynthetic
        internal fun from(agentDataAggregatePageAsync: AgentDataAggregatePageAsync) = apply {
            service = agentDataAggregatePageAsync.service
            streamHandlerExecutor = agentDataAggregatePageAsync.streamHandlerExecutor
            params = agentDataAggregatePageAsync.params
            response = agentDataAggregatePageAsync.response
        }

        fun service(service: AgentDataServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AgentDataAggregateParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgentDataAggregatePageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgentDataAggregatePageAsync].
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
        fun build(): AgentDataAggregatePageAsync =
            AgentDataAggregatePageAsync(
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

        return other is AgentDataAggregatePageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AgentDataAggregatePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
