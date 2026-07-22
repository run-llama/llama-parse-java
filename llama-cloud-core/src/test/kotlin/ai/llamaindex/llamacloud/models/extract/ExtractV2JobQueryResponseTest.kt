// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractV2JobQueryResponseTest {

    @Test
    fun create() {
        val extractV2JobQueryResponse =
            ExtractV2JobQueryResponse.builder()
                .addItem(
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
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
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
                                                        mapOf(
                                                            "citation" to "bar",
                                                            "confidence" to "bar",
                                                        )
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
                                .usage(
                                    ExtractJobUsage.builder()
                                        .numPagesBilled(0L)
                                        .numPagesExtracted(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        assertThat(extractV2JobQueryResponse.items())
            .containsExactly(
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
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
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
                                                    mapOf(
                                                        "citation" to "bar",
                                                        "confidence" to "bar",
                                                    )
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
                            .usage(
                                ExtractJobUsage.builder()
                                    .numPagesBilled(0L)
                                    .numPagesExtracted(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(extractV2JobQueryResponse.nextPageToken()).contains("next_page_token")
        assertThat(extractV2JobQueryResponse.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractV2JobQueryResponse =
            ExtractV2JobQueryResponse.builder()
                .addItem(
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
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
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
                                                        mapOf(
                                                            "citation" to "bar",
                                                            "confidence" to "bar",
                                                        )
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
                                .usage(
                                    ExtractJobUsage.builder()
                                        .numPagesBilled(0L)
                                        .numPagesExtracted(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .nextPageToken("next_page_token")
                .totalSize(0L)
                .build()

        val roundtrippedExtractV2JobQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractV2JobQueryResponse),
                jacksonTypeRef<ExtractV2JobQueryResponse>(),
            )

        assertThat(roundtrippedExtractV2JobQueryResponse).isEqualTo(extractV2JobQueryResponse)
    }
}
