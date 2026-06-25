// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SparseModelConfigTest {

    @Test
    fun create() {
        val sparseModelConfig =
            SparseModelConfig.builder()
                .className("class_name")
                .modelType(SparseModelConfig.ModelType.AUTO)
                .build()

        assertThat(sparseModelConfig.className()).contains("class_name")
        assertThat(sparseModelConfig.modelType()).contains(SparseModelConfig.ModelType.AUTO)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sparseModelConfig =
            SparseModelConfig.builder()
                .className("class_name")
                .modelType(SparseModelConfig.ModelType.AUTO)
                .build()

        val roundtrippedSparseModelConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sparseModelConfig),
                jacksonTypeRef<SparseModelConfig>(),
            )

        assertThat(roundtrippedSparseModelConfig).isEqualTo(sparseModelConfig)
    }
}
