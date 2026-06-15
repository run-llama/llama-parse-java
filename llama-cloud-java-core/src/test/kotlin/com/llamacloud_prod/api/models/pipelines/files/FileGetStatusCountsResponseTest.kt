// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileGetStatusCountsResponseTest {

    @Test
    fun create() {
        val fileGetStatusCountsResponse =
            FileGetStatusCountsResponse.builder()
                .counts(
                    FileGetStatusCountsResponse.Counts.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .totalCount(0L)
                .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .onlyManuallyUploaded(true)
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(fileGetStatusCountsResponse.counts())
            .isEqualTo(
                FileGetStatusCountsResponse.Counts.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(fileGetStatusCountsResponse.totalCount()).isEqualTo(0L)
        assertThat(fileGetStatusCountsResponse.dataSourceId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(fileGetStatusCountsResponse.onlyManuallyUploaded()).contains(true)
        assertThat(fileGetStatusCountsResponse.pipelineId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileGetStatusCountsResponse =
            FileGetStatusCountsResponse.builder()
                .counts(
                    FileGetStatusCountsResponse.Counts.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .totalCount(0L)
                .dataSourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .onlyManuallyUploaded(true)
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedFileGetStatusCountsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileGetStatusCountsResponse),
                jacksonTypeRef<FileGetStatusCountsResponse>(),
            )

        assertThat(roundtrippedFileGetStatusCountsResponse).isEqualTo(fileGetStatusCountsResponse)
    }
}
