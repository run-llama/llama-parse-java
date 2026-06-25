// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.configurations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractV2ParametersTest {

    @Test
    fun create() {
        val extractV2Parameters =
            ExtractV2Parameters.builder()
                .dataSchema(
                    ExtractV2Parameters.DataSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .citeSources(true)
                .confidenceScores(true)
                .extractionTarget(ExtractV2Parameters.ExtractionTarget.PER_DOC)
                .maxPages(10L)
                .parseConfigId("cfg-11111111-2222-3333-4444-555555555555")
                .parseTier("fast")
                .systemPrompt(
                    "Extract all monetary values in USD. If a currency is not specified, assume USD."
                )
                .targetPages("1,3,5-7")
                .tier(ExtractV2Parameters.Tier.COST_EFFECTIVE)
                .version("latest")
                .build()

        assertThat(extractV2Parameters.dataSchema())
            .isEqualTo(
                ExtractV2Parameters.DataSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(extractV2Parameters.citeSources()).contains(true)
        assertThat(extractV2Parameters.confidenceScores()).contains(true)
        assertThat(extractV2Parameters.extractionTarget())
            .contains(ExtractV2Parameters.ExtractionTarget.PER_DOC)
        assertThat(extractV2Parameters.maxPages()).contains(10L)
        assertThat(extractV2Parameters.parseConfigId())
            .contains("cfg-11111111-2222-3333-4444-555555555555")
        assertThat(extractV2Parameters.parseTier()).contains("fast")
        assertThat(extractV2Parameters.systemPrompt())
            .contains(
                "Extract all monetary values in USD. If a currency is not specified, assume USD."
            )
        assertThat(extractV2Parameters.targetPages()).contains("1,3,5-7")
        assertThat(extractV2Parameters.tier()).contains(ExtractV2Parameters.Tier.COST_EFFECTIVE)
        assertThat(extractV2Parameters.version()).contains("latest")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractV2Parameters =
            ExtractV2Parameters.builder()
                .dataSchema(
                    ExtractV2Parameters.DataSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .citeSources(true)
                .confidenceScores(true)
                .extractionTarget(ExtractV2Parameters.ExtractionTarget.PER_DOC)
                .maxPages(10L)
                .parseConfigId("cfg-11111111-2222-3333-4444-555555555555")
                .parseTier("fast")
                .systemPrompt(
                    "Extract all monetary values in USD. If a currency is not specified, assume USD."
                )
                .targetPages("1,3,5-7")
                .tier(ExtractV2Parameters.Tier.COST_EFFECTIVE)
                .version("latest")
                .build()

        val roundtrippedExtractV2Parameters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractV2Parameters),
                jacksonTypeRef<ExtractV2Parameters>(),
            )

        assertThat(roundtrippedExtractV2Parameters).isEqualTo(extractV2Parameters)
    }
}
