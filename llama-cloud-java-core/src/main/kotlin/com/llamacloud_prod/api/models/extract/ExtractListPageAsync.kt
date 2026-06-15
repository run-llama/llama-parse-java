// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.extract

import com.llamacloud_prod.api.core.AutoPagerAsync
import com.llamacloud_prod.api.core.PageAsync
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.async.ExtractServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ExtractServiceAsync.list */
class ExtractListPageAsync
private constructor(
    private val service: ExtractServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExtractListParams,
    private val response: ExtractV2JobQueryResponse,
) : PageAsync<ExtractV2Job> {

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

    override fun nextPage(): CompletableFuture<ExtractListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExtractV2Job> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExtractListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExtractV2JobQueryResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExtractListPageAsync].
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

    /** A builder for [ExtractListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExtractServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExtractListParams? = null
        private var response: ExtractV2JobQueryResponse? = null

        @JvmSynthetic
        internal fun from(extractListPageAsync: ExtractListPageAsync) = apply {
            service = extractListPageAsync.service
            streamHandlerExecutor = extractListPageAsync.streamHandlerExecutor
            params = extractListPageAsync.params
            response = extractListPageAsync.response
        }

        fun service(service: ExtractServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExtractListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExtractV2JobQueryResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExtractListPageAsync].
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
        fun build(): ExtractListPageAsync =
            ExtractListPageAsync(
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

        return other is ExtractListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ExtractListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
