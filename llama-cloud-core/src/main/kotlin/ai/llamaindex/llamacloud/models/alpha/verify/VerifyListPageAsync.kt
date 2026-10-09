// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.alpha.verify

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.alpha.VerifyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see VerifyServiceAsync.list */
class VerifyListPageAsync
private constructor(
    private val service: VerifyServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VerifyListParams,
    private val response: VerifyListPageResponse,
) : PageAsync<VerifyListResponse> {

    /**
     * Delegates to [VerifyListPageResponse], but gracefully handles missing data.
     *
     * @see VerifyListPageResponse.items
     */
    override fun items(): List<VerifyListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [VerifyListPageResponse], but gracefully handles missing data.
     *
     * @see VerifyListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): VerifyListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<VerifyListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VerifyListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VerifyListParams = params

    /** The response that this page was parsed from. */
    fun response(): VerifyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VerifyListPageAsync].
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

    /** A builder for [VerifyListPageAsync]. */
    class Builder internal constructor() {

        private var service: VerifyServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VerifyListParams? = null
        private var response: VerifyListPageResponse? = null

        @JvmSynthetic
        internal fun from(verifyListPageAsync: VerifyListPageAsync) = apply {
            service = verifyListPageAsync.service
            streamHandlerExecutor = verifyListPageAsync.streamHandlerExecutor
            params = verifyListPageAsync.params
            response = verifyListPageAsync.response
        }

        fun service(service: VerifyServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VerifyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VerifyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VerifyListPageAsync].
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
        fun build(): VerifyListPageAsync =
            VerifyListPageAsync(
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

        return other is VerifyListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "VerifyListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
