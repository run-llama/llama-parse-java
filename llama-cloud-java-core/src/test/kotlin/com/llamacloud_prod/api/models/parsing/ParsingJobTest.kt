// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParsingJobTest {

    @Test
    fun create() {
        val parsingJob =
            ParsingJob.builder()
                .id("id")
                .status(StatusEnum.PENDING)
                .errorCode("error_code")
                .errorMessage("error_message")
                .build()

        assertThat(parsingJob.id()).isEqualTo("id")
        assertThat(parsingJob.status()).isEqualTo(StatusEnum.PENDING)
        assertThat(parsingJob.errorCode()).contains("error_code")
        assertThat(parsingJob.errorMessage()).contains("error_message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val parsingJob =
            ParsingJob.builder()
                .id("id")
                .status(StatusEnum.PENDING)
                .errorCode("error_code")
                .errorMessage("error_message")
                .build()

        val roundtrippedParsingJob =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parsingJob),
                jacksonTypeRef<ParsingJob>(),
            )

        assertThat(roundtrippedParsingJob).isEqualTo(parsingJob)
    }
}
