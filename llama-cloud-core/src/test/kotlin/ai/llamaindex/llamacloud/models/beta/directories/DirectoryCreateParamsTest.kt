// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.directories

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryCreateParamsTest {

    @Test
    fun create() {
        DirectoryCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("x")
            .description("description")
            .systemMetadata(
                DirectoryCreateParams.SystemMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .type(DirectoryCreateParams.Type.USER)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DirectoryCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .description("description")
                .systemMetadata(
                    DirectoryCreateParams.SystemMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(DirectoryCreateParams.Type.USER)
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
        val params = DirectoryCreateParams.builder().name("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            DirectoryCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .description("description")
                .systemMetadata(
                    DirectoryCreateParams.SystemMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(DirectoryCreateParams.Type.USER)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.description()).contains("description")
        assertThat(body.systemMetadata())
            .contains(
                DirectoryCreateParams.SystemMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.type()).contains(DirectoryCreateParams.Type.USER)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DirectoryCreateParams.builder().name("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
