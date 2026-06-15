// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PageScreenshotNodeWithScoreTest {

    @Test
    fun create() {
        val pageScreenshotNodeWithScore =
            PageScreenshotNodeWithScore.builder()
                .node(
                    PageScreenshotNodeWithScore.Node.builder()
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .imageSize(0L)
                        .pageIndex(0L)
                        .metadata(
                            PageScreenshotNodeWithScore.Node.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .score(0.0)
                .className("class_name")
                .build()

        assertThat(pageScreenshotNodeWithScore.node())
            .isEqualTo(
                PageScreenshotNodeWithScore.Node.builder()
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .imageSize(0L)
                    .pageIndex(0L)
                    .metadata(
                        PageScreenshotNodeWithScore.Node.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(pageScreenshotNodeWithScore.score()).isEqualTo(0.0)
        assertThat(pageScreenshotNodeWithScore.className()).contains("class_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pageScreenshotNodeWithScore =
            PageScreenshotNodeWithScore.builder()
                .node(
                    PageScreenshotNodeWithScore.Node.builder()
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .imageSize(0L)
                        .pageIndex(0L)
                        .metadata(
                            PageScreenshotNodeWithScore.Node.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .score(0.0)
                .className("class_name")
                .build()

        val roundtrippedPageScreenshotNodeWithScore =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pageScreenshotNodeWithScore),
                jacksonTypeRef<PageScreenshotNodeWithScore>(),
            )

        assertThat(roundtrippedPageScreenshotNodeWithScore).isEqualTo(pageScreenshotNodeWithScore)
    }
}
