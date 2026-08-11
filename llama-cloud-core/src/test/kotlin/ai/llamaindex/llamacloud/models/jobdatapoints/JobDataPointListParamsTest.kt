// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.jobdatapoints

import ai.llamaindex.llamacloud.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobDataPointListParamsTest {

    @Test
    fun create() {
        JobDataPointListParams.builder()
            .jobType(JobDataPointListParams.JobType.PARSE)
            .createdAtOnOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtOnOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .hours(24L)
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(100L)
            .pageToken("page_token")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addStatus("completed")
            .addStatus("failed")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            JobDataPointListParams.builder()
                .jobType(JobDataPointListParams.JobType.PARSE)
                .createdAtOnOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtOnOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .hours(24L)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(100L)
                .pageToken("page_token")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addStatus("completed")
                .addStatus("failed")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("job_type", "parse")
                    .put("created_at_on_or_after", "2019-12-27T18:11:19.117Z")
                    .put("created_at_on_or_before", "2019-12-27T18:11:19.117Z")
                    .put("hours", "24")
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page_size", "100")
                    .put("page_token", "page_token")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("status", "completed")
                    .put("status", "failed")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            JobDataPointListParams.builder().jobType(JobDataPointListParams.JobType.PARSE).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("job_type", "parse").build())
    }
}
