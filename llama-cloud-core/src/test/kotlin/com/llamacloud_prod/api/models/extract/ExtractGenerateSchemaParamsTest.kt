// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.extract

import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractGenerateSchemaParamsTest {

    @Test
    fun create() {
        ExtractGenerateSchemaParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .extractV2SchemaGenerateRequest(
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
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExtractGenerateSchemaParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .extractV2SchemaGenerateRequest(
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
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ExtractGenerateSchemaParams.builder()
                .extractV2SchemaGenerateRequest(ExtractV2SchemaGenerateRequest.builder().build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            ExtractGenerateSchemaParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .extractV2SchemaGenerateRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExtractGenerateSchemaParams.builder()
                .extractV2SchemaGenerateRequest(ExtractV2SchemaGenerateRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ExtractV2SchemaGenerateRequest.builder().build())
    }
}
