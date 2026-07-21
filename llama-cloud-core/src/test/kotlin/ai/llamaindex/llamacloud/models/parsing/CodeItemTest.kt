// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CodeItemTest {

    @Test
    fun create() {
        val codeItem =
            CodeItem.builder()
                .md("md")
                .value("value")
                .addBbox(
                    BBox.builder()
                        .h(0.0)
                        .w(0.0)
                        .x(0.0)
                        .y(0.0)
                        .confidence(0.0)
                        .endIndex(0L)
                        .label("label")
                        .r(0.0)
                        .startIndex(0L)
                        .build()
                )
                .language("language")
                .type(CodeItem.Type.CODE)
                .build()

        assertThat(codeItem.md()).isEqualTo("md")
        assertThat(codeItem.value()).isEqualTo("value")
        assertThat(codeItem.bbox().getOrNull())
            .containsExactly(
                BBox.builder()
                    .h(0.0)
                    .w(0.0)
                    .x(0.0)
                    .y(0.0)
                    .confidence(0.0)
                    .endIndex(0L)
                    .label("label")
                    .r(0.0)
                    .startIndex(0L)
                    .build()
            )
        assertThat(codeItem.language()).contains("language")
        assertThat(codeItem.type()).contains(CodeItem.Type.CODE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val codeItem =
            CodeItem.builder()
                .md("md")
                .value("value")
                .addBbox(
                    BBox.builder()
                        .h(0.0)
                        .w(0.0)
                        .x(0.0)
                        .y(0.0)
                        .confidence(0.0)
                        .endIndex(0L)
                        .label("label")
                        .r(0.0)
                        .startIndex(0L)
                        .build()
                )
                .language("language")
                .type(CodeItem.Type.CODE)
                .build()

        val roundtrippedCodeItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(codeItem),
                jacksonTypeRef<CodeItem>(),
            )

        assertThat(roundtrippedCodeItem).isEqualTo(codeItem)
    }
}
