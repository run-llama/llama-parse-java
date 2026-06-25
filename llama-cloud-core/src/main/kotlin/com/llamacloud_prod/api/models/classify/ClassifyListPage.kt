// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classify

import com.llamacloud_prod.api.core.AutoPager
import com.llamacloud_prod.api.core.Page
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.blocking.ClassifyService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ClassifyService.list */
class ClassifyListPage
private constructor(
    private val service: ClassifyService,
    private val params: ClassifyListParams,
    private val response: ClassifyListPageResponse,
) : Page<ClassifyListResponse> {

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

    override fun nextPage(): ClassifyListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ClassifyListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ClassifyListParams = params

    /** The response that this page was parsed from. */
    fun response(): ClassifyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ClassifyListPage].
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

    /** A builder for [ClassifyListPage]. */
    class Builder internal constructor() {

        private var service: ClassifyService? = null
        private var params: ClassifyListParams? = null
        private var response: ClassifyListPageResponse? = null

        @JvmSynthetic
        internal fun from(classifyListPage: ClassifyListPage) = apply {
            service = classifyListPage.service
            params = classifyListPage.params
            response = classifyListPage.response
        }

        fun service(service: ClassifyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ClassifyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ClassifyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ClassifyListPage].
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
        fun build(): ClassifyListPage =
            ClassifyListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClassifyListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ClassifyListPage{service=$service, params=$params, response=$response}"
}
