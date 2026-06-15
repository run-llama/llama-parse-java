// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories

import com.llamacloud_prod.api.core.AutoPager
import com.llamacloud_prod.api.core.Page
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.blocking.beta.DirectoryService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DirectoryService.list */
class DirectoryListPage
private constructor(
    private val service: DirectoryService,
    private val params: DirectoryListParams,
    private val response: DirectoryListPageResponse,
) : Page<DirectoryListResponse> {

    /**
     * Delegates to [DirectoryListPageResponse], but gracefully handles missing data.
     *
     * @see DirectoryListPageResponse.items
     */
    override fun items(): List<DirectoryListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [DirectoryListPageResponse], but gracefully handles missing data.
     *
     * @see DirectoryListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): DirectoryListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): DirectoryListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DirectoryListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DirectoryListParams = params

    /** The response that this page was parsed from. */
    fun response(): DirectoryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DirectoryListPage].
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

    /** A builder for [DirectoryListPage]. */
    class Builder internal constructor() {

        private var service: DirectoryService? = null
        private var params: DirectoryListParams? = null
        private var response: DirectoryListPageResponse? = null

        @JvmSynthetic
        internal fun from(directoryListPage: DirectoryListPage) = apply {
            service = directoryListPage.service
            params = directoryListPage.params
            response = directoryListPage.response
        }

        fun service(service: DirectoryService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DirectoryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DirectoryListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DirectoryListPage].
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
        fun build(): DirectoryListPage =
            DirectoryListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirectoryListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DirectoryListPage{service=$service, params=$params, response=$response}"
}
