package com.example.data.remote.network

import com.example.data.remote.dto.board.request.PostCreatePostRequest
import com.example.data.remote.dto.board.response.GetAllPostingResponse
import com.example.data.remote.dto.board.response.GetDetailResponse
import retrofit2.Response
import retrofit2.http.*

interface BoardAPI {
    @GET("board/")
    suspend fun getAllPosting(
    ): Response<GetAllPostingResponse>

    @GET("board/detail/{boardId}")
    suspend fun getDetail(
        @Path("boardId") boardId: Int
    ): Response<GetDetailResponse>

    @POST("board/")
    suspend fun postCreatePost(
        @Body body: PostCreatePostRequest
    ): Response<Void>

    @DELETE("/{boardId}")
    suspend fun deletePost(
        @Path("boardId") boardId: Int
    ): Response<Void>

    @PUT("/{boardId}")
    suspend fun putPost(
        @Path("boardId") boardId: Int
    ): Response<Void>
}