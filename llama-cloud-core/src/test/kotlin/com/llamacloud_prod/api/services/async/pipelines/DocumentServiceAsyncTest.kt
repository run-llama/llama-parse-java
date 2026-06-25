// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.pipelines

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClientAsync
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.models.pipelines.documents.CloudDocumentCreate
import com.llamacloud_prod.api.models.pipelines.documents.DocumentCreateParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentDeleteParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentGetChunksParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentGetParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentGetStatusParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentSyncParams
import com.llamacloud_prod.api.models.pipelines.documents.DocumentUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DocumentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.pipelines().documents()

        val cloudDocumentsFuture =
            documentServiceAsync.create(
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

        val cloudDocuments = cloudDocumentsFuture.get()
        cloudDocuments.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.pipelines().documents()

        val pageFuture = documentServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.pipelines().documents()

        val future =
            documentServiceAsync.delete(
                DocumentDeleteParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentId("document_id")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.pipelines().documents()

        val cloudDocumentFuture =
            documentServiceAsync.get(
                DocumentGetParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentId("document_id")
                    .build()
            )

        val cloudDocument = cloudDocumentFuture.get()
        cloudDocument.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getChunks() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.pipelines().documents()

        val textNodesFuture =
            documentServiceAsync.getChunks(
                DocumentGetChunksParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentId("document_id")
                    .build()
            )

        val textNodes = textNodesFuture.get()
        textNodes.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.pipelines().documents()

        val managedIngestionStatusResponseFuture =
            documentServiceAsync.getStatus(
                DocumentGetStatusParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentId("document_id")
                    .build()
            )

        val managedIngestionStatusResponse = managedIngestionStatusResponseFuture.get()
        managedIngestionStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sync() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.pipelines().documents()

        val responseFuture =
            documentServiceAsync.sync(
                DocumentSyncParams.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentId("document_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val documentServiceAsync = client.pipelines().documents()

        val cloudDocumentsFuture =
            documentServiceAsync.upsert(
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

        val cloudDocuments = cloudDocumentsFuture.get()
        cloudDocuments.forEach { it.validate() }
    }
}
