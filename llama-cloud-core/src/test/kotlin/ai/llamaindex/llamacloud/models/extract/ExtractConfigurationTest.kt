// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractConfigurationTest {

    @Test
    fun create() {
        val extractConfiguration =
            ExtractConfiguration.builder()
                .dataSchema(
                    ExtractConfiguration.DataSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .citeSources(true)
                .confidenceScores(true)
                .extractionTarget(ExtractConfiguration.ExtractionTarget.PER_DOC)
                .maxPages(10L)
                .parseConfigId("cfg-11111111-2222-3333-4444-555555555555")
                .parseTier("fast")
                .systemPrompt(
                    "Extract all monetary values in USD. If a currency is not specified, assume USD."
                )
                .targetPages("1,3,5-7")
                .tier(ExtractConfiguration.Tier.COST_EFFECTIVE)
                .version("latest")
                .build()

        assertThat(extractConfiguration.dataSchema())
            .isEqualTo(
                ExtractConfiguration.DataSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(extractConfiguration.citeSources()).contains(true)
        assertThat(extractConfiguration.confidenceScores()).contains(true)
        assertThat(extractConfiguration.extractionTarget())
            .contains(ExtractConfiguration.ExtractionTarget.PER_DOC)
        assertThat(extractConfiguration.maxPages()).contains(10L)
        assertThat(extractConfiguration.parseConfigId())
            .contains("cfg-11111111-2222-3333-4444-555555555555")
        assertThat(extractConfiguration.parseTier()).contains("fast")
        assertThat(extractConfiguration.systemPrompt())
            .contains(
                "Extract all monetary values in USD. If a currency is not specified, assume USD."
            )
        assertThat(extractConfiguration.targetPages()).contains("1,3,5-7")
        assertThat(extractConfiguration.tier()).contains(ExtractConfiguration.Tier.COST_EFFECTIVE)
        assertThat(extractConfiguration.version()).contains("latest")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractConfiguration =
            ExtractConfiguration.builder()
                .dataSchema(
                    ExtractConfiguration.DataSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .citeSources(true)
                .confidenceScores(true)
                .extractionTarget(ExtractConfiguration.ExtractionTarget.PER_DOC)
                .maxPages(10L)
                .parseConfigId("cfg-11111111-2222-3333-4444-555555555555")
                .parseTier("fast")
                .systemPrompt(
                    "Extract all monetary values in USD. If a currency is not specified, assume USD."
                )
                .targetPages("1,3,5-7")
                .tier(ExtractConfiguration.Tier.COST_EFFECTIVE)
                .version("latest")
                .build()

        val roundtrippedExtractConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractConfiguration),
                jacksonTypeRef<ExtractConfiguration>(),
            )

        assertThat(roundtrippedExtractConfiguration).isEqualTo(extractConfiguration)
    }
}
