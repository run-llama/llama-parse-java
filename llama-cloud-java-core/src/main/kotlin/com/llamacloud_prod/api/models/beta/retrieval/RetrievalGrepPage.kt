// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.retrieval

import com.llamacloud_prod.api.core.AutoPager
import com.llamacloud_prod.api.core.Page
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.blocking.beta.RetrievalService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RetrievalService.grep */
class RetrievalGrepPage
private constructor(
    private val service: RetrievalService,
    private val params: RetrievalGrepParams,
    private val response: RetrievalGrepPageResponse,
) : Page<RetrievalGrepResponse> {

    /**
     * Delegates to [RetrievalGrepPageResponse], but gracefully handles missing data.
     *
     * @see RetrievalGrepPageResponse.items
     */
    override fun items(): List<RetrievalGrepResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [RetrievalGrepPageResponse], but gracefully handles missing data.
     *
     * @see RetrievalGrepPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): RetrievalGrepParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): RetrievalGrepPage = service.grep(nextPageParams())

    fun autoPager(): AutoPager<RetrievalGrepResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RetrievalGrepParams = params

    /** The response that this page was parsed from. */
    fun response(): RetrievalGrepPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RetrievalGrepPage].
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

    /** A builder for [RetrievalGrepPage]. */
    class Builder internal constructor() {

        private var service: RetrievalService? = null
        private var params: RetrievalGrepParams? = null
        private var response: RetrievalGrepPageResponse? = null

        @JvmSynthetic
        internal fun from(retrievalGrepPage: RetrievalGrepPage) = apply {
            service = retrievalGrepPage.service
            params = retrievalGrepPage.params
            response = retrievalGrepPage.response
        }

        fun service(service: RetrievalService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RetrievalGrepParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RetrievalGrepPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RetrievalGrepPage].
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
        fun build(): RetrievalGrepPage =
            RetrievalGrepPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RetrievalGrepPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RetrievalGrepPage{service=$service, params=$params, response=$response}"
}
