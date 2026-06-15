// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.extract

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractV2SchemaValidateResponseTest {

    @Test
    fun create() {
        val extractV2SchemaValidateResponse =
            ExtractV2SchemaValidateResponse.builder()
                .dataSchema(
                    ExtractV2SchemaValidateResponse.DataSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .build()

        assertThat(extractV2SchemaValidateResponse.dataSchema())
            .isEqualTo(
                ExtractV2SchemaValidateResponse.DataSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractV2SchemaValidateResponse =
            ExtractV2SchemaValidateResponse.builder()
                .dataSchema(
                    ExtractV2SchemaValidateResponse.DataSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .build()

        val roundtrippedExtractV2SchemaValidateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractV2SchemaValidateResponse),
                jacksonTypeRef<ExtractV2SchemaValidateResponse>(),
            )

        assertThat(roundtrippedExtractV2SchemaValidateResponse)
            .isEqualTo(extractV2SchemaValidateResponse)
    }
}
