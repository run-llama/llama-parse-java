// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.attachments

import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachmentGetParamsTest {

    @Test
    fun create() {
        AttachmentGetParams.builder()
            .attachmentName("attachment_name")
            .sourceId("source_id")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AttachmentGetParams.builder()
                .attachmentName("attachment_name")
                .sourceId("source_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("attachment_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AttachmentGetParams.builder()
                .attachmentName("attachment_name")
                .sourceId("source_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("source_id", "source_id")
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AttachmentGetParams.builder()
                .attachmentName("attachment_name")
                .sourceId("source_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("source_id", "source_id").build())
    }
}
