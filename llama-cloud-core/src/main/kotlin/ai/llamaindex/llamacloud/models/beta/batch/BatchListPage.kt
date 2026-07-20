// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.batch

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.beta.BatchService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BatchService.list */
class BatchListPage
private constructor(
    private val service: BatchService,
    private val params: BatchListParams,
    private val response: BatchListPageResponse,
) : Page<BatchListResponse> {

    /**
     * Delegates to [BatchListPageResponse], but gracefully handles missing data.
     *
     * @see BatchListPageResponse.items
     */
    override fun items(): List<BatchListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [BatchListPageResponse], but gracefully handles missing data.
     *
     * @see BatchListPageResponse.totalSize
     */
    fun totalSize(): Optional<Long> = response._totalSize().getOptional("total_size")

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = params.offset().getOrDefault(0)
        val totalCount = totalSize().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): BatchListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): BatchListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BatchListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BatchListParams = params

    /** The response that this page was parsed from. */
    fun response(): BatchListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatchListPage].
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

    /** A builder for [BatchListPage]. */
    class Builder internal constructor() {

        private var service: BatchService? = null
        private var params: BatchListParams? = null
        private var response: BatchListPageResponse? = null

        @JvmSynthetic
        internal fun from(batchListPage: BatchListPage) = apply {
            service = batchListPage.service
            params = batchListPage.params
            response = batchListPage.response
        }

        fun service(service: BatchService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BatchListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BatchListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BatchListPage].
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
        fun build(): BatchListPage =
            BatchListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "BatchListPage{service=$service, params=$params, response=$response}"
}
