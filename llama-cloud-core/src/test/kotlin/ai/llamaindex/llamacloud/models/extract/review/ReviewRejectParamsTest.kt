// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract.review

import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReviewRejectParamsTest {

    @Test
    fun create() {
        ReviewRejectParams.builder()
            .jobId("job_id")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .reason("The invoice total does not match the line items.")
            .revision(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ReviewRejectParams.builder()
                .jobId("job_id")
                .reason("The invoice total does not match the line items.")
                .revision(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ReviewRejectParams.builder()
                .jobId("job_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason("The invoice total does not match the line items.")
                .revision(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ReviewRejectParams.builder()
                .jobId("job_id")
                .reason("The invoice total does not match the line items.")
                .revision(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ReviewRejectParams.builder()
                .jobId("job_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reason("The invoice total does not match the line items.")
                .revision(0L)
                .build()

        val body = params._body()

        assertThat(body.reason()).isEqualTo("The invoice total does not match the line items.")
        assertThat(body.revision()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReviewRejectParams.builder()
                .jobId("job_id")
                .reason("The invoice total does not match the line items.")
                .revision(0L)
                .build()

        val body = params._body()

        assertThat(body.reason()).isEqualTo("The invoice total does not match the line items.")
        assertThat(body.revision()).isEqualTo(0L)
    }
}
