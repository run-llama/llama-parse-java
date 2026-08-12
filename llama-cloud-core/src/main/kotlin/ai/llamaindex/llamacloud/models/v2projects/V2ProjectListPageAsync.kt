// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.v2projects

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.V2ProjectServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see V2ProjectServiceAsync.list */
class V2ProjectListPageAsync
private constructor(
    private val service: V2ProjectServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: V2ProjectListParams,
    private val response: V2ProjectListPageResponse,
) : PageAsync<V2ProjectListResponse> {

    /**
     * Delegates to [V2ProjectListPageResponse], but gracefully handles missing data.
     *
     * @see V2ProjectListPageResponse.items
     */
    override fun items(): List<V2ProjectListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [V2ProjectListPageResponse], but gracefully handles missing data.
     *
     * @see V2ProjectListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): V2ProjectListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<V2ProjectListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<V2ProjectListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): V2ProjectListParams = params

    /** The response that this page was parsed from. */
    fun response(): V2ProjectListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V2ProjectListPageAsync].
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

    /** A builder for [V2ProjectListPageAsync]. */
    class Builder internal constructor() {

        private var service: V2ProjectServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: V2ProjectListParams? = null
        private var response: V2ProjectListPageResponse? = null

        @JvmSynthetic
        internal fun from(v2ProjectListPageAsync: V2ProjectListPageAsync) = apply {
            service = v2ProjectListPageAsync.service
            streamHandlerExecutor = v2ProjectListPageAsync.streamHandlerExecutor
            params = v2ProjectListPageAsync.params
            response = v2ProjectListPageAsync.response
        }

        fun service(service: V2ProjectServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: V2ProjectListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: V2ProjectListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [V2ProjectListPageAsync].
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
        fun build(): V2ProjectListPageAsync =
            V2ProjectListPageAsync(
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

        return other is V2ProjectListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "V2ProjectListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
