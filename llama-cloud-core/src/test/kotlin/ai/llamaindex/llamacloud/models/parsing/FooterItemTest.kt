// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FooterItemTest {

    @Test
    fun create() {
        val footerItem =
            FooterItem.builder()
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
                .type(FooterItem.Type.FOOTER)
                .build()

        assertThat(footerItem.items())
            .containsExactly(
                FooterItem.Item.ofCode(
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
        assertThat(footerItem.md()).isEqualTo("md")
        assertThat(footerItem.bbox().getOrNull())
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
        assertThat(footerItem.type()).contains(FooterItem.Type.FOOTER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val footerItem =
            FooterItem.builder()
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
                .type(FooterItem.Type.FOOTER)
                .build()

        val roundtrippedFooterItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(footerItem),
                jacksonTypeRef<FooterItem>(),
            )

        assertThat(roundtrippedFooterItem).isEqualTo(footerItem)
    }
}
