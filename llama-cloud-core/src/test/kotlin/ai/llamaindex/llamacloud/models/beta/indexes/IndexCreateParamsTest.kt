// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.beta.indexes

import ai.llamaindex.llamacloud.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexCreateParamsTest {

    @Test
    fun create() {
        IndexCreateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sourceDirectoryId("dir-abc123")
            .description("description")
            .name("name")
            .addProduct(
                IndexCreateParams.Product.builder()
                    .productConfigId("cfg-abc123")
                    .productType("parse")
                    .build()
            )
            .addStoreAttachment("screenshots")
            .syncFrequency("manual")
            .vectorTarget(IndexCreateParams.VectorTarget.DEFAULT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IndexCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceDirectoryId("dir-abc123")
                .description("description")
                .name("name")
                .addProduct(
                    IndexCreateParams.Product.builder()
                        .productConfigId("cfg-abc123")
                        .productType("parse")
                        .build()
                )
                .addStoreAttachment("screenshots")
                .syncFrequency("manual")
                .vectorTarget(IndexCreateParams.VectorTarget.DEFAULT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("organization_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IndexCreateParams.builder().sourceDirectoryId("dir-abc123").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            IndexCreateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceDirectoryId("dir-abc123")
                .description("description")
                .name("name")
                .addProduct(
                    IndexCreateParams.Product.builder()
                        .productConfigId("cfg-abc123")
                        .productType("parse")
                        .build()
                )
                .addStoreAttachment("screenshots")
                .syncFrequency("manual")
                .vectorTarget(IndexCreateParams.VectorTarget.DEFAULT)
                .build()

        val body = params._body()

        assertThat(body.sourceDirectoryId()).isEqualTo("dir-abc123")
        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
        assertThat(body.products().getOrNull())
            .containsExactly(
                IndexCreateParams.Product.builder()
                    .productConfigId("cfg-abc123")
                    .productType("parse")
                    .build()
            )
        assertThat(body.storeAttachments().getOrNull()).containsExactly("screenshots")
        assertThat(body.syncFrequency()).contains("manual")
        assertThat(body.vectorTarget()).contains(IndexCreateParams.VectorTarget.DEFAULT)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = IndexCreateParams.builder().sourceDirectoryId("dir-abc123").build()

        val body = params._body()

        assertThat(body.sourceDirectoryId()).isEqualTo("dir-abc123")
    }
}
