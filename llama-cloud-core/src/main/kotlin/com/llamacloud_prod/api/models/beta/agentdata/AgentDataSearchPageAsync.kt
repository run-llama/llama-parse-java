// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.agentdata

import com.llamacloud_prod.api.core.AutoPagerAsync
import com.llamacloud_prod.api.core.PageAsync
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.async.beta.AgentDataServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AgentDataServiceAsync.search */
class AgentDataSearchPageAsync
private constructor(
    private val service: AgentDataServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AgentDataSearchParams,
    private val response: AgentDataSearchPageResponse,
) : PageAsync<AgentData> {

    /**
     * Delegates to [AgentDataSearchPageResponse], but gracefully handles missing data.
     *
     * @see AgentDataSearchPageResponse.items
     */
    override fun items(): List<AgentData> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [AgentDataSearchPageResponse], but gracefully handles missing data.
     *
     * @see AgentDataSearchPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): AgentDataSearchParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AgentDataSearchPageAsync> =
        service.search(nextPageParams())

    fun autoPager(): AutoPagerAsync<AgentData> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AgentDataSearchParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentDataSearchPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentDataSearchPageAsync].
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

    /** A builder for [AgentDataSearchPageAsync]. */
    class Builder internal constructor() {

        private var service: AgentDataServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AgentDataSearchParams? = null
        private var response: AgentDataSearchPageResponse? = null

        @JvmSynthetic
        internal fun from(agentDataSearchPageAsync: AgentDataSearchPageAsync) = apply {
            service = agentDataSearchPageAsync.service
            streamHandlerExecutor = agentDataSearchPageAsync.streamHandlerExecutor
            params = agentDataSearchPageAsync.params
            response = agentDataSearchPageAsync.response
        }

        fun service(service: AgentDataServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AgentDataSearchParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgentDataSearchPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgentDataSearchPageAsync].
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
        fun build(): AgentDataSearchPageAsync =
            AgentDataSearchPageAsync(
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

        return other is AgentDataSearchPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AgentDataSearchPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
