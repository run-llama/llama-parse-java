// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.files

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineFileTest {

    @Test
    fun create() {
        val pipelineFile =
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

        assertThat(pipelineFile.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pipelineFile.pipelineId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pipelineFile.configHash())
            .contains(
                PipelineFile.ConfigHash.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(pipelineFile.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipelineFile.customMetadata())
            .contains(
                PipelineFile.CustomMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(pipelineFile.dataSourceId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pipelineFile.externalFileId()).contains("external_file_id")
        assertThat(pipelineFile.fileId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pipelineFile.fileSize()).contains(0L)
        assertThat(pipelineFile.fileType()).contains("file_type")
        assertThat(pipelineFile.indexedPageCount()).contains(0L)
        assertThat(pipelineFile.lastModifiedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipelineFile.name()).contains("name")
        assertThat(pipelineFile.permissionInfo())
            .contains(
                PipelineFile.PermissionInfo.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(pipelineFile.projectId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pipelineFile.resourceInfo())
            .contains(
                PipelineFile.ResourceInfo.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(pipelineFile.status()).contains(PipelineFile.Status.CANCELLED)
        assertThat(pipelineFile.statusUpdatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipelineFile.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineFile =
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

        val roundtrippedPipelineFile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineFile),
                jacksonTypeRef<PipelineFile>(),
            )

        assertThat(roundtrippedPipelineFile).isEqualTo(pipelineFile)
    }
}
