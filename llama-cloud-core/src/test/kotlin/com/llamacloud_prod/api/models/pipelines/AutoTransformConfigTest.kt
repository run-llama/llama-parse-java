// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutoTransformConfigTest {

    @Test
    fun create() {
        val autoTransformConfig =
            AutoTransformConfig.builder()
                .chunkOverlap(0L)
                .chunkSize(1L)
                .mode(AutoTransformConfig.Mode.AUTO)
                .build()

        assertThat(autoTransformConfig.chunkOverlap()).contains(0L)
        assertThat(autoTransformConfig.chunkSize()).contains(1L)
        assertThat(autoTransformConfig.mode()).contains(AutoTransformConfig.Mode.AUTO)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val autoTransformConfig =
            AutoTransformConfig.builder()
                .chunkOverlap(0L)
                .chunkSize(1L)
                .mode(AutoTransformConfig.Mode.AUTO)
                .build()

        val roundtrippedAutoTransformConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(autoTransformConfig),
                jacksonTypeRef<AutoTransformConfig>(),
            )

        assertThat(roundtrippedAutoTransformConfig).isEqualTo(autoTransformConfig)
    }
}
