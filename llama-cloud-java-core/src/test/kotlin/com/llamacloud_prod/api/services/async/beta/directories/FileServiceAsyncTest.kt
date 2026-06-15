// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.async.beta.directories

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClientAsync
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.models.beta.directories.files.FileAddParams
import com.llamacloud_prod.api.models.beta.directories.files.FileDeleteParams
import com.llamacloud_prod.api.models.beta.directories.files.FileGetParams
import com.llamacloud_prod.api.models.beta.directories.files.FileUpdateParams
import com.llamacloud_prod.api.models.beta.directories.files.FileUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.beta().directories().files()

        val fileFuture =
            fileServiceAsync.update(
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

        val file = fileFuture.get()
        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.beta().directories().files()

        val pageFuture = fileServiceAsync.list("directory_id")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.beta().directories().files()

        val future =
            fileServiceAsync.delete(
                FileDeleteParams.builder()
                    .directoryId("directory_id")
                    .directoryFileId("directory_file_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun add() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.beta().directories().files()

        val responseFuture =
            fileServiceAsync.add(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.beta().directories().files()

        val fileFuture =
            fileServiceAsync.get(
                FileGetParams.builder()
                    .directoryId("directory_id")
                    .directoryFileId("directory_file_id")
                    .addExpand("string")
                    .addExpand("string")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val file = fileFuture.get()
        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.beta().directories().files()

        val responseFuture =
            fileServiceAsync.upload(
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

        val response = responseFuture.get()
        response.validate()
    }
}
