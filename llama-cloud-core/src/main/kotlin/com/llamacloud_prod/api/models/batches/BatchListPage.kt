// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.batches

import com.llamacloud_prod.api.core.AutoPager
import com.llamacloud_prod.api.core.Page
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.blocking.BatchService
import java.util.Objects
import java.util.Optional
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
     * @see BatchListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): BatchListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
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
