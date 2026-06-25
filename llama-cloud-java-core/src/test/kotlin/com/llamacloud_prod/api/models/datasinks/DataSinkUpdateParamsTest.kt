// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.datasinks

import com.llamacloud_prod.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSinkUpdateParamsTest {

    @Test
    fun create() {
        DataSinkUpdateParams.builder()
            .dataSinkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sinkType(DataSinkUpdateParams.SinkType.ASTRA_DB)
            .component(
                DataSinkUpdateParams.Component.UnionMember0.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DataSinkUpdateParams.builder()
                .dataSinkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sinkType(DataSinkUpdateParams.SinkType.ASTRA_DB)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DataSinkUpdateParams.builder()
                .dataSinkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sinkType(DataSinkUpdateParams.SinkType.ASTRA_DB)
                .component(
                    DataSinkUpdateParams.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.sinkType()).isEqualTo(DataSinkUpdateParams.SinkType.ASTRA_DB)
        assertThat(body.component())
            .contains(
                DataSinkUpdateParams.Component.ofUnionMember0(
                    DataSinkUpdateParams.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataSinkUpdateParams.builder()
                .dataSinkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sinkType(DataSinkUpdateParams.SinkType.ASTRA_DB)
                .build()

        val body = params._body()

        assertThat(body.sinkType()).isEqualTo(DataSinkUpdateParams.SinkType.ASTRA_DB)
    }
}
