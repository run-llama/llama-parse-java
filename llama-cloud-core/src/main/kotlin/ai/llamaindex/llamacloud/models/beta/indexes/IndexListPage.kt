// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.indexes

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.beta.IndexService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see IndexService.list */
class IndexListPage
private constructor(
    private val service: IndexService,
    private val params: IndexListParams,
    private val response: IndexListPageResponse,
) : Page<IndexListResponse> {

    /**
     * Delegates to [IndexListPageResponse], but gracefully handles missing data.
     *
     * @see IndexListPageResponse.items
     */
    override fun items(): List<IndexListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [IndexListPageResponse], but gracefully handles missing data.
     *
     * @see IndexListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): IndexListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): IndexListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<IndexListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IndexListParams = params

    /** The response that this page was parsed from. */
    fun response(): IndexListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IndexListPage].
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

    /** A builder for [IndexListPage]. */
    class Builder internal constructor() {

        private var service: IndexService? = null
        private var params: IndexListParams? = null
        private var response: IndexListPageResponse? = null

        @JvmSynthetic
        internal fun from(indexListPage: IndexListPage) = apply {
            service = indexListPage.service
            params = indexListPage.params
            response = indexListPage.response
        }

        fun service(service: IndexService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IndexListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IndexListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [IndexListPage].
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
        fun build(): IndexListPage =
            IndexListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IndexListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "IndexListPage{service=$service, params=$params, response=$response}"
}
