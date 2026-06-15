// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdvancedModeTransformConfigTest {

    @Test
    fun create() {
        val advancedModeTransformConfig =
            AdvancedModeTransformConfig.builder()
                .chunkingConfig(
                    AdvancedModeTransformConfig.ChunkingConfig.NoneChunkingConfig.builder()
                        .mode(
                            AdvancedModeTransformConfig.ChunkingConfig.NoneChunkingConfig.Mode.NONE
                        )
                        .build()
                )
                .mode(AdvancedModeTransformConfig.Mode.ADVANCED)
                .segmentationConfig(
                    AdvancedModeTransformConfig.SegmentationConfig.NoneSegmentationConfig.builder()
                        .mode(
                            AdvancedModeTransformConfig.SegmentationConfig.NoneSegmentationConfig
                                .Mode
                                .NONE
                        )
                        .build()
                )
                .build()

        assertThat(advancedModeTransformConfig.chunkingConfig())
            .contains(
                AdvancedModeTransformConfig.ChunkingConfig.ofNone(
                    AdvancedModeTransformConfig.ChunkingConfig.NoneChunkingConfig.builder()
                        .mode(
                            AdvancedModeTransformConfig.ChunkingConfig.NoneChunkingConfig.Mode.NONE
                        )
                        .build()
                )
            )
        assertThat(advancedModeTransformConfig.mode())
            .contains(AdvancedModeTransformConfig.Mode.ADVANCED)
        assertThat(advancedModeTransformConfig.segmentationConfig())
            .contains(
                AdvancedModeTransformConfig.SegmentationConfig.ofNone(
                    AdvancedModeTransformConfig.SegmentationConfig.NoneSegmentationConfig.builder()
                        .mode(
                            AdvancedModeTransformConfig.SegmentationConfig.NoneSegmentationConfig
                                .Mode
                                .NONE
                        )
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val advancedModeTransformConfig =
            AdvancedModeTransformConfig.builder()
                .chunkingConfig(
                    AdvancedModeTransformConfig.ChunkingConfig.NoneChunkingConfig.builder()
                        .mode(
                            AdvancedModeTransformConfig.ChunkingConfig.NoneChunkingConfig.Mode.NONE
                        )
                        .build()
                )
                .mode(AdvancedModeTransformConfig.Mode.ADVANCED)
                .segmentationConfig(
                    AdvancedModeTransformConfig.SegmentationConfig.NoneSegmentationConfig.builder()
                        .mode(
                            AdvancedModeTransformConfig.SegmentationConfig.NoneSegmentationConfig
                                .Mode
                                .NONE
                        )
                        .build()
                )
                .build()

        val roundtrippedAdvancedModeTransformConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedModeTransformConfig),
                jacksonTypeRef<AdvancedModeTransformConfig>(),
            )

        assertThat(roundtrippedAdvancedModeTransformConfig).isEqualTo(advancedModeTransformConfig)
    }
}
