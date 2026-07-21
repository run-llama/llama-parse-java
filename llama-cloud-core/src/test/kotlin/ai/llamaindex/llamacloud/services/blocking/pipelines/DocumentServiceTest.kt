// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.pipelines

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.pipelines.documents.CloudDocumentCreate
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentCreateParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentDeleteParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentGetChunksParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentGetParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentGetStatusParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentSyncParams
import ai.llamaindex.llamacloud.models.pipelines.documents.DocumentUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.pipelines().documents()

        val cloudDocuments =
            documentService.create(
                DocumentCreateParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addBody(
                        CloudDocumentCreate.builder()
                            .metadata(
                                CloudDocumentCreate.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .text("text")
                            .id("id")
                            .addExcludedEmbedMetadataKey("string")
                            .addExcludedLlmMetadataKey("string")
                            .addPagePosition(0L)
                            .build()
                    )
                    .build()
            )

        cloudDocuments.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.pipelines().documents()

        val page = documentService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.pipelines().documents()

        documentService.delete(
            DocumentDeleteParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentId("document_id")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.pipelines().documents()

        val cloudDocument =
            documentService.get(
                DocumentGetParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentId("document_id")
                    .build()
            )

        cloudDocument.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getChunks() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.pipelines().documents()

        val textNodes =
            documentService.getChunks(
                DocumentGetChunksParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentId("document_id")
                    .build()
            )

        textNodes.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.pipelines().documents()

        val managedIngestionStatusResponse =
            documentService.getStatus(
                DocumentGetStatusParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentId("document_id")
                    .build()
            )

        managedIngestionStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sync() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.pipelines().documents()

        val response =
            documentService.sync(
                DocumentSyncParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentId("document_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val documentService = client.pipelines().documents()

        val cloudDocuments =
            documentService.upsert(
                DocumentUpsertParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addBody(
                        CloudDocumentCreate.builder()
                            .metadata(
                                CloudDocumentCreate.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .text("text")
                            .id("id")
                            .addExcludedEmbedMetadataKey("string")
                            .addExcludedLlmMetadataKey("string")
                            .addPagePosition(0L)
                            .build()
                    )
                    .build()
            )

        cloudDocuments.forEach { it.validate() }
    }
}
