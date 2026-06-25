// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BedrockEmbeddingTest {

    @Test
    fun create() {
        val bedrockEmbedding =
            BedrockEmbedding.builder()
                .additionalKwargs(
                    BedrockEmbedding.AdditionalKwargs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .awsAccessKeyId("aws_access_key_id")
                .awsSecretAccessKey("aws_secret_access_key")
                .awsSessionToken("aws_session_token")
                .className("class_name")
                .embedBatchSize(1L)
                .maxRetries(1L)
                .modelName("model_name")
                .numWorkers(0L)
                .profileName("profile_name")
                .regionName("region_name")
                .timeout(0.0)
                .build()

        assertThat(bedrockEmbedding.additionalKwargs())
            .contains(
                BedrockEmbedding.AdditionalKwargs.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(bedrockEmbedding.awsAccessKeyId()).contains("aws_access_key_id")
        assertThat(bedrockEmbedding.awsSecretAccessKey()).contains("aws_secret_access_key")
        assertThat(bedrockEmbedding.awsSessionToken()).contains("aws_session_token")
        assertThat(bedrockEmbedding.className()).contains("class_name")
        assertThat(bedrockEmbedding.embedBatchSize()).contains(1L)
        assertThat(bedrockEmbedding.maxRetries()).contains(1L)
        assertThat(bedrockEmbedding.modelName()).contains("model_name")
        assertThat(bedrockEmbedding.numWorkers()).contains(0L)
        assertThat(bedrockEmbedding.profileName()).contains("profile_name")
        assertThat(bedrockEmbedding.regionName()).contains("region_name")
        assertThat(bedrockEmbedding.timeout()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bedrockEmbedding =
            BedrockEmbedding.builder()
                .additionalKwargs(
                    BedrockEmbedding.AdditionalKwargs.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .awsAccessKeyId("aws_access_key_id")
                .awsSecretAccessKey("aws_secret_access_key")
                .awsSessionToken("aws_session_token")
                .className("class_name")
                .embedBatchSize(1L)
                .maxRetries(1L)
                .modelName("model_name")
                .numWorkers(0L)
                .profileName("profile_name")
                .regionName("region_name")
                .timeout(0.0)
                .build()

        val roundtrippedBedrockEmbedding =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bedrockEmbedding),
                jacksonTypeRef<BedrockEmbedding>(),
            )

        assertThat(roundtrippedBedrockEmbedding).isEqualTo(bedrockEmbedding)
    }
}
