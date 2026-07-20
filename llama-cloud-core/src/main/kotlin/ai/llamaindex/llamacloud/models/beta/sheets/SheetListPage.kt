// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.sheets

import ai.llamaindex.llamacloud.core.AutoPager
import ai.llamaindex.llamacloud.core.Page
import ai.llamaindex.llamacloud.core.checkRequired
import ai.llamaindex.llamacloud.services.blocking.beta.SheetService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SheetService.list */
@Deprecated("deprecated")
class SheetListPage
private constructor(
    private val service: SheetService,
    private val params: SheetListParams,
    private val response: SheetListPageResponse,
) : Page<SheetsJob> {

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

    override fun nextPage(): SheetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SheetsJob> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SheetListParams = params

    /** The response that this page was parsed from. */
    fun response(): SheetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SheetListPage].
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

    /** A builder for [SheetListPage]. */
    class Builder internal constructor() {

        private var service: SheetService? = null
        private var params: SheetListParams? = null
        private var response: SheetListPageResponse? = null

        @JvmSynthetic
        internal fun from(sheetListPage: SheetListPage) = apply {
            service = sheetListPage.service
            params = sheetListPage.params
            response = sheetListPage.response
        }

        fun service(service: SheetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SheetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SheetListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SheetListPage].
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
        fun build(): SheetListPage =
            SheetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SheetListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "SheetListPage{service=$service, params=$params, response=$response}"
}
