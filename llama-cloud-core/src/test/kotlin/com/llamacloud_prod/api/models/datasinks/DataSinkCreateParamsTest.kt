// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.datasinks

import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.http.QueryParams
import com.llamacloud_prod.api.models.pipelines.DataSinkCreate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSinkCreateParamsTest {

    @Test
    fun create() {
        DataSinkCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .dataSinkCreate(
                DataSinkCreate.builder()
                    .component(
                        DataSinkCreate.Component.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .sinkType(DataSinkCreate.SinkType.ASTRA_DB)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DataSinkCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dataSinkCreate(
                    DataSinkCreate.builder()
                        .component(
                            DataSinkCreate.Component.UnionMember0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .name("name")
                        .sinkType(DataSinkCreate.SinkType.ASTRA_DB)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DataSinkCreateParams.builder()
                .dataSinkCreate(
                    DataSinkCreate.builder()
                        .component(
                            DataSinkCreate.Component.UnionMember0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .name("name")
                        .sinkType(DataSinkCreate.SinkType.ASTRA_DB)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            DataSinkCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dataSinkCreate(
                    DataSinkCreate.builder()
                        .component(
                            DataSinkCreate.Component.UnionMember0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .name("name")
                        .sinkType(DataSinkCreate.SinkType.ASTRA_DB)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataSinkCreate.builder()
                    .component(
                        DataSinkCreate.Component.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .sinkType(DataSinkCreate.SinkType.ASTRA_DB)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataSinkCreateParams.builder()
                .dataSinkCreate(
                    DataSinkCreate.builder()
                        .component(
                            DataSinkCreate.Component.UnionMember0.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .name("name")
                        .sinkType(DataSinkCreate.SinkType.ASTRA_DB)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DataSinkCreate.builder()
                    .component(
                        DataSinkCreate.Component.UnionMember0.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .sinkType(DataSinkCreate.SinkType.ASTRA_DB)
                    .build()
            )
    }
}
