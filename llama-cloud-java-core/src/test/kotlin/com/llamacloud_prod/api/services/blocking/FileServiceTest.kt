// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.models.files.FileCreateParams
import com.llamacloud_prod.api.models.files.FileDeleteParams
import com.llamacloud_prod.api.models.files.FileGetParams
import com.llamacloud_prod.api.models.files.FileQueryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.files()

        val file =
            fileService.create(
                FileCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .file("Example data".byteInputStream())
                    .purpose("purpose")
                    .externalFileId("external_file_id")
                    .build()
            )

        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.files()

        val page = fileService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.files()

        fileService.delete(
            FileDeleteParams.builder()
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.files()

        val presignedUrl =
            fileService.get(
                FileGetParams.builder()
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAtSeconds(0L)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        presignedUrl.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun query() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val fileService = client.files()

        val response =
            fileService.query(
                FileQueryParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filter(
                        FileQueryParams.Filter.builder()
                            .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .externalFileId("external_file_id")
                            .addFileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .fileName("file_name")
                            .onlyManuallyUploaded(true)
                            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .orderBy("order_by")
                    .pageSize(0L)
                    .pageToken("page_token")
                    .build()
            )

        response.validate()
    }
}
