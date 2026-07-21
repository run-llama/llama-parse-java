// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.extract

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractV2SchemaGenerateRequestTest {

    @Test
    fun create() {
        val extractV2SchemaGenerateRequest =
            ExtractV2SchemaGenerateRequest.builder()
                .dataSchema(
                    ExtractV2SchemaGenerateRequest.DataSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .fileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .name("invoice_extraction")
                .prompt(
                    "Extract vendor name, invoice number, date, line items with descriptions and amounts, and total amount from invoices."
                )
                .build()

        assertThat(extractV2SchemaGenerateRequest.dataSchema())
            .contains(
                ExtractV2SchemaGenerateRequest.DataSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(extractV2SchemaGenerateRequest.fileId())
            .contains("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
        assertThat(extractV2SchemaGenerateRequest.name()).contains("invoice_extraction")
        assertThat(extractV2SchemaGenerateRequest.prompt())
            .contains(
                "Extract vendor name, invoice number, date, line items with descriptions and amounts, and total amount from invoices."
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractV2SchemaGenerateRequest =
            ExtractV2SchemaGenerateRequest.builder()
                .dataSchema(
                    ExtractV2SchemaGenerateRequest.DataSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .fileId("dfl-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                .name("invoice_extraction")
                .prompt(
                    "Extract vendor name, invoice number, date, line items with descriptions and amounts, and total amount from invoices."
                )
                .build()

        val roundtrippedExtractV2SchemaGenerateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractV2SchemaGenerateRequest),
                jacksonTypeRef<ExtractV2SchemaGenerateRequest>(),
            )

        assertThat(roundtrippedExtractV2SchemaGenerateRequest)
            .isEqualTo(extractV2SchemaGenerateRequest)
    }
}
