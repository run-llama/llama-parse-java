// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BedrockEmbeddingConfigTest {

    @Test
    fun create() {
        val bedrockEmbeddingConfig =
            BedrockEmbeddingConfig.builder()
                .component(
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
                )
                .type(BedrockEmbeddingConfig.Type.BEDROCK_EMBEDDING)
                .build()

        assertThat(bedrockEmbeddingConfig.component())
            .contains(
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
            )
        assertThat(bedrockEmbeddingConfig.type())
            .contains(BedrockEmbeddingConfig.Type.BEDROCK_EMBEDDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bedrockEmbeddingConfig =
            BedrockEmbeddingConfig.builder()
                .component(
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
                )
                .type(BedrockEmbeddingConfig.Type.BEDROCK_EMBEDDING)
                .build()

        val roundtrippedBedrockEmbeddingConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bedrockEmbeddingConfig),
                jacksonTypeRef<BedrockEmbeddingConfig>(),
            )

        assertThat(roundtrippedBedrockEmbeddingConfig).isEqualTo(bedrockEmbeddingConfig)
    }
}
