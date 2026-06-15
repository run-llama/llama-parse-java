// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.datasinks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSinkTest {

    @Test
    fun create() {
        val dataSink =
            DataSink.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .component(
                    DataSink.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sinkType(DataSink.SinkType.PINECONE)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(dataSink.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dataSink.component())
            .isEqualTo(
                DataSink.Component.ofUnionMember0(
                    DataSink.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(dataSink.name()).isEqualTo("name")
        assertThat(dataSink.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(dataSink.sinkType()).isEqualTo(DataSink.SinkType.PINECONE)
        assertThat(dataSink.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dataSink.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataSink =
            DataSink.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .component(
                    DataSink.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sinkType(DataSink.SinkType.PINECONE)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedDataSink =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataSink),
                jacksonTypeRef<DataSink>(),
            )

        assertThat(roundtrippedDataSink).isEqualTo(dataSink)
    }
}
