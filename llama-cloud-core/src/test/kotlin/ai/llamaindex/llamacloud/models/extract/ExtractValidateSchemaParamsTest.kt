// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

import ai.llamaindex.llamacloud.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractValidateSchemaParamsTest {

    @Test
    fun create() {
        ExtractValidateSchemaParams.builder()
            .extractV2SchemaValidateRequest(
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
                                JsonValue.from(
                                    listOf("invoice_number", "total_amount", "vendor_name")
                                ),
                            )
                            .putAdditionalProperty("type", JsonValue.from("object"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExtractValidateSchemaParams.builder()
                .extractV2SchemaValidateRequest(
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
                                    JsonValue.from(
                                        listOf("invoice_number", "total_amount", "vendor_name")
                                    ),
                                )
                                .putAdditionalProperty("type", JsonValue.from("object"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                                JsonValue.from(
                                    listOf("invoice_number", "total_amount", "vendor_name")
                                ),
                            )
                            .putAdditionalProperty("type", JsonValue.from("object"))
                            .build()
                    )
                    .build()
            )
    }
}
