// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.jobdatapoints

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.JobDataPointService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see JobDataPointService.list */
class JobDataPointListPage
private constructor(
    private val service: JobDataPointService,
    private val params: JobDataPointListParams,
    private val response: JobDataPointListPageResponse,
) : Page<JobDataPoint> {

    /**
     * Delegates to [JobDataPointListPageResponse], but gracefully handles missing data.
     *
     * @see JobDataPointListPageResponse.items
     */
    override fun items(): List<JobDataPoint> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [JobDataPointListPageResponse], but gracefully handles missing data.
     *
     * @see JobDataPointListPageResponse.nextPageToken
     */
    fun nextPageToken(): Optional<String> = response._nextPageToken().getOptional("next_page_token")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextPageToken().isPresent

    fun nextPageParams(): JobDataPointListParams {
        val nextCursor =
            nextPageToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().pageToken(nextCursor).build()
    }

    override fun nextPage(): JobDataPointListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<JobDataPoint> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): JobDataPointListParams = params

    /** The response that this page was parsed from. */
    fun response(): JobDataPointListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobDataPointListPage].
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

    /** A builder for [JobDataPointListPage]. */
    class Builder internal constructor() {

        private var service: JobDataPointService? = null
        private var params: JobDataPointListParams? = null
        private var response: JobDataPointListPageResponse? = null

        @JvmSynthetic
        internal fun from(jobDataPointListPage: JobDataPointListPage) = apply {
            service = jobDataPointListPage.service
            params = jobDataPointListPage.params
            response = jobDataPointListPage.response
        }

        fun service(service: JobDataPointService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: JobDataPointListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: JobDataPointListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [JobDataPointListPage].
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
        fun build(): JobDataPointListPage =
            JobDataPointListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobDataPointListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "JobDataPointListPage{service=$service, params=$params, response=$response}"
}
