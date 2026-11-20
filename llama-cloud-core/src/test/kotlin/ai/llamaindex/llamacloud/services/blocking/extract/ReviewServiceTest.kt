// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.extract

import ai.llamaindex.llamacloud.client.okhttp.LlamaCloudOkHttpClient
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.models.extract.review.ReviewApproveParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewChangeFieldsParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewCreateParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewGetParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewRejectParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewReopenParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ReviewServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val reviewService = client.extract().review()

        val extractReview =
            reviewService.create(
                ReviewCreateParams.builder()
                    .jobId("job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .confidenceThreshold(0.8)
                    .addFieldsInScope("/total")
                    .addFieldsInScope("/vendor/name")
                    .addRequiredField("/vendor/name")
                    .build()
            )

        extractReview.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun approve() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val reviewService = client.extract().review()

        val extractReview =
            reviewService.approve(
                ReviewApproveParams.builder()
                    .jobId("job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .revision(0L)
                    .signOff(true)
                    .build()
            )

        extractReview.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun changeFields() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val reviewService = client.extract().review()

        val extractReview =
            reviewService.changeFields(
                ReviewChangeFieldsParams.builder()
                    .jobId("job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addChange(
                        ReviewChangeFieldsParams.Change.builder()
                            .change(ReviewChangeFieldsParams.Change.InnerChange.CORRECT)
                            .path("/total")
                            .value(JsonValue.from(1250.5))
                            .build()
                    )
                    .revision(0L)
                    .build()
            )

        extractReview.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val reviewService = client.extract().review()

        val extractReview =
            reviewService.get(
                ReviewGetParams.builder()
                    .jobId("job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        extractReview.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEvents() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val reviewService = client.extract().review()

        val page = reviewService.listEvents("job_id")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reject() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val reviewService = client.extract().review()

        val extractReview =
            reviewService.reject(
                ReviewRejectParams.builder()
                    .jobId("job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .reason("The invoice total does not match the line items.")
                    .revision(0L)
                    .build()
            )

        extractReview.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun reopen() {
        val client = LlamaCloudOkHttpClient.builder().apiKey("My API Key").build()
        val reviewService = client.extract().review()

        val extractReview =
            reviewService.reopen(
                ReviewReopenParams.builder()
                    .jobId("job_id")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .revision(0L)
                    .build()
            )

        extractReview.validate()
    }
}
