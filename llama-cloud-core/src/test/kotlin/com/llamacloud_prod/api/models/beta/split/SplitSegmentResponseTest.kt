// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.split

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitSegmentResponseTest {

    @Test
    fun create() {
        val splitSegmentResponse =
            SplitSegmentResponse.builder()
                .category("category")
                .confidenceCategory("confidence_category")
                .addPage(0L)
                .build()

        assertThat(splitSegmentResponse.category()).isEqualTo("category")
        assertThat(splitSegmentResponse.confidenceCategory()).isEqualTo("confidence_category")
        assertThat(splitSegmentResponse.pages()).containsExactly(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitSegmentResponse =
            SplitSegmentResponse.builder()
                .category("category")
                .confidenceCategory("confidence_category")
                .addPage(0L)
                .build()

        val roundtrippedSplitSegmentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitSegmentResponse),
                jacksonTypeRef<SplitSegmentResponse>(),
            )

        assertThat(roundtrippedSplitSegmentResponse).isEqualTo(splitSegmentResponse)
    }
}
