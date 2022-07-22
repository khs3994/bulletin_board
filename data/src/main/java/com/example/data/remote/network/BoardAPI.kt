package com.example.data.remote.network

import com.example.data.remote.dto.board.request.DataPostCreatePostRequest
import com.example.data.remote.dto.board.request.DataPutPostRequest
import com.example.data.remote.dto.board.response.DataGetAllPostingResponse
import com.example.data.remote.dto.board.response.DataGetDetailResponse
import retrofit2.Response
import retrofit2.http.*

interface BoardAPI {
    @GET("board/")
    suspend fun getAllPosting(
    ): Response<DataGetAllPostingResponse>

    @GET("board/detail/{boardId}")
    suspend fun getDetail(
        @Path("boardId") boardId: Int
    ): Response<DataGetDetailResponse>

    @POST("board/")
    suspend fun postCreatePost(
        @Body body: DataPostCreatePostRequest
    ): Response<Void>

    @DELETE("/{boardId}")
    suspend fun deletePost(
        @Path("boardId") boardId: Int
    ): Response<Void>

    @PUT("/{boardId}")
    suspend fun putPost(
        @Path("boardId") boardId: Int,
        @Body body: DataPutPostRequest
    ): Response<Void>
}