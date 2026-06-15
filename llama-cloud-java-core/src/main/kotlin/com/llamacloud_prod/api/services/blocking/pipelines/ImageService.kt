// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.services.blocking.pipelines

import com.google.errorprone.annotations.MustBeClosed
import com.llamacloud_prod.api.core.ClientOptions
import com.llamacloud_prod.api.core.RequestOptions
import com.llamacloud_prod.api.core.http.HttpResponseFor
import com.llamacloud_prod.api.models.pipelines.images.ImageGetPageFigureParams
import com.llamacloud_prod.api.models.pipelines.images.ImageGetPageFigureResponse
import com.llamacloud_prod.api.models.pipelines.images.ImageGetPageScreenshotParams
import com.llamacloud_prod.api.models.pipelines.images.ImageGetPageScreenshotResponse
import com.llamacloud_prod.api.models.pipelines.images.ImageListPageFiguresParams
import com.llamacloud_prod.api.models.pipelines.images.ImageListPageFiguresResponse
import com.llamacloud_prod.api.models.pipelines.images.ImageListPageScreenshotsParams
import com.llamacloud_prod.api.models.pipelines.images.ImageListPageScreenshotsResponse
import java.util.function.Consumer

interface ImageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImageService

    /** Get a specific figure from a page of a file. */
    fun getPageFigure(
        figureName: String,
        params: ImageGetPageFigureParams,
    ): ImageGetPageFigureResponse = getPageFigure(figureName, params, RequestOptions.none())

    /** @see getPageFigure */
    fun getPageFigure(
        figureName: String,
        params: ImageGetPageFigureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImageGetPageFigureResponse =
        getPageFigure(params.toBuilder().figureName(figureName).build(), requestOptions)

    /** @see getPageFigure */
    fun getPageFigure(params: ImageGetPageFigureParams): ImageGetPageFigureResponse =
        getPageFigure(params, RequestOptions.none())

    /** @see getPageFigure */
    fun getPageFigure(
        params: ImageGetPageFigureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImageGetPageFigureResponse

    /** Get screenshot of a page from a file. */
    fun getPageScreenshot(
        pageIndex: Long,
        params: ImageGetPageScreenshotParams,
    ): ImageGetPageScreenshotResponse = getPageScreenshot(pageIndex, params, RequestOptions.none())

    /** @see getPageScreenshot */
    fun getPageScreenshot(
        pageIndex: Long,
        params: ImageGetPageScreenshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImageGetPageScreenshotResponse =
        getPageScreenshot(params.toBuilder().pageIndex(pageIndex).build(), requestOptions)

    /** @see getPageScreenshot */
    fun getPageScreenshot(params: ImageGetPageScreenshotParams): ImageGetPageScreenshotResponse =
        getPageScreenshot(params, RequestOptions.none())

    /** @see getPageScreenshot */
    fun getPageScreenshot(
        params: ImageGetPageScreenshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImageGetPageScreenshotResponse

    /** List metadata for all figures from all pages of a file. */
    fun listPageFigures(id: String): List<ImageListPageFiguresResponse> =
        listPageFigures(id, ImageListPageFiguresParams.none())

    /** @see listPageFigures */
    fun listPageFigures(
        id: String,
        params: ImageListPageFiguresParams = ImageListPageFiguresParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ImageListPageFiguresResponse> =
        listPageFigures(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPageFigures */
    fun listPageFigures(
        id: String,
        params: ImageListPageFiguresParams = ImageListPageFiguresParams.none(),
    ): List<ImageListPageFiguresResponse> = listPageFigures(id, params, RequestOptions.none())

    /** @see listPageFigures */
    fun listPageFigures(
        params: ImageListPageFiguresParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ImageListPageFiguresResponse>

    /** @see listPageFigures */
    fun listPageFigures(params: ImageListPageFiguresParams): List<ImageListPageFiguresResponse> =
        listPageFigures(params, RequestOptions.none())

    /** @see listPageFigures */
    fun listPageFigures(
        id: String,
        requestOptions: RequestOptions,
    ): List<ImageListPageFiguresResponse> =
        listPageFigures(id, ImageListPageFiguresParams.none(), requestOptions)

    /** List metadata for all screenshots of pages from a file. */
    fun listPageScreenshots(id: String): List<ImageListPageScreenshotsResponse> =
        listPageScreenshots(id, ImageListPageScreenshotsParams.none())

    /** @see listPageScreenshots */
    fun listPageScreenshots(
        id: String,
        params: ImageListPageScreenshotsParams = ImageListPageScreenshotsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ImageListPageScreenshotsResponse> =
        listPageScreenshots(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPageScreenshots */
    fun listPageScreenshots(
        id: String,
        params: ImageListPageScreenshotsParams = ImageListPageScreenshotsParams.none(),
    ): List<ImageListPageScreenshotsResponse> =
        listPageScreenshots(id, params, RequestOptions.none())

    /** @see listPageScreenshots */
    fun listPageScreenshots(
        params: ImageListPageScreenshotsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ImageListPageScreenshotsResponse>

    /** @see listPageScreenshots */
    fun listPageScreenshots(
        params: ImageListPageScreenshotsParams
    ): List<ImageListPageScreenshotsResponse> = listPageScreenshots(params, RequestOptions.none())

    /** @see listPageScreenshots */
    fun listPageScreenshots(
        id: String,
        requestOptions: RequestOptions,
    ): List<ImageListPageScreenshotsResponse> =
        listPageScreenshots(id, ImageListPageScreenshotsParams.none(), requestOptions)

    /** A view of [ImageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/files/{id}/page-figures/{page_index}/{figure_name}`, but is otherwise the same as
         * [ImageService.getPageFigure].
         */
        @MustBeClosed
        fun getPageFigure(
            figureName: String,
            params: ImageGetPageFigureParams,
        ): HttpResponseFor<ImageGetPageFigureResponse> =
            getPageFigure(figureName, params, RequestOptions.none())

        /** @see getPageFigure */
        @MustBeClosed
        fun getPageFigure(
            figureName: String,
            params: ImageGetPageFigureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImageGetPageFigureResponse> =
            getPageFigure(params.toBuilder().figureName(figureName).build(), requestOptions)

        /** @see getPageFigure */
        @MustBeClosed
        fun getPageFigure(
            params: ImageGetPageFigureParams
        ): HttpResponseFor<ImageGetPageFigureResponse> =
            getPageFigure(params, RequestOptions.none())

        /** @see getPageFigure */
        @MustBeClosed
        fun getPageFigure(
            params: ImageGetPageFigureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImageGetPageFigureResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/files/{id}/page_screenshots/{page_index}`,
         * but is otherwise the same as [ImageService.getPageScreenshot].
         */
        @MustBeClosed
        fun getPageScreenshot(
            pageIndex: Long,
            params: ImageGetPageScreenshotParams,
        ): HttpResponseFor<ImageGetPageScreenshotResponse> =
            getPageScreenshot(pageIndex, params, RequestOptions.none())

        /** @see getPageScreenshot */
        @MustBeClosed
        fun getPageScreenshot(
            pageIndex: Long,
            params: ImageGetPageScreenshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImageGetPageScreenshotResponse> =
            getPageScreenshot(params.toBuilder().pageIndex(pageIndex).build(), requestOptions)

        /** @see getPageScreenshot */
        @MustBeClosed
        fun getPageScreenshot(
            params: ImageGetPageScreenshotParams
        ): HttpResponseFor<ImageGetPageScreenshotResponse> =
            getPageScreenshot(params, RequestOptions.none())

        /** @see getPageScreenshot */
        @MustBeClosed
        fun getPageScreenshot(
            params: ImageGetPageScreenshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImageGetPageScreenshotResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/files/{id}/page-figures`, but is otherwise
         * the same as [ImageService.listPageFigures].
         */
        @MustBeClosed
        fun listPageFigures(id: String): HttpResponseFor<List<ImageListPageFiguresResponse>> =
            listPageFigures(id, ImageListPageFiguresParams.none())

        /** @see listPageFigures */
        @MustBeClosed
        fun listPageFigures(
            id: String,
            params: ImageListPageFiguresParams = ImageListPageFiguresParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ImageListPageFiguresResponse>> =
            listPageFigures(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPageFigures */
        @MustBeClosed
        fun listPageFigures(
            id: String,
            params: ImageListPageFiguresParams = ImageListPageFiguresParams.none(),
        ): HttpResponseFor<List<ImageListPageFiguresResponse>> =
            listPageFigures(id, params, RequestOptions.none())

        /** @see listPageFigures */
        @MustBeClosed
        fun listPageFigures(
            params: ImageListPageFiguresParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ImageListPageFiguresResponse>>

        /** @see listPageFigures */
        @MustBeClosed
        fun listPageFigures(
            params: ImageListPageFiguresParams
        ): HttpResponseFor<List<ImageListPageFiguresResponse>> =
            listPageFigures(params, RequestOptions.none())

        /** @see listPageFigures */
        @MustBeClosed
        fun listPageFigures(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ImageListPageFiguresResponse>> =
            listPageFigures(id, ImageListPageFiguresParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/files/{id}/page_screenshots`, but is
         * otherwise the same as [ImageService.listPageScreenshots].
         */
        @MustBeClosed
        fun listPageScreenshots(
            id: String
        ): HttpResponseFor<List<ImageListPageScreenshotsResponse>> =
            listPageScreenshots(id, ImageListPageScreenshotsParams.none())

        /** @see listPageScreenshots */
        @MustBeClosed
        fun listPageScreenshots(
            id: String,
            params: ImageListPageScreenshotsParams = ImageListPageScreenshotsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ImageListPageScreenshotsResponse>> =
            listPageScreenshots(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPageScreenshots */
        @MustBeClosed
        fun listPageScreenshots(
            id: String,
            params: ImageListPageScreenshotsParams = ImageListPageScreenshotsParams.none(),
        ): HttpResponseFor<List<ImageListPageScreenshotsResponse>> =
            listPageScreenshots(id, params, RequestOptions.none())

        /** @see listPageScreenshots */
        @MustBeClosed
        fun listPageScreenshots(
            params: ImageListPageScreenshotsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ImageListPageScreenshotsResponse>>

        /** @see listPageScreenshots */
        @MustBeClosed
        fun listPageScreenshots(
            params: ImageListPageScreenshotsParams
        ): HttpResponseFor<List<ImageListPageScreenshotsResponse>> =
            listPageScreenshots(params, RequestOptions.none())

        /** @see listPageScreenshots */
        @MustBeClosed
        fun listPageScreenshots(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ImageListPageScreenshotsResponse>> =
            listPageScreenshots(id, ImageListPageScreenshotsParams.none(), requestOptions)
    }
}
