// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractV2JobTest {

    @Test
    fun create() {
        val extractV2Job =
            ExtractV2Job.builder()
                .id("ext-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .status("COMPLETED")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .configuration(
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
                )
                .configurationId("cfg-11111111-2222-3333-4444-555555555555")
                .errorMessage("error_message")
                .extractMetadata(
                    ExtractJobMetadata.builder()
                        .fieldMetadata(
                            ExtractedFieldMetadata.builder()
                                .documentMetadata(
                                    ExtractedFieldMetadata.DocumentMetadata.builder()
                                        .putAdditionalProperty(
                                            "items",
                                            JsonValue.from(
                                                listOf(
                                                    mapOf(
                                                        "amount" to
                                                            mapOf(
                                                                "citation" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "matching_text" to
                                                                                "\$10.00",
                                                                            "page" to 1,
                                                                        )
                                                                    ),
                                                                "confidence" to 1,
                                                            ),
                                                        "description" to
                                                            mapOf(
                                                                "citation" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "matching_text" to
                                                                                "\$10/month",
                                                                            "page" to 1,
                                                                        )
                                                                    ),
                                                                "confidence" to 0.998,
                                                            ),
                                                    )
                                                )
                                            ),
                                        )
                                        .putAdditionalProperty(
                                            "total",
                                            JsonValue.from(
                                                mapOf("citation" to "bar", "confidence" to "bar")
                                            ),
                                        )
                                        .putAdditionalProperty(
                                            "vendor",
                                            JsonValue.from(
                                                mapOf(
                                                    "citation" to "bar",
                                                    "confidence" to "bar",
                                                    "extraction_confidence" to "bar",
                                                    "parsing_confidence" to "bar",
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .addPageMetadata(
                                    ExtractedFieldMetadata.PageMetadata.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
                                        .build()
                                )
                                .addRowMetadata(
                                    ExtractedFieldMetadata.RowMetadata.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .parseJobId("parse_job_id")
                        .parseTier("parse_tier")
                        .build()
                )
                .extractResult(
                    ExtractV2Job.ExtractResult.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .metadata(
                    ExtractV2Job.Metadata.builder()
                        .usage(ExtractJobUsage.builder().numPagesExtracted(0L).build())
                        .build()
                )
                .build()

        assertThat(extractV2Job.id()).isEqualTo("ext-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(extractV2Job.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(extractV2Job.fileInput()).isEqualTo("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(extractV2Job.projectId()).isEqualTo("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(extractV2Job.status()).isEqualTo("COMPLETED")
        assertThat(extractV2Job.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(extractV2Job.configuration())
            .contains(
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
            )
        assertThat(extractV2Job.configurationId())
            .contains("cfg-11111111-2222-3333-4444-555555555555")
        assertThat(extractV2Job.errorMessage()).contains("error_message")
        assertThat(extractV2Job.extractMetadata())
            .contains(
                ExtractJobMetadata.builder()
                    .fieldMetadata(
                        ExtractedFieldMetadata.builder()
                            .documentMetadata(
                                ExtractedFieldMetadata.DocumentMetadata.builder()
                                    .putAdditionalProperty(
                                        "items",
                                        JsonValue.from(
                                            listOf(
                                                mapOf(
                                                    "amount" to
                                                        mapOf(
                                                            "citation" to
                                                                listOf(
                                                                    mapOf(
                                                                        "matching_text" to
                                                                            "\$10.00",
                                                                        "page" to 1,
                                                                    )
                                                                ),
                                                            "confidence" to 1,
                                                        ),
                                                    "description" to
                                                        mapOf(
                                                            "citation" to
                                                                listOf(
                                                                    mapOf(
                                                                        "matching_text" to
                                                                            "\$10/month",
                                                                        "page" to 1,
                                                                    )
                                                                ),
                                                            "confidence" to 0.998,
                                                        ),
                                                )
                                            )
                                        ),
                                    )
                                    .putAdditionalProperty(
                                        "total",
                                        JsonValue.from(
                                            mapOf("citation" to "bar", "confidence" to "bar")
                                        ),
                                    )
                                    .putAdditionalProperty(
                                        "vendor",
                                        JsonValue.from(
                                            mapOf(
                                                "citation" to "bar",
                                                "confidence" to "bar",
                                                "extraction_confidence" to "bar",
                                                "parsing_confidence" to "bar",
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .addPageMetadata(
                                ExtractedFieldMetadata.PageMetadata.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .addRowMetadata(
                                ExtractedFieldMetadata.RowMetadata.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .parseJobId("parse_job_id")
                    .parseTier("parse_tier")
                    .build()
            )
        assertThat(extractV2Job.extractResult())
            .contains(
                ExtractV2Job.ExtractResult.ofUnionMember0(
                    ExtractV2Job.ExtractResult.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
            )
        assertThat(extractV2Job.metadata())
            .contains(
                ExtractV2Job.Metadata.builder()
                    .usage(ExtractJobUsage.builder().numPagesExtracted(0L).build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractV2Job =
            ExtractV2Job.builder()
                .id("ext-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fileInput("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .status("COMPLETED")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .configuration(
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
                )
                .configurationId("cfg-11111111-2222-3333-4444-555555555555")
                .errorMessage("error_message")
                .extractMetadata(
                    ExtractJobMetadata.builder()
                        .fieldMetadata(
                            ExtractedFieldMetadata.builder()
                                .documentMetadata(
                                    ExtractedFieldMetadata.DocumentMetadata.builder()
                                        .putAdditionalProperty(
                                            "items",
                                            JsonValue.from(
                                                listOf(
                                                    mapOf(
                                                        "amount" to
                                                            mapOf(
                                                                "citation" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "matching_text" to
                                                                                "\$10.00",
                                                                            "page" to 1,
                                                                        )
                                                                    ),
                                                                "confidence" to 1,
                                                            ),
                                                        "description" to
                                                            mapOf(
                                                                "citation" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "matching_text" to
                                                                                "\$10/month",
                                                                            "page" to 1,
                                                                        )
                                                                    ),
                                                                "confidence" to 0.998,
                                                            ),
                                                    )
                                                )
                                            ),
                                        )
                                        .putAdditionalProperty(
                                            "total",
                                            JsonValue.from(
                                                mapOf("citation" to "bar", "confidence" to "bar")
                                            ),
                                        )
                                        .putAdditionalProperty(
                                            "vendor",
                                            JsonValue.from(
                                                mapOf(
                                                    "citation" to "bar",
                                                    "confidence" to "bar",
                                                    "extraction_confidence" to "bar",
                                                    "parsing_confidence" to "bar",
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .addPageMetadata(
                                    ExtractedFieldMetadata.PageMetadata.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
                                        .build()
                                )
                                .addRowMetadata(
                                    ExtractedFieldMetadata.RowMetadata.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .parseJobId("parse_job_id")
                        .parseTier("parse_tier")
                        .build()
                )
                .extractResult(
                    ExtractV2Job.ExtractResult.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .metadata(
                    ExtractV2Job.Metadata.builder()
                        .usage(ExtractJobUsage.builder().numPagesExtracted(0L).build())
                        .build()
                )
                .build()

        val roundtrippedExtractV2Job =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractV2Job),
                jacksonTypeRef<ExtractV2Job>(),
            )

        assertThat(roundtrippedExtractV2Job).isEqualTo(extractV2Job)
    }
}
