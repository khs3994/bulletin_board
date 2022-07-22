package com.example.domain.repository

import com.example.domain.dto.board.request.PostCreatePostRequest
import com.example.domain.dto.board.request.PutPostRequest
import com.example.domain.dto.board.response.GetAllPostingResponse
import com.example.domain.dto.board.response.GetDetailResponse
import retrofit2.Response

interface BoardRepository {
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