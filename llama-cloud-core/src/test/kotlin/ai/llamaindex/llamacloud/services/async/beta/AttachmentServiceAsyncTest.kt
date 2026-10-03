// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.beta

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentGetParams
import ai.llamaindex.llamacloud.models.beta.attachments.AttachmentListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AttachmentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val attachmentServiceAsync = client.beta().attachments()

        val pageFuture =
            attachmentServiceAsync.list(
                AttachmentListParams.builder().sourceId("source_id").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val attachmentServiceAsync = client.beta().attachments()

        val presignedUrlFuture =
            attachmentServiceAsync.get(
                AttachmentGetParams.builder()
                    .attachmentName("attachment_name")
                    .sourceId("source_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val presignedUrl = presignedUrlFuture.get()
        presignedUrl.validate()
    }
}
