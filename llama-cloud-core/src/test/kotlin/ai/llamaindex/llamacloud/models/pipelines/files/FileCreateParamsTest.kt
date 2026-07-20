// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines.files

import ai.llamaindex.llamacloud.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileCreateParamsTest {

    @Test
    fun create() {
        FileCreateParams.builder()
            .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addBody(
                FileCreateParams.Body.builder()
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customMetadata(
                        FileCreateParams.Body.CustomMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FileCreateParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    FileCreateParams.Body.builder()
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FileCreateParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    FileCreateParams.Body.builder()
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .customMetadata(
                            FileCreateParams.Body.CustomMetadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                FileCreateParams.Body.builder()
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customMetadata(
                        FileCreateParams.Body.CustomMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "bar")))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FileCreateParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    FileCreateParams.Body.builder()
                        .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                FileCreateParams.Body.builder()
                    .fileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
