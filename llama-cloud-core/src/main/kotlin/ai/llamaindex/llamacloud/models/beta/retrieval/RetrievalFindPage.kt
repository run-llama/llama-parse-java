// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.retrieval

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.beta.RetrievalService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RetrievalService.find */
class RetrievalFindPage
private constructor(
    private val service: RetrievalService,
    private val params: RetrievalFindParams,
    private val response: RetrievalFindPageResponse,
) : Page<RetrievalFindResponse> {

    /**
     * Delegates to [RetrievalFindPageResponse], but gracefully handles missing data.
     *
     * @see RetrievalFindPageResponse.items
     */
    override fun items(): List<RetrievalFindResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [RetrievalFindPageResponse], but gracefully handles missing data.
     *
     * @see RetrievalFindPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): RetrievalFindParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): RetrievalFindPage = service.find(nextPageParams())

    fun autoPager(): AutoPager<RetrievalFindResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RetrievalFindParams = params

    /** The response that this page was parsed from. */
    fun response(): RetrievalFindPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RetrievalFindPage].
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

    /** A builder for [RetrievalFindPage]. */
    class Builder internal constructor() {

        private var service: RetrievalService? = null
        private var params: RetrievalFindParams? = null
        private var response: RetrievalFindPageResponse? = null

        @JvmSynthetic
        internal fun from(retrievalFindPage: RetrievalFindPage) = apply {
            service = retrievalFindPage.service
            params = retrievalFindPage.params
            response = retrievalFindPage.response
        }

        fun service(service: RetrievalService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RetrievalFindParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RetrievalFindPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RetrievalFindPage].
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
        fun build(): RetrievalFindPage =
            RetrievalFindPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrievalFindPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RetrievalFindPage{service=$service, params=$params, response=$response}"
}
