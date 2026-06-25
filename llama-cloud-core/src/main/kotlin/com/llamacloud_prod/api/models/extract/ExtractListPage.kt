// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.extract

import com.llamacloud_prod.api.core.AutoPager
import com.llamacloud_prod.api.core.Page
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.blocking.ExtractService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ExtractService.list */
class ExtractListPage
private constructor(
    private val service: ExtractService,
    private val params: ExtractListParams,
    private val response: ExtractV2JobQueryResponse,
) : Page<ExtractV2Job> {

    /**
     * Delegates to [ExtractV2JobQueryResponse], but gracefully handles missing data.
     *
     * @see ExtractV2JobQueryResponse.items
     */
    override fun items(): List<ExtractV2Job> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExtractV2JobQueryResponse], but gracefully handles missing data.
     *
     * @see ExtractV2JobQueryResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): ExtractListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): ExtractListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExtractV2Job> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExtractListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExtractV2JobQueryResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExtractListPage].
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

    /** A builder for [ExtractListPage]. */
    class Builder internal constructor() {

        private var service: ExtractService? = null
        private var params: ExtractListParams? = null
        private var response: ExtractV2JobQueryResponse? = null

        @JvmSynthetic
        internal fun from(extractListPage: ExtractListPage) = apply {
            service = extractListPage.service
            params = extractListPage.params
            response = extractListPage.response
        }

        fun service(service: ExtractService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExtractListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExtractV2JobQueryResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExtractListPage].
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
        fun build(): ExtractListPage =
            ExtractListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtractListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ExtractListPage{service=$service, params=$params, response=$response}"
}
