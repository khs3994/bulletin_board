package com.example.domain.repository

import com.example.domain.dto.board.request.DomainPostCreatePostRequest
import com.example.domain.dto.board.request.DomainPutPostRequest
import com.example.domain.dto.board.response.DomainGetAllPostingResponse
import com.example.domain.dto.board.response.DomainGetDetailResponse
import retrofit2.Response

interface BoardRepository {
    suspend fun getAllPosting(): Response<DomainGetAllPostingResponse>

    suspend fun getDetail(boardId: Int): DomainGetDetailResponse?

    suspend fun postCreatePost(
        body: DomainPostCreatePostRequest
    ): Void?

    suspend fun deletePost(boardId: Int): Response<Void>

    suspend fun putPost(
        boardId: Int,
        body: DomainPutPostRequest
    ): Response<Void>
}