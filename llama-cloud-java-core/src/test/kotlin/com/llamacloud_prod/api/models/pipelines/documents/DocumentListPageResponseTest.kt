// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListPageResponseTest {

    @Test
    fun create() {
        val documentListPageResponse =
            DocumentListPageResponse.builder()
                .addDocument(
                    CloudDocument.builder()
                        .id("id")
                        .metadata(
                            CloudDocument.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .text("text")
                        .addExcludedEmbedMetadataKey("string")
                        .addExcludedLlmMetadataKey("string")
                        .addPagePosition(0L)
                        .statusMetadata(
                            CloudDocument.StatusMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .limit(0L)
                .offset(0L)
                .totalCount(0L)
                .build()

        assertThat(documentListPageResponse.documents())
            .containsExactly(
                CloudDocument.builder()
                    .id("id")
                    .metadata(
                        CloudDocument.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .text("text")
                    .addExcludedEmbedMetadataKey("string")
                    .addExcludedLlmMetadataKey("string")
                    .addPagePosition(0L)
                    .statusMetadata(
                        CloudDocument.StatusMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(documentListPageResponse.limit()).isEqualTo(0L)
        assertThat(documentListPageResponse.offset()).isEqualTo(0L)
        assertThat(documentListPageResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentListPageResponse =
            DocumentListPageResponse.builder()
                .addDocument(
                    CloudDocument.builder()
                        .id("id")
                        .metadata(
                            CloudDocument.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .text("text")
                        .addExcludedEmbedMetadataKey("string")
                        .addExcludedLlmMetadataKey("string")
                        .addPagePosition(0L)
                        .statusMetadata(
                            CloudDocument.StatusMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .limit(0L)
                .offset(0L)
                .totalCount(0L)
                .build()

        val roundtrippedDocumentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentListPageResponse),
                jacksonTypeRef<DocumentListPageResponse>(),
            )

        assertThat(roundtrippedDocumentListPageResponse).isEqualTo(documentListPageResponse)
    }
}
