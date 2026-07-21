// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.proguard

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.jsonMapper
import ai.llamaindex.llamacloud.models.beta.indexes.IndexCreateResponse
import ai.llamaindex.llamacloud.models.parsing.FailPageMode
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
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
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/llama-cloud-core.pro")

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
    fun indexCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val indexCreateResponse =
            IndexCreateResponse.builder()
                .id("id")
                .exportConfigId("export_config_id")
                .name("name")
                .outputDirectoryId("output_directory_id")
                .projectId("project_id")
                .sourceDirectoryId("source_directory_id")
                .syncConfigId("sync_config_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .lastExportedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastSyncedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    IndexCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedIndexCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexCreateResponse),
                jacksonTypeRef<IndexCreateResponse>(),
            )

        assertThat(roundtrippedIndexCreateResponse).isEqualTo(indexCreateResponse)
    }

    @Test
    fun failPageModeRoundtrip() {
        val jsonMapper = jsonMapper()
        val failPageMode = FailPageMode.BLANK_PAGE

        val roundtrippedFailPageMode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(failPageMode),
                jacksonTypeRef<FailPageMode>(),
            )

        assertThat(roundtrippedFailPageMode).isEqualTo(failPageMode)
    }
}
