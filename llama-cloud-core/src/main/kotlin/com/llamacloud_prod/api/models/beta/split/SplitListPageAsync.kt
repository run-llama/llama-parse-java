// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.split

import com.llamacloud_prod.api.core.AutoPagerAsync
import com.llamacloud_prod.api.core.PageAsync
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.async.beta.SplitServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SplitServiceAsync.list */
class SplitListPageAsync
private constructor(
    private val service: SplitServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SplitListParams,
    private val response: SplitListPageResponse,
) : PageAsync<SplitListResponse> {

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

    override fun nextPage(): CompletableFuture<SplitListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SplitListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SplitListParams = params

    /** The response that this page was parsed from. */
    fun response(): SplitListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SplitListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SplitListPageAsync]. */
    class Builder internal constructor() {

        private var service: SplitServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SplitListParams? = null
        private var response: SplitListPageResponse? = null

        @JvmSynthetic
        internal fun from(splitListPageAsync: SplitListPageAsync) = apply {
            service = splitListPageAsync.service
            streamHandlerExecutor = splitListPageAsync.streamHandlerExecutor
            params = splitListPageAsync.params
            response = splitListPageAsync.response
        }

        fun service(service: SplitServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SplitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SplitListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SplitListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SplitListPageAsync =
            SplitListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SplitListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SplitListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
