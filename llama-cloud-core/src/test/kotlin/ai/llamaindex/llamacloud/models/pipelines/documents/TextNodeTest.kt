// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.documents

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TextNodeTest {

    @Test
    fun create() {
        val textNode =
            TextNode.builder()
                .className("class_name")
                .addEmbedding(0.0)
                .endCharIdx(0L)
                .addExcludedEmbedMetadataKey("string")
                .addExcludedLlmMetadataKey("string")
                .extraInfo(
                    TextNode.ExtraInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .id("id_")
                .metadataSeperator("metadata_seperator")
                .metadataTemplate("metadata_template")
                .mimetype("mimetype")
                .relationships(
                    TextNode.Relationships.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "node_id" to "node_id",
                                    "class_name" to "class_name",
                                    "hash" to "hash",
                                    "metadata" to mapOf("foo" to "bar"),
                                    "node_type" to "1",
                                )
                            ),
                        )
                        .build()
                )
                .startCharIdx(0L)
                .text("text")
                .textTemplate("text_template")
                .build()

        assertThat(textNode.className()).contains("class_name")
        assertThat(textNode.embedding().getOrNull()).containsExactly(0.0)
        assertThat(textNode.endCharIdx()).contains(0L)
        assertThat(textNode.excludedEmbedMetadataKeys().getOrNull()).containsExactly("string")
        assertThat(textNode.excludedLlmMetadataKeys().getOrNull()).containsExactly("string")
        assertThat(textNode.extraInfo())
            .contains(
                TextNode.ExtraInfo.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(textNode.id()).contains("id_")
        assertThat(textNode.metadataSeperator()).contains("metadata_seperator")
        assertThat(textNode.metadataTemplate()).contains("metadata_template")
        assertThat(textNode.mimetype()).contains("mimetype")
        assertThat(textNode.relationships())
            .contains(
                TextNode.Relationships.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "node_id" to "node_id",
                                "class_name" to "class_name",
                                "hash" to "hash",
                                "metadata" to mapOf("foo" to "bar"),
                                "node_type" to "1",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(textNode.startCharIdx()).contains(0L)
        assertThat(textNode.text()).contains("text")
        assertThat(textNode.textTemplate()).contains("text_template")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val textNode =
            TextNode.builder()
                .className("class_name")
                .addEmbedding(0.0)
                .endCharIdx(0L)
                .addExcludedEmbedMetadataKey("string")
                .addExcludedLlmMetadataKey("string")
                .extraInfo(
                    TextNode.ExtraInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .id("id_")
                .metadataSeperator("metadata_seperator")
                .metadataTemplate("metadata_template")
                .mimetype("mimetype")
                .relationships(
                    TextNode.Relationships.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "node_id" to "node_id",
                                    "class_name" to "class_name",
                                    "hash" to "hash",
                                    "metadata" to mapOf("foo" to "bar"),
                                    "node_type" to "1",
                                )
                            ),
                        )
                        .build()
                )
                .startCharIdx(0L)
                .text("text")
                .textTemplate("text_template")
                .build()

        val roundtrippedTextNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(textNode),
                jacksonTypeRef<TextNode>(),
            )

        assertThat(roundtrippedTextNode).isEqualTo(textNode)
    }
}
