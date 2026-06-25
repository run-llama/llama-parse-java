// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.extract

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtractDeleteResponseTest {

    @Test
    fun create() {
        val extractDeleteResponse = ExtractDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val extractDeleteResponse = ExtractDeleteResponse.builder().build()

        val roundtrippedExtractDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(extractDeleteResponse),
                jacksonTypeRef<ExtractDeleteResponse>(),
            )

        assertThat(roundtrippedExtractDeleteResponse).isEqualTo(extractDeleteResponse)
    }
}
