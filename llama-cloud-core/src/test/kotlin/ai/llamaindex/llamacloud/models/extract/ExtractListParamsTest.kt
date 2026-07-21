// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

import ai.llamaindex.llamacloud.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractListParamsTest {

    @Test
    fun create() {
        ExtractListParams.builder()
            .configurationId("cfg-11111111-2222-3333-4444-555555555555")
            .createdAtOnOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtOnOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .documentInputType("document_input_type")
            .documentInputValue("document_input_value")
            .addExpand("string")
            .fileInput("file_input")
            .addJobId("string")
            .addJobId("string")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .pageSize(0L)
            .pageToken("page_token")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(ExtractListParams.Status.CANCELLED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExtractListParams.builder()
                .configurationId("cfg-11111111-2222-3333-4444-555555555555")
                .createdAtOnOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtOnOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .documentInputType("document_input_type")
                .documentInputValue("document_input_value")
                .addExpand("string")
                .fileInput("file_input")
                .addJobId("string")
                .addJobId("string")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .pageSize(0L)
                .pageToken("page_token")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(ExtractListParams.Status.CANCELLED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("configuration_id", "cfg-11111111-2222-3333-4444-555555555555")
                    .put("created_at_on_or_after", "2019-12-27T18:11:19.117Z")
                    .put("created_at_on_or_before", "2019-12-27T18:11:19.117Z")
                    .put("document_input_type", "document_input_type")
                    .put("document_input_value", "document_input_value")
                    .put("expand", "string")
                    .put("file_input", "file_input")
                    .put("job_ids", "string")
                    .put("job_ids", "string")
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page_size", "0")
                    .put("page_token", "page_token")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("status", "CANCELLED")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExtractListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
