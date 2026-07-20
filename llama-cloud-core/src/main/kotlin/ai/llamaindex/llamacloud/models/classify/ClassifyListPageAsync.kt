// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.classify

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.ClassifyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ClassifyServiceAsync.list */
class ClassifyListPageAsync
private constructor(
    private val service: ClassifyServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ClassifyListParams,
    private val response: ClassifyListPageResponse,
) : PageAsync<ClassifyListResponse> {

    /**
     * Delegates to [ClassifyListPageResponse], but gracefully handles missing data.
     *
     * @see ClassifyListPageResponse.items
     */
    override fun items(): List<ClassifyListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ClassifyListPageResponse], but gracefully handles missing data.
     *
     * @see ClassifyListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): ClassifyListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ClassifyListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ClassifyListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ClassifyListParams = params

    /** The response that this page was parsed from. */
    fun response(): ClassifyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ClassifyListPageAsync].
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

    /** A builder for [ClassifyListPageAsync]. */
    class Builder internal constructor() {

        private var service: ClassifyServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ClassifyListParams? = null
        private var response: ClassifyListPageResponse? = null

        @JvmSynthetic
        internal fun from(classifyListPageAsync: ClassifyListPageAsync) = apply {
            service = classifyListPageAsync.service
            streamHandlerExecutor = classifyListPageAsync.streamHandlerExecutor
            params = classifyListPageAsync.params
            response = classifyListPageAsync.response
        }

        fun service(service: ClassifyServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ClassifyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ClassifyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ClassifyListPageAsync].
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
        fun build(): ClassifyListPageAsync =
            ClassifyListPageAsync(
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

        return other is ClassifyListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ClassifyListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
