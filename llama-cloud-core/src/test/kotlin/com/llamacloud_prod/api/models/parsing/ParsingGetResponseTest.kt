// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParsingGetResponseTest {

    @Test
    fun create() {
        val parsingGetResponse =
            ParsingGetResponse.builder()
                .job(
                    ParsingGetResponse.Job.builder()
                        .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .status(ParsingGetResponse.Job.Status.CANCELLED)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("error_message")
                        .name("Q4 Financial Report")
                        .tier("fast")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userMetadata(
                            ParsingGetResponse.Job.UserMetadata.builder()
                                .putAdditionalProperty("owner", JsonValue.from("jerry"))
                                .putAdditionalProperty("team", JsonValue.from("research"))
                                .build()
                        )
                        .build()
                )
                .imagesContentMetadata(
                    ParsingGetResponse.ImagesContentMetadata.builder()
                        .addImage(
                            ParsingGetResponse.ImagesContentMetadata.Image.builder()
                                .filename("filename")
                                .index(0L)
                                .bbox(
                                    ParsingGetResponse.ImagesContentMetadata.Image.Bbox.builder()
                                        .h(0L)
                                        .w(0L)
                                        .x(0L)
                                        .y(0L)
                                        .build()
                                )
                                .category(
                                    ParsingGetResponse.ImagesContentMetadata.Image.Category.EMBEDDED
                                )
                                .contentType("content_type")
                                .presignedUrl("presigned_url")
                                .sizeBytes(0L)
                                .build()
                        )
                        .totalCount(0L)
                        .build()
                )
                .items(
                    ParsingGetResponse.Items.builder()
                        .addPage(
                            ParsingGetResponse.Items.Page.StructuredResultPage.builder()
                                .addItem(
                                    CodeItem.builder()
                                        .md("md")
                                        .value("value")
                                        .addBbox(
                                            BBox.builder()
                                                .h(0.0)
                                                .w(0.0)
                                                .x(0.0)
                                                .y(0.0)
                                                .confidence(0.0)
                                                .endIndex(0L)
                                                .label("label")
                                                .r(0.0)
                                                .startIndex(0L)
                                                .build()
                                        )
                                        .language("language")
                                        .type(CodeItem.Type.CODE)
                                        .build()
                                )
                                .pageHeight(0.0)
                                .pageNumber(0L)
                                .pageWidth(0.0)
                                .build()
                        )
                        .build()
                )
                .jobMetadata(
                    ParsingGetResponse.JobMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .markdown(
                    ParsingGetResponse.Markdown.builder()
                        .addPage(
                            ParsingGetResponse.Markdown.Page.MarkdownResultPage.builder()
                                .markdown("markdown")
                                .pageNumber(0L)
                                .footer("footer")
                                .header("header")
                                .build()
                        )
                        .build()
                )
                .markdownFull("markdown_full")
                .metadata(
                    ParsingGetResponse.Metadata.builder()
                        .addPage(
                            ParsingGetResponse.Metadata.Page.builder()
                                .pageNumber(0L)
                                .confidence(0.0)
                                .costOptimized(true)
                                .originalOrientationAngle(0L)
                                .printedPageNumber("printed_page_number")
                                .slideSectionName("slide_section_name")
                                .speakerNotes("speaker_notes")
                                .triggeredAutoMode(true)
                                .build()
                        )
                        .build()
                )
                .rawParameters(
                    ParsingGetResponse.RawParameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .resultContentMetadata(
                    ParsingGetResponse.ResultContentMetadata.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "size_bytes" to 0,
                                    "exists" to true,
                                    "presigned_url" to "presigned_url",
                                )
                            ),
                        )
                        .build()
                )
                .text(
                    ParsingGetResponse.Text.builder()
                        .addPage(
                            ParsingGetResponse.Text.Page.builder()
                                .pageNumber(0L)
                                .text("text")
                                .build()
                        )
                        .build()
                )
                .textFull("text_full")
                .build()

        assertThat(parsingGetResponse.job())
            .isEqualTo(
                ParsingGetResponse.Job.builder()
                    .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                    .status(ParsingGetResponse.Job.Status.CANCELLED)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .errorMessage("error_message")
                    .name("Q4 Financial Report")
                    .tier("fast")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .userMetadata(
                        ParsingGetResponse.Job.UserMetadata.builder()
                            .putAdditionalProperty("owner", JsonValue.from("jerry"))
                            .putAdditionalProperty("team", JsonValue.from("research"))
                            .build()
                    )
                    .build()
            )
        assertThat(parsingGetResponse.imagesContentMetadata())
            .contains(
                ParsingGetResponse.ImagesContentMetadata.builder()
                    .addImage(
                        ParsingGetResponse.ImagesContentMetadata.Image.builder()
                            .filename("filename")
                            .index(0L)
                            .bbox(
                                ParsingGetResponse.ImagesContentMetadata.Image.Bbox.builder()
                                    .h(0L)
                                    .w(0L)
                                    .x(0L)
                                    .y(0L)
                                    .build()
                            )
                            .category(
                                ParsingGetResponse.ImagesContentMetadata.Image.Category.EMBEDDED
                            )
                            .contentType("content_type")
                            .presignedUrl("presigned_url")
                            .sizeBytes(0L)
                            .build()
                    )
                    .totalCount(0L)
                    .build()
            )
        assertThat(parsingGetResponse.items())
            .contains(
                ParsingGetResponse.Items.builder()
                    .addPage(
                        ParsingGetResponse.Items.Page.StructuredResultPage.builder()
                            .addItem(
                                CodeItem.builder()
                                    .md("md")
                                    .value("value")
                                    .addBbox(
                                        BBox.builder()
                                            .h(0.0)
                                            .w(0.0)
                                            .x(0.0)
                                            .y(0.0)
                                            .confidence(0.0)
                                            .endIndex(0L)
                                            .label("label")
                                            .r(0.0)
                                            .startIndex(0L)
                                            .build()
                                    )
                                    .language("language")
                                    .type(CodeItem.Type.CODE)
                                    .build()
                            )
                            .pageHeight(0.0)
                            .pageNumber(0L)
                            .pageWidth(0.0)
                            .build()
                    )
                    .build()
            )
        assertThat(parsingGetResponse.jobMetadata())
            .contains(
                ParsingGetResponse.JobMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(parsingGetResponse.markdown())
            .contains(
                ParsingGetResponse.Markdown.builder()
                    .addPage(
                        ParsingGetResponse.Markdown.Page.MarkdownResultPage.builder()
                            .markdown("markdown")
                            .pageNumber(0L)
                            .footer("footer")
                            .header("header")
                            .build()
                    )
                    .build()
            )
        assertThat(parsingGetResponse.markdownFull()).contains("markdown_full")
        assertThat(parsingGetResponse.metadata())
            .contains(
                ParsingGetResponse.Metadata.builder()
                    .addPage(
                        ParsingGetResponse.Metadata.Page.builder()
                            .pageNumber(0L)
                            .confidence(0.0)
                            .costOptimized(true)
                            .originalOrientationAngle(0L)
                            .printedPageNumber("printed_page_number")
                            .slideSectionName("slide_section_name")
                            .speakerNotes("speaker_notes")
                            .triggeredAutoMode(true)
                            .build()
                    )
                    .build()
            )
        assertThat(parsingGetResponse.rawParameters())
            .contains(
                ParsingGetResponse.RawParameters.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(parsingGetResponse.resultContentMetadata())
            .contains(
                ParsingGetResponse.ResultContentMetadata.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "size_bytes" to 0,
                                "exists" to true,
                                "presigned_url" to "presigned_url",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(parsingGetResponse.text())
            .contains(
                ParsingGetResponse.Text.builder()
                    .addPage(
                        ParsingGetResponse.Text.Page.builder().pageNumber(0L).text("text").build()
                    )
                    .build()
            )
        assertThat(parsingGetResponse.textFull()).contains("text_full")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val parsingGetResponse =
            ParsingGetResponse.builder()
                .job(
                    ParsingGetResponse.Job.builder()
                        .id("pjb-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .projectId("prj-aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee")
                        .status(ParsingGetResponse.Job.Status.CANCELLED)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorMessage("error_message")
                        .name("Q4 Financial Report")
                        .tier("fast")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .userMetadata(
                            ParsingGetResponse.Job.UserMetadata.builder()
                                .putAdditionalProperty("owner", JsonValue.from("jerry"))
                                .putAdditionalProperty("team", JsonValue.from("research"))
                                .build()
                        )
                        .build()
                )
                .imagesContentMetadata(
                    ParsingGetResponse.ImagesContentMetadata.builder()
                        .addImage(
                            ParsingGetResponse.ImagesContentMetadata.Image.builder()
                                .filename("filename")
                                .index(0L)
                                .bbox(
                                    ParsingGetResponse.ImagesContentMetadata.Image.Bbox.builder()
                                        .h(0L)
                                        .w(0L)
                                        .x(0L)
                                        .y(0L)
                                        .build()
                                )
                                .category(
                                    ParsingGetResponse.ImagesContentMetadata.Image.Category.EMBEDDED
                                )
                                .contentType("content_type")
                                .presignedUrl("presigned_url")
                                .sizeBytes(0L)
                                .build()
                        )
                        .totalCount(0L)
                        .build()
                )
                .items(
                    ParsingGetResponse.Items.builder()
                        .addPage(
                            ParsingGetResponse.Items.Page.StructuredResultPage.builder()
                                .addItem(
                                    CodeItem.builder()
                                        .md("md")
                                        .value("value")
                                        .addBbox(
                                            BBox.builder()
                                                .h(0.0)
                                                .w(0.0)
                                                .x(0.0)
                                                .y(0.0)
                                                .confidence(0.0)
                                                .endIndex(0L)
                                                .label("label")
                                                .r(0.0)
                                                .startIndex(0L)
                                                .build()
                                        )
                                        .language("language")
                                        .type(CodeItem.Type.CODE)
                                        .build()
                                )
                                .pageHeight(0.0)
                                .pageNumber(0L)
                                .pageWidth(0.0)
                                .build()
                        )
                        .build()
                )
                .jobMetadata(
                    ParsingGetResponse.JobMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .markdown(
                    ParsingGetResponse.Markdown.builder()
                        .addPage(
                            ParsingGetResponse.Markdown.Page.MarkdownResultPage.builder()
                                .markdown("markdown")
                                .pageNumber(0L)
                                .footer("footer")
                                .header("header")
                                .build()
                        )
                        .build()
                )
                .markdownFull("markdown_full")
                .metadata(
                    ParsingGetResponse.Metadata.builder()
                        .addPage(
                            ParsingGetResponse.Metadata.Page.builder()
                                .pageNumber(0L)
                                .confidence(0.0)
                                .costOptimized(true)
                                .originalOrientationAngle(0L)
                                .printedPageNumber("printed_page_number")
                                .slideSectionName("slide_section_name")
                                .speakerNotes("speaker_notes")
                                .triggeredAutoMode(true)
                                .build()
                        )
                        .build()
                )
                .rawParameters(
                    ParsingGetResponse.RawParameters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .resultContentMetadata(
                    ParsingGetResponse.ResultContentMetadata.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "size_bytes" to 0,
                                    "exists" to true,
                                    "presigned_url" to "presigned_url",
                                )
                            ),
                        )
                        .build()
                )
                .text(
                    ParsingGetResponse.Text.builder()
                        .addPage(
                            ParsingGetResponse.Text.Page.builder()
                                .pageNumber(0L)
                                .text("text")
                                .build()
                        )
                        .build()
                )
                .textFull("text_full")
                .build()

        val roundtrippedParsingGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsingGetResponse),
                jacksonTypeRef<ParsingGetResponse>(),
            )

        assertThat(roundtrippedParsingGetResponse).isEqualTo(parsingGetResponse)
    }
}
