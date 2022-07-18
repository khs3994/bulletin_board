package com.example.data.remote.datasource

import com.example.data.remote.dto.board.request.PostCreatePostRequest
import com.example.data.remote.dto.board.request.PutPostRequest
import com.example.data.remote.dto.board.response.GetAllPostingResponse
import com.example.data.remote.dto.board.response.GetDetailResponse
import retrofit2.Response

interface BoardDataSource {
    suspend fun getAllPosting(): Response<GetAllPostingResponse>

    suspend fun getDetail(boardId: Int): Response<GetDetailResponse>

    suspend fun postCreatePost(
        body: PostCreatePostRequest
    ): Response<Void>

    suspend fun deletePost(boardId: Int): Response<Void>

    suspend fun putPost(
        boardId: Int,
        body: PutPostRequest
    ): Response<Void>
}