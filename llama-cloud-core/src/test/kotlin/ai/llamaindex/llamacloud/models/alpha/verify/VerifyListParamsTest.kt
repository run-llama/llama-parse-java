// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.alpha.verify

import ai.llamaindex.llamacloud.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyListParamsTest {

    @Test
    fun create() {
        VerifyListParams.builder()
            .createdAtOnOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtOnOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addExpand("string")
            .addJobId("string")
            .addJobId("string")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(1L)
            .pageToken("page_token")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(VerifyListParams.Status.CANCELLED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VerifyListParams.builder()
                .createdAtOnOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtOnOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addExpand("string")
                .addJobId("string")
                .addJobId("string")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(1L)
                .pageToken("page_token")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(VerifyListParams.Status.CANCELLED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("created_at_on_or_after", "2019-12-27T18:11:19.117Z")
                    .put("created_at_on_or_before", "2019-12-27T18:11:19.117Z")
                    .put("expand", "string")
                    .put("job_ids", "string")
                    .put("job_ids", "string")
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page_size", "1")
                    .put("page_token", "page_token")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("status", "CANCELLED")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VerifyListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
