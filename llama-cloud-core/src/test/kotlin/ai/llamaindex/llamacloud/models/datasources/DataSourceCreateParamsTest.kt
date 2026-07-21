// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.datasources

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSourceCreateParamsTest {

    @Test
    fun create() {
        DataSourceCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .component(
                DataSourceCreateParams.Component.UnionMember0.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .name("name")
            .sourceType(DataSourceCreateParams.SourceType.AZURE_STORAGE_BLOB)
            .customMetadata(
                DataSourceCreateParams.CustomMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DataSourceCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .component(
                    DataSourceCreateParams.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .sourceType(DataSourceCreateParams.SourceType.AZURE_STORAGE_BLOB)
                .customMetadata(
                    DataSourceCreateParams.CustomMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
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
            DataSourceCreateParams.builder()
                .component(
                    DataSourceCreateParams.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .sourceType(DataSourceCreateParams.SourceType.AZURE_STORAGE_BLOB)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            DataSourceCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .component(
                    DataSourceCreateParams.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .sourceType(DataSourceCreateParams.SourceType.AZURE_STORAGE_BLOB)
                .customMetadata(
                    DataSourceCreateParams.CustomMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.component())
            .isEqualTo(
                DataSourceCreateParams.Component.ofUnionMember0(
                    DataSourceCreateParams.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.sourceType())
            .isEqualTo(DataSourceCreateParams.SourceType.AZURE_STORAGE_BLOB)
        assertThat(body.customMetadata())
            .contains(
                DataSourceCreateParams.CustomMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataSourceCreateParams.builder()
                .component(
                    DataSourceCreateParams.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .sourceType(DataSourceCreateParams.SourceType.AZURE_STORAGE_BLOB)
                .build()

        val body = params._body()

        assertThat(body.component())
            .isEqualTo(
                DataSourceCreateParams.Component.ofUnionMember0(
                    DataSourceCreateParams.Component.UnionMember0.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.sourceType())
            .isEqualTo(DataSourceCreateParams.SourceType.AZURE_STORAGE_BLOB)
    }
}
