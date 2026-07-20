// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.batch

import ai.llamaindex.llamacloud.core.http.Headers
import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCancelParamsTest {

    @Test
    fun create() {
        BatchCancelParams.builder()
            .jobId("job_id")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .temporalNamespace("temporal-namespace")
            .reason("reason")
            .build()
    }

    @Test
    fun pathParams() {
        val params = BatchCancelParams.builder().jobId("job_id").build()

        assertThat(params._pathParam(0)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            BatchCancelParams.builder()
                .jobId("job_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .temporalNamespace("temporal-namespace")
                .reason("reason")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("temporal-namespace", "temporal-namespace").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = BatchCancelParams.builder().jobId("job_id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            BatchCancelParams.builder()
                .jobId("job_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .temporalNamespace("temporal-namespace")
                .reason("reason")
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
        val params = BatchCancelParams.builder().jobId("job_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            BatchCancelParams.builder()
                .jobId("job_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .temporalNamespace("temporal-namespace")
                .reason("reason")
                .build()

        val body = params._body()

        assertThat(body.reason()).contains("reason")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BatchCancelParams.builder().jobId("job_id").build()

        val body = params._body()
    }
}
