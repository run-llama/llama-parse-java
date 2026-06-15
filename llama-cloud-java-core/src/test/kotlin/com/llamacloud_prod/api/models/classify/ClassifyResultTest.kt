// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.classify

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassifyResultTest {

    @Test
    fun create() {
        val classifyResult =
            ClassifyResult.builder().confidence(0.0).reasoning("reasoning").type("type").build()

        assertThat(classifyResult.confidence()).isEqualTo(0.0)
        assertThat(classifyResult.reasoning()).isEqualTo("reasoning")
        assertThat(classifyResult.type()).contains("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classifyResult =
            ClassifyResult.builder().confidence(0.0).reasoning("reasoning").type("type").build()

        val roundtrippedClassifyResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classifyResult),
                jacksonTypeRef<ClassifyResult>(),
            )

        assertThat(roundtrippedClassifyResult).isEqualTo(classifyResult)
    }
}
