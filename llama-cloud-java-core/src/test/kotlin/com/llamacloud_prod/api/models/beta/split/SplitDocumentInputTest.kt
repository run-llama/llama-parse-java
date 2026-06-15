// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.split

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitDocumentInputTest {

    @Test
    fun create() {
        val splitDocumentInput = SplitDocumentInput.builder().type("type").value("value").build()

        assertThat(splitDocumentInput.type()).isEqualTo("type")
        assertThat(splitDocumentInput.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitDocumentInput = SplitDocumentInput.builder().type("type").value("value").build()

        val roundtrippedSplitDocumentInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitDocumentInput),
                jacksonTypeRef<SplitDocumentInput>(),
            )

        assertThat(roundtrippedSplitDocumentInput).isEqualTo(splitDocumentInput)
    }
}
