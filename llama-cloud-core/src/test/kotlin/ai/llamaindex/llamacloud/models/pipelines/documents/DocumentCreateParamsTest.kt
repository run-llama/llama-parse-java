// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.documents

import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentCreateParamsTest {

    @Test
    fun create() {
        DocumentCreateParams.builder()
            .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addBody(
                CloudDocumentCreate.builder()
                    .metadata(
                        CloudDocumentCreate.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .text("text")
                    .id("id")
                    .addExcludedEmbedMetadataKey("string")
                    .addExcludedLlmMetadataKey("string")
                    .addPagePosition(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DocumentCreateParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    CloudDocumentCreate.builder()
                        .metadata(
                            CloudDocumentCreate.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .text("text")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DocumentCreateParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    CloudDocumentCreate.builder()
                        .metadata(
                            CloudDocumentCreate.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .text("text")
                        .id("id")
                        .addExcludedEmbedMetadataKey("string")
                        .addExcludedLlmMetadataKey("string")
                        .addPagePosition(0L)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DocumentCreateParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    CloudDocumentCreate.builder()
                        .metadata(
                            CloudDocumentCreate.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .text("text")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            DocumentCreateParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    CloudDocumentCreate.builder()
                        .metadata(
                            CloudDocumentCreate.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .text("text")
                        .id("id")
                        .addExcludedEmbedMetadataKey("string")
                        .addExcludedLlmMetadataKey("string")
                        .addPagePosition(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                CloudDocumentCreate.builder()
                    .metadata(
                        CloudDocumentCreate.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .text("text")
                    .id("id")
                    .addExcludedEmbedMetadataKey("string")
                    .addExcludedLlmMetadataKey("string")
                    .addPagePosition(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentCreateParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    CloudDocumentCreate.builder()
                        .metadata(
                            CloudDocumentCreate.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .text("text")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                CloudDocumentCreate.builder()
                    .metadata(
                        CloudDocumentCreate.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .text("text")
                    .build()
            )
    }
}
