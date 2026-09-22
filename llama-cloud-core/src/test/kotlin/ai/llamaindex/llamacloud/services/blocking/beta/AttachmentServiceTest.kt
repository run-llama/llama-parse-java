// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentGetParams
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AttachmentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val attachmentService = client.beta().attachments()

        val page =
            attachmentService.list(AttachmentListParams.builder().sourceId("source_id").build())

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val attachmentService = client.beta().attachments()

        val presignedUrl =
            attachmentService.get(
                AttachmentGetParams.builder()
                    .attachmentName("attachment_name")
                    .sourceId("source_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        presignedUrl.validate()
    }
}
