// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HeadingItemTest {

    @Test
    fun create() {
        val headingItem =
            HeadingItem.builder()
                .level(0L)
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
                .type(HeadingItem.Type.HEADING)
                .build()

        assertThat(headingItem.level()).isEqualTo(0L)
        assertThat(headingItem.md()).isEqualTo("md")
        assertThat(headingItem.value()).isEqualTo("value")
        assertThat(headingItem.bbox().getOrNull())
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
        assertThat(headingItem.type()).contains(HeadingItem.Type.HEADING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val headingItem =
            HeadingItem.builder()
                .level(0L)
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
                .type(HeadingItem.Type.HEADING)
                .build()

        val roundtrippedHeadingItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(headingItem),
                jacksonTypeRef<HeadingItem>(),
            )

        assertThat(roundtrippedHeadingItem).isEqualTo(headingItem)
    }
}
