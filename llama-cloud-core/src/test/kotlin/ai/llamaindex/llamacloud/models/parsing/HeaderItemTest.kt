// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HeaderItemTest {

    @Test
    fun create() {
        val headerItem =
            HeaderItem.builder()
                .addItem(
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
                )
                .md("md")
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
                .type(HeaderItem.Type.HEADER)
                .build()

        assertThat(headerItem.items())
            .containsExactly(
                HeaderItem.Item.ofCode(
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
                )
            )
        assertThat(headerItem.md()).isEqualTo("md")
        assertThat(headerItem.bbox().getOrNull())
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
        assertThat(headerItem.type()).contains(HeaderItem.Type.HEADER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val headerItem =
            HeaderItem.builder()
                .addItem(
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
                )
                .md("md")
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
                .type(HeaderItem.Type.HEADER)
                .build()

        val roundtrippedHeaderItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(headerItem),
                jacksonTypeRef<HeaderItem>(),
            )

        assertThat(roundtrippedHeaderItem).isEqualTo(headerItem)
    }
}
