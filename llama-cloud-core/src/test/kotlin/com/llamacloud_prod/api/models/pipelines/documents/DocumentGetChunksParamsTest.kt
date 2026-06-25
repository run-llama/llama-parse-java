// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentGetChunksParamsTest {

    @Test
    fun create() {
        DocumentGetChunksParams.builder()
            .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .documentId("document_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DocumentGetChunksParams.builder()
                .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentId("document_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("document_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
