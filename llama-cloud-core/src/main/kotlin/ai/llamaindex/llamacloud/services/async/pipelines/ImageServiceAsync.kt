// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.services.async.pipelines

import ai.llamaindex.llamacloud.core.ClientOptions
import ai.llamaindex.llamacloud.core.RequestOptions
import ai.llamaindex.llamacloud.core.http.HttpResponseFor
import ai.llamaindex.llamacloud.models.pipelines.images.ImageGetPageFigureParams
import ai.llamaindex.llamacloud.models.pipelines.images.ImageGetPageFigureResponse
import ai.llamaindex.llamacloud.models.pipelines.images.ImageGetPageScreenshotParams
import ai.llamaindex.llamacloud.models.pipelines.images.ImageGetPageScreenshotResponse
import ai.llamaindex.llamacloud.models.pipelines.images.ImageListPageFiguresParams
import ai.llamaindex.llamacloud.models.pipelines.images.ImageListPageFiguresResponse
import ai.llamaindex.llamacloud.models.pipelines.images.ImageListPageScreenshotsParams
import ai.llamaindex.llamacloud.models.pipelines.images.ImageListPageScreenshotsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ImageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ImageServiceAsync

    /** Get a specific figure from a page of a file. */
    fun getPageFigure(
        figureName: String,
        params: ImageGetPageFigureParams,
    ): CompletableFuture<ImageGetPageFigureResponse> =
        getPageFigure(figureName, params, RequestOptions.none())

    /** @see getPageFigure */
    fun getPageFigure(
        figureName: String,
        params: ImageGetPageFigureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImageGetPageFigureResponse> =
        getPageFigure(params.toBuilder().figureName(figureName).build(), requestOptions)

    /** @see getPageFigure */
    fun getPageFigure(
        params: ImageGetPageFigureParams
    ): CompletableFuture<ImageGetPageFigureResponse> = getPageFigure(params, RequestOptions.none())

    /** @see getPageFigure */
    fun getPageFigure(
        params: ImageGetPageFigureParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImageGetPageFigureResponse>

    /** Get screenshot of a page from a file. */
    fun getPageScreenshot(
        pageIndex: Long,
        params: ImageGetPageScreenshotParams,
    ): CompletableFuture<ImageGetPageScreenshotResponse> =
        getPageScreenshot(pageIndex, params, RequestOptions.none())

    /** @see getPageScreenshot */
    fun getPageScreenshot(
        pageIndex: Long,
        params: ImageGetPageScreenshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImageGetPageScreenshotResponse> =
        getPageScreenshot(params.toBuilder().pageIndex(pageIndex).build(), requestOptions)

    /** @see getPageScreenshot */
    fun getPageScreenshot(
        params: ImageGetPageScreenshotParams
    ): CompletableFuture<ImageGetPageScreenshotResponse> =
        getPageScreenshot(params, RequestOptions.none())

    /** @see getPageScreenshot */
    fun getPageScreenshot(
        params: ImageGetPageScreenshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImageGetPageScreenshotResponse>

    /** List metadata for all figures from all pages of a file. */
    fun listPageFigures(id: String): CompletableFuture<List<ImageListPageFiguresResponse>> =
        listPageFigures(id, ImageListPageFiguresParams.none())

    /** @see listPageFigures */
    fun listPageFigures(
        id: String,
        params: ImageListPageFiguresParams = ImageListPageFiguresParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ImageListPageFiguresResponse>> =
        listPageFigures(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPageFigures */
    fun listPageFigures(
        id: String,
        params: ImageListPageFiguresParams = ImageListPageFiguresParams.none(),
    ): CompletableFuture<List<ImageListPageFiguresResponse>> =
        listPageFigures(id, params, RequestOptions.none())

    /** @see listPageFigures */
    fun listPageFigures(
        params: ImageListPageFiguresParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ImageListPageFiguresResponse>>

    /** @see listPageFigures */
    fun listPageFigures(
        params: ImageListPageFiguresParams
    ): CompletableFuture<List<ImageListPageFiguresResponse>> =
        listPageFigures(params, RequestOptions.none())

    /** @see listPageFigures */
    fun listPageFigures(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ImageListPageFiguresResponse>> =
        listPageFigures(id, ImageListPageFiguresParams.none(), requestOptions)

    /** List metadata for all screenshots of pages from a file. */
    fun listPageScreenshots(id: String): CompletableFuture<List<ImageListPageScreenshotsResponse>> =
        listPageScreenshots(id, ImageListPageScreenshotsParams.none())

    /** @see listPageScreenshots */
    fun listPageScreenshots(
        id: String,
        params: ImageListPageScreenshotsParams = ImageListPageScreenshotsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ImageListPageScreenshotsResponse>> =
        listPageScreenshots(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPageScreenshots */
    fun listPageScreenshots(
        id: String,
        params: ImageListPageScreenshotsParams = ImageListPageScreenshotsParams.none(),
    ): CompletableFuture<List<ImageListPageScreenshotsResponse>> =
        listPageScreenshots(id, params, RequestOptions.none())

    /** @see listPageScreenshots */
    fun listPageScreenshots(
        params: ImageListPageScreenshotsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ImageListPageScreenshotsResponse>>

    /** @see listPageScreenshots */
    fun listPageScreenshots(
        params: ImageListPageScreenshotsParams
    ): CompletableFuture<List<ImageListPageScreenshotsResponse>> =
        listPageScreenshots(params, RequestOptions.none())

    /** @see listPageScreenshots */
    fun listPageScreenshots(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ImageListPageScreenshotsResponse>> =
        listPageScreenshots(id, ImageListPageScreenshotsParams.none(), requestOptions)

    /** A view of [ImageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ImageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/files/{id}/page-figures/{page_index}/{figure_name}`, but is otherwise the same as
         * [ImageServiceAsync.getPageFigure].
         */
        fun getPageFigure(
            figureName: String,
            params: ImageGetPageFigureParams,
        ): CompletableFuture<HttpResponseFor<ImageGetPageFigureResponse>> =
            getPageFigure(figureName, params, RequestOptions.none())

        /** @see getPageFigure */
        fun getPageFigure(
            figureName: String,
            params: ImageGetPageFigureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImageGetPageFigureResponse>> =
            getPageFigure(params.toBuilder().figureName(figureName).build(), requestOptions)

        /** @see getPageFigure */
        fun getPageFigure(
            params: ImageGetPageFigureParams
        ): CompletableFuture<HttpResponseFor<ImageGetPageFigureResponse>> =
            getPageFigure(params, RequestOptions.none())

        /** @see getPageFigure */
        fun getPageFigure(
            params: ImageGetPageFigureParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImageGetPageFigureResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/files/{id}/page_screenshots/{page_index}`,
         * but is otherwise the same as [ImageServiceAsync.getPageScreenshot].
         */
        fun getPageScreenshot(
            pageIndex: Long,
            params: ImageGetPageScreenshotParams,
        ): CompletableFuture<HttpResponseFor<ImageGetPageScreenshotResponse>> =
            getPageScreenshot(pageIndex, params, RequestOptions.none())

        /** @see getPageScreenshot */
        fun getPageScreenshot(
            pageIndex: Long,
            params: ImageGetPageScreenshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImageGetPageScreenshotResponse>> =
            getPageScreenshot(params.toBuilder().pageIndex(pageIndex).build(), requestOptions)

        /** @see getPageScreenshot */
        fun getPageScreenshot(
            params: ImageGetPageScreenshotParams
        ): CompletableFuture<HttpResponseFor<ImageGetPageScreenshotResponse>> =
            getPageScreenshot(params, RequestOptions.none())

        /** @see getPageScreenshot */
        fun getPageScreenshot(
            params: ImageGetPageScreenshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImageGetPageScreenshotResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/files/{id}/page-figures`, but is otherwise
         * the same as [ImageServiceAsync.listPageFigures].
         */
        fun listPageFigures(
            id: String
        ): CompletableFuture<HttpResponseFor<List<ImageListPageFiguresResponse>>> =
            listPageFigures(id, ImageListPageFiguresParams.none())

        /** @see listPageFigures */
        fun listPageFigures(
            id: String,
            params: ImageListPageFiguresParams = ImageListPageFiguresParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ImageListPageFiguresResponse>>> =
            listPageFigures(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPageFigures */
        fun listPageFigures(
            id: String,
            params: ImageListPageFiguresParams = ImageListPageFiguresParams.none(),
        ): CompletableFuture<HttpResponseFor<List<ImageListPageFiguresResponse>>> =
            listPageFigures(id, params, RequestOptions.none())

        /** @see listPageFigures */
        fun listPageFigures(
            params: ImageListPageFiguresParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ImageListPageFiguresResponse>>>

        /** @see listPageFigures */
        fun listPageFigures(
            params: ImageListPageFiguresParams
        ): CompletableFuture<HttpResponseFor<List<ImageListPageFiguresResponse>>> =
            listPageFigures(params, RequestOptions.none())

        /** @see listPageFigures */
        fun listPageFigures(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ImageListPageFiguresResponse>>> =
            listPageFigures(id, ImageListPageFiguresParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/files/{id}/page_screenshots`, but is
         * otherwise the same as [ImageServiceAsync.listPageScreenshots].
         */
        fun listPageScreenshots(
            id: String
        ): CompletableFuture<HttpResponseFor<List<ImageListPageScreenshotsResponse>>> =
            listPageScreenshots(id, ImageListPageScreenshotsParams.none())

        /** @see listPageScreenshots */
        fun listPageScreenshots(
            id: String,
            params: ImageListPageScreenshotsParams = ImageListPageScreenshotsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ImageListPageScreenshotsResponse>>> =
            listPageScreenshots(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPageScreenshots */
        fun listPageScreenshots(
            id: String,
            params: ImageListPageScreenshotsParams = ImageListPageScreenshotsParams.none(),
        ): CompletableFuture<HttpResponseFor<List<ImageListPageScreenshotsResponse>>> =
            listPageScreenshots(id, params, RequestOptions.none())

        /** @see listPageScreenshots */
        fun listPageScreenshots(
            params: ImageListPageScreenshotsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ImageListPageScreenshotsResponse>>>

        /** @see listPageScreenshots */
        fun listPageScreenshots(
            params: ImageListPageScreenshotsParams
        ): CompletableFuture<HttpResponseFor<List<ImageListPageScreenshotsResponse>>> =
            listPageScreenshots(params, RequestOptions.none())

        /** @see listPageScreenshots */
        fun listPageScreenshots(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ImageListPageScreenshotsResponse>>> =
            listPageScreenshots(id, ImageListPageScreenshotsParams.none(), requestOptions)
    }
}
