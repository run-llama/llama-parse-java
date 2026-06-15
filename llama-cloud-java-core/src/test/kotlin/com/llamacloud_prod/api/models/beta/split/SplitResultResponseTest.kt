// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.split

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitResultResponseTest {

    @Test
    fun create() {
        val splitResultResponse =
            SplitResultResponse.builder()
                .addSegment(
                    SplitSegmentResponse.builder()
                        .category("category")
                        .confidenceCategory("confidence_category")
                        .addPage(0L)
                        .build()
                )
                .build()

        assertThat(splitResultResponse.segments())
            .containsExactly(
                SplitSegmentResponse.builder()
                    .category("category")
                    .confidenceCategory("confidence_category")
                    .addPage(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitResultResponse =
            SplitResultResponse.builder()
                .addSegment(
                    SplitSegmentResponse.builder()
                        .category("category")
                        .confidenceCategory("confidence_category")
                        .addPage(0L)
                        .build()
                )
                .build()

        val roundtrippedSplitResultResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitResultResponse),
                jacksonTypeRef<SplitResultResponse>(),
            )

        assertThat(roundtrippedSplitResultResponse).isEqualTo(splitResultResponse)
    }
}
