// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.llamacloud_prod.api.client.LlamaCloudClient
import com.llamacloud_prod.api.client.okhttp.LlamaCloudOkHttpClient
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.http.Headers
import com.llamacloud_prod.api.core.jsonMapper
import com.llamacloud_prod.api.errors.BadRequestException
import com.llamacloud_prod.api.errors.InternalServerException
import com.llamacloud_prod.api.errors.LlamaCloudException
import com.llamacloud_prod.api.errors.NotFoundException
import com.llamacloud_prod.api.errors.PermissionDeniedException
import com.llamacloud_prod.api.errors.RateLimitException
import com.llamacloud_prod.api.errors.UnauthorizedException
import com.llamacloud_prod.api.errors.UnexpectedStatusCodeException
import com.llamacloud_prod.api.errors.UnprocessableEntityException
import com.llamacloud_prod.api.models.pipelines.PipelineListParams
import com.llamacloud_prod.api.models.pipelines.PipelineType
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: LlamaCloudClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LlamaCloudOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun pipelinesList400() {
        val pipelineService = client.pipelines()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList400WithRawResponse() {
        val pipelineService = client.pipelines().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList401() {
        val pipelineService = client.pipelines()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList401WithRawResponse() {
        val pipelineService = client.pipelines().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList403() {
        val pipelineService = client.pipelines()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList403WithRawResponse() {
        val pipelineService = client.pipelines().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList404() {
        val pipelineService = client.pipelines()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList404WithRawResponse() {
        val pipelineService = client.pipelines().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList422() {
        val pipelineService = client.pipelines()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList422WithRawResponse() {
        val pipelineService = client.pipelines().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList429() {
        val pipelineService = client.pipelines()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList429WithRawResponse() {
        val pipelineService = client.pipelines().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList500() {
        val pipelineService = client.pipelines()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList500WithRawResponse() {
        val pipelineService = client.pipelines().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList999() {
        val pipelineService = client.pipelines()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesList999WithRawResponse() {
        val pipelineService = client.pipelines().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun pipelinesListInvalidJsonBody() {
        val pipelineService = client.pipelines()
        stubFor(
            get(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<LlamaCloudException> {
                pipelineService.list(
                    PipelineListParams.builder()
                        .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .pipelineName("pipeline_name")
                        .pipelineType(PipelineType.PLAYGROUND)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("project_name")
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
