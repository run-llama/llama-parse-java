// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.ParsingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ParsingService.list */
class ParsingListPage
private constructor(
    private val service: ParsingService,
    private val params: ParsingListParams,
    private val response: ParsingListPageResponse,
) : Page<ParsingListResponse> {

    /**
     * Delegates to [ParsingListPageResponse], but gracefully handles missing data.
     *
     * @see ParsingListPageResponse.items
     */
    override fun items(): List<ParsingListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ParsingListPageResponse], but gracefully handles missing data.
     *
     * @see ParsingListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): ParsingListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): ParsingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ParsingListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ParsingListParams = params

    /** The response that this page was parsed from. */
    fun response(): ParsingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ParsingListPage].
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

    /** A builder for [ParsingListPage]. */
    class Builder internal constructor() {

        private var service: ParsingService? = null
        private var params: ParsingListParams? = null
        private var response: ParsingListPageResponse? = null

        @JvmSynthetic
        internal fun from(parsingListPage: ParsingListPage) = apply {
            service = parsingListPage.service
            params = parsingListPage.params
            response = parsingListPage.response
        }

        fun service(service: ParsingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ParsingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ParsingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ParsingListPage].
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
        fun build(): ParsingListPage =
            ParsingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParsingListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ParsingListPage{service=$service, params=$params, response=$response}"
}
