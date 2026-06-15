// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.extract

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractJobUsageTest {

    @Test
    fun create() {
        val extractJobUsage = ExtractJobUsage.builder().numPagesExtracted(0L).build()

        assertThat(extractJobUsage.numPagesExtracted()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractJobUsage = ExtractJobUsage.builder().numPagesExtracted(0L).build()

        val roundtrippedExtractJobUsage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractJobUsage),
                jacksonTypeRef<ExtractJobUsage>(),
            )

        assertThat(roundtrippedExtractJobUsage).isEqualTo(extractJobUsage)
    }
}
