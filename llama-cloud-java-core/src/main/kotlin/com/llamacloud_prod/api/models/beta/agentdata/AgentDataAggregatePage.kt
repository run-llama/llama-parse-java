// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.agentdata

import com.llamacloud_prod.api.core.AutoPager
import com.llamacloud_prod.api.core.Page
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.blocking.beta.AgentDataService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AgentDataService.aggregate */
class AgentDataAggregatePage
private constructor(
    private val service: AgentDataService,
    private val params: AgentDataAggregateParams,
    private val response: AgentDataAggregatePageResponse,
) : Page<AgentDataAggregateResponse> {

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

    override fun nextPage(): AgentDataAggregatePage = service.aggregate(nextPageParams())

    fun autoPager(): AutoPager<AgentDataAggregateResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AgentDataAggregateParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentDataAggregatePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentDataAggregatePage].
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

    /** A builder for [AgentDataAggregatePage]. */
    class Builder internal constructor() {

        private var service: AgentDataService? = null
        private var params: AgentDataAggregateParams? = null
        private var response: AgentDataAggregatePageResponse? = null

        @JvmSynthetic
        internal fun from(agentDataAggregatePage: AgentDataAggregatePage) = apply {
            service = agentDataAggregatePage.service
            params = agentDataAggregatePage.params
            response = agentDataAggregatePage.response
        }

        fun service(service: AgentDataService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AgentDataAggregateParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgentDataAggregatePageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgentDataAggregatePage].
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
        fun build(): AgentDataAggregatePage =
            AgentDataAggregatePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentDataAggregatePage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AgentDataAggregatePage{service=$service, params=$params, response=$response}"
}
