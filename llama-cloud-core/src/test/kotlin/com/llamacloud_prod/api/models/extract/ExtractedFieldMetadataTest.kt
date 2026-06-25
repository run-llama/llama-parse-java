// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.extract

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractedFieldMetadataTest {

    @Test
    fun create() {
        val extractedFieldMetadata =
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

        assertThat(extractedFieldMetadata.documentMetadata())
            .contains(
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
                                                    mapOf("matching_text" to "\$10.00", "page" to 1)
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
        assertThat(extractedFieldMetadata.pageMetadata().getOrNull())
            .containsExactly(
                ExtractedFieldMetadata.PageMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(extractedFieldMetadata.rowMetadata().getOrNull())
            .containsExactly(
                ExtractedFieldMetadata.RowMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractedFieldMetadata =
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

        val roundtrippedExtractedFieldMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractedFieldMetadata),
                jacksonTypeRef<ExtractedFieldMetadata>(),
            )

        assertThat(roundtrippedExtractedFieldMetadata).isEqualTo(extractedFieldMetadata)
    }
}
