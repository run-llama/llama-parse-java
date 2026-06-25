// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.directories.files

import com.llamacloud_prod.api.core.MultipartField
import com.llamacloud_prod.api.core.http.QueryParams
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUploadParamsTest {

    @Test
    fun create() {
        FileUploadParams.builder()
            .directoryId("directory_id")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .uploadFile("Example data".byteInputStream())
            .displayName("display_name")
            .externalFileId("external_file_id")
            .metadata("{\"source\": \"web\", \"priority\": 1}")
            .uniqueId("unique_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FileUploadParams.builder()
                .directoryId("directory_id")
                .uploadFile("Example data".byteInputStream())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("directory_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FileUploadParams.builder()
                .directoryId("directory_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uploadFile("Example data".byteInputStream())
                .displayName("display_name")
                .externalFileId("external_file_id")
                .metadata("{\"source\": \"web\", \"priority\": 1}")
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
        val params =
            FileUploadParams.builder()
                .directoryId("directory_id")
                .uploadFile("Example data".byteInputStream())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            FileUploadParams.builder()
                .directoryId("directory_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .uploadFile("Example data".byteInputStream())
                .displayName("display_name")
                .externalFileId("external_file_id")
                .metadata("{\"source\": \"web\", \"priority\": 1}")
                .uniqueId("unique_id")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "upload_file" to MultipartField.of("Example data".byteInputStream()),
                        "display_name" to MultipartField.of("display_name"),
                        "external_file_id" to MultipartField.of("external_file_id"),
                        "metadata" to MultipartField.of("{\"source\": \"web\", \"priority\": 1}"),
                        "unique_id" to MultipartField.of("unique_id"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FileUploadParams.builder()
                .directoryId("directory_id")
                .uploadFile("Example data".byteInputStream())
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf("upload_file" to MultipartField.of("Example data".byteInputStream()))
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
