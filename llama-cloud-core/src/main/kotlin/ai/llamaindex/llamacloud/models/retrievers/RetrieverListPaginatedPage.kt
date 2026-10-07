// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.retrievers

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.RetrieverService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RetrieverService.listPaginated */
class RetrieverListPaginatedPage
private constructor(
    private val service: RetrieverService,
    private val params: RetrieverListPaginatedParams,
    private val response: RetrieverListPaginatedPageResponse,
) : Page<Retriever> {

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

    override fun nextPage(): RetrieverListPaginatedPage = service.listPaginated(nextPageParams())

    fun autoPager(): AutoPager<Retriever> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RetrieverListPaginatedParams = params

    /** The response that this page was parsed from. */
    fun response(): RetrieverListPaginatedPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RetrieverListPaginatedPage].
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

    /** A builder for [RetrieverListPaginatedPage]. */
    class Builder internal constructor() {

        private var service: RetrieverService? = null
        private var params: RetrieverListPaginatedParams? = null
        private var response: RetrieverListPaginatedPageResponse? = null

        @JvmSynthetic
        internal fun from(retrieverListPaginatedPage: RetrieverListPaginatedPage) = apply {
            service = retrieverListPaginatedPage.service
            params = retrieverListPaginatedPage.params
            response = retrieverListPaginatedPage.response
        }

        fun service(service: RetrieverService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RetrieverListPaginatedParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RetrieverListPaginatedPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RetrieverListPaginatedPage].
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
        fun build(): RetrieverListPaginatedPage =
            RetrieverListPaginatedPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrieverListPaginatedPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RetrieverListPaginatedPage{service=$service, params=$params, response=$response}"
}
