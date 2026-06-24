// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListPageResponseTest {

    @Test
    fun create() {
        val fileListPageResponse =
            FileListPageResponse.builder()
                .addFile(
                    PipelineFile.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .configHash(
                            PipelineFile.ConfigHash.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customMetadata(
                            PipelineFile.CustomMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .externalFileId("external_file_id")
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .fileSize(0L)
                        .fileType("file_type")
                        .indexedPageCount(0L)
                        .lastModifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .permissionInfo(
                            PipelineFile.PermissionInfo.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .resourceInfo(
                            PipelineFile.ResourceInfo.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .status(PipelineFile.Status.CANCELLED)
                        .statusUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .limit(0L)
                .offset(0L)
                .totalCount(0L)
                .build()

        assertThat(fileListPageResponse.files())
            .containsExactly(
                PipelineFile.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .configHash(
                        PipelineFile.ConfigHash.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customMetadata(
                        PipelineFile.CustomMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .externalFileId("external_file_id")
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fileSize(0L)
                    .fileType("file_type")
                    .indexedPageCount(0L)
                    .lastModifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .permissionInfo(
                        PipelineFile.PermissionInfo.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .resourceInfo(
                        PipelineFile.ResourceInfo.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .status(PipelineFile.Status.CANCELLED)
                    .statusUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(fileListPageResponse.limit()).isEqualTo(0L)
        assertThat(fileListPageResponse.offset()).isEqualTo(0L)
        assertThat(fileListPageResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileListPageResponse =
            FileListPageResponse.builder()
                .addFile(
                    PipelineFile.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .configHash(
                            PipelineFile.ConfigHash.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customMetadata(
                            PipelineFile.CustomMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .externalFileId("external_file_id")
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .fileSize(0L)
                        .fileType("file_type")
                        .indexedPageCount(0L)
                        .lastModifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .permissionInfo(
                            PipelineFile.PermissionInfo.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .resourceInfo(
                            PipelineFile.ResourceInfo.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .status(PipelineFile.Status.CANCELLED)
                        .statusUpdatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .limit(0L)
                .offset(0L)
                .totalCount(0L)
                .build()

        val roundtrippedFileListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileListPageResponse),
                jacksonTypeRef<FileListPageResponse>(),
            )

        assertThat(roundtrippedFileListPageResponse).isEqualTo(fileListPageResponse)
    }
}
