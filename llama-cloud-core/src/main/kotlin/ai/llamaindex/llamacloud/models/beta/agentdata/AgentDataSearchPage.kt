// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.agentdata

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.beta.AgentDataService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AgentDataService.search */
class AgentDataSearchPage
private constructor(
    private val service: AgentDataService,
    private val params: AgentDataSearchParams,
    private val response: AgentDataSearchPageResponse,
) : Page<AgentData> {

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

    override fun nextPage(): AgentDataSearchPage = service.search(nextPageParams())

    fun autoPager(): AutoPager<AgentData> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AgentDataSearchParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentDataSearchPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentDataSearchPage].
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

    /** A builder for [AgentDataSearchPage]. */
    class Builder internal constructor() {

        private var service: AgentDataService? = null
        private var params: AgentDataSearchParams? = null
        private var response: AgentDataSearchPageResponse? = null

        @JvmSynthetic
        internal fun from(agentDataSearchPage: AgentDataSearchPage) = apply {
            service = agentDataSearchPage.service
            params = agentDataSearchPage.params
            response = agentDataSearchPage.response
        }

        fun service(service: AgentDataService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AgentDataSearchParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgentDataSearchPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgentDataSearchPage].
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
        fun build(): AgentDataSearchPage =
            AgentDataSearchPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentDataSearchPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AgentDataSearchPage{service=$service, params=$params, response=$response}"
}
