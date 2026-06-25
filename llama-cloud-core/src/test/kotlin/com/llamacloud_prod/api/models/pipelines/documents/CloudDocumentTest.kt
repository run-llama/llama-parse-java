// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudDocumentTest {

    @Test
    fun create() {
        val cloudDocument =
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

        assertThat(cloudDocument.id()).isEqualTo("id")
        assertThat(cloudDocument.metadata())
            .isEqualTo(
                CloudDocument.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(cloudDocument.text()).isEqualTo("text")
        assertThat(cloudDocument.excludedEmbedMetadataKeys().getOrNull()).containsExactly("string")
        assertThat(cloudDocument.excludedLlmMetadataKeys().getOrNull()).containsExactly("string")
        assertThat(cloudDocument.pagePositions().getOrNull()).containsExactly(0L)
        assertThat(cloudDocument.statusMetadata())
            .contains(
                CloudDocument.StatusMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudDocument =
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

        val roundtrippedCloudDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudDocument),
                jacksonTypeRef<CloudDocument>(),
            )

        assertThat(roundtrippedCloudDocument).isEqualTo(cloudDocument)
    }
}
