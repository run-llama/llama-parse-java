// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.directories.files

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileAddParamsTest {

    @Test
    fun create() {
        FileAddParams.builder()
            .directoryId("directory_id")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fileId("file_id")
            .displayName("display_name")
            .metadata(
                FileAddParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .uniqueId("unique_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params = FileAddParams.builder().directoryId("directory_id").fileId("file_id").build()

        assertThat(params._pathParam(0)).isEqualTo("directory_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FileAddParams.builder()
                .directoryId("directory_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileId("file_id")
                .displayName("display_name")
                .metadata(
                    FileAddParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .uniqueId("unique_id")
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
        val params = FileAddParams.builder().directoryId("directory_id").fileId("file_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            FileAddParams.builder()
                .directoryId("directory_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fileId("file_id")
                .displayName("display_name")
                .metadata(
                    FileAddParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .uniqueId("unique_id")
                .build()

        val body = params._body()

        assertThat(body.fileId()).isEqualTo("file_id")
        assertThat(body.displayName()).contains("display_name")
        assertThat(body.metadata())
            .contains(
                FileAddParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.uniqueId()).contains("unique_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FileAddParams.builder().directoryId("directory_id").fileId("file_id").build()

        val body = params._body()

        assertThat(body.fileId()).isEqualTo("file_id")
    }
}
