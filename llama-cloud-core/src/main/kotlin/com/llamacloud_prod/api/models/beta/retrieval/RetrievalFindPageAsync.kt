// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.retrieval

import com.llamacloud_prod.api.core.AutoPagerAsync
import com.llamacloud_prod.api.core.PageAsync
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.async.beta.RetrievalServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RetrievalServiceAsync.find */
class RetrievalFindPageAsync
private constructor(
    private val service: RetrievalServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RetrievalFindParams,
    private val response: RetrievalFindPageResponse,
) : PageAsync<RetrievalFindResponse> {

    /**
     * Delegates to [RetrievalFindPageResponse], but gracefully handles missing data.
     *
     * @see RetrievalFindPageResponse.items
     */
    override fun items(): List<RetrievalFindResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [RetrievalFindPageResponse], but gracefully handles missing data.
     *
     * @see RetrievalFindPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): RetrievalFindParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RetrievalFindPageAsync> =
        service.find(nextPageParams())

    fun autoPager(): AutoPagerAsync<RetrievalFindResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RetrievalFindParams = params

    /** The response that this page was parsed from. */
    fun response(): RetrievalFindPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RetrievalFindPageAsync].
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

    /** A builder for [RetrievalFindPageAsync]. */
    class Builder internal constructor() {

        private var service: RetrievalServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RetrievalFindParams? = null
        private var response: RetrievalFindPageResponse? = null

        @JvmSynthetic
        internal fun from(retrievalFindPageAsync: RetrievalFindPageAsync) = apply {
            service = retrievalFindPageAsync.service
            streamHandlerExecutor = retrievalFindPageAsync.streamHandlerExecutor
            params = retrievalFindPageAsync.params
            response = retrievalFindPageAsync.response
        }

        fun service(service: RetrievalServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RetrievalFindParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RetrievalFindPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RetrievalFindPageAsync].
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
        fun build(): RetrievalFindPageAsync =
            RetrievalFindPageAsync(
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

        return other is RetrievalFindPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RetrievalFindPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
