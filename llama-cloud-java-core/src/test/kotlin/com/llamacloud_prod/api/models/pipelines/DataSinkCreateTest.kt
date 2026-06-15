// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSinkCreateTest {

    @Test
    fun create() {
        val dataSinkCreate =
            DataSinkCreate.builder()
                .component(
                    DataSinkCreate.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .sinkType(DataSinkCreate.SinkType.PINECONE)
                .build()

        assertThat(dataSinkCreate.component())
            .isEqualTo(
                DataSinkCreate.Component.ofUnionMember0(
                    DataSinkCreate.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(dataSinkCreate.name()).isEqualTo("name")
        assertThat(dataSinkCreate.sinkType()).isEqualTo(DataSinkCreate.SinkType.PINECONE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataSinkCreate =
            DataSinkCreate.builder()
                .component(
                    DataSinkCreate.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .sinkType(DataSinkCreate.SinkType.PINECONE)
                .build()

        val roundtrippedDataSinkCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataSinkCreate),
                jacksonTypeRef<DataSinkCreate>(),
            )

        assertThat(roundtrippedDataSinkCreate).isEqualTo(dataSinkCreate)
    }
}
