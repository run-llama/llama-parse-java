// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.beta.directories

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.beta.directories.files.FileAddParams
import ai.llamaindex.llamacloud.models.beta.directories.files.FileDeleteParams
import ai.llamaindex.llamacloud.models.beta.directories.files.FileGetParams
import ai.llamaindex.llamacloud.models.beta.directories.files.FileUpdateParams
import ai.llamaindex.llamacloud.models.beta.directories.files.FileUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.beta().directories().files()

        val file =
            fileService.update(
                FileUpdateParams.builder()
                    .directoryId("directory_id")
                    .directoryFileId("directory_file_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .displayName("display_name")
                    .metadata(
                        FileUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .targetDirectoryId("target_directory_id")
                    .uniqueId("x")
                    .build()
            )

        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.beta().directories().files()

        val page = fileService.list("directory_id")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.beta().directories().files()

        fileService.delete(
            FileDeleteParams.builder()
                .directoryId("directory_id")
                .directoryFileId("directory_file_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.beta().directories().files()

        val response =
            fileService.add(
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
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.beta().directories().files()

        val file =
            fileService.get(
                FileGetParams.builder()
                    .directoryId("directory_id")
                    .directoryFileId("directory_file_id")
                    .addExpand("string")
                    .addExpand("string")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.beta().directories().files()

        val response =
            fileService.upload(
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
            )

        response.validate()
    }
}
