// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.llamacloud_prod.api.core.AutoPagerAsync
import com.llamacloud_prod.api.core.PageAsync
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.async.ParsingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ParsingServiceAsync.list */
class ParsingListPageAsync
private constructor(
    private val service: ParsingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ParsingListParams,
    private val response: ParsingListPageResponse,
) : PageAsync<ParsingListResponse> {

    /**
     * Delegates to [ParsingListPageResponse], but gracefully handles missing data.
     *
     * @see ParsingListPageResponse.items
     */
    override fun items(): List<ParsingListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ParsingListPageResponse], but gracefully handles missing data.
     *
     * @see ParsingListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): ParsingListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ParsingListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ParsingListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ParsingListParams = params

    /** The response that this page was parsed from. */
    fun response(): ParsingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ParsingListPageAsync].
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

    /** A builder for [ParsingListPageAsync]. */
    class Builder internal constructor() {

        private var service: ParsingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ParsingListParams? = null
        private var response: ParsingListPageResponse? = null

        @JvmSynthetic
        internal fun from(parsingListPageAsync: ParsingListPageAsync) = apply {
            service = parsingListPageAsync.service
            streamHandlerExecutor = parsingListPageAsync.streamHandlerExecutor
            params = parsingListPageAsync.params
            response = parsingListPageAsync.response
        }

        fun service(service: ParsingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ParsingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ParsingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ParsingListPageAsync].
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
        fun build(): ParsingListPageAsync =
            ParsingListPageAsync(
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

        return other is ParsingListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ParsingListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
