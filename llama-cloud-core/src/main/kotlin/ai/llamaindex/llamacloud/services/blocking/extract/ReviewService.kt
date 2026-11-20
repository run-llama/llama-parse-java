// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.blocking.extract

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.extract.review.ExtractReview
import ai.llamaindex.llamacloud.models.extract.review.ReviewApproveParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewChangeFieldsParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewCreateParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewGetParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewListEventsPage
import ai.llamaindex.llamacloud.models.extract.review.ReviewListEventsParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewRejectParams
import ai.llamaindex.llamacloud.models.extract.review.ReviewReopenParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ReviewService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReviewService

    /**
     * Beta: answers 403 until extract review is enabled for the caller and their organization.
     *
     * Turn review on for an extract job.
     *
     * Fields read below `confidence_threshold`, and required fields left empty, are flagged for a
     * person to check. Every setting has a default, so the body can be left out. A job still
     * running can be named: it waits for review once it completes. A job that failed or was
     * cancelled without a review, or that cannot be reviewed, answers 409 with `code:
     * job_not_reviewable`; a field in `fields_in_scope` the job's schema does not have answers 400.
     *
     * Answers 201 with the new review, or 200 with the job's existing review, whose settings stay
     * as they are.
     */
    fun create(jobId: String): ExtractReview = create(jobId, ReviewCreateParams.none())

    /** @see create */
    fun create(
        jobId: String,
        params: ReviewCreateParams = ReviewCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractReview = create(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see create */
    fun create(
        jobId: String,
        params: ReviewCreateParams = ReviewCreateParams.none(),
    ): ExtractReview = create(jobId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ReviewCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractReview

    /** @see create */
    fun create(params: ReviewCreateParams): ExtractReview = create(params, RequestOptions.none())

    /** @see create */
    fun create(jobId: String, requestOptions: RequestOptions): ExtractReview =
        create(jobId, ReviewCreateParams.none(), requestOptions)

    /**
     * Beta: answers 403 until extract review is enabled for the caller and their organization.
     *
     * Approve the reviewed result.
     *
     * While flagged fields nobody checked remain, answers 409 with `code: open_flags` and their
     * `paths`, unless `sign_off` confirms them as part of approving. A job that has not completed
     * answers 409 with `code: job_not_reviewable`. A `revision` other than the review's latest
     * answers 409 with `code: stale_revision` and the latest `revision`.
     */
    fun approve(jobId: String, params: ReviewApproveParams): ExtractReview =
        approve(jobId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        jobId: String,
        params: ReviewApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractReview = approve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see approve */
    fun approve(params: ReviewApproveParams): ExtractReview = approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: ReviewApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractReview

    /**
     * Beta: answers 403 until extract review is enabled for the caller and their organization.
     *
     * Confirm, correct, clear, restore or undo fields of a completed job.
     *
     * The changes apply in order, in one write. A job without a review gets one with the default
     * settings, at revision 0. A path that is not a field of the job, or a value the field's schema
     * refuses, answers 400 and changes nothing. A job that has not completed answers 409 with
     * `code: job_not_reviewable`. A `revision` other than the review's latest answers 409 with
     * `code: stale_revision` and the latest `revision`.
     */
    fun changeFields(jobId: String, params: ReviewChangeFieldsParams): ExtractReview =
        changeFields(jobId, params, RequestOptions.none())

    /** @see changeFields */
    fun changeFields(
        jobId: String,
        params: ReviewChangeFieldsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractReview = changeFields(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see changeFields */
    fun changeFields(params: ReviewChangeFieldsParams): ExtractReview =
        changeFields(params, RequestOptions.none())

    /** @see changeFields */
    fun changeFields(
        params: ReviewChangeFieldsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractReview

    /**
     * Beta: answers 403 until extract review is enabled for the caller and their organization.
     *
     * Get an extract job's review: its flags, field actions and decision, with the result as the
     * model read it and as reviewed. A job without a review answers 404.
     */
    fun get(jobId: String): ExtractReview = get(jobId, ReviewGetParams.none())

    /** @see get */
    fun get(
        jobId: String,
        params: ReviewGetParams = ReviewGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractReview = get(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see get */
    fun get(jobId: String, params: ReviewGetParams = ReviewGetParams.none()): ExtractReview =
        get(jobId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ReviewGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractReview

    /** @see get */
    fun get(params: ReviewGetParams): ExtractReview = get(params, RequestOptions.none())

    /** @see get */
    fun get(jobId: String, requestOptions: RequestOptions): ExtractReview =
        get(jobId, ReviewGetParams.none(), requestOptions)

    /**
     * Beta: answers 403 until extract review is enabled for the caller and their organization.
     *
     * List a review's history, newest first.
     */
    fun listEvents(jobId: String): ReviewListEventsPage =
        listEvents(jobId, ReviewListEventsParams.none())

    /** @see listEvents */
    fun listEvents(
        jobId: String,
        params: ReviewListEventsParams = ReviewListEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReviewListEventsPage = listEvents(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see listEvents */
    fun listEvents(
        jobId: String,
        params: ReviewListEventsParams = ReviewListEventsParams.none(),
    ): ReviewListEventsPage = listEvents(jobId, params, RequestOptions.none())

    /** @see listEvents */
    fun listEvents(
        params: ReviewListEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReviewListEventsPage

    /** @see listEvents */
    fun listEvents(params: ReviewListEventsParams): ReviewListEventsPage =
        listEvents(params, RequestOptions.none())

    /** @see listEvents */
    fun listEvents(jobId: String, requestOptions: RequestOptions): ReviewListEventsPage =
        listEvents(jobId, ReviewListEventsParams.none(), requestOptions)

    /**
     * Beta: answers 403 until extract review is enabled for the caller and their organization.
     *
     * Reject the result, with a reason. A job that failed or was cancelled can be rejected, which
     * closes a review turned on while it ran. A job still queued or running answers 409 with `code:
     * job_not_reviewable`. A `revision` other than the review's latest answers 409 with `code:
     * stale_revision` and the latest `revision`.
     */
    fun reject(jobId: String, params: ReviewRejectParams): ExtractReview =
        reject(jobId, params, RequestOptions.none())

    /** @see reject */
    fun reject(
        jobId: String,
        params: ReviewRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractReview = reject(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see reject */
    fun reject(params: ReviewRejectParams): ExtractReview = reject(params, RequestOptions.none())

    /** @see reject */
    fun reject(
        params: ReviewRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractReview

    /**
     * Beta: answers 403 until extract review is enabled for the caller and their organization.
     *
     * Put an approved or rejected review back to pending. Its field actions stay.
     *
     * A `revision` other than the review's latest answers 409 with `code: stale_revision` and the
     * latest `revision`.
     */
    fun reopen(jobId: String, params: ReviewReopenParams): ExtractReview =
        reopen(jobId, params, RequestOptions.none())

    /** @see reopen */
    fun reopen(
        jobId: String,
        params: ReviewReopenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractReview = reopen(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see reopen */
    fun reopen(params: ReviewReopenParams): ExtractReview = reopen(params, RequestOptions.none())

    /** @see reopen */
    fun reopen(
        params: ReviewReopenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtractReview

    /** A view of [ReviewService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReviewService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/extract/{job_id}/review`, but is otherwise
         * the same as [ReviewService.create].
         */
        @MustBeClosed
        fun create(jobId: String): HttpResponseFor<ExtractReview> =
            create(jobId, ReviewCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            jobId: String,
            params: ReviewCreateParams = ReviewCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractReview> =
            create(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            jobId: String,
            params: ReviewCreateParams = ReviewCreateParams.none(),
        ): HttpResponseFor<ExtractReview> = create(jobId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ReviewCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractReview>

        /** @see create */
        @MustBeClosed
        fun create(params: ReviewCreateParams): HttpResponseFor<ExtractReview> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(jobId: String, requestOptions: RequestOptions): HttpResponseFor<ExtractReview> =
            create(jobId, ReviewCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/extract/{job_id}/review/approve`, but is
         * otherwise the same as [ReviewService.approve].
         */
        @MustBeClosed
        fun approve(jobId: String, params: ReviewApproveParams): HttpResponseFor<ExtractReview> =
            approve(jobId, params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            jobId: String,
            params: ReviewApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractReview> =
            approve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        fun approve(params: ReviewApproveParams): HttpResponseFor<ExtractReview> =
            approve(params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            params: ReviewApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractReview>

        /**
         * Returns a raw HTTP response for `post /api/v2/extract/{job_id}/review/fields`, but is
         * otherwise the same as [ReviewService.changeFields].
         */
        @MustBeClosed
        fun changeFields(
            jobId: String,
            params: ReviewChangeFieldsParams,
        ): HttpResponseFor<ExtractReview> = changeFields(jobId, params, RequestOptions.none())

        /** @see changeFields */
        @MustBeClosed
        fun changeFields(
            jobId: String,
            params: ReviewChangeFieldsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractReview> =
            changeFields(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see changeFields */
        @MustBeClosed
        fun changeFields(params: ReviewChangeFieldsParams): HttpResponseFor<ExtractReview> =
            changeFields(params, RequestOptions.none())

        /** @see changeFields */
        @MustBeClosed
        fun changeFields(
            params: ReviewChangeFieldsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractReview>

        /**
         * Returns a raw HTTP response for `get /api/v2/extract/{job_id}/review`, but is otherwise
         * the same as [ReviewService.get].
         */
        @MustBeClosed
        fun get(jobId: String): HttpResponseFor<ExtractReview> = get(jobId, ReviewGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            jobId: String,
            params: ReviewGetParams = ReviewGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractReview> =
            get(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            jobId: String,
            params: ReviewGetParams = ReviewGetParams.none(),
        ): HttpResponseFor<ExtractReview> = get(jobId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ReviewGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractReview>

        /** @see get */
        @MustBeClosed
        fun get(params: ReviewGetParams): HttpResponseFor<ExtractReview> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(jobId: String, requestOptions: RequestOptions): HttpResponseFor<ExtractReview> =
            get(jobId, ReviewGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/extract/{job_id}/review/events`, but is
         * otherwise the same as [ReviewService.listEvents].
         */
        @MustBeClosed
        fun listEvents(jobId: String): HttpResponseFor<ReviewListEventsPage> =
            listEvents(jobId, ReviewListEventsParams.none())

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            jobId: String,
            params: ReviewListEventsParams = ReviewListEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReviewListEventsPage> =
            listEvents(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            jobId: String,
            params: ReviewListEventsParams = ReviewListEventsParams.none(),
        ): HttpResponseFor<ReviewListEventsPage> = listEvents(jobId, params, RequestOptions.none())

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            params: ReviewListEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReviewListEventsPage>

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(params: ReviewListEventsParams): HttpResponseFor<ReviewListEventsPage> =
            listEvents(params, RequestOptions.none())

        /** @see listEvents */
        @MustBeClosed
        fun listEvents(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReviewListEventsPage> =
            listEvents(jobId, ReviewListEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/extract/{job_id}/review/reject`, but is
         * otherwise the same as [ReviewService.reject].
         */
        @MustBeClosed
        fun reject(jobId: String, params: ReviewRejectParams): HttpResponseFor<ExtractReview> =
            reject(jobId, params, RequestOptions.none())

        /** @see reject */
        @MustBeClosed
        fun reject(
            jobId: String,
            params: ReviewRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractReview> =
            reject(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see reject */
        @MustBeClosed
        fun reject(params: ReviewRejectParams): HttpResponseFor<ExtractReview> =
            reject(params, RequestOptions.none())

        /** @see reject */
        @MustBeClosed
        fun reject(
            params: ReviewRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractReview>

        /**
         * Returns a raw HTTP response for `post /api/v2/extract/{job_id}/review/reopen`, but is
         * otherwise the same as [ReviewService.reopen].
         */
        @MustBeClosed
        fun reopen(jobId: String, params: ReviewReopenParams): HttpResponseFor<ExtractReview> =
            reopen(jobId, params, RequestOptions.none())

        /** @see reopen */
        @MustBeClosed
        fun reopen(
            jobId: String,
            params: ReviewReopenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractReview> =
            reopen(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see reopen */
        @MustBeClosed
        fun reopen(params: ReviewReopenParams): HttpResponseFor<ExtractReview> =
            reopen(params, RequestOptions.none())

        /** @see reopen */
        @MustBeClosed
        fun reopen(
            params: ReviewReopenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtractReview>
    }
}
