// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.sheets

import com.llamacloud_prod.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SheetListParamsTest {

    @Test
    fun create() {
        SheetListParams.builder()
            .configurationId("configuration_id")
            .createdAtOnOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtOnOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .includeResults(true)
            .addJobId("string")
            .addJobId("string")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(0L)
            .pageToken("page_token")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(SheetListParams.Status.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SheetListParams.builder()
                .configurationId("configuration_id")
                .createdAtOnOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtOnOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeResults(true)
                .addJobId("string")
                .addJobId("string")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(0L)
                .pageToken("page_token")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(SheetListParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("configuration_id", "configuration_id")
                    .put("created_at_on_or_after", "2019-12-27T18:11:19.117Z")
                    .put("created_at_on_or_before", "2019-12-27T18:11:19.117Z")
                    .put("include_results", "true")
                    .put("job_ids", "string")
                    .put("job_ids", "string")
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page_size", "0")
                    .put("page_token", "page_token")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("status", "PENDING")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SheetListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
