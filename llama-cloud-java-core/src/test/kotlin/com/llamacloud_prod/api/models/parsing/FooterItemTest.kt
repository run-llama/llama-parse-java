// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FooterItemTest {

    @Test
    fun create() {
        val footerItem =
            FooterItem.builder()
                .addItem(
                    TextItem.builder()
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
                        .type(TextItem.Type.TEXT)
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
                FooterItem.Item.ofText(
                    TextItem.builder()
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
                        .type(TextItem.Type.TEXT)
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
                    TextItem.builder()
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
                        .type(TextItem.Type.TEXT)
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
