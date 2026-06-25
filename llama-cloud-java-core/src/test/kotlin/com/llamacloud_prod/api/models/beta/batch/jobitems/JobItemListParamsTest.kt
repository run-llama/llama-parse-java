// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.batch.jobitems

import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobItemListParamsTest {

    @Test
    fun create() {
        JobItemListParams.builder()
            .jobId("job_id")
            .limit(1L)
            .offset(0L)
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(JobItemListParams.Status.CANCELLED)
            .build()
    }

    @Test
    fun pathParams() {
        val params = JobItemListParams.builder().jobId("job_id").build()

        assertThat(params._pathParam(0)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            JobItemListParams.builder()
                .jobId("job_id")
                .limit(1L)
                .offset(0L)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(JobItemListParams.Status.CANCELLED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
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
        val params = JobItemListParams.builder().jobId("job_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
