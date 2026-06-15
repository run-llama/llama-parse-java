// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LinkItemTest {

    @Test
    fun create() {
        val linkItem =
            LinkItem.builder()
                .md("md")
                .text("text")
                .url("url")
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
                .type(LinkItem.Type.LINK)
                .build()

        assertThat(linkItem.md()).isEqualTo("md")
        assertThat(linkItem.text()).isEqualTo("text")
        assertThat(linkItem.url()).isEqualTo("url")
        assertThat(linkItem.bbox().getOrNull())
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
        assertThat(linkItem.type()).contains(LinkItem.Type.LINK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val linkItem =
            LinkItem.builder()
                .md("md")
                .text("text")
                .url("url")
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
                .type(LinkItem.Type.LINK)
                .build()

        val roundtrippedLinkItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(linkItem),
                jacksonTypeRef<LinkItem>(),
            )

        assertThat(roundtrippedLinkItem).isEqualTo(linkItem)
    }
}
