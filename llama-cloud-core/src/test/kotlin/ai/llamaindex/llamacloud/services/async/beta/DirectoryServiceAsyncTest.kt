// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.beta

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClientAsync
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryCreateParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryDeleteParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryGetParams
import ai.llamaindex.llamacloud.models.beta.directories.DirectoryUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DirectoryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val directoryServiceAsync = client.beta().directories()

        val directoryFuture =
            directoryServiceAsync.create(
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
            )

        val directory = directoryFuture.get()
        directory.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val directoryServiceAsync = client.beta().directories()

        val directoryFuture =
            directoryServiceAsync.update(
                DirectoryUpdateParams.builder()
                    .directoryId("directory_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("x")
                    .build()
            )

        val directory = directoryFuture.get()
        directory.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val directoryServiceAsync = client.beta().directories()

        val pageFuture = directoryServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClientAsync.builder().apiKey("My API Key").build()
        val directoryServiceAsync = client.beta().directories()

        val future =
            directoryServiceAsync.delete(
                DirectoryDeleteParams.builder()
                    .directoryId("directory_id")
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
        val directoryServiceAsync = client.beta().directories()

        val directoryFuture =
            directoryServiceAsync.get(
                DirectoryGetParams.builder()
                    .directoryId("directory_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val directory = directoryFuture.get()
        directory.validate()
    }
}
