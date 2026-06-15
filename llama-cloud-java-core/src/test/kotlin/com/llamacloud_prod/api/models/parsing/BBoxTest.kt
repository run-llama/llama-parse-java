// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BBoxTest {

    @Test
    fun create() {
        val bBox =
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

        assertThat(bBox.h()).isEqualTo(0.0)
        assertThat(bBox.w()).isEqualTo(0.0)
        assertThat(bBox.x()).isEqualTo(0.0)
        assertThat(bBox.y()).isEqualTo(0.0)
        assertThat(bBox.confidence()).contains(0.0)
        assertThat(bBox.endIndex()).contains(0L)
        assertThat(bBox.label()).contains("label")
        assertThat(bBox.r()).contains(0.0)
        assertThat(bBox.startIndex()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bBox =
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

        val roundtrippedBBox =
            jsonMapper.readValue(jsonMapper.writeValueAsString(bBox), jacksonTypeRef<BBox>())

        assertThat(roundtrippedBBox).isEqualTo(bBox)
    }
}
