// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract.review

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReviewChangeFieldsParamsTest {

    @Test
    fun create() {
        ReviewChangeFieldsParams.builder()
            .jobId("job_id")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addChange(
                ReviewChangeFieldsParams.Change.builder()
                    .change(ReviewChangeFieldsParams.Change.InnerChange.CORRECT)
                    .path("/total")
                    .value(JsonValue.from(1250.5))
                    .build()
            )
            .revision(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ReviewChangeFieldsParams.builder()
                .jobId("job_id")
                .addChange(
                    ReviewChangeFieldsParams.Change.builder()
                        .change(ReviewChangeFieldsParams.Change.InnerChange.CORRECT)
                        .path("/total")
                        .build()
                )
                .revision(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ReviewChangeFieldsParams.builder()
                .jobId("job_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addChange(
                    ReviewChangeFieldsParams.Change.builder()
                        .change(ReviewChangeFieldsParams.Change.InnerChange.CORRECT)
                        .path("/total")
                        .value(JsonValue.from(1250.5))
                        .build()
                )
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
            ReviewChangeFieldsParams.builder()
                .jobId("job_id")
                .addChange(
                    ReviewChangeFieldsParams.Change.builder()
                        .change(ReviewChangeFieldsParams.Change.InnerChange.CORRECT)
                        .path("/total")
                        .build()
                )
                .revision(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ReviewChangeFieldsParams.builder()
                .jobId("job_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addChange(
                    ReviewChangeFieldsParams.Change.builder()
                        .change(ReviewChangeFieldsParams.Change.InnerChange.CORRECT)
                        .path("/total")
                        .value(JsonValue.from(1250.5))
                        .build()
                )
                .revision(0L)
                .build()

        val body = params._body()

        assertThat(body.changes())
            .containsExactly(
                ReviewChangeFieldsParams.Change.builder()
                    .change(ReviewChangeFieldsParams.Change.InnerChange.CORRECT)
                    .path("/total")
                    .value(JsonValue.from(1250.5))
                    .build()
            )
        assertThat(body.revision()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReviewChangeFieldsParams.builder()
                .jobId("job_id")
                .addChange(
                    ReviewChangeFieldsParams.Change.builder()
                        .change(ReviewChangeFieldsParams.Change.InnerChange.CORRECT)
                        .path("/total")
                        .build()
                )
                .revision(0L)
                .build()

        val body = params._body()

        assertThat(body.changes())
            .containsExactly(
                ReviewChangeFieldsParams.Change.builder()
                    .change(ReviewChangeFieldsParams.Change.InnerChange.CORRECT)
                    .path("/total")
                    .build()
            )
        assertThat(body.revision()).isEqualTo(0L)
    }
}
