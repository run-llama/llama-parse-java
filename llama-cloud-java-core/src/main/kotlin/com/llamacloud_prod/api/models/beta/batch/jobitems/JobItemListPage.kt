// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.batch.jobitems

import com.llamacloud_prod.api.core.AutoPager
import com.llamacloud_prod.api.core.Page
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.blocking.beta.batch.JobItemService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see JobItemService.list */
class JobItemListPage
private constructor(
    private val service: JobItemService,
    private val params: JobItemListParams,
    private val response: JobItemListPageResponse,
) : Page<JobItemListResponse> {

    /**
     * Delegates to [JobItemListPageResponse], but gracefully handles missing data.
     *
     * @see JobItemListPageResponse.items
     */
    override fun items(): List<JobItemListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [JobItemListPageResponse], but gracefully handles missing data.
     *
     * @see JobItemListPageResponse.totalSize
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

    fun nextPageParams(): JobItemListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): JobItemListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<JobItemListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): JobItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): JobItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobItemListPage].
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

    /** A builder for [JobItemListPage]. */
    class Builder internal constructor() {

        private var service: JobItemService? = null
        private var params: JobItemListParams? = null
        private var response: JobItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(jobItemListPage: JobItemListPage) = apply {
            service = jobItemListPage.service
            params = jobItemListPage.params
            response = jobItemListPage.response
        }

        fun service(service: JobItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: JobItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: JobItemListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [JobItemListPage].
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
        fun build(): JobItemListPage =
            JobItemListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobItemListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "JobItemListPage{service=$service, params=$params, response=$response}"
}
