// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.split

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitCategoryTest {

    @Test
    fun create() {
        val splitCategory = SplitCategory.builder().name("x").description("x").build()

        assertThat(splitCategory.name()).isEqualTo("x")
        assertThat(splitCategory.description()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitCategory = SplitCategory.builder().name("x").description("x").build()

        val roundtrippedSplitCategory =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitCategory),
                jacksonTypeRef<SplitCategory>(),
            )

        assertThat(roundtrippedSplitCategory).isEqualTo(splitCategory)
    }
}
