// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.documents

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudDocumentCreateTest {

    @Test
    fun create() {
        val cloudDocumentCreate =
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

        assertThat(cloudDocumentCreate.metadata())
            .isEqualTo(
                CloudDocumentCreate.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(cloudDocumentCreate.text()).isEqualTo("text")
        assertThat(cloudDocumentCreate.id()).contains("id")
        assertThat(cloudDocumentCreate.excludedEmbedMetadataKeys().getOrNull())
            .containsExactly("string")
        assertThat(cloudDocumentCreate.excludedLlmMetadataKeys().getOrNull())
            .containsExactly("string")
        assertThat(cloudDocumentCreate.pagePositions().getOrNull()).containsExactly(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudDocumentCreate =
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

        val roundtrippedCloudDocumentCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudDocumentCreate),
                jacksonTypeRef<CloudDocumentCreate>(),
            )

        assertThat(roundtrippedCloudDocumentCreate).isEqualTo(cloudDocumentCreate)
    }
}
