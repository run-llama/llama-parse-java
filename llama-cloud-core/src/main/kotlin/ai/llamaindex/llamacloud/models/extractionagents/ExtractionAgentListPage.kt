// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extractionagents

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.ExtractionAgentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ExtractionAgentService.list */
class ExtractionAgentListPage
private constructor(
    private val service: ExtractionAgentService,
    private val params: ExtractionAgentListParams,
    private val response: ExtractionAgentListPageResponse,
) : Page<ExtractAgent> {

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

    override fun nextPage(): ExtractionAgentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExtractAgent> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExtractionAgentListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExtractionAgentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExtractionAgentListPage].
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

    /** A builder for [ExtractionAgentListPage]. */
    class Builder internal constructor() {

        private var service: ExtractionAgentService? = null
        private var params: ExtractionAgentListParams? = null
        private var response: ExtractionAgentListPageResponse? = null

        @JvmSynthetic
        internal fun from(extractionAgentListPage: ExtractionAgentListPage) = apply {
            service = extractionAgentListPage.service
            params = extractionAgentListPage.params
            response = extractionAgentListPage.response
        }

        fun service(service: ExtractionAgentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExtractionAgentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExtractionAgentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExtractionAgentListPage].
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
        fun build(): ExtractionAgentListPage =
            ExtractionAgentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtractionAgentListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ExtractionAgentListPage{service=$service, params=$params, response=$response}"
}
