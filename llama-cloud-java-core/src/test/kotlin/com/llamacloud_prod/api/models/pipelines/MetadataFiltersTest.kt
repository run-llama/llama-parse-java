// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetadataFiltersTest {

    @Test
    fun create() {
        val metadataFilters =
            MetadataFilters.builder()
                .addFilter(
                    MetadataFilters.Filter.MetadataFilter.builder()
                        .key("key")
                        .value(0.0)
                        .operator(MetadataFilters.Filter.MetadataFilter.Operator.NOT_EQUALS)
                        .build()
                )
                .condition(MetadataFilters.Condition.AND)
                .build()

        assertThat(metadataFilters.filters())
            .containsExactly(
                MetadataFilters.Filter.ofMetadata(
                    MetadataFilters.Filter.MetadataFilter.builder()
                        .key("key")
                        .value(0.0)
                        .operator(MetadataFilters.Filter.MetadataFilter.Operator.NOT_EQUALS)
                        .build()
                )
            )
        assertThat(metadataFilters.condition()).contains(MetadataFilters.Condition.AND)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metadataFilters =
            MetadataFilters.builder()
                .addFilter(
                    MetadataFilters.Filter.MetadataFilter.builder()
                        .key("key")
                        .value(0.0)
                        .operator(MetadataFilters.Filter.MetadataFilter.Operator.NOT_EQUALS)
                        .build()
                )
                .condition(MetadataFilters.Condition.AND)
                .build()

        val roundtrippedMetadataFilters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metadataFilters),
                jacksonTypeRef<MetadataFilters>(),
            )

        assertThat(roundtrippedMetadataFilters).isEqualTo(metadataFilters)
    }
}
