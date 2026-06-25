// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.batch

import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchListParamsTest {

    @Test
    fun create() {
        BatchListParams.builder()
            .directoryId("directory_id")
            .jobType(BatchListParams.JobType.CLASSIFY)
            .limit(1L)
            .offset(0L)
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(BatchListParams.Status.CANCELLED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BatchListParams.builder()
                .directoryId("directory_id")
                .jobType(BatchListParams.JobType.CLASSIFY)
                .limit(1L)
                .offset(0L)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(BatchListParams.Status.CANCELLED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("directory_id", "directory_id")
                    .put("job_type", "classify")
                    .put("limit", "1")
                    .put("offset", "0")
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("status", "cancelled")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BatchListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
