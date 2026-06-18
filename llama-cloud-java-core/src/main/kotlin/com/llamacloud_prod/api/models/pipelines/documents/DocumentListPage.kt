// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.documents

import com.llamacloud_prod.api.core.AutoPager
import com.llamacloud_prod.api.core.Page
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.services.blocking.pipelines.DocumentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DocumentService.list */
@Deprecated("deprecated")
class DocumentListPage
private constructor(
    private val service: DocumentService,
    private val params: DocumentListParams,
    private val response: DocumentListPageResponse,
) : Page<CloudDocument> {

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

    override fun nextPage(): DocumentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CloudDocument> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DocumentListParams = params

    /** The response that this page was parsed from. */
    fun response(): DocumentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentListPage].
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

    /** A builder for [DocumentListPage]. */
    class Builder internal constructor() {

        private var service: DocumentService? = null
        private var params: DocumentListParams? = null
        private var response: DocumentListPageResponse? = null

        @JvmSynthetic
        internal fun from(documentListPage: DocumentListPage) = apply {
            service = documentListPage.service
            params = documentListPage.params
            response = documentListPage.response
        }

        fun service(service: DocumentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DocumentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DocumentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DocumentListPage].
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
        fun build(): DocumentListPage =
            DocumentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DocumentListPage{service=$service, params=$params, response=$response}"
}
