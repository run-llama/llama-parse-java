// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileTest {

    @Test
    fun create() {
        val file =
            File.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalFileId("external_file_id")
                .fileSize(0L)
                .fileType("x")
                .lastModifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .permissionInfo(
                    File.PermissionInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .purpose("purpose")
                .resourceInfo(
                    File.ResourceInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(file.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(file.name()).isEqualTo("x")
        assertThat(file.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(file.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(file.dataSourceId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(file.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(file.externalFileId()).contains("external_file_id")
        assertThat(file.fileSize()).contains(0L)
        assertThat(file.fileType()).contains("x")
        assertThat(file.lastModifiedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(file.permissionInfo())
            .contains(
                File.PermissionInfo.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(file.purpose()).contains("purpose")
        assertThat(file.resourceInfo())
            .contains(
                File.ResourceInfo.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                    .build()
            )
        assertThat(file.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val file =
            File.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("x")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalFileId("external_file_id")
                .fileSize(0L)
                .fileType("x")
                .lastModifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .permissionInfo(
                    File.PermissionInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .purpose("purpose")
                .resourceInfo(
                    File.ResourceInfo.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedFile =
            jsonMapper.readValue(jsonMapper.writeValueAsString(file), jacksonTypeRef<File>())

        assertThat(roundtrippedFile).isEqualTo(file)
    }
}
