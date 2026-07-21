// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.models.files.FileCreateParams
import ai.llamaindex.llamacloud.models.files.FileDeleteParams
import ai.llamaindex.llamacloud.models.files.FileGetParams
import ai.llamaindex.llamacloud.models.files.FileQueryParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.files()

        val fileFuture =
            fileServiceAsync.create(
                FileCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .file("Example data".byteInputStream())
                    .purpose("purpose")
                    .externalFileId("external_file_id")
                    .build()
            )

        val file = fileFuture.get()
        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.files()

        val pageFuture = fileServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.files()

        val future =
            fileServiceAsync.delete(
                FileDeleteParams.builder()
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.files()

        val presignedUrlFuture =
            fileServiceAsync.get(
                FileGetParams.builder()
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAtSeconds(0L)
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val presignedUrl = presignedUrlFuture.get()
        presignedUrl.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun query() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fileServiceAsync = client.files()

        val responseFuture =
            fileServiceAsync.query(
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

        val response = responseFuture.get()
        response.validate()
    }
}
