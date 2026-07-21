// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImageItemTest {

    @Test
    fun create() {
        val imageItem =
            ImageItem.builder()
                .caption("caption")
                .md("md")
                .url("url")
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
                .type(ImageItem.Type.IMAGE)
                .build()

        assertThat(imageItem.caption()).isEqualTo("caption")
        assertThat(imageItem.md()).isEqualTo("md")
        assertThat(imageItem.url()).isEqualTo("url")
        assertThat(imageItem.bbox().getOrNull())
            .containsExactly(
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
        assertThat(imageItem.type()).contains(ImageItem.Type.IMAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val imageItem =
            ImageItem.builder()
                .caption("caption")
                .md("md")
                .url("url")
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
                .type(ImageItem.Type.IMAGE)
                .build()

        val roundtrippedImageItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(imageItem),
                jacksonTypeRef<ImageItem>(),
            )

        assertThat(roundtrippedImageItem).isEqualTo(imageItem)
    }
}
