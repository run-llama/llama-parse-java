// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentSyncResponseTest {

    @Test
    fun create() {
        val documentSyncResponse = DocumentSyncResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentSyncResponse = DocumentSyncResponse.builder().build()

        val roundtrippedDocumentSyncResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentSyncResponse),
                jacksonTypeRef<DocumentSyncResponse>(),
            )

        assertThat(roundtrippedDocumentSyncResponse).isEqualTo(documentSyncResponse)
    }
}
