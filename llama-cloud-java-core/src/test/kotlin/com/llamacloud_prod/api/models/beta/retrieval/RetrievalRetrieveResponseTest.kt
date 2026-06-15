// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.retrieval

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalRetrieveResponseTest {

    @Test
    fun create() {
        val retrievalRetrieveResponse =
            RetrievalRetrieveResponse.builder()
                .addResult(
                    RetrievalRetrieveResponse.Result.builder()
                        .content("content")
                        .metadata(
                            RetrievalRetrieveResponse.Result.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .rerankScore(0.0)
                        .score(0.0)
                        .staticFields(
                            RetrievalRetrieveResponse.Result.StaticFields.builder()
                                .addAttachment(
                                    RetrievalRetrieveResponse.Result.StaticFields.Attachment
                                        .builder()
                                        .attachmentName("attachment_name")
                                        .sourceId("source_id")
                                        .type("type")
                                        .build()
                                )
                                .chunkEndChar(0L)
                                .chunkIndex(0L)
                                .chunkStartChar(0L)
                                .chunkTokenCount(0L)
                                .pageRangeEnd(0L)
                                .pageRangeStart(0L)
                                .parsedDirectoryFileId("parsed_directory_file_id")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(retrievalRetrieveResponse.results())
            .containsExactly(
                RetrievalRetrieveResponse.Result.builder()
                    .content("content")
                    .metadata(
                        RetrievalRetrieveResponse.Result.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .rerankScore(0.0)
                    .score(0.0)
                    .staticFields(
                        RetrievalRetrieveResponse.Result.StaticFields.builder()
                            .addAttachment(
                                RetrievalRetrieveResponse.Result.StaticFields.Attachment.builder()
                                    .attachmentName("attachment_name")
                                    .sourceId("source_id")
                                    .type("type")
                                    .build()
                            )
                            .chunkEndChar(0L)
                            .chunkIndex(0L)
                            .chunkStartChar(0L)
                            .chunkTokenCount(0L)
                            .pageRangeEnd(0L)
                            .pageRangeStart(0L)
                            .parsedDirectoryFileId("parsed_directory_file_id")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retrievalRetrieveResponse =
            RetrievalRetrieveResponse.builder()
                .addResult(
                    RetrievalRetrieveResponse.Result.builder()
                        .content("content")
                        .metadata(
                            RetrievalRetrieveResponse.Result.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .rerankScore(0.0)
                        .score(0.0)
                        .staticFields(
                            RetrievalRetrieveResponse.Result.StaticFields.builder()
                                .addAttachment(
                                    RetrievalRetrieveResponse.Result.StaticFields.Attachment
                                        .builder()
                                        .attachmentName("attachment_name")
                                        .sourceId("source_id")
                                        .type("type")
                                        .build()
                                )
                                .chunkEndChar(0L)
                                .chunkIndex(0L)
                                .chunkStartChar(0L)
                                .chunkTokenCount(0L)
                                .pageRangeEnd(0L)
                                .pageRangeStart(0L)
                                .parsedDirectoryFileId("parsed_directory_file_id")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedRetrievalRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retrievalRetrieveResponse),
                jacksonTypeRef<RetrievalRetrieveResponse>(),
            )

        assertThat(roundtrippedRetrievalRetrieveResponse).isEqualTo(retrievalRetrieveResponse)
    }
}
