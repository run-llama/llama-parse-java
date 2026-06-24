// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.extract

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractV2SchemaValidateRequestTest {

    @Test
    fun create() {
        val extractV2SchemaValidateRequest =
            ExtractV2SchemaValidateRequest.builder()
                .dataSchema(
                    ExtractV2SchemaValidateRequest.DataSchema.builder()
                        .putAdditionalProperty(
                            "properties",
                            JsonValue.from(
                                mapOf(
                                    "invoice_number" to "bar",
                                    "line_items" to "bar",
                                    "total_amount" to "bar",
                                    "vendor_name" to "bar",
                                )
                            ),
                        )
                        .putAdditionalProperty(
                            "required",
                            JsonValue.from(listOf("invoice_number", "total_amount", "vendor_name")),
                        )
                        .putAdditionalProperty("type", JsonValue.from("object"))
                        .build()
                )
                .build()

        assertThat(extractV2SchemaValidateRequest.dataSchema())
            .isEqualTo(
                ExtractV2SchemaValidateRequest.DataSchema.builder()
                    .putAdditionalProperty(
                        "properties",
                        JsonValue.from(
                            mapOf(
                                "invoice_number" to "bar",
                                "line_items" to "bar",
                                "total_amount" to "bar",
                                "vendor_name" to "bar",
                            )
                        ),
                    )
                    .putAdditionalProperty(
                        "required",
                        JsonValue.from(listOf("invoice_number", "total_amount", "vendor_name")),
                    )
                    .putAdditionalProperty("type", JsonValue.from("object"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractV2SchemaValidateRequest =
            ExtractV2SchemaValidateRequest.builder()
                .dataSchema(
                    ExtractV2SchemaValidateRequest.DataSchema.builder()
                        .putAdditionalProperty(
                            "properties",
                            JsonValue.from(
                                mapOf(
                                    "invoice_number" to "bar",
                                    "line_items" to "bar",
                                    "total_amount" to "bar",
                                    "vendor_name" to "bar",
                                )
                            ),
                        )
                        .putAdditionalProperty(
                            "required",
                            JsonValue.from(listOf("invoice_number", "total_amount", "vendor_name")),
                        )
                        .putAdditionalProperty("type", JsonValue.from("object"))
                        .build()
                )
                .build()

        val roundtrippedExtractV2SchemaValidateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractV2SchemaValidateRequest),
                jacksonTypeRef<ExtractV2SchemaValidateRequest>(),
            )

        assertThat(roundtrippedExtractV2SchemaValidateRequest)
            .isEqualTo(extractV2SchemaValidateRequest)
    }
}
