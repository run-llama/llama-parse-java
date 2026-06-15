// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.split

import com.llamacloud_prod.api.core.AutoPager
import com.llamacloud_prod.api.core.Page
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.blocking.beta.SplitService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SplitService.list */
class SplitListPage
private constructor(
    private val service: SplitService,
    private val params: SplitListParams,
    private val response: SplitListPageResponse,
) : Page<SplitListResponse> {

    /**
     * Delegates to [SplitListPageResponse], but gracefully handles missing data.
     *
     * @see SplitListPageResponse.items
     */
    override fun items(): List<SplitListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SplitListPageResponse], but gracefully handles missing data.
     *
     * @see SplitListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): SplitListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): SplitListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SplitListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SplitListParams = params

    /** The response that this page was parsed from. */
    fun response(): SplitListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SplitListPage].
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

    /** A builder for [SplitListPage]. */
    class Builder internal constructor() {

        private var service: SplitService? = null
        private var params: SplitListParams? = null
        private var response: SplitListPageResponse? = null

        @JvmSynthetic
        internal fun from(splitListPage: SplitListPage) = apply {
            service = splitListPage.service
            params = splitListPage.params
            response = splitListPage.response
        }

        fun service(service: SplitService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SplitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SplitListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SplitListPage].
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
        fun build(): SplitListPage =
            SplitListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SplitListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "SplitListPage{service=$service, params=$params, response=$response}"
}
