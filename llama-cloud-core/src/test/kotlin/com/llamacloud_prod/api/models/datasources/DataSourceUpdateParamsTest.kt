// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.datasources

import com.llamacloud_prod.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSourceUpdateParamsTest {

    @Test
    fun create() {
        DataSourceUpdateParams.builder()
            .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sourceType(DataSourceUpdateParams.SourceType.AZURE_STORAGE_BLOB)
            .brokeredConnectionId("brokered_connection_id")
            .component(
                DataSourceUpdateParams.Component.UnionMember0.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .customMetadata(
                DataSourceUpdateParams.CustomMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DataSourceUpdateParams.builder()
                .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceType(DataSourceUpdateParams.SourceType.AZURE_STORAGE_BLOB)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DataSourceUpdateParams.builder()
                .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceType(DataSourceUpdateParams.SourceType.AZURE_STORAGE_BLOB)
                .brokeredConnectionId("brokered_connection_id")
                .component(
                    DataSourceUpdateParams.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .customMetadata(
                    DataSourceUpdateParams.CustomMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.sourceType())
            .isEqualTo(DataSourceUpdateParams.SourceType.AZURE_STORAGE_BLOB)
        assertThat(body.brokeredConnectionId()).contains("brokered_connection_id")
        assertThat(body.component())
            .contains(
                DataSourceUpdateParams.Component.ofUnionMember0(
                    DataSourceUpdateParams.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(body.customMetadata())
            .contains(
                DataSourceUpdateParams.CustomMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataSourceUpdateParams.builder()
                .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceType(DataSourceUpdateParams.SourceType.AZURE_STORAGE_BLOB)
                .build()

        val body = params._body()

        assertThat(body.sourceType())
            .isEqualTo(DataSourceUpdateParams.SourceType.AZURE_STORAGE_BLOB)
    }
}
