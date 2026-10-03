// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.classifier.jobs

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.classifier.JobService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see JobService.list */
@Deprecated("Please use `client.classify.list()`")
class JobListPage
private constructor(
    private val service: JobService,
    private val params: JobListParams,
    private val response: JobListPageResponse,
) : Page<ClassifyJob> {

    /**
     * Delegates to [JobListPageResponse], but gracefully handles missing data.
     *
     * @see JobListPageResponse.items
     */
    override fun items(): List<ClassifyJob> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [JobListPageResponse], but gracefully handles missing data.
     *
     * @see JobListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): JobListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): JobListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ClassifyJob> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): JobListParams = params

    /** The response that this page was parsed from. */
    fun response(): JobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobListPage].
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

    /** A builder for [JobListPage]. */
    class Builder internal constructor() {

        private var service: JobService? = null
        private var params: JobListParams? = null
        private var response: JobListPageResponse? = null

        @JvmSynthetic
        internal fun from(jobListPage: JobListPage) = apply {
            service = jobListPage.service
            params = jobListPage.params
            response = jobListPage.response
        }

        fun service(service: JobService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: JobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: JobListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [JobListPage].
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
        fun build(): JobListPage =
            JobListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "JobListPage{service=$service, params=$params, response=$response}"
}
