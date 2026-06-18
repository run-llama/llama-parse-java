// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.models.pipelines.AdvancedModeTransformConfig
import com.llamacloud_prod.api.models.pipelines.MessageRole
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/llama-cloud-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.files()).isNotNull()
        assertThat(client.sheets()).isNotNull()
        assertThat(client.parsing()).isNotNull()
        assertThat(client.extract()).isNotNull()
        assertThat(client.classifier()).isNotNull()
        assertThat(client.batches()).isNotNull()
        assertThat(client.classify()).isNotNull()
        assertThat(client.configurations()).isNotNull()
        assertThat(client.projects()).isNotNull()
        assertThat(client.dataSinks()).isNotNull()
        assertThat(client.dataSources()).isNotNull()
        assertThat(client.pipelines()).isNotNull()
        assertThat(client.retrievers()).isNotNull()
        assertThat(client.beta()).isNotNull()
    }

    @Test
    fun advancedModeTransformConfigRoundtrip() {
        val jsonMapper = jsonMapper()
        val advancedModeTransformConfig =
            AdvancedModeTransformConfig.builder()
                .chunkingConfig(
                    AdvancedModeTransformConfig.ChunkingConfig.NoneChunkingConfig.builder()
                        .mode(
                            AdvancedModeTransformConfig.ChunkingConfig.NoneChunkingConfig.Mode.NONE
                        )
                        .build()
                )
                .mode(AdvancedModeTransformConfig.Mode.ADVANCED)
                .segmentationConfig(
                    AdvancedModeTransformConfig.SegmentationConfig.NoneSegmentationConfig.builder()
                        .mode(
                            AdvancedModeTransformConfig.SegmentationConfig.NoneSegmentationConfig
                                .Mode
                                .NONE
                        )
                        .build()
                )
                .build()

        val roundtrippedAdvancedModeTransformConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(advancedModeTransformConfig),
                jacksonTypeRef<AdvancedModeTransformConfig>(),
            )

        assertThat(roundtrippedAdvancedModeTransformConfig).isEqualTo(advancedModeTransformConfig)
    }

    @Test
    fun messageRoleRoundtrip() {
        val jsonMapper = jsonMapper()
        val messageRole = MessageRole.SYSTEM

        val roundtrippedMessageRole =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageRole),
                jacksonTypeRef<MessageRole>(),
            )

        assertThat(roundtrippedMessageRole).isEqualTo(messageRole)
    }
}
