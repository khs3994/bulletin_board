package com.example.data.remote.datasource

import com.example.data.remote.dto.board.request.DataPostCreatePostRequest
import com.example.data.remote.dto.board.request.DataPutPostRequest
import com.example.data.remote.dto.board.response.DataGetAllPostingResponse
import com.example.data.remote.dto.board.response.DataGetDetailResponse
import retrofit2.Response

interface BoardDataSource {
    suspend fun getAllPosting(): Response<DataGetAllPostingResponse>

    suspend fun getDetail(boardId: Int): Response<DataGetDetailResponse>

    suspend fun postCreatePost(
        body: DataPostCreatePostRequest
    ): Response<Void>

    suspend fun deletePost(boardId: Int): Response<Void>

    suspend fun putPost(
        boardId: Int,
        body: DataPutPostRequest
    ): Response<Void>
}