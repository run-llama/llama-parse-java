// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.sheets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.files.File
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SheetsJobTest {

    @Test
    fun create() {
        val sheetsJob =
            SheetsJob.builder()
                .id("id")
                .configuration(
                    SheetsParsingConfig.builder()
                        .extractionRange("extraction_range")
                        .flattenHierarchicalTables(true)
                        .generateAdditionalMetadata(true)
                        .includeHiddenCells(true)
                        .addSheetName("string")
                        .specialization("specialization")
                        .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                        .useExperimentalProcessing(true)
                        .build()
                )
                .createdAt("created_at")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(SheetsJob.Status.CANCELLED)
                .updatedAt("updated_at")
                .userId("user_id")
                .config(
                    SheetsParsingConfig.builder()
                        .extractionRange("extraction_range")
                        .flattenHierarchicalTables(true)
                        .generateAdditionalMetadata(true)
                        .includeHiddenCells(true)
                        .addSheetName("string")
                        .specialization("specialization")
                        .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                        .useExperimentalProcessing(true)
                        .build()
                )
                .configurationId("configuration_id")
                .addError("string")
                .file(
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
                )
                .metadataStateTransitions(
                    SheetsJob.MetadataStateTransitions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .parameters(
                    SheetsJob.Parameters.builder()
                        .addWebhookConfiguration(
                            SheetsJob.Parameters.WebhookConfiguration.builder()
                                .addWebhookEvent(
                                    SheetsJob.Parameters.WebhookConfiguration.WebhookEvent
                                        .PARSE_SUCCESS
                                )
                                .addWebhookEvent(
                                    SheetsJob.Parameters.WebhookConfiguration.WebhookEvent
                                        .PARSE_ERROR
                                )
                                .webhookHeaders(
                                    SheetsJob.Parameters.WebhookConfiguration.WebhookHeaders
                                        .builder()
                                        .putAdditionalProperty(
                                            "Authorization",
                                            JsonValue.from("Bearer sk-..."),
                                        )
                                        .build()
                                )
                                .webhookOutputFormat("json")
                                .webhookUrl("https://example.com/webhooks/llamacloud")
                                .build()
                        )
                        .build()
                )
                .addRegion(
                    SheetsJob.Region.builder()
                        .location("location")
                        .regionType("region_type")
                        .sheetName("sheet_name")
                        .description("description")
                        .regionId("region_id")
                        .title("title")
                        .build()
                )
                .success(true)
                .addWorksheetMetadata(
                    SheetsJob.WorksheetMetadata.builder()
                        .sheetName("sheet_name")
                        .description("description")
                        .title("title")
                        .build()
                )
                .build()

        assertThat(sheetsJob.id()).isEqualTo("id")
        assertThat(sheetsJob.configuration())
            .isEqualTo(
                SheetsParsingConfig.builder()
                    .extractionRange("extraction_range")
                    .flattenHierarchicalTables(true)
                    .generateAdditionalMetadata(true)
                    .includeHiddenCells(true)
                    .addSheetName("string")
                    .specialization("specialization")
                    .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                    .useExperimentalProcessing(true)
                    .build()
            )
        assertThat(sheetsJob.createdAt()).isEqualTo("created_at")
        assertThat(sheetsJob.fileId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(sheetsJob.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(sheetsJob.status()).isEqualTo(SheetsJob.Status.CANCELLED)
        assertThat(sheetsJob.updatedAt()).isEqualTo("updated_at")
        assertThat(sheetsJob.userId()).isEqualTo("user_id")
        assertThat(sheetsJob.config())
            .contains(
                SheetsParsingConfig.builder()
                    .extractionRange("extraction_range")
                    .flattenHierarchicalTables(true)
                    .generateAdditionalMetadata(true)
                    .includeHiddenCells(true)
                    .addSheetName("string")
                    .specialization("specialization")
                    .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                    .useExperimentalProcessing(true)
                    .build()
            )
        assertThat(sheetsJob.configurationId()).contains("configuration_id")
        assertThat(sheetsJob.errors().getOrNull()).containsExactly("string")
        assertThat(sheetsJob.file())
            .contains(
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
            )
        assertThat(sheetsJob.metadataStateTransitions())
            .contains(
                SheetsJob.MetadataStateTransitions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(sheetsJob.parameters())
            .contains(
                SheetsJob.Parameters.builder()
                    .addWebhookConfiguration(
                        SheetsJob.Parameters.WebhookConfiguration.builder()
                            .addWebhookEvent(
                                SheetsJob.Parameters.WebhookConfiguration.WebhookEvent.PARSE_SUCCESS
                            )
                            .addWebhookEvent(
                                SheetsJob.Parameters.WebhookConfiguration.WebhookEvent.PARSE_ERROR
                            )
                            .webhookHeaders(
                                SheetsJob.Parameters.WebhookConfiguration.WebhookHeaders.builder()
                                    .putAdditionalProperty(
                                        "Authorization",
                                        JsonValue.from("Bearer sk-..."),
                                    )
                                    .build()
                            )
                            .webhookOutputFormat("json")
                            .webhookUrl("https://example.com/webhooks/llamacloud")
                            .build()
                    )
                    .build()
            )
        assertThat(sheetsJob.regions().getOrNull())
            .containsExactly(
                SheetsJob.Region.builder()
                    .location("location")
                    .regionType("region_type")
                    .sheetName("sheet_name")
                    .description("description")
                    .regionId("region_id")
                    .title("title")
                    .build()
            )
        assertThat(sheetsJob.success()).contains(true)
        assertThat(sheetsJob.worksheetMetadata().getOrNull())
            .containsExactly(
                SheetsJob.WorksheetMetadata.builder()
                    .sheetName("sheet_name")
                    .description("description")
                    .title("title")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sheetsJob =
            SheetsJob.builder()
                .id("id")
                .configuration(
                    SheetsParsingConfig.builder()
                        .extractionRange("extraction_range")
                        .flattenHierarchicalTables(true)
                        .generateAdditionalMetadata(true)
                        .includeHiddenCells(true)
                        .addSheetName("string")
                        .specialization("specialization")
                        .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                        .useExperimentalProcessing(true)
                        .build()
                )
                .createdAt("created_at")
                .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(SheetsJob.Status.CANCELLED)
                .updatedAt("updated_at")
                .userId("user_id")
                .config(
                    SheetsParsingConfig.builder()
                        .extractionRange("extraction_range")
                        .flattenHierarchicalTables(true)
                        .generateAdditionalMetadata(true)
                        .includeHiddenCells(true)
                        .addSheetName("string")
                        .specialization("specialization")
                        .tableMergeSensitivity(SheetsParsingConfig.TableMergeSensitivity.STRONG)
                        .useExperimentalProcessing(true)
                        .build()
                )
                .configurationId("configuration_id")
                .addError("string")
                .file(
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
                )
                .metadataStateTransitions(
                    SheetsJob.MetadataStateTransitions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .parameters(
                    SheetsJob.Parameters.builder()
                        .addWebhookConfiguration(
                            SheetsJob.Parameters.WebhookConfiguration.builder()
                                .addWebhookEvent(
                                    SheetsJob.Parameters.WebhookConfiguration.WebhookEvent
                                        .PARSE_SUCCESS
                                )
                                .addWebhookEvent(
                                    SheetsJob.Parameters.WebhookConfiguration.WebhookEvent
                                        .PARSE_ERROR
                                )
                                .webhookHeaders(
                                    SheetsJob.Parameters.WebhookConfiguration.WebhookHeaders
                                        .builder()
                                        .putAdditionalProperty(
                                            "Authorization",
                                            JsonValue.from("Bearer sk-..."),
                                        )
                                        .build()
                                )
                                .webhookOutputFormat("json")
                                .webhookUrl("https://example.com/webhooks/llamacloud")
                                .build()
                        )
                        .build()
                )
                .addRegion(
                    SheetsJob.Region.builder()
                        .location("location")
                        .regionType("region_type")
                        .sheetName("sheet_name")
                        .description("description")
                        .regionId("region_id")
                        .title("title")
                        .build()
                )
                .success(true)
                .addWorksheetMetadata(
                    SheetsJob.WorksheetMetadata.builder()
                        .sheetName("sheet_name")
                        .description("description")
                        .title("title")
                        .build()
                )
                .build()

        val roundtrippedSheetsJob =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sheetsJob),
                jacksonTypeRef<SheetsJob>(),
            )

        assertThat(roundtrippedSheetsJob).isEqualTo(sheetsJob)
    }
}
