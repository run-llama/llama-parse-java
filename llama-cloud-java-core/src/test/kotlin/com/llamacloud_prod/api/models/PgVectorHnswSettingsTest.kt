// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PgVectorHnswSettingsTest {

    @Test
    fun create() {
        val pgVectorHnswSettings =
            PgVectorHnswSettings.builder()
                .distanceMethod(PgVectorHnswSettings.DistanceMethod.L2)
                .efConstruction(1L)
                .efSearch(1L)
                .m(1L)
                .vectorType(PgVectorHnswSettings.VectorType.VECTOR)
                .build()

        assertThat(pgVectorHnswSettings.distanceMethod())
            .contains(PgVectorHnswSettings.DistanceMethod.L2)
        assertThat(pgVectorHnswSettings.efConstruction()).contains(1L)
        assertThat(pgVectorHnswSettings.efSearch()).contains(1L)
        assertThat(pgVectorHnswSettings.m()).contains(1L)
        assertThat(pgVectorHnswSettings.vectorType())
            .contains(PgVectorHnswSettings.VectorType.VECTOR)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pgVectorHnswSettings =
            PgVectorHnswSettings.builder()
                .distanceMethod(PgVectorHnswSettings.DistanceMethod.L2)
                .efConstruction(1L)
                .efSearch(1L)
                .m(1L)
                .vectorType(PgVectorHnswSettings.VectorType.VECTOR)
                .build()

        val roundtrippedPgVectorHnswSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pgVectorHnswSettings),
                jacksonTypeRef<PgVectorHnswSettings>(),
            )

        assertThat(roundtrippedPgVectorHnswSettings).isEqualTo(pgVectorHnswSettings)
    }
}
