// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.extract

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractJobMetadataTest {

    @Test
    fun create() {
        val extractJobMetadata =
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
                                                                    "matching_text" to "\$10.00",
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
                                                                    "matching_text" to "\$10/month",
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
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .addRowMetadata(
                            ExtractedFieldMetadata.RowMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .build()
                )
                .parseJobId("parse_job_id")
                .parseTier("parse_tier")
                .build()

        assertThat(extractJobMetadata.fieldMetadata())
            .contains(
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
                                                                "matching_text" to "\$10.00",
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
                                                                "matching_text" to "\$10/month",
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
                                JsonValue.from(mapOf("citation" to "bar", "confidence" to "bar")),
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
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .addRowMetadata(
                        ExtractedFieldMetadata.RowMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .build()
            )
        assertThat(extractJobMetadata.parseJobId()).contains("parse_job_id")
        assertThat(extractJobMetadata.parseTier()).contains("parse_tier")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractJobMetadata =
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
                                                                    "matching_text" to "\$10.00",
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
                                                                    "matching_text" to "\$10/month",
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
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .addRowMetadata(
                            ExtractedFieldMetadata.RowMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .build()
                )
                .parseJobId("parse_job_id")
                .parseTier("parse_tier")
                .build()

        val roundtrippedExtractJobMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractJobMetadata),
                jacksonTypeRef<ExtractJobMetadata>(),
            )

        assertThat(roundtrippedExtractJobMetadata).isEqualTo(extractJobMetadata)
    }
}
