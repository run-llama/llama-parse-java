// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.sheets

import com.llamacloud_prod.api.core.AutoPagerAsync
import com.llamacloud_prod.api.core.PageAsync
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.async.beta.SheetServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SheetServiceAsync.list */
class SheetListPageAsync
private constructor(
    private val service: SheetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SheetListParams,
    private val response: SheetListPageResponse,
) : PageAsync<SheetsJob> {

    /**
     * Delegates to [SheetListPageResponse], but gracefully handles missing data.
     *
     * @see SheetListPageResponse.items
     */
    override fun items(): List<SheetsJob> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SheetListPageResponse], but gracefully handles missing data.
     *
     * @see SheetListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): SheetListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SheetListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SheetsJob> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SheetListParams = params

    /** The response that this page was parsed from. */
    fun response(): SheetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SheetListPageAsync].
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

    /** A builder for [SheetListPageAsync]. */
    class Builder internal constructor() {

        private var service: SheetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SheetListParams? = null
        private var response: SheetListPageResponse? = null

        @JvmSynthetic
        internal fun from(sheetListPageAsync: SheetListPageAsync) = apply {
            service = sheetListPageAsync.service
            streamHandlerExecutor = sheetListPageAsync.streamHandlerExecutor
            params = sheetListPageAsync.params
            response = sheetListPageAsync.response
        }

        fun service(service: SheetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SheetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SheetListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SheetListPageAsync].
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
        fun build(): SheetListPageAsync =
            SheetListPageAsync(
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

        return other is SheetListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SheetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
