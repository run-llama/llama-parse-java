// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.beta

import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.models.beta.directories.DirectoryCreateParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryDeleteParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryGetParams
import com.llamacloud_prod.api.models.beta.directories.DirectoryUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DirectoryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val directoryService = client.beta().directories()

        val directory =
            directoryService.create(
                DirectoryCreateParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("x")
                    .description("description")
                    .expiresAt(OffsetDateTime.parse("2026-05-10T00:00:00Z"))
                    .systemMetadata(
                        DirectoryCreateParams.SystemMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .type(DirectoryCreateParams.Type.USER)
                    .build()
            )

        directory.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val directoryService = client.beta().directories()

        val directory =
            directoryService.update(
                DirectoryUpdateParams.builder()
                    .directoryId("directory_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("x")
                    .build()
            )

        directory.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val directoryService = client.beta().directories()

        val page = directoryService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val directoryService = client.beta().directories()

        directoryService.delete(
            DirectoryDeleteParams.builder()
                .directoryId("directory_id")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val directoryService = client.beta().directories()

        val directory =
            directoryService.get(
                DirectoryGetParams.builder()
                    .directoryId("directory_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        directory.validate()
    }
}
