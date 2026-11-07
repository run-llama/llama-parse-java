// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract.review

import ai.llamaindex.llamacloud.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReviewCreateParamsTest {

    @Test
    fun create() {
        ReviewCreateParams.builder()
            .jobId("job_id")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .confidenceThreshold(0.8)
            .addFieldsInScope("/total")
            .addFieldsInScope("/vendor/name")
            .addRequiredField("/vendor/name")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ReviewCreateParams.builder().jobId("job_id").build()

        assertThat(params._pathParam(0)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ReviewCreateParams.builder()
                .jobId("job_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .confidenceThreshold(0.8)
                .addFieldsInScope("/total")
                .addFieldsInScope("/vendor/name")
                .addRequiredField("/vendor/name")
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
        val params = ReviewCreateParams.builder().jobId("job_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ReviewCreateParams.builder()
                .jobId("job_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .confidenceThreshold(0.8)
                .addFieldsInScope("/total")
                .addFieldsInScope("/vendor/name")
                .addRequiredField("/vendor/name")
                .build()

        val body = params._body()

        assertThat(body.confidenceThreshold()).contains(0.8)
        assertThat(body.fieldsInScope().getOrNull()).containsExactly("/total", "/vendor/name")
        assertThat(body.requiredFields().getOrNull()).containsExactly("/vendor/name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ReviewCreateParams.builder().jobId("job_id").build()

        val body = params._body()
    }
}
