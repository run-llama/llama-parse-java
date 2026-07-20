// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.documents

import ai.llamaindex.llamacloud.core.AutoPagerAsync
import ai.llamaindex.llamacloud.core.PageAsync
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.async.pipelines.DocumentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DocumentServiceAsync.list */
@Deprecated("deprecated")
class DocumentListPageAsync
private constructor(
    private val service: DocumentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DocumentListParams,
    private val response: DocumentListPageResponse,
) : PageAsync<CloudDocument> {

    /**
     * Delegates to [DocumentListPageResponse], but gracefully handles missing data.
     *
     * @see DocumentListPageResponse.documents
     */
    fun documents(): List<CloudDocument> =
        response._documents().getOptional("documents").getOrNull() ?: emptyList()

    /**
     * Delegates to [DocumentListPageResponse], but gracefully handles missing data.
     *
     * @see DocumentListPageResponse.totalCount
     */
    fun totalCount(): Optional<Long> = response._totalCount().getOptional("total_count")

    /**
     * Delegates to [DocumentListPageResponse], but gracefully handles missing data.
     *
     * @see DocumentListPageResponse.offset
     */
    fun offset(): Optional<Long> = response._offset().getOptional("offset")

    override fun items(): List<CloudDocument> = documents()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val offset = offset().getOrDefault(0)
        val totalCount = totalCount().getOrNull()
        return totalCount == null || offset + items().size < totalCount
    }

    fun nextPageParams(): DocumentListParams {
        val offset = offset().getOrDefault(0)
        return params.toBuilder().skip(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DocumentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CloudDocument> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DocumentListParams = params

    /** The response that this page was parsed from. */
    fun response(): DocumentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentListPageAsync].
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

    /** A builder for [DocumentListPageAsync]. */
    class Builder internal constructor() {

        private var service: DocumentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DocumentListParams? = null
        private var response: DocumentListPageResponse? = null

        @JvmSynthetic
        internal fun from(documentListPageAsync: DocumentListPageAsync) = apply {
            service = documentListPageAsync.service
            streamHandlerExecutor = documentListPageAsync.streamHandlerExecutor
            params = documentListPageAsync.params
            response = documentListPageAsync.response
        }

        fun service(service: DocumentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DocumentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DocumentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DocumentListPageAsync].
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
        fun build(): DocumentListPageAsync =
            DocumentListPageAsync(
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

        return other is DocumentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DocumentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
