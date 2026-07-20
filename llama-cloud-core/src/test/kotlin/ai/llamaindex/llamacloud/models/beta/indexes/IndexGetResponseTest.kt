// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.indexes

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexGetResponseTest {

    @Test
    fun create() {
        val indexGetResponse =
            IndexGetResponse.builder()
                .id("id")
                .exportConfigId("export_config_id")
                .name("name")
                .outputDirectoryId("output_directory_id")
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .syncConfigId("sync_config_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .lastExportedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastSyncedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    IndexGetResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(indexGetResponse.id()).isEqualTo("id")
        assertThat(indexGetResponse.exportConfigId()).isEqualTo("export_config_id")
        assertThat(indexGetResponse.name()).isEqualTo("name")
        assertThat(indexGetResponse.outputDirectoryId()).isEqualTo("output_directory_id")
        assertThat(indexGetResponse.projectId()).isEqualTo("project_id")
        assertThat(indexGetResponse.sourceDirectoryId()).isEqualTo("source_directory_id")
        assertThat(indexGetResponse.syncConfigId()).isEqualTo("sync_config_id")
        assertThat(indexGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(indexGetResponse.description()).contains("description")
        assertThat(indexGetResponse.lastExportedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(indexGetResponse.lastSyncedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(indexGetResponse.metadata())
            .contains(
                IndexGetResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(indexGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexGetResponse =
            IndexGetResponse.builder()
                .id("id")
                .exportConfigId("export_config_id")
                .name("name")
                .outputDirectoryId("output_directory_id")
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .syncConfigId("sync_config_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .lastExportedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastSyncedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    IndexGetResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedIndexGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexGetResponse),
                jacksonTypeRef<IndexGetResponse>(),
            )

        assertThat(roundtrippedIndexGetResponse).isEqualTo(indexGetResponse)
    }
}
